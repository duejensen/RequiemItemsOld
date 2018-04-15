// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.NoSuchItemException;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.behaviours.AutoEquipMethods;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UnequipAllAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public UnequipAllAction() {
        UnequipAllAction.logger.log(Level.WARNING, "UnequipAllAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Unequip all armour", "unequipping", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                return this.getBehavioursFor(performer, object);
            }
            
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object) {
                try {
                    if (performer instanceof Player && object != null && object.getParentOrNull() != null && object.getParent().isBodyPart() && object.getParent().getOwnerId() == performer.getWurmId()) {
                        return Arrays.asList(UnequipAllAction.this.actionEntry);
                    }
                }
                catch (NoSuchItemException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return UnequipAllAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
                if (performer instanceof Player) {
                    try {
                        final Player player = (Player)performer;
                        if (target.getParent() == null) {
                            player.getCommunicator().sendSafeServerMessage("You cannot unequip an item that isn't equipped.");
                            return true;
                        }
                        if (target.getParent().getOwnerId() != player.getWurmId()) {
                            player.getCommunicator().sendSafeServerMessage("You cannot unequip an item that you do not own.");
                            return true;
                        }
                        for (final Item equip : player.getBody().getAllItems()) {
                            if (equip.isArmour()) {
                                AutoEquipMethods.unequip(equip, player);
                            }
                        }
                    }
                    catch (NoSuchItemException e1) {
                        e1.printStackTrace();
                    }
                }
                else {
                    UnequipAllAction.logger.info("Somehow a non-player activated an Affinity Orb...");
                }
                return true;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                return this.action(act, performer, target, action, counter);
            }
        };
    }
    
    static {
        UnequipAllAction.logger = Logger.getLogger(UnequipAllAction.class.getName());
    }
}
