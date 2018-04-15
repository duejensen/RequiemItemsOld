// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Items;
import com.wurmonline.server.NoSuchItemException;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.WurmMail;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReceiveMailAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public ReceiveMailAction() {
        ReceiveMailAction.logger.log(Level.WARNING, "ReceiveMailAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Receive all mail", "receiving", new int[] { 6 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item object) {
                return this.getBehavioursFor(performer, object);
            }
            
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item object) {
                if (performer instanceof Player && object != null && object.isMailBox() && object.getSpellCourierBonus() > 0.0f) {
                    return Arrays.asList(ReceiveMailAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return ReceiveMailAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item target, final short action, final float counter) {
                if (performer instanceof Player) {
                    final Player player = (Player)performer;
                    if (!target.isMailBox()) {
                        player.getCommunicator().sendSafeServerMessage("You can only receive mail at a mailbox.");
                        return true;
                    }
                    if (target.getSpellCourierBonus() <= 0.0f) {
                        player.getCommunicator().sendSafeServerMessage("The mailbox must be enchanted before receiving mail.");
                        return true;
                    }
                    if (!performer.isWithinDistanceTo(target.getPosX(), target.getPosY(), target.getPosZ(), 4.0f)) {
                        player.getCommunicator().sendSafeServerMessage("You must be closer to collect mail.");
                        return true;
                    }
                    if (!target.isEmpty(false)) {
                        player.getCommunicator().sendSafeServerMessage("Empty the mailbox first.");
                        return true;
                    }
                    final Set<WurmMail> mailset = WurmMail.getSentMailsFor(performer.getWurmId(), 100);
                    if (mailset.isEmpty()) {
                        player.getCommunicator().sendSafeServerMessage("You have no mail to collect.");
                        return true;
                    }
                    final Iterator<WurmMail> it = mailset.iterator();
                    final HashSet<Item> itemset = new HashSet<Item>();
                    while (it.hasNext()) {
                        final WurmMail m = it.next();
                        if (!m.rejected) {
                            if (m.price > 0L) {
                                continue;
                            }
                            try {
                                itemset.add(Items.getItem(m.itemId));
                            }
                            catch (NoSuchItemException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    if (!itemset.isEmpty()) {
                        player.getCommunicator().sendSafeServerMessage("The " + itemset.size() + " items that were sent via mail are now available.");
                        for (final Item item : itemset) {
                            final Item[] contained4 = item.getAllItems(true);
                            for (int c4 = 0; c4 < contained4.length; ++c4) {
                                contained4[c4].setMailed(false);
                                contained4[c4].setLastOwnerId(performer.getWurmId());
                            }
                            WurmMail.removeMail(item.getWurmId());
                            target.insertItem(item, true);
                            item.setLastOwnerId(performer.getWurmId());
                            item.setMailed(false);
                            ReceiveMailAction.logger.log(Level.INFO, performer.getName() + " received " + item.getName() + " " + item.getWurmId());
                        }
                    }
                }
                else {
                    ReceiveMailAction.logger.info("Somehow a non-player activated an Affinity Orb...");
                }
                return true;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final Item target, final short action, final float counter) {
                return this.action(act, performer, target, action, counter);
            }
        };
    }
    
    static {
        ReceiveMailAction.logger = Logger.getLogger(ReceiveMailAction.class.getName());
    }
}
