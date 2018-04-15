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

public class AffinityOrb implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    
    public void createTemplate() throws IOException {
        final String name = "affinity orb";
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("requiem.affinityorb");
        itemBuilder.name(name, "affinity orbs", "A valuable orb that infuses the user with hidden knowledge.");
        itemBuilder.descriptions("brilliantly glowing", "strongly glowing", "faintly glowing", "barely glowing");
        itemBuilder.itemTypes(new short[] { 6, 53, 127, 155 });
        itemBuilder.imageNumber((short)919);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(1, 1, 1);
        itemBuilder.primarySkill(-10);
        itemBuilder.bodySpaces(AffinityOrb.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.artifact.orbdoom");
        itemBuilder.difficulty(5.0f);
        itemBuilder.weightGrams(500);
        itemBuilder.material((byte)52);
        itemBuilder.value(3000000);
        itemBuilder.isTraded(true);
        final ItemTemplate template = itemBuilder.build();
        AffinityOrb.templateId = template.getTemplateId();
        AffinityOrb.logger.info(name + " TemplateID: " + AffinityOrb.templateId);
    }
    
    static {
        AffinityOrb.logger = Logger.getLogger(AffinityOrb.class.getName());
    }
}
