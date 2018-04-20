
package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.questions.TownPortalQuestion;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.configurator.Constants;

import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class TownScrollAction implements ModAction, BehaviourProvider, ActionPerformer
{
    public static final Logger logger;
    private final short actionId;
    private final ActionEntry actionEntry;
    
    public TownScrollAction() {
        this.actionId = (short)ModActions.getNextActionId();
        final int[] types = {
             
        };
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Use Scroll", "teleporting", types));
    }
    
    public short getActionId() {
        return this.actionId;
    }
    
    public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item target) {
        if (target == null) {
            return null;
        }
        if (target.getTemplateId() != Constants.townPortal) {
            return null;
        }
        if (performer.getCitizenVillage() == null) {
            return null;
        }
        if (target.isTraded()) {
            return null;
        }
        if (target.getTopParent() == target.getWurmId()) {
            return null;
        }        return Collections.singletonList(this.actionEntry);
    }
    
    public List<ActionEntry> getBehavioursFor(final Creature performer, final Item target) {
        return this.getBehavioursFor(performer, null, target);
    }
    
    public boolean action(final Action action, final Creature performer, final Item target, final short num, final float counter) {
        return this.action(action, performer, null, target, num, counter);
    }
    
    public boolean action(final Action action, final Creature performer, final Item source, final Item target, final short num, final float counter) {
        final TownPortalQuestion tq = new TownPortalQuestion(performer, target);
        tq.sendQuestion();
        return true;
    }
    
    static {
        logger = Logger.getLogger("TownScrollAction");
    }
}
