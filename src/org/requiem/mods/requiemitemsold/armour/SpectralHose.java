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

public class SpectralHose implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralHose() {
        this.name = "spectral leggings";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.hose");
        itemBuilder.name(this.name, "spectral leggings", "Spectral leggings.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1061);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 34 });
        itemBuilder.modelName("model.armour.leg.dragon.");
        itemBuilder.difficulty(77.0f);
        itemBuilder.weightGrams(700);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralHose.templateId = template.getTemplateId();
        SpectralHose.logger.info("Spectral improve = " + template.getImproveItem());
        SpectralHose.logger.info(this.name + " TemplateID: " + SpectralHose.templateId);
    }
    
    public void initCreationEntry() {
        SpectralHose.logger.info("initCreationEntry()");
        if (SpectralHose.templateId > 0) {
            SpectralHose.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralHose.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralHose.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralHose.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralHose.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralHose.logger = Logger.getLogger(SpectralHose.class.getName());
    }
}
