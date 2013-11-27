package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.augite.block.BlockAugiteGrass;
import net.divinerpg.augite.block.BlockAugiteOre;
import net.divinerpg.augite.block.BlockAugitePortal;
import net.divinerpg.azurite.block.BlockAzuriteGrass;
import net.divinerpg.azurite.block.BlockAzuriteOre;
import net.divinerpg.azurite.block.BlockAzuritePortal;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLog;
import net.divinerpg.dravite.block.BlockDraviteGrass;
import net.divinerpg.dravite.block.BlockDraviteOre;
import net.divinerpg.dravite.block.BlockDravitePortal;
import net.divinerpg.dravite.block.DraviteChest;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.config.ConfigHelper;
import net.divinerpg.mythril.block.BlockMythrilGrass;
import net.divinerpg.mythril.block.BlockMythrilOre;
import net.divinerpg.mythril.block.BlockMythrilPortal;
import net.divinerpg.uvite.block.BlockAzuriteVine;
import net.divinerpg.uvite.block.BlockUviteGrass;
import net.divinerpg.uvite.block.BlockUviteOre;
import net.divinerpg.uvite.block.BlockUvitePortal;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightBlockHelper extends HelperBase{

    public static final Block draviteGrass = new BlockDraviteGrass(x.DraviteGrassID).setUnlocalizedName("DraviteGrass").setHardness(15.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block draviteDirt = new ModDirt(x.DraviteDirtID).registerTexture("DraviteGrass_Bottom").setUnlocalizedName("DraviteDirt").setHardness(15.0F).setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block draviteBlock = new ModBlock(x.DraviteBlockID).registerTexture("DraviteBlock").setHardness(8.0F).setUnlocalizedName("DraviteBlock").setCreativeTab(DivineRPG.Blocks);
    public static final Block draviteLog = new ModLog(x.DraviteLogID, "Dravite").setUnlocalizedName("DraviteLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block draviteLeaves = new ModLeaves(x.DraviteLeavesID, "Dravite").registerTexture("DraviteLeaves").setUnlocalizedName("DraviteLeaves").setHardness(4.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final BlockDravitePortal DravitePortal = (BlockDravitePortal) new BlockDravitePortal(x.DravitePortalID).registerTexture("DravitePortal").setUnlocalizedName("DravitePortal").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);

    public static final Block DraviteOre = new BlockDraviteOre(x.DraviteOreID).registerTexture("DraviteOre").setUnlocalizedName("DraviteOre").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block AzuriteGrass = new BlockAzuriteGrass(x.AzuriteGrassID).setHardness(15.0F).setUnlocalizedName("AzuriteGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block AzuriteDirt = new ModDirt(x.AzuriteDirtID).registerTexture("AzuriteGrass_Bottom").setHardness(15.0F).setUnlocalizedName("AzuriteDirt").setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block AzuriteOre = new BlockAzuriteOre(x.AzuriteOreID).registerTexture("AzuriteOre").setHardness(7.0F).setUnlocalizedName("AzuriteOre").setCreativeTab(DivineRPG.Blocks);
    public static final BlockAzuritePortal AzuritePortal = (BlockAzuritePortal) new BlockAzuritePortal(x.AzuritePortalID).registerTexture("AzuritePortal").setUnlocalizedName("AzurPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block azuriteLeaves = new ModLeaves(x.AzuriteLeavesID, "Azurite").registerTexture("AzuriteLeaves").setHardness(5.0F).setUnlocalizedName("AzurLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block AzuriteLog = new ModLog(x.AzuriteLogID, "Azurite").setUnlocalizedName("AzurLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block azuriteVine = new BlockAzuriteVine(x.AzuriteVineID, "Azurite").setUnlocalizedName("AzuriteVine").setHardness(2.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);

    public static final Block azuriteBlock = new ModBlock(x.AzuriteBlockID).registerTexture("AzuriteBlock").setUnlocalizedName("UvitePortalBlock").setHardness(5.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block uviteGrass = new BlockUviteGrass(x.UviteGrassID).setUnlocalizedName("UviteGrass").setHardness(10.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block uviteDirt = new ModDirt(x.UviteDirtID).registerTexture("UviteGrass_Bottom").setUnlocalizedName("UviteDirt").setHardness(10.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block uviteLog = new ModLog(x.UviteLogID, "Uvite").setUnlocalizedName("UviteLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block uviteLeaves = new ModLeaves(x.UviteLeavesID, "Uvite").registerTexture("UviteLeaves").setUnlocalizedName("UviteLeaves").setHardness(4.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final BlockUvitePortal UvitePortal = (BlockUvitePortal) new BlockUvitePortal(x.UvitePortalID).registerTexture("UvitePortal").setUnlocalizedName("UvitePortal").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block UviteOre = new BlockUviteOre(x.UviteOreID).registerTexture("UviteOre").setUnlocalizedName("UviteOre").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);

    public static final Block mythrilBlock = new ModBlock(x.MythrilBlockID).registerTexture("MythrilBlock").setUnlocalizedName("MythrilBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final BlockAugitePortal AugitePortal = (BlockAugitePortal) new BlockAugitePortal(x.AugitePortalID).registerTexture("AugitePortal").setUnlocalizedName("AugPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block AugiteLog = new ModLog(x.AugiteLogID, "Augite").setUnlocalizedName("AugiteLog").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block AugiteLeaves = new ModLeaves(x.AugiteLeavesID, "Augite").registerTexture("AugiteLeaves").setHardness(5.0F).setUnlocalizedName("AugLeaves").setCreativeTab(DivineRPG.Blocks);
    public static final Block AugiteGrass = new BlockAugiteGrass(x.AugiteGrassID).setHardness(15.0F).setUnlocalizedName("AugiteGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block AugiteDirt = new ModDirt(x.AugiteDirtID).registerTexture("AugiteGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("AugiteDirt").setCreativeTab(DivineRPG.Blocks);
    public static final Block augiteBlock = new ModBlock(x.AugiteBlockID).registerTexture("AugiteBlock").setUnlocalizedName("AugiteBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);

    public static final Block uviteBlock = new ModBlock(x.UviteBlockID).registerTexture("UviteBlock").setUnlocalizedName("UviteBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final BlockMythrilPortal MythrilPortal = (BlockMythrilPortal) new BlockMythrilPortal(x.MythrilPortalID).registerTexture("MythrilPortal").setUnlocalizedName("MythPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block MythrilGrass = new BlockMythrilGrass(x.MythrilGrassID).setHardness(15.0F).setUnlocalizedName("MythrilGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block MythrilDirt = new ModDirt(x.MythrilDirtID).registerTexture("MythrilGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("MythrilDirt").setCreativeTab(DivineRPG.Blocks);
    public static final Block MythrilLog = new ModLog(x.MythrilLogID, "Mythril").setUnlocalizedName("MythrilLog").setHardness(7.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block MythrilLeaves = new ModLeaves(x.MythrilLeavesID, "Mythril").registerTexture("MythrilLeaves").setHardness(5.0F).setUnlocalizedName("MythLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);

    public static final Block mythrilOre = new BlockMythrilOre(x.MythrilOreID).registerTexture("MythrilOre").setHardness(7.0F).setUnlocalizedName("MythrilOre").setCreativeTab(DivineRPG.Blocks);
    public static final Block augiteOre = new BlockAugiteOre(x.AugiteOreID).registerTexture("AugiteOre").setHardness(7.0F).setUnlocalizedName("AugiteOre").setCreativeTab(DivineRPG.Blocks);

    //public static final Block draviteChest = new DraviteChest(x.DraviteChestBlockID).registerTexture("DraviteChest").setUnlocalizedName("DC").setCreativeTab(DivineRPG.Blocks);
    //public static final Block uviteRail = new ModBlock(3252).registerTexture("UviteRail").setUnlocalizedName("UR").setCreativeTab(DivineRPG.Blocks);
    public static final Block twilightStone = new ModBlock(x.TwilightStoneID).registerTexture("TwilightStone").setUnlocalizedName("Twilight").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);


    public static void addNames(){
        //addBlock(draviteChest, "Dravite Chest");
       // addBlock(uviteRail, "Uvite Rail");
        addBlock(augiteOre, "Augite Ore");
        addBlock(mythrilOre, "Mythril Ore");
        addBlock(mythrilBlock, "Mythril Block");
        addBlock(AugiteGrass, "Augite Grass");
        addBlock(AugiteDirt, "Augite Dirt");
        addBlock(AugiteLog, "Augite Log");
        addBlock(AugiteLeaves, "Augite Leaves");
        addBlock(AugitePortal, "Augite Portal");

        addBlock(azuriteBlock, "Azurite Block");
        addBlock(MythrilGrass, "Mythril Grass");
        addBlock(MythrilDirt, "Mythril Dirt");
        addBlock(MythrilLog, "Mythril Log");
        addBlock(MythrilLeaves, "Mythril Leaves");
        addBlock(MythrilPortal, "Mythril Portal");
        addBlock(twilightStone, "Twilight Stone");

        addBlock(uviteBlock, "Uvite Block");
        addBlock(AzuriteOre, "Azurite Ore");
        addBlock(DraviteOre, "Dravite Ore");
        addBlock(draviteGrass, "Dravite Grass");
        addBlock(draviteDirt, "Dravite Dirt");
        addBlock(draviteLog, "Dravite Log");
        addBlock(draviteLeaves, "Dravite Leaves");
        addBlock(DravitePortal, "Dravite Portal");

        addBlock(draviteBlock, "Dravite Block");
        addBlock(AzuriteGrass, "Azurite Grass");
        addBlock(AzuriteDirt, "Azurite Dirt");
        addBlock(AzuriteLog, "Azurite Log");
        addBlock(azuriteLeaves, "Azurite Leaves");
        addBlock(AzuritePortal, "Azurite Portal");
        addBlock(AzuriteLog, "Azurite Log");

        addBlock(UviteOre, "Uvite Ore");
        addBlock(azuriteBlock, "Azurite Block");
        addBlock(uviteGrass, "Uvite Grass");
        addBlock(uviteDirt, "Uvite Dirt");
        addBlock(uviteLog, "Uvite Log");
        addBlock(uviteLeaves, "Uvite Leaves");
        addBlock(azuriteVine, "Azurite Vine");
        addBlock(UvitePortal, "Uvite Portal");		
        addBlock(augiteBlock, "Augite Block");

    }
}
