// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.armour;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class GlimmerscaleHelmet implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleHelmet() {
        this.name = "glimmerscale helmet";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.helmet");
        itemBuilder.name(this.name, "glimmerscale helmets", "A horned helmet made of glimmerscale.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)968);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 1, 28 });
        itemBuilder.modelName("model.armour.head.greathelmHornedOfGold.");
        itemBuilder.difficulty(76.0f);
        itemBuilder.weightGrams(2500);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleHelmet.templateId = template.getTemplateId();
        GlimmerscaleHelmet.logger.info(this.name + " TemplateID: " + GlimmerscaleHelmet.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleHelmet.logger.info("initCreationEntry()");
        if (GlimmerscaleHelmet.templateId > 0) {
            GlimmerscaleHelmet.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleHelmet.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleHelmet.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleHelmet.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleHelmet.logger = Logger.getLogger(GlimmerscaleHelmet.class.getName());
    }
}
