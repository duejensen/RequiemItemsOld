
package org.requiem.mods.requiemitemsold.items.bulk;

import com.wurmonline.server.items.*;
import com.wurmonline.server.skills.SkillList;
import org.requiem.mods.requiemitemsold.configurator.Constants;

import java.util.logging.Logger;

public class RequiemCreationEntries {
    private static final Logger logger = Logger.getLogger(CreationEntryCreator.class.getName());

    public RequiemCreationEntries() {
        long start = System.nanoTime();

        //==========================================================================================================================================
        //========================================================== SIMPLE CREATION ENTRIES =======================================================
        //==========================================================================================================================================

        //==========================================================================================================================================
        //================================================================= PAULDRONS ==============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.shoulderPads1, false, true, 0.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.shoulderPads2, false, true, 0.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, ItemList.shoulderPads3, false, true, 0.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, ItemList.shoulderPads4, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, ItemList.shoulderPads5, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, ItemList.shoulderPads18, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.leather, ItemList.shoulderPads6, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads7, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads19, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads8, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads20, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.goldBar, ItemList.shoulderPads9, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.goldBar, ItemList.shoulderPads21, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads10, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.ironBar, ItemList.shoulderPads22, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_ARMOUR_CHAIN, ItemList.anvilLarge, ItemList.armourChains, ItemList.shoulderPads11, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.fur, ItemList.shoulderPads12, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.fur, ItemList.shoulderPads13, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.nailsIronSmall, ItemList.plank, ItemList.shoulderPads14, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.fur, ItemList.shoulderPads15, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.needleIron, ItemList.fur, ItemList.shoulderPads16, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);
        CreationEntryCreator.createSimpleEntry(SkillList.LEATHERWORKING, ItemList.anvilLarge, ItemList.steelBar, ItemList.shoulderPads17, false, true, 10.0f, false, false, CreationCategories.REQUIEM_PAULDRONS);

        //==========================================================================================================================================
        //================================================================= FLAGS ==================================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blacFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.thecFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.ebonFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.empiFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.zjenFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.kingFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.maceFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.pandFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.valhFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.molrFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.hotsFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.jennFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.eagleFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.frostHavenFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.woodlandFlag, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_FLAGS);

        //==========================================================================================================================================
        //============================================================== TALL BANNERS ==============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.molrBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.hotsBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.jennBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.empiBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.zjenBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blacBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.thecBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.pandBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.dreaBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.ebonBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.therBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.valhBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.maceBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.crossbowBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.crownBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.deerBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.fireBloodBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blackFreeBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.horseSwordBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.horseBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.redHotsBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blackJKBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.lionBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blackMRBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.scorpionBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.skullBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.throwStarBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.winterComBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.woodlandBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.wurmBannerTall, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_TALL_BANNERS);

        //==========================================================================================================================================
        //=================================================================== BANNERS ==============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.molrBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.hotsBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.jennBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.empiBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.zjenBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blacBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.thecBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.pandBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.dreaBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.ebonBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.therBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.valhBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.maceBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.flufBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.frostHavenBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.bloodyAxeBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.burningTreeBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.chainBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.boneBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.spikeBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.murlocBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.hornsBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.gateBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.bloodyMacheteBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.bloodHandBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.blackRedBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.clothYard, ItemList.shaft, Constants.woodlandBanner, true, true, 0.0f, false, false, 10, 35.0, CreationCategories.REQUIEM_BANNERS);

        //==========================================================================================================================================
        //=============================================================== MEDITATION RUGS ==========================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.waterfallMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.orientalMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.squareMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.triangleMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.hornetMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.CthulhuMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.floralMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.roseMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.chineseDragonMedRug, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.blueFloral, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.navyGold , false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.creamRoseOval, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.pinkFloral, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.greenGold, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redWhite, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandgold, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.navyandcream, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.lightblueandwhite, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandgold1, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.blueandwhitefloral, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandwhite2, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandgold2, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandgold3, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redandgold4, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.navyandcream1, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.navyandred, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.greenandgold2, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.creamfloral, false, true, 0.0f, false, false, CreationCategories.REQUIEM_MEDITATION);

        //==========================================================================================================================================
        //================================================================== MISC STUFF ============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.plaque, true, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_BLACKSMITHING, ItemList.anvilLarge, ItemList.ironBar, Constants.metalShaft, false, true, 10.0f, false, false, CreationCategories.REQUIEM_MISCELLANEOUS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_BLACKSMITHING, ItemList.anvilLarge, ItemList.copperBar, Constants.metalShaft, false, true, 10.0f, false, false, CreationCategories.REQUIEM_MISCELLANEOUS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_BLACKSMITHING, ItemList.anvilLarge, ItemList.brassBar, Constants.metalShaft, false, true, 10.0f, false, false, CreationCategories.REQUIEM_MISCELLANEOUS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_BLACKSMITHING, ItemList.anvilLarge, ItemList.steelBar, Constants.metalShaft, false, true, 10.0f, false, false, CreationCategories.REQUIEM_MISCELLANEOUS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_BLACKSMITHING, ItemList.anvilLarge, ItemList.bronzeBar, Constants.metalShaft, false, true, 10.0f, false, false, CreationCategories.REQUIEM_MISCELLANEOUS);

        //==========================================================================================================================================
        //==================================================================== CARPETS =============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet01, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet02, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet03, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet04, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet05, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet06, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet07, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet08, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet09, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpet10, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.ovalCarpet01, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.ovalCarpet02, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetRunner01, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetRunner02, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetRunner03, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetRunner04, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetRunner05, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.carpetWoodland, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CARPETS).setDepleteFromTarget(3000);

        //==========================================================================================================================================
        //==================================================================== CURTAINS ============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.curtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redFlowersCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.kingCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.melodyCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.nightDreamsCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.passionCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.petalsCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.zebraCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.championCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.greenVelvetCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redFancyCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.creamCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.purpleNatureCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.greenCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.blueTasseledCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.redTasseledCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.greenFancyCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.blackPatternCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.camouflageCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.loom, ItemList.clothString, Constants.woodlandCurtain, false, true, 0.0f, false, false, 0, 20.0, CreationCategories.REQUIEM_CURTAINS).setDepleteFromTarget(3000);

        //==========================================================================================================================================
        //============================================================ TAXIDERMY - GROOMING ========================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedBlackBearHead, Constants.groomedBlackBearHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedBrownBearHead, Constants.groomedBrownBearHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedBisonHead, Constants.groomedBisonHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedStagHead, Constants.groomedStagHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedWildcatHead, Constants.groomedWildcatHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedHellhoundHead, Constants.groomedHellhoundHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedLionHead, Constants.groomedLionHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedHyenaHead, Constants.groomedHyenaHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedBoarHead, Constants.groomedBoarHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedWolfHead, Constants.groomedWolfHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedWorgHead, Constants.groomedWorgHead, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);
        CreationEntryCreator.createSimpleEntry(SkillList.GROOMING, ItemList.groomingBrush, Constants.tannedblackBearBody, Constants.groomedblackBearBody, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TAXIDERMY);

        //==========================================================================================================================================
        //=================================================================== TABARDS ==============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.jennTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.jennTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.zjenTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.zjenTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.dreaTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.dreaTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.pandTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.pandTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.thecTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.thecTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.therTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.therTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.hotsTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.hotsTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.abaTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.abaTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.blacTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.blacTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.ebonTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.ebonTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.molrTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.molrTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.empiTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.empiTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.kingTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.kingTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.valhTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.valhTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.maceTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.maceTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.wurmTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.wurmTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.requTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.requTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.phoeTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.phoeTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.foreTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.foreTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.woodlandTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.woodlandTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        //CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.3271, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        //CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.3271, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleIron, ItemList.clothYard, Constants.yvalTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        CreationEntryCreator.createSimpleEntry(SkillList.CLOTHTAILORING, ItemList.needleCopper, ItemList.clothYard, Constants.yvalTabard, false, true, 0.0f, false, false, CreationCategories.REQUIEM_TABARDS);
        //==========================================================================================================================================
        //================================================================ BOWL ALTARS =============================================================
        //==========================================================================================================================================

        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.goldBar, Constants.bowlAltar, false, true, 10.0f, false, false, CreationCategories.REQUIEM_ALTARS);
        CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.silverBar, Constants.bowlAltar, false, true, 10.0f, false, false, CreationCategories.REQUIEM_ALTARS);

        //==========================================================================================================================================
        //========================================================== ADVANCED CREATION ENTRIES =====================================================
        //==========================================================================================================================================


        //==========================================================================================================================================
        //================================================================ ATARS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry libilasAltar = CreationEntryCreator.createAdvancedEntry(SkillList.LEATHERWORKING, ItemList.meat, 379, Constants.altarLibila, false, false, 0.0f, true, true, CreationCategories.REQUIEM_ALTARS);
        libilasAltar.addRequirement(new CreationRequirement(1, ItemList.meat, 449, true));
        libilasAltar.addRequirement(new CreationRequirement(2, ItemList.heart, 10, true));
        libilasAltar.addRequirement(new CreationRequirement(3, ItemList.metalWires, 20, true));
        libilasAltar.addRequirement(new CreationRequirement(4, ItemList.scythe, 1, true));
        libilasAltar.addRequirement(new CreationRequirement(5, ItemList.corpse, 10, true));
        libilasAltar.addRequirement(new CreationRequirement(6, ItemList.glimmerSteelBar, 15, true));
        libilasAltar.addRequirement(new CreationRequirement(7, ItemList.spearSteel, 4, true));
        libilasAltar.setIsEpicBuildMissionTarget(false);
        final AdvancedCreationEntry altarOfThreeJubaroo = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.marbleBrick, ItemList.mortar, Constants.blessedAltar, false, false, 0.0f, true, true, CreationCategories.REQUIEM_ALTARS);
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(1, ItemList.mortar, 449, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(2, ItemList.marbleBrick, 449, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(3, ItemList.marbleSlab, 50, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(4, ItemList.sourceCrystal, 10, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(5, ItemList.diamondStar, 1, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(6, ItemList.silverBar, 5, true));
        altarOfThreeJubaroo.addRequirement(new CreationRequirement(7, ItemList.goldBar, 5, true));
        altarOfThreeJubaroo.setIsEpicBuildMissionTarget(false);
        final AdvancedCreationEntry sourceAltar = CreationEntryCreator.createAdvancedEntry(SkillList.CHANNELING, ItemList.sourceCrystal, ItemList.dirtPile, Constants.sourceAltar, false, false, 0.0f, true, true, CreationCategories.REQUIEM_ALTARS);
        sourceAltar.addRequirement(new CreationRequirement(1, ItemList.sourceCrystal, 29, true));
        sourceAltar.addRequirement(new CreationRequirement(2, ItemList.dirtPile, 24, true));
        sourceAltar.addRequirement(new CreationRequirement(3, ItemList.seryllBar, 20, true));
        sourceAltar.addRequirement(new CreationRequirement(4, ItemList.blood, 1, true));
        sourceAltar.addRequirement(new CreationRequirement(5, ItemList.concrete, 80, true));
        sourceAltar.addRequirement(new CreationRequirement(6, ItemList.heart, 10, true));
        sourceAltar.setIsEpicBuildMissionTarget(false);
        final CreationEntry copperBowlAltar = CreationEntryCreator.createSimpleEntry(SkillList.SMITHING_GOLDSMITHING, ItemList.anvilLarge, ItemList.copperBar, Constants.bowlAltarCopper, false, true, 100.0f, false, false, CreationCategories.REQUIEM_ALTARS);
        copperBowlAltar.setDepleteFromTarget(3000);

        //==========================================================================================================================================
        //=============================================================== TOWERS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry towerStoneFreedom = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.stoneBrick, ItemList.clay, ItemList.guardTowerFreedom, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TOWERS);
        towerStoneFreedom.addRequirement(new CreationRequirement(1, ItemList.stoneBrick, 500, true));
        towerStoneFreedom.addRequirement(new CreationRequirement(2, ItemList.clay, 500, true));
        towerStoneFreedom.addRequirement(new CreationRequirement(3, ItemList.plank, ItemList.nailsIronLarge, true));
        final AdvancedCreationEntry towerStoneHotS = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.stoneBrick, ItemList.clay, ItemList.guardTowerHots, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TOWERS);
        towerStoneHotS.addRequirement(new CreationRequirement(1, ItemList.stoneBrick, 500, true));
        towerStoneHotS.addRequirement(new CreationRequirement(2, ItemList.clay, 500, true));
        towerStoneHotS.addRequirement(new CreationRequirement(3, ItemList.plank, 100, true));
        final AdvancedCreationEntry towerStoneMR = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.stoneBrick, ItemList.clay, ItemList.guardTowerMol, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TOWERS);
        towerStoneMR.addRequirement(new CreationRequirement(1, ItemList.stoneBrick, 500, true));
        towerStoneMR.addRequirement(new CreationRequirement(2, ItemList.clay, 500, true));
        towerStoneMR.addRequirement(new CreationRequirement(3, ItemList.plank, 100, true));
        final AdvancedCreationEntry guardTowerJenn = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.stoneBrick, ItemList.clay, ItemList.guardTower, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TOWERS);
        guardTowerJenn.addRequirement(new CreationRequirement(1, ItemList.stoneBrick, 500, true));
        guardTowerJenn.addRequirement(new CreationRequirement(2, ItemList.clay, 500, true));
        guardTowerJenn.addRequirement(new CreationRequirement(3, ItemList.plank, 100, true));

        //==========================================================================================================================================
        //================================================================ TENTS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry empireTent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.empiTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        empireTent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        empireTent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        empireTent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        empireTent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry thecTent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.thecTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        thecTent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        thecTent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        thecTent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        thecTent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry pandTent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.pandTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        pandTent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        pandTent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        pandTent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        pandTent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry dreaTent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.dreaTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        dreaTent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        dreaTent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        dreaTent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        dreaTent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry hots_military_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.hotsTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        hots_military_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        hots_military_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        hots_military_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        hots_military_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry jk_military_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.jennTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        jk_military_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        jk_military_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        jk_military_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        jk_military_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry mr_military_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.molrTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        mr_military_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        mr_military_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 12, true));
        mr_military_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        mr_military_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry hots_pavilion_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.hotsPavilion, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        hots_pavilion_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        hots_pavilion_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 6, true));
        hots_pavilion_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        hots_pavilion_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry jk_pavilion_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.jennPavilion, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        jk_pavilion_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        jk_pavilion_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 6, true));
        jk_pavilion_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        jk_pavilion_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry mr_pavilion_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.molrPavilion, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        mr_pavilion_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        mr_pavilion_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 6, true));
        mr_pavilion_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        mr_pavilion_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));
        final AdvancedCreationEntry woodland_military_tent = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.shaft, ItemList.clothYard, Constants.woodlandTent, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TENTS);
        woodland_military_tent.addRequirement(new CreationRequirement(1, ItemList.shaft, 10, true));
        woodland_military_tent.addRequirement(new CreationRequirement(2, ItemList.clothYard, 6, true));
        woodland_military_tent.addRequirement(new CreationRequirement(3, ItemList.ropeThin, 10, true));
        woodland_military_tent.addRequirement(new CreationRequirement(4, ItemList.pegWood, 10, true));

        //==========================================================================================================================================
        //================================================================ MASKS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry skullMask = CreationEntryCreator.createAdvancedEntry(SkillList.LEATHERWORKING, ItemList.beltLeather, ItemList.skull, Constants.skullMask, false, false, 0.0f, true, true, CreationCategories.REQUIEM_CLOTHING);
        skullMask.addRequirement(new CreationRequirement(1, ItemList.leather, 2, true));
        skullMask.addRequirement(new CreationRequirement(2, ItemList.metalRivet, 1, true));

        //==========================================================================================================================================
        //================================================================ SIGNS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry requiemSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.RequiemSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        requiemSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        requiemSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry enterSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.enterSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        enterSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        enterSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry exitSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.exitSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        exitSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        exitSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry dangerSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.dangerSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        dangerSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        dangerSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry TwilightSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.TwilightSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        TwilightSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        TwilightSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry ArkonikaSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.ArkonikaSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        ArkonikaSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        ArkonikaSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry DarkSideSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.DarkSideSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        DarkSideSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        DarkSideSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry SpringtonSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.SpringtonSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        SpringtonSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        SpringtonSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry Yggdrasil = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.YggdrasilSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        Yggdrasil.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        Yggdrasil.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry StartSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.startSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        StartSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        StartSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry FinishSign = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.finishSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        FinishSign.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        FinishSign.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));
        final AdvancedCreationEntry MineEntrance = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.mineEntranceSign, false, false, 0.0f, true, false, CreationCategories.REQUIEM_SIGNS);
        MineEntrance.addRequirement(new CreationRequirement(1, ItemList.shaft, 4, true));
        MineEntrance.addRequirement(new CreationRequirement(2, ItemList.plank, 8, true));

        //==========================================================================================================================================
        //============================================================ TAPESTRIES ==================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry blueNecroTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3751, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        blueNecroTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        blueNecroTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry blueWizardTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3752, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        blueWizardTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        blueWizardTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry cryptWizardTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3753, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        cryptWizardTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        cryptWizardTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry darkWizardTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3754, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        darkWizardTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        darkWizardTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry treeDragonTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3755, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        treeDragonTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        treeDragonTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry fireDemonTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3756, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        fireDemonTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        fireDemonTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry townTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3757, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        townTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        townTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry waterfallTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3758, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        waterfallTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        waterfallTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry lichTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3759, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        lichTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        lichTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry nordWarriorTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3760, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        nordWarriorTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        nordWarriorTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry phoenixTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3761, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        phoenixTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        phoenixTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry seaSerpentTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3762, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        seaSerpentTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        seaSerpentTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry sealTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3763, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        sealTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        sealTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry trollKingTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3764, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        trollKingTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        trollKingTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry wizardDragTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3765, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        wizardDragTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        wizardDragTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry fourGodsTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3766, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        fourGodsTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        fourGodsTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry foTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3767, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        foTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        foTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry magTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3768, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        magTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        magTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry libilaTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3769, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        libilaTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        libilaTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry vynoraTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3770, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        vynoraTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        vynoraTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry battleTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3771, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        battleTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        battleTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry psychedelicTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3772, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        psychedelicTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        psychedelicTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry mushHouseTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3773, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        mushHouseTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        mushHouseTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry threeCrownsTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3774, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        threeCrownsTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        threeCrownsTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry wurm1Tapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3775, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        wurm1Tapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        wurm1Tapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry wurm2Tapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3776, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        wurm2Tapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        wurm2Tapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry wurm3Tapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3777, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        wurm3Tapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        wurm3Tapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry hastingsTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3778, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        hastingsTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        hastingsTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry bayeuxTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3779, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        bayeuxTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        bayeuxTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry bloodWitchTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3780, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        bloodWitchTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        bloodWitchTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry calmForestTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3781, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        calmForestTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        calmForestTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry crowWitchTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3782, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        crowWitchTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        crowWitchTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry deathAngelTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3783, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        deathAngelTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        deathAngelTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry dragonElfTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3784, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        dragonElfTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        dragonElfTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry dragonFightTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3785, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        dragonFightTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        dragonFightTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry fireDragonWitchTap = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3786, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        fireDragonWitchTap.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        fireDragonWitchTap.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry joyLifeTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3787, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        joyLifeTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        joyLifeTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry lifeRichesTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3788, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        lifeRichesTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        lifeRichesTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry nightSkyTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3789, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        nightSkyTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        nightSkyTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry paladinTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3790, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        paladinTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        paladinTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry reaperTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3791, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        reaperTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        reaperTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry sweetDreamsTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3792, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        sweetDreamsTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        sweetDreamsTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry graveWitchTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3793, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        graveWitchTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        graveWitchTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry ladyUnicornTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3794, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        ladyUnicornTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        ladyUnicornTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry knightChampTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3795, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        knightChampTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        knightChampTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry battle2Tapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3796, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        battle2Tapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        battle2Tapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));
        final AdvancedCreationEntry whiteKnightTapestry = CreationEntryCreator.createAdvancedEntry(SkillList.CLOTHTAILORING, ItemList.clothYardWool, ItemList.tapestryStand, 3797, false, false, 0.0f, true, true, CreationCategories.REQUIEM_TAPESTRY);
        whiteKnightTapestry.addRequirement(new CreationRequirement(1, ItemList.clothYardWool, 7, true));
        whiteKnightTapestry.addRequirement(new CreationRequirement(2, ItemList.woolYarn, 2, true));

        //==========================================================================================================================================
        //=============================================================== CHAIRS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry blackRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.blackRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        blackRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        blackRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        blackRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        blackRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        blackRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry blueRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.blueRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        blueRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        blueRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        blueRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        blueRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        blueRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry greenRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.greenRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        greenRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        greenRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        greenRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        greenRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        greenRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry greyRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.greyRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        greyRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        greyRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        greyRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        greyRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        greyRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry purpleRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.purpleRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        purpleRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        purpleRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        purpleRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        purpleRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        purpleRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry redRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.redRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        redRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        redRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        redRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        redRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        redRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry yellowRoyalLoungeChaise = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.plank, ItemList.shaft, Constants.yellowRoyalChaise, false, false, 0.0f, true, true, 0, 70.0, CreationCategories.REQUIEM_FURNITURE);
        yellowRoyalLoungeChaise.addRequirement(new CreationRequirement(1, ItemList.plank, 4, true));
        yellowRoyalLoungeChaise.addRequirement(new CreationRequirement(2, ItemList.shaft, 1, true));
        yellowRoyalLoungeChaise.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        yellowRoyalLoungeChaise.addRequirement(new CreationRequirement(4, ItemList.clothYardWool, 10, true));
        yellowRoyalLoungeChaise.addRequirement(new CreationRequirement(5, ItemList.woolYarn, 4, true));
        final AdvancedCreationEntry blackFineHighChair = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.blackHighChair, false, false, 0.0f, true, true, 0, 60.0, CreationCategories.REQUIEM_FURNITURE);
        blackFineHighChair.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        blackFineHighChair.addRequirement(new CreationRequirement(2, ItemList.clothYard, 2, true));
        blackFineHighChair.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 1, true));
        final AdvancedCreationEntry blueFineHighChair = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.blueHighChair, false, false, 0.0f, true, true, 0, 60.0, CreationCategories.REQUIEM_FURNITURE);
        blueFineHighChair.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        blueFineHighChair.addRequirement(new CreationRequirement(2, ItemList.clothYard, 2, true));
        blueFineHighChair.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 1, true));
        final AdvancedCreationEntry greenFineHighChair = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.greenHighChair, false, false, 0.0f, true, true, 0, 60.0, CreationCategories.REQUIEM_FURNITURE);
        greenFineHighChair.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        greenFineHighChair.addRequirement(new CreationRequirement(2, ItemList.clothYard, 2, true));
        greenFineHighChair.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 1, true));
        final AdvancedCreationEntry greyFineHighChair = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.greyHighChair, false, false, 0.0f, true, true, 0, 60.0, CreationCategories.REQUIEM_FURNITURE);
        greyFineHighChair.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        greyFineHighChair.addRequirement(new CreationRequirement(2, ItemList.clothYard, 2, true));
        greyFineHighChair.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 1, true));
        final AdvancedCreationEntry yellowFineHighChair = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.yellowHighChair, false, false, 0.0f, true, true, 0, 60.0, CreationCategories.REQUIEM_FURNITURE);
        yellowFineHighChair.addRequirement(new CreationRequirement(1, ItemList.plank, 2, true));
        yellowFineHighChair.addRequirement(new CreationRequirement(2, ItemList.clothYard, 2, true));
        yellowFineHighChair.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 1, true));

        //==========================================================================================================================================
        //============================================================= STRUCTURES =================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry darkPylon = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, 406, ItemList.clay, Constants.darkPylon, false, false, 0.0f, true, true, CreationCategories.REQUIEM_MISCELLANEOUS);
        darkPylon.addRequirement(new CreationRequirement(1, ItemList.slateShard, 9, true));
        darkPylon.addRequirement(new CreationRequirement(2, ItemList.clay, 499, true));
        darkPylon.addRequirement(new CreationRequirement(3, ItemList.slateBrick, 500, true));
        darkPylon.addRequirement(new CreationRequirement(4, ItemList.goldBar, 50, true));

        //==========================================================================================================================================
        //================================================================= BEDS ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry coffinBed = CreationEntryCreator.createAdvancedEntry(SkillList.MASONRY, ItemList.fur, ItemList.stoneCoffin, Constants.coffinBed, false, false, 0.0f, true, true, CreationCategories.REQUIEM_BEDS);
        coffinBed.addRequirement(new CreationRequirement(1, ItemList.sheet, 3, true));
        coffinBed.addRequirement(new CreationRequirement(2, ItemList.fur, 2, true));
        coffinBed.addRequirement(new CreationRequirement(3, ItemList.nailsIronLarge, 4, true));
        final AdvancedCreationEntry canopyBedFlowersRed = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedFlowersRed, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedFlowersRed.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedFlowersRed.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedFlowersRed.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedFlowersRed.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedFlowersRed.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedFlowersRed.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedKing = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedKing, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedKing.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedKing.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedKing.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedKing.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedKing.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedKing.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedMelody = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedMelody, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedMelody.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedMelody.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedMelody.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedMelody.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedMelody.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedMelody.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedNightDreams = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedNightDreams, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedNightDreams.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedNightDreams.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedNightDreams.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedNightDreams.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedNightDreams.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedNightDreams.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedPassion = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedPassion, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedPassion.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedPassion.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedPassion.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedPassion.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedPassion.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedPassion.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedPetals = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedPetals, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedPetals.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedPetals.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedPetals.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedPetals.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedPetals.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedPetals.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBedZebra = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBedZebra, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBedZebra.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBedZebra.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBedZebra.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBedZebra.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBedZebra.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBedZebra.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2 = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2FlowersRed = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2FlowersRed, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2FlowersRed.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2King = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2King, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2King.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2King.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2King.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2King.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2King.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2King.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2Melody = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2Melody, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2Melody.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2Melody.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2Melody.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2Melody.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2Melody.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2Melody.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2NightDreams = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2NightDreams, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2NightDreams.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2NightDreams.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2NightDreams.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2NightDreams.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2NightDreams.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2NightDreams.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2Passion = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2Passion, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2Passion.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2Passion.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2Passion.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2Passion.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2Passion.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2Passion.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2Petals = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2Petals, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2Petals.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2Petals.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2Petals.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2Petals.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2Petals.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2Petals.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry canopyBed2Zebra = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.canopyBed2Zebra, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        canopyBed2Zebra.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        canopyBed2Zebra.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        canopyBed2Zebra.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        canopyBed2Zebra.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        canopyBed2Zebra.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        canopyBed2Zebra.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBed = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBed, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBed.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBed.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBed.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBed.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBed.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBed.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedFlowersRed = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedFlowersRed, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedFlowersRed.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedFlowersRed.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedFlowersRed.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedFlowersRed.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedFlowersRed.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedFlowersRed.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedKing = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedKing, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedKing.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedKing.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedKing.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedKing.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedKing.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedKing.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedMelody = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedMelody, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedMelody.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedMelody.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedMelody.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedMelody.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedMelody.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedMelody.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedNightDreams = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedNightDreams, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedNightDreams.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedNightDreams.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedNightDreams.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedNightDreams.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedNightDreams.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedNightDreams.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedPassion = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedPassion, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedPassion.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedPassion.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedPassion.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedPassion.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedPassion.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedPassion.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedPetals = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedPetals, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedPetals.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedPetals.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedPetals.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedPetals.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedPetals.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedPetals.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry largeBedZebra = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.bedHeadboard, ItemList.bedFrame, Constants.largeBedZebra, false, false, 0.0f, true, true, 0, 65.0, CreationCategories.REQUIEM_BEDS);
        largeBedZebra.addRequirement(new CreationRequirement(1, ItemList.bedFootboard, 1, true));
        largeBedZebra.addRequirement(new CreationRequirement(2, ItemList.plank, 10, true));
        largeBedZebra.addRequirement(new CreationRequirement(3, ItemList.sheet, 8, true));
        largeBedZebra.addRequirement(new CreationRequirement(4, ItemList.fur, 8, true));
        largeBedZebra.addRequirement(new CreationRequirement(5, ItemList.nailsIronLarge, 2, true));
        largeBedZebra.addRequirement(new CreationRequirement(6, ItemList.nailsIronSmall, 2, true));

        //==========================================================================================================================================
        //=============================================================== TABLES ===================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry dinnerTableFine = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.shaft, ItemList.plank, Constants.dinnerTableFine, false, false, 0.0f, true, true, CreationCategories.REQUIEM_FURNITURE);
        dinnerTableFine.addRequirement(new CreationRequirement(1, ItemList.plank, 10, true));
        dinnerTableFine.addRequirement(new CreationRequirement(2, ItemList.shaft, 3, true));
        dinnerTableFine.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 8, true));
        final AdvancedCreationEntry recMarbleTableLong = CreationEntryCreator.createAdvancedEntry(10074, ItemList.marbleSlab, ItemList.clay, Constants.recMarbleTableLong, false, false, 0.0f, true, true, 0, 50.0, CreationCategories.REQUIEM_FURNITURE);
        recMarbleTableLong.addRequirement(new CreationRequirement(1, ItemList.marbleSlab, 2, true));
        recMarbleTableLong.addRequirement(new CreationRequirement(2, ItemList.clay, 5, true));

        //==========================================================================================================================================
        //============================================================== PICTURES ==================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry pictureNature = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureNature, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureNature.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureNature.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureNature.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureClaude = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureClaude, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureClaude.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureClaude.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureClaude.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureDeer = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureDeer, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureDeer.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureDeer.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureDeer.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry picturePeasants = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.picturePeasants, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        picturePeasants.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        picturePeasants.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        picturePeasants.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureShepherd = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureShepherd, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureShepherd.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureShepherd.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureShepherd.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureSnowdrift = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureSnowdrift, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureSnowdrift.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureSnowdrift.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureSnowdrift.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureStream = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureStream, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureStream.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureStream.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureStream.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureTime = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureTime, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureTime.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureTime.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureTime.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));
        final AdvancedCreationEntry pictureValley = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronSmall, ItemList.plank, Constants.pictureValley, false, false, 0.0f, true, false, 0, 35.0, CreationCategories.REQUIEM_DECORATIONS);
        pictureValley.addRequirement(new CreationRequirement(1, ItemList.plank, 7, true));
        pictureValley.addRequirement(new CreationRequirement(2, ItemList.nailsIronSmall, 3, true));
        pictureValley.addRequirement(new CreationRequirement(3, ItemList.reedFibre, 5, true));

        //==========================================================================================================================================
        //============================================================== FURNITURE =================================================================
        //==========================================================================================================================================

        final AdvancedCreationEntry dresser = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronLarge, ItemList.plank, Constants.dresser, false, false, 0.0f, true, true, 0, 55.0, CreationCategories.REQUIEM_FURNITURE);
        dresser.addRequirement(new CreationRequirement(1, ItemList.plank, 11, true));
        dresser.addRequirement(new CreationRequirement(2, ItemList.shaft, 4, true));
        dresser.addRequirement(new CreationRequirement(3, ItemList.nailsIronLarge, 3, true));
        dresser.addRequirement(new CreationRequirement(4, ItemList.nailsIronSmall, 2, true));
        final AdvancedCreationEntry lowerCabinet = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronLarge, ItemList.plank, Constants.lowerCabinet, false, false, 0.0f, true, true, 0, 55.0, CreationCategories.REQUIEM_FURNITURE);
        lowerCabinet.addRequirement(new CreationRequirement(1, ItemList.plank, 12, true));
        lowerCabinet.addRequirement(new CreationRequirement(2, ItemList.shaft, 4, true));
        lowerCabinet.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 6, true));
        final AdvancedCreationEntry upperCabinet = CreationEntryCreator.createAdvancedEntry(SkillList.CARPENTRY_FINE, ItemList.nailsIronLarge, ItemList.plank, Constants.upperCabinet, false, false, 0.0f, true, true, 0, 55.0, CreationCategories.REQUIEM_FURNITURE);
        upperCabinet.addRequirement(new CreationRequirement(1, ItemList.plank, 6, true));
        upperCabinet.addRequirement(new CreationRequirement(2, ItemList.shaft, 2, true));
        upperCabinet.addRequirement(new CreationRequirement(3, ItemList.nailsIronSmall, 3, true));

        //==========================================================================================================================================
        //============================================================= TAXIDERMY ==================================================================
        //==========================================================================================================================================

        //============================================================= TANNING ==================================================================
        final AdvancedCreationEntry tannedBlackBearHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.blackBearHead, Constants.tannedBlackBearHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedBlackBearHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedBrownBearHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.brownBearHead, Constants.tannedBrownBearHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedBrownBearHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedBisonHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.bisonHead, Constants.tannedBisonHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedBisonHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedStagHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.stagHead, Constants.tannedStagHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedStagHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedWildcatHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.wildcatHead, Constants.tannedWildcatHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedWildcatHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedHellhoundHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.hellhoundHead, Constants.tannedHellhoundHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedHellhoundHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedLionHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.lionHead, Constants.tannedLionHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedLionHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedHyenaHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.hyenaHead, Constants.tannedHyenaHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedHyenaHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedBoarHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.boarHead, Constants.tannedBoarHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedBoarHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedWolfHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.wolfHead, Constants.tannedWolfHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedWolfHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedWorgHead = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.worgHead, Constants.tannedWorgHead, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedWorgHead.addRequirement(new CreationRequirement(2, ItemList.lye, 10, true));
        final AdvancedCreationEntry tannedBlackBearBody = CreationEntryCreator.createAdvancedEntry(SkillList.TANNING, ItemList.lye, Constants.blackBearBody, Constants.tannedblackBearBody, true, false, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        tannedBlackBearBody.addRequirement(new CreationRequirement(2, ItemList.lye, 30, true));
        //============================================================= STUFFING ==================================================================
        final AdvancedCreationEntry stuffedBlackBearHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedBlackBearHead, Constants.stuffedBlackBearHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedBlackBearHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedBlackBearHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedBlackBearHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedBlackBearHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedBlackBearHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedBrownBearHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedBrownBearHead, Constants.stuffedBrownBearHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedBrownBearHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedBrownBearHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedBrownBearHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedBrownBearHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedBrownBearHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedBisonHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedBisonHead, Constants.stuffedBisonHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedBisonHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedBisonHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedBisonHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedBisonHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedBisonHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedStagHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedStagHead, Constants.stuffedStagHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedStagHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedStagHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedStagHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedStagHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedStagHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedWildcatHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedWildcatHead, Constants.stuffedWildcatHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedWildcatHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedWildcatHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedWildcatHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedWildcatHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedWildcatHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedHellhoundHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedHellhoundHead, Constants.stuffedHellhoundHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedHellhoundHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedHellhoundHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedHellhoundHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedHellhoundHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedHellhoundHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedLionHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedLionHead, Constants.stuffedLionHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedLionHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedLionHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedLionHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedLionHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedLionHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedHyenaHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedHyenaHead, Constants.stuffedHyenaHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedHyenaHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedHyenaHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedHyenaHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedHyenaHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedHyenaHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedBoarHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedBoarHead, Constants.stuffedBoarHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedBoarHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedBoarHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedBoarHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedBoarHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedBoarHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedWolfHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedWolfHead, Constants.stuffedWolfHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedWolfHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedWolfHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedWolfHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedWolfHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedWolfHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedWorgHead = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedWorgHead, Constants.stuffedWorgHead, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedWorgHead.addRequirement(new CreationRequirement(2, ItemList.cotton, 30, true));
        stuffedWorgHead.addRequirement(new CreationRequirement(3, ItemList.wool, 20, true));
        stuffedWorgHead.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedWorgHead.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedWorgHead.addRequirement(new CreationRequirement(6, ItemList.tooth, 10, true));
        final AdvancedCreationEntry stuffedBlackBear = CreationEntryCreator.createAdvancedEntry(SkillList.STUFFING, ItemList.cotton, Constants.groomedblackBearBody, Constants.stuffedblackBearBody, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stuffedBlackBear.addRequirement(new CreationRequirement(2, ItemList.cotton, 80, true));
        stuffedBlackBear.addRequirement(new CreationRequirement(3, ItemList.wool, 40, true));
        stuffedBlackBear.addRequirement(new CreationRequirement(4, ItemList.eye, 2, true));
        stuffedBlackBear.addRequirement(new CreationRequirement(5, ItemList.clothString, 10, true));
        stuffedBlackBear.addRequirement(new CreationRequirement(6, ItemList.tooth, 15, true));
        stuffedBlackBear.addRequirement(new CreationRequirement(7, Constants.glue, 10, true));
        //============================================================= MOUNTING ==================================================================
        final AdvancedCreationEntry blackBearHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedBlackBearHead, 4775, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        blackBearHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        blackBearHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry brownBearHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedBrownBearHead, 4776, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        brownBearHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        brownBearHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry bisonHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedBisonHead, 4777, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        bisonHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        bisonHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry stagHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedStagHead, 4778, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        stagHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        stagHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry wildcatHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedWildcatHead, 4779, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        wildcatHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        wildcatHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry hellhoundHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedHellhoundHead, 4780, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        hellhoundHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        hellhoundHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry lionHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedLionHead, 4781, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        lionHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        lionHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry hyenaHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedHyenaHead, 4782, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        hyenaHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        hyenaHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry boarHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedBoarHead, 4783, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        boarHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        boarHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry wolfHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedWolfHead, 4784, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        wolfHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        wolfHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry worgHeadTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.plaque, Constants.stuffedWorgHead, 4785, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        worgHeadTrophy.addRequirement(new CreationRequirement(1, ItemList.nailsIronSmall, 8, true));
        worgHeadTrophy.addRequirement(new CreationRequirement(2, ItemList.plank, 5, true));
        final AdvancedCreationEntry blackBearTrophy = CreationEntryCreator.createAdvancedEntry(SkillList.MOUNTING, Constants.metalShaft, Constants.stuffedblackBearBody, 4786, true, true, 0.0f, true, false, CreationCategories.REQUIEM_TAXIDERMY);
        blackBearTrophy.addRequirement(new CreationRequirement(1, Constants.metalShaft, 2, true));
        blackBearTrophy.addRequirement(new CreationRequirement(2, ItemList.nailsIronLarge, 6, true));
        blackBearTrophy.addRequirement(new CreationRequirement(3, Constants.glue, 12, true));
        logger.info("Initialising the CreationEntries took " + (float)(System.nanoTime() - start) / 1000000.0F + " millis.");
    }
}
