// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class DepthDrill implements ItemTypes, MiscConstants
{
    public static Logger logger;
    public static int templateId;
    private String name;
    
    public DepthDrill() {
        this.name = "depth drill";
    }
    
    public void createTemplate() throws IOException {
        final ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("requiem.depthdrill");
        itemBuilder.name(this.name, "depth drills", "A tool for determining dirt depth.");
        itemBuilder.itemTypes(new short[] { 108, 44, 38, 13 });
        itemBuilder.imageNumber((short)60);
        itemBuilder.behaviourType((short)1);
        itemBuilder.combatDamage(0);
        itemBuilder.decayTime(Long.MAX_VALUE);
        itemBuilder.dimensions(6, 6, 96);
        itemBuilder.primarySkill(10044);
        itemBuilder.bodySpaces(DepthDrill.EMPTY_BYTE_PRIMITIVE_ARRAY);
        itemBuilder.modelName("model.resource.shaft.");
        itemBuilder.difficulty(30.0f);
        itemBuilder.weightGrams(1100);
        itemBuilder.material((byte)11);
        itemBuilder.value(1000);
        final ItemTemplate template = itemBuilder.build();
        DepthDrill.templateId = template.getTemplateId();
        DepthDrill.logger.info(this.name + " TemplateID: " + DepthDrill.templateId);
    }
    
    public void initCreationEntry() {
        DepthDrill.logger.info("initCreationEntry()");
        if (DepthDrill.templateId > 0) {
            DepthDrill.logger.info("Creating " + this.name + " creation entry, ID = " + DepthDrill.templateId);
            final AdvancedCreationEntry entry = CreationEntryCreator.createAdvancedEntry(10044, 188, 23, DepthDrill.templateId, false, false, 0.0f, true, false, CreationCategories.TOOLS);
            entry.addRequirement(new CreationRequirement(1, 99, 2, true));
            entry.addRequirement(new CreationRequirement(2, 218, 1, true));
        }
        else {
            DepthDrill.logger.info("Depth Drill does not have a template ID on creation entry.");
        }
    }
    
    static {
        DepthDrill.logger = Logger.getLogger(DepthDrill.class.getName());
    }
}
