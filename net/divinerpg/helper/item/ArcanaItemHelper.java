package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.arcana.item.ItemAquaMarine;
import net.divinerpg.arcana.item.ItemArcanaPotion;
import net.divinerpg.arcana.item.ItemArcaniumSaber;
import net.divinerpg.arcana.item.ItemCaptiansSparkeler;
import net.divinerpg.arcana.item.ItemChargedCollector;
import net.divinerpg.arcana.item.ItemEnderScepter;
import net.divinerpg.arcana.item.ItemFirefly;
import net.divinerpg.arcana.item.ItemFyracryxSpawner;
import net.divinerpg.arcana.item.ItemGolemOfRejuvSpawner;
import net.divinerpg.arcana.item.ItemGrenade;
import net.divinerpg.arcana.item.ItemGrenadeLauncher;
import net.divinerpg.arcana.item.ItemLamona;
import net.divinerpg.arcana.item.ItemMeriksMissile;
import net.divinerpg.arcana.item.ItemOrbOfLight;
import net.divinerpg.arcana.item.ItemOreDoor1;
import net.divinerpg.arcana.item.ItemOreDoor2;
import net.divinerpg.arcana.item.ItemOreDoor3;
import net.divinerpg.arcana.item.ItemOreDoor4;
import net.divinerpg.arcana.item.ItemParatikuSpawner;
import net.divinerpg.arcana.item.ItemPinFly;
import net.divinerpg.arcana.item.ItemReflector;
import net.divinerpg.arcana.item.ItemSeimerSpawner;
import net.divinerpg.arcana.item.ItemShadowSword;
import net.divinerpg.arcana.item.ItemStaffOfEnrichment;
import net.divinerpg.arcana.item.ItemStarfall;
import net.divinerpg.arcana.item.ItemStormSword;
import net.divinerpg.arcana.item.ItemTarBucket;
import net.divinerpg.arcana.item.ItemWizardBook;
import net.divinerpg.arcana.item.ItemWraithbane;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.base.ItemDivineRPGSeeds;
import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.item.ItemBaseArmor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ArcanaItemHelper extends HelperBase  {

	public static final Item weakArcanaPotion = new ItemArcanaPotion(y.weakArcanaPotionID).registerTextures("WeakArcanaPotion").setUnlocalizedName("WeakArcana").setCreativeTab(DivineRPG.Misc);
	public static final Item strongArcanaPotion = new ItemArcanaPotion(y.strongArcanaPotionID).registerTextures("StrongArcanaPotion").setUnlocalizedName("StrongArcana").setCreativeTab(DivineRPG.Misc);
	public static final Item fireStockItem = new ItemDivineRPG(y.fireStockItemID).registerTextures("FireStock").setUnlocalizedName("fireStockItem").setCreativeTab(DivineRPG.Misc);
	public static final Item fireStockSeeds = new ItemDivineRPGSeeds(x.fireStockSeedsID, ArcanaBlockHelper.fireStock.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("FireStockSeeds").setUnlocalizedName("fireStockSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item pinFlyItem = new ItemPinFly(x.pinFlyItemID, 2, 0.3F, false).registerTextures("PinFly").setUnlocalizedName("pinflyItem").setCreativeTab(DivineRPG.Misc);
	public static final Item pinFlySeeds = new ItemDivineRPGSeeds(x.pinFlySeedsID, ArcanaBlockHelper.pinFly.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("PinFlySeeds").setUnlocalizedName("pinFlySeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item hitchakItem = new ItemDivineRPGFood(y.hitchakItemID, 2, 3.0F, false).registerTextures("Hitchak").setUnlocalizedName("hitchakItem").setCreativeTab(DivineRPG.Misc);
	public static final Item hitchakSeeds = new ItemDivineRPGSeeds(x.hitchakSeedsID, ArcanaBlockHelper.hitchak.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("HitchakSeeds").setUnlocalizedName("hitchakSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item eucalyptusRootSeeds = new ItemDivineRPGSeeds(x.eucalyptusRootSeedsID, ArcanaBlockHelper.eucalyptusRoot.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("EucalyptusRootSeeds").setUnlocalizedName("eucalyptusRootSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item veiloItem = new ItemDivineRPG(y.veiloItemID).registerTextures("Veilo").setUnlocalizedName("veiloItem").setCreativeTab(DivineRPG.Misc);
	public static final Item veiloSeeds = new ItemDivineRPGSeeds(x.veiloSeedsID, ArcanaBlockHelper.veilo.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("VeiloSeeds").setUnlocalizedName("veiloSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item lamonaItem = new ItemLamona(x.lamonaItemID).registerTextures("Lamona").setUnlocalizedName("lamonaItem").setCreativeTab(DivineRPG.Misc);
	public static final Item lamonaSeeds = new ItemDivineRPGSeeds(x.lamonaSeedsID, ArcanaBlockHelper.lamona.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("LamonaSeeds").setUnlocalizedName("lamonaSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item aquamarineItem = new ItemAquaMarine(x.aquamarineItemID).registerTextures("Aquamarine").setUnlocalizedName("aquamarineItem").setCreativeTab(DivineRPG.Misc);
	public static final Item aquamarineSeeds = new ItemDivineRPGSeeds(x.aquamarineSeedsID, ArcanaBlockHelper.aquamarine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("AquamarineSeeds").setUnlocalizedName("aquamarineSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item marsineItem = new ItemDivineRPG(y.marsineItemID).registerTextures("Marasine").setUnlocalizedName("marsineItem").setCreativeTab(DivineRPG.Misc);
	public static final Item marsineSeeds = new ItemDivineRPGSeeds(x.marsineSeedsID, ArcanaBlockHelper.marsine.blockID, ArcanaBlockHelper.arcaniteGrass.blockID).registerTextures("MarasineSeeds").setUnlocalizedName("marsineSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item reflector = new ItemReflector(x.reflectorID).registerTextures("ArcaniumReflector").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("reflector");

	public static final Item fyracryxSpawner = new ItemFyracryxSpawner(x.fyracryxSpawnerID).registerTextures("ArcanaSpawner").setUnlocalizedName("fyracryxSpawner").setCreativeTab(DivineRPG.Spawn);
	public static final Item paratikuSpawner = new ItemParatikuSpawner(x.paratikuSpawnerID).registerTextures("ArcanaSpawner").setUnlocalizedName("paratikuSpawner").setCreativeTab(DivineRPG.Spawn);
	public static final Item seimerSpawner = new ItemSeimerSpawner(x.seimerSpawnerID).registerTextures("ArcanaSpawner").setUnlocalizedName("seimerSpawner").setCreativeTab(DivineRPG.Spawn);
	public static final Item golemOfRejuvSpawner = new ItemGolemOfRejuvSpawner(x.golemOfRejuvSpawnerID).registerTextures("ArcanaSpawner").setUnlocalizedName("golemOfRejuvSpawner").setCreativeTab(DivineRPG.Spawn);

	public static final Item stormSword = new ItemStormSword(x.stormSwordID, arcanaSword).registerTextures("StormSword").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("stormSword");
	public static final Item shadowSword = new ItemShadowSword(x.shadowSwordID, arcanaSword).registerTextures("ShadowSaber").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("shadowSword");
	public static final Item arcaniumSaber = new ItemArcaniumSaber(x.arcaniumSaberID, arcanaSword).registerTextures("ArcaniumSaber").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("arcaniumSaber");
	public static final Item liviciaSword = new ItemDivineRPGSword(x.liviciaSwordID, arcanaSword).registerTextures("LiviciaSword").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("liviciaSword");

	public static final Item staffOfStarlight = new ItemStarfall(y.staffOfStarlightID).registerTextures("StaffOfStarLight").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("staffOfStarlight");
	public static final Item wraithbane = new ItemWraithbane(y.wraithbaneID).registerTextures("WraithBane").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("wraithbane");
	public static final Item captiansSparkler = new ItemCaptiansSparkeler(y.captiansSparklerID).registerTextures("CaptainsSparkler").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("captiansSparkler");
	public static final Item enderScepter = new ItemEnderScepter(y.enderScepterID).registerTextures("EnderScepter").setUnlocalizedName("enderScepter").setCreativeTab(DivineRPG.Swords);
	public static final Item grenadeLauncher = new ItemGrenadeLauncher(y.grenadeLauncherID, 3).registerTextures("GrenadeLauncher").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("grenadeLauncher");
	public static final Item grenade = new ItemGrenade(y.grenadeID, 3).registerTextures("Grenade").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("grenade");
	public static final Item meriksMissile = new ItemMeriksMissile(y.meriksMissileID, 0, 0, true).setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("meriksMissile");
	public static final Item firefly = new ItemFirefly(y.fireflyID).registerTextures("FireFly").setUnlocalizedName("firefly").setCreativeTab(DivineRPG.Projectile);
	public static final Item starfall = new ItemStarfall(y.starfallID).registerTextures("Starlight").setUnlocalizedName("starfall").setCreativeTab(DivineRPG.Projectile);
	public static final Item staffOfEnrichment = new ItemStaffOfEnrichment(y.staffOfEnrichmentID).registerTextures("StaffOfEnrichment").setUnlocalizedName("staffOfEnrichment").setCreativeTab(DivineRPG.Tools);
	public static final Item orbOfLight = new ItemOrbOfLight(y.orbOfLightID).registerTextures("OrbOfLight");
	public static final Item wizardBook = new ItemWizardBook(y.wizardBookID).registerTextures("WizardBook").setUnlocalizedName("WizardBook").setCreativeTab(DivineRPG.Misc);

	public static final Item kormaHead = new ItemBaseArmor(x.kormaHeadID, korma, 0, HEAD, true).setUnlocalizedName("KormaHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item kormaBody = new ItemBaseArmor(x.kormaBodyID, korma, 1, BODY, true).setUnlocalizedName("KormaBody").setCreativeTab(DivineRPG.Armor);
	public static final Item kormaLegs = new ItemBaseArmor(x.kormaLegsID, korma, 2, LEGS, true).setUnlocalizedName("KormaLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item kormaBoots = new ItemBaseArmor(x.kormaBootsID, korma, 3, BOOTS, true).setUnlocalizedName("KormaBoots").setCreativeTab(DivineRPG.Armor);
 
	public static final Item vemosHead = new ItemBaseArmor(x.vemosHeadID, korma, 0, HEAD, true).setUnlocalizedName("VemosHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item vemosBody = new ItemBaseArmor(x.vemosBodyID, korma, 1, BODY, true).setUnlocalizedName("VemosBody").setCreativeTab(DivineRPG.Armor);
	public static final Item vemosLegs = new ItemBaseArmor(x.vemosLegsID, korma, 2, LEGS, true).setUnlocalizedName("VemosLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item vemosBoots = new ItemBaseArmor(x.vemosBootsID, korma, 3, BOOTS, true).setUnlocalizedName("VemosBoots").setCreativeTab(DivineRPG.Armor);

    public static final Item tarBucket = new ItemTarBucket(y.tarBucketID, OverworldBlockHelper.Tar.blockID).registerTextures("BucketOfTar").setUnlocalizedName("tarBucket").setCreativeTab(DivineRPG.Misc);
	public static final Item arcaniumBucket = new ItemTarBucket(x.arcaniumBucketID, 0).registerTextures("ArcaniumBucket").setUnlocalizedName("arcaniumBucket").setCreativeTab(DivineRPG.Misc);

	public static final Item key = new ItemDivineRPG(y.key1ID).registerTextures("Key").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Misc);
	public static final Item key1 = new ItemDivineRPG(y.key2ID).registerTextures("Key1").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Misc);
	public static final Item key2 = new ItemDivineRPG(y.key3ID).registerTextures("Key2").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Misc);
	public static final Item key3 = new ItemDivineRPG(y.key4ID).registerTextures("Key3").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Misc);

	public static final Item OreDoor1 = new ItemOreDoor1(y.oreDoorItem1ID, Material.wood).registerTextures("OreDoor1").setUnlocalizedName("OreDoor1").setCreativeTab(DivineRPG.Blocks);
	public static final Item OreDoor2 = new ItemOreDoor2(y.oreDoor2ItemID, Material.wood).registerTextures("OreDoor2").setUnlocalizedName("OreDoor2").setCreativeTab(DivineRPG.Blocks);
	public static final Item OreDoor3 = new ItemOreDoor3(y.oreDoor3ItemID, Material.wood).registerTextures("OreDoor3").setUnlocalizedName("OreDoor3").setCreativeTab(DivineRPG.Blocks);
	public static final Item OreDoor4 = new ItemOreDoor4(y.oreDoor4ItemID, Material.wood).registerTextures("OreDoor4").setUnlocalizedName("OreDoor4").setCreativeTab(DivineRPG.Blocks);

	public static final Item arcanium = new ItemDivineRPG(y.arcaniumID).registerTextures("Arcanium").setUnlocalizedName("acanium").setCreativeTab(DivineRPG.Raw);
	public static final Item collectorFragments = new ItemDivineRPG(y.collectorFragmentsID).registerTextures("CollectorFragment").setUnlocalizedName("collectorFragments").setCreativeTab(DivineRPG.Raw);
	public static final Item collector = new ItemChargedCollector(y.collectorID).registerTextures("CollectorCharged").setUnlocalizedName("CollectorCharged").setCreativeTab(DivineRPG.Raw);
	public static final Item dungeonToken = new ItemDivineRPG(y.dungeonTokenID).registerTextures("DungeonTokens").setUnlocalizedName("dungeonToken").setCreativeTab(DivineRPG.Raw);

	public static void addNames() {
		addItem(tarBucket, "Bucket Of Tar");
		addItem(OreDoor1, "Locked Door 1");
		addItem(OreDoor2, "Locked Door 2");
		addItem(OreDoor3, "Locked Door 3");
		addItem(OreDoor4, "Locked Door 4");
		addItem(wizardBook, "Wizard's Book");
		addItem(key, "Key: Blue");
		addItem(key1, "Key: Purple");
		addItem(key2, "Key: Red");
		addItem(key3, "Key: Yellow");

		addItem(fireStockItem, "Firestock");
		addItem(fireStockSeeds, "Firestock Seeds");
		addItem(pinFlyItem, "Pinfly");
		addItem(pinFlySeeds, "Pinfly Seeds");
		addItem(hitchakItem, "Hitchak");
		addItem(hitchakSeeds, "Hitchak Seeds");
		addItem(eucalyptusRootSeeds, "Eucalyptus Root Seeds");
		addItem(veiloItem, "Veilo");
		addItem(veiloSeeds, "Veilo Seeds");
		addItem(lamonaItem, "Lamona");
		addItem(lamonaSeeds, "Lamona Seeds");
		addItem(aquamarineItem, "Aquamarine");
		addItem(aquamarineSeeds, "Aquamarine Seeds");
		addItem(marsineItem, "Marasine");
		addItem(marsineSeeds, "Marasine Seeds");

		addItem(fyracryxSpawner, "Fyracryx Egg");
		addItem(paratikuSpawner, "Paratiku Egg");
		addItem(seimerSpawner, "Seimer Egg");
		addItem(golemOfRejuvSpawner, "Golem of Rejuvination Egg");

		addItem(reflector, "Arcanium Reflector");
		addItem(stormSword, "Storm Sword");
		addItem(shadowSword, "Shadow Sword");
		addItem(arcaniumSaber, "Arcanium Saber");
		addItem(liviciaSword, "Livicia Sword");
		addItem(staffOfStarlight, "Staff of Starlight");
		addItem(wraithbane, "Wraithbane");
		addItem(captiansSparkler, "Captain's Sparkler");
		addItem(firefly, "Firefly");
		addItem(starfall, "Starlight");
		addItem(grenade, "Grenade");
		addItem(grenadeLauncher, "Grenade Launcher");
		addItem(meriksMissile, "Merik's Missile");
		addItem(enderScepter, "Ender Scepter");
		addItem(orbOfLight, "Orb of Light");

		addItem(dungeonToken, "Dungeon Token");
		addItem(arcanium, "Arcanium");
		addItem(weakArcanaPotion, "Weak Arcana Potion");
		addItem(strongArcanaPotion, "Strong Arcana Potion");
		addItem(arcaniumBucket, "Arcanium Bucket");

		addItem(collector, "Charge Collector Fragment");
		addItem(collectorFragments, "Collector Fragment");

		addItem(staffOfEnrichment, "Staff of Enrichment");

		addItem(kormaHead, "Korma Helmet");
		addItem(kormaBody, "Korma Chestplate");
		addItem(kormaLegs, "Korma Leggings");
		addItem(kormaBoots, "Korma Boots");

		addItem(vemosHead, "Vemos Helmet");
		addItem(vemosBody, "Vemos Chestplate");
		addItem(vemosLegs, "Vemos Leggings");
		addItem(vemosBoots, "Vemos Boots");
	}
}
