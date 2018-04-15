// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.Server;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.FriyanTablet;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FriyanTabletAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public FriyanTabletAction() {
        FriyanTabletAction.logger.log(Level.WARNING, "FriyanTabletAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Read", "reading", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                return this.getBehavioursFor(performer, object);
            }
            
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object) {
                if (performer instanceof Player && object != null && object.getTemplateId() == FriyanTablet.templateId) {
                    return Arrays.asList(FriyanTabletAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return FriyanTabletAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (target.getTemplate().getTemplateId() != FriyanTablet.templateId) {
                            performer.getCommunicator().sendNormalServerMessage("You cannot read that.");
                            return true;
                        }
                        if (!performer.isWithinDistanceTo(target.getPosX(), target.getPosY(), performer.getPositionZ(), 4.0f)) {
                            performer.getCommunicator().sendNormalServerMessage("You are too far away to read.");
                            act.stop(true);
                            return true;
                        }
                        if (counter == 1.0f) {
                            performer.getCommunicator().sendNormalServerMessage("You start to read the " + target.getName() + ".");
                            Server.getInstance().broadCastAction(performer.getName() + " begins reading the " + target.getName() + ".", performer, 5);
                            act.setTimeLeft(200);
                            performer.sendActionControl("Reading", true, act.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            if (performer.getDeity() != null && performer.getFaith() > 0.0f) {
                                performer.modifyFaith(Math.max(0.1f, Server.rand.nextFloat() / 2.0f));
                                performer.getCommunicator().sendNormalServerMessage("You are enthralled by the knowledge of the Kaen scholar. You feel closer to god than ever!");
                                Items.destroyItem(target.getWurmId());
                            }
                            else {
                                performer.getCommunicator().sendNormalServerMessage("You don't seem to learn anything. You don't believe in the gods.");
                            }
                            return true;
                        }
                    }
                    else {
                        FriyanTabletAction.logger.info("Somehow a non-player activated a " + target.getTemplate().getName() + ".");
                    }
                    return false;
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                return this.action(act, performer, target, action, counter);
            }
        };
    }
    
    static {
        FriyanTabletAction.logger = Logger.getLogger(FriyanTabletAction.class.getName());
    }
}
