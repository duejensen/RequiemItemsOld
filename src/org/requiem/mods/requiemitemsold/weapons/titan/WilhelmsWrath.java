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

public class WilhelmsWrath implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public WilhelmsWrath() {
        this.name = "Wilhelm's Wrath";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.titan.wilhelm.wrath");
        itemBuilder.name(this.name, "Wilhelm's Wraths", "A magnificent one-handed scythe, hand-crafted by Libila for her favoured champion, Wilhelm. To achieve it's full potential, one must wield it in combat.");
        itemBuilder.itemTypes(new short[] { 108, 22, 44, 37, 2 });
        itemBuilder.imageNumber((short)753);
        itemBuilder.behaviourType((short)35);
        itemBuilder.combatDamage(40);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 10, 80);
        itemBuilder.primarySkill(10047);
        itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.weapon.scythe.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(1000);
        itemBuilder.material((byte)56);
        itemBuilder.value(1000000);
        final ItemTemplate template = itemBuilder.build();
        WilhelmsWrath.templateId = template.getTemplateId();
        WilhelmsWrath.logger.info(this.name + " TemplateID: " + WilhelmsWrath.templateId);
    }
    
    static {
        WilhelmsWrath.logger = Logger.getLogger(WilhelmsWrath.class.getName());
    }
}
