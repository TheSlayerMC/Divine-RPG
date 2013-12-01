package net.divinerpg.helper.config;

import java.io.File;

import net.divinerpg.helper.HelperBase;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VetheaConfigHelper extends HelperBase{
	
	static FMLPreInitializationEvent Event;
	
	public static int teakerSwordID;
    public static int amthirmisSwordID;
    public static int darvenSwordID;
    public static int cermileSwordID;
    public static int pardimalSwordID;
    public static int quadroticSwordID;
    public static int karosSwordID;
    public static int heliosisSwordID;
    public static int arksianeSwordID;
    
    public static int teakerHammerID;
    public static int amthirmisHammerID;
    public static int darvenHammerID;
    public static int cermileHammerID;
    public static int pardimalHammerID;
    public static int quadroticHammerID;
    public static int karosHammerID;
    public static int heliosisHammerID;
    public static int arksianeHammerID;
    
    public static int teakerBowID;
    public static int amthirmisBowID;
    public static int darvenBowID;
    public static int cermileBowID;
    public static int pardimalBowID;
    public static int quadroticBowID;
    public static int karosBowID;
    public static int heliosisBowID;
    public static int arksianeBowID;
    
    public static int teakerCannonID;
    public static int amthirmisCannonID;
    public static int darvenCannonID;
    public static int cermileCannonID;
    public static int pardimalCannonID;
    public static int quadroticCannonID;
    public static int karosCannonItemID;
    public static int heliosisCannonID;
    public static int arksianeCannonID;
    
    public static int teakerClawID;
    public static int amthirmisClawID;
    public static int darvenClawID;
    public static int cermileClawID;
    public static int pardimalClawID;
    public static int quadroticClawID;
    public static int karosClawID;
    public static int heliosisClawID;
    public static int arksianeClawID;
    
    public static int teakerDiskID;
    public static int amthirmisDiskID;
    public static int darvenDiskID;
    public static int cermileDiskID;
    public static int pardimalDiskID;
    public static int quadroticDiskID;
    public static int karosDiskID;
    public static int heliosisDiskID;
    public static int arksianeDiskID;

    public static int acidfireID;
    public static int vetheanArrowID;
    public static int vetheanArrow2ID;
    public static int vetheanWarArrowID;
    public static int vetheanWrathArrowID;
    

    public static int vetheanHammerTemplateID;
    public static int vetheanBackswordTemplateID;
    public static int vetheanBowTemplateID;
    public static int vetheanCannonTemplateID;
    public static int vetheanClawTemplateID;
    public static int vetheanDiskTemplateID;
    public static int vetheanStaffTemplateID;

    public static int vetheanDegradedTemplateID;
    public static int vetheanFinishedTemplateID;
    public static int vetheanGlisteningTemplateID;
    public static int vetheanDemonizedTemplateID;
    public static int vetheanTormentedTemplateID;
    
    public static int honeysuckleID;
    public static int dreamCarrotID;
    public static int dreamMelonID;
    public static int dreamPieID;
    public static int dreamCakeID;
    
    public static int teakerLumpID;
    public static int amthirmisLumpID;
    public static int darvenLumpID;
    public static int cermileLumpID;
    public static int pardimalLumpID;
    public static int quadroticLumpID;
    public static int karosLumpID;
    public static int heliosisLumpID;
    public static int arksianeLumpID;

    public static int dreamSweetsID;
    public static int dreamSoursID;
    

    public static int degradedHelmetMeleeID;
    public static int degradedHelmetRangedID;
    public static int degradedHelmetArcanaID;
    public static int degradedChestID;
    public static int degradedLegsID;
    public static int degradedBootsID;

    public static int finishedHelmetMeleeID;
    public static int finishedHelmetRangedID;
    public static int finishedHelmetArcanaID;
    public static int finishedChestID;
    public static int finishedLegsID;
    public static int finishedBootsID;

    public static int glisteningHelmetMeleeID;
    public static int glisteningHelmetRangedID;
    public static int glisteningHelmetArcanaID;
    public static int glisteningChestID;
    public static int glisteningLegsID;
    public static int glisteningBootsID;

    public static int demonizedHelmetMeleeID;
    public static int demonizedHelmetRangedID;
    public static int demonizedHelmetArcanaID;
    public static int demonizedChestID;
    public static int demonizedLegsID;
    public static int demonizedBootsID;

    public static int tormentedHelmetMeleeID;
    public static int tormentedHelmetRangedID;
    public static int tormentedHelmetArcanaID;
    public static int tormentedChestID;
    public static int tormentedLegsID;
    public static int tormentedBootsID;
    

    public static int dirtyPearlsID;
    public static int cleanPearlsID;
    public static int polishedPearlsID;
    public static int shinyPearlsID;
    
    public static int honeychunkID;
    public static int rockChunksID;
    public static int fyrossomID;
    public static int heivaBeltID;
    public static int mooncloudID;
    public static int wormChunksID;
    public static int vhraakTeethID;
    
    public static int dreamflintID;
    public static int moonclockID;
    public static int spinebackChunkID;

    public static int spinebackCannonID;
    public static int spinebackDiscID;
    public static int spinebackHammerID;
    public static int spinebackStaffID;
    
    public static int barredDoorItemID;

    public static int everlightID;
    public static int everbrightID;
    public static int evernightID;
    public static int eversightID;
    public static int everfightID;

    public static int everArrowID;
    
    public static int teakerStaffID;
    public static int amthirmisStaffID;
    public static int darvenStaffID;
    public static int cermileStaffID;
    public static int pardimalStaffID;
    public static int quadroticStaffID;
    public static int karosStaffID;
    public static int heliosisStaffID;
    public static int arksianeStaffID;
        
    public static int dreamPowderID;
    
    public static int vetheaPortalID;
    public static int dreamstoneID;
    public static int dreamgrassID;
    public static int dreamdirtID;
    public static int dreamwoodID;
    public static int dreamwoodLeavesID;
    public static int dreambricksID;
    public static int dreambricks2ID;
    public static int lunastoneID;
    public static int lunabricksID;
    public static int metalCagingID;
    public static int dreamlampID;
    public static int dreamlampOnID;
    public static int weedwoodVineID;
    public static int blossomingWeedwoodVineID;
    public static int cryptWallID;
    public static int smoothGlassID;
    public static int villageLampID;
    public static int infusionTableID;
    public static int cellLampID;
    public static int barredDoorID;
    public static int firecrystalID;
    public static int firelightID;
    public static int hyrewoodID;
    public static int mintwoodLeavesID;
    public static int firewallID;
    public static int karosHeatTileRedID;
    public static int karosHeatTileGreenID;
    public static int karosCannonID;
    public static int helioticBeamID;
    public static int cryptFloorID;
    public static int firewoodID;
    public static int bacterialAcidID;
    public static int blockAcidID;
    public static int hallWallID;
    public static int wreckAltarID;
    public static int raglokAltarID;
    public static int karosAltarID;
    public static int lunicAltarID;
    public static int hiveWallID;
    public static int quadroticAltarID;
    public static int everstoneID;
    public static int lunicAcidID;
    public static int firewoodLeavesID;
    public static int hyrewoodLeavesID;
    public static int gemtopGreenID, DreamGrassID, DreamDirtID,
    gemtopPurpleID, greenDulahID, yellowDulahID, mintwoodID, lightFirewoodLeavesID,
    cracklespikeID, ferniteID, bulatobeID, shineGrassID, shimmerID, dreamglowID, hyrewoodVineID,
    chamberWallID, chamberWall1ID, chamberWall2ID, darkEverstoneID, whiteEverstoneID,
    karosBricksID, karosBricks2ID, hungerstone1ID, hungerstone2ID, biphronSpawnerID, gorgosionSpawnerID,
    duoSpawnerID, twinsSpawnerID, vermenousSpawnerID, dreamwreckerSpawnerID, lorgaSpawnerID, purpleFireID;

	public static void initConfig(FMLPreInitializationEvent event){
		Event = event;
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		
		//config.load();
		blockConfig();
		itemConfig();
		//config.save();
	}
	
	public static int addBlock(String Name){
		File file = new File(Event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);
		config.load();
		config.getBlock(Name, vetheaBlockID++ - (byte)256).getInt();
		config.save();
		return vetheaBlockID++;
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
		config.getItem(name, vetheaItemID++ - (byte)256).getInt();
		config.save();
		return vetheaItemID++;
	}
	
	public static void blockConfig(){
		DreamGrassID = addTerrainBlock("Vethea", "Dream Grass");
		DreamDirtID = addTerrainBlock("Vethea", "Dream Dirt");
		
		dreamstoneID = addBlock("DreamStone");
    	vetheaPortalID = addBlock("vetheaPortal");
        dreamwoodID = addBlock("dreamwood");
        dreamwoodLeavesID = addBlock("dreamwoodLeaves");
        dreambricksID = addBlock("dreambricks");
        lunastoneID = addBlock("lunastone");
        lunabricksID = addBlock("lunabricks");
        metalCagingID = addBlock("metalCaging");
        dreamlampID = addBlock("dreamlamp");
        dreamlampOnID = addBlock("dreamlampOn");
        weedwoodVineID = addBlock("weedwoodVine");
        blossomingWeedwoodVineID = addBlock("blossomingWeedwoodVine");
        cryptWallID = addBlock("cryptWall");
        smoothGlassID = addBlock("smoothGlass");
        villageLampID = addBlock("villageLamp");
        infusionTableID = addBlock("infusionTable");
        cellLampID = addBlock("cellLamp");
        barredDoorID = addBlock("barredDoor");
        firecrystalID = addBlock("firecrystal");
        firelightID = addBlock("firelight");
        hyrewoodID = addBlock("hyrewood");
        mintwoodLeavesID = addBlock("mintwoodLeaves");
        firewallID = addBlock("firewall");
        karosHeatTileRedID = addBlock("karosHeatTileRed");
        karosHeatTileGreenID = addBlock("karosHeatTileGreen");
        karosCannonID = addBlock("karosCannon");
        helioticBeamID = addBlock("helioticBeam");
        cryptFloorID = addBlock("cryptFloor");
        firewoodID = addBlock("firewood");
        chamberWallID = addBlock("chamberWall");
        chamberWall1ID = addBlock("chamberWall1");
        chamberWall2ID = addBlock("chamberWall2");
        bacterialAcidID = addBlock("bacterialAcid");
        gemtopPurpleID = addBlock("gemtops");
        yellowDulahID = addBlock("yellowDulah");
        blockAcidID = addBlock("acidBlock");
        hallWallID = addBlock("hallWall");
        wreckAltarID = addBlock("wreckAltar");
        raglokAltarID = addBlock("raglokAltar");
        karosAltarID = addBlock("karosAltar");
        lunicAltarID = addBlock("lunicAltar");
        hiveWallID = addBlock("hiveWall");
        quadroticAltarID = addBlock("quadroticAltar");
        everstoneID = addBlock("everstone");
        lunicAcidID = addBlock("lunicAcid");
        firewoodLeavesID = addBlock("firewoodLeaves");
        hyrewoodLeavesID = addBlock("hyrewoodLeaves");
        gemtopGreenID = addBlock("gemtopsGreen");
        greenDulahID = addBlock("greenDulah");
        mintwoodID = addBlock("mintwood");
        lightFirewoodLeavesID = addBlock("lightFirerwoodLeaves");
        cracklespikeID = addBlock("cracklespike");
        ferniteID = addBlock("fernite");
        bulatobeID = addBlock("bulatobe");
        shineGrassID = addBlock("shineGrass");
        shimmerID = addBlock("shimmer");
        dreamglowID = addBlock("dreamglow");
        hyrewoodVineID = addBlock("hyrewoodVine");
        dreambricks2ID = addBlock("dreambricks2");
        whiteEverstoneID = addBlock("whiteEverstone");
        darkEverstoneID = addBlock("darkEverstone");
        karosBricksID = addBlock("karosBricks");
        karosBricks2ID = addBlock("karosBricks2");
        biphronSpawnerID = addBlock("briphronSpawner");
        gorgosionSpawnerID = addBlock("gorgosionSpawner");
        twinsSpawnerID = addBlock("twinsSpawner");
        duoSpawnerID = addBlock("duoSpawner");
        vermenousSpawnerID = addBlock("vermenousSpawner");
        dreamwreckerSpawnerID = addBlock("dreamwreckerSpawner");
        lorgaSpawnerID = addBlock("lorgaSpawner");
        hungerstone1ID = addBlock("hungerstone1");
        hungerstone2ID = addBlock("hungerstone2");
        purpleFireID = addBlock("PurpleFire");
        
	}
	
	public static void itemConfig(){
		teakerDiskID = addItem("TeakerDisk");
        amthirmisDiskID = addItem("amthirmisDisk");
        darvenDiskID = addItem("darvenDisk");
        cermileDiskID = addItem("cermileDisk");
        pardimalDiskID = addItem("pardimalDisk");
        quadroticDiskID = addItem("quadroticDisk");
        karosDiskID = addItem("karosDisk");
        heliosisDiskID = addItem("heliosisDisk");
        arksianeDiskID = addItem("arksianeDisk");
        teakerHammerID = addItem("teakerHammer");
        amthirmisHammerID = addItem("AmthirmisHammer");
        darvenHammerID = addItem("darvenHammer");
        cermileHammerID = addItem("cermileHammer");
        pardimalHammerID = addItem("pardimalHammer");
        quadroticHammerID = addItem("quadroticHammer");
        karosHammerID = addItem("karosHammer");
        heliosisHammerID = addItem("heliosisHammer");
        arksianeHammerID = addItem("arksianeHammer");       
        teakerSwordID = addItem("teakerSword");
        amthirmisSwordID = addItem("AmthirmisSword");
        darvenSwordID = addItem("darvenSword");
        cermileSwordID = addItem("cermileSword");
        pardimalSwordID = addItem("pardimalSword");
        quadroticSwordID = addItem("quadroticSword");
        karosSwordID = addItem("karosSword");
        heliosisSwordID = addItem("heliosisSword");
        arksianeSwordID = addItem("arksianeSword");       
        teakerClawID = addItem("teakerClaw");
        amthirmisClawID = addItem("AmthirmisClaw");
        darvenClawID = addItem("darvenClaw");
        cermileClawID = addItem("cermileClaw");
        pardimalClawID = addItem("pardimalClaw");
        quadroticClawID = addItem("quadroticClaw");
        karosClawID = addItem("karosClaw");
        heliosisClawID = addItem("heliosisClaw");
        arksianeClawID = addItem("arksianeClaw");       
        teakerCannonID = addItem("teakerCannon");
        amthirmisCannonID = addItem("AmthirmisCannon");
        darvenCannonID = addItem("darvenCannon");
        cermileCannonID = addItem("cermileCannon");
        pardimalCannonID = addItem("pardimalCannon");
        quadroticCannonID = addItem("quadroticCannon");
        karosCannonItemID = addItem("karosCannon");
        heliosisCannonID = addItem("heliosisCannon");
        arksianeCannonID = addItem("arksianeCannon");      
        acidfireID = addItem("acidfire");    
        teakerBowID = addItem("teakerBow");
        amthirmisBowID = addItem("AmthirmisBow");
        darvenBowID = addItem("darvenBow");
        cermileBowID = addItem("cermileBow");
        pardimalBowID = addItem("pardimalBow");
        quadroticBowID = addItem("quadroticBow");
        karosBowID = addItem("karosBow");
        heliosisBowID = addItem("heliosisBow");
        arksianeBowID = addItem("arksianeBow");
        vetheanArrowID = addItem("vetheanArrow");
        vetheanArrow2ID = addItem("vetheanArrow2");
        vetheanWarArrowID = addItem("vetheanWarArrow");
        vetheanWrathArrowID = addItem("vetheanWrathArrow");
        vetheanHammerTemplateID = addItem("vetheanHammerTemplate");
        vetheanBackswordTemplateID = addItem("vetheanBackswordTemplate");
        vetheanBowTemplateID = addItem("vetheanBowTemplate");
        vetheanCannonTemplateID = addItem("vetheanCannonTemplate");
        vetheanClawTemplateID = addItem("vetheanClawTemplate");
        vetheanDiskTemplateID = addItem("vetheanDiskTemplate");
        vetheanStaffTemplateID = addItem("vetheanStaffTemplate");
        vetheanDegradedTemplateID = addItem("vetheanDegradedTemplate");
        vetheanFinishedTemplateID = addItem("vetheanFinishedTemplate");
        vetheanGlisteningTemplateID = addItem("vetheanGlisteningTemplate");
        vetheanDemonizedTemplateID = addItem("vetheanDemonizedTemplate");
        vetheanTormentedTemplateID = addItem("vetheanTormentedTemplate");
        honeysuckleID = addItem("honeysuckle");
        dreamCarrotID = addItem("dreamCarrot");
        dreamMelonID = addItem("dreamMelon");
        dreamPieID = addItem("dreamPie");
        dreamCakeID = addItem("dreamCake");  
        teakerLumpID = addItem("teakerLump");
        amthirmisLumpID = addItem("AmthirmisLump");
        darvenLumpID = addItem("darvenLump");
        cermileLumpID = addItem("cermileLump");
        pardimalLumpID = addItem("pardimalLump");
        quadroticLumpID = addItem("quadroticLump");
        karosLumpID = addItem("karosLump");
        heliosisLumpID = addItem("heliosisLump");
        arksianeLumpID = addItem("arksianeLump");
        dreamSweetsID = addItem("dreamSweets");
        dreamSoursID = addItem("dreamSours");       
        degradedHelmetMeleeID = addItem("degradedHelmetMelee");
        degradedHelmetRangedID = addItem("degradedHelmetRanged");
        degradedHelmetArcanaID = addItem("degradedHelmetArcana");
        degradedChestID = addItem("degradedChest");
        degradedLegsID = addItem("degradedLegs");
        degradedBootsID = addItem("degradedBoots");
        finishedHelmetMeleeID = addItem("finishedHelmetMelee");
        finishedHelmetRangedID = addItem("finishedHelmetRanged");
        finishedHelmetArcanaID = addItem("finishedHelmetArcana");
        finishedChestID = addItem("finishedChest");
        finishedLegsID = addItem("finishedLegs");
        finishedBootsID = addItem("finishedBoots");
        glisteningHelmetMeleeID = addItem("glisteningHelmetMelee");
        glisteningHelmetRangedID = addItem("glisteningHelmetRanged");
        glisteningHelmetArcanaID = addItem("glisteningHelmetArcana");
        glisteningChestID = addItem("glisteningChest");
        glisteningLegsID = addItem("glisteningLegs");
        glisteningBootsID = addItem("glisteningBoots");
        demonizedHelmetMeleeID = addItem("demonizedHelmetMelee");
        demonizedHelmetRangedID = addItem("demonizedHelmetRanged");
        demonizedHelmetArcanaID = addItem("demonizedHelmetArcana");
        demonizedChestID = addItem("demonizedChest");
        demonizedLegsID = addItem("demonizedLegs");
        demonizedBootsID = addItem("demonizedBoots");
        tormentedHelmetMeleeID = addItem("tormentedHelmetMelee");
        tormentedHelmetRangedID = addItem("tormentedHelmetRanged");
        tormentedHelmetArcanaID = addItem("tormentedHelmetArcana");
        tormentedChestID = addItem("tormentedChest");
        tormentedLegsID = addItem("tormentedLegs");
        tormentedBootsID = addItem("tormentedBoots");
        dirtyPearlsID = addItem("dirtyPearls");
        cleanPearlsID = addItem("cleanPearls");
        polishedPearlsID = addItem("polishedPearls");
        shinyPearlsID = addItem("shinyPearls");
        honeychunkID = addItem("honeychunk");
        rockChunksID = addItem("rockChunks");
        fyrossomID = addItem("fyrossom");
        heivaBeltID = addItem("heivaBelt");
        mooncloudID = addItem("mooncloud");
        wormChunksID = addItem("wormChunks");
        vhraakTeethID = addItem("vhraakTeeth");
        dreamflintID = addItem("dreamflint");
        moonclockID = addItem("moonclock");
        spinebackChunkID = addItem("spinebackChunk");
        spinebackCannonID = addItem("spinebackCannon");
        spinebackDiscID = addItem("spinebackDisc");
        spinebackHammerID = addItem("spinebackHammer");
        spinebackStaffID = addItem("spinebackStaff");
        everlightID = addItem("everlight");
        everbrightID = addItem("everbright");
        evernightID = addItem("evernight");
        eversightID = addItem("eversight");
        everfightID = addItem("everfight");
        everArrowID = addItem("everArrow");
        teakerStaffID = addItem("teakerStaff");
        amthirmisStaffID = addItem("AmthirmisStaff");
        darvenStaffID = addItem("darvenStaff");
        cermileStaffID = addItem("cermileStaff");
        pardimalStaffID = addItem("pardimalStaff");
        quadroticStaffID = addItem("quadroticStaff");
        karosStaffID = addItem("karosStaff");
        heliosisStaffID = addItem("heliosisStaff");
        arksianeStaffID = addItem("arksianeStaff");
        dreamPowderID = addItem("DreamPowder");
		barredDoorItemID = addItem("BarredDoorItem");
	}
	
}
