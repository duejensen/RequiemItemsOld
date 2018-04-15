// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class DisintegrationRod implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "Rod of Disintegration";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("item.mod.rod.disintegration");
        itemBuilder.name(name, "rods of disintegration", "A rod designed for removal of ore veins and cave walls.");
        itemBuilder.itemTypes(new short[] { 53, 127, 155 });
        itemBuilder.imageNumber((short)1259);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 60);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.tool.rodtrans.");
        itemBuilder.difficulty(300.0f);
        itemBuilder.weightGrams(1000);
        itemBuilder.material((byte)15);
        itemBuilder.value(50000);
        itemBuilder.isTraded(true);
        final ItemTemplate template = itemBuilder.build();
        DisintegrationRod.templateId = template.getTemplateId();
        DisintegrationRod.logger.info(name + " TemplateID: " + DisintegrationRod.templateId);
    }
    
    static {
        DisintegrationRod.logger = Logger.getLogger(DisintegrationRod.class.getName());
    }
}
