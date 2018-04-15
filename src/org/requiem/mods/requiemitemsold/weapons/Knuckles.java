// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.weapons;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class Knuckles implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public Knuckles() {
        this.name = "knuckles";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.knuckles");
        itemBuilder.name(this.name, "knuckles", "A classic weapon used in hand-to-hand combat.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 37, 14 });
        itemBuilder.imageNumber((short)60);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10052);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.decoration.ring.rift.2.");
        itemBuilder.difficulty(40.0f);
        itemBuilder.weightGrams(800);
        itemBuilder.material((byte)30);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        Knuckles.templateId = template.getTemplateId();
        Knuckles.logger.info(this.name + " TemplateID: " + Knuckles.templateId);
    }
    
    public void initCreationEntry() {
        Knuckles.logger.info("initCreationEntry()");
        if (Knuckles.templateId > 0) {
            Knuckles.logger.info("Creating " + this.name + " creation entry, ID = " + Knuckles.templateId);
            CreationEntryCreator.createSimpleEntry(1016, 64, 221, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            CreationEntryCreator.createSimpleEntry(1016, 64, 46, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            CreationEntryCreator.createSimpleEntry(1016, 64, 205, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            CreationEntryCreator.createSimpleEntry(1016, 64, 694, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            CreationEntryCreator.createSimpleEntry(1016, 64, 698, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
            CreationEntryCreator.createSimpleEntry(1016, 64, 837, Knuckles.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
        }
        else {
            Knuckles.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        Knuckles.logger = Logger.getLogger(Knuckles.class.getName());
    }
}
