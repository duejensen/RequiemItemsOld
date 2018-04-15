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

public class SpectralSleeve implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralSleeve() {
        this.name = "spectral sleeve";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.sleeve");
        itemBuilder.name(this.name, "spectral sleeves", "A spectral sleeve.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1062);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 3, 4 });
        itemBuilder.modelName("model.armour.sleeve.dragon.");
        itemBuilder.difficulty(72.0f);
        itemBuilder.weightGrams(400);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralSleeve.templateId = template.getTemplateId();
        SpectralSleeve.logger.info(this.name + " TemplateID: " + SpectralSleeve.templateId);
    }
    
    public void initCreationEntry() {
        SpectralSleeve.logger.info("initCreationEntry()");
        if (SpectralSleeve.templateId > 0) {
            SpectralSleeve.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralSleeve.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralSleeve.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralSleeve.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralSleeve.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralSleeve.logger = Logger.getLogger(SpectralSleeve.class.getName());
    }
}
