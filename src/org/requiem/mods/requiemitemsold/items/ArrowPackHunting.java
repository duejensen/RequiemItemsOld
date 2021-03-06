package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.MiscConstants;
import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import org.gotti.wurmunlimited.modsupport.ItemTemplateBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class ArrowPackHunting {
	public static Logger logger = Logger.getLogger(ArrowPackHunting.class.getName());
	public static int templateId;
	
	public void createTemplate() throws IOException{
		String name = "hunting arrow pack";
		ItemTemplateBuilder itemBuilder = new ItemTemplateBuilder("requiem.arrowpack.hunting");
		itemBuilder.name(name, "hunting arrow packs", "A pack of arrows, able to be unpacked into a full quiver.");
		itemBuilder.descriptions("excellent", "good", "ok", "poor");
		itemBuilder.itemTypes(new short[]{ // {108, 146, 44, 21, 147, 113} - War Arrow
				ItemTypes.ITEM_TYPE_NAMED,
				ItemTypes.ITEM_TYPE_REPAIRABLE,
				ItemTypes.ITEM_TYPE_WOOD
		});
		itemBuilder.imageNumber((short) 760);
		itemBuilder.behaviourType((short) 1);
		itemBuilder.combatDamage(0);
		itemBuilder.decayTime(Long.MAX_VALUE);
		itemBuilder.dimensions(15, 15, 50);
		itemBuilder.primarySkill(-10);
		itemBuilder.bodySpaces(MiscConstants.EMPTY_BYTE_PRIMITIVE_ARRAY);
		itemBuilder.modelName("model.container.quiver.");
		itemBuilder.difficulty(55.0f);
		itemBuilder.weightGrams(2500);
		itemBuilder.material(Materials.MATERIAL_WOOD_BIRCH);
		itemBuilder.value(1000);
		itemBuilder.isTraded(true);
		
		ItemTemplate template = itemBuilder.build();
		templateId = template.getTemplateId();
		logger.info(name+" TemplateID: "+templateId);
	}
	
	public void initCreationEntry(){
		logger.info("initCreationEntry()");
		if(templateId > 0){
	        AdvancedCreationEntry huntingPack = CreationEntryCreator.createAdvancedEntry(SkillList.GROUP_FLETCHING,
	        		ItemList.quiver, ItemList.arrowHunting, templateId,
	                false, false, 0.0F, true, false, 0, 50.0D, CreationCategories.FLETCHING);
	
	        huntingPack.addRequirement(new CreationRequirement(1, ItemList.arrowHunting, 39, true));
		}
    }
}
