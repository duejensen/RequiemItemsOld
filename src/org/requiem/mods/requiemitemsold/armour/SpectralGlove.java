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

public class SpectralGlove implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralGlove() {
        this.name = "spectral glove";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.glove");
        itemBuilder.name(this.name, "spectral gloves", "A spectral glove.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1064);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 13, 14 });
        itemBuilder.modelName("model.armour.hand.dragon.");
        itemBuilder.difficulty(68.0f);
        itemBuilder.weightGrams(250);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralGlove.templateId = template.getTemplateId();
        SpectralGlove.logger.info(this.name + " TemplateID: " + SpectralGlove.templateId);
    }
    
    public void initCreationEntry() {
        SpectralGlove.logger.info("initCreationEntry()");
        if (SpectralGlove.templateId > 0) {
            SpectralGlove.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralGlove.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralGlove.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralGlove.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralGlove.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralGlove.logger = Logger.getLogger(SpectralGlove.class.getName());
    }
}
