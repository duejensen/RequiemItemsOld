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

public class GlimmerscaleVest implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleVest() {
        this.name = "glimmerscale vest";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.vest");
        itemBuilder.name(this.name, "glimmerscale vests", "A glimmerscale vest.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)1020);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 2 });
        itemBuilder.modelName("model.armour.torso.dragon.scale.leather.");
        itemBuilder.difficulty(80.0f);
        itemBuilder.weightGrams(4500);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleVest.templateId = template.getTemplateId();
        GlimmerscaleVest.logger.info(this.name + " TemplateID: " + GlimmerscaleVest.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleVest.logger.info("initCreationEntry()");
        if (GlimmerscaleVest.templateId > 0) {
            GlimmerscaleVest.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleVest.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleVest.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleVest.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleVest.logger = Logger.getLogger(GlimmerscaleVest.class.getName());
    }
}
