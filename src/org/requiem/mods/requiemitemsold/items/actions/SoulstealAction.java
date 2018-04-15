// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.Server;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.behaviours.Actions;
import com.wurmonline.server.behaviours.Methods;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.creatures.CreatureTemplate;
import com.wurmonline.server.creatures.CreatureTemplateFactory;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.ItemFactory;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.skills.Skill;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.Soul;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoulstealAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public SoulstealAction() {
        SoulstealAction.logger.log(Level.WARNING, "SoulstealAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Soulsteal", "soulstealing", new int[] { 23 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                if (performer instanceof Player && source != null && object != null && source.getTemplateId() == 792 && object.getTemplateId() == 272) {
                    return Arrays.asList(SoulstealAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return SoulstealAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        final Player player = (Player)performer;
                        if (source.getTemplate().getTemplateId() != 792) {
                            player.getCommunicator().sendNormalServerMessage("You must use a sacrifical knife to steal souls.");
                            return true;
                        }
                        if (target.getTemplate().getTemplateId() != 272) {
                            player.getCommunicator().sendNormalServerMessage("You can only steal the soul from a corpse.");
                            return true;
                        }
                        if (target.isButchered()) {
                            player.getCommunicator().sendNormalServerMessage("The corpse has been butchered and there is no soul left.");
                            return true;
                        }
                        if (target.getTopParentOrNull() != performer.getInventory() && !Methods.isActionAllowed(performer, (short)120, target)) {
                            player.getCommunicator().sendNormalServerMessage("You are not allowed to soulsteal that.");
                            return true;
                        }
                        if (!performer.isWithinDistanceTo(target, 5.0f)) {
                            player.getCommunicator().sendNormalServerMessage("You are too far away to steal that soul.");
                            return true;
                        }
                        Skill stealing = null;
                        int time = 100;
                        CreatureTemplate template = null;
                        if (counter == 1.0f) {
                            template = CreatureTemplateFactory.getInstance().getTemplate(target.getData1());
                            performer.getCommunicator().sendNormalServerMessage("You begin to steal the soul of the " + template.getName() + ".");
                            Server.getInstance().broadCastAction(performer.getName() + " begins to steal the " + template.getName() + " soul.", performer, 5);
                            stealing = performer.getStealSkill();
                            time = Actions.getStandardActionTime(performer, stealing, source, 0.0);
                            act.setTimeLeft(time);
                            performer.sendActionControl("Soulstealing", true, act.getTimeLeft());
                        }
                        else if (counter * 10.0f > performer.getCurrentAction().getTimeLeft()) {
                            template = CreatureTemplateFactory.getInstance().getTemplate(target.getData1());
                            stealing = performer.getStealSkill();
                            final double power = stealing.skillCheck((double)(50.0f - template.getBaseCombatRating() * 0.5f), source, 0.0, false, 1.0f);
                            if (power > 0.0) {
                                final Item soul = ItemFactory.createItem(Soul.templateId, (float)power, performer.getName());
                                soul.setName("Soul of " + template.getName());
                                performer.getInventory().insertItem(soul, true);
                                performer.getCommunicator().sendNormalServerMessage("You obtains the soul of the " + template.getName() + ".");
                                Server.getInstance().broadCastAction(performer.getName() + " obtains the soul of the " + template.getName() + ".", performer, 5);
                            }
                            else {
                                performer.getCommunicator().sendNormalServerMessage("You fail to steal the soul of the " + template.getName() + ".");
                                Server.getInstance().broadCastAction(performer.getName() + " fails to steal the soul of the " + template.getName() + ".", performer, 5);
                            }
                            source.setDamage(source.getDamage() + 0.001f * source.getDamageModifier());
                            Items.destroyItem(target.getWurmId());
                            return true;
                        }
                    }
                    else {
                        SoulstealAction.logger.info("Somehow a non-player activated an Enchant Orb...");
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
        SoulstealAction.logger = Logger.getLogger(SoulstealAction.class.getName());
    }
}
