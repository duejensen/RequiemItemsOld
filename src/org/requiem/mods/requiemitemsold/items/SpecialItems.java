
package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.configurator.Constants;
import org.requiem.mods.requiemitemsold.items.actions.HolyBookPrayAction;
import org.requiem.mods.requiemitemsold.items.actions.TownScrollAction;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SpecialItems {
    private static final Logger logger;
    
    public static void addHolyBook() {
        try {
            logger.info("creating holy book()");
            ItemTemplateCreator.createItemTemplate(
                    Constants.holyBook,
                    "holy book", "holy books",
                    "superb", "normal", "worn", "tattered",
                    "A leather bound holy book of prayers to all religions. Priests can use them to pray while moving also.",
                    new short[] {
                            ItemTypes.ITEM_TYPE_NAMED,
                            ItemTypes.ITEM_TYPE_NOMOVE,
                            ItemTypes.ITEM_TYPE_MISSION,
                            ItemTypes.ITEM_TYPE_REPAIRABLE,
                            ItemTypes.ITEM_TYPE_IMPROVEITEM
                    },
                    (short)325,
                    (short)1,
                    0,
                    9072000L,
                    3, 30, 30,
                    -10,
                    MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY,
                    "model.artifact.tomemagic.red.",
                    35.0f,
                    1000,
                    (byte)16,
                    10000,
                    true
            );
            ModActions.registerAction(new HolyBookPrayAction());
        }
        catch (Throwable e) {
            SpecialItems.logger.log(Level.SEVERE, "Uncaught Exception in onServerStarted", e);
        }
    }
    
    public static void addTownPortal() {
        try {
            logger.info("creating town portal scroll()");
            ItemTemplateCreator.createItemTemplate(
                    Constants.townPortal,
                    "scroll of town portal", "portal scrolls",
                    "excellent", "good", "ok", "poor",
                    "A scroll with glyphs that appear and disappear randomly on the papyrus. You somehow know that it will take you home when. It has infinite uses.",
                    new short[] {
                            ItemTypes.ITEM_TYPE_HASDATA,
                            ItemTypes.ITEM_TYPE_MISSION
                    },
                    (short)331,
                    (short)1,
                    0,
                    Long.MAX_VALUE,
                    1, 5, 5,
                    -10,
                    MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY,
                    "model.artifact.scrollbind.",
                    0.0f,
                    0,
                    (byte)33,
                    500000,
                    true
            );
            ModActions.registerAction(new TownScrollAction());
        }
        catch (Throwable e) {
            SpecialItems.logger.log(Level.SEVERE, "Uncaught Exception in addTownPortal", e);
        }
    }
    
    public static void initCreationEntry() {
        try {
            final AdvancedCreationEntry holyBook = CreationEntryCreator.createAdvancedEntry(SkillList.PAPYRUSMAKING, ItemList.paperSheet, ItemList.leather, Constants.holyBook, true, false, 0.0f, false, false, CreationCategories.WRITING);
            holyBook.addRequirement(new CreationRequirement(1, ItemList.leatherStrip, 3, true));
            holyBook.addRequirement(new CreationRequirement(2, ItemList.leather, 1, true));
            holyBook.addRequirement(new CreationRequirement(3, ItemList.paperSheet, 4, true));
            holyBook.addRequirement(new CreationRequirement(4, ItemList.clothString, 1, true));
        }
        catch (Throwable e) {
            SpecialItems.logger.log(Level.SEVERE, "Uncaught Exception in initCreationEntry", e);
        }
    }
    
    static {
        logger = Logger.getLogger("RequiemItemsOld");
    }
}
