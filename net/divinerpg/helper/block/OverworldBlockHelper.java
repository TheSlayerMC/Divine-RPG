package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.anti_nether.BlockAntiNetherPortal;
import net.divinerpg.block.BlockDivineRPGLadder;
import net.divinerpg.block.BlockStatue;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModBrick;
import net.divinerpg.block.ModGlass;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLight;
import net.divinerpg.block.ModLog;
import net.divinerpg.block.ModPlank;
import net.divinerpg.block.ModPumpkin;
import net.divinerpg.block.ModTorch;
import net.divinerpg.block.model.ModelAncientStatue;
import net.divinerpg.block.model.ModelAyeracoStatue;
import net.divinerpg.block.model.ModelDensosStatue;
import net.divinerpg.block.model.ModelDexStatue;
import net.divinerpg.block.model.ModelDramixStatue;
import net.divinerpg.block.model.ModelKingStatue;
import net.divinerpg.block.model.ModelSoulStatue;
import net.divinerpg.block.model.ModelTwilightStatue;
import net.divinerpg.block.model.ModelVamacheronStatue;
import net.divinerpg.block.model.ModelWatcherStatue;
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
import net.divinerpg.iceika.block.BlockColoredGlass;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.overworld.block.BlockAyeracoBeamBlue;
import net.divinerpg.overworld.block.BlockAyeracoBeamGreen;
import net.divinerpg.overworld.block.BlockAyeracoBeamPurple;
import net.divinerpg.overworld.block.BlockAyeracoBeamRed;
import net.divinerpg.overworld.block.BlockAyeracoBeamYellow;
import net.divinerpg.overworld.block.BlockBlueFire;
import net.divinerpg.overworld.block.BloodGem;
import net.divinerpg.overworld.block.Netherite;
import net.divinerpg.render.entity.model.ModelParasecta;
import net.minecraft.block.Block;
import net.minecraft.util.EnumChatFormatting;

public class OverworldBlockHelper extends HelperBase {


	public static Block miniBricks;
	public static Block steel;
	public static Block glowingStairs;
	public static Block skeletonChest;
	public static Block elevantium;

    public static final Block rupeeOre = new ModBlock(x.getID("RupeeOre")).registerTexture("RupeeOre").setUnlocalizedName("Rupee").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block arlemiteOre = new ModBlock(x.getID("ArlemiteOre")).registerTexture("ArlemiteOre").setUnlocalizedName("Arlemite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block realmiteOre = new ModBlock(x.getID("RealmiteOre")).registerTexture("RealmiteOre").setUnlocalizedName("Realmite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block netheriteOre = new Netherite(x.getID("NetheriteOre")).registerTexture("NetheriteOre").setUnlocalizedName("Netherite").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block bloodGemOre = new BloodGem(x.getID("BloodGemOre")).registerTexture("BloodGemOre").setUnlocalizedName("Blood").setHardness(7.0F).setCreativeTab(DivineRPG.Blocks);
    public static final BlockBlueFire bluefire = (BlockBlueFire)new BlockBlueFire(x.getID("BlueFire")).setUnlocalizedName("Blue").setLightValue(50.0F).setCreativeTab(DivineRPG.Blocks);
    public static final Block divineRock = new ModBlock(x.getID("DivineRock")).registerTexture("DivineRock").setUnlocalizedName("DivineRock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block rupeeBlock = new ModBlock(x.getID("RupeeBlock")).registerTexture("RupeeBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Blocks);
    public static final Block arlemiteBlock = new ModBlock(x.getID("ArlemiteBlock")).registerTexture("ArlemiteBlock").setUnlocalizedName("AB").setCreativeTab(DivineRPG.Blocks);
    public static final Block obsidianBlock = new ModBlock(x.getID("ObsidianBlock")).registerTexture("ObsidianBlock").setUnlocalizedName("OB").setCreativeTab(DivineRPG.Blocks);
    public static final Block realmiteBlock = new ModBlock(x.getID("RealmiteBlock")).registerTexture("RealmiteBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Blocks);
    public static final Block netheriteBlock = new ModBlock(x.getID("NetheriteBlock")).registerTexture("NetheriteBlock").setUnlocalizedName("NB").setCreativeTab(DivineRPG.Blocks);
    public static final Block DivineLog = new ModLog(x.getID("DivineLog"), "Divine").setHardness(0.5F).setUnlocalizedName("DivineLog").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block DivinePlank = new ModPlank(x.getID("DivinePlank"), "Divine").setHardness(0.5F).setUnlocalizedName("DivinePlank").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block DivineLeaves = new ModLeaves(x.getID("DivineLeaves"), "Divine").setHardness(0.2F).setUnlocalizedName("DivineLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Blocks);
    public static final Block spawner = new BlockDivineDungenSpawner(x.getID("DivineDungeonSpawner"), "Jungle Dramcryx").registerTexture("DivineSpawner").setUnlocalizedName("Spawner1");
    public static final Block divineStoneMossy = new ModBlock(x.getID("DivineMossyStone")).registerTexture("DivineStoneMossy").setUnlocalizedName("DivineStoneMossy").setCreativeTab(DivineRPG.Blocks);

    public static final Block AquaLamp = new ModGlass(x.getID("AquaLamp")).registerTexture("AquaLamp").setUnlocalizedName("AquaLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block ArlemiteLamp = new ModGlass(x.getID("ArlemiteLamp")).registerTexture("ArlemiteLamp").setUnlocalizedName("ArlemiteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block BlazeLamp = new ModGlass(x.getID("BlazeLamp")).registerTexture("BlazeLamp").setUnlocalizedName("BlazeLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block BlueFireLamp = new ModGlass(x.getID("BlueFireLamp")).registerTexture("BlueFireLamp").setUnlocalizedName("BlueFireLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DivineLamp = new ModGlass(x.getID("DivineLamp")).registerTexture("DivineLamp").setUnlocalizedName("DivineLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DrakenLamp = new ModGlass(x.getID("DrakenLamp")).registerTexture("DrakenLamp").setUnlocalizedName("DrakenLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DraviteLamp = new ModGlass(x.getID("DraviteLamp")).registerTexture("DraviteLamp").setUnlocalizedName("DraviteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block EnderLamp = new ModGlass(x.getID("EnderLamp")).registerTexture("EnderLamp").setUnlocalizedName("EnderLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block GoldLamp = new ModGlass(x.getID("GoldLamp")).registerTexture("GoldLamp").setUnlocalizedName("GoldLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block LapisLamp = new ModGlass(x.getID("LapisLamp")).registerTexture("LapisLamp").setUnlocalizedName("LapisLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block LavaLamp = new ModGlass(x.getID("LavaLamp")).registerTexture("LavaLamp").setUnlocalizedName("LavaLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block MilkyLamp = new ModGlass(x.getID("MilkyLamp")).registerTexture("MilkyLamp").setUnlocalizedName("MilkyLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block MoltenLamp = new ModGlass(x.getID("MoltenLamp")).registerTexture("MoltenLamp").setUnlocalizedName("MolternLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block NetheriteLamp = new ModGlass(x.getID("NetheriteLamp")).registerTexture("NetheriteLamp").setUnlocalizedName("NetheriteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RedstoneLamp = new ModGlass(x.getID("RedstoneLamp")).registerTexture("RedstoneOreLamp").setUnlocalizedName("RedstoneLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RupeeLamp = new ModGlass(x.getID("RupeeLamp")).registerTexture("RupeeLamp").setUnlocalizedName("RupeeLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block SlimeLight = new ModGlass(x.getID("SlimeLight")).registerTexture("SlimeLight").setUnlocalizedName("SlimeLight").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block IceLamp = new ModGlass(x.getID("IceLamp")).registerTexture("IceLamp").setUnlocalizedName("IceLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block KrakenLamp = new ModGlass(x.getID("KrakenLamp")).registerTexture("KrakenLamp").setUnlocalizedName("KrakenLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block RealmiteLamp = new ModGlass(x.getID("RealmiteLamp")).registerTexture("RealmiteLamp").setUnlocalizedName("RealmiteLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block DiamondLamp = new ModGlass(x.getID("DiamondLamp")).registerTexture("DiamondLamp").setUnlocalizedName("DiamondLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);
    public static final Block JungleStoneLamp = new ModGlass(x.getID("JungleLamp")).registerTexture("JungleStoneLamp").setUnlocalizedName("JungleStoneLamp").setCreativeTab(DivineRPG.Blocks).setHardness(0.3F).setLightValue(1.0F);

    public static final Block DarkStone = new ModBlock(x.getID("DarkStone")).registerTexture("DarkStone").setUnlocalizedName("DarkStone").setCreativeTab(DivineRPG.Blocks);
    public static final Block BedrockBlock = new ModBlock(x.getID("BedRockBlock")).registerTexture("BedrockBlock").setUnlocalizedName("BedrockBlock").setCreativeTab(DivineRPG.Blocks);

    public static final Block SpiderPumpkin = new ModPumpkin(x.getID("SpiderPumpkin")).registerPumpkinTexture("Spider").setUnlocalizedName("SpiderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block EnderPumpkin = new ModPumpkin(x.getID("EnderPumpkin")).registerPumpkinTexture("Ender").setUnlocalizedName("EnderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block CreeperPumpkin = new ModPumpkin(x.getID("CreeperPumpkin")).registerPumpkinTexture("Creeper").setUnlocalizedName("CreeperPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block SkeletonPumpkin = new ModPumpkin(x.getID("SkeletonPumpkin")).registerPumpkinTexture("Skeleton").setUnlocalizedName("SkeletonPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block BlazePumpkin = new ModPumpkin(x.getID("BlazePumpkin")).registerPumpkinTexture("Blaze").setUnlocalizedName("BlazePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block ZombiePumpkin = new ModPumpkin(x.getID("ZombiePumpkin")).registerPumpkinTexture("Zombie").setUnlocalizedName("ZombiePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block IceManPumpkin = new ModPumpkin(x.getID("IceManPumpkin")).registerPumpkinTexture("IceMan").setUnlocalizedName("IceManPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block CyclopsePumpkin = new ModPumpkin(x.getID("CyclopsePumpkin")).registerPumpkinTexture("Cyclopse").setUnlocalizedName("CyclopsePumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block GhastPumpkin = new ModPumpkin(x.getID("GhastPumpkin")).registerPumpkinTexture("Ghast").setUnlocalizedName("GhastPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block FrostPumpkin = new ModPumpkin(x.getID("FrostPumpkin")).registerPumpkinTexture("Frost").setUnlocalizedName("FrostPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block EnderWatcherPumpkin = new ModPumpkin(x.getID("EnderWatcherPumpkin")).registerPumpkinTexture("EnderWatcher").setUnlocalizedName("EnderWatcherPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block JungleSpiderPumpkin = new ModPumpkin(x.getID("JungleSpiderPumpkin")).registerPumpkinTexture("JungleSpider").setUnlocalizedName("JungleSpiderPumpkin").setCreativeTab(DivineRPG.Blocks);
    public static final Block HellSpiderPumpkin = new ModPumpkin(x.getID("HellSpiderPumpkin")).registerPumpkinTexture("HellSpider").setUnlocalizedName("HellSpiderPumpkin").setCreativeTab(DivineRPG.Blocks);

    public static final Block Tar = new BlockTar(x.getID("Tar")).setHardness(0.0F).setLightValue(1.0F).setUnlocalizedName("Tar").setCreativeTab(DivineRPG.Blocks);    
   
    public static final Block lightFenceBlue = new BlockLightFenceBlue(x.getID("BlueFence"), false, "BlueFence").setUnlocalizedName("BlueFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceRed = new BlockLightFenceRed(x.getID("RedFence"), false, "RedFence").setUnlocalizedName("RedFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    
    public static final Block lightFenceBlueOn = new BlockLightFenceBlue(x.getID("BlueFenceOn"), true, "BlueFenceOn").setUnlocalizedName("BlueFenceOn").setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceRedOn = new BlockLightFenceRed(x.getID("RedFenceOn"), true, "RedFenceOn").setUnlocalizedName("RedFenceOn").setStepSound(Block.soundGlassFootstep);
    
    public static final Block lightFenceGreen = new BlockLightFenceGreen(x.getID("GreenFence"), false, "GreenFence").setUnlocalizedName("GreenFence").setCreativeTab(DivineRPG.Blocks).setStepSound(Block.soundGlassFootstep);
    public static final Block lightFenceGreenOn = new BlockLightFenceGreen(x.getID("GreenFenceOn"), true, "GreenFenceOn").setUnlocalizedName("GreenFenceOn").setStepSound(Block.soundGlassFootstep);
    
	public static final Block ayeracoBeamBlue = new BlockAyeracoBeamBlue(x.getID("AyeracoBlueBeam")).registerTexture("Beam1").setUnlocalizedName("Blue");
	public static final Block ayeracoBeamGreen = new BlockAyeracoBeamGreen(x.getID("AyeracoGreenBeam")).registerTexture("Beam2").setUnlocalizedName("Green");
	public static final Block ayeracoBeamPurple = new BlockAyeracoBeamPurple(x.getID("AyeracoPurpleBeam")).registerTexture("Beam3").setUnlocalizedName("Purple");
	public static final Block ayeracoBeamRed = new BlockAyeracoBeamRed(x.getID("AyeracoRedBeam")).registerTexture("Beam4").setUnlocalizedName("Red");
	public static final Block ayeracoBeamYellow = new BlockAyeracoBeamYellow(x.getID("AyeracoYellowBeam")).registerTexture("Beam4").setUnlocalizedName("Yellow");
     
	public static final BlockAntiNetherPortal AntiNetherPortal = (BlockAntiNetherPortal)new BlockAntiNetherPortal(x.getID("AntiNetherPortal")).registerTexture("ANPortal").setUnlocalizedName("ANPortal").setCreativeTab(DivineRPG.Blocks);
	
	public static final Block CyanColouredVein = new ModBlock(x.getID("CyanColouredVein")).registerTexture("CyanVein").setLightOpacity(255).setUnlocalizedName("Cyan").setCreativeTab(DivineRPG.Blocks);
	public static final Block BlueColouredVein = new ModBlock(x.getID("GreenColouredVein")).registerTexture("BlueVein").setLightOpacity(255).setUnlocalizedName("Blue").setCreativeTab(DivineRPG.Blocks);
	public static final Block YellowColouredVein = new ModBlock(x.getID("YellowColouredVein")).registerTexture("YellowVein").setLightOpacity(255).setUnlocalizedName("Yellow").setCreativeTab(DivineRPG.Blocks);
	public static final Block PurpleColouredVein = new ModBlock(x.getID("PurpleColouredVein")).registerTexture("PurpleVein").setLightOpacity(255).setUnlocalizedName("Purple").setCreativeTab(DivineRPG.Blocks);
	public static final Block RedColouredVein = new ModBlock(x.getID("RedColouredVein")).registerTexture("RedVein").setLightOpacity(255).setUnlocalizedName("Red").setCreativeTab(DivineRPG.Blocks);

	public static final Block AquaBricks = new ModBrick(x.getID("AquaBricks"), "Aqua").setUnlocalizedName("AquaBrick");
	public static final Block ArlemiteBricks = new ModBrick(x.getID("ArlemiteBricks"), "Arlemite").setUnlocalizedName("ArlemiteBrick");
	public static final Block DarkStoneBricks = new ModBrick(x.getID("DarkStoneBricks"), "DarkStone").setUnlocalizedName("DarkStoneBrick");
	public static final Block DiamondBricks = new ModBrick(x.getID("DiamondBricks"), "Diamond").setUnlocalizedName("DiamondBrick");
	public static final Block LapisBrick = new ModBrick(x.getID("LapisLazuliBricks"), "LapisLazuli").setUnlocalizedName("LapisLazuliBrick");
	public static final Block LavaBricks = new ModBrick(x.getID("LavaBricks"), "Lava").setUnlocalizedName("LavaBrick");
	public static final Block MilkstoneBrick = new ModBrick(x.getID("MilkStoneBricks"), "Milkstone").setUnlocalizedName("MilkstoneBrick");
	public static final Block NetheriteBrick = new ModBrick(x.getID("NetheriteBricks"), "Netherite").setUnlocalizedName("NetheriteBrick");
	public static final Block RealmiteBrick = new ModBrick(x.getID("RealmiteBricks"), "Realmite").setUnlocalizedName("RealmiteBrick");
	public static final Block RedstoneBrick = new ModBrick(x.getID("RedStoneBricks"), "Redstone").setUnlocalizedName("RedstoneBrick");
	public static final Block MilkstoneMiniBrick = new ModBrick(x.getID("MilkStoneMiniBricks"), "MilkstoneMini").setUnlocalizedName("MilkstoneMiniBrick");
	
	public static final Block Acceleraunch = new BlockAcceleraunch(x.getID("Acceleraunch")).setUnlocalizedName("Acceleraunch");
	public static final Block Accelleron = new BlockAccelleron(x.getID("Accelleron")).setUnlocalizedName("Accelleron");
	
	public static final Block PurpleStone = new ModBlock(x.getID("PurpleStone")).registerTexture("PurpleStone").setUnlocalizedName("PurpleStone").setLightValue(1.0F).setCreativeTab(DivineRPG.Blocks);

	public static final Block Light1 = new ModLight(x.getID("Light1"), "1").setUnlocalizedName("Light1");
	public static final Block Light2 = new ModLight(x.getID("Light2"), "2").setUnlocalizedName("Light2");
	
	public static final Block RainbowWool = new ModBlock(x.getID("RainbowWool")).registerTexture("RainbowWool_Side", "RainbowWool_Top", "RainbowWool_Top").setStepSound(Block.soundClothFootstep).setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("RainbowWool").setHardness(0.5F);
	public static final Block TomatoCrop = new BlockTomatoCrop(x.getID("TomatoPlant")).setUnlocalizedName("TomatoCrop");
	public static final Block DirtBlock = new ModBlock(x.getID("DirtBlock")).registerTexture("DirtBlock").setUnlocalizedName("DirtBlock").setHardness(0.5F).setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Blocks);
	public static final Block SoulSandBlock = new ModBlock(x.getID("SoulSandBlock")).registerTexture("SoulSandBlock").setUnlocalizedName("SoulSandBlock").setHardness(0.5F).setStepSound(Block.soundSandFootstep).setCreativeTab(DivineRPG.Blocks);
	public static final Block MilkStone = new ModBlock(x.getID("Milkstone")).registerTexture("MilkStone").setHardness(4.0F).setUnlocalizedName("MilkStone");
	
	public static final Block GreenCane = new ModBlock(x.getID("GreenCandyCane")).registerTexture("GreenCandyCane").setUnlocalizedName("GreenCandyCane").setHardness(2.0F);
	public static final Block PurpleCane = new ModBlock(x.getID("PurpleCandyCane")).registerTexture("PurpleCandyCane").setUnlocalizedName("PurpleCandyCane").setHardness(2.0F);
	public static final Block BlueCane = new ModBlock(x.getID("BlueCandyCane")).registerTexture("BlueCandyCane").setUnlocalizedName("BlueCandyCane").setHardness(2.0F);
	public static final Block RedCane = new ModBlock(x.getID("RedCandyCane")).registerTexture("RedCandyCane").setUnlocalizedName("RedCandyCane").setHardness(2.0F);
	public static final Block YellowCane = new ModBlock(x.getID("YellowCandyCane")).registerTexture("YellowCandyCane").setUnlocalizedName("YellowCandyCane").setHardness(2.0F);
	
	public static final Block GreenLight = new BlockDivineRPGLadder(x.getID("GreenLight")).registerTexture("XMasLight_Green").setUnlocalizedName("GreenLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block PurpleLight = new BlockDivineRPGLadder(x.getID("PurpleLight")).registerTexture("XMasLight_Purple").setUnlocalizedName("PurpleLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block BlueLight = new BlockDivineRPGLadder(x.getID("BlueLight")).registerTexture("XMasLight_Blue").setUnlocalizedName("BlueLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block RedLight = new BlockDivineRPGLadder(x.getID("RedLight")).registerTexture("XMasLight_Red").setUnlocalizedName("RedLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	public static final Block YellowLight = new BlockDivineRPGLadder(x.getID("YellowLight")).registerTexture("XMasLight_Yellow").setUnlocalizedName("YellowLight").setHardness(1.0F).setCreativeTab(DivineRPG.Blocks).setLightValue(1.0F);
	
	public static final Block StainedGlass = new BlockColoredGlass(x.getID("StainedGlass")).registerTexture("StainedGlass").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass1").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass2 = new BlockColoredGlass(x.getID("StainedGlass1")).registerTexture("StainedGlass2").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass2").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass3 = new BlockColoredGlass(x.getID("StainedGlass2")).registerTexture("StainedGlass3").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass3").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass4 = new BlockColoredGlass(x.getID("StainedGlass3")).registerTexture("StainedGlass4").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass4").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass5 = new BlockColoredGlass(x.getID("StainedGlass4")).registerTexture("StainedGlass5").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass5").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass6 = new BlockColoredGlass(x.getID("StainedGlass5")).registerTexture("StainedGlass6").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass6").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass7 = new BlockColoredGlass(x.getID("StainedGlass6")).registerTexture("StainedGlass7").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass7").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);
	public static final Block StainedGlass8 = new BlockColoredGlass(x.getID("StainedGlass7")).registerTexture("StainedGlass8").setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("StainedGlass8").setHardness(0.3F).setStepSound(Block.soundGlassFootstep);

	public static final Block SuperEnchantmentTable = new BlockSuperEnchantmentTable(x.getID("SuperEnchantTable")).setUnlocalizedName("SuperEnchantTable");
	public static final Block Checker = new ModBlock(x.getID("CheckerBlock")).registerTexture("Checker").setUnlocalizedName("Checker").setStepSound(Block.soundClothFootstep);
	
	public static final Block BlueTorch = new ModTorch(x.getID("BlueTorch")).registerTexture("BlueTorch").setUnlocalizedName("BlueTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block GreenTorch = new ModTorch(x.getID("GreenTorch")).registerTexture("GreenTorch").setUnlocalizedName("GreenTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block OrangeTorch = new ModTorch(x.getID("OrangeTorch")).registerTexture("OrangeTorch").setUnlocalizedName("OrangeTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block PinkTorch = new ModTorch(x.getID("PinkTorch")).registerTexture("PinkTorch").setUnlocalizedName("PinkTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block PurpleTorch = new ModTorch(x.getID("PurpleTorch")).registerTexture("PurpleTorch").setUnlocalizedName("PurpleTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);
	public static final Block SkeletonTorch = new ModTorch(x.getID("SkeletonTorch")).registerTexture("SkeletonTorch").setUnlocalizedName("SkeletonTorch").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Blocks).setLightValue(0.5F);

	public static final BlockStatue KingStatue = new BlockStatue(x.getID("KingStatue"), EntityResourceLocs.KING_STATUE, new ModelKingStatue(), "KingStatue");
	public static final BlockStatue AncientStatue = new BlockStatue(x.getID("AncientStatue"), EntityResourceLocs.ANCIENT_STATUE, new ModelAncientStatue(), "AnchientStatue");
	public static final BlockStatue AyeracoStatue = new BlockStatue(x.getID("AyeracoStatue"), EntityResourceLocs.AYERACO_STATUE, new ModelAyeracoStatue(), "AyeracoStatue");
	public static final BlockStatue TwilightDemonStatue = new BlockStatue(x.getID("TwilightStatue"), EntityResourceLocs.TWILIGHT_STATUE, new ModelTwilightStatue(), "TwilightStatue");
	public static final BlockStatue VamacheronStatue = new BlockStatue(x.getID("VamacheronStatue"), EntityResourceLocs.VAMACHERON_STATUE, new ModelVamacheronStatue(), "VamacheronStatue");
	public static final BlockStatue DensosStatue = new BlockStatue(x.getID("DensosStatue"), EntityResourceLocs.DENSOS_STATUE, new ModelDensosStatue(), "DensosStatue");
	public static final BlockStatue DexStatue = new BlockStatue(x.getID("DexStatue"), EntityResourceLocs.DEX_STATUE, new ModelDexStatue(), "DexStatue"); 
	public static final BlockStatue DramixStatue = new BlockStatue(x.getID("DramixStatue"), EntityResourceLocs.DRAMIX_STATUE, new ModelDramixStatue(), "DramixStatue");
	public static final BlockStatue ParasectaStatue = new BlockStatue(x.getID("ParasectaStatue"), EntityResourceLocs.PARASECTA_STATUE, new ModelParasecta(), "ParasectaStatue");
	public static final BlockStatue SoulFiendStatue = new BlockStatue(x.getID("SoulStatue"), EntityResourceLocs.SOUL_STATUE, new ModelSoulStatue(), "SoulStatue");
	public static final BlockStatue WatcherStatue = new BlockStatue(x.getID("WatcherStatue"), EntityResourceLocs.WATCHER_STATUE, new ModelWatcherStatue(), "WatcherStatue");
	
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
