// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.weapons.heads;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class WarhammerHead implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public WarhammerHead() {
        this.name = "warhammer head";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.warhammer.head");
        itemBuilder.name(this.name, "warhammer heads", "A warhammer head.");
        itemBuilder.itemTypes(new short[] { 108, 22 });
        itemBuilder.imageNumber((short)1232);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10070);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.artifact.hammerhuge.");
        itemBuilder.difficulty(25.0f);
        itemBuilder.weightGrams(6000);
        itemBuilder.material((byte)11);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        WarhammerHead.templateId = template.getTemplateId();
        WarhammerHead.logger.info(this.name + " TemplateID: " + WarhammerHead.templateId);
    }
    
    public void initCreationEntry() {
        WarhammerHead.logger.info("initCreationEntry()");
        if (WarhammerHead.templateId > 0) {
            WarhammerHead.logger.info("Creating " + this.name + " creation entry, ID = " + WarhammerHead.templateId);
            CreationEntryCreator.createSimpleEntry(10011, 185, 46, WarhammerHead.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPON_HEADS);
            CreationEntryCreator.createSimpleEntry(10011, 185, 205, WarhammerHead.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPON_HEADS);
            CreationEntryCreator.createSimpleEntry(10011, 185, 694, WarhammerHead.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPON_HEADS);
            CreationEntryCreator.createSimpleEntry(10011, 185, 698, WarhammerHead.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPON_HEADS);
            CreationEntryCreator.createSimpleEntry(10011, 185, 837, WarhammerHead.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPON_HEADS);
        }
        else {
            WarhammerHead.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        WarhammerHead.logger = Logger.getLogger(WarhammerHead.class.getName());
    }
}
