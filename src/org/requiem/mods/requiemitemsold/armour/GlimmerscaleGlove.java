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

public class GlimmerscaleGlove implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleGlove() {
        this.name = "glimmerscale glove";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.glove");
        itemBuilder.name(this.name, "glimmerscale gloves", "A glimmerscale glove.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)1024);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 13, 14 });
        itemBuilder.modelName("model.armour.hand.dragon.scale.leather.");
        itemBuilder.difficulty(70.0f);
        itemBuilder.weightGrams(1200);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleGlove.templateId = template.getTemplateId();
        GlimmerscaleGlove.logger.info(this.name + " TemplateID: " + GlimmerscaleGlove.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleGlove.logger.info("initCreationEntry()");
        if (GlimmerscaleGlove.templateId > 0) {
            GlimmerscaleGlove.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleGlove.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleGlove.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleGlove.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleGlove.logger = Logger.getLogger(GlimmerscaleGlove.class.getName());
    }
}
