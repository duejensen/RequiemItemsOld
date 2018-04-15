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

public class MaartensMight implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public MaartensMight() {
        this.name = "Maarten's Might";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.titan.maarten.might");
        itemBuilder.name(this.name, "Maarten's Mights", "Extracted from a mine just outside Valhalla, this warhammer cannot be blocked.");
        itemBuilder.itemTypes(new short[] { 108, 22, 44, 37, 14 });
        itemBuilder.imageNumber((short)1339);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10070);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.artifact.hammerhuge.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(100);
        itemBuilder.material((byte)57);
        itemBuilder.value(1000000);
        final ItemTemplate template = itemBuilder.build();
        MaartensMight.templateId = template.getTemplateId();
        MaartensMight.logger.info(this.name + " TemplateID: " + MaartensMight.templateId);
    }
    
    static {
        MaartensMight.logger = Logger.getLogger(MaartensMight.class.getName());
    }
}
