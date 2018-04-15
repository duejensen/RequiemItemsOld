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
import org.requiem.mods.requiemitemsold.weapons.titan.WilhelmsWrath;

import java.io.IOException;
import java.util.logging.Logger;

public class Eviscerator implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public Eviscerator() {
        this.name = "eviscerator";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.eviscerator");
        itemBuilder.name(this.name, "eviscerators", "A one-handed scythe of despair, optimal for the Genocide of entire species.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 37, 2 });
        itemBuilder.imageNumber((short)753);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10047);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.weapon.scythe.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(500);
        itemBuilder.material((byte)56);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        Eviscerator.templateId = template.getTemplateId();
        Eviscerator.logger.info(this.name + " TemplateID: " + Eviscerator.templateId);
    }
    
    public void initCreationEntry() {
        Eviscerator.logger.info("initCreationEntry()");
        if (Eviscerator.templateId > 0) {
            Eviscerator.logger.info("Creating " + this.name + " creation entry, ID = " + Eviscerator.templateId);
            CreationEntryCreator.createSimpleEntry(1016, WilhelmsWrath.templateId, WilhelmsWrath.templateId, Eviscerator.templateId, true, true, 0.0f, false, false, CreationCategories.WEAPONS);
        }
        else {
            Eviscerator.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        Eviscerator.logger = Logger.getLogger(Eviscerator.class.getName());
    }
}
