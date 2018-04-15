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

public class SpectralBoot implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralBoot() {
        this.name = "spectral boot";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.boot");
        itemBuilder.name(this.name, "spectral boots", "A spectral boot.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1065);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 15, 16 });
        itemBuilder.modelName("model.armour.foot.dragon.");
        itemBuilder.difficulty(70.0f);
        itemBuilder.weightGrams(300);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralBoot.templateId = template.getTemplateId();
        SpectralBoot.logger.info(this.name + " TemplateID: " + SpectralBoot.templateId);
    }
    
    public void initCreationEntry() {
        SpectralBoot.logger.info("initCreationEntry()");
        if (SpectralBoot.templateId > 0) {
            SpectralBoot.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralBoot.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralBoot.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralBoot.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralBoot.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralBoot.logger = Logger.getLogger(SpectralBoot.class.getName());
    }
}
