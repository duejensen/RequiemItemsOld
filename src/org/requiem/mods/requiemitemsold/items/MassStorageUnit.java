// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviours;

import java.io.IOException;
import java.util.logging.Logger;

public class MassStorageUnit implements ItemTypes
{
    private static Logger logger;
    public static int templateId;
    private String name;
    
    public MassStorageUnit() {
        this.name = "mass storage unit";
    }
    
    public void createTemplate() throws IOException {
        ModVehicleBehaviours.init();
        final ItemTemplateBuilder builder = new ItemTemplateBuilder("mod.item.mass.storage");
        builder.name(this.name, "mass storage units", "A massive storage unit able to be loaded with containers.");
        builder.descriptions("almost full", "somewhat occupied", "half-full", "emptyish");
        builder.itemTypes(new short[] { 21, 31, 44, 51, 52, 86, 109, 47, 1, 117, 119, 135, 180, 194, 193, 195 });
        builder.imageNumber((short)60);
        builder.behaviourType((short)41);
        builder.combatDamage(0);
        builder.decayTime(9072000L);
        builder.dimensions(400, 300, 1000);
        builder.primarySkill(-10);
        builder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
        builder.modelName("model.furniture.wooden.storageunit.");
        builder.difficulty(80.0f);
        builder.weightGrams(300000);
        builder.material((byte)14);
        final ItemTemplate template = builder.build();
        MassStorageUnit.templateId = template.getTemplateId();
        template.setContainerSize(300, 300, 600);
        final MassStorageBehaviour massStorageBehaviour = new MassStorageBehaviour();
        ModVehicleBehaviours.addItemVehicle(MassStorageUnit.templateId, massStorageBehaviour);
        MassStorageUnit.logger.info(this.name + " TemplateID: " + MassStorageUnit.templateId);
    }
    
    public void initCreationEntry() {
        MassStorageUnit.logger.info("initCreationEntry()");
        if (MassStorageUnit.templateId > 0) {
            final AdvancedCreationEntry massStorage = CreationEntryCreator.createAdvancedEntry(10044, 860, 860, MassStorageUnit.templateId, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.STORAGE);
            massStorage.addRequirement(new CreationRequirement(1, 22, 500, true));
            massStorage.addRequirement(new CreationRequirement(2, 23, 200, true));
            massStorage.addRequirement(new CreationRequirement(3, 188, 50, true));
            massStorage.addRequirement(new CreationRequirement(4, 217, 100, true));
        }
    }
    
    static {
        MassStorageUnit.logger = Logger.getLogger(MassStorageUnit.class.getName());
    }
}
