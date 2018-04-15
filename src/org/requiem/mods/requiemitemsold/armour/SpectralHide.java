// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.armour;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class SpectralHide implements ItemTypes, MiscConstants
{
    private static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "spectral hide";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("requiem.spectral.hide");
        itemBuilder.name(name, "spectral hides", "Lightweight and transparent, this ethereal leather comes from another plane of existance. It is stronger than natural drake hide.");
        itemBuilder.descriptions("excellent", "good", "ok", "poor");
        itemBuilder.itemTypes(new short[] { 23, 48, 46 });
        itemBuilder.imageNumber((short)602);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(10, 30, 30);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(SpectralHide.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.resource.leather.dragon.");
        itemBuilder.difficulty(20.0f);
        itemBuilder.weightGrams(200);
        itemBuilder.material((byte)16);
        itemBuilder.value(200000);
        final ItemTemplate template = itemBuilder.build();
        SpectralHide.templateId = template.getTemplateId();
        SpectralHide.logger.info(name + " TemplateID: " + SpectralHide.templateId);
    }
    
    static {
        SpectralHide.logger = Logger.getLogger(SpectralHide.class.getName());
    }
}
