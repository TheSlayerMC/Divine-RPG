package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.divinerpg.item.ItemBaseAnchor;
import net.divinerpg.item.ItemBaseArmor;
import net.divinerpg.item.ItemBowCannon;
import net.divinerpg.item.ItemMaelstrom;
import net.divinerpg.item.ItemMassivence;
import net.divinerpg.item.ItemModSeeds;
import net.divinerpg.item.ItemShadowBow;
import net.divinerpg.item.iceika.ItemFrostCannon;
import net.divinerpg.item.iceika.ItemFrostSword;
import net.divinerpg.item.overworld.ItemBlueBow;
import net.divinerpg.item.overworld.ItemCorruptCannon;
import net.divinerpg.item.overworld.ItemCrabCannon;
import net.divinerpg.item.overworld.ItemCyclopseBow;
import net.divinerpg.item.overworld.ItemCyclopseStaff;
import net.divinerpg.item.overworld.ItemGhastCannon;
import net.divinerpg.item.overworld.ItemHordeHorn;
import net.divinerpg.item.overworld.ItemInfernalFlame;
import net.divinerpg.item.overworld.ItemInfernoBow;
import net.divinerpg.item.overworld.ItemInfernoSword;
import net.divinerpg.item.overworld.ItemMysteriousClock;
import net.divinerpg.item.overworld.ItemScythe;
import net.divinerpg.item.overworld.ItemSerenadeDeath;
import net.divinerpg.item.overworld.ItemSerenadeGrowth;
import net.divinerpg.item.overworld.ItemSerenadeHealth;
import net.divinerpg.item.overworld.ItemSerenadeStriker;
import net.divinerpg.item.overworld.ItemShuriken;
import net.divinerpg.item.overworld.ItemSlimeSword;
import net.divinerpg.item.overworld.ItemSoundMusic;
import net.divinerpg.item.overworld.ItemVailStorm;
import net.divinerpg.item.tool.ToolAxe;
import net.divinerpg.item.tool.ToolHoe;
import net.divinerpg.item.tool.ToolPickaxe;
import net.divinerpg.item.tool.ToolShickaxe;
import net.divinerpg.item.tool.ToolShovel;
import net.divinerpg.item.tool.ToolSword;
import net.divinerpg.item.twilight.ItemDensos;
import net.divinerpg.item.twilight.ItemKarot;
import net.divinerpg.item.twilight.ItemPalavence;
import net.divinerpg.item.twilight.ItemSoulFiend;
import net.divinerpg.item.twilight.ItemTwilightClock;
import net.divinerpg.item.twilight.ItemTwilightDemon;
import net.divinerpg.item.twilight.ItemVamacheron;
import net.divinerpg.item.twilight.ItemWatcher;
import net.divinerpg.lib.Sound;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class OverworldItemHelper extends HelperBase {
	
	//TODO
	public static Item namkormira;
	public static Item poisonSaber;
	public static Item aquaticDagger;
	public static Item scorchingSword;
	public static Item bluefireSword;
	public static Item hamreicher;
	public static Item dualClaw;
	public static Item aquaticMaul;
	public static Item poisonBow;
	public static Item whiteMushroomSeeds;
	public static Item corruptedPickaxe;
	public static Item corruptedShovel;
	public static Item corruptedAxe;
	public static Item enderBow;
	public static Item flamingFury;
	
	//Ender tools uses Realmite
	
	//public static final Item homeTeleporter = new ItemHomeTeleporter(x.getID("homeTeleporter).registerTextures("TeleportationCrystal").setUnlocalizedName("homeTeleporter").setCreativeTab(DivineRPG.Overworld);
	public static final Item frostCannon = new ItemFrostCannon(x.getID("FrostCannon")).registerTextures("FrostCannon").setUnlocalizedName("FrostCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item soundOfMusic = new ItemSoundMusic(x.getID("SoundOfMusic")).registerTextures("SoundOfMusic").setUnlocalizedName("SoundOfMusic").setCreativeTab(DivineRPG.Projectile);
	public static final Item crabClawCannon = new ItemCrabCannon(x.getID("CrabClawCannon"), 20, 20, 20, "", "").registerTextures("CrabclawCannon").setUnlocalizedName("CrabclawCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item bowheadCannon = new ItemBowCannon(x.getID("BowheadCannon"), 20, 20, 20, "", "").registerTextures("BowHeadCannon").setUnlocalizedName("BowHeadCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item ghastCannon = new ItemGhastCannon(x.getID("GhastCannon"), 20, 20, 20, "", "").registerTextures("GhastCannon").setUnlocalizedName("GhastCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item corruptCannon = new ItemCorruptCannon(x.getID("CorruptCannon"), 20, "", "").registerTextures("CorruptedCannon").setUnlocalizedName("CorruptedCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item tomato = new ItemDivineRPG(x.getID("Tomato")).registerTextures("Tomato").setUnlocalizedName("Tomato").setCreativeTab(DivineRPG.Misc);
	public static final Item tomatoSeeds = new ItemModSeeds(x.getID("TomatoSeeds"), x.getID("TomatoPlant"), Block.tilledField.blockID).registerTextures("TomatoSeeds").setUnlocalizedName("TomatoSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item bowHeadAnchor = new ItemBaseAnchor(x.getID("BowheadAnchor"), 20).registerTextures("BowHeadAnchor").setUnlocalizedName("BowHeadAnchor").setCreativeTab(DivineRPG.Swords);
	public static final Item sharkAnchor = new ItemBaseAnchor(x.getID("SharkAnchor"), 20).registerTextures("SharkAnchor").setUnlocalizedName("SharkAnchor").setCreativeTab(DivineRPG.Swords);
	public static final Item crabAnchor = new ItemBaseAnchor(x.getID("CrabAnchor"), 20).registerTextures("CrabAnchor").setUnlocalizedName("CrabAnchor").setCreativeTab(DivineRPG.Swords);

	public static final Item maelstrom = new ItemMaelstrom(x.getID("Maelstrom"), 14, 1, "", "").registerTextures("MaelStrom").setUnlocalizedName("MaelStrom").setCreativeTab(DivineRPG.Projectile);
	public static final Item scythe = new ItemScythe(x.getID("Scythe")).registerTextures("Scythe").setUnlocalizedName("Scythe").setCreativeTab(DivineRPG.Projectile);

	public static final Item infernoBow = new ItemInfernoBow(x.getID("InfernoBow")).setUnlocalizedName("InfernoBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item shadowBow = new ItemShadowBow(x.getID("ShadowBow")).setUnlocalizedName("ShadowBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item bluefirebow = new ItemBlueBow(x.getID("BlueFireBow")).setUnlocalizedName("BluefireBow").setCreativeTab(DivineRPG.Projectile);

	public static final Item bloodGem = new ItemDivineRPG(x.getID("BloodGem")).registerTextures("BloodGem").setUnlocalizedName("BloodGem").setCreativeTab(DivineRPG.Raw);
	public static final Item rupeeIngot = new ItemDivineRPG(x.getID("RupeeIngot")).registerTextures("RupeeIngot").setUnlocalizedName("RupeeIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item arlemiteIngot = new ItemDivineRPG(x.getID("ArlemiteIngot")).registerTextures("ArlemiteIngot").setUnlocalizedName("ArlemiteIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item realmiteIngot = new ItemDivineRPG(x.getID("RealmiteIngot")).registerTextures("RealmiteIngot").setUnlocalizedName("RealmiteIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item netheriteIngot = new ItemDivineRPG(x.getID("NetheriteIngot")).registerTextures("NetheriteIngot").setUnlocalizedName("NetheriteIngot").setCreativeTab(DivineRPG.Raw);

	public static final Item jungleShard = new ItemDivineRPG(x.getID("JungleShard")).registerTextures("JungleShards").setUnlocalizedName("Jungle").setCreativeTab(DivineRPG.Raw);
	public static final Item iceShard = new ItemDivineRPG(x.getID("IceShard")).registerTextures("IceShards").setUnlocalizedName("IceShard").setCreativeTab(DivineRPG.Raw);    
	public static final Item moltenShard = new ItemDivineRPG(x.getID("MoltenShard")).registerTextures("MoltenShards").setUnlocalizedName("Molten").setCreativeTab(DivineRPG.Raw);
	public static final Item divineShard = new ItemDivineRPG(x.getID("DivineShard")).registerTextures("DivineShards").setUnlocalizedName("Divine").setCreativeTab(DivineRPG.Raw);
	public static final Item enderShard = new ItemDivineRPG(x.getID("EnderShard")).registerTextures("EnderShards").setUnlocalizedName("Ender").setCreativeTab(DivineRPG.Raw);
	public static final Item corruptedShard = new ItemDivineRPG(x.getID("CorruptedShard")).registerTextures("CorruptedShards").setUnlocalizedName("Corrupted").setCreativeTab(DivineRPG.Raw);

	public static final Item jungleStone = new ItemDivineRPG(x.getID("JungleStone")).registerTextures("JungleStone").setUnlocalizedName("JungleS").setCreativeTab(DivineRPG.Raw);
	public static final Item iceStone = new ItemDivineRPG(x.getID("IceStone")).registerTextures("IceStone").setUnlocalizedName("IceS").setCreativeTab(DivineRPG.Raw);
	public static final Item moltenStone = new ItemDivineRPG(x.getID("MoltenStone")).registerTextures("MoltenStone").setUnlocalizedName("MoltenS").setCreativeTab(DivineRPG.Raw);
	public static final Item enderStone = new ItemDivineRPG(x.getID("EnderStone")).registerTextures("EnderStone").setUnlocalizedName("EnderS").setCreativeTab(DivineRPG.Raw);
	public static final Item corruptedStone = new ItemDivineRPG(x.getID("CorruptedStone")).registerTextures("CorruptedStone").setUnlocalizedName("CorruptedS").setCreativeTab(DivineRPG.Raw);
	public static final Item divineStone = new ItemDivineRPG(x.getID("DivineStone")).registerTextures("DivineStone").setUnlocalizedName("DivineS").setCreativeTab(DivineRPG.Raw);
	public static final Item blueFireStone = new ItemDivineRPG(x.getID("BlueFireStone")).registerTextures("BlueFireStone").setUnlocalizedName("BlueFireStone").setCreativeTab(DivineRPG.Raw);
	public static final Item healingStone = new ItemDivineRPG(x.getID("HealingStone")).registerTextures("HealingStone").setUnlocalizedName("HS").setCreativeTab(DivineRPG.Raw);
	public static final Item shadowStone = new ItemDivineRPG(x.getID("ShadowStone")).registerTextures("ShadowStone").setUnlocalizedName("shadowStone").setCreativeTab(DivineRPG.Raw);

	public static final Item hellStoneIngot = new ItemDivineRPG(x.getID("HellStoneIngot")).registerTextures("HellStoneIngot").setUnlocalizedName("HellStoneIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item purpleBlaze = new ItemDivineRPG(x.getID("PurpleBlaze")).registerTextures("PurpleBlaze").setUnlocalizedName("PurpleBlaze").setCreativeTab(DivineRPG.Raw);
	public static final Item shadowBar = new ItemDivineRPG(x.getID("ShadowBar")).registerTextures("ShadowBar").setUnlocalizedName("ShadowB").setCreativeTab(DivineRPG.Raw);
	public static final Item netheriteChunk = new ItemDivineRPG(x.getID("NetheriteChunk")).registerTextures("NetheriteChunk").setUnlocalizedName("Chunk").setCreativeTab(DivineRPG.Raw);
	public static final Item legendaryEnderEye = new ItemDivineRPG(x.getID("LegendaryEnderEye")).registerTextures("LegendaryEnderEye").setUnlocalizedName("LEE").setCreativeTab(DivineRPG.Raw);

	public static final Item baseSpawnCrystal = new ItemDivineRPG(x.getID("BaseSpawnCrystal")).registerTextures("BaseSpawnCrystal").setUnlocalizedName("BaseSpawn").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnSoulFiend = new ItemSoulFiend(x.getID("SoulFiendSpawnCrystal")).registerTextures("SpawnSoulFiend").setUnlocalizedName("SpawnSoul").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnVamacheron = new ItemVamacheron(x.getID("VamacheronSpawnCrystal")).registerTextures("SpawnVamacheron").setUnlocalizedName("SpawnVamach").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnTwilightDemon = new ItemTwilightDemon(x.getID("TwilightDemonSpawnCrystal")).registerTextures("SpawnTwilightDemon").setUnlocalizedName("Twilight").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnKarot = new ItemKarot(x.getID("KarotSpawnCrystal")).registerTextures("SpawnKarot").setUnlocalizedName("Karot").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnDensos = new ItemDensos(x.getID("DensosSpawnCrystal")).registerTextures("SpawnDensos").setUnlocalizedName("Densos").setCreativeTab(DivineRPG.Spawn);
	public static final Item hordeHorn = new ItemHordeHorn(x.getID("HordeHorn")).registerTextures("HordeHorn").setUnlocalizedName("HordeHorn").setCreativeTab(DivineRPG.Spawn);
	public static final Item mysteriousClock = new ItemMysteriousClock(x.getID("MysteriousClock")).registerTextures("MysteriousClock").setUnlocalizedName("Mysterious").setCreativeTab(DivineRPG.Spawn);
	public static final Item callOfTheWatcher = new ItemWatcher(x.getID("CallOfTheWatcher")).registerTextures("CallOfTheWatcher").setUnlocalizedName("CallOfTheWatcher").setCreativeTab(DivineRPG.Spawn);
	public static final Item infernalFlame = new ItemInfernalFlame(x.getID("InfernalFlame")).registerTextures("InfernalFlame").setUnlocalizedName("Infernal").setCreativeTab(DivineRPG.Spawn);
	public static final Item twilightClock = new ItemTwilightClock(x.getID("TwilightClock")).registerTextures("TwilightClock").setUnlocalizedName("TwilightClock").setCreativeTab(DivineRPG.Misc);

	public static final Item watchingEye = new ItemDivineRPG(x.getID("WatchingEye")).registerTextures("WatchingEye").setUnlocalizedName("WatchingEye").setCreativeTab(DivineRPG.Raw);
	public static final Item furyFire = new ItemDivineRPG(x.getID("FuryFire")).registerTextures("FuryFire").setUnlocalizedName("FuryFire").setCreativeTab(DivineRPG.Raw);
	public static final Item furyArrow = new ItemDivineRPG(x.getID("FuryArrow")).registerTextures("FuryArrow").setUnlocalizedName("FuryArrow").setCreativeTab(DivineRPG.Raw);
	public static final Item krakenSkin = new ItemDivineRPG(x.getID("KrakenSkin")).registerTextures("KrakenSkin").setUnlocalizedName("KrakS").setCreativeTab(DivineRPG.Raw);
	public static final Item krakenScale = new ItemDivineRPG(x.getID("KrakenScale")).registerTextures("KrakenScale").setUnlocalizedName("krakenScale").setCreativeTab(DivineRPG.Raw);

	public static final Item sharkFin = new ItemDivineRPG(x.getID("SharkFin")).registerTextures("SharkFin").setUnlocalizedName("SharkFin").setCreativeTab(DivineRPG.Raw);
	public static final Item whaleFin = new ItemDivineRPG(x.getID("WhaleFin")).registerTextures("WhaleFin").setUnlocalizedName("WhaleFin").setCreativeTab(DivineRPG.Raw);
	public static final Item purpleGlowBoneTree = new ItemDivineRPG(x.getID("PurpleGlowTree")).registerTextures("PurpleGlowBoneSeeds").setUnlocalizedName("PurpleTree").setCreativeTab(DivineRPG.Raw);
	public static final Item pinkGlowBoneTree = new ItemDivineRPG(x.getID("PinkGlowTree")).registerTextures("PinkGlowBoneSeeds").setUnlocalizedName("PinkTree").setCreativeTab(DivineRPG.Raw);
	public static final Item crabClaw = new ItemDivineRPG(x.getID("CrabClaw")).registerTextures("CrabClaw").setUnlocalizedName("CrabClaw").setCreativeTab(DivineRPG.Raw);

	public static final Item shuriken = new ItemShuriken(x.getID("Shuriken")).registerTextures("Shuriken").setUnlocalizedName("Shuriken").setCreativeTab(DivineRPG.Projectile);
	public static final Item vileStorm = new ItemVailStorm(x.getID("VileStorm")).registerTextures("VileStorm").setUnlocalizedName("VileStorm").setCreativeTab(DivineRPG.Projectile);	

	public static final Item crabclawMaul = new ItemDivineRPGSword(x.getID("CrabClawMaul"), EnumHelper.addToolMaterial("crabclawmaul", 0, 8000, 0, 6, 22), true).registerTextures("CrabClawMaul").setUnlocalizedName("CrabClawMaul").setCreativeTab(DivineRPG.Swords);	
	public static final Item corruptedMaul = new ItemDivineRPGSword(x.getID("CorruptedMaul"), EnumHelper.addToolMaterial("corruptedmaul", 0, 6000, 0, 18, 22)).registerTextures("CorruptedMaul").setUnlocalizedName("CorruptedMaul").setCreativeTab(DivineRPG.Swords);
	public static final Item bedrockMaul = new ItemDivineRPGSword(x.getID("BedRockMaul"), 15, EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, 22), true).registerTextures("BedrockMaul").setUnlocalizedName("bedrock").setCreativeTab(DivineRPG.Swords);	

	public static final Item serenadeStriker = new ItemSerenadeStriker(x.getID("SerenadeStriker")).registerTextures("SerenadeStriker").setUnlocalizedName("SerenadeStriker").setCreativeTab(DivineRPG.Projectile);
	public static final Item serenadeOfLife = new ItemSerenadeGrowth(x.getID("SerenadeOfLife")).registerTextures("SerenadeOfLife").setUnlocalizedName("serenadeLife").setCreativeTab(DivineRPG.Misc);
	public static final Item serenadeOfDeath = new ItemSerenadeDeath(x.getID("SerenadeOfDeath")).registerTextures("SerenadeOfDeath").setUnlocalizedName("SerenadeOfDeath").setCreativeTab(DivineRPG.Projectile);
	public static final Item serenadeHealth = new ItemSerenadeHealth(x.getID("SerenadeHealth")).registerTextures("SerenadeOfHealth").setUnlocalizedName("SerenadeOfHealth").setCreativeTab(DivineRPG.Misc);

	public static final Item divineStick = new ItemDivineRPG(x.getID("DivineStick")).registerTextures("DivineStick").setUnlocalizedName("DivineStick").setCreativeTab(DivineRPG.Raw);
	public static final Item divineWoodAxe = new ToolAxe(x.getID("DivineWoodAxe"), divineWood).registerItemTexture("DivineWoodAxe").setUnlocalizedName("DivineWoodAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodPickaxe = new ToolPickaxe(x.getID("DivineWoodPick"), divineWood).registerItemTexture("DivineWoodPickaxe").setUnlocalizedName("DivineWoodPickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodHoe = new ToolHoe(x.getID("DivineWoodHoe"), divineWood).registerItemTexture("DivineWoodHoe").setUnlocalizedName("DivineWoodHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodShovel = new ToolShovel(x.getID("DivineWoodShovel"), divineWood).registerItemTexture("DivineWoodShovel").setUnlocalizedName("DivineWoodShovel").setCreativeTab(DivineRPG.Tools);
	//public static final Item divineWoodSword = new ToolSword(x.getID("DivineWoodSword, divineWood).registerItemTexture("DivineWoodSword").setUnlocalizedName("DivineWoodSword").setCreativeTab(DivineRPG.Swords);

	public static final Item cyclopseEye = new ItemDivineRPG(x.getID("CyclopseEye")).registerTextures("CyclopseEye").setUnlocalizedName("CyclopseEye").setCreativeTab(DivineRPG.Raw);
	public static final Item cyclopseStaff = new ItemCyclopseStaff(x.getID("CyclopseStaff"), 17, 1, 2, Sound.Staff, Sound.Staff).registerTextures("CyclopianStaff").setUnlocalizedName("CyclopseStaff").setCreativeTab(DivineRPG.Projectile);
	public static final Item cyclopseBow = new ItemCyclopseBow(x.getID("CyclopseBow")).setUnlocalizedName("CyclopianBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item cyclopseSword = new ItemDivineRPGSword(x.getID("CyclopseSword"), Cyclopse).registerTextures("CyclopianSword").setUnlocalizedName("CyclopianSword").setCreativeTab(DivineRPG.Swords);

	public static final Item shadowHelmet = new ItemBaseArmor(x.getID("ShadowHelmet"), shadow, 0, 0, "Shadow");
	public static final Item shadowBody = new ItemBaseArmor(x.getID("ShadowBody"), shadow, 1, 1, "Shadow");
	public static final Item shadowLegs = new ItemBaseArmor(x.getID("ShadowLegs"), shadow, 2, 2, "Shadow");
	public static final Item shadowBoots = new ItemBaseArmor(x.getID("ShadowBoots"), shadow, 3, 3, "Shadow");

	public static final Item aquaticHelmet = new ItemBaseArmor(x.getID("AquaticHelmet"), aquatic, 0, 0, "Aquastrive");
	public static final Item aquaticBody = new ItemBaseArmor(x.getID("AquaticBody"), aquatic, 1, 1, "Aquastrive");
	public static final Item aquaticLegs = new ItemBaseArmor(x.getID("AquaticLegs"), aquatic, 2, 2, "Aquastrive");
	public static final Item aquaticBoots = new ItemBaseArmor(x.getID("AquaticBoots"), aquatic, 3, 3, "Aquastrive");

	public static final Item eliteRealmiteHelmet = new ItemBaseArmor(x.getID("EliteRealHelmet"), eliteRealmite, 0, 0, "EliteRealmite");
	public static final Item eliteRealmiteBody = new ItemBaseArmor(x.getID("EliteRealBody"), eliteRealmite, 1, 1, "EliteRealmite");
	public static final Item eliteRealmiteLegs = new ItemBaseArmor(x.getID("EliteRealLegs"), eliteRealmite, 2, 2, "EliteRealmite");
	public static final Item eliteRealmiteBoots = new ItemBaseArmor(x.getID("EliteRealBoots"), eliteRealmite, 3, 3, "EliteRealmite");

	public static final Item angelicHelmet = new ItemBaseArmor(x.getID("AngelicHelmet"), angelicArmor, 0, 0, "Angelic");
	public static final Item angelicBody = new ItemBaseArmor(x.getID("AngelicBody"), angelicArmor, 1, 1, "Angelic");
	public static final Item angelicLegs = new ItemBaseArmor(x.getID("AngelicLegs"), angelicArmor, 2, 2, "Angelic");
	public static final Item angelicBoots = new ItemBaseArmor(x.getID("AngelicBoots"), angelicArmor, 3, 3, "Angelic");

	public static final Item realmiteHelmet = new ItemBaseArmor(x.getID("RealmiteHelmet"), realmiteArmor, 0, 0, "Realmite");
	public static final Item realmiteBody = new ItemBaseArmor(x.getID("RealmiteBody"), realmiteArmor, 1, 1, "Realmite");
	public static final Item realmiteLegs = new ItemBaseArmor(x.getID("RealmiteLegs"), realmiteArmor, 2, 2, "Realmite");
	public static final Item realmiteBoots = new ItemBaseArmor(x.getID("RealmiteBoots"), realmiteArmor, 3, 3, "Realmite");

	public static final Item arlemiteHelmet = new ItemBaseArmor(x.getID("ArlemiteHelmet"), arlemiteArmor, 0, 0, "Arlemite");
	public static final Item arlemiteBody = new ItemBaseArmor(x.getID("ArlemiteBody"), arlemiteArmor, 1, 1, "Arlemite");
	public static final Item arlemiteLegs = new ItemBaseArmor(x.getID("ArlemiteLegs"), arlemiteArmor, 2, 2, "Arlemite");
	public static final Item arlemiteBoots = new ItemBaseArmor(x.getID("ArlemiteBoots"), arlemiteArmor, 3, 3, "Arlemite");

	public static final Item rupeeHelmet = new ItemBaseArmor(x.getID("RupeeHelmet"), rupeeArmor, 0, 0, "Rupee");
	public static final Item rupeeBody = new ItemBaseArmor(x.getID("RupeeBody"), rupeeArmor, 1, 1, "Rupee");
	public static final Item rupeeLegs = new ItemBaseArmor(x.getID("RupeeLegs"), rupeeArmor, 2, 2, "Rupee");
	public static final Item rupeeBoots = new ItemBaseArmor(x.getID("RupeeBoots"), rupeeArmor, 3, 3, "Rupee");

	public static final Item krakenHelmet = new ItemBaseArmor(x.getID("KrakenHelmet"), kraken, 0, 0, "Kraken");
	public static final Item krakenBody = new ItemBaseArmor(x.getID("KrakenBody"), kraken, 1, 1, "Kraken");
	public static final Item krakenLegs = new ItemBaseArmor(x.getID("KrakenLegs"), kraken, 2, 2, "Kraken");
	public static final Item krakenBoots = new ItemBaseArmor(x.getID("KrakenBoots"), kraken, 3, 3, "Kraken");

	public static final Item grimReaperHead = new ItemBaseArmor(x.getID("GrimReaperHelmet"), grim, 0, 0, "Skeleman");
	public static final Item grimReaperBody = new ItemBaseArmor(x.getID("GrimReaperBody"), grim, 1, 1, "Skeleman");
	public static final Item grimReaperLegs = new ItemBaseArmor(x.getID("GrimReaperLegs"), grim, 2, 2, "Skeleman");
	public static final Item grimReaperBoots = new ItemBaseArmor(x.getID("GrimReaperBoots"), grim, 3, 3, "Skeleman");

	public static final Item jackOManBoots = new ItemBaseArmor(x.getID("JackOManBoots"), jack, 0, 0, "JackOMan");
	public static final Item jackOManLegs = new ItemBaseArmor(x.getID("JackOManLegs"), jack, 1, 1, "JackOMan");
	public static final Item jackOManBody = new ItemBaseArmor(x.getID("JackOManBody"), jack, 2, 2, "JackOMan");
	public static final Item jackOManHead = new ItemBaseArmor(x.getID("JackOManHelmet"), jack, 3, 3, "JackOMan");

	public static final Item ironHelmet = new ItemBaseArmor(x.getID("IronHelmet"), iron, 0, 0, "Iron");
	public static final Item ironBody = new ItemBaseArmor(x.getID("IronBody"), iron, 1, 1, "Iron");
	public static final Item ironLegs = new ItemBaseArmor(x.getID("IronLegs"), iron, 2, 2, "Iron");
	public static final Item ironBoots = new ItemBaseArmor(x.getID("IronBoots"), iron, 3, 3, "Iron");

	public static final Item diamondHelmet = new ItemBaseArmor(x.getID("DiamondHelmet"), diamond, 0, 0, "Diamond");
	public static final Item diamondBody = new ItemBaseArmor(x.getID("DiamondBody"), diamond, 1, 1, "Diamond");
	public static final Item diamondLegs = new ItemBaseArmor(x.getID("DiamondLegs"), diamond, 2, 2, "Diamond");
	public static final Item diamondBoots = new ItemBaseArmor(x.getID("DiamondBoots"), diamond, 3, 3, "Diamond");

	public static final Item rupeeShovel = new ToolShovel(x.getID("RupeeShovel"), Rupee).registerItemTexture("RupeeShovel").setUnlocalizedName("RupeeShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeAxe = new ToolAxe(x.getID("RupeeAxe"), Rupee).registerItemTexture("RupeeAxe").setUnlocalizedName("RupeeAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeHoe = new ToolHoe(x.getID("RupeeHoe"), Rupee).registerItemTexture("RupeeHoe").setUnlocalizedName("RupeeHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeePickaxe = new ToolPickaxe(x.getID("RupeePickaxe"), Rupee).registerItemTexture("RupeePickaxe").setUnlocalizedName("RupeePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeSword = new ToolSword(x.getID("RupeeRapier"), Rupee).registerItemTexture("RupeeSword").setUnlocalizedName("RupeeSword").setCreativeTab(DivineRPG.Swords);
	
	public static final Item netheriteHelmet = new ItemBaseArmor(x.getID("NetheriteHelmet"), netherite, 0, 0, "Netherite");
	public static final Item netheriteBody = new ItemBaseArmor(x.getID("NetheriteBody"), netherite, 1, 1, "Netherite");
	public static final Item netheriteLegs = new ItemBaseArmor(x.getID("NetheriteLegs"), netherite, 2, 2, "Netherite");
	public static final Item netheriteBoots = new ItemBaseArmor(x.getID("NetheriteBoots"), netherite, 3, 3, "Netherite");
	
	public static final Item infernoHelmet = new ItemBaseArmor(x.getID("InfernoHelmet"), inferno, 0, 0, "Inferno");
	public static final Item infernoBody = new ItemBaseArmor(x.getID("InfernoBody"), inferno, 1, 1, "Inferno");
	public static final Item infernoLegs = new ItemBaseArmor(x.getID("InfernoLegs"), inferno, 2, 2, "Inferno");
	public static final Item infernoBoots = new ItemBaseArmor(x.getID("InfernoBoots"), inferno, 3, 3, "Inferno");
	
	public static final Item enderHelmet = new ItemBaseArmor(x.getID("EnderHelmet"), ender, 0, 0, "Ender");
	public static final Item enderBody = new ItemBaseArmor(x.getID("EnderBody"), ender, 1, 1, "Ender");
	public static final Item enderLegs = new ItemBaseArmor(x.getID("EnderLegs"), ender, 2, 2, "Ender");
	public static final Item enderBoots = new ItemBaseArmor(x.getID("EnderBoots"), ender, 3, 3, "Ender");
	
	public static final Item bedrockHelmet = new ItemBaseArmor(x.getID("BedRockHelmet"), bedrockArmor , 0, 0, "Bedrock");
	public static final Item bedrockBody = new ItemBaseArmor(x.getID("BedRockBody"), bedrockArmor, 1, 1, "Bedrock");
	public static final Item bedrockLegs = new ItemBaseArmor(x.getID("BedRockLegs"), bedrockArmor, 2, 2, "Bedrock");
	public static final Item bedrockBoots = new ItemBaseArmor(x.getID("BedRockBoots"), bedrockArmor, 3, 3, "Bedrock");
	
	public static final Item arlemiteShovel = new ToolShovel(x.getID("ArlemiteShovel"), Arlemite).registerItemTexture("ArlemiteShovel").setUnlocalizedName("ArlemiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteAxe = new ToolAxe(x.getID("ArlemiteAxe"), Arlemite).registerItemTexture("ArlemiteAxe").setUnlocalizedName("ArlemiteAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteHoe = new ToolHoe(x.getID("ArlemiteHoe"), Arlemite).registerItemTexture("ArlemiteHoe").setUnlocalizedName("ArlemiteHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemitePickaxe = new ToolPickaxe(x.getID("ArlemitePickaxe"), Arlemite).registerItemTexture("ArlemitePickaxe").setUnlocalizedName("ArlemitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteSword = new ToolSword(x.getID("ArlemiteStabber"), ArlemiteSword).registerItemTexture("ArlemiteSword").setUnlocalizedName("ArlemiteSword").setCreativeTab(DivineRPG.Swords);

	public static final Item realmiteShovel = new ToolShovel(x.getID("RealmiteShovel"), Realmite).registerItemTexture("RealmiteShovel").setUnlocalizedName("RealmiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteAxe = new ToolAxe(x.getID("RealmiteAxe"), Realmite).registerItemTexture("RealmiteAxe").setUnlocalizedName("RealmiteAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteHoe = new ToolHoe(x.getID("RealmiteHoe"), Realmite).registerItemTexture("RealmiteHoe").setUnlocalizedName("RealmiteHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmitePickaxe = new ToolPickaxe(x.getID("RealmitePickaxe"), Realmite).registerItemTexture("RealmitePickaxe").setUnlocalizedName("RealmitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteSword = new ToolSword(x.getID("RealmiteSword"), Realmite).registerItemTexture("RealmiteSword").setUnlocalizedName("RealmiteSword").setCreativeTab(DivineRPG.Swords);

	public static final Item BedrockShovel = new ToolShovel(x.getID("BedRockShovel"), Bedrock).registerItemTexture("BedrockShovel").setUnlocalizedName("BedrockShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item BedrockAxe = new ToolAxe(x.getID("BedRockAxe"), Bedrock).registerItemTexture("BedrockAxe").setUnlocalizedName("BedrockAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item BedrockPickaxe = new ToolPickaxe(x.getID("BedRockPickaxe"), Bedrock).registerItemTexture("BedrockPickaxe").setUnlocalizedName("BedrockPickaxe").setCreativeTab(DivineRPG.Tools);
	
	public static final Item rupeeShickaxe = new ToolShickaxe(x.getID("RupeeShickaxe"), RupeeShick).registerShickaxeTextures("RupeeShickaxe").setUnlocalizedName("RupeeShickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteShickaxe = new ToolShickaxe(x.getID("ArlemiteShickaxe"), arlemiteShick).registerShickaxeTextures("ArlemiteShickaxe").setUnlocalizedName("ArlemiteShickaxe").setCreativeTab(DivineRPG.Tools);

	//public static final Item FlameThrower = new ItemFlameThrower(x.getID("FlameThrower).registerTextures("CyclopianSword").setUnlocalizedName("CyclopianSword").setCreativeTab(DivineRPG.Overworld);

	public static final Item infernoSword = new ItemInfernoSword(x.getID("InfernoSword"), Inferno).registerTextures("InfernoSword").setUnlocalizedName("InfernoSword").setCreativeTab(DivineRPG.Swords);
	public static final Item sandSlash = new ItemDivineRPGSword(x.getID("SandSlash"), SandSlash).registerTextures("SandSlash").setCreativeTab(DivineRPG.Swords);
	public static final Item frostSword = new ItemFrostSword(x.getID("FrostSword"), FrostSword).registerTextures("FrostSword").setUnlocalizedName("FrostSword").setCreativeTab(DivineRPG.Swords);
	public static final Item bedrockSword = new ItemDivineRPGSword(x.getID("BedRockSword"), BedrockSword).registerTextures("BedrockSword").setUnlocalizedName("BedrockSword").setCreativeTab(DivineRPG.Swords);
	public static final Item divineSword = new ItemDivineRPGSword(x.getID("DivineSword"), DivineSword, true).registerTextures("DivineSword").setUnlocalizedName("DivineSword").setCreativeTab(DivineRPG.Swords);
	public static final Item moltenSword = new ItemDivineRPGSword(x.getID("MoltenSword"), MoltenSword).registerTextures("MoltenSword").setUnlocalizedName("MoltenSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSword = new ItemDivineRPGSword(x.getID("EnderSword"), EnderSword, true).registerTextures("EnderSword").setUnlocalizedName("enderSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordBlue = new ItemDivineRPGSword(x.getID("EnderSwordBlue"), EnderSword, true).registerTextures("EnderSwordBlue").setUnlocalizedName("enderSwordBlue").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordDark = new ItemDivineRPGSword(x.getID("EnderSwordBlack"), EnderSword, true).registerTextures("EnderSwordBlack").setUnlocalizedName("enderSwordDark").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordGreen = new ItemDivineRPGSword(x.getID("EnderSwordGreen"), EnderSword, true).registerTextures("EnderSwordGreen").setUnlocalizedName("enderSwordGreen").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordRed = new ItemDivineRPGSword(x.getID("EnderSwordRed"), EnderSword, true).registerTextures("EnderSwordRed").setUnlocalizedName("enderSwordRed").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordYellow = new ItemDivineRPGSword(x.getID("EnderSwordYellow"), EnderSword, true).registerTextures("EnderSwordYellow").setUnlocalizedName("enderSwordYellow").setCreativeTab(DivineRPG.Swords);
	public static final Item slimeSword = new ItemSlimeSword(x.getID("SlimeSword"), SlimeSword).registerTextures("SlimeSword").setUnlocalizedName("SlimeSword").setCreativeTab(DivineRPG.Swords);
	public static final Item sharkSword = new ItemDivineRPGSword(x.getID("SharkSword"), EnumHelper.addToolMaterial("sharksword", 0, 2000, 0, 11, 22)).registerTextures("SharkSword").setUnlocalizedName("SharkSword").setCreativeTab(DivineRPG.Swords);
	public static final Item aquaticTrident = new ItemDivineRPGSword(x.getID("AquaticTrident"), EnumHelper.addToolMaterial("aquatictrident", 0, 7000, 0, 15, 22)).registerTextures("AquaticTrident").setUnlocalizedName("AquaticTrident").setCreativeTab(DivineRPG.Swords);
	public static final Item oceanKnife = new ItemDivineRPGSword(x.getID("OceanKnife"), OceanKnife).registerTextures("AquaticKnife").setUnlocalizedName("AquaticKnife").setCreativeTab(DivineRPG.Swords);
	public static final Item aquaton = new ItemDivineRPGSword(x.getID("Aquaton"), Aquaton).registerTextures("Aquaton").setUnlocalizedName("Aquaton").setCreativeTab(DivineRPG.Swords);
	public static final Item deathBringer = new ItemDivineRPGSword(x.getID("DeathBringer"), DeathBringer).registerTextures("DeathBringer").setUnlocalizedName("DeathBringer").setCreativeTab(DivineRPG.Swords);
	public static final Item massivence = new ItemMassivence(x.getID("Massivence"), Massivence).registerTextures("Massivence").setUnlocalizedName("Massivence").setCreativeTab(DivineRPG.Swords);
	public static final Item palavence = new ItemPalavence(x.getID("Palavence")).registerTextures("Palavence").setUnlocalizedName("Palavence").setCreativeTab(DivineRPG.Swords);
	public static final Item bloodGemSword = new ItemDivineRPGSword(x.getID("BloodGemSword"), BloodgemTool).registerTextures("BloodgemSword").setUnlocalizedName("Bloodgem").setCreativeTab(DivineRPG.Swords);

	public static final Item aquaticStone = new ItemDivineRPG(x.getID("AquaticStone")).registerTextures("AquaticStone").setUnlocalizedName("AquaStone").setCreativeTab(DivineRPG.Raw);
	public static final Item aquaticPellets = new ItemDivineRPG(x.getID("AquaticPellets")).registerTextures("AquaticPellets").setUnlocalizedName("aquaticPellets").setCreativeTab(DivineRPG.Raw);
	public static final Item pureAquaticPellets = new ItemDivineRPG(x.getID("PureAquaticPellets")).registerTextures("PureAquaticPellets").setUnlocalizedName("PureAquaticPellets").setCreativeTab(DivineRPG.Raw);

	public static final Item donut = new ItemDivineRPGFood(x.getID("Donut"), 1, 1, true).registerTextures("Donut");
	public static final Item pizzaDough = new ItemDivineRPGFood(x.getID("PizzaDough"), 1, 1, true).registerTextures("PizzaDough");
	public static final Item bacon = new ItemDivineRPGFood(x.getID("Bacon"), 1, 1, true).registerTextures("Bacon");
	public static final Item cheese = new ItemDivineRPGFood(x.getID("Cheese"), 1, 1, true).registerTextures("Cheese");
	public static final Item miniPizza = new ItemDivineRPGFood(x.getID("Pizza"), 1, 1, true).registerTextures("MiniPizza");
	public static final Item dinner = new ItemDivineRPGFood(x.getID("ChickenDinner"), 1, 1, true).registerTextures("Dinner");
	public static final Item boiledEgg = new ItemDivineRPGFood(x.getID("BoiledEgg"), 1, 1, true).registerTextures("BoiledEgg");
	
	public static void addNames() {
		addItem(donut, "Donut");
		addItem(pizzaDough, "Pizza Dough");
		addItem(bacon, "Bacon");
		addItem(cheese, "Cheese");
		addItem(miniPizza, "Mini Pizza");
		addItem(dinner, "Dinner");
		addItem(boiledEgg, "Boiled Egg");
		addItem(shuriken, "Shuriken");
		addItem(vileStorm, "Vilestorm");
		addItem(infernoHelmet, "Inferno Helmet");
		addItem(infernoBody, "Inferno Chestplate");
		addItem(infernoLegs, "Inferno Leggings");
		addItem(infernoBoots, "Inferno Boots");
		addItem(bedrockHelmet, "Bedrock Helmet");
		addItem(bedrockBody, "Bedrock Chestplate");
		addItem(bedrockLegs, "Bedrock Leggings");
		addItem(bedrockBoots, "Bedrock Boots");
		addItem(netheriteHelmet, "Netherite Helmet");
		addItem(netheriteBody, "Netherite Chestplate");
		addItem(netheriteLegs, "Netherite Leggings");
		addItem(netheriteBoots, "Netherite Boots");
		addItem(enderHelmet, "Ender Helmet");
		addItem(enderBody, "Ender Chestplate");
		addItem(enderLegs, "Ender Leggings");
		addItem(enderBoots, "Ender Boots");
		addItem(bloodGemSword, "BloodGem Sword");
		addItem(BedrockShovel, "Bedrock Shovel");
		addItem(BedrockPickaxe, "Bedrock Pickaxe");
		addItem(BedrockAxe, "Bedrock Axe");

		addItem(crabClaw, "Crab Claw");
		addItem(ironHelmet, "Iron Helmet");
		addItem(ironBody, "Iron Chestplate");
		addItem(ironLegs, "Iron Leggings");
		addItem(ironBoots, "Iron Boots");

		addItem(diamondHelmet, "Diamond Helmet");
		addItem(diamondBody, "Diamond Chestplate");
		addItem(diamondLegs, "Diamond Leggings");
		addItem(diamondBoots, "Diamond Boots");
		
		addItem(aquaticStone, "Aquatic Ingot");
		addItem(aquaticPellets, "Aquatic Pellets");
		addItem(pureAquaticPellets, "Pure Aquatic Pellets");
		
		addItem(cyclopseBow, "Cyclopsian Bow");
		addItem(cyclopseEye, "Cyclopse Eye");
		addItem(cyclopseStaff, "Cyclopsian Staff");
		addItem(cyclopseSword, "Cyclopsian Sword");

		//addItem(homeTeleporter, "Home Teleporter");
		addItem(shadowStone, "Shadow Stone");
		addItem(krakenScale, "Kraken Scale");
		addItem(krakenSkin, "Kraken Skin");
		addItem(callOfTheWatcher, "Call of the Watcher");
		addItem(furyFire, "Fury Fire");
		addItem(watchingEye, "Watching Eye");
		addItem(mysteriousClock, "Mysterious Clock");
		addItem(hordeHorn, "Horde Horn");
		addItem(baseSpawnCrystal, "Base Spawn Crystal");
		addItem(spawnSoulFiend, "Spawn Soul Fiend");
		addItem(spawnVamacheron, "Spawn Vamacheron");
		addItem(spawnTwilightDemon, "Spawn Twilight Demon");
		addItem(spawnKarot, "Spawn Kar-OT");
		addItem(spawnDensos, "Spawn Densos");
		addItem(infernalFlame, "Infernal Flame");
		addItem(legendaryEnderEye, "Legendary Ender Eye");
		addItem(netheriteChunk, "Netherite Chunk");
		addItem(shadowBar, "Shadow Bar");
		addItem(infernoBow, "Inferno Bow");
		addItem(arlemiteShickaxe, "Arlemite Shickaxe");
		addItem(rupeeShickaxe, "Rupee Shickaxe");
		addItem(realmiteShovel, "Realmite Shovel");
		addItem(realmitePickaxe, "Realmite Pickaxe");
		addItem(realmiteAxe, "Realmite Axe");
		addItem(realmiteHoe, "Realmite Hoe");
		addItem(arlemiteShovel, "Arlemite Shovel");
		addItem(arlemitePickaxe, "Arlemite Pickaxe");
		addItem(arlemiteAxe, "Arlemite Axe");
		addItem(arlemiteHoe, "Arlemite Hoe");
		addItem(rupeeShovel, "Rupee Shovel");
		addItem(rupeePickaxe, "Rupee Pickaxe");
		addItem(rupeeAxe, "Rupee Axe");
		addItem(rupeeHoe, "Rupee Hoe");
		addItem(bloodGem, "Blood Gem");
		addItem(divineStick, "Divine Wooden Stick");
		addItem(divineWoodAxe, "Divine Wooden Axe");
		addItem(divineWoodPickaxe, "Divine Wooden Pickaxe");
		addItem(divineWoodHoe, "Divine Wooden Hoe");
		addItem(divineWoodShovel, "Divine Wooden Shovel");
		//addItem(divineWoodSword, "Divine Wooden Sword");
		addItem(infernoSword , "Inferno Sword");
		addItem(bedrockSword , "Bedrock Sword");
		addItem(sharkFin , "Shark Fin");
		addItem(whaleFin , "Whale Fin");
		addItem(purpleGlowBoneTree , "Purple Glow Bone Tree");
		addItem(pinkGlowBoneTree , "Pink Glow Bone Tree");
		addItem(enderShard , "Ender Shard");
		addItem(moltenShard , "Molten Shard");
		addItem(corruptedShard , "Corrupted Shard");
		addItem(jungleStone , "Jungle Stone");
		addItem(divineStone , "Divine Stone");
		addItem(iceStone , "Ice Stone");
		addItem(enderStone , "Ender Stone");
		addItem(moltenStone , "Molten Stone");
		addItem(corruptedStone , "Corrupted Stone");
		addItem(blueFireStone , "Blue Fire Stone");
		addItem(grimReaperHead , "Grim Reaper Head");
		addItem(grimReaperBody , "Grim Reaper Body");
		addItem(grimReaperLegs , "Grim Reaper Legs");
		addItem(grimReaperBoots , "Grim Reaper Boots");
		addItem(massivence , "Massivence");
		addItem(palavence , "Palavence");
		addItem(arlemiteSword , "Arlemite Stabber");
		addItem(rupeeSword , "Rupee Rapier");
		addItem(realmiteSword , "Realmite Sword");
		addItem(aquaticTrident , "Aquatic Trident");
		addItem(oceanKnife , "Ocean Knife");
		addItem(aquaton , "Aquaton");
		addItem(sharkSword , "Shark Sword");
		addItem(crabclawMaul , "Crabclaw Maul");
		addItem(deathBringer , "Death Bringer");
		addItem(corruptedMaul , "Corrupted Maul");
		addItem(moltenSword , "Molten Sword");
		//addItem(vileStorm , "Vile Storm");
		addItem(bowHeadAnchor , "Bowhead Anchor");
		addItem(crabAnchor , "Crab Anchor");
		addItem(bowheadCannon , "Bowhead Cannon");
		addItem(maelstrom , "Maelstrom");
		addItem(ghastCannon , "Ghast Cannon");
		addItem(corruptCannon , "Corrupt Cannon");
		addItem(serenadeHealth, "Serenade of Health");
		addItem(angelicHelmet, "Angelic Helmet");
		addItem(angelicBody, "Angelic Body");
		addItem(angelicLegs, "Angelic Legs");
		addItem(angelicBoots, "Angelic Boots");
		addItem(rupeeHelmet, "Rupee Helmet");
		addItem(rupeeBody, "Rupee Body");
		addItem(rupeeLegs, "Rupee Legs");
		addItem(rupeeBoots, "Rupee Boots");
		addItem(realmiteHelmet, "Realmite Helmet");
		addItem(realmiteBody, "Realmite Body");
		addItem(realmiteLegs, "Realmite Legs");
		addItem(realmiteBoots, "Realmite Boots");
		addItem(eliteRealmiteHelmet, "Elite Realmite Helmet");
		addItem(eliteRealmiteBody, "Elite Realmite Body");
		addItem(eliteRealmiteLegs, "Elite Realmite Legs");
		addItem(eliteRealmiteBoots, "Elite Realmite Boots");
		addItem(arlemiteHelmet, "Arlemite Helmet");
		addItem(arlemiteBody, "Arlemite Body");
		addItem(arlemiteLegs, "Arlemite Legs");
		addItem(arlemiteBoots, "Arlemite Boots");
		addItem(aquaticHelmet, "Aquatic Helmet");
		addItem(aquaticBody, "Aquatic Body");
		addItem(aquaticLegs, "Aquatic Legs");
		addItem(aquaticBoots, "Aquatic Boots");
		addItem(shadowHelmet, "Shadow Helmet");
		addItem(serenadeOfDeath , "Serenade Of Death");
		addItem(shadowBody, "Shadow Body");
		addItem(shadowLegs, "Shadow Legs");
		addItem(shadowBoots, "Shadow Boots");
		addItem(bedrockMaul, "Bedrock Maul");
		addItem(soundOfMusic, "Sound of Music");
		addItem(jungleShard, "Jungle Shards");
		//addItem(shuriken, "Shuriken");
		addItem(serenadeStriker, "Serenade of Strikes");
		addItem(slimeSword, "Slime Sword");
		addItem(shadowBow, "Shadow Bow");

		addItem(arlemiteIngot, "Arlemite Ingot");
		addItem(realmiteIngot, "Realmite Ingot");
		addItem(netheriteIngot, "Netherite Bar");
		addItem(hellStoneIngot, "HellStone Ingot");
		addItem(serenadeOfLife, "Serenade Of Growth");

		addItem(crabClawCannon, "Crabclaw Cannon");
		addItem(frostCannon, "Frost Cannon");
		addItem(frostSword, "Frost Sword");
		addItem(divineSword, "Divine Sword");
		addItem(sandSlash, "Sandslash");
		addItem(iceShard, "Corrupted Shards");
		addItem(iceShard, "Frozen Shards");
		addItem(divineShard, "Divine Shards");
		addItem(enderSwordBlue, "Blue Ender Sword");
		addItem(enderSwordDark, "Dark Ender Sword");
		addItem(enderSwordGreen, "Green Ender Sword");
		addItem(enderSwordRed, "Red Ender Sword");
		addItem(enderSwordYellow, "Yellow Ender Sword");

		addItem(twilightClock, "Twilight Clock");

		addItem(krakenHelmet, "Kraken Helmet");
		addItem(krakenBody, "Kraken Body");
		addItem(krakenLegs, "Kraken Legs");
		addItem(krakenBoots, "Kraken Boots");
		addItem(enderSword, "Ender Sword");
		addItem(bluefirebow, "Bluefire Bow");
		addItem(rupeeIngot, "Rupee Ingot");
		addItem(tomato, "Tomato");
		addItem(tomatoSeeds, "Tomato Seeds");
		addItem(purpleBlaze, "Purple Blaze");
		addItem(jackOManBoots, "Jack-O-Man Boots");
		addItem(jackOManLegs, "Jack-O-Man Legs");
		addItem(jackOManBody, "Jack-O-Man Body");
		addItem(jackOManHead, "Jack-O-Man Head");
		addItem(scythe, "Scythe");
		addItem(sharkAnchor, "Shark Anchor");
		addItem(healingStone, "Healing Stone");
	}
}
