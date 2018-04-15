// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.ItemSpellEffects;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.skills.Skill;
import com.wurmonline.server.spells.Spell;
import com.wurmonline.server.spells.SpellEffect;
import com.wurmonline.server.spells.Spells;
import org.gotti.wurmunlimited.modloader.ReflectionUtil;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.EnchantOrb;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnchantOrbAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public EnchantOrbAction() {
        EnchantOrbAction.logger.log(Level.WARNING, "EnchantOrbAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Transfer enchant", "transferring", new int[0]));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                if (performer instanceof Player && source != null && object != null && source.getTemplateId() == EnchantOrb.templateId && source != object) {
                    return Arrays.asList(EnchantOrbAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return EnchantOrbAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                if (performer instanceof Player) {
                    final Player player = (Player)performer;
                    if (source.getTemplate().getTemplateId() != EnchantOrb.templateId) {
                        player.getCommunicator().sendNormalServerMessage("You must use an Enchant Orb to transfer enchants.");
                        return true;
                    }
                    if (source.getWurmId() == target.getWurmId()) {
                        player.getCommunicator().sendNormalServerMessage("You cannot enchant the orb with itself!");
                        return true;
                    }
                    final ItemSpellEffects effs = source.getSpellEffects();
                    if (effs == null || effs.getEffects().length == 0) {
                        player.getCommunicator().sendNormalServerMessage("The " + source.getTemplate().getName() + " has no enchants.");
                        return true;
                    }
                    if (!Spell.mayBeEnchanted(target)) {
                        player.getCommunicator().sendNormalServerMessage("The " + target.getTemplate().getName() + " may not be enchanted.");
                    }
                    ItemSpellEffects teffs = target.getSpellEffects();
                    if (teffs == null) {
                        teffs = new ItemSpellEffects(target.getWurmId());
                    }
                    for (final SpellEffect eff : effs.getEffects()) {
                        final Spell spell = Spells.getEnchantment(eff.type);
                        boolean canEnchant = Spell.mayBeEnchanted(target);
                        final byte type = eff.type;
                        if (spell == null) {
                            EnchantOrbAction.logger.info("Error: Enchant for " + eff.type + " doesn't exist.");
                        }
                        else {
                            if (canEnchant) {
                                try {
                                    final Method m = spell.getClass().getDeclaredMethod("precondition", Skill.class, Creature.class, Item.class);
                                    canEnchant = ReflectionUtil.callPrivateMethod(spell, m, new Object[] { player.getChannelingSkill(), performer, target });
                                }
                                catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException ex2) {
                                    final Exception ex;
                                    final Exception e = ex2;
                                    e.printStackTrace();
                                }
                            }
                            if (canEnchant) {
                                final SpellEffect newEff = new SpellEffect(target.getWurmId(), type, eff.getPower(), 20000000);
                                teffs.addSpellEffect(newEff);
                                Items.destroyItem(source.getWurmId());
                                player.getCommunicator().sendSafeServerMessage("The " + eff.getName() + " transfers to the " + target.getTemplate().getName() + ".");
                            }
                        }
                    }
                }
                else {
                    EnchantOrbAction.logger.info("Somehow a non-player activated an Enchant Orb...");
                }
                return true;
            }
        };
    }
    
    static {
        EnchantOrbAction.logger = Logger.getLogger(EnchantOrbAction.class.getName());
    }
}
