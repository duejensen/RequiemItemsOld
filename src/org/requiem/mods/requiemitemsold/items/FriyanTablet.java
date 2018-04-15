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

public class FriyanTablet implements ItemTypes, MiscConstants
{
    protected static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "Tablet of Friyan";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.tablet.friyan");
        itemBuilder.name(name, "tablets of friyan", "Once a great scholar and sorceress, Friyan's faith had reached the zenith. While in this world, she wrote her knowledge in tablets like these. Perhaps you may learn more of the gods from it...");
        itemBuilder.itemTypes(new short[] { 25, 49, 31, 52, 40, 67, 123, 178, 157 });
        itemBuilder.imageNumber((short)60);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(500, 500, 1000);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(FriyanTablet.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.structure.portal.10.");
        itemBuilder.difficulty(99.0f);
        itemBuilder.weightGrams(2000000);
        itemBuilder.material((byte)15);
        itemBuilder.value(10000);
        final ItemTemplate template = itemBuilder.build();
        FriyanTablet.templateId = template.getTemplateId();
        FriyanTablet.logger.info(name + " TemplateID: " + FriyanTablet.templateId);
    }
    
    static {
        FriyanTablet.logger = Logger.getLogger(FriyanTablet.class.getName());
    }
}
