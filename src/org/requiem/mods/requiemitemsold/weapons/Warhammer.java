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
import org.requiem.mods.requiemitemsold.weapons.heads.WarhammerHead;

import java.io.IOException;
import java.util.logging.Logger;

public class Warhammer implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public Warhammer() {
        this.name = "warhammer";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.warhammer");
        itemBuilder.name(this.name, "warhammers", "A warhammer.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 37, 14 });
        itemBuilder.imageNumber((short)1339);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10070);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.artifact.hammerhuge.");
        itemBuilder.difficulty(35.0f);
        itemBuilder.weightGrams(7000);
        itemBuilder.material((byte)11);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        Warhammer.templateId = template.getTemplateId();
        Warhammer.logger.info(this.name + " TemplateID: " + Warhammer.templateId);
    }
    
    public void initCreationEntry() {
        Warhammer.logger.info("initCreationEntry()");
        if (Warhammer.templateId > 0) {
            Warhammer.logger.info("Creating " + this.name + " creation entry, ID = " + Warhammer.templateId);
            CreationEntryCreator.createSimpleEntry(1016, 23, WarhammerHead.templateId, Warhammer.templateId, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
        }
        else {
            Warhammer.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        Warhammer.logger = Logger.getLogger(Warhammer.class.getName());
    }
}
