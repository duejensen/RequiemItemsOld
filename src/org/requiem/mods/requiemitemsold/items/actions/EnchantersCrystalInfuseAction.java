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
import com.wurmonline.server.items.ItemSpellEffects;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.spells.SpellEffect;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.Crystals;
import org.requiem.mods.requiemitemsold.items.EnchantersCrystal;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnchantersCrystalInfuseAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public EnchantersCrystalInfuseAction() {
        EnchantersCrystalInfuseAction.logger.log(Level.WARNING, "EnchantersCrystalInfuseAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Infuse", "infusing", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                if (performer instanceof Player && source != null && object != null && source.getTemplateId() == EnchantersCrystal.templateId && object.getTemplateId() != EnchantersCrystal.templateId) {
                    return Arrays.asList(EnchantersCrystalInfuseAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return EnchantersCrystalInfuseAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (source.getTemplate().getTemplateId() != EnchantersCrystal.templateId) {
                            performer.getCommunicator().sendNormalServerMessage("You must use an enchanters crystal to infuse an item.");
                            return true;
                        }
                        if (Crystals.shouldCancelInfusion(performer, source, target)) {
                            return true;
                        }
                        final ItemSpellEffects effs = target.getSpellEffects();
                        if (effs == null || effs.getEffects().length == 0) {
                            performer.getCommunicator().sendNormalServerMessage("The item must be enchanted to be infused.");
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
                                final byte ench = Crystals.getNewRandomEnchant(target);
                                if (ench != -10) {
                                    performer.getCommunicator().sendNormalServerMessage("You handle the crystals expertly and infuse the " + target.getName() + ", adding a new enchant!");
                                    final SpellEffect eff = new SpellEffect(target.getWurmId(), ench, (float)power * Server.rand.nextFloat(), 20000000);
                                    effs.addSpellEffect(eff);
                                    Items.destroyItem(source.getWurmId());
                                }
                                else {
                                    EnchantersCrystalInfuseAction.logger.info("Failed to find a valid enchant to add to item " + target.getName() + " for player " + performer.getName() + "!");
                                    performer.getCommunicator().sendNormalServerMessage("Nothing happens!");
                                }
                            }
                            else if (power > 80.0) {
                                performer.getCommunicator().sendNormalServerMessage("You very carefully infuse the metal " + target.getName() + ", increasing its magical properties!");
                                for (final SpellEffect eff2 : effs.getEffects()) {
                                    eff2.setPower(eff2.getPower() + eff2.getPower() * Server.rand.nextFloat() * 0.2f);
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 70.0) {
                                performer.getCommunicator().sendNormalServerMessage("You carefully infuse the " + target.getName() + ", changing one of its magical properties!");
                                final SpellEffect oldEff = effs.getEffects()[Server.rand.nextInt(effs.getEffects().length)];
                                final float oldPower = oldEff.getPower();
                                effs.removeSpellEffect(oldEff.type);
                                final byte ench2 = Crystals.getNewRandomEnchant(target);
                                if (ench2 != -10) {
                                    final SpellEffect eff2 = new SpellEffect(target.getWurmId(), ench2, oldPower, 20000000);
                                    effs.addSpellEffect(eff2);
                                }
                                else {
                                    performer.getCommunicator().sendNormalServerMessage("However, something goes wrong and the " + target.getName() + " instead loses the property!");
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 40.0) {
                                performer.getCommunicator().sendNormalServerMessage("You manage to infuse the " + target.getName() + ", destroying a magical property but increasing the rest.");
                                final SpellEffect oldEff = effs.getEffects()[Server.rand.nextInt(effs.getEffects().length)];
                                effs.removeSpellEffect(oldEff.type);
                                if (effs.getEffects().length >= 1) {
                                    for (final SpellEffect eff3 : effs.getEffects()) {
                                        eff3.setPower(eff3.getPower() + eff3.getPower() * Server.rand.nextFloat() * 0.2f);
                                    }
                                }
                                else {
                                    performer.getCommunicator().sendNormalServerMessage("However, the " + target.getName() + " does not have any other properties, and the effect is wasted!");
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > 0.0) {
                                performer.getCommunicator().sendNormalServerMessage("You barely manage to infuse the " + target.getName() + ", shifting its magical properties.");
                                for (final SpellEffect eff2 : effs.getEffects()) {
                                    eff2.setPower(eff2.getPower() + eff2.getPower() * Server.rand.nextFloat() * 0.4f * (Server.rand.nextBoolean() ? 1 : -1));
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > -30.0) {
                                performer.getCommunicator().sendNormalServerMessage("You barely fail to infuse the " + target.getName() + ", reducing the power of its magical properties.");
                                for (final SpellEffect eff2 : effs.getEffects()) {
                                    eff2.setPower(eff2.getPower() - eff2.getPower() * Server.rand.nextFloat() * 0.2f);
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            else if (power > -60.0) {
                                performer.getCommunicator().sendNormalServerMessage("You horribly fail to infuse the " + target.getName() + ", removing one of its magical properties.");
                                final SpellEffect oldEff = effs.getEffects()[Server.rand.nextInt(effs.getEffects().length)];
                                effs.removeSpellEffect(oldEff.type);
                                Items.destroyItem(source.getWurmId());
                            }
                            else {
                                performer.getCommunicator().sendNormalServerMessage("The infusion fails catastrophically, destroying all the magic on the " + target.getName() + "!");
                                for (final SpellEffect eff2 : effs.getEffects()) {
                                    effs.removeSpellEffect(eff2.type);
                                }
                                Items.destroyItem(source.getWurmId());
                            }
                            return true;
                        }
                    }
                    else {
                        EnchantersCrystalInfuseAction.logger.info("Somehow a non-player activated a custom item (" + source.getTemplateId() + ")...");
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
        EnchantersCrystalInfuseAction.logger = Logger.getLogger(EnchantersCrystalInfuseAction.class.getName());
    }
}
