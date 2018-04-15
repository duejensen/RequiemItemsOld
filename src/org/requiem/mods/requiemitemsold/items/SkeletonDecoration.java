// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.CreationCategories;
import com.wurmonline.server.items.CreationEntryCreator;
import com.wurmonline.server.items.ItemTemplate;
import com.wurmonline.server.items.ItemTypes;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class SkeletonDecoration implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public SkeletonDecoration() {
        this.name = "skeleton";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("mod.item.skeleton");
        itemBuilder.name(this.name, "skeletons", "A skeleton.");
        itemBuilder.itemTypes(new short[] { 108, 135, 86, 51, 52, 157, 44, 92 });
        itemBuilder.imageNumber((short)40);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(20, 50, 200);
        itemBuilder.primarySkill(10059);
        itemBuilder.bodySpaces(SkeletonDecoration.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.corpse.human.butchered.");
        itemBuilder.difficulty(90.0f);
        itemBuilder.weightGrams(50000);
        itemBuilder.material((byte)1);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        SkeletonDecoration.templateId = template.getTemplateId();
        SkeletonDecoration.logger.info(this.name + " TemplateID: " + SkeletonDecoration.templateId);
    }
    
    public void initCreationEntry() {
        SkeletonDecoration.logger.info("initCreationEntry()");
        if (SkeletonDecoration.templateId > 0) {
            SkeletonDecoration.logger.info("Creating " + this.name + " creation entry, ID = " + SkeletonDecoration.templateId);
            CreationEntryCreator.createSimpleEntry(10059, 93, 22760, SkeletonDecoration.templateId, false, true, 0.0f, false, false, CreationCategories.REQUIEM_DECORATIONS);
        }
        else {
            SkeletonDecoration.logger.info(this.name + " does not have a template ID on creation entry.");
        }
    }
    
    static {
        SkeletonDecoration.logger = Logger.getLogger(SkeletonDecoration.class.getName());
    }
}
