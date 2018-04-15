// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ArrowPackWar
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "war arrow pack";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.arrowpack.war");
        itemBuilder.name(name, "war arrow packs", "A pack of arrows, able to be unpacked into a full quiver.");
        itemBuilder.descriptions("excellent", "good", "ok", "poor");
        itemBuilder.itemTypes(new short[] { 108, 44, 21 });
        itemBuilder.imageNumber((short)760);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(15, 15, 50);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.container.quiver.");
        itemBuilder.difficulty(55.0f);
        itemBuilder.weightGrams(2500);
        itemBuilder.material((byte)14);
        itemBuilder.value(1000);
        itemBuilder.isTraded(true);
        final ItemTemplate template = itemBuilder.build();
        ArrowPackWar.templateId = template.getTemplateId();
        ArrowPackWar.logger.info(name + " TemplateID: " + ArrowPackWar.templateId);
    }
    
    public void initCreationEntry() {
        ArrowPackWar.logger.info("initCreationEntry()");
        if (ArrowPackWar.templateId > 0) {
            final AdvancedCreationEntry huntingPack = CreationEntryCreator.createAdvancedEntry(1032, 462, 456, ArrowPackWar.templateId, false, false, 0.0f, true, false, 0, 50.0, CreationCategories.FLETCHING);
            huntingPack.addRequirement(new CreationRequirement(1, 456, 39, true));
        }
    }
    
    static {
        ArrowPackWar.logger = Logger.getLogger(ArrowPackWar.class.getName());
    }
}
