// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.Server;
import com.wurmonline.server.Servers;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.Crystals;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrystalCombineAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public CrystalCombineAction() {
        CrystalCombineAction.logger.log(Level.WARNING, "CrystalCombineAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Combine", "combining", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                if (performer instanceof Player && source != null && object != null && Crystals.isCrystal(source) && Crystals.isCrystal(object) && source != object && source.getTemplateId() == object.getTemplateId()) {
                    return Arrays.asList(CrystalCombineAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return CrystalCombineAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (Crystals.shouldCancelCombine(performer, source, target)) {
                            return true;
                        }
                        if (counter == 1.0f) {
                            performer.getCommunicator().sendNormalServerMessage("You begin to combine the crystals together.");
                            Server.getInstance().broadCastAction(performer.getName() + " begins combining crystals.", performer, 5);
                            act.setTimeLeft(100);
                            performer.sendActionControl("Combining", true, act.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            double diff = (source.getCurrentQualityLevel() + target.getCurrentQualityLevel()) * 0.5;
                            diff += source.getRarity() * (Servers.localServer.PVPSERVER ? 25 : 15);
                            diff -= performer.getSoulDepth().getKnowledge();
                            if (Servers.localServer.PVPSERVER) {
                                diff *= 1.399999976158142;
                            }
                            final double power = performer.getSkills().getSkill(10042).skillCheck(diff, source, 0.0, false, 1.0f);
                            if (power > 0.0) {
                                performer.getCommunicator().sendNormalServerMessage("You successfully combine the crystals!");
                                Server.getInstance().broadCastAction(performer.getName() + " successfully combines the crystals!", performer, 5);
                                if (source.getCurrentQualityLevel() + target.getCurrentQualityLevel() > 100.0f) {
                                    final float newQuality = source.getCurrentQualityLevel() + target.getCurrentQualityLevel() - 100.0f;
                                    performer.getCommunicator().sendNormalServerMessage("The crystals combine and change, creating a more powerful component.");
                                    Items.destroyItem(source.getWurmId());
                                    target.setQualityLevel(newQuality);
                                    target.setDamage(0.0f);
                                    target.setRarity((byte)(target.getRarity() + 1));
                                }
                                else {
                                    performer.getCommunicator().sendNormalServerMessage("The crystals combine together and reinforce.");
                                    target.setQualityLevel(source.getCurrentQualityLevel() + target.getCurrentQualityLevel());
                                    target.setDamage(0.0f);
                                    Items.destroyItem(source.getWurmId());
                                }
                                return true;
                            }
                            performer.getCommunicator().sendNormalServerMessage("You fail to combine the crystals, damaging them both.");
                            final float dam1 = (float)(Server.rand.nextFloat() * power * 0.20000000298023224);
                            final float dam2 = (float)(Server.rand.nextFloat() * power * 0.20000000298023224);
                            source.setDamage(source.getDamage() - dam1);
                            target.setDamage(target.getDamage() - dam2);
                            return true;
                        }
                    }
                    else {
                        CrystalCombineAction.logger.info("Somehow a non-player activated a custom item (" + source.getTemplateId() + ")...");
                    }
                    return false;
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            }
        };
    }
    
    static {
        CrystalCombineAction.logger = Logger.getLogger(CrystalCombineAction.class.getName());
    }
}
