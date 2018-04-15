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

public class RaffehsRage implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public RaffehsRage() {
        this.name = "Raffeh's Rage";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.titan.raffeh.rage");
        itemBuilder.name(this.name, "Raffeh's Rages", "A melding of ice and fire from the champion of Kaen Ist, this maul is an elemental maelstrom.");
        itemBuilder.itemTypes(new short[] { 108, 22, 44, 37, 14 });
        itemBuilder.imageNumber((short)1213);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10062);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.weapon.maul.medium.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(100);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        final ItemTemplate template = itemBuilder.build();
        RaffehsRage.templateId = template.getTemplateId();
        RaffehsRage.logger.info(this.name + " TemplateID: " + RaffehsRage.templateId);
    }
    
    static {
        RaffehsRage.logger = Logger.getLogger(RaffehsRage.class.getName());
    }
}
