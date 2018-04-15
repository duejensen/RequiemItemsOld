// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import com.wurmonline.server.skills.Affinities;
import com.wurmonline.server.skills.Affinity;
import com.wurmonline.server.skills.SkillSystem;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.AffinityOrb;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AffinityOrbAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public AffinityOrbAction() {
        AffinityOrbAction.logger.log(Level.WARNING, "AffinityOrbAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Gain affinity", "infusing", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                return this.getBehavioursFor(performer, object);
            }
            
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object) {
                if (performer instanceof Player && object != null && object.getTemplateId() == AffinityOrb.templateId) {
                    return Arrays.asList(AffinityOrbAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return AffinityOrbAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
                if (performer instanceof Player) {
                    final Player player = (Player)performer;
                    if (target.getTemplate().getTemplateId() != AffinityOrb.templateId) {
                        player.getCommunicator().sendSafeServerMessage("You must use an Affinity Orb to be infused.");
                        return true;
                    }
                    int skillNum = SkillSystem.getRandomSkillNum();
                    final Affinity[] affs = Affinities.getAffinities(player.getWurmId());
                    boolean found = false;
                    while (!found) {
                        boolean hasAffinity = false;
                        final Affinity[] array = affs;
                        final int length = array.length;
                        int i = 0;
                        while (i < length) {
                            final Affinity affinity = array[i];
                            if (affinity.getSkillNumber() != skillNum) {
                                ++i;
                            }
                            else {
                                hasAffinity = true;
                                if (affinity.getNumber() >= 5) {
                                    break;
                                }
                                Affinities.setAffinity(player.getWurmId(), skillNum, affinity.getNumber() + 1, false);
                                final String skillString = SkillSystem.getNameFor(skillNum);
                                found = true;
                                Items.destroyItem(target.getWurmId());
                                player.getCommunicator().sendSafeServerMessage("Vynora infuses you with an affinity for " + skillString + "!");
                                break;
                            }
                        }
                        if (!found && !hasAffinity) {
                            final String skillString2 = SkillSystem.getNameFor(skillNum);
                            Affinities.setAffinity(player.getWurmId(), skillNum, 1, false);
                            Items.destroyItem(target.getWurmId());
                            player.getCommunicator().sendSafeServerMessage("Vynora infuses you with an affinity for " + skillString2 + "!");
                            found = true;
                        }
                        skillNum = SkillSystem.getRandomSkillNum();
                    }
                }
                else {
                    AffinityOrbAction.logger.info("Somehow a non-player activated an Affinity Orb...");
                }
                return true;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                return this.action(act, performer, target, action, counter);
            }
        };
    }
    
    static {
        AffinityOrbAction.logger = Logger.getLogger(AffinityOrbAction.class.getName());
    }
}
