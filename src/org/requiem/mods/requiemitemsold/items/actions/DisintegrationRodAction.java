// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.mesh.Tiles;
import com.wurmonline.server.Items;
import com.wurmonline.server.Players;
import com.wurmonline.server.Server;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.behaviours.TileRockBehaviour;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.players.Player;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.DisintegrationRod;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DisintegrationRodAction implements ModAction
{
    private static Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public DisintegrationRodAction() {
        DisintegrationRodAction.logger.log(Level.WARNING, "DisintegrationRodAction()");
        this.actionId = (short)ModActions.getNextActionId();
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Use", "disintegrating", new int[] { 43, 23 }));
    }
    
    public BehaviourProvider getBehaviourProvider() {
        return new BehaviourProvider() {
            public List<ActionEntry> getBehavioursFor(final Creature performer, final Item subject, final int tilex, final int tiley, final boolean onSurface, final int tile, final int dir) {
                if (performer instanceof Player && subject != null && subject.getTemplateId() == DisintegrationRod.templateId && Tiles.isSolidCave(Tiles.decodeType(tile))) {
                    return Arrays.asList(DisintegrationRodAction.this.actionEntry);
                }
                return null;
            }
        };
    }
    
    public ActionPerformer getActionPerformer() {
        return new ActionPerformer() {
            public short getActionId() {
                return DisintegrationRodAction.this.actionId;
            }
            
            public boolean action(final Action act, final Creature performer, final Item source, final int tilex, final int tiley, final boolean onSurface, final int heightOffset, final int tile, final short action, final float counter) {
                try {
                    if (performer instanceof Player) {
                        final int newTile = Server.caveMesh.getTile(tilex, tiley);
                        if (source.getTemplate().getTemplateId() != DisintegrationRod.templateId) {
                            performer.getCommunicator().sendSafeServerMessage("You must use a Disintegration Rod to do this.");
                            return true;
                        }
                        final byte type = Tiles.decodeType(newTile);
                        if (Tiles.isSolidCave(type)) {
                            final int resource = Server.getCaveResource(tilex, tiley);
                            final int dir = (int)(act.getTarget() >> 48) & 0xFF;
                            boolean destroyRod = true;
                            if ((type & 0xFF) == 0xCB) {
                                destroyRod = false;
                                performer.getCommunicator().sendSafeServerMessage("The reinforced wall is too strong and doesn't get affected by the rod.");
                            }
                            else if (resource <= 1000 && TileRockBehaviour.createInsideTunnel(tilex, tiley, newTile, performer, 145, dir, true, act)) {
                                Players.getInstance().sendChangedTile(tilex, tiley, false, false);
                                performer.getCommunicator().sendSafeServerMessage("You use the " + source.getTemplate().getName() + " on the " + Tiles.getTile(Tiles.decodeType(newTile)).tiledesc.toLowerCase() + " and it breaks!");
                            }
                            else if ((type & 0xFF) != 0xCA && resource > 10000) {
                                Server.setCaveResource(tilex, tiley, resource - 10000);
                                Players.getInstance().sendChangedTile(tilex, tiley, false, false);
                                performer.getCommunicator().sendSafeServerMessage("You use the " + source.getTemplate().getName() + " on the " + Tiles.getTile(Tiles.decodeType(newTile)).tiledesc.toLowerCase() + ", but it is only weakened!");
                            }
                            else if ((type & 0xFF) == 0xCA && TileRockBehaviour.createInsideTunnel(tilex, tiley, newTile, performer, 145, dir, true, act)) {
                                Players.getInstance().sendChangedTile(tilex, tiley, false, false);
                                performer.getCommunicator().sendSafeServerMessage("The rock is powerless against the " + source.getTemplate().getName() + "!");
                            }
                            else if (!TileRockBehaviour.createInsideTunnel(tilex, tiley, newTile, performer, 145, dir, true, act)) {
                                performer.getCommunicator().sendSafeServerMessage("The wall is not stable enough.");
                                destroyRod = false;
                            }
                            if (destroyRod) {
                                Items.destroyItem(source.getWurmId());
                            }
                        }
                        else {
                            DisintegrationRodAction.logger.info("Disintegration rod attempted to be used on non-solid cave at " + tilex + ", " + tiley);
                        }
                    }
                    else {
                        DisintegrationRodAction.logger.info("Somehow a non-player activated a " + source.getTemplate().getName() + ".");
                    }
                    return true;
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            }
        };
    }
    
    static {
        DisintegrationRodAction.logger = Logger.getLogger(DisintegrationRodAction.class.getName());
    }
}
