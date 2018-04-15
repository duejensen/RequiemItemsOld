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
import com.wurmonline.server.items.WurmColor;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.Crystals;
import org.requiem.mods.requiemitemsold.items.ChaosCrystal;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChaosCrystalInfuseAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public ChaosCrystalInfuseAction() {
        ChaosCrystalInfuseAction.logger.log(Level.WARNING, "ChaosCrystalInfuseAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Infuse", "infusing", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                if (performer instanceof Player && source != null && object != null && source.getTemplateId() == ChaosCrystal.templateId && object.isRepairable()) {
                    return Arrays.asList(ChaosCrystalInfuseAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return ChaosCrystalInfuseAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (source.getTemplate().getTemplateId() != ChaosCrystal.templateId) {
                            performer.getCommunicator().sendNormalServerMessage("You must use a chaos crystal to infuse an item.");
                            return true;
                        }
                        if (!target.isRepairable()) {
                            performer.getCommunicator().sendNormalServerMessage("You cannot infuse that item.");
                            return true;
                        }
                        if (Crystals.shouldCancelInfusion(performer, source, target)) {
                            return true;
                        }
                        if (counter == 1.0f) {
                            performer.getCommunicator().sendNormalServerMessage("You begin to infuse the " + target.getName() + " with the " + source.getName() + ".");
                            Server.getInstance().broadCastAction(performer.getName() + " begins infusing with a " + source.getName() + ".", performer, 5);
                            act.setTimeLeft(300);
                            performer.sendActionControl("Infusing", true, act.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            final double diff = Crystals.getInfusionDifficulty(performer, source, target);
                            final double power = performer.getSkills().getSkill(10042).skillCheck(diff, source, 0.0, false, 1.0f);
                            if (power > 90.0) {
                                performer.getCommunicator().sendNormalServerMessage("You handle the crystals expertly and infuse the " + target.getName() + ", increasing its rarity!");
                                target.setRarity(source.getRarity());
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 60.0) {
                                if (target.isMetal() && Server.rand.nextBoolean()) {
                                    performer.getCommunicator().sendNormalServerMessage("You carefully infuse the metal " + target.getName() + ", changing its material!");
                                    final byte[] mats = { 56, 30, 31, 10, 57, 7, 11, 11, 12, 67, 8, 9, 34, 13 };
                                    target.setMaterial(mats[Server.rand.nextInt(mats.length)]);
                                }
                                else if (target.isWood() && Server.rand.nextBoolean()) {
                                    performer.getCommunicator().sendNormalServerMessage("You carefully infuse the wooden " + target.getName() + ", changing its material!");
                                    final byte[] mats = { 42, 14, 91, 50, 39, 45, 63, 65, 49, 71, 68, 46, 43, 66, 92, 41, 38, 51, 44, 88, 37, 90, 47, 48, 64, 40 };
                                    target.setMaterial(mats[Server.rand.nextInt(mats.length)]);
                                }
                                else {
                                    performer.getCommunicator().sendNormalServerMessage("You carefully infuse the " + target.getName() + ", changing its color.");
                                    target.setColor(WurmColor.createColor(Server.rand.nextInt(255), Server.rand.nextInt(255), Server.rand.nextInt(255)));
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 30.0) {
                                performer.getCommunicator().sendNormalServerMessage("You safely infuse the " + target.getName() + ", chaotically changing it its weight.");
                                target.setWeight((int)(target.getWeightGrams() * Server.rand.nextFloat() * 2.0f), false);
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 0.0) {
                                performer.getCommunicator().sendNormalServerMessage("You barely manage to infuse the " + target.getName() + ", chaotically changing its quality.");
                                target.setQualityLevel(Server.rand.nextFloat() * 100.0f);
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > -20.0) {
                                performer.getCommunicator().sendNormalServerMessage("You fail to infuse the " + target.getName() + ", damaging to the " + source.getName() + " in the process.");
                                source.setDamage((float)(source.getDamage() - power));
                            }
                            else if (power > -40.0) {
                                performer.getCommunicator().sendNormalServerMessage("You horribly fail to infuse the " + target.getName() + ", destroying the " + source.getName() + " and heavily damaging the " + target.getName() + ".");
                                target.setDamage((float)(target.getDamage() - power));
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (target.getMaterial() == 67) {
                                performer.getCommunicator().sendNormalServerMessage("The infusion fails catastrophically, destroying the " + source.getName() + "! However, the " + target.getName() + "'s material prevents its utter destruction.");
                                target.setDamage((float)(target.getDamage() - power));
                                Items.destroyItem(source.getWurmId());
                            }
                            else {
                                performer.getCommunicator().sendNormalServerMessage("The infusion fails catastrophically, destroying the " + source.getName() + " and " + target.getName() + "!");
                                Items.destroyItem(source.getWurmId());
                                Items.destroyItem(target.getWurmId());
                            }
                            return true;
                        }
                    }
                    else {
                        ChaosCrystalInfuseAction.logger.info("Somehow a non-player activated a custom item (" + source.getTemplateId() + ")...");
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
        ChaosCrystalInfuseAction.logger = Logger.getLogger(ChaosCrystalInfuseAction.class.getName());
    }
}
