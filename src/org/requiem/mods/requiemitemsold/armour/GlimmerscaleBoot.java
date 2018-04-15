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

public class GlimmerscaleBoot implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleBoot() {
        this.name = "glimmerscale boot";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.boot");
        itemBuilder.name(this.name, "glimmerscale boots", "A glimmerscale boot.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)1025);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 15, 16 });
        itemBuilder.modelName("model.armour.foot.dragon.scale.leather.");
        itemBuilder.difficulty(72.0f);
        itemBuilder.weightGrams(2000);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleBoot.templateId = template.getTemplateId();
        GlimmerscaleBoot.logger.info(this.name + " TemplateID: " + GlimmerscaleBoot.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleBoot.logger.info("initCreationEntry()");
        if (GlimmerscaleBoot.templateId > 0) {
            GlimmerscaleBoot.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleBoot.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleBoot.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleBoot.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleBoot.logger = Logger.getLogger(GlimmerscaleBoot.class.getName());
    }
}
