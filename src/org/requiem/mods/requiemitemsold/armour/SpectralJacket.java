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

public class SpectralJacket implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SpectralJacket() {
        this.name = "spectral jacket";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.spectral.jacket");
        itemBuilder.name(this.name, "spectral jackets", "A spectral jacket.");
        itemBuilder.itemTypes(new short[] { 108, 44, 23, 4, 99 });
        itemBuilder.imageNumber((short)1060);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(2, 40, 40);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(new byte[] { 2 });
        itemBuilder.modelName("model.armour.torso.dragon.");
        itemBuilder.difficulty(80.0f);
        itemBuilder.weightGrams(800);
        itemBuilder.material((byte)16);
        itemBuilder.value(1000000);
        itemBuilder.armourType(9);
        final ItemTemplate template = itemBuilder.build();
        SpectralJacket.templateId = template.getTemplateId();
        SpectralJacket.logger.info(this.name + " TemplateID: " + SpectralJacket.templateId);
    }
    
    public void initCreationEntry() {
        SpectralJacket.logger.info("initCreationEntry()");
        if (SpectralJacket.templateId > 0) {
            SpectralJacket.logger.info("Creating " + this.name + " creation entry, ID = " + SpectralJacket.templateId);
            CreationEntryCreator.createSimpleEntry(10017, 215, SpectralHide.templateId, SpectralJacket.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
            CreationEntryCreator.createSimpleEntry(10017, 216, SpectralHide.templateId, SpectralJacket.templateId, false, true, 0.0f, false, false, CreationCategories.ARMOUR);
        }
        else {
            SpectralJacket.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SpectralJacket.logger = Logger.getLogger(SpectralJacket.class.getName());
    }
}
