// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class CorpseDecoration implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public CorpseDecoration() {
        this.name = "human corpse";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.corpse");
        itemBuilder.name(this.name, "human corpses", "A human corpse.");
        itemBuilder.itemTypes(new short[] { 108, 135, 86, 51, 52, 157, 44, 92 });
        itemBuilder.imageNumber((short)40);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(20, 50, 200);
        itemBuilder.primarySkill(10017);
        itemBuilder.bodySpaces(CorpseDecoration.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.corpse.");
        itemBuilder.difficulty(50.0f);
        itemBuilder.weightGrams(50000);
        itemBuilder.material((byte)1);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        CorpseDecoration.templateId = template.getTemplateId();
        CorpseDecoration.logger.info(this.name + " TemplateID: " + CorpseDecoration.templateId);
    }
    
    public void initCreationEntry() {
        CorpseDecoration.logger.info("initCreationEntry()");
        if (CorpseDecoration.templateId > 0) {
            CorpseDecoration.logger.info("Creating " + this.name + " creation entry, ID = " + CorpseDecoration.templateId);
            final AdvancedCreationEntry entry = CreationEntryCreator.createAdvancedEntry(10017, 72, 72, CorpseDecoration.templateId, false, false, 0.0f, true, false, CreationCategories.REQUIEM_DECORATIONS);
            entry.addRequirement(new CreationRequirement(1, 72, 3, true));
        }
        else {
            CorpseDecoration.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        CorpseDecoration.logger = Logger.getLogger(CorpseDecoration.class.getName());
    }
}
