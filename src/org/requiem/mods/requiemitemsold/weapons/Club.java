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

public class Club implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public Club() {
        this.name = "club";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.club");
        itemBuilder.name(this.name, "clubs", "A blunt weapon.");
        itemBuilder.itemTypes(new short[] { 108, 44, 21, 37, 14 });
        itemBuilder.imageNumber((short)1239);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(35);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10064);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.weapon.club.huge.");
        itemBuilder.difficulty(40.0f);
        itemBuilder.weightGrams(8000);
        itemBuilder.material((byte)14);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        Club.templateId = template.getTemplateId();
        Club.logger.info(this.name + " TemplateID: " + Club.templateId);
    }
    
    public void initCreationEntry() {
        Club.logger.info("initCreationEntry()");
        if (Club.templateId > 0) {
            Club.logger.info("Creating " + this.name + " creation entry, ID = " + Club.templateId);
            CreationEntryCreator.createSimpleEntry(10044, 8, 9, Club.templateId, false, true, 0.0f, false, false, CreationCategories.WEAPONS);
        }
        else {
            Club.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        Club.logger = Logger.getLogger(Club.class.getName());
    }
}
