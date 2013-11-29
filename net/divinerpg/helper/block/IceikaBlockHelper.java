package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockDivineSpawner;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLog;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.config.ConfigHelper;
import net.divinerpg.iceika.block.BlockCoalStoneFurnace;
import net.divinerpg.iceika.block.BlockColoredGlass;
import net.divinerpg.iceika.block.BlockIceChest;
import net.divinerpg.iceika.block.BlockIceDoor;
import net.divinerpg.iceika.block.BlockIceGrass;
import net.divinerpg.iceika.block.BlockIceikaPortal;
import net.divinerpg.iceika.block.IceLeaves;
import net.divinerpg.iceika.block.IceikaSapling;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IceikaBlockHelper extends HelperBase{

    public static final BlockIceikaPortal IceikaPortal = (BlockIceikaPortal) new BlockIceikaPortal(x.IceikaPortalID).registerTexture("IceikaPortal").setUnlocalizedName("IcePor").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block IceLog = new ModLog(x.IceLogID, "Ice").setUnlocalizedName("IceLog").setHardness(7.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceLeaves = new IceLeaves(x.IceLeavesID, "Ice").registerTexture("IceLeaves").setHardness(5.0F).setUnlocalizedName("IceLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceGrass = new BlockIceGrass(x.IceGrassID).setHardness(15.0F).setUnlocalizedName("IceGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceDirt = new ModDirt(x.IceDirtID).registerTexture("IceGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("IceDirt").setCreativeTab(DivineRPG.Blocks);
    public static final Block icyStone = new ModBlock(x.IceStoneID).registerTexture("IcyStone").setHardness(7.0F).setUnlocalizedName("IcyStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstone = new ModBlock(x.CoalStoneID).registerTexture("CoalStone").setHardness(5.0F).setUnlocalizedName("CoalStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block workshopLamp = new ModBlock(x.WorkLampID).registerTexture("WorkShopLamp").setHardness(5.0F).setUnlocalizedName("WorkLamp").setLightValue(1.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block snowyBricks = new ModBlock(x.SnowBrickID).registerTexture("SnowyBrick").setHardness(9.0F).setUnlocalizedName("SnowBrick").setCreativeTab(DivineRPG.Blocks);
    public static final Block icyBricks = new ModBlock(x.IceBrickID).registerTexture("IcyBrick").setBlockUnbreakable().setUnlocalizedName("IceBrick").setCreativeTab(DivineRPG.Blocks);
    public static final Block workshopBookcase = new ModBlock(x.WorkBookcaseID).registerTexture("WorkshopBookcase").setUnlocalizedName("BookCase").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedGlass = new BlockColoredGlass(x.FrostGlassID).registerTexture("FrostedGlass").setHardness(4.0F).setUnlocalizedName("FrostGlass").setStepSound(Block.soundGlassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstoneFurnace = new BlockCoalStoneFurnace(x.CoalstoneFurnaceID, false).registerTexture("CoalStoneFurnace_Front_Off").setUnlocalizedName("CoalFurnace").setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedChest = new BlockIceChest(x.FrostChestID).setUnlocalizedName("FC").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedStone = new ModBlock(x.FrostStoneID).registerTexture("FrostedStone").setUnlocalizedName("IceS").setHardness(8.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block rolumSpawner = new BlockDivineSpawner(x.RolumSpawnerID, "Rollum").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("Rolum").setCreativeTab(DivineRPG.Spawn);
    public static final Block glacideSpawner = new BlockDivineSpawner(x.GlacideSpawnerID, "Glacide").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("GSpawner").setCreativeTab(DivineRPG.Spawn);
    public static final Block workshopCarpet = new ModBlock(x.WorkCarpetID).registerTexture("WorkshopCarpet").setUnlocalizedName("workshopCarpet").setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstoneFurnaceActive = new BlockCoalStoneFurnace(x.CoalstoneFurnaceOnID, true).setUnlocalizedName("CoalActive").setHardness(8.0F).setCreativeTab(null);
    public static final Block iceDoor = new BlockIceDoor(x.IceDoorID).setUnlocalizedName("IceDoor").setHardness(4.0F).setCreativeTab(null);
    public static final Block iceSapling = new IceikaSapling(x.IceSaplingID).registerTexture("IceikaSapling").setHardness(0F).setStepSound(Block.soundGrassFootstep);
    
    public static void addNames(){
    	addBlock(iceSapling, "Icy Sapling");
    	addBlock(iceDoor, "Frosty Door");
		addBlock(snowyBricks, "Snowy Brick");
        addBlock(IceGrass, "Frozen Grass");
        addBlock(IceDirt, "Frozen Dirt");
        addBlock(IceLog, "Frozen Log");
        addBlock(IceLeaves, "Frozen Leaves");
        addBlock(IceikaPortal, "Iceika Portal");
        addBlock(coalstoneFurnaceActive, "Coalstone Furnace Active");
        addBlock(frostedGlass, "Frosted Glass");
        addBlock(glacideSpawner, "Glacide Spawner");
        addBlock(frostedStone, "Frosted Stone");
        addBlock(rolumSpawner, "Rolum Spawner");
        addBlock(frostedChest, "Frost Chest");
        addBlock(coalstoneFurnace, "Coalstone Furnace");
        addBlock(workshopBookcase, "Workshop Bookcase");
        addBlock(workshopCarpet, "Workshop Carpet");
        addBlock(icyBricks, "Icy Brick");
        addBlock(icyStone, "Icy Stone");
        addBlock(workshopLamp, "Workshop Lamp");
        addBlock(coalstone, "Coal Stone");
    }
}
