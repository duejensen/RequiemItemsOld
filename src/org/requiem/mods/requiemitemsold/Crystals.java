// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold;

import com.wurmonline.server.Server;
import com.wurmonline.server.Servers;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import com.wurmonline.server.items.NotOwnedException;
import org.requiem.mods.requiemitemsold.items.ChaosCrystal;
import org.requiem.mods.requiemitemsold.items.EnchantersCrystal;

public class Crystals
{
    public static byte[] enchs;
    
    public static byte getNewRandomEnchant(final Item target) {
        for (int i = 0; i < 10; ++i) {
            final byte ench = Crystals.enchs[Server.rand.nextInt(Crystals.enchs.length)];
            if (target.getBonusForSpellEffect(ench) == 0.0f) {
                return ench;
            }
        }
        return -10;
    }
    
    public static double getInfusionDifficulty(final Creature performer, final Item source, final Item target) {
        double diff = (Servers.localServer.PVPSERVER ? 150 : 120) - source.getCurrentQualityLevel();
        diff += source.getRarity() * (Servers.localServer.PVPSERVER ? 50 : 30);
        diff += 40.0f - target.getCurrentQualityLevel() * 0.4f;
        diff -= performer.getSoulDepth().getKnowledge();
        if (Servers.localServer.PVPSERVER) {
            diff *= 1.399999976158142;
        }
        return diff;
    }
    
    public static boolean shouldCancelInfusion(final Creature performer, final Item source, final Item target) {
        if (target.getOwnerId() != performer.getWurmId() && target.getLastOwnerId() != performer.getWurmId()) {
            performer.getCommunicator().sendNormalServerMessage("You must own the item you wish to infuse.");
            return true;
        }
        if (source.getRarity() > target.getRarity() + 1) {
            performer.getCommunicator().sendNormalServerMessage("The " + source.getName() + " is too powerful, and would outright destroy the " + target.getName() + ".");
            return true;
        }
        if (source.getRarity() < target.getRarity() + 1) {
            performer.getCommunicator().sendNormalServerMessage("The " + source.getName() + " is not powerful enough to have an effect on the " + target.getName() + ". You will need to combine with other crystals first.");
            return true;
        }
        return false;
    }
    
    public static boolean shouldCancelCombine(final Creature performer, final Item source, final Item target) {
        if (source.getWurmId() == target.getWurmId()) {
            performer.getCommunicator().sendNormalServerMessage("You can't combine a crystal with itself, silly!");
            return true;
        }
        if (!isCrystal(source) || !isCrystal(target)) {
            performer.getCommunicator().sendNormalServerMessage("Both objects must be Crystals to combine.");
            return true;
        }
        if (source.getTemplateId() != target.getTemplateId()) {
            performer.getCommunicator().sendNormalServerMessage("Both crystals must be of the same type to combine.");
            return true;
        }
        try {
            if (source.getOwner() != performer.getWurmId() || target.getOwner() != performer.getWurmId()) {
                performer.getCommunicator().sendNormalServerMessage("You must hold both crystals in your hands to combine them.");
                return true;
            }
        }
        catch (NotOwnedException e) {
            e.printStackTrace();
        }
        if (source.getRarity() < target.getRarity()) {
            performer.getCommunicator().sendNormalServerMessage("That crystal is too potent for this combination.");
            return true;
        }
        if (source.getRarity() > target.getRarity()) {
            performer.getCommunicator().sendNormalServerMessage("That crystal is not potent enough for this combination.");
            return true;
        }
        if (source.getRarity() >= 3 && target.getRarity() >= 3 && source.getCurrentQualityLevel() + target.getCurrentQualityLevel() >= 100.0f) {
            performer.getCommunicator().sendNormalServerMessage("Those crystals would be far too powerful if combined.");
            return true;
        }
        return false;
    }
    
    public static boolean isCrystal(final Item item) {
        return item.getTemplateId() == ChaosCrystal.templateId || item.getTemplateId() == EnchantersCrystal.templateId;
    }
    
    static {
        Crystals.enchs = new byte[] { 47, 45, 13, 20, 14, 33, 26, 31, 32, 15, 18, 17, 27, 46, 16, 110, 111 };
    }
}
