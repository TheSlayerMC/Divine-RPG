package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.item.ItemEvernight;
import net.divinerpg.item.ItemKarosDisk;
import net.divinerpg.vethea.item.ItemAmthirmisDisk;
import net.divinerpg.vethea.item.ItemArksianeDisk;
import net.divinerpg.vethea.item.ItemBarredDoor;
import net.divinerpg.vethea.item.ItemCermileDisk;
import net.divinerpg.vethea.item.ItemDarvenDisk;
import net.divinerpg.vethea.item.ItemDreamPowder;
import net.divinerpg.vethea.item.ItemDreamflint;
import net.divinerpg.vethea.item.ItemHeliosisDisk;
import net.divinerpg.vethea.item.ItemMoonclock;
import net.divinerpg.vethea.item.ItemPardimalDisk;
import net.divinerpg.vethea.item.ItemQuadroticDisk;
import net.divinerpg.vethea.item.ItemSpinebackDisc;
import net.divinerpg.vethea.item.ItemTeakerDisk;
import net.divinerpg.vethea.item.ItemVetheanBow;
import net.divinerpg.vethea.item.ItemVetheanCannon;
import net.divinerpg.vethea.item.ItemVetheanClaw;
import net.divinerpg.vethea.item.ItemVetheanEversight;
import net.divinerpg.vethea.item.ItemVetheanFood;
import net.divinerpg.vethea.item.ItemVetheanHammerSword;
import net.divinerpg.vethea.item.ItemVetheanHealingFood;
import net.divinerpg.vethea.item.ItemVetheanStaff;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;


public class VetheaItemHelper extends HelperBase{



	public static final Item teakerDisk = new ItemTeakerDisk(z.teakerDiskID, 4).registerTextures("TeakerDisc").setUnlocalizedName("Teaker Disk");
	public static final Item amthrimisDisk = new ItemAmthirmisDisk(z.amthirmisDiskID, 6).registerTextures("AmthirmisDisc").setUnlocalizedName("Amthirmis Disk");
	public static final Item darvenDisk = new ItemDarvenDisk(z.darvenDiskID, 9).registerTextures("DarvenDisc").setUnlocalizedName("Darven Disk");
	public static final Item cermileDisk = new ItemCermileDisk(z.cermileDiskID, 13).registerTextures("CermileDisc").setUnlocalizedName("Cermile Disk");
	public static final Item pardimalDisk = new ItemPardimalDisk(z.pardimalDiskID, 16).registerTextures("PardimalWarDisc").setUnlocalizedName("Pardimal Disk");
	public static final Item quadroticDisk = new ItemQuadroticDisk(z.quadroticDiskID, 20).registerTextures("QuadroticWarDisc").setUnlocalizedName("Quadrotic Disk");
	public static final Item karosDisk = new ItemKarosDisk(z.karosDiskID, 22).registerTextures("KarosWarDisc").setUnlocalizedName("Karos Disk");
	public static final Item heliosisDisk = new ItemHeliosisDisk(z.heliosisDiskID, 29).registerTextures("HeliosisWrathDisc").setUnlocalizedName("Heliosis Disk");
	public static final Item arksianeDisk = new ItemArksianeDisk(z.arksianeDiskID, 37).registerTextures("ArksianeWrathDisc").setUnlocalizedName("Arksiane Disk");       
	public static final Item spinebackDisk = new ItemSpinebackDisc(z.spinebackDiscID, 45).registerTextures("SpinebackDisc").setUnlocalizedName("Spineback Disk");    

	public static final Item teakerHammer = new ItemVetheanHammerSword(z.teakerHammerID, "teakerHammer", 6).registerTextures("TeakerHammer");
	public static final Item amthrimisHammer = new ItemVetheanHammerSword(z.amthirmisHammerID, "amthirmisHammer", 8).registerTextures("AmthirmisHammer");
	public static final Item darvenHammer = new ItemVetheanHammerSword(z.darvenHammerID, "darvenHammer", 12).registerTextures("DarvenHammer");
	public static final Item cermileHammer = new ItemVetheanHammerSword(z.cermileHammerID, "cermileHammer", 15).registerTextures("CermileHammer");
	public static final Item pardimalHammer = new ItemVetheanHammerSword(z.pardimalHammerID, "pardimalHammer", 19).registerTextures("PardimalWarHammer");
	public static final Item quadroticHammer = new ItemVetheanHammerSword(z.quadroticHammerID, "quadroticHammer", 24).registerTextures("QuadroticWarHammer");
	public static final Item karosHammer = new ItemVetheanHammerSword(z.karosHammerID, "karosHammer", 26).registerTextures("KarosWarHammer");
	public static final Item heliosisHammer = new ItemVetheanHammerSword(z.heliosisHammerID, "heliosisHammer", 33).registerTextures("HeliosisWrathHammer");
	public static final Item arksianeHammer = new ItemVetheanHammerSword(z.arksianeHammerID, "arksianeHammer", 39).registerTextures("ArksianeWrathHammer");
	//public static final Item spinebackHammer = new ItemVetheanHammerSword(z.spinebackHammerID, "spinebackHammer", 50).registerTextures("SpinebackHammer");

	public static final Item teakerSword = new ItemVetheanHammerSword(z.teakerSwordID, "teakerSword", 4).registerTextures("TeakerBacksword");
	public static final Item amthrimisSword = new ItemVetheanHammerSword(z.amthirmisSwordID, "amthirmisSword", 6).registerTextures("AmthirmisBacksword");
	public static final Item darvenSword = new ItemVetheanHammerSword(z.darvenSwordID, "darvenSword", 9).registerTextures("DarvenBacksword");
	public static final Item cermileSword = new ItemVetheanHammerSword(z.cermileSwordID, "cermileSword", 13).registerTextures("CermileBacksword");
	public static final Item pardimalSword = new ItemVetheanHammerSword(z.pardimalSwordID, "pardimalSword", 16).registerTextures("PardimalWarsword");
	public static final Item quadroticSword = new ItemVetheanHammerSword(z.quadroticSwordID, "quadroticSword", 20).registerTextures("QuadroticWarsword");
	public static final Item karosSword = new ItemVetheanHammerSword(z.karosSwordID, "karosSword", 22).registerTextures("KarosWarsword");
	public static final Item heliosisSword = new ItemVetheanHammerSword(z.heliosisSwordID, "heliosisSword", 29).registerTextures("HeliosisWrathsword");
	public static final Item arksianeSword = new ItemVetheanHammerSword(z.arksianeSwordID, "arksianeSword", 37).registerTextures("ArksianeWrathsword");

	public static final Item teakerClaw = new ItemVetheanClaw(z.teakerClawID, "teakerClaw", 3).registerTextures("TeakerClaw");
	public static final Item amthrimisClaw = new ItemVetheanClaw(z.amthirmisClawID, "amthirmisClaw", 5).registerTextures("AmthirmisClaw");
	public static final Item darvenClaw = new ItemVetheanClaw(z.darvenClawID, "darvenClaw", 7).registerTextures("DarvenClaw");
	public static final Item cermileClaw = new ItemVetheanClaw(z.cermileClawID, "cermileClaw", 8).registerTextures("CermileClaw");
	public static final Item pardimalClaw = new ItemVetheanClaw(z.pardimalClawID, "pardimalClaw", 12).registerTextures("PardimalWarClaw");
	public static final Item quadroticClaw = new ItemVetheanClaw(z.quadroticClawID, "quadroticClaw", 14).registerTextures("QuadroticWarClaw");
	public static final Item karosClaw = new ItemVetheanClaw(z.karosClawID, "karosClaw", 19).registerTextures("KarosWarClaw");
	public static final Item heliosisClaw = new ItemVetheanClaw(z.heliosisClawID, "heliosisClaw", 26).registerTextures("HeliosisWrathClaw");
	public static final Item arksianeClaw = new ItemVetheanClaw(z.arksianeClawID, "arksianeClaw", 35).registerTextures("AmthirmisClaw");

	public static final Item acidfire = new ItemDivineRPG(z.acidfireID).registerTextures("Acid").setUnlocalizedName("Acidfire").setCreativeTab(DivineRPG.Misc);
	public static final Item vetheanArrow = new ItemDivineRPG(z.vetheanArrowID).registerTextures("TeakerArrow").setUnlocalizedName("Teaker Arrow").setCreativeTab(DivineRPG.Misc);
	public static final Item vetheanArrow2 = new ItemDivineRPG(z.vetheanArrow2ID).registerTextures("DarvenArrow").setUnlocalizedName("Darven Arrow").setCreativeTab(DivineRPG.Misc);
	public static final Item vetheanWarArrow = new ItemDivineRPG(z.vetheanWarArrowID).registerTextures("PardimalArrow").setUnlocalizedName("Pardimal Arrow").setCreativeTab(DivineRPG.Misc);
	public static final Item vetheanWrathArrow = new ItemDivineRPG(z.vetheanWrathArrowID).registerTextures("KarosArrow").setUnlocalizedName("Karos Arrow").setCreativeTab(DivineRPG.Misc);
	public static final Item everArrow = new ItemDivineRPG(z.everArrowID).registerTextures("EverArrow").setUnlocalizedName("Ever Arrow").setCreativeTab(DivineRPG.Misc);

	public static final Item teakerBow = new ItemVetheanBow(z.teakerBowID, 0.5D, vetheanArrow, "TeakerBow", false, 0, 0).setUnlocalizedName("TeakerBow");
	public static final Item amthrimisBow = new ItemVetheanBow(z.amthirmisBowID, 0.7D, vetheanArrow, "AmthrimisBow", false, 0, 0).setUnlocalizedName("AmthirmisBow");
	public static final Item darvenBow = new ItemVetheanBow(z.darvenBowID, 1.1D, vetheanArrow2, "DarvenBow", false, 0, 0).setUnlocalizedName("DarvenBow");
	public static final Item cermileBow = new ItemVetheanBow(z.cermileBowID, 1.4D, vetheanArrow2, "CermileBow", false, 0, 0).setUnlocalizedName("CermileBow");
	public static final Item pardimalBow = new ItemVetheanBow(z.pardimalBowID, 1.8D, vetheanWarArrow, "PardimalBow", false, 0, 0).setUnlocalizedName("PardimalWarBow");
	public static final Item quadroticBow = new ItemVetheanBow(z.quadroticBowID, 2.1D, vetheanWarArrow, "QuadroticBow", false, 0, 0).setUnlocalizedName("QuadroticWarBow");
	public static final Item karosBow = new ItemVetheanBow(z.karosBowID, 2.3D, vetheanWrathArrow, "KarosBow", false, 0, 0).setUnlocalizedName("KarosWarBow");
	public static final Item heliosisBow = new ItemVetheanBow(z.heliosisBowID, 2.8D, vetheanWrathArrow, "HeliosisBow", false, 0, 0).setUnlocalizedName("HeliosisWrathBow");
	public static final Item arksianeBow = new ItemVetheanBow(z.arksianeBowID, 3.6D, vetheanWrathArrow, "ArksianeBow", false, 0, 0).setUnlocalizedName("ArksianeWrathBow");

	public static final Item dreamPowder = new ItemDreamPowder(z.dreamPowderID).registerTextures("DreamPowder").setUnlocalizedName("DreamPowder");

	public static final Item vetheanHammerTemplate = new ItemDivineRPG(z.vetheanHammerTemplateID).registerTextures("HammerTemplate").setUnlocalizedName("vetheanHammerTemplate");
	public static final Item vetheanBackswordTemplate = new ItemDivineRPG(z.vetheanBackswordTemplateID).registerTextures("BackswordTemplate").setUnlocalizedName("vetheanBackswordTemplate");
	public static final Item vetheanBowTemplate = new ItemDivineRPG(z.vetheanBowTemplateID).registerTextures("BowTemplate").setUnlocalizedName("vetheanBowTemplate");
	public static final Item vetheanCannonTemplate = new ItemDivineRPG(z.vetheanCannonTemplateID).registerTextures("CannonTemplate").setUnlocalizedName("vetheanCannonTemplate");
	public static final Item vetheanClawTemplate = new ItemDivineRPG(z.vetheanClawTemplateID).registerTextures("ClawTemplate").setUnlocalizedName("vetheanClawTemplate");
	public static final Item vetheanDiskTemplate = new ItemDivineRPG(z.vetheanDiskTemplateID).registerTextures("DiscTemplate").setUnlocalizedName("vetheanDiskTemplate");
	public static final Item vetheanStaffTemplate = new ItemDivineRPG(z.vetheanStaffTemplateID).registerTextures("StaffTemplate").setUnlocalizedName("vetheanStaffTemplate");
	public static final Item vetheanDegradedTemplate = new ItemDivineRPG(z.vetheanDegradedTemplateID).registerTextures("DegradedTemplate").setUnlocalizedName("vetheanDegradedTemplate");
	public static final Item vetheanFinishedTemplate = new ItemDivineRPG(z.vetheanFinishedTemplateID).registerTextures("FinishedTemplate").setUnlocalizedName("vetheanFinishedTemplate");
	public static final Item vetheanGlisteningTemplate = new ItemDivineRPG(z.vetheanGlisteningTemplateID).registerTextures("GlisteningTemplate").setUnlocalizedName("vetheanGlisteningTemplate");
	public static final Item vetheanDemonizedTemplate = new ItemDivineRPG(z.vetheanDemonizedTemplateID).registerTextures("DemonizedTemplate").setUnlocalizedName("vetheanDemonizedTemplate");
	public static final Item vetheanTormentedTemplate = new ItemDivineRPG(z.vetheanTormentedTemplateID).registerTextures("DegradedTemplate").setUnlocalizedName("vetheanTormentedTemplate");

	public static final Item teakerLump = new ItemDivineRPG(z.teakerLumpID).registerTextures("TeakerLump").setUnlocalizedName("TeakerLump");
	public static final Item amthrimisLump = new ItemDivineRPG(z.amthirmisLumpID).registerTextures("AmthirmisLump").setUnlocalizedName("AmthrimisLump");
	public static final Item darvenLump = new ItemDivineRPG(z.darvenLumpID).registerTextures("DarvenLump").setUnlocalizedName("DarvenLump");
	public static final Item cermileLump = new ItemDivineRPG(z.cermileLumpID).registerTextures("CermileLump").setUnlocalizedName("CermileLump");
	public static final Item pardimalLump = new ItemDivineRPG(z.pardimalLumpID).registerTextures("PardimalLump").setUnlocalizedName("pardimalLump");
	public static final Item quadroticLump = new ItemDivineRPG(z.quadroticLumpID).registerTextures("QuadroticLump").setUnlocalizedName("quadroticLump");
	public static final Item karosLump = new ItemDivineRPG(z.karosLumpID).registerTextures("KarosLump").setUnlocalizedName("karosLump");
	public static final Item heliosisLump = new ItemDivineRPG(z.heliosisLumpID).registerTextures("HeliosisLump").setUnlocalizedName("heliosisLump");
	public static final Item arksianeLump = new ItemDivineRPG(z.arksianeLumpID).registerTextures("ArksianeLump").setUnlocalizedName("arksaineLump");

	public static final Item honeysuckle = new ItemVetheanFood(z.honeysuckleID, 1, 0.2F, true).registerTextures("Honeysuckle").setUnlocalizedName("honeysuckle");
	public static final Item dreamCarrot = new ItemVetheanFood(z.dreamCarrotID, 3, 0.4F, true).registerTextures("DreamCarrot").setUnlocalizedName("dreamCarrot");
	public static final Item dreamMelon = new ItemVetheanFood(z.dreamMelonID, 6, 0.6F, true).registerTextures("DreamMelon").setUnlocalizedName("dreamMelon");
	public static final Item dreamPie = new ItemVetheanFood(z.dreamPieID, 4, 0.8F, true).registerTextures("DreamPie").setUnlocalizedName("dreamPie");
	public static final Item dreamCake = new ItemVetheanFood(z.dreamCakeID, 8, 0.8F, true).registerTextures("DreamCake").setUnlocalizedName("dreamCake");

	public static final Item dreamSweets = new ItemVetheanHealingFood(z.dreamSweetsID, 0, 0F, false, 2).registerTextures("DreamSweets").setUnlocalizedName("dreamSweets");
	public static final Item dreamSours = new ItemVetheanHealingFood(z.dreamSoursID, 0, 0F, false, 8).registerTextures("DreamSours").setUnlocalizedName("dreamSours");

	public static final Item dirtyPearls = new ItemDivineRPG(z.dirtyPearlsID).registerTextures("DirtyPearls").setUnlocalizedName("dirtyPearls");
	public static final Item cleanPearls = new ItemDivineRPG(z.cleanPearlsID).registerTextures("CleanPearls").setUnlocalizedName("cleanPearls");
	public static final Item polishedPearls = new ItemDivineRPG(z.polishedPearlsID).registerTextures("PolishedPearls").setUnlocalizedName("polishedPearls");
	public static final Item shinyPearls = new ItemDivineRPG(z.shinyPearlsID).registerTextures("ShinyPearls").setUnlocalizedName("shinyPearls");

	public static final Item honeychunk = new ItemDivineRPG(z.honeychunkID).registerTextures("Honeysuckle").setUnlocalizedName("honeychunk");
	public static final Item rockChunks = new ItemDivineRPG(z.rockChunksID).registerTextures("RockChunks").setUnlocalizedName("rockChunks");
	//public static final Item fyrossom = new ItemDivineRPG(z.fyrossomID).registerTextures("Fyrossom").setUnlocalizedName("fyrossom");
	public static final Item heivaBelt = new ItemDivineRPG(z.heivaBeltID).registerTextures("BandOfHeviaHunting").setUnlocalizedName("heivaBelt");
	public static final Item mooncloud = new ItemDivineRPG(z.mooncloudID).registerTextures("MoonCloud").setUnlocalizedName("mooncloud");
	//public static final Item wormChunks = new ItemDivineRPG(z.wormChunksID).registerTextures("WormChunk").setUnlocalizedName("wormChunk");
	//public static final Item vhraakTeeth = new ItemDivineRPG(z.vhraakTeethID).registerTextures("VhraakTeeth").setUnlocalizedName("vhraakTeeth");

	public static final Item dreamflint = new ItemDreamflint(z.dreamflintID).registerTextures("DreamFlint").setUnlocalizedName("dreamflint");
	public static final Item moonclock = new ItemMoonclock(z.moonclockID).registerTextures("MoonClock").setUnlocalizedName("moonclock");
	//public static final Item spinebackChunk = new ItemSpinebackChunk(z.spinebackChunkID).registerTextures("SpinebackChunk").setUnlocalizedName("spinebackChunk");

	public static final Item teakerCannon = new ItemVetheanCannon(z.teakerCannonID, 3, "TeakerCannon").registerTextures("TeakerCannon");
	public static final Item amthrimisCannon = new ItemVetheanCannon(z.amthirmisCannonID, 5, "amthirmisCannon").registerTextures("AmthirmisCannon");
	public static final Item darvenCannon = new ItemVetheanCannon(z.darvenCannonID, 8, "darvenCannon").registerTextures("DarvenCannon");
	public static final Item cermileCannon = new ItemVetheanCannon(z.cermileCannonID, 12, "cermileCannon").registerTextures("CermileCannon");
	public static final Item pardimalCannon = new ItemVetheanCannon(z.pardimalCannonID, 15, "pardimalCannon").registerTextures("PardimalWarCannon");
	public static final Item quadroticCannon = new ItemVetheanCannon(z.quadroticCannonID, 19, "quadroticCannon").registerTextures("QuadroticWarCannon");
	public static final Item karosCannonItem = new ItemVetheanCannon(z.karosCannonItemID, 21, "karosCannonItem").registerTextures("KarosWarCannon");
	public static final Item heliosisCannon = new ItemVetheanCannon(z.heliosisCannonID, 28, "heliosisCannon").registerTextures("HeliosisWrathCannon");
	public static final Item arksianeCannon = new ItemVetheanCannon(z.arksianeCannonID, 36, "arksianeCannon").registerTextures("ArksianeWrathCannon");

	public static final Item eversight = new ItemVetheanEversight(z.eversightID, 42, "eversight").registerTextures("Eversight");
	public static final Item everlight = new ItemVetheanHammerSword(z.everlightID, "everlight", 44).registerTextures("Everlight");
	public static final Item everbright = new ItemVetheanClaw(z.everbrightID, "everbright", 42).registerTextures("Everbright");
	public static final Item everfight = new ItemVetheanBow(z.everfightID, 4.6D, everArrow, "everfight", false, 25, 25).setUnlocalizedName("Everfright");
	public static final Item evernight = new ItemEvernight(z.evernightID, 115, 200).registerTextures("Evernight").setUnlocalizedName("evernight");

	public static final Item teakerStaff = new ItemVetheanStaff(z.teakerStaffID, 3, 10).registerTextures("TeakerStaff").setUnlocalizedName("TeakerStaff");
	public static final Item amthrimisStaff = new ItemVetheanStaff(z.amthirmisStaffID, 5, 10).registerTextures("AmthirmisStaff").setUnlocalizedName("amthirmisStaff");
	public static final Item darvenStaff = new ItemVetheanStaff(z.darvenStaffID, 8, 10).registerTextures("DarvenStaff").setUnlocalizedName("darvenStaff");
	public static final Item cermileStaff = new ItemVetheanStaff(z.cermileStaffID, 12, 10).registerTextures("CermileStaff").setUnlocalizedName("cermileStaff");
	public static final Item pardimalStaff = new ItemVetheanStaff(z.pardimalStaffID, 15, 10).registerTextures("PardimalWarStaff").setUnlocalizedName("pardimalStaff");
	public static final Item quadroticStaff = new ItemVetheanStaff(z.quadroticStaffID, 19, 10).registerTextures("QuadroticWarStaff").setUnlocalizedName("quadroticStaff");
	public static final Item karosStaff = new ItemVetheanStaff(z.karosStaffID, 21, 10).registerTextures("KarosWarStaff").setUnlocalizedName("karosStaffItem");
	public static final Item heliosisStaff = new ItemVetheanStaff(z.heliosisStaffID, 28, 10).registerTextures("HeliosisWrathStaff").setUnlocalizedName("heliosisStaff");
	public static final Item arksianeStaff = new ItemVetheanStaff(z.arksianeStaffID, 36, 10).registerTextures("ArksianeWrathStaff").setUnlocalizedName("arksianeStaff");
	public static final Item spinebackStaff = new ItemVetheanStaff(z.spinebackStaffID, 50, 10).registerTextures("SpinebackStaff").setUnlocalizedName("spinebackStaff");

	public static final Item BarredDoor = new ItemBarredDoor(z.barredDoorItemID, Material.wood).setCreativeTab(DivineRPG.Blocks).setUnlocalizedName("BarredDoor");

	/*public static final Item degradedHelmetMelee = new ItemVetheanArmor(4453, degradedRender, "DHM", 0, 15, "Melee", "").setUnlocalizedName("degradedHelmetMelee").setCreativeTab(DivineRPG.Armor);
	public static final Item degradedHelmetRanged = new ItemVetheanArmor(4454, degradedRender, "DMR", 0, 15, "Ranged", "").setUnlocalizedName("degradedHelmetRanged").setCreativeTab(DivineRPG.Armor);
	public static final Item degradedHelmetArcana = new ItemVetheanArmor(4456, degradedRender, "DHA", 0, 15, "Arcana", "").setUnlocalizedName("degradedHelmetArcana").setCreativeTab(DivineRPG.Armor);
	public static final Item degradedChest = new ItemVetheanArmor(4457, degradedRender, "DC", 1, 15, "", "").setUnlocalizedName("degradedChest").setCreativeTab(DivineRPG.Armor);
	public static final Item degradedLegs = new ItemVetheanArmor(4459, degradedRender, "DL", 2, 15, "", "").setUnlocalizedName("degradedLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item degradedBoots = new ItemVetheanArmor(4460, degradedRender, "DB", 3, 15, "", "").setUnlocalizedName("degradedBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item finishedHelmetMelee = new ItemVetheanArmor(4461, finishedRender, "", 0, 30, "Melee", "").setUnlocalizedName("finishedHelmetMelee").setCreativeTab(DivineRPG.Armor);
	public static final Item finishedHelmetRanged = new ItemVetheanArmor(4461, finishedRender, "", 0, 30, "Ranged", "").setUnlocalizedName("finishedHelmetRanged").setCreativeTab(DivineRPG.Armor);
	public static final Item finishedHelmetArcana = new ItemVetheanArmor(4462, finishedRender, "", 0, 30, "Arcana", "").setUnlocalizedName("finishedHelmetArcana").setCreativeTab(DivineRPG.Armor);
	public static final Item finishedChest = new ItemVetheanArmor(4463, finishedRender, "", 1, 30, "", "").setUnlocalizedName("finishedChest").setCreativeTab(DivineRPG.Armor);
	public static final Item finishedLegs = new ItemVetheanArmor(4464, finishedRender, "", 2, 30, "", "").setUnlocalizedName("finishedLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item finishedBoots = new ItemVetheanArmor(4465, finishedRender, "", 3, 30, "", "").setUnlocalizedName("finishedBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item glisteningHelmetMelee = new ItemVetheanArmor(4466, glisteningRender, "", 0, 45, "Melee", "+3 Melee Damage3").setUnlocalizedName("glisteningHelmetMelee").setCreativeTab(DivineRPG.Armor);
	public static final Item glisteningHelmetRanged = new ItemVetheanArmor(4467, glisteningRender, "", 0, 45, "Ranged", "1.4x Movement Speed").setUnlocalizedName("glisteningHelmetRanged").setCreativeTab(DivineRPG.Armor);
	public static final Item glisteningHelmetArcana = new ItemVetheanArmor(4468, glisteningRender, "", 0, 45, "Arcana", "2x Jump Height").setUnlocalizedName("glisteningHelmetArcana").setCreativeTab(DivineRPG.Armor);
	public static final Item glisteningChest = new ItemVetheanArmor(4469, glisteningRender, "", 1, 45, "", "").setUnlocalizedName("glisteningChest").setCreativeTab(DivineRPG.Armor);
	public static final Item glisteningLegs = new ItemVetheanArmor(4470, glisteningRender, "", 2, 45, "", "").setUnlocalizedName("glisteningLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item glisteningBoots = new ItemVetheanArmor(4471, glisteningRender, "", 3, 45, "", "").setUnlocalizedName("glisteningBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item demonizedHelmetMelee = new ItemVetheanArmor(4472, demonizedRender, "", 0, 55, "Melee", "+6 Melee Damage").setUnlocalizedName("demonizedHelmetMelee").setCreativeTab(DivineRPG.Armor);
	public static final Item demonizedHelmetRanged = new ItemVetheanArmor(4473, demonizedRender, "", 0, 55, "Ranged", "1.8X Movement Speed").setUnlocalizedName("demonizedHelmetRanged").setCreativeTab(DivineRPG.Armor);
	public static final Item demonizedHelmetArcana = new ItemVetheanArmor(4474, demonizedRender, "", 0, 55, "Arcana", "3x Jump Height").setUnlocalizedName("demonizedHelmetArcana").setCreativeTab(DivineRPG.Armor);
	public static final Item demonizedChest = new ItemVetheanArmor(4475, demonizedRender, "", 1, 55, "", "").setUnlocalizedName("demonizedChest").setCreativeTab(DivineRPG.Armor);
	public static final Item demonizedLegs = new ItemVetheanArmor(4476, demonizedRender, "", 2, 55, "", "").setUnlocalizedName("demonizedLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item demonizedBoots = new ItemVetheanArmor(4477, demonizedRender, "", 3, 55, "", "").setUnlocalizedName("demonizedBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item tormentedHelmetMelee = new ItemVetheanArmor(4478, tormentedRender, "", 0, 70, "Melee", "+9 Melee Damage").setUnlocalizedName("tormentedHelmetMelee").setCreativeTab(DivineRPG.Armor);
	public static final Item tormentedHelmetRanged = new ItemVetheanArmor(4479, tormentedRender, "", 0, 70, "Ranged", "2x Movement Speed").setUnlocalizedName("tormentedHelmetRanged").setCreativeTab(DivineRPG.Armor);
	public static final Item tormentedHelmetArcana = new ItemVetheanArmor(4480, tormentedRender, "", 0, 70, "Arcana", "4x Jump Height").setUnlocalizedName("tormentedHelmetArcana").setCreativeTab(DivineRPG.Armor);
	public static final Item tormentedChest = new ItemVetheanArmor(4481, tormentedRender, "", 1, 70, "", "").setUnlocalizedName("tormentedChest").setCreativeTab(DivineRPG.Armor);
	public static final Item tormentedLegs = new ItemVetheanArmor(4482, tormentedRender, "", 2, 70, "", "").setUnlocalizedName("tormentedLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item tormentedBoots = new ItemVetheanArmor(4483, tormentedRender, "", 3, 70, "", "").setUnlocalizedName("tormentedBoots").setCreativeTab(DivineRPG.Armor);	
*/

	public static void addNames(){
		addItem(dreamflint, "Dream Flint");
		addItem(moonclock, "Moon Clock");
		addItem(spinebackDisk, "Spineback Disk");
		addItem(spinebackStaff, "Spineback Staff");
		addItem(eversight, "Eversight");
		addItem(everfight, "Everfright");
		addItem(BarredDoor, "Barred Door");
		addItem(teakerBow, "Teaker Bow");
		addItem(amthrimisBow, "Amthirmis Bow"); 
		addItem(darvenBow, "Darven Bow");
		addItem(cermileBow, "Cermile Bow");
		addItem(pardimalBow, "Pardimal WarBow");
		addItem(quadroticBow, "Quadrotic WarBow");
		addItem(karosBow, "Karos WarBow");
		addItem(heliosisBow, "Heliosis WrathBow");
		addItem(arksianeBow, "Arksiane  WrathBow");

		addItem(teakerHammer, "Teaker Hammer");
		addItem(amthrimisHammer, "Amthirmis Hammer");
		addItem(darvenHammer, "Darven Hammer");
		addItem(cermileHammer, "Cermile Hammer");
		addItem(pardimalHammer, "Pardimal WarHammer");
		addItem(quadroticHammer, "Quadrotic WarHammer");
		addItem(karosHammer, "Karos WarHammer");
		addItem(heliosisHammer, "Heliosis WrathHammer");
		addItem(arksianeHammer, "Arksiane  WrathHammer");
		// addItem(spinebackHammer, "Spineback  Hammer");


		addItem(teakerSword, "Teaker Sword");
		addItem(amthrimisSword, "Amthirmis Sword");
		addItem(darvenSword, "Darven Sword");
		addItem(cermileSword, "Cermile Sword");
		addItem(pardimalSword, "Pardimal Sword");
		addItem(quadroticSword, "Quadrotic Sword");
		addItem(karosSword, "Karos Sword");
		addItem(heliosisSword, "Heliosis Sword");
		addItem(arksianeSword, "Arksiane Sword");

		addItem(teakerSword, "Teaker Backsword");
		addItem(amthrimisSword, "Amthirmis Backsword");
		addItem(darvenSword, "Darven Backsword");
		addItem(cermileSword, "Cermile Backsword");
		addItem(pardimalSword, "Pardimal Warsword");
		addItem(quadroticSword, "Quadrotic Warsword");
		addItem(karosSword, "Karos Warsword");
		addItem(heliosisSword, "Heliosis Wrathsword");
		addItem(arksianeSword, "Arksiane  Wrathsword");

		addItem(teakerDisk, "Teaker Disc");
		addItem(amthrimisDisk, "Amthirmis Disc");
		addItem(darvenDisk, "Darven Disc");
		addItem(cermileDisk, "Cermile Disc");
		addItem(pardimalDisk, "Pardimal WarDisc");
		addItem(quadroticDisk, "Quadrotic WarDisc");
		addItem(karosDisk, "Karos WarDisc");
		addItem(heliosisDisk, "Heliosis WrathDisc");
		addItem(arksianeDisk, "Arksiane  WrathDisc");


		addItem(teakerStaff, "Teaker Staff");
		addItem(amthrimisStaff, "Amthirmis Staff");
		addItem(darvenStaff, "Darven Staff");
		addItem(cermileStaff, "Cermile Staff");
		addItem(pardimalStaff, "Pardimal WarStaff");
		addItem(quadroticStaff, "Quadrotic WarStaff");
		addItem(karosStaff, "Karos WarStaff");
		addItem(heliosisStaff, "Heliosis WrathStaff");
		addItem(arksianeStaff, "Arksiane WrathStaff");


		addItem(teakerCannon, "Teaker Cannon");
		addItem(amthrimisCannon, "Amthirmis Cannon");
		addItem(darvenCannon, "Darven Cannon");
		addItem(cermileCannon, "Cermile Cannon");
		addItem(pardimalCannon, "Pardimal WarCannon");
		addItem(quadroticCannon, "Quadrotic WarCannon");
		addItem(karosCannonItem, "Karos WarCannon");
		addItem(heliosisCannon, "Heliosis WrathCannon");
		addItem(arksianeCannon, "Arksiane  WrathCannon");


		addItem(teakerClaw, "Teaker Claw");
		addItem(amthrimisClaw, "Amthirmis Claw");
		addItem(darvenClaw, "Darven Claw");
		addItem(cermileClaw, "Cermile Claw");
		addItem(pardimalClaw, "Pardimal WarClaw");
		addItem(quadroticClaw, "Quadrotic WarClaw");
		addItem(karosClaw, "Karos WarClaw");
		addItem(heliosisClaw, "Heliosis WrathClaw");
		addItem(arksianeClaw, "Arksiane  WrathClaw");

		addItem(teakerLump, "Teaker Lump");
		addItem(amthrimisLump, "Amthirmis Lump");
		addItem(darvenLump, "Darven Lump");
		addItem(cermileLump, "Cermile Lump");
		addItem(pardimalLump, "Pardimal Lump");
		addItem(quadroticLump, "Quadrotic Lump");
		addItem(karosLump, "Karos Lump");
		addItem(heliosisLump, "Heliosis Lump");
		addItem(arksianeLump, "Arksiane  Lump");

		addItem(acidfire, "Acid");
		/*addItem(degradedHelmetArcana, "Degraded Hood");
		addItem(degradedHelmetRanged, "Degraded Mask");
		addItem(degradedHelmetMelee, "Degraded Helmet");
		addItem(degradedChest, "Degraded Body");
		addItem(degradedLegs, "Degraded Legs");
		addItem(degradedBoots, "Degraded Boots");

		addItem(finishedHelmetArcana, "Finished Hood");
		addItem(finishedHelmetRanged, "Finished Mask");
		addItem(finishedHelmetMelee, "Finished Helmet");
		addItem(finishedChest, "Finished Body");
		addItem(finishedLegs, "Finished Legs");
		addItem(finishedBoots, "Finished Boots");

		addItem(glisteningHelmetArcana, "Glistening Hood");
		addItem(glisteningHelmetRanged, "Glistening Mask");
		addItem(glisteningHelmetMelee, "Glistening Helmet");
		addItem(glisteningChest, "Glistening Body");
		addItem(glisteningLegs, "Glistening Legs");
		addItem(glisteningBoots, "Glistening Boots");

		addItem(demonizedHelmetArcana, "Demonized Hood");
		addItem(demonizedHelmetRanged, "Demonized Mask");
		addItem(demonizedHelmetMelee, "Demonized Helmet");
		addItem(demonizedChest, "Demonized Body");
		addItem(demonizedLegs, "Demonized Legs");
		addItem(demonizedBoots, "Demonized Boots");

		addItem(tormentedHelmetArcana, "Tormented Hood");
		addItem(tormentedHelmetRanged, "Tormented Mask");
		addItem(tormentedHelmetMelee, "Tormented Helmet");
		addItem(tormentedChest, "Tormented Body");
		addItem(tormentedLegs, "Tormented Legs");
		addItem(tormentedBoots, "Tormented Boots");*/

		addItem(dreamCarrot, "Dream Carrot");
		addItem(dreamPie, "Dream Pie");
		addItem(dreamCake, "Dream Cake");
		addItem(dreamMelon, "Dream Melon");
		addItem(dreamSweets, "Dream Sweets");
		addItem(dreamSours, "Dream Sours");
		addItem(dirtyPearls, "Dirty Pearls");
		addItem(cleanPearls, "Clean Pearls");
		addItem(polishedPearls, "Polished Pearls");
		addItem(shinyPearls, "Shiny Pearls");
		addItem(everlight, "Everlight");
		//addItem(eversight, "Eversight");
		addItem(evernight, "Evernight");
		// addItem(everfight, "Everfright");
		addItem(everbright, "Everbright");
		addItem(vetheanBowTemplate, "Bow Template");
		addItem(vetheanBackswordTemplate, "Backsword Template");
		addItem(vetheanDiskTemplate, "Disc Template");
		addItem(vetheanCannonTemplate, "Cannon Template");
		addItem(vetheanClawTemplate, "Claw Template");
		addItem(vetheanDegradedTemplate, "Degraded Template");
		addItem(vetheanTormentedTemplate, "Tormented Template");
		addItem(vetheanDemonizedTemplate, "Demonized Template");
		addItem(vetheanGlisteningTemplate, "Glistening Template");
		addItem(vetheanFinishedTemplate, "Finished Template");
		addItem(vetheanHammerTemplate, "Hammer Template");
		addItem(vetheanStaffTemplate, "Staff Template");

		addItem(honeysuckle, "Honeysuckle");
		addItem(honeychunk, "Honey Chunk");
		//addItem(fyrossom, "Fyrossom");
		addItem(mooncloud, "Mooncloud");
		addItem(rockChunks, "Rock Chunks");

		//addItem(dreamflint, "Dream Flint");
		//addItem(moonclock, "Moon Clock");
		addItem(dreamPowder, "Dream Powder");
		addItem(heivaBelt, "Band of Heiva Hunting");

		addItem(vetheanArrow, "Teaker Arrows");
		addItem(vetheanArrow2, "Darven Arrows");
		addItem(vetheanWarArrow, "Pardimal Arrows");
		addItem(vetheanWrathArrow, "Karos Arrows");
		addItem(everArrow, "Ever Arrows");
	}
}
