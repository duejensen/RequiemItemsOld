// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items.actions;

import com.wurmonline.server.Server;
import com.wurmonline.server.behaviours.Action;
import com.wurmonline.server.behaviours.ActionEntry;
import com.wurmonline.server.creatures.Communicator;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.deities.Deity;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.skills.NoSuchSkillException;
import com.wurmonline.server.skills.Skill;
import org.gotti.wurmunlimited.modsupport.actions.ActionPerformer;
import org.gotti.wurmunlimited.modsupport.actions.BehaviourProvider;
import org.gotti.wurmunlimited.modsupport.actions.ModAction;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.utils.TweakApiPerms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HolyBookPray implements ModAction, BehaviourProvider, ActionPerformer
{
    private static final Logger logger;
    private final short actionId;
    private final Method prayResult;
    private final ActionEntry actionEntry;
    
    public HolyBookPray() {
        this.actionId = (short)ModActions.getNextActionId();
        this.prayResult = TweakApiPerms.getClassMeth("com.wurmonline.server.behaviours.MethodsReligion", "prayResult", "com.wurmonline.server.creatures.Creature", "float", "com.wurmonline.server.deities.Deity", "int");
        final int[] types = { 4, 25, 43 };
        ModActions.registerAction(this.actionEntry = ActionEntry.createEntry(this.actionId, "Pray", "Praying", types));
    }
    
    public short getActionId() {
        return this.actionId;
    }
    
    public List<ActionEntry> getBehavioursFor(final Creature performer, final Item source, final Item target) {
        if (target == null) {
            return null;
        }
        if (target.getTemplateId() != 3655) {
            return null;
        }
        if (performer.getDeity() == null) {
            return null;
        }
        return Collections.singletonList(this.actionEntry);
    }
    
    public List<ActionEntry> getBehavioursFor(final Creature performer, final Item target) {
        return this.getBehavioursFor(performer, null, target);
    }
    
    public boolean action(final Action action, final Creature performer, final Item target, final short num, final float counter) {
        return this.action(action, performer, null, target, num, counter);
    }
    
    public boolean action(final Action action, final Creature performer, final Item source, final Item target, final short num, final float counter) {
        Deity deity = null;
        Skill prayer = null;
        final int time = action.getTimeLeft();
        final float faith = performer.getFaith();
        final Communicator comm = performer.getCommunicator();
        deity = performer.getDeity();
        if (deity == null) {
            comm.sendNormalServerMessage("You cannot pray without being a priest");
            return true;
        }
        try {
            prayer = performer.getSkills().getSkill(10066);
        }
        catch (NoSuchSkillException nss) {
            return true;
        }
        if (counter == 1.0f) {
            final int remain = 300 - (int)prayer.getKnowledge() - (int)target.getQualityLevel();
            performer.sendActionControl("praying", true, remain);
            action.setTimeLeft(remain);
            comm.sendNormalServerMessage("You open the holy book");
            Server.getInstance().broadCastAction(performer.getName() + " starts reading the holy book", performer, 5);
            return false;
        }
        if (action.currentSecond() == 2) {
            comm.sendNormalServerMessage("You look for the chapter on prayers to " + deity.getName());
        }
        else if (action.currentSecond() == 5) {
            comm.sendNormalServerMessage("You read the small letters in the book.");
        }
        else if (action.currentSecond() == 9) {
            comm.sendNormalServerMessage("You think the words are meaningful, and hope " + deity.name + " approves.");
        }
        if (counter * 10.0f >= time) {
            final float res = (float)prayer.skillCheck(prayer.getKnowledge(0.0) - (30.0f + Server.rand.nextFloat() * 60.0f), (double)faith, false, counter / 3.0f);
            final int rare = action.getRarity();
            if (res > 0.0) {
                try {
                    this.prayResult.invoke(null, performer, res, deity, rare);
                }
                catch (IllegalAccessException e2) {
                    HolyBookPray.logger.log(Level.SEVERE, "IllegalAccess: prayResult");
                }
                catch (InvocationTargetException e3) {
                    HolyBookPray.logger.log(Level.SEVERE, "InvokeExc: prayResult");
                }
                catch (Throwable e) {
                    HolyBookPray.logger.log(Level.SEVERE, "InvokeExc: prayResult ", e);
                }
            }
            deity.increaseFavor();
            performer.checkPrayerFaith();
            comm.sendNormalServerMessage("You close the book as you have finished your prayer to " + deity.name);
            return true;
        }
        return false;
    }
    
    static {
        logger = Logger.getLogger("HolyBookPray");
    }
}
