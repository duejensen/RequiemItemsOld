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

public class EnchantOrb implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "enchant orb";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("requiem.enchantorb");
        itemBuilder.name(name, "enchant orbs", "It shimmers lightly, the magic inside waiting for a proper vessel.");
        itemBuilder.descriptions("vibrant", "glowing", "faint", "empty");
        itemBuilder.itemTypes(new short[] { 6 });
        itemBuilder.imageNumber((short)819);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(1, 1, 1);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(EnchantOrb.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.artifact.orbdoom");
        itemBuilder.difficulty(5.0f);
        itemBuilder.weightGrams(500);
        itemBuilder.material((byte)52);
        itemBuilder.value(50000);
        itemBuilder.isTraded(true);
        final ItemTemplate template = itemBuilder.build();
        EnchantOrb.templateId = template.getTemplateId();
        EnchantOrb.logger.info(name + " TemplateID: " + EnchantOrb.templateId);
    }
    
    static {
        EnchantOrb.logger = Logger.getLogger(EnchantOrb.class.getName());
    }
}
