// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.weapons.titan;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class VindictivesVengeance implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public VindictivesVengeance() {
        this.name = "Vindictive's Vengeance";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.titan.vindictive.vengeance");
        itemBuilder.name(this.name, "Vindictive Vengeances", "A sickle as light as a feather, capable of swinging as swiftly as the user can wield it.");
        itemBuilder.itemTypes(new short[] { 108, 22, 44, 37, 2 });
        itemBuilder.imageNumber((short)752);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10046);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.weapon.sickle.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(100);
        itemBuilder.material((byte)56);
        itemBuilder.value(1000000);
        final ItemTemplate template = itemBuilder.build();
        VindictivesVengeance.templateId = template.getTemplateId();
        VindictivesVengeance.logger.info(this.name + " TemplateID: " + VindictivesVengeance.templateId);
    }
    
    static {
        VindictivesVengeance.logger = Logger.getLogger(VindictivesVengeance.class.getName());
    }
}
