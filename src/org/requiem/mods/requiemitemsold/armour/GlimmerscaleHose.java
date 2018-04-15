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

public class GlimmerscaleHose implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleHose() {
        this.name = "glimmerscale leggings";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.hose");
        itemBuilder.name(this.name, "glimmerscale leggings", "A set of glimmerscale leggings.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)1021);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 34 });
        itemBuilder.modelName("model.armour.leg.dragon.scale.leather.");
        itemBuilder.difficulty(78.0f);
        itemBuilder.weightGrams(3200);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleHose.templateId = template.getTemplateId();
        GlimmerscaleHose.logger.info(this.name + " TemplateID: " + GlimmerscaleHose.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleHose.logger.info("initCreationEntry()");
        if (GlimmerscaleHose.templateId > 0) {
            GlimmerscaleHose.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleHose.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleHose.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleHose.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleHose.logger = Logger.getLogger(GlimmerscaleHose.class.getName());
    }
}
