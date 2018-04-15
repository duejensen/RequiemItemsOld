// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class HugeCrate implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "huge crate";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.crate.huge");
        itemBuilder.name(name, "huge crates", "A huge crate made from planks, primarily used to transport goods.");
        itemBuilder.itemTypes(new short[] { 108, 135, 21, 51, 52, 44, 1, 92, 145, 176 });
        itemBuilder.imageNumber((short)311);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(9072000L);
        itemBuilder.dimensions(140, 140, 140);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(HugeCrate.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.container.crate.large.");
        itemBuilder.difficulty(70.0f);
        itemBuilder.weightGrams(20000);
        itemBuilder.material((byte)14);
        itemBuilder.value(10000);
        itemBuilder.isTraded(false);
        final ItemTemplate template = itemBuilder.build();
        HugeCrate.templateId = template.getTemplateId();
        HugeCrate.logger.info(name + " TemplateID: " + HugeCrate.templateId);
    }
    
    public void initCreationEntry() {
        HugeCrate.logger.info("initCreationEntry()");
        if (HugeCrate.templateId > 0) {
            HugeCrate.logger.info("Creating Huge Crate creation entry, ID = " + HugeCrate.templateId);
            final AdvancedCreationEntry entry = CreationEntryCreator.createAdvancedEntry(10044, 22, 217, HugeCrate.templateId, false, false, 0.0f, true, false, CreationCategories.TOOLS);
            entry.addRequirement(new CreationRequirement(1, 22, 20, true));
        }
        else {
            HugeCrate.logger.info("Huge Crate does not have a template ID on creation entry.");
        }
    }
    
    static {
        HugeCrate.logger = Logger.getLogger(HugeCrate.class.getName());
    }
}
