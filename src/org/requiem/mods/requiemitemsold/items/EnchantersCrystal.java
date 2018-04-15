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

public class EnchantersCrystal implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "enchanters crystal";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.crystal.enchanters");
        itemBuilder.name(name, "enchanters crystals", "This crystal can manipulate the magical properties of an item.");
        itemBuilder.descriptions("brilliantly glowing", "strongly glowing", "faintly glowing", "barely glowing");
        itemBuilder.itemTypes(new short[] { 6, 53, 127, 155 });
        itemBuilder.imageNumber((short)462);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(1, 1, 1);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(EnchantersCrystal.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.valrei.");
        itemBuilder.difficulty(5.0f);
        itemBuilder.weightGrams(250);
        itemBuilder.material((byte)52);
        itemBuilder.value(5000);
        itemBuilder.isTraded(true);
        final ItemTemplate template = itemBuilder.build();
        EnchantersCrystal.templateId = template.getTemplateId();
        EnchantersCrystal.logger.info(name + " TemplateID: " + EnchantersCrystal.templateId);
    }
    
    static {
        EnchantersCrystal.logger = Logger.getLogger(EnchantersCrystal.class.getName());
    }
}
