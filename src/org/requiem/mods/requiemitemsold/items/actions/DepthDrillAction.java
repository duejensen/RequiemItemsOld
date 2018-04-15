// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.Server;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.behaviours.Actions;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.skills.NoSuchSkillException;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.DepthDrill;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DepthDrillAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public DepthDrillAction() {
        DepthDrillAction.logger.log(Level.WARNING, "DepthDrillAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Drill", "drilling", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object, final int tilex, final int tiley, final boolean onSurface, final boolean corner, final int tile) {
                if (performer instanceof Player && object != null && object.getTemplateId() == DepthDrill.templateId) {
                    return Arrays.asList(DepthDrillAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return DepthDrillAction.this.actionId;
            }
            
            public boolean action(final Action action, final Creature performer, final Item source, final int tilex, final int tiley, final boolean onSurface, final boolean corner, final int tile, final short num, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (source.getTemplate().getTemplateId() != DepthDrill.templateId) {
                            performer.getCommunicator().sendNormalServerMessage("You must use a depth drill to drill.");
                            return true;
                        }
                        if (!performer.isWithinDistanceTo((float)(tilex * 4), (float)(tiley * 4), performer.getPositionZ(), 4.0f)) {
                            performer.getCommunicator().sendNormalServerMessage("You are too far away to drill.");
                            action.stop(true);
                            return true;
                        }
                        final int surfaceHeight = Tiles.decodeHeight(Server.surfaceMesh.getTile(tilex, tiley));
                        final int rockHeight = Tiles.decodeHeight(Server.rockMesh.getTile(tilex, tiley));
                        final int delta = surfaceHeight - rockHeight;
                        if (counter == 1.0f) {
                            if (delta == 0) {
                                performer.getCommunicator().sendNormalServerMessage("The ground here is too hard and the drill makes no progress.");
                                action.stop(false);
                                return true;
                            }
                            performer.getCommunicator().sendNormalServerMessage("You start to drill into the ground.");
                            Server.getInstance().broadCastAction(performer.getName() + " starts to drill into the ground.", performer, 5);
                            action.setTimeLeft(Actions.getSlowActionTime(performer, performer.getSkills().getSkill(1009), source, 1.0));
                            performer.sendActionControl("Drilling", true, action.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            performer.getCommunicator().sendNormalServerMessage("The rock here is " + delta + " deep.");
                            performer.getSkills().getSkill(1009).skillCheck(10.0, 0.0, false, 1.0f);
                            performer.getSkills().getSkill(10032).skillCheck(10.0, 0.0, false, 1.0f);
                            this.sendOres(performer, tilex, tiley);
                            return true;
                        }
                    }
                    else {
                        DepthDrillAction.logger.info("Somehow a non-player activated a " + source.getTemplate().getName() + ".");
                    }
                    return false;
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            }
            
            private void sendOres(final Creature performer, final int x, final int y) throws NoSuchSkillException {
                final double prospecting = performer.getSkills().getSkill(10032).getRealKnowledge();
                if (prospecting < 30.0) {
                    return;
                }
                final double mining = performer.getSkills().getSkill(1008).getRealKnowledge();
                final Set<String> ores = new HashSet<String>();
                for (int distance = (int)Math.floor(Math.pow(prospecting + mining, 0.38)), dx = distance * -1; dx < distance; ++dx) {
                    for (int dy = distance * -1; dy < distance; ++dy) {
                        final int type = Tiles.decodeType(Server.caveMesh.getTile(x + dx, y + dy)) & 0xFF;
                        if (type == 205 && prospecting > 40.0) {
                            ores.add("slate");
                        }
                        else if (type == 206 && prospecting > 40.0) {
                            ores.add("marble");
                        }
                        else if (type == 220 && prospecting > 60.0) {
                            ores.add("gold");
                        }
                        else if (type == 221 && prospecting > 50.0) {
                            ores.add("silver");
                        }
                        else if (type == 227 && prospecting > 70.0) {
                            ores.add("adamantine");
                        }
                        else if (type == 228 && prospecting > 80.0) {
                            ores.add("glimmersteel");
                        }
                        else if (type == 222) {
                            ores.add("iron");
                        }
                        else if (type == 223) {
                            ores.add("copper");
                        }
                        else if (type == 224) {
                            ores.add("lead");
                        }
                        else if (type == 225) {
                            ores.add("zinc");
                        }
                        else if (type == 226) {
                            ores.add("tin");
                        }
                    }
                }
                DepthDrillAction.logger.info("Player " + performer.getName() + " uses depth drill at " + x + ", " + y + " and prospects " + ores.toString() + " in the ground.");
                final Iterator<String> it = ores.iterator();
                if (ores.size() == 1) {
                    performer.getCommunicator().sendNormalServerMessage("You find traces of " + it.next() + " in the dirt.");
                }
                else if (ores.size() > 1) {
                    String s = "You find traces of ";
                    for (int i = 0; i < ores.size() - 1; ++i) {
                        if (i == ores.size() - 2) {
                            s += it.next();
                        }
                        else {
                            s = s + it.next() + ", ";
                        }
                    }
                    s = s + " and " + it.next() + " in the dirt.";
                    performer.getCommunicator().sendNormalServerMessage(s);
                }
            }
        };
    }
    
    static {
        DepthDrillAction.logger = Logger.getLogger(DepthDrillAction.class.getName());
    }
}
