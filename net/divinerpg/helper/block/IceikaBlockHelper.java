package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockDivineSpawner;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.block.ModLog;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.iceika.block.BlockCoalStoneFurnace;
import net.divinerpg.iceika.block.BlockColoredGlass;
import net.divinerpg.iceika.block.BlockIceChest;
import net.divinerpg.iceika.block.BlockIceDoor;
import net.divinerpg.iceika.block.BlockIceGrass;
import net.divinerpg.iceika.block.BlockIceikaPortal;
import net.divinerpg.iceika.block.IceLeaves;
import net.divinerpg.iceika.block.IceikaSapling;
import net.minecraft.block.Block;

public class IceikaBlockHelper extends HelperBase{

    public static final BlockIceikaPortal IceikaPortal = (BlockIceikaPortal) new BlockIceikaPortal(x.getID("IceikaPortal")).registerTexture("IceikaPortal").setUnlocalizedName("IcePor").setBlockUnbreakable().setCreativeTab(DivineRPG.Blocks);
    public static final Block IceLog = new ModLog(x.getID("IceLog"), "Ice").setUnlocalizedName("IceLog").setHardness(7.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceLeaves = new IceLeaves(x.getID("IceLeaves"), "Ice").registerTexture("IceLeaves").setHardness(5.0F).setUnlocalizedName("IceLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceGrass = new BlockIceGrass(x.getID("IceikaGrass")).setHardness(15.0F).setUnlocalizedName("IceGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block IceDirt = new ModDirt(x.getID("IceikaDirt")).registerTexture("IceGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("IceDirt").setCreativeTab(DivineRPG.Blocks);
    public static final Block icyStone = new ModBlock(x.getID("IceikaStone")).registerTexture("IcyStone").setHardness(7.0F).setUnlocalizedName("IcyStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstone = new ModBlock(x.getID("CoalStone")).registerTexture("CoalStone").setHardness(5.0F).setUnlocalizedName("CoalStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block workshopLamp = new ModBlock(x.getID("WorkShopLamp")).registerTexture("WorkShopLamp").setHardness(5.0F).setUnlocalizedName("WorkLamp").setLightValue(1.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block snowyBricks = new ModBlock(x.getID("SnowBrick")).registerTexture("SnowyBrick").setHardness(9.0F).setUnlocalizedName("SnowBrick").setCreativeTab(DivineRPG.Blocks);
    public static final Block icyBricks = new ModBlock(x.getID("IceBrick")).registerTexture("IcyBrick").setBlockUnbreakable().setUnlocalizedName("IceBrick").setCreativeTab(DivineRPG.Blocks);
    public static final Block workshopBookcase = new ModBlock(x.getID("WorkBookcase")).registerTexture("WorkshopBookcase").setUnlocalizedName("BookCase").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedGlass = new BlockColoredGlass(x.getID("FrostGlass")).registerTexture("FrostedGlass").setHardness(4.0F).setUnlocalizedName("FrostGlass").setStepSound(Block.soundGlassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstoneFurnace = new BlockCoalStoneFurnace(x.getID("CoalStoneFurnace"), false).registerTexture("CoalStoneFurnace_Front_Off").setUnlocalizedName("CoalFurnace").setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedChest = new BlockIceChest(x.getID("FrostChest")).setUnlocalizedName("FC").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block frostedStone = new ModBlock(x.getID("FrostStone")).registerTexture("FrostedStone").setUnlocalizedName("IceS").setHardness(8.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block rolumSpawner = new BlockDivineSpawner(x.getID("RolumSpawner"), "Rollum").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("Rolum").setCreativeTab(DivineRPG.Spawn);
    public static final Block glacideSpawner = new BlockDivineSpawner(x.getID("GlacideSpawner"), "Glacide").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("GSpawner").setCreativeTab(DivineRPG.Spawn);
    public static final Block workshopCarpet = new ModBlock(x.getID("WorkCarpet")).registerTexture("WorkshopCarpet").setUnlocalizedName("workshopCarpet").setCreativeTab(DivineRPG.Blocks);
    public static final Block coalstoneFurnaceActive = new BlockCoalStoneFurnace(x.getID("CoalStoneFurnaceOn"), true).setUnlocalizedName("CoalActive").setHardness(8.0F).setCreativeTab(null);
    public static final Block iceDoor = new BlockIceDoor(x.getID("IceDoor")).setUnlocalizedName("IceDoor").setHardness(4.0F).setCreativeTab(null);
    public static final Block iceSapling = new IceikaSapling(x.getID("IceSapling")).registerTexture("IceikaSapling").setHardness(0F).setStepSound(Block.soundGrassFootstep);
    
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
