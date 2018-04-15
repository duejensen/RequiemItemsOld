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
import com.wurmonline.server.items.ItemFactory;
import com.wurmonline.server.items.ItemSpellEffects;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.spells.SpellEffect;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.ArrowPackHunting;
import org.requiem.mods.requiemitemsold.items.ArrowPackWar;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrowPackUnpackAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public ArrowPackUnpackAction() {
        ArrowPackUnpackAction.logger.log(Level.WARNING, "ArrowPackUnpackAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Unpack arrows", "unpacking", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                return this.getBehavioursFor(performer, object);
            }
            
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object) {
                if (performer instanceof Player && object != null && (object.getTemplateId() == ArrowPackHunting.templateId || object.getTemplateId() == ArrowPackWar.templateId)) {
                    return Arrays.asList(ArrowPackUnpackAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return ArrowPackUnpackAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        if (target.getTemplate().getTemplateId() != ArrowPackHunting.templateId && target.getTemplate().getTemplateId() != ArrowPackWar.templateId) {
                            performer.getCommunicator().sendNormalServerMessage("That is not an arrow pack.");
                            return true;
                        }
                        if (target.getLastOwnerId() != performer.getWurmId() && target.getOwnerId() != performer.getWurmId()) {
                            performer.getCommunicator().sendNormalServerMessage("You must own the arrow pack to unpack it.");
                            return true;
                        }
                        if (counter == 1.0f) {
                            performer.getCommunicator().sendNormalServerMessage("You begin to unpack your arrows.");
                            Server.getInstance().broadCastAction(performer.getName() + " begins unpacking " + performer.getHisHerItsString() + " arrows.", performer, 5);
                            act.setTimeLeft(50);
                            performer.sendActionControl("Unpacking", true, act.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            int arrowTemplate = 455;
                            if (target.getTemplate().getTemplateId() == ArrowPackWar.templateId) {
                                arrowTemplate = 456;
                            }
                            float quality = target.getCurrentQualityLevel();
                            if (target.getRarity() > 0) {
                                quality = Math.min(100.0f, target.getCurrentQualityLevel() + target.getRarity());
                            }
                            final HashMap<Byte, Float> spellEffects = new HashMap<Byte, Float>();
                            final ItemSpellEffects effs = target.getSpellEffects();
                            if (effs != null) {
                                for (final SpellEffect eff : effs.getEffects()) {
                                    if (eff.getPower() > 0.0f) {
                                        spellEffects.put(eff.type, eff.getPower());
                                    }
                                }
                            }
                            final Item quiver = ItemFactory.createItem(462, quality, performer.getName());
                            performer.getInventory().insertItem(quiver, true);
                            for (int i = 0; i < 40; ++i) {
                                final Item arrow = ItemFactory.createItem(arrowTemplate, quality, performer.getName());
                                if (!spellEffects.isEmpty()) {
                                    for (final byte b : spellEffects.keySet()) {
                                        ItemSpellEffects arrowEffs = arrow.getSpellEffects();
                                        if (arrowEffs == null) {
                                            arrowEffs = new ItemSpellEffects(arrow.getWurmId());
                                        }
                                        final SpellEffect arrowEff = new SpellEffect(arrow.getWurmId(), b, spellEffects.get(b), 20000000);
                                        arrowEffs.addSpellEffect(arrowEff);
                                    }
                                }
                                quiver.insertItem(arrow);
                            }
                            performer.getCommunicator().sendNormalServerMessage("You unpack your arrows into a usable quiver.");
                            Server.getInstance().broadCastAction(performer.getName() + " unpacks " + performer.getHisHerItsString() + " arrows into a quiver.", performer, 5);
                            Items.destroyItem(target.getWurmId());
                            return true;
                        }
                    }
                    else {
                        ArrowPackUnpackAction.logger.info("Somehow a non-player activated a Arrow Pack Unpack...");
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
        ArrowPackUnpackAction.logger = Logger.getLogger(ArrowPackUnpackAction.class.getName());
    }
}
