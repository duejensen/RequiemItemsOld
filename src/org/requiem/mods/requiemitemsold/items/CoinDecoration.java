// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class CoinDecoration implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public CoinDecoration() {
        this.name = "coin pile";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.coin.pile");
        itemBuilder.name(this.name, "coin piles", "A pile of decorative coins.");
        itemBuilder.itemTypes(new short[] { 108, 135, 86, 51, 52, 157, 44, 92 });
        itemBuilder.imageNumber((short)572);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(5, 5, 5);
        itemBuilder.primarySkill(1020);
        itemBuilder.bodySpaces(CoinDecoration.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.pile.coin.");
        itemBuilder.difficulty(70.0f);
        itemBuilder.weightGrams(1000);
        itemBuilder.material((byte)10);
        itemBuilder.value(100);
        final ItemTemplate template = itemBuilder.build();
        CoinDecoration.templateId = template.getTemplateId();
        CoinDecoration.logger.info(this.name + " TemplateID: " + CoinDecoration.templateId);
    }
    
    public void initCreationEntry() {
        CoinDecoration.logger.info("initCreationEntry()");
        if (CoinDecoration.templateId > 0) {
            CoinDecoration.logger.info("Creating " + this.name + " creation entry, ID = " + CoinDecoration.templateId);
            final AdvancedCreationEntry entry = CreationEntryCreator.createAdvancedEntry(1020, 50, 50, CoinDecoration.templateId, false, false, 0.0f, true, false, CreationCategories.REQUIEM_DECORATIONS);
            entry.addRequirement(new CreationRequirement(1, 50, 3, true));
        }
        else {
            CoinDecoration.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        CoinDecoration.logger = Logger.getLogger(CoinDecoration.class.getName());
    }
}
