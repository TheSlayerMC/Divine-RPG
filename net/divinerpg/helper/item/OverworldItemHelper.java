package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.*;
import net.divinerpg.helper.block.*;
import net.divinerpg.item.*;
import net.divinerpg.item.iceika.*;
import net.divinerpg.item.overworld.*;
import net.divinerpg.item.tool.*;
import net.divinerpg.item.twilight.*;
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
	
	//public static final Item homeTeleporter = new ItemHomeTeleporter(y.homeTeleporterID).registerTextures("TeleportationCrystal").setUnlocalizedName("homeTeleporter").setCreativeTab(DivineRPG.Overworld);
	public static final Item frostCannon = new ItemFrostCannon(y.frostCannonID).registerTextures("FrostCannon").setUnlocalizedName("FrostCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item soundOfMusic = new ItemSoundMusic(y.soundOfMusicID).registerTextures("SoundOfMusic").setUnlocalizedName("SoundOfMusic").setCreativeTab(DivineRPG.Projectile);
	public static final Item crabClawCannon = new ItemCrabCannon(y.crabClawCannonID, 20, 20, 20, "", "").registerTextures("CrabclawCannon").setUnlocalizedName("CrabclawCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item bowheadCannon = new ItemBowCannon(y.bowheadCannonID, 20, 20, 20, "", "").registerTextures("BowHeadCannon").setUnlocalizedName("BowHeadCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item ghastCannon = new ItemGhastCannon(y.ghastCannonID, 20, 20, 20, "", "").registerTextures("GhastCannon").setUnlocalizedName("GhastCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item corruptCannon = new ItemCorruptCannon(y.corruptCannonID, 20, "", "").registerTextures("CorruptedCannon").setUnlocalizedName("CorruptedCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item tomato = new ItemDivineRPG(y.tomatoID).registerTextures("Tomato").setUnlocalizedName("Tomato").setCreativeTab(DivineRPG.Misc);
	public static final Item tomatoSeeds = new ItemModSeeds(y.tomatoSeedsID, OverworldBlockHelper.TomatoCrop.blockID, Block.tilledField.blockID).registerTextures("TomatoSeeds").setUnlocalizedName("TomatoSeeds").setCreativeTab(DivineRPG.Misc);
	public static final Item bowHeadAnchor = new ItemBaseAnchor(y.bowheadAnchorID, 20).registerTextures("BowHeadAnchor").setUnlocalizedName("BowHeadAnchor").setCreativeTab(DivineRPG.Swords);
	public static final Item sharkAnchor = new ItemBaseAnchor(y.sharkAnchorID, 20).registerTextures("SharkAnchor").setUnlocalizedName("SharkAnchor").setCreativeTab(DivineRPG.Swords);
	public static final Item crabAnchor = new ItemBaseAnchor(y.crabAnchorID, 20).registerTextures("CrabAnchor").setUnlocalizedName("CrabAnchor").setCreativeTab(DivineRPG.Swords);

	public static final Item maelstrom = new ItemMaelstrom(y.maelstromID, 14, 1, "", "").registerTextures("MaelStrom").setUnlocalizedName("MaelStrom").setCreativeTab(DivineRPG.Projectile);
	public static final Item scythe = new ItemScythe(y.scytheID).registerTextures("Scythe").setUnlocalizedName("Scythe").setCreativeTab(DivineRPG.Projectile);

	public static final Item twilightClock = new ItemTwilightClock(y.TwilightClockID).registerTextures("TwilightClock").setUnlocalizedName("TwilightClock").setCreativeTab(DivineRPG.Misc);

	public static final Item infernoBow = new ItemInfernoBow(y.infernobowID).setUnlocalizedName("InfernoBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item shadowBow = new ItemShadowBow(y.shadowBowID).setUnlocalizedName("ShadowBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item bluefirebow = new ItemBlueBow(y.BlueFireBowID).setUnlocalizedName("BluefireBow").setCreativeTab(DivineRPG.Projectile);

	public static final Item bloodGem = new ItemDivineRPG(y.bloodGemID).registerTextures("BloodGem").setUnlocalizedName("BloodGem").setCreativeTab(DivineRPG.Raw);
	public static final Item rupeeIngot = new ItemDivineRPG(y.rupeeID).registerTextures("RupeeIngot").setUnlocalizedName("RupeeIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item arlemiteIngot = new ItemDivineRPG(y.arlemiteID).registerTextures("ArlemiteIngot").setUnlocalizedName("ArlemiteIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item realmiteIngot = new ItemDivineRPG(y.realmiteID).registerTextures("RealmiteIngot").setUnlocalizedName("RealmiteIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item netheriteIngot = new ItemDivineRPG(y.netheriteID).registerTextures("NetheriteIngot").setUnlocalizedName("NetheriteIngot").setCreativeTab(DivineRPG.Raw);

	public static final Item jungleShard = new ItemDivineRPG(y.greenShardID).registerTextures("JungleShards").setUnlocalizedName("Jungle").setCreativeTab(DivineRPG.Raw);
	public static final Item iceShard = new ItemDivineRPG(y.iceShardID).registerTextures("IceShards").setUnlocalizedName("IceShard").setCreativeTab(DivineRPG.Raw);    
	public static final Item moltenShard = new ItemDivineRPG(y.redShardID).registerTextures("MoltenShards").setUnlocalizedName("Molten").setCreativeTab(DivineRPG.Raw);
	public static final Item divineShard = new ItemDivineRPG(y.yellowShardID).registerTextures("DivineShards").setUnlocalizedName("Divine").setCreativeTab(DivineRPG.Raw);
	public static final Item enderShard = new ItemDivineRPG(y.purpleShardID).registerTextures("EnderShards").setUnlocalizedName("Ender").setCreativeTab(DivineRPG.Raw);
	public static final Item corruptedShard = new ItemDivineRPG(y.corruptedShardsID).registerTextures("CorruptedShards").setUnlocalizedName("Corrupted").setCreativeTab(DivineRPG.Raw);

	public static final Item jungleStone = new ItemDivineRPG(y.jungleStoneID).registerTextures("JungleStone").setUnlocalizedName("JungleS").setCreativeTab(DivineRPG.Raw);
	public static final Item iceStone = new ItemDivineRPG(y.iceStoneID).registerTextures("IceStone").setUnlocalizedName("IceS").setCreativeTab(DivineRPG.Raw);
	public static final Item moltenStone = new ItemDivineRPG(y.moltenStoneID).registerTextures("MoltenStone").setUnlocalizedName("MoltenS").setCreativeTab(DivineRPG.Raw);
	public static final Item enderStone = new ItemDivineRPG(y.enderStoneID).registerTextures("EnderStone").setUnlocalizedName("EnderS").setCreativeTab(DivineRPG.Raw);
	public static final Item corruptedStone = new ItemDivineRPG(y.corruptedStoneID).registerTextures("CorruptedStone").setUnlocalizedName("CorruptedS").setCreativeTab(DivineRPG.Raw);
	public static final Item divineStone = new ItemDivineRPG(y.divineStoneID).registerTextures("DivineStone").setUnlocalizedName("DivineS").setCreativeTab(DivineRPG.Raw);
	public static final Item blueFireStone = new ItemDivineRPG(y.blueFireStoneID).registerTextures("BlueFireStone").setUnlocalizedName("BlueFireStone").setCreativeTab(DivineRPG.Raw);
	public static final Item healingStone = new ItemDivineRPG(y.healingStoneID).registerTextures("HealingStone").setUnlocalizedName("HS").setCreativeTab(DivineRPG.Raw);
	public static final Item shadowStone = new ItemDivineRPG(y.shadowStoneID).registerTextures("ShadowStone").setUnlocalizedName("shadowStone").setCreativeTab(DivineRPG.Raw);

	public static final Item hellStoneIngot = new ItemDivineRPG(y.hellStoneIngotID).registerTextures("HellStoneIngot").setUnlocalizedName("HellStoneIngot").setCreativeTab(DivineRPG.Raw);
	public static final Item purpleBlaze = new ItemDivineRPG(y.purpleBlazeID).registerTextures("PurpleBlaze").setUnlocalizedName("PurpleBlaze").setCreativeTab(DivineRPG.Raw);
	public static final Item shadowBar = new ItemDivineRPG(y.shadowBarID).registerTextures("ShadowBar").setUnlocalizedName("ShadowB").setCreativeTab(DivineRPG.Raw);
	public static final Item netheriteChunk = new ItemDivineRPG(y.netheriteChunkID).registerTextures("NetheriteChunk").setUnlocalizedName("Chunk").setCreativeTab(DivineRPG.Raw);
	public static final Item legendaryEnderEye = new ItemDivineRPG(y.legendaryEnderEyeID).registerTextures("LegendaryEnderEye").setUnlocalizedName("LEE").setCreativeTab(DivineRPG.Raw);

	public static final Item baseSpawnCrystal = new ItemDivineRPG(y.baseSpawnCrystalID).registerTextures("BaseSpawnCrystal").setUnlocalizedName("BaseSpawn").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnSoulFiend = new ItemSoulFiend(y.SoulFiendSpawnCrystalID).registerTextures("SpawnSoulFiend").setUnlocalizedName("SpawnSoul").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnVamacheron = new ItemVamacheron(y.VamacheronSpawnCrystalID).registerTextures("SpawnVamacheron").setUnlocalizedName("SpawnVamach").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnTwilightDemon = new ItemTwilightDemon(y.TwilightDemonSpawnCrystalID).registerTextures("SpawnTwilightDemon").setUnlocalizedName("Twilight").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnKarot = new ItemKarot(y.KarotSpawnCrystalID).registerTextures("SpawnKarot").setUnlocalizedName("Karot").setCreativeTab(DivineRPG.Spawn);
	public static final Item spawnDensos = new ItemDensos(y.DensosSpawnCrystalID).registerTextures("SpawnDensos").setUnlocalizedName("Densos").setCreativeTab(DivineRPG.Spawn);
	public static final Item hordeHorn = new ItemHordeHorn(y.hordeHornID).registerTextures("HordeHorn").setUnlocalizedName("HordeHorn").setCreativeTab(DivineRPG.Spawn);
	public static final Item mysteriousClock = new ItemMysteriousClock(y.mysteriousClockID).registerTextures("MysteriousClock").setUnlocalizedName("Mysterious").setCreativeTab(DivineRPG.Spawn);
	public static final Item callOfTheWatcher = new ItemWatcher(y.callOfTheWatcherID).registerTextures("CallOfTheWatcher").setUnlocalizedName("CallOfTheWatcher").setCreativeTab(DivineRPG.Spawn);
	public static final Item infernalFlame = new ItemInfernalFlame(y.infernalFlameID).registerTextures("InfernalFlame").setUnlocalizedName("Infernal").setCreativeTab(DivineRPG.Spawn);

	public static final Item watchingEye = new ItemDivineRPG(y.watchingEyeID).registerTextures("WatchingEye").setUnlocalizedName("WatchingEye").setCreativeTab(DivineRPG.Raw);
	public static final Item furyFire = new ItemDivineRPG(y.furyFireID).registerTextures("FuryFire").setUnlocalizedName("FuryFire").setCreativeTab(DivineRPG.Raw);
	public static final Item furyArrow = new ItemDivineRPG(y.FuryArrowID).registerTextures("FuryArrow").setUnlocalizedName("FuryArrow").setCreativeTab(DivineRPG.Raw);
	public static final Item krakenSkin = new ItemDivineRPG(y.krakenSkinID).registerTextures("KrakenSkin").setUnlocalizedName("KrakS").setCreativeTab(DivineRPG.Raw);
	public static final Item krakenScale = new ItemDivineRPG(y.krakenScaleID).registerTextures("KrakenScale").setUnlocalizedName("krakenScale").setCreativeTab(DivineRPG.Raw);

	public static final Item sharkFin = new ItemDivineRPG(y.sharkFinID).registerTextures("SharkFin").setUnlocalizedName("SharkFin").setCreativeTab(DivineRPG.Raw);
	public static final Item whaleFin = new ItemDivineRPG(y.whaleFinID).registerTextures("WhaleFin").setUnlocalizedName("WhaleFin").setCreativeTab(DivineRPG.Raw);
	public static final Item purpleGlowBoneTree = new ItemDivineRPG(y.purpleGlowTreeID).registerTextures("PurpleGlowBoneSeeds").setUnlocalizedName("PurpleTree").setCreativeTab(DivineRPG.Raw);
	public static final Item pinkGlowBoneTree = new ItemDivineRPG(y.pinkGlowTreeID).registerTextures("PinkGlowBoneSeeds").setUnlocalizedName("PinkTree").setCreativeTab(DivineRPG.Raw);
	public static final Item crabClaw = new ItemDivineRPG(y.crabClawID).registerTextures("CrabClaw").setUnlocalizedName("CrabClaw").setCreativeTab(DivineRPG.Raw);

	public static final Item shuriken = new ItemShuriken(y.shurikenID).registerTextures("Shuriken").setUnlocalizedName("Shuriken").setCreativeTab(DivineRPG.Projectile);
	public static final Item vileStorm = new ItemVailStorm(y.vileStormID).registerTextures("VileStorm").setUnlocalizedName("VileStorm").setCreativeTab(DivineRPG.Projectile);	

	public static final Item crabclawMaul = new ItemDivineRPGSword(y.crabClawMaulID, EnumHelper.addToolMaterial("crabclawmaul", 0, 8000, 0, 6, 22), true).registerTextures("CrabClawMaul").setUnlocalizedName("CrabClawMaul").setCreativeTab(DivineRPG.Swords);	
	public static final Item corruptedMaul = new ItemDivineRPGSword(y.corruptedMaulID, EnumHelper.addToolMaterial("corruptedmaul", 0, 6000, 0, 18, 22)).registerTextures("CorruptedMaul").setUnlocalizedName("CorruptedMaul").setCreativeTab(DivineRPG.Swords);
	public static final Item bedrockMaul = new ItemDivineRPGSword(y.bedrockMaulID, 15, EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, 22), true).registerTextures("BedrockMaul").setUnlocalizedName("bedrock").setCreativeTab(DivineRPG.Swords);	

	public static final Item serenadeStriker = new ItemSerenadeStriker(y.serenadeStrikerID).registerTextures("SerenadeStriker").setUnlocalizedName("SerenadeStriker").setCreativeTab(DivineRPG.Projectile);
	public static final Item serenadeOfLife = new ItemSerenadeGrowth(y.serenadeOfLifeID).registerTextures("SerenadeOfLife").setUnlocalizedName("serenadeLife").setCreativeTab(DivineRPG.Misc);
	public static final Item serenadeOfDeath = new ItemSerenadeDeath(y.serenadeOfDeathID).registerTextures("SerenadeOfDeath").setUnlocalizedName("SerenadeOfDeath").setCreativeTab(DivineRPG.Projectile);
	public static final Item serenadeHealth = new ItemSerenadeHealth(y.serenadeHealthID).registerTextures("SerenadeOfHealth").setUnlocalizedName("SerenadeOfHealth").setCreativeTab(DivineRPG.Misc);

	public static final Item divineStick = new ItemDivineRPG(y.divineStickID).registerTextures("DivineStick").setUnlocalizedName("DivineStick").setCreativeTab(DivineRPG.Raw);
	public static final Item divineWoodAxe = new ToolAxe(y.divineWoodAxeID, divineWood).registerItemTexture("DivineWoodAxe").setUnlocalizedName("DivineWoodAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodPickaxe = new ToolPickaxe(y.divineWoodPickID, divineWood).registerItemTexture("DivineWoodPickaxe").setUnlocalizedName("DivineWoodPickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodHoe = new ToolHoe(y.divineWoodHoeID, divineWood).registerItemTexture("DivineWoodHoe").setUnlocalizedName("DivineWoodHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodShovel = new ToolShovel(y.divineWoodShovelID, divineWood).registerItemTexture("DivineWoodShovel").setUnlocalizedName("DivineWoodShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item divineWoodSword = new ToolSword(y.divineWoodSwordID, divineWood).registerItemTexture("DivineWoodSword").setUnlocalizedName("DivineWoodSword").setCreativeTab(DivineRPG.Swords);

	public static final Item cyclopseEye = new ItemDivineRPG(y.cyclopseEyeID).registerTextures("CyclopseEye").setUnlocalizedName("CyclopseEye").setCreativeTab(DivineRPG.Raw);
	public static final Item cyclopseStaff = new ItemCyclopseStaff(y.cyclopseStaffID, 17, 1, 2, Sound.Staff, Sound.Staff).registerTextures("CyclopianStaff").setUnlocalizedName("CyclopseStaff").setCreativeTab(DivineRPG.Projectile);
	public static final Item cyclopseBow = new ItemCyclopseBow(y.cyclopseBowID).setUnlocalizedName("CyclopianBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item cyclopseSword = new ItemDivineRPGSword(y.cyclopseSwordID, Cyclopse).registerTextures("CyclopianSword").setUnlocalizedName("CyclopianSword").setCreativeTab(DivineRPG.Swords);

	public static final Item shadowHelmet = new ItemBaseArmor(y.shadowHelmetID, shadow, 0, HEAD, true).setDamageReduction(0.150D).setDescriptors(shadowDesc).setUnlocalizedName("ShadowHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item shadowBody = new ItemBaseArmor(y.shadowBodyID, shadow, 1, BODY, true).setDamageReduction(0.150D).setDescriptors(shadowDesc).setUnlocalizedName("ShadowBody").setCreativeTab(DivineRPG.Armor);
	public static final Item shadowLegs = new ItemBaseArmor(y.shadowLegsID, shadow, 2, LEGS, true).setDamageReduction(0.150D).setDescriptors(shadowDesc).setUnlocalizedName("ShadowLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item shadowBoots = new ItemBaseArmor(y.shadowBootsID, shadow, 3, BOOTS, true).setDamageReduction(0.150D).setDescriptors(shadowDesc).setUnlocalizedName("ShadowBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item aquaticHelmet = new ItemBaseArmor(y.aquaticHelmetID, aquatic, 0, HEAD, true).setDamageReduction(0.135D).setDescriptors(aquaticDesc).setUnlocalizedName("AquastriveHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item aquaticBody = new ItemBaseArmor(y.aquaticBodyID, aquatic, 1, BODY, true).setDamageReduction(0.135D).setDescriptors(aquaticDesc).setUnlocalizedName("AquastriveBody").setCreativeTab(DivineRPG.Armor);
	public static final Item aquaticLegs = new ItemBaseArmor(y.aquaticLegsID, aquatic, 2, LEGS, true).setDamageReduction(0.135D).setDescriptors(aquaticDesc).setUnlocalizedName("AquastriveLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item aquaticBoots = new ItemBaseArmor(y.aquaticBootsID, aquatic, 3, BOOTS, true).setDamageReduction(0.135D).setDescriptors(aquaticDesc).setUnlocalizedName("AquastriveBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item eliteRealmiteHelmet = new ItemBaseArmor(y.eliteRealHelmID, eliteRealmite, 0, HEAD, true).setDamageReduction(0.125D).setDescriptors(eliteRealmiteDesc).setUnlocalizedName("EliteRealmiteHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item eliteRealmiteBody = new ItemBaseArmor(y.eliteRealBodyID, eliteRealmite, 1, BODY, true).setDamageReduction(0.125D).setDescriptors(eliteRealmiteDesc).setUnlocalizedName("EliteRealmiteBody").setCreativeTab(DivineRPG.Armor);
	public static final Item eliteRealmiteLegs = new ItemBaseArmor(y.eliteRealLegsID, eliteRealmite, 2, LEGS, true).setDamageReduction(0.125D).setDescriptors(eliteRealmiteDesc).setUnlocalizedName("EliteRealmiteLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item eliteRealmiteBoots = new ItemBaseArmor(y.eliteRealBootsID, eliteRealmite, 3, BOOTS, true).setDamageReduction(0.125D).setDescriptors(eliteRealmiteDesc).setUnlocalizedName("EliteRealmiteBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item angelicHelmet = new ItemBaseArmor(y.angelicHeadID, angelicArmor, 0, HEAD, true).setDescriptors(angelicDesc).setUnlocalizedName("AngelicHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item angelicBody = new ItemBaseArmor(y.angelicBodyID, angelicArmor, 1, BODY, true).setDescriptors(angelicDesc).setUnlocalizedName("AngelicBody").setCreativeTab(DivineRPG.Armor);
	public static final Item angelicLegs = new ItemBaseArmor(y.angelicLegsID, angelicArmor, 2, LEGS, true).setDescriptors(angelicDesc).setUnlocalizedName("AngelicLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item angelicBoots = new ItemBaseArmor(y.angelicBootsID, angelicArmor, 3, BOOTS, true).setDescriptors(angelicDesc).setUnlocalizedName("AngelicBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item realmiteHelmet = new ItemBaseArmor(y.realmiteHelmetID, realmiteArmor, 0, HEAD, true).setDamageReduction(0.85D).setDescriptors(realmiteDesc).setUnlocalizedName("RealmiteHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item realmiteBody = new ItemBaseArmor(y.realmiteBodyID, realmiteArmor, 1, BODY, true).setDamageReduction(0.85D).setDescriptors(realmiteDesc).setUnlocalizedName("RealmiteBody").setCreativeTab(DivineRPG.Armor);
	public static final Item realmiteLegs = new ItemBaseArmor(y.realmiteLegsID, realmiteArmor, 2, LEGS, true).setDamageReduction(0.85D).setDescriptors(realmiteDesc).setUnlocalizedName("RealmiteLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item realmiteBoots = new ItemBaseArmor(y.realmiteBootsID, realmiteArmor, 3, BOOTS, true).setDamageReduction(0.85D).setDescriptors(realmiteDesc).setUnlocalizedName("RealmiteBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item arlemiteHelmet = new ItemBaseArmor(y.arlemiteHelmetID, arlemiteArmor, 0, HEAD, true).setDescriptors(arlemiteDesc).setUnlocalizedName("ArlemiteHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item arlemiteBody = new ItemBaseArmor(y.arlemiteBodyID, arlemiteArmor, 1, BODY, true).setDescriptors(arlemiteDesc).setUnlocalizedName("ArlemiteBody").setCreativeTab(DivineRPG.Armor);
	public static final Item arlemiteLegs = new ItemBaseArmor(y.arlemiteLegsID, arlemiteArmor, 2, LEGS, true).setDescriptors(arlemiteDesc).setUnlocalizedName("ArlemiteLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item arlemiteBoots = new ItemBaseArmor(y.arlemiteBootsID, arlemiteArmor, 3, BOOTS, true).setDescriptors(arlemiteDesc).setUnlocalizedName("ArlemiteBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item rupeeHelmet = new ItemBaseArmor(y.rupeeHelmetID, rupeeArmor, 0, HEAD, true).setDamageReduction(0.135D).setDescriptors(rupeeDesc).setUnlocalizedName("RupeeHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item rupeeBody = new ItemBaseArmor(y.rupeeBodyID, rupeeArmor, 1, BODY, true).setDamageReduction(0.135D).setDescriptors(rupeeDesc).setUnlocalizedName("RupeeBody").setCreativeTab(DivineRPG.Armor);
	public static final Item rupeeLegs = new ItemBaseArmor(y.rupeeLegsID, rupeeArmor, 2, LEGS, true).setDamageReduction(0.135D).setDescriptors(rupeeDesc).setUnlocalizedName("RupeeLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item rupeeBoots = new ItemBaseArmor(y.rupeeBootsID, rupeeArmor, 3, BOOTS, true).setDamageReduction(0.135D).setDescriptors(rupeeDesc).setUnlocalizedName("RupeeBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item krakenHelmet = new ItemBaseArmor(y.krakenHelmID, kraken, 0, HEAD, true).setDamageReduction(0.75D).setDescriptors(krakenDesc).setUnlocalizedName("KrakenHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item krakenBody = new ItemBaseArmor(y.krakenBodyID, kraken, 1, BODY, true).setDamageReduction(0.75D).setDescriptors(krakenDesc).setUnlocalizedName("KrakenBody").setCreativeTab(DivineRPG.Armor);
	public static final Item krakenLegs = new ItemBaseArmor(y.krakenLegsID, kraken, 2, LEGS, true).setDamageReduction(0.75D).setDescriptors(krakenDesc).setUnlocalizedName("KrakenLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item krakenBoots = new ItemBaseArmor(y.krakenBootsID, kraken, 3, BOOTS, true).setDamageReduction(0.75D).setDescriptors(krakenDesc).setUnlocalizedName("KrakenBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item grimReaperHead = new ItemBaseArmor(y.grimReaperHeadID, grim, 0, HEAD, true).setDescriptors(skeletonDesc).setUnlocalizedName("SkelemanHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item grimReaperBody = new ItemBaseArmor(y.grimReaperBodyID, grim, 1, BODY, true).setDescriptors(skeletonDesc).setUnlocalizedName("SkelemanBody").setCreativeTab(DivineRPG.Armor);
	public static final Item grimReaperLegs = new ItemBaseArmor(y.grimReaperLegsID, grim, 2, LEGS, true).setDescriptors(skeletonDesc).setUnlocalizedName("SkelemanLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item grimReaperBoots = new ItemBaseArmor(y.grimReaperBootsID, grim, 3, BOOTS, true).setDescriptors(skeletonDesc).setUnlocalizedName("SkelemanBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item jackOManBoots = new ItemBaseArmor(y.jackOManBootsID, jack, 0, HEAD, true).setDescriptors(jackDesc).setUnlocalizedName("JackOManBoots").setCreativeTab(DivineRPG.Armor);
	public static final Item jackOManLegs = new ItemBaseArmor(y.jackOManLegsID, jack, 1, BODY, true).setDescriptors(jackDesc).setUnlocalizedName("JackOManLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item jackOManBody = new ItemBaseArmor(y.jackOManBodyID, jack, 2, LEGS, true).setDescriptors(jackDesc).setUnlocalizedName("JackOManBody").setCreativeTab(DivineRPG.Armor);
	public static final Item jackOManHead = new ItemBaseArmor(y.jackOManHeadID, jack, 3, BOOTS, true).setDescriptors(jackDesc).setUnlocalizedName("JackOManHelmet").setCreativeTab(DivineRPG.Armor);

	public static final Item ironHelmet = new ItemBaseArmor(y.ironHelmID, iron, 0, HEAD, false).setUnlocalizedName("IronHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item ironBody = new ItemBaseArmor(y.ironBodyID, iron, 1, BODY, false).setUnlocalizedName("IronBody").setCreativeTab(DivineRPG.Armor);
	public static final Item ironLegs = new ItemBaseArmor(y.ironLegsID, iron, 2, LEGS, false).setUnlocalizedName("IronLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item ironBoots = new ItemBaseArmor(y.ironBootsID, iron, 3, BOOTS, false).setUnlocalizedName("IronBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item diamondHelmet = new ItemBaseArmor(y.diamondHelmID, diamond, 0, HEAD, false).setUnlocalizedName("DiamondHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item diamondBody = new ItemBaseArmor(y.diamondBodyID, diamond, 1, BODY, false).setUnlocalizedName("DiamondBody").setCreativeTab(DivineRPG.Armor);
	public static final Item diamondLegs = new ItemBaseArmor(y.diamondLegsID, diamond, 2, LEGS, false).setUnlocalizedName("DiamondLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item diamondBoots = new ItemBaseArmor(y.diamondBootsID, diamond, 3, BOOTS, false).setUnlocalizedName("DiamondBoots").setCreativeTab(DivineRPG.Armor);

	public static final Item rupeeShovel = new ToolShovel(y.rupeeShovelID, Rupee).registerItemTexture("RupeeShovel").setUnlocalizedName("RupeeShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeAxe = new ToolAxe(y.rupeeAxeID, Rupee).registerItemTexture("RupeeAxe").setUnlocalizedName("RupeeAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeHoe = new ToolHoe(y.rupeeHoeID, Rupee).registerItemTexture("RupeeHoe").setUnlocalizedName("RupeeHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeePickaxe = new ToolPickaxe(y.rupeePickaxeID, Rupee).registerItemTexture("RupeePickaxe").setUnlocalizedName("RupeePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item rupeeSword = new ToolSword(y.rupeeRapierID, Rupee).registerItemTexture("RupeeSword").setUnlocalizedName("RupeeSword").setCreativeTab(DivineRPG.Swords);
	
	public static final Item netheriteHelmet = new ItemBaseArmor(y.NetheriteHelmetID, netherite, 0, HEAD, true).setDescriptors(netheriteDesc).setUnlocalizedName("NetheriteHelmet");
	public static final Item netheriteBody = new ItemBaseArmor(y.NetheriteBodyID, netherite, 1, BODY, true).setDescriptors(netheriteDesc).setUnlocalizedName("NetheriteBody");
	public static final Item netheriteLegs = new ItemBaseArmor(y.NetheriteLegsID, netherite, 2, LEGS, true).setDescriptors(netheriteDesc).setUnlocalizedName("NetheriteLegs");
	public static final Item netheriteBoots = new ItemBaseArmor(y.NetheriteBootsID, netherite, 3, BOOTS, true).setDescriptors(netheriteDesc).setUnlocalizedName("NetheriteBoots");
	
	public static final Item infernoHelmet = new ItemBaseArmor(y.infernoHelmetID, inferno, 0, HEAD, true).setDescriptors(infernoDesc).setUnlocalizedName("InfernoHelmet");
	public static final Item infernoBody = new ItemBaseArmor(y.infernoBodyID, inferno, 1, BODY, true).setDescriptors(infernoDesc).setUnlocalizedName("InfernoBody");
	public static final Item infernoLegs = new ItemBaseArmor(y.infernoLegsID, inferno, 2, LEGS, true).setDescriptors(infernoDesc).setUnlocalizedName("InfernoLegs");
	public static final Item infernoBoots = new ItemBaseArmor(y.infernoBootsID, inferno, 3, BOOTS, true).setDescriptors(infernoDesc).setUnlocalizedName("InfernoBoots");
	
	public static final Item enderHelmet = new ItemBaseArmor(y.EnderHelmetID, ender, 0, HEAD, true).setDescriptors(enderDesc).setUnlocalizedName("EnderHelmet");
	public static final Item enderBody = new ItemBaseArmor(y.EnderBodyID, ender, 1, BODY, true).setDescriptors(enderDesc).setUnlocalizedName("EnderBody");
	public static final Item enderLegs = new ItemBaseArmor(y.EnderLegsID, ender, 2, LEGS, true).setDescriptors(enderDesc).setUnlocalizedName("EnderLegs");
	public static final Item enderBoots = new ItemBaseArmor(y.EnderBootsID, ender, 3, BOOTS, true).setDescriptors(enderDesc).setUnlocalizedName("EnderBoots");
	
	public static final Item bedrockHelmet = new ItemBaseArmor(y.BedrockHelmetID, bedrockArmor , 0, HEAD, true).setDescriptors(bedrockDesc).setUnlocalizedName("BedrockHelmet");
	public static final Item bedrockBody = new ItemBaseArmor(y.BedrockBodyID, bedrockArmor, 1, BODY, true).setDescriptors(bedrockDesc).setUnlocalizedName("BedrockBody");
	public static final Item bedrockLegs = new ItemBaseArmor(y.BedrockLegsID, bedrockArmor, 2, LEGS, true).setDescriptors(bedrockDesc).setUnlocalizedName("BedrockLegs");
	public static final Item bedrockBoots = new ItemBaseArmor(y.BedrockBootsID, bedrockArmor, 3, BOOTS, true).setDescriptors(bedrockDesc).setUnlocalizedName("BedrockBoots");
	
	public static final Item arlemiteShovel = new ToolShovel(y.arlemiteShovelID, Arlemite).registerItemTexture("ArlemiteShovel").setUnlocalizedName("ArlemiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteAxe = new ToolAxe(y.arlemiteAxeID, Arlemite).registerItemTexture("ArlemiteAxe").setUnlocalizedName("ArlemiteAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteHoe = new ToolHoe(y.arlemiteHoeID, Arlemite).registerItemTexture("ArlemiteHoe").setUnlocalizedName("ArlemiteHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemitePickaxe = new ToolPickaxe(y.arlemitePickaxeID, Arlemite).registerItemTexture("ArlemitePickaxe").setUnlocalizedName("ArlemitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteSword = new ToolSword(y.arlemiteStabberID, ArlemiteSword).registerItemTexture("ArlemiteSword").setUnlocalizedName("ArlemiteSword").setCreativeTab(DivineRPG.Swords);

	public static final Item realmiteShovel = new ToolShovel(y.realmiteShovelID, Realmite).registerItemTexture("RealmiteShovel").setUnlocalizedName("RealmiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteAxe = new ToolAxe(y.realmiteAxeID, Realmite).registerItemTexture("RealmiteAxe").setUnlocalizedName("RealmiteAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteHoe = new ToolHoe(y.realmiteHoeID, Realmite).registerItemTexture("RealmiteHoe").setUnlocalizedName("RealmiteHoe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmitePickaxe = new ToolPickaxe(y.realmitePickaxeID, Realmite).registerItemTexture("RealmitePickaxe").setUnlocalizedName("RealmitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item realmiteSword = new ToolSword(y.realmiteSwordID, Realmite).registerItemTexture("RealmiteSword").setUnlocalizedName("RealmiteSword").setCreativeTab(DivineRPG.Swords);

	public static final Item BedrockShovel = new ToolShovel(y.BedrockShovelID, Bedrock).registerItemTexture("BedrockShovel").setUnlocalizedName("BedrockShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item BedrockAxe = new ToolAxe(y.BedrockAxeID, Bedrock).registerItemTexture("BedrockAxe").setUnlocalizedName("BedrockAxe").setCreativeTab(DivineRPG.Tools);
	public static final Item BedrockPickaxe = new ToolPickaxe(y.BedrockPickaxeID, Bedrock).registerItemTexture("BedrockPickaxe").setUnlocalizedName("BedrockPickaxe").setCreativeTab(DivineRPG.Tools);
	
	public static final Item rupeeShickaxe = new ToolShickaxe(y.rupeeShickaxeID, RupeeShick).registerShickaxeTextures("RupeeShickaxe").setUnlocalizedName("RupeeShickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item arlemiteShickaxe = new ToolShickaxe(y.arlemiteShickaxeID, arlemiteShick).registerShickaxeTextures("ArlemiteShickaxe").setUnlocalizedName("ArlemiteShickaxe").setCreativeTab(DivineRPG.Tools);

	//public static final Item FlameThrower = new ItemFlameThrower(y.FlameThrowerID).registerTextures("CyclopianSword").setUnlocalizedName("CyclopianSword").setCreativeTab(DivineRPG.Overworld);

	public static final Item infernoSword = new ItemInfernoSword(y.infernoSwordID, Inferno).registerTextures("InfernoSword").setUnlocalizedName("InfernoSword").setCreativeTab(DivineRPG.Swords);
	public static final Item sandSlash = new ItemDivineRPGSword(y.sandSlashID, SandSlash).registerTextures("SandSlash").setCreativeTab(DivineRPG.Swords);
	public static final Item frostSword = new ItemFrostSword(y.frostSwordID, FrostSword).registerTextures("FrostSword").setUnlocalizedName("FrostSword").setCreativeTab(DivineRPG.Swords);
	public static final Item bedrockSword = new ItemDivineRPGSword(y.bedrockSwordID, BedrockSword).registerTextures("BedrockSword").setUnlocalizedName("BedrockSword").setCreativeTab(DivineRPG.Swords);
	public static final Item divineSword = new ItemDivineRPGSword(y.divineSwordID, DivineSword, true).registerTextures("DivineSword").setUnlocalizedName("DivineSword").setCreativeTab(DivineRPG.Swords);
	public static final Item moltenSword = new ItemDivineRPGSword(y.moltenSwordID, MoltenSword).registerTextures("MoltenSword").setUnlocalizedName("MoltenSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSword = new ItemDivineRPGSword(y.enderSwordID, EnderSword, true).registerTextures("EnderSword").setUnlocalizedName("enderSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordBlue = new ItemDivineRPGSword(y.enderSwordBlueID, EnderSword, true).registerTextures("EnderSwordBlue").setUnlocalizedName("enderSwordBlue").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordDark = new ItemDivineRPGSword(y.enderSwordBlackID, EnderSword, true).registerTextures("EnderSwordBlack").setUnlocalizedName("enderSwordDark").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordGreen = new ItemDivineRPGSword(y.enderSwordGreenID, EnderSword, true).registerTextures("EnderSwordGreen").setUnlocalizedName("enderSwordGreen").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordRed = new ItemDivineRPGSword(y.enderSwordRedID, EnderSword, true).registerTextures("EnderSwordRed").setUnlocalizedName("enderSwordRed").setCreativeTab(DivineRPG.Swords);
	public static final Item enderSwordYellow = new ItemDivineRPGSword(y.enderSwordYellowID, EnderSword, true).registerTextures("EnderSwordYellow").setUnlocalizedName("enderSwordYellow").setCreativeTab(DivineRPG.Swords);
	public static final Item slimeSword = new ItemSlimeSword(y.slimeSwordID, SlimeSword).registerTextures("SlimeSword").setUnlocalizedName("SlimeSword").setCreativeTab(DivineRPG.Swords);
	public static final Item sharkSword = new ItemDivineRPGSword(y.sharkSwordID, EnumHelper.addToolMaterial("sharksword", 0, 2000, 0, 11, 22)).registerTextures("SharkSword").setUnlocalizedName("SharkSword").setCreativeTab(DivineRPG.Swords);
	public static final Item aquaticTrident = new ItemDivineRPGSword(y.aquaticTridentID, EnumHelper.addToolMaterial("aquatictrident", 0, 7000, 0, 15, 22)).registerTextures("AquaticTrident").setUnlocalizedName("AquaticTrident").setCreativeTab(DivineRPG.Swords);
	public static final Item oceanKnife = new ItemDivineRPGSword(y.oceanKnifeID, OceanKnife).registerTextures("AquaticKnife").setUnlocalizedName("AquaticKnife").setCreativeTab(DivineRPG.Swords);
	public static final Item aquaton = new ItemDivineRPGSword(y.aquatonID, Aquaton).registerTextures("Aquaton").setUnlocalizedName("Aquaton").setCreativeTab(DivineRPG.Swords);
	public static final Item deathBringer = new ItemDivineRPGSword(y.deathBringerID, DeathBringer).registerTextures("DeathBringer").setUnlocalizedName("DeathBringer").setCreativeTab(DivineRPG.Swords);
	public static final Item massivence = new ItemMassivence(y.massivenceID, Massivence).registerTextures("Massivence").setUnlocalizedName("Massivence").setCreativeTab(DivineRPG.Swords);
	public static final Item palavence = new ItemPalavence(y.palavenceID).registerTextures("Palavence").setUnlocalizedName("Palavence").setCreativeTab(DivineRPG.Swords);
	public static final Item bloodGemSword = new ItemDivineRPGSword(y.bloodgemSwordID, BloodgemTool).registerTextures("BloodgemSword").setUnlocalizedName("Bloodgem").setCreativeTab(DivineRPG.Swords);

	public static final Item aquaticStone = new ItemDivineRPG(y.aquaticStoneID).registerTextures("AquaticStone").setUnlocalizedName("AquaStone").setCreativeTab(DivineRPG.Raw);
	public static final Item aquaticPellets = new ItemDivineRPG(y.aquaticPelletsID).registerTextures("AquaticPellets").setUnlocalizedName("aquaticPellets").setCreativeTab(DivineRPG.Raw);
	public static final Item pureAquaticPellets = new ItemDivineRPG(y.pureAquaticPelletsID).registerTextures("PureAquaticPellets").setUnlocalizedName("PureAquaticPellets").setCreativeTab(DivineRPG.Raw);

	public static final Item donut = new ItemDivineRPGFood(x.donutID, 1, 1, true).registerTextures("Donut");
	public static final Item pizzaDough = new ItemDivineRPGFood(x.pizzaDoughID, 1, 1, true).registerTextures("PizzaDough");
	public static final Item bacon = new ItemDivineRPGFood(x.baconID, 1, 1, true).registerTextures("Bacon");
	public static final Item cheese = new ItemDivineRPGFood(x.cheeseID, 1, 1, true).registerTextures("Cheese");
	public static final Item miniPizza = new ItemDivineRPGFood(x.pizzaID, 1, 1, true).registerTextures("MiniPizza");
	public static final Item dinner = new ItemDivineRPGFood(x.mealID, 1, 1, true).registerTextures("Dinner");
	public static final Item boiledEgg = new ItemDivineRPGFood(x.boiledEggID, 1, 1, true).registerTextures("BoiledEgg");
	
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
		addItem(divineWoodSword, "Divine Wooden Sword");
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
