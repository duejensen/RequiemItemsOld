package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplateCreator;
import com.wurmonline.server.items.ItemTypes;
import org.requiem.mods.requiemitemsold.configurator.Constants;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ScrollOfTownPortal {
    private static Logger logger = Logger.getLogger(ScrollOfTownPortal.class.getName());

    public static void createTemplate() {
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
        }
        catch (Throwable e) {
            ScrollOfTownPortal.logger.log(Level.SEVERE, "Uncaught Exception in createTemplate", e);
        }
    }

}
