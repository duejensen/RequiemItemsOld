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

public class GlimmerscaleSleeve implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public GlimmerscaleSleeve() {
        this.name = "glimmerscale sleeve";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.glimmerscale.sleeve");
        itemBuilder.name(this.name, "glimmerscale sleeves", "A glimmerscale sleeve.");
        itemBuilder.itemTypes(new short[] { 108, 44, 22, 4, 99 });
        itemBuilder.imageNumber((short)1022);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 3, 4 });
        itemBuilder.modelName("model.armour.sleeve.dragon.scale.leather.");
        itemBuilder.difficulty(74.0f);
        itemBuilder.weightGrams(1800);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        itemBuilder.armourType(10);
        final ItemTemplate template = itemBuilder.build();
        GlimmerscaleSleeve.templateId = template.getTemplateId();
        GlimmerscaleSleeve.logger.info(this.name + " TemplateID: " + GlimmerscaleSleeve.templateId);
    }
    
    public void initCreationEntry() {
        GlimmerscaleSleeve.logger.info("initCreationEntry()");
        if (GlimmerscaleSleeve.templateId > 0) {
            GlimmerscaleSleeve.logger.info("Creating " + this.name + " creation entry, ID = " + GlimmerscaleSleeve.templateId);
            CreationEntryCreator.createSimpleEntry(10013, 185, Glimmerscale.templateId, GlimmerscaleSleeve.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            GlimmerscaleSleeve.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        GlimmerscaleSleeve.logger = Logger.getLogger(GlimmerscaleSleeve.class.getName());
    }
}
