// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.armour;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import com.wurmonline.server.items.ItemTemplate;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class Glimmerscale
{
    private static Logger logger;
    public static int templateId;
    private String name;
    
    public Glimmerscale() {
        this.name = "glimmerscale";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("item.mod.glimmerscale.scale");
        itemBuilder.name(this.name, "glimmerscales", "Legendary scales, made from the careful combination of dragon scales and glimmersteel.");
        itemBuilder.descriptions("excellent", "good", "ok", "poor");
        itemBuilder.itemTypes(new short[] { 22, 146, 46, 157 });
        itemBuilder.imageNumber((short)554);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(10, 30, 30);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.resource.scales.dragon.");
        itemBuilder.difficulty(60.0f);
        itemBuilder.weightGrams(400);
        itemBuilder.material((byte)0);
        itemBuilder.value(200000);
        final ItemTemplate template = itemBuilder.build();
        Glimmerscale.templateId = template.getTemplateId();
        Glimmerscale.logger.info(this.name + " TemplateID: " + Glimmerscale.templateId);
    }
    
    public void initCreationEntry() {
        Glimmerscale.logger.info("initCreationEntry()");
        if (Glimmerscale.templateId > 0) {
            Glimmerscale.logger.info("Creating " + this.name + " creation entry, ID = " + Glimmerscale.templateId);
            CreationEntryCreator.createSimpleEntry(10041, 372, 698, Glimmerscale.templateId, true, true, 0.0f, true, false, CreationCategories.RESOURCES);
        }
        else {
            Glimmerscale.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        Glimmerscale.logger = Logger.getLogger(Glimmerscale.class.getName());
    }
}
