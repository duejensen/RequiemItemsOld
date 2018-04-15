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

public class SpectralCap implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralCap() {
        this.name = "spectral cap";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.cap");
        itemBuilder.name(this.name, "spectral caps", "A spectral cap.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1063);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 1, 28 });
        itemBuilder.modelName("model.armour.head.dragon.");
        itemBuilder.difficulty(74.0f);
        itemBuilder.weightGrams(500);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralCap.templateId = template.getTemplateId();
        SpectralCap.logger.info("Spectral improve = " + template.getImproveItem());
        SpectralCap.logger.info(this.name + " TemplateID: " + SpectralCap.templateId);
    }
    
    public void initCreationEntry() {
        SpectralCap.logger.info("initCreationEntry()");
        if (SpectralCap.templateId > 0) {
            SpectralCap.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralCap.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralCap.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralCap.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralCap.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralCap.logger = Logger.getLogger(SpectralCap.class.getName());
    }
}
