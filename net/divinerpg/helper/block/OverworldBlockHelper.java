package net.divinerpg.helper.block;

import net.divinerpg.*;
import net.divinerpg.anti_nether.*;
import net.divinerpg.block.*;
import net.divinerpg.block.model.*;
import net.divinerpg.block.overworld.BlockAcceleraunch;
import net.divinerpg.block.overworld.BlockAccelleron;
import net.divinerpg.block.overworld.BlockDivineDungenSpawner;
import net.divinerpg.block.overworld.BlockLightFenceBlue;
import net.divinerpg.block.overworld.BlockLightFenceGreen;
import net.divinerpg.block.overworld.BlockLightFenceRed;
import net.divinerpg.block.overworld.BlockSuperEnchantmentTable;
import net.divinerpg.block.overworld.BlockTar;
import net.divinerpg.block.overworld.BlockTomatoCrop;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.config.*;
import net.divinerpg.iceika.block.*;
import net.divinerpg.lib.*;
import net.divinerpg.overworld.block.*;
import net.divinerpg.render.entity.model.ModelParasecta;
import net.minecraft.block.*;
import net.minecraft.util.*;
import cpw.mods.fml.common.registry.*;

public class OverworldBlockHelper extends HelperBase {


	public static Block miniBricks;
	public static Block steel;
	public static Block glowingStairs;
	public static Block skeletonChest;
	public static Block elevantium;

    public static final Block rupeeOre = new ModBlock(x.RupeeOreID).registerTexture("RupeeOre").setUnlocalizedName("Rupee").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block arlemiteOre = new ModBlock(x.ArlemiteOreID).registerTexture("ArlemiteOre").setUnlocalizedName("Arlemite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block realmiteOre = new ModBlock(x.RealmiteOreID).registerTexture("RealmiteOre").setUnlocalizedName("Realmite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block netheriteOre = new Netherite(x.NetheriteOreID).registerTexture("NetheriteOre").setUnlocalizedName("Netherite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block bloodGemOre = new BloodGem(x.BloodGemOreID).registerTexture("BloodGemOre").setUnlocalizedName("Blood").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final BlockBlueFire bluefire = (BlockBlueFire)new BlockBlueFire(x.BlueFireID).setUnlocalizedName("Blue").setLightValue(50.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block divineRock = new ModBlock(x.DivineStoneID).registerTexture("DivineRock").setUnlocalizedName("DivineRock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block rupeeBlock = new ModBlock(x.RupeeBlockID).registerTexture("RupeeBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Blocks);
    public static final Block arlemiteBlock = new ModBlock(x.ArlemiteBlockID).registerTexture("ArlemiteBlock").setUnlocalizedName("AB").setCreativeTab(DivineRPG.Blocks);
    public static final Block obsidianBlock = new ModBlock(x.ObsidianBlockID).registerTexture("ObsidianBlock").setUnlocalizedName("OB").setCreativeTab(DivineRPG.Blocks);
    public static final Block realmiteBlock = new ModBlock(x.RealmiteBlockID).registerTexture("RealmiteBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Blocks);
    public static final Block netheriteBlock = new ModBlock(x.NetheriteBlockID).registerTexture("NetheriteBlock").setUnlocalizedName("NB").setCreativeTab(DivineRPG.Blocks);
    public static final Block DivineLog = new ModLog(x.DivineLogID, "Divine").setHardness(0.5F).setUnlocalizedName("DivineLog").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block DivinePlank = new ModPlank(x.DivinePlankID, "Divine").setHardness(0.5F).setUnlocalizedName("DivinePlank").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block DivineLeaves = new ModLeaves(x.DivineLeavesID, "Divine").setHardness(0.2F).setUnlocalizedName("DivineLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block spawner = new BlockDivineDungenSpawner(x.Spawner1ID, "Jungle Dramcryx").registerTexture("DivineSpawner").setUnlocalizedName("Spawner1");
    public static final Block divineStoneMossy = new ModBlock(x.DivineMossyID).registerTexture("DivineStoneMossy").setUnlocalizedName("DivineStoneMossy").setCreativeTab(DivineRPG.Blocks);

    public static final Block AquaLamp = new ModGlass(x.AquaLampID).registerTexture("AquaLamp").setUnlocalizedName("AquaLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block ArlemiteLamp = new ModGlass(x.ArlemiteLampID).registerTexture("ArlemiteLamp").setUnlocalizedName("ArlemiteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block BlazeLamp = new ModGlass(x.BlazeLampID).registerTexture("BlazeLamp").setUnlocalizedName("BlazeLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block BlueFireLamp = new ModGlass(x.BlueFireLampID).registerTexture("BlueFireLamp").setUnlocalizedName("BlueFireLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DivineLamp = new ModGlass(x.DivineLampID).registerTexture("DivineLamp").setUnlocalizedName("DivineLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DrakenLamp = new ModGlass(x.DrakenLampID).registerTexture("DrakenLamp").setUnlocalizedName("DrakenLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DraviteLamp = new ModGlass(x.DraviteLampID).registerTexture("DraviteLamp").setUnlocalizedName("DraviteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block EnderLamp = new ModGlass(x.EnderLampID).registerTexture("EnderLamp").setUnlocalizedName("EnderLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block GoldLamp = new ModGlass(x.GoldLampID).registerTexture("GoldLamp").setUnlocalizedName("GoldLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block LapisLamp = new ModGlass(x.LapisLampID).registerTexture("LapisLamp").setUnlocalizedName("LapisLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block LavaLamp = new ModGlass(x.LavaLampID).registerTexture("LavaLamp").setUnlocalizedName("LavaLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block MilkyLamp = new ModGlass(x.MilkyLampID).registerTexture("MilkyLamp").setUnlocalizedName("MilkyLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block MoltenLamp = new ModGlass(x.MoltenLampID).registerTexture("MoltenLamp").setUnlocalizedName("MolternLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block NetheriteLamp = new ModGlass(x.NetheriteLampID).registerTexture("NetheriteLamp").setUnlocalizedName("NetheriteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RedstoneLamp = new ModGlass(x.RedstoneLampID).registerTexture("RedstoneOreLamp").setUnlocalizedName("RedstoneLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RupeeLamp = new ModGlass(x.RupeeLampID).registerTexture("RupeeLamp").setUnlocalizedName("RupeeLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block SlimeLight = new ModGlass(x.SlimeLightID).registerTexture("SlimeLight").setUnlocalizedName("SlimeLight").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block IceLamp = new ModGlass(x.IceLampID).registerTexture("IceLamp").setUnlocalizedName("IceLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block KrakenLamp = new ModGlass(x.KrakenLampID).registerTexture("KrakenLamp").setUnlocalizedName("KrakenLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RealmiteLamp = new ModGlass(x.RealmiteLampID).registerTexture("RealmiteLamp").setUnlocalizedName("RealmiteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DiamondLamp = new ModGlass(x.DiamondLampID).registerTexture("DiamondLamp").setUnlocalizedName("DiamondLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block JungleStoneLamp = new ModGlass(x.JungleStoneLampID).registerTexture("JungleStoneLamp").setUnlocalizedName("JungleStoneLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);

    public static final Block DarkStone = new ModBlock(x.DarkStoneID).registerTexture("DarkStone").setUnlocalizedName("DarkStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block BedrockBlock = new ModBlock(x.BedrockBlockID).registerTexture("BedrockBlock").setUnlocalizedName("BedrockBlock").setCreativeTab(DivineRPG.Blocks);

    public static final Block SpiderPumpkin = new ModPumpkin(x.SpiderPumpkinID).registerPumpkinTexture("Spider").setUnlocalizedName("SpiderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block EnderPumpkin = new ModPumpkin(x.EnderPumpkinID).registerPumpkinTexture("Ender").setUnlocalizedName("EnderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block CreeperPumpkin = new ModPumpkin(x.CreeperPumpkinID).registerPumpkinTexture("Creeper").setUnlocalizedName("CreeperPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block SkeletonPumpkin = new ModPumpkin(x.SkeletonPumpkinID).registerPumpkinTexture("Skeleton").setUnlocalizedName("SkeletonPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block BlazePumpkin = new ModPumpkin(x.BlazePumpkinID).registerPumpkinTexture("Blaze").setUnlocalizedName("BlazePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block ZombiePumpkin = new ModPumpkin(x.ZombiePumpkinID).registerPumpkinTexture("Zombie").setUnlocalizedName("ZombiePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block IceManPumpkin = new ModPumpkin(x.IceManPumpkinID).registerPumpkinTexture("IceMan").setUnlocalizedName("IceManPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block CyclopsePumpkin = new ModPumpkin(x.CyclopsePumpkinID).registerPumpkinTexture("Cyclopse").setUnlocalizedName("CyclopsePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block GhastPumpkin = new ModPumpkin(x.GhastPumpkinID).registerPumpkinTexture("Ghast").setUnlocalizedName("GhastPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block FrostPumpkin = new ModPumpkin(x.FrostPumpkinID).registerPumpkinTexture("Frost").setUnlocalizedName("FrostPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block EnderWatcherPumpkin = new ModPumpkin(x.EnderWatcherPumpkinID).registerPumpkinTexture("EnderWatcher").setUnlocalizedName("EnderWatcherPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block JungleSpiderPumpkin = new ModPumpkin(x.JungleSpiderPumpkinID).registerPumpkinTexture("JungleSpider").setUnlocalizedName("JungleSpiderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block HellSpiderPumpkin = new ModPumpkin(x.HellSpiderPumpkinID).registerPumpkinTexture("HellSpider").setUnlocalizedName("HellSpiderPumpkin").setCreativeTab(DivineRPG.Blocks);

    public static final Block Tar = new BlockTar(x.TarID).setHardness(0.0F).setLightValue(1.0F).setUnlocalizedName("Tar").setCreativeTab(DivineRPG.Blocks);    
   
    public static final Block lightFenceBlue = new BlockLightFenceBlue(x.BlueFenceID, false, "BlueFence").setUnlocalizedName("BlueFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceRed = new BlockLightFenceRed(x.RedFenceID, false, "RedFence").setUnlocalizedName("RedFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    
    public static final Block lightFenceBlueOn = new BlockLightFenceBlue(x.BlueFenceOnID, true, "BlueFenceOn").setUnlocalizedName("BlueFenceOn").setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceRedOn = new BlockLightFenceRed(x.RedFenceOnID, true, "RedFenceOn").setUnlocalizedName("RedFenceOn").setStepSound(Block.soundGlassFootstep);
    
    public static final Block lightFenceGreen = new BlockLightFenceGreen(x.GreenFenceID, false, "GreenFence").setUnlocalizedName("GreenFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceGreenOn = new BlockLightFenceGreen(x.GreenFenceOnID, true, "GreenFenceOn").setUnlocalizedName("GreenFenceOn").setStepSound(Block.soundGlassFootstep);
    
	public static final Block ayeracoBeamBlue = new BlockAyeracoBeamBlue(x.ayeracoBlueBeamID).registerTexture("Beam1").setUnlocalizedName("Blue");
	public static final Block ayeracoBeamGreen = new BlockAyeracoBeamGreen(x.ayeracoGreenBeamID).registerTexture("Beam2").setUnlocalizedName("Green");
	public static final Block ayeracoBeamPurple = new BlockAyeracoBeamPurple(x.ayeracoPurpleBeamID).registerTexture("Beam3").setUnlocalizedName("Purple");
	public static final Block ayeracoBeamRed = new BlockAyeracoBeamRed(x.ayeracoRedBeamID).registerTexture("Beam4").setUnlocalizedName("Red");
	public static final Block ayeracoBeamYellow = new BlockAyeracoBeamYellow(x.ayeracoYellowBeamID).registerTexture("Beam4").setUnlocalizedName("Yellow");
     
	public static final BlockAntiNetherPortal AntiNetherPortal = (BlockAntiNetherPortal)new BlockAntiNetherPortal(x.AntiNetherPortalID).registerTexture("ANPortal").setUnlocalizedName("ANPortal").setCreativeTab(DivineRPG.Blocks);
	
	public static final Block CyanColouredVein = new ModBlock(x.CyanColouredVeinID).registerTexture("CyanVein").setLightOpacity(255).setUnlocalizedName("Cyan").setCreativeTab(DivineRPG.Blocks);
	public static final Block BlueColouredVein = new ModBlock(x.GreenColouredVeinID).registerTexture("BlueVein").setLightOpacity(255).setUnlocalizedName("Blue").setCreativeTab(DivineRPG.Blocks);
	public static final Block YellowColouredVein = new ModBlock(x.YellowColouredVeinID).registerTexture("YellowVein").setLightOpacity(255).setUnlocalizedName("Yellow").setCreativeTab(DivineRPG.Blocks);
	public static final Block PurpleColouredVein = new ModBlock(x.PurpleColouredVeinID).registerTexture("PurpleVein").setLightOpacity(255).setUnlocalizedName("Purple").setCreativeTab(DivineRPG.Blocks);
	public static final Block RedColouredVein = new ModBlock(x.RedColouredVeinID).registerTexture("RedVein").setLightOpacity(255).setUnlocalizedName("Red").setCreativeTab(DivineRPG.Blocks);

	public static final Block AquaBricks = new ModBrick(x.AquaBricksID, "Aqua").setUnlocalizedName("AquaBrick");
	public static final Block ArlemiteBricks = new ModBrick(x.ArlemiteBricksID, "Arlemite").setUnlocalizedName("ArlemiteBrick");
	public static final Block DarkStoneBricks = new ModBrick(x.DarkStoneBricksID, "DarkStone").setUnlocalizedName("DarkStoneBrick");
	public static final Block DiamondBricks = new ModBrick(x.DiamondBricksID, "Diamond").setUnlocalizedName("DiamondBrick");
	public static final Block LapisBrick = new ModBrick(x.LapisLazuliBricksID, "LapisLazuli").setUnlocalizedName("LapisLazuliBrick");
	public static final Block LavaBricks = new ModBrick(x.LavaBricksID, "Lava").setUnlocalizedName("LavaBrick");
	public static final Block MilkstoneBrick = new ModBrick(x.MilkstoneBricksID, "Milkstone").setUnlocalizedName("MilkstoneBrick");
	public static final Block NetheriteBrick = new ModBrick(x.NetheriteBricksID, "Netherite").setUnlocalizedName("NetheriteBrick");
	public static final Block RealmiteBrick = new ModBrick(x.RealmiteBricksID, "Realmite").setUnlocalizedName("RealmiteBrick");
	public static final Block RedstoneBrick = new ModBrick(x.RedstoneBricksID, "Redstone").setUnlocalizedName("RedstoneBrick");
	public static final Block MilkstoneMiniBrick = new ModBrick(x.MilkstoneMiniBricksID, "MilkstoneMini").setUnlocalizedName("MilkstoneMiniBrick");
	
	public static final Block Acceleraunch = new BlockAcceleraunch(x.AcceleraunchID).setUnlocalizedName("Acceleraunch");
	public static final Block Accelleron = new BlockAccelleron(x.AccelleronID).setUnlocalizedName("Accelleron");
	
	public static final Block PurpleStone = new ModBlock(x.PurpleStoneID).registerTexture("PurpleStone").setUnlocalizedName("PurpleStone").setLightValue(1.0F).setCreativeTab(DivineRPG.Blocks);

	public static final Block Light1 = new ModLight(x.Light1ID, "1").setUnlocalizedName("Light1");
	public static final Block Light2 = new ModLight(x.Light2ID, "2").setUnlocalizedName("Light2");
	
	public static final Block RainbowWool = new ModBlock(x.RainbowWoolID).registerTexture("RainbowWool_Side", "RainbowWool_Top", "RainbowWool_Top").setStepSound(Block.soundClothFootstep).setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("RainbowWool").setHardness(0.5F);
	public static final Block TomatoCrop = new BlockTomatoCrop(x.TomatoCropID).setUnlocalizedName("TomatoCrop");
	public static final Block DirtBlock = new ModBlock(x.DirtBlockID).registerTexture("DirtBlock").setUnlocalizedName("DirtBlock").setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Blocks);
	public static final Block SoulSandBlock = new ModBlock(x.SoulSandBlockID).registerTexture("SoulSandBlock").setUnlocalizedName("SoulSandBlock").setHardness(0.5F).setStepSound(Block.soundSandFootstep).setCreativeTab(DivineRPG.Blocks);
	public static final Block MilkStone = new ModBlock(x.MilkstoneID).registerTexture("MilkStone").setHardness(4.0F).setUnlocalizedName("MilkStone");
	
	public static final Block GreenCane = new ModBlock(x.GreenCandyCaneID).registerTexture("GreenCandyCane").setUnlocalizedName("GreenCandyCane").setHardness(2.0F);
	public static final Block PurpleCane = new ModBlock(x.PurpleCandyCaneID).registerTexture("PurpleCandyCane").setUnlocalizedName("PurpleCandyCane").setHardness(2.0F);
	public static final Block BlueCane = new ModBlock(x.BlueCandyCaneID).registerTexture("BlueCandyCane").setUnlocalizedName("BlueCandyCane").setHardness(2.0F);
	public static final Block RedCane = new ModBlock(x.RedCandyCaneID).registerTexture("RedCandyCane").setUnlocalizedName("RedCandyCane").setHardness(2.0F);
	public static final Block YellowCane = new ModBlock(x.YellowCandyCaneID).registerTexture("YellowCandyCane").setUnlocalizedName("YellowCandyCane").setHardness(2.0F);
	
	public static final Block GreenLight = new BlockDivineRPGLadder(x.GreenLightID).registerTexture("XMasLight_Green").setUnlocalizedName("GreenLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block PurpleLight = new BlockDivineRPGLadder(x.PurpleLightID).registerTexture("XMasLight_Purple").setUnlocalizedName("PurpleLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block BlueLight = new BlockDivineRPGLadder(x.BlueLightID).registerTexture("XMasLight_Blue").setUnlocalizedName("BlueLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block RedLight = new BlockDivineRPGLadder(x.RedLightID).registerTexture("XMasLight_Red").setUnlocalizedName("RedLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block YellowLight = new BlockDivineRPGLadder(x.YellowLightID).registerTexture("XMasLight_Yellow").setUnlocalizedName("YellowLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	
	public static final Block StainedGlass = new BlockColoredGlass(x.StainedGlassID).registerTexture("StainedGlass").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass1").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass2 = new BlockColoredGlass(x.StainedGlass1ID).registerTexture("StainedGlass2").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass2").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass3 = new BlockColoredGlass(x.StainedGlass2ID).registerTexture("StainedGlass3").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass3").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass4 = new BlockColoredGlass(x.StainedGlass3ID).registerTexture("StainedGlass4").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass4").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass5 = new BlockColoredGlass(x.StainedGlass4ID).registerTexture("StainedGlass5").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass5").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass6 = new BlockColoredGlass(x.StainedGlass5ID).registerTexture("StainedGlass6").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass6").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass7 = new BlockColoredGlass(x.StainedGlass6ID).registerTexture("StainedGlass7").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass7").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass8 = new BlockColoredGlass(x.StainedGlass7ID).registerTexture("StainedGlass8").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass8").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);

	public static final Block SuperEnchantmentTable = new BlockSuperEnchantmentTable(x.SuperEnchantTableID).setUnlocalizedName("SuperEnchantTable");
	public static final Block Checker = new ModBlock(x.CheckerBlockID).registerTexture("Checker").setUnlocalizedName("Checker").setStepSound(Block.soundClothFootstep);
	
	public static final Block BlueTorch = new ModTorch(x.BlueTorchID).registerTexture("BlueTorch").setUnlocalizedName("BlueTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block GreenTorch = new ModTorch(x.GreenTorchID).registerTexture("GreenTorch").setUnlocalizedName("GreenTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block OrangeTorch = new ModTorch(x.OrangeTorchID).registerTexture("OrangeTorch").setUnlocalizedName("OrangeTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block PinkTorch = new ModTorch(x.PinkTorchID).registerTexture("PinkTorch").setUnlocalizedName("PinkTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block PurpleTorch = new ModTorch(x.PurpleTorchID).registerTexture("PurpleTorch").setUnlocalizedName("PurpleTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block SkeletonTorch = new ModTorch(x.SkeletonTorchID).registerTexture("SkeletonTorch").setUnlocalizedName("SkeletonTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);

	public static final BlockStatue KingStatue = new BlockStatue(x.KingStatueID, EntityResourceLocs.KING_STATUE, new ModelKingStatue(), "KingStatue");
	public static final BlockStatue AncientStatue = new BlockStatue(x.AncientStatueID, EntityResourceLocs.ANCIENT_STATUE, new ModelAncientStatue(), "AnchientStatue");
	public static final BlockStatue AyeracoStatue = new BlockStatue(x.AyeracoStatueID, EntityResourceLocs.AYERACO_STATUE, new ModelAyeracoStatue(), "AyeracoStatue");
	public static final BlockStatue TwilightDemonStatue = new BlockStatue(x.TwilightStatueID, EntityResourceLocs.TWILIGHT_STATUE, new ModelTwilightStatue(), "TwilightStatue");
	public static final BlockStatue VamacheronStatue = new BlockStatue(x.VamacheronStatueID, EntityResourceLocs.VAMACHERON_STATUE, new ModelVamacheronStatue(), "VamacheronStatue");
	public static final BlockStatue DensosStatue = new BlockStatue(x.DensosStatueID, EntityResourceLocs.DENSOS_STATUE, new ModelDensosStatue(), "DensosStatue");
	public static final BlockStatue DexStatue = new BlockStatue(x.DexStatueID, EntityResourceLocs.DEX_STATUE, new ModelDexStatue(), "DexStatue"); 
	public static final BlockStatue DramixStatue = new BlockStatue(x.DramixStatueID, EntityResourceLocs.DRAMIX_STATUE, new ModelDramixStatue(), "DramixStatue");
	public static final BlockStatue ParasectaStatue = new BlockStatue(x.ParasectaStatueID, EntityResourceLocs.PARASECTA_STATUE, new ModelParasecta(), "ParasectaStatue");
	public static final BlockStatue SoulFiendStatue = new BlockStatue(x.SoulStatueID, EntityResourceLocs.SOUL_STATUE, new ModelSoulStatue(), "SoulStatue");
	public static final BlockStatue WatcherStatue = new BlockStatue(x.WatcherStatueID, EntityResourceLocs.WATCHER_STATUE, new ModelWatcherStatue(), "WatcherStatue");
	
    public static void addNames(){
    	addBlock(KingStatue, "King Of Scorchers Statue");
    	addBlock(AncientStatue, "Ancient Entity Statue");
    	addBlock(AyeracoStatue, "Ayeraco Statue");
    	addBlock(TwilightDemonStatue, "Twilight Demon Statue");
    	addBlock(VamacheronStatue, "Vamacheron Statue");
    	addBlock(DensosStatue, "Densos Statue");
    	addBlock(DexStatue, "Dex Statue");
    	addBlock(DramixStatue, "Dramix Statue");
    	addBlock(ParasectaStatue, "Parasecta Statue");
    	addBlock(SoulFiendStatue, "Soul Fiend Statue");
    	addBlock(WatcherStatue, "Watcher Statue");
    	addBlock(KrakenLamp, "Kraken Lamp");
    	addBlock(RealmiteLamp, "Realmite Lamp");
    	addBlock(DiamondLamp, "Diamond Lamp");
    	addBlock(JungleStoneLamp, "JungleStone Lamp");

    	addBlock(GreenLight, "Green Xmas Light");
    	addBlock(PurpleLight, "Purple Xmas Light");
    	addBlock(BlueLight, "Blue Xmas Light");
    	addBlock(RedLight, "Red Xmas Light");
    	addBlock(YellowLight, "Yellow Xmas Light");

    	addBlock(BlueTorch, "Blue Coloured Torch");
    	addBlock(GreenTorch, "Green Coloured Torch");
    	addBlock(OrangeTorch, "Orange Coloured Torch");
    	addBlock(PinkTorch, "Pink Coloured Torch");
    	addBlock(PurpleTorch, "Purple Coloured Torch");
    	addBlock(SkeletonTorch, "Skeleton Torch");
    	addBlock(Checker, "Checker Block");

    	addBlock(StainedGlass, "Stained Glass 1");
    	addBlock(StainedGlass2, "Stained Glass 2");
    	addBlock(StainedGlass3, "Stained Glass 3");
    	addBlock(StainedGlass4, "Stained Glass 4");
    	addBlock(StainedGlass5, "Stained Glass 5");
    	addBlock(StainedGlass6, "Stained Glass 6");
    	addBlock(StainedGlass7, "Stained Glass 7");
    	addBlock(StainedGlass8, "Stained Glass 8");

    	addBlock(DirtBlock, "Dirt Block");
    	addBlock(SoulSandBlock, "SoulSand Block");
    	addBlock(MilkStone, "Milkstone");
    	addBlock(GreenCane, "Green Candy Cane");
    	addBlock(PurpleCane, "Purple Candy Cane");
    	addBlock(BlueCane, "Blue Candy Cane");
    	addBlock(RedCane, "Red Candy Cane");
    	addBlock(YellowCane, "Yellow Candy Cane");
    	
    	addBlock(RainbowWool, "Rainbow Wool");
		addBlock(NetheriteBrick, "Netherite Brick");
    	addBlock(AquaBricks, "Aqua Brick");
    	addBlock(ArlemiteBricks, "Arlemite Brick");
    	addBlock(DarkStoneBricks, "DarkStone Brick");
    	addBlock(DiamondBricks, "Diamond Brick");
    	addBlock(LapisBrick, "Lapis Brick");
    	addBlock(LavaBricks, "Lava Brick");
    	addBlock(MilkstoneBrick, "Milkstone Brick");
    	addBlock(RealmiteBrick, "Realmite Brick");
    	addBlock(RedstoneBrick, "Redstone Brick");
    	addBlock(MilkstoneMiniBrick, "Milkstone Mini Brick");
    	addBlock(Acceleraunch, "Acceleraunch");
    	addBlock(Accelleron, "Accelleron");
    	addBlock(PurpleStone, "Purple Stone");
    	addBlock(Light2, "Light 1");
    	addBlock(Light1, "Light 2");

    	addBlock(RedColouredVein, "Red Coloured Vane");
    	addBlock(PurpleColouredVein, "Purple Coloured Vane");
    	addBlock(BlueColouredVein, "Blue Coloured Vane");
    	addBlock(YellowColouredVein, "Yellow Coloured Vane");
    	addBlock(CyanColouredVein, "Cyan Coloured Vane");

    	addBlock(Tar, "Tar");
    	addBlock(AntiNetherPortal, "Anti-Hell Portal");
    	addBlock(lightFenceRed, "Realmite Fence");
    	addBlock(lightFenceGreen, "Arlemite Fence");
    	addBlock(lightFenceBlue, "Rupee Fence");

    	addBlock(lightFenceRedOn, "Realmite Fence On");
    	addBlock(lightFenceGreenOn, "Arlemite Fence On");
    	addBlock(lightFenceBlueOn, "Rupee Fence On");
    	
        addBlock(divineStoneMossy, "Divine Mossy Stone");
        addBlock(DivineLeaves, "Divine Leaves");
        addBlock(DivineLog, "Divine Wood");
        addBlock(DivinePlank, "Divine Plank");
        addBlock(spawner, EnumChatFormatting.YELLOW + "Divine Spawner");
        addBlock(SuperEnchantmentTable, "Super Enchantment Table");
        addBlock(rupeeBlock, "Rupee Block");
        addBlock(arlemiteBlock, "Arlemtite Block");
        addBlock(obsidianBlock, "Obsidian Block");
        addBlock(realmiteBlock, "Realmite Block");
        addBlock(netheriteBlock, "Netherite Block");
        addBlock(rupeeOre, "Rupee Ore");
        addBlock(arlemiteOre, "Arlemite Ore");
        addBlock(realmiteOre, "Realmite Ore");
        addBlock(netheriteOre, "Netherite Ore");
        addBlock(bloodGemOre, "Bloodgem Ore");
        addBlock(divineRock, "Divine Rock");
        addBlock(AquaLamp, "Aqua Lamp");
        addBlock(ArlemiteLamp, "Arlemite Lamp");
        addBlock(BlazeLamp, "Blaze Lamp");
        addBlock(BlueFireLamp, "BlueFire Lamp");
        addBlock(DivineLamp, "Divine Lamp");
        addBlock(DrakenLamp, "Draken Lamp");
        addBlock(DraviteLamp, "Dravite Lamp");
        addBlock(EnderLamp, "Ender Lamp");
        addBlock(GoldLamp, "Gold Lamp");
        addBlock(LapisLamp, "Lapis Lamp");
        addBlock(LavaLamp, "Lava Lamp");
        addBlock(MilkyLamp, "Milky Lamp");
        addBlock(MoltenLamp, "Molten Lamp");
        addBlock(NetheriteLamp, "Netherite Lamp");
        addBlock(RupeeLamp, "Rupee Lamp");
        addBlock(RedstoneLamp, "Redstone Ore Lamp");
        addBlock(IceLamp, "Ice Lamp");
        addBlock(SlimeLight, "Slime Lamp");
        addBlock(DarkStone, "Dark Stone");
        addBlock(BedrockBlock, "Bedrock Block");
        addBlock(SpiderPumpkin, "Spider Pumpkin");
        addBlock(CreeperPumpkin, "Creeper Pumpkin");
        addBlock(EnderPumpkin, "Enderman Pumpkin");
        addBlock(SkeletonPumpkin, "Skeleton Pumpkin");
        addBlock(BlazePumpkin, "Blaze Pumpkin");
        addBlock(ZombiePumpkin, "Zombie Pumpkin");
        addBlock(IceManPumpkin, "IceMan Pumpkin");
        addBlock(CyclopsePumpkin, "Cyclopse Pumpkin");
        addBlock(GhastPumpkin, "Ghast Pumpkin");
        addBlock(FrostPumpkin, "Frost Pumpkin");
        addBlock(EnderWatcherPumpkin, "EnderWatcher Pumpkin");
        addBlock(JungleSpiderPumpkin, "Jungle Spider Pumpkin");
        addBlock(HellSpiderPumpkin, "Hell Spider Pumpkin");
    }
}
