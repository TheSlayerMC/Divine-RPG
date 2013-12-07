package net.divinerpg.helper.config;

import java.io.File;

import net.divinerpg.helper.HelperBase;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VetheaConfigHelper extends HelperBase{
	
	static FMLPreInitializationEvent Event;
	
	public static void initConfig(FMLPreInitializationEvent event){
		Event = event;
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		
		//config.load();
		blockConfig();
		itemConfig();
		//config.save();
	}
	
	public static int vetheaPortalID, dreamstoneID, dreamgrassID, dreamdirtID, 
	dreamwoodID, dreamwoodLeavesID, dreambricksID, dreambricks2ID, lunastoneID, lunabricksID, 
	metalCagingID, dreamlampID, dreamlampOnID, weedwoodVineID, blossomingWeedwoodVineID, cryptWallID, 
	smoothGlassID, villageLampID, infusionTableID, cellLampID, barredDoorID, firecrystalID, 
	firelightID, hyrewoodID, mintwoodLeavesID, firewallID, karosHeatTileRedID, karosHeatTileGreenID, 
	karosCannonID, helioticBeamID, cryptFloorID, firewoodID, bacterialAcidID, blockAcidID, hallWallID, 
	wreckAltarID, raglokAltarID, karosAltarID, lunicAltarID, hiveWallID, quadroticAltarID, 
	everstoneID, lunicAcidID, firewoodLeavesID, hyrewoodLeavesID, gemtopGreenID, DreamGrassID, DreamDirtID, 
	gemtopPurpleID, greenDulahID, yellowDulahID, mintwoodID, lightFirewoodLeavesID, 
	cracklespikeID, ferniteID, bulatobeID, shineGrassID, shimmerID, dreamglowID, hyrewoodVineID, 
	chamberWallID, chamberWall1ID, chamberWall2ID, darkEverstoneID, whiteEverstoneID, 
	karosBricksID, karosBricks2ID, hungerstone1ID, hungerstone2ID, biphronSpawnerID, gorgosionSpawnerID, 
	duoSpawnerID, twinsSpawnerID, vermenousSpawnerID, dreamwreckerSpawnerID, lorgaSpawnerID, purpleFireID;
	
	public static int teakerSwordID, amthirmisSwordID, darvenSwordID, cermileSwordID, pardimalSwordID, quadroticSwordID, karosSwordID, 
	heliosisSwordID, arksianeSwordID, teakerHammerID, amthirmisHammerID, darvenHammerID, cermileHammerID, pardimalHammerID, 
	quadroticHammerID, karosHammerID, heliosisHammerID, arksianeHammerID, teakerBowID, amthirmisBowID, darvenBowID, 
	cermileBowID, pardimalBowID, quadroticBowID, karosBowID, heliosisBowID, arksianeBowID, teakerCannonID, 
	amthirmisCannonID, darvenCannonID, cermileCannonID, pardimalCannonID, quadroticCannonID, karosCannonItemID, 
	heliosisCannonID, arksianeCannonID, teakerClawID, amthirmisClawID, darvenClawID, cermileClawID, pardimalClawID, 
	quadroticClawID, karosClawID, heliosisClawID, arksianeClawID, teakerDiskID, amthirmisDiskID, darvenDiskID, 
	cermileDiskID, pardimalDiskID, quadroticDiskID, karosDiskID, heliosisDiskID, arksianeDiskID, acidfireID, 
	vetheanArrowID, vetheanArrow2ID, vetheanWarArrowID, vetheanWrathArrowID, vetheanHammerTemplateID, vetheanBackswordTemplateID, 
	vetheanBowTemplateID, vetheanCannonTemplateID, vetheanClawTemplateID, vetheanDiskTemplateID, vetheanStaffTemplateID, 
	vetheanDegradedTemplateID, vetheanFinishedTemplateID, vetheanGlisteningTemplateID, vetheanDemonizedTemplateID, 
	vetheanTormentedTemplateID, honeysuckleID, dreamCarrotID, dreamMelonID, dreamPieID, dreamCakeID, teakerLumpID, 
	amthirmisLumpID, darvenLumpID, cermileLumpID, pardimalLumpID, quadroticLumpID, karosLumpID, heliosisLumpID, 
	arksianeLumpID, dreamSweetsID, dreamSoursID, degradedHelmetMeleeID, degradedHelmetRangedID, degradedHelmetArcanaID, 
	degradedChestID, degradedLegsID, degradedBootsID, finishedHelmetMeleeID, finishedHelmetRangedID, finishedHelmetArcanaID, 
	finishedChestID, finishedLegsID, finishedBootsID, glisteningHelmetMeleeID, glisteningHelmetRangedID, glisteningHelmetArcanaID, 
	glisteningChestID, glisteningLegsID, glisteningBootsID, demonizedHelmetMeleeID, demonizedHelmetRangedID, demonizedHelmetArcanaID, 
	demonizedChestID, demonizedLegsID, demonizedBootsID, tormentedHelmetMeleeID, tormentedHelmetRangedID, tormentedHelmetArcanaID, 
	tormentedChestID, tormentedLegsID, tormentedBootsID, dirtyPearlsID, cleanPearlsID, polishedPearlsID, shinyPearlsID, 
	honeychunkID, rockChunksID, fyrossomID, heivaBeltID, mooncloudID, wormChunksID, vhraakTeethID, cdreamflintID, moonclockID, 
	spinebackChunkID, spinebackCannonID, spinebackDiscID, spinebackHammerID, spinebackStaffID, barredDoorItemID, everlightID, 
	everbrightID, evernightID, eversightID, everfightID, everArrowID, teakerStaffID, amthirmisStaffID, cermileStaffID, pardimalStaffID, 
	quadroticStaffID, karosStaffID, heliosisStaffID, arksianeStaffID, dreamPowderID, dreamflintID, darvenStaffID;
	
	public static int addBlock(String Name){
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		config.load();
		config.getBlock(Name, vetheaBlockID++ - 256).getInt();
		config.save();
		return vetheaBlockID++ - 256;
	}
	
	 public static int addTerrainBlock(String Cat, String Name){
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		config.load();
		config.getTerrainBlock(Cat, Name, genBlockID++, Cat).getInt();
		config.save();
		return genBlockID++;
	}
	
	 public static int addItem(String name){
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		config.load();
		config.getItem(name, vetheaItemID++ - 256).getInt();
		config.save();
		return vetheaItemID++ - 256;
	}
	
	public static void blockConfig(){
		DreamGrassID = addTerrainBlock("Vethea", "Dream Grass");
		DreamDirtID = addTerrainBlock("Vethea", "Dream Dirt");
        
		dreamstoneID = addBlock("Dream Stone");
		vetheaPortalID = addBlock("Vethea Portal");
		dreamwoodID = addBlock("Dreamwood Log");
		dreamwoodLeavesID = addBlock("Dreamwood Leaves");
		dreambricksID = addBlock("Dream Bricks");
		lunastoneID = addBlock("Luna Stone");
		lunabricksID = addBlock("Luna Bricks");
		metalCagingID = addBlock("Metal Caging");
		dreamlampID = addBlock("Dream Lamp");
		dreamlampOnID = addBlock("Dream Lamp On");
		weedwoodVineID = addBlock("Weedwood Vine");
		blossomingWeedwoodVineID = addBlock("Blossoming Weedwood Vine");
		cryptWallID = addBlock("Crypt Wall");
		smoothGlassID = addBlock("Smooth Glass");
		villageLampID = addBlock("Village Lamp");
		infusionTableID = addBlock("Infusion Table");
		cellLampID = addBlock("Cell Lamp");
		barredDoorID = addBlock("Barred Door");
		firecrystalID = addBlock("Fire Crystal");
		firelightID = addBlock("Fire Light");
		hyrewoodID = addBlock("Hyrewood Log");
		mintwoodLeavesID = addBlock("Mintwood Leaves");
		firewallID = addBlock("Firewall");
		karosHeatTileRedID = addBlock("Karos Heat Tile Red");
		karosHeatTileGreenID = addBlock("Karos Heat Tile Green");
		karosCannonID = addBlock("Karos Cannon");
		helioticBeamID = addBlock("Heliotic Beam");
		cryptFloorID = addBlock("Crypt Floor");
		firewoodID = addBlock("Firewood Log");
		chamberWallID = addBlock("Chamber Wall");
		chamberWall1ID = addBlock("Chamber Wall 1");
		chamberWall2ID = addBlock("Chamber Wall 2");
		bacterialAcidID = addBlock("Bacterial Acid");
		gemtopPurpleID = addBlock("Gemtop Purple");
		yellowDulahID = addBlock("Yellow Dulah");
		blockAcidID = addBlock("Block Acid");
		hallWallID = addBlock("Hall Wall");
		wreckAltarID = addBlock("Wreck Altar");
		raglokAltarID = addBlock("Raglock Altar");
		karosAltarID = addBlock("Karos Altar");
		lunicAltarID = addBlock("Lunic Altar");
		hiveWallID = addBlock("Hive Wall");
		quadroticAltarID = addBlock("Quadrotic Altar");
		everstoneID = addBlock("Everstone");
		lunicAcidID = addBlock("Lunic Acid");
		firewoodLeavesID = addBlock("Firewood Leaves");
		hyrewoodLeavesID = addBlock("Hyrewood Leaves");
		gemtopGreenID = addBlock("Gemtop Green");
		greenDulahID = addBlock("Green Dulah");
		mintwoodID = addBlock("Mintwood Log");
		lightFirewoodLeavesID = addBlock("Light Firewood Leaves");
		cracklespikeID = addBlock("Crackle Spike");
		ferniteID = addBlock("Fernite");
		bulatobeID = addBlock("Bulbatobe");
		shineGrassID = addBlock("Shine Grass");
		shimmerID = addBlock("Shimmer");
		dreamglowID = addBlock("Dream Glow");
		hyrewoodVineID = addBlock("Hyrewood Vine");
		dreambricks2ID = addBlock("Dream Bricks 2");
		whiteEverstoneID = addBlock("White Everstone");
		darkEverstoneID = addBlock("Dark Everstone");
		karosBricksID = addBlock("Karos Bricks");
		karosBricks2ID = addBlock("Karos Bricks");
		biphronSpawnerID = addBlock("Biphron Spawner");
		gorgosionSpawnerID = addBlock("Gorgosin Spawner");
		twinsSpawnerID = addBlock("Twins Spawner");
		duoSpawnerID = addBlock("Duo Spawner");
		vermenousSpawnerID = addBlock("Vermenous Spawner");
		dreamwreckerSpawnerID = addBlock("Dreamwrecker Spawner");
		lorgaSpawnerID = addBlock("Lorga Spawner");
		hungerstone1ID = addBlock("Hungerstone 1");
		hungerstone2ID = addBlock("Hungerstone 2");
		purpleFireID = addBlock("Purple Fire");
	}
	
	public static void itemConfig(){
		teakerDiskID = addItem("Teaker Disk");
		amthirmisDiskID = addItem("Amthirmis Disk");
		darvenDiskID = addItem("Darven Disk");
		cermileDiskID = addItem("Cermile Disk");
		pardimalDiskID = addItem("Pardimal Disk");
		quadroticDiskID = addItem("Quadrotic Disk");
		karosDiskID = addItem("Karos Disk");
		heliosisDiskID = addItem("Heliosis Disk");
		arksianeDiskID = addItem("Arkisane Disk");
		teakerHammerID = addItem("Teaker Hammer");
		amthirmisHammerID = addItem("Amthirmis Hammer");
		darvenHammerID = addItem("Darven Hammer");
		cermileHammerID = addItem("Cermile Hammer");
		pardimalHammerID = addItem("Pardimal Hammer");
		quadroticHammerID = addItem("Quadrotic Hammer");
		karosHammerID = addItem("Karos Hammer");
		heliosisHammerID = addItem("Heliosis Hammer");
		arksianeHammerID = addItem("Arskiane Hammer");
		teakerSwordID = addItem("Teaker Sword");
		amthirmisSwordID = addItem("Amthirmus Sword");
		darvenSwordID = addItem("Darven Sword");
		cermileSwordID = addItem("Cermile Sword");
		pardimalSwordID = addItem("Pardimal Sword");
		quadroticSwordID = addItem("Quadrotic Sword");
		karosSwordID = addItem("Karos Sword");
		heliosisSwordID = addItem("Heliosis Sword");
		arksianeSwordID = addItem("Arsiane Sword");
		teakerClawID = addItem("Teaker Claw");
		amthirmisClawID = addItem("Amthirmis Claw");
		darvenClawID = addItem("Darven Claw");
		cermileClawID = addItem("Cermile Claw");
		pardimalClawID = addItem("Pardimal Claw");
		quadroticClawID = addItem("Quadrotic Claw");
		karosClawID = addItem("Karos Claw");
		heliosisClawID = addItem("Heliosis Claw");
		arksianeClawID = addItem("Arksiane Claw");
		teakerCannonID = addItem("Teaker Cannon");
		amthirmisCannonID = addItem("Amthirmis Cannon");
		darvenCannonID = addItem("Darven Cannon");
		cermileCannonID = addItem("Cermile Cannon");
		pardimalCannonID = addItem("Pardimal");
		quadroticCannonID = addItem("Quadrotic Cannon");
		karosCannonItemID = addItem("Karos Cannon Item");
		heliosisCannonID = addItem("Heliosis Cannon");
		arksianeCannonID = addItem("Arskiane Cannon");
		acidfireID = addItem("Acid Fire");
		teakerBowID = addItem("Teaker Bow");
		amthirmisBowID = addItem("Amthirmis");
		darvenBowID = addItem("Darven Bow");
		cermileBowID = addItem("Cermile Bow");
		pardimalBowID = addItem("Pardimal Bow");
		quadroticBowID = addItem("Quadrotic Bow");
		karosBowID = addItem("Karos Bow");
		heliosisBowID = addItem("Heliosis Bow");
		arksianeBowID = addItem("Arskaine Bow");
		vetheanArrowID = addItem("Vethean Arrow");
		vetheanArrow2ID = addItem("Vethean Arrow 2");
		vetheanWarArrowID = addItem("Vethean War Arrow");
		vetheanWrathArrowID = addItem("Vethean Wrath Arrow");
		vetheanHammerTemplateID = addItem("Vethean Hammer Template");
		vetheanBackswordTemplateID = addItem("Vethean BackSword Template");
		vetheanBowTemplateID = addItem("Vethean Bow Template");
		vetheanCannonTemplateID = addItem("Vethean Cannon Template");
		vetheanClawTemplateID = addItem("Vethean Claw Template");
		vetheanDiskTemplateID = addItem("Vethean Disk Template");
		vetheanStaffTemplateID = addItem("Vethean Staff Template");
		vetheanDegradedTemplateID = addItem("Vethean Degraded Template");
		vetheanFinishedTemplateID = addItem("Vethean Finished Template");
		vetheanGlisteningTemplateID = addItem("Vethean Glisterning Template");
		vetheanDemonizedTemplateID = addItem("Vethean Demonized Template");
		vetheanTormentedTemplateID = addItem("Vethean Tormented Template");
		honeysuckleID = addItem("Honey Suckle");
		dreamCarrotID = addItem("Dream Carrot");
		dreamMelonID = addItem("Dream Melon");
		dreamPieID = addItem("Dream Pie");
		dreamCakeID = addItem("Dream Cake");
		teakerLumpID = addItem("Teaker Lump");
		amthirmisLumpID = addItem("Amthirmis Lump");
		darvenLumpID = addItem("Darven Lump");
		cermileLumpID = addItem("Cermile Lump");
		pardimalLumpID = addItem("Pardimal Lump");
		quadroticLumpID = addItem("Quadrotic Lump");
		karosLumpID = addItem("Karos Lump");
		heliosisLumpID = addItem("Heliosis Lump");
		arksianeLumpID = addItem("Arksiane Lump");
		dreamSweetsID = addItem("Dream Sweets");
		dreamSoursID = addItem("Dream Sours");
		degradedHelmetMeleeID = addItem("Degraded Helmet Melee");
		degradedHelmetRangedID = addItem("Degraded Helmet Ranged");
		degradedHelmetArcanaID = addItem("Degraded Helmet Arcana");
		degradedChestID = addItem("Degraded Body");
		degradedLegsID = addItem("Degraded Legs");
		degradedBootsID = addItem("Degraded Boots");
		finishedHelmetMeleeID = addItem("Finished Helmet Melee");
		finishedHelmetRangedID = addItem("Finished Helmet Ranged");
		finishedHelmetArcanaID = addItem("Finished Helmet Arcana");
		finishedChestID = addItem("Finished Body");
		finishedLegsID = addItem("Dinished Legs");
		finishedBootsID = addItem("Finished Boots");
		glisteningHelmetMeleeID = addItem("Glisterning Helmet Melee");
		glisteningHelmetRangedID = addItem("Glisterning Helmet Ranged");
		glisteningHelmetArcanaID = addItem("Glisterning Helmet Arcana");
		glisteningChestID = addItem("Glisterning Body");
		glisteningLegsID = addItem("Glisterning Legs");
		glisteningBootsID = addItem("Glisterning Boots");
		demonizedHelmetMeleeID = addItem("Demonized Helmet Melee");
		demonizedHelmetRangedID = addItem("Demonized Helmet Ranged");
		demonizedHelmetArcanaID = addItem("Demonized Helmet Arcana");
		demonizedChestID = addItem("Demonized Body");
		demonizedLegsID = addItem("Demonized Legs");
		demonizedBootsID = addItem("Demonized Boots");
		tormentedHelmetMeleeID = addItem("Tormented Helmet Melee");
		tormentedHelmetRangedID = addItem("Tormented Helmet Ranged");
		tormentedHelmetArcanaID = addItem("Tormented Helmet Arcana");
		tormentedChestID = addItem("Tormented Body");
		tormentedLegsID = addItem("Tormented Legs");
		tormentedBootsID = addItem("Tormented Boots");
		dirtyPearlsID = addItem("Dirty Pearls");
		cleanPearlsID = addItem("Clean Pearls");
		polishedPearlsID = addItem("Polished Pearls");
		shinyPearlsID = addItem("Shiny Pearls");
		honeychunkID = addItem("Honey Chunk");
		rockChunksID = addItem("Rock Chunk");
		fyrossomID = addItem("Fyrossom");
		heivaBeltID = addItem("Heiva Belt");
		mooncloudID = addItem("Moon Cloud");
		wormChunksID = addItem("Worm Chunks");
		vhraakTeethID = addItem("Vhraak Teeth");
		dreamflintID = addItem("Dream Flint");
		moonclockID = addItem("Moon Clock");
		spinebackChunkID = addItem("Spineback Chunk");
		spinebackCannonID = addItem("Spineback Cannon");
		spinebackDiscID = addItem("Spineback Disk");
		spinebackHammerID = addItem("Spineback Hammer");
		spinebackStaffID = addItem("Spineback Staff");
		everlightID = addItem("Everlight");
		everbrightID = addItem("Everbright");
		evernightID = addItem("Evernight");
		eversightID = addItem("Eversight");
		everfightID = addItem("Everfright");
		everArrowID = addItem("Ever Arrow");
		teakerStaffID = addItem("Teaker Staff");
		amthirmisStaffID = addItem("Amthirmis Staff");
		darvenStaffID = addItem("Darven Staff");
		cermileStaffID = addItem("Cermile Staff");
		pardimalStaffID = addItem("Pardimal Staff");
		quadroticStaffID = addItem("Quadrotic Staff");
		karosStaffID = addItem("Karos Staff");
		heliosisStaffID = addItem("Heliosis Staff");
		arksianeStaffID = addItem("Arksiane Staff");
		dreamPowderID = addItem("Dream Power");
		barredDoorItemID = addItem("Barred Door Item");
	}
	
}
