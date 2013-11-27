package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.config.ConfigHelper;
import net.divinerpg.item.ItemBaseArmor;
import net.divinerpg.item.ItemBowCore;
import net.divinerpg.item.ItemHaliteBow;
import net.divinerpg.item.ItemSlicer;
import net.divinerpg.item.overworld.ItemBlitz;
import net.divinerpg.item.tool.ItemBaseTwilightShickaxe;
import net.divinerpg.item.tool.ToolAxe;
import net.divinerpg.item.tool.ToolPickaxe;
import net.divinerpg.item.tool.ToolShovel;
import net.divinerpg.item.tool.ToolSword;
import net.divinerpg.item.twilight.ItemPhaser;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightItemHelper extends HelperBase  {



	public static Item fireThrower;
	
	public static final Item DraviteShickaxe = new ItemBaseTwilightShickaxe(y.DraviteShickaxeID, draviteShick).registerShickaxeTextures("DraviteShickaxe").setUnlocalizedName("DraviteShickaxe");
	public static final Item MythrilShickaxe = new ItemBaseTwilightShickaxe(y.MythrilShickaxeID, mythrilShick).registerShickaxeTextures("MythrilShickaxe").setUnlocalizedName("MythrilShickaxe");
	public static final Item AzuriteShickaxe = new ItemBaseTwilightShickaxe(y.AzuriteShickaxeID, azuriteShick).registerShickaxeTextures("AzuriteShickaxe").setUnlocalizedName("AzuriteShickaxe");
	public static final Item UviteShickaxe = new ItemBaseTwilightShickaxe(y.UviteShickaxeID, uviteShick).registerShickaxeTextures("UviteShickaxe").setUnlocalizedName("UviteShickaxe");
	public static final Item AugiteShickaxe = new ItemBaseTwilightShickaxe(y.AugiteShickaxeID, augiteShick).registerShickaxeTextures("AugiteShickaxe").setUnlocalizedName("AugiteShickaxe");
	public static final Item DivineShickaxe = new ItemBaseTwilightShickaxe(y.DivineShickaxeID, divineShick).registerShickaxeTextures("DivineShickaxe").setUnlocalizedName("DivineShickaxe");

	//Halite
	public static final Item haliteHelmet = new ItemBaseArmor(y.HaliteHelmetID, haliteArmor, 0, HEAD, true).setDescriptors(haliteDesc).setUnlocalizedName("HaliteHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item haliteBody = new ItemBaseArmor(y.HaliteChestID, haliteArmor, 1, BODY, true).setDescriptors(haliteDesc).setUnlocalizedName("HaliteBody").setCreativeTab(DivineRPG.Armor);
	public static final Item haliteLegs = new ItemBaseArmor(y.HalitelegsID, haliteArmor, 2, LEGS, true).setDescriptors(haliteDesc).setUnlocalizedName("HaliteLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item haliteBoots = new ItemBaseArmor(y.HaliteBootsID, haliteArmor, 3, BOOTS, true).setDescriptors(haliteDesc).setUnlocalizedName("HaliteBoots").setCreativeTab(DivineRPG.Armor);
	public static final Item haliteBow = new ItemHaliteBow(y.HaliteBowID).setUnlocalizedName("HaliteBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item halitePhaser = new ItemPhaser(y.HalitePhaserID, 0, 1, 2).registerTextures("HalitePhaser").setUnlocalizedName("HalitePhaser").setCreativeTab(DivineRPG.Projectile);
	public static final Item HaliteBlade = new ToolSword(y.HaliteBladeID, halite).registerItemTexture("HaliteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("HaliteBlade");
	public static final Item HaliteSlicer = new ItemSlicer(y.HaliteSlicerID).registerTextures("HaliteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("HaliteSlicer");
	public static final Item HaliteBlitz = new ItemBlitz(y.HaliteBlitzID).registerTextures("HaliteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("HaliteBlitz");

	//Mythril
	public static final Item mythrilFragment = new ItemDivineRPG(y.MythrilFragmentsID).registerTextures("MythrilFragments").setUnlocalizedName("Frag4").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilSoul = new ItemDivineRPG(y.MythrilSoulID).registerTextures("MythrilSoul").setUnlocalizedName("Soul4").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilChunk = new ItemDivineRPG(y.MythrilChunkID).registerTextures("MythrilChunk").setUnlocalizedName("Chunk5").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilDust = new ItemDivineRPG(y.MythrilDustID).registerTextures("MythrilDust").setUnlocalizedName("Dust6").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilGem = new ItemDivineRPG(y.MythrilGemID).registerTextures("MythrilGem").setUnlocalizedName("Gem7").setCreativeTab(DivineRPG.Raw);
	public static final Item MythrilBlade = new ToolSword(y.MythrilBladeID, mythril).registerItemTexture("MythrilBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("MythrilBlade");
	public static final Item MythrilPhaser = new ItemPhaser(y.MythrilPhaserID, 0, 1, 2).registerTextures("MythrilPhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilPhaser");
	public static final Item MythrilBlitz = new ItemBlitz(y.MythrilBlitzID).registerTextures("MythrilBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilBlitz");
	public static final Item MythrilBow = new ItemBowCore(y.MythrilBowID).registerTextures("MythrilBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilBow");
	public static final Item MythrilHelmet = new ItemBaseArmor(y.MythrilHelmetID, mythrilArmor, 0, HEAD, true).setDescriptors(mythrilDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("MythrilHelmet");
	public static final Item MythrilBoots = new ItemBaseArmor(y.MythrilBootsID, mythrilArmor, 3, BOOTS, true).setDescriptors(mythrilDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("MythrilBoots");
	public static final Item Mythrillegs = new ItemBaseArmor(y.MythrillegsID, mythrilArmor, 2, LEGS, true).setDescriptors(mythrilDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("MythrilLegs");
	public static final Item MythrilChest = new ItemBaseArmor(y.MythrilChestID, mythrilArmor, 1, BODY, true).setDescriptors(mythrilDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("MythrilBody");
	public static final Item MythrilSlicer = new ItemSlicer(y.MythrilSlicerID).registerTextures("MythrilSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilSlicer");
	public static final Item MythrilPickaxe = new ToolPickaxe(y.MythrilPickaxeID, mythrilTools).registerItemTexture("MythrilPickaxe").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilPick");
	public static final Item MythrilShovel = new ToolShovel(y.MythrilShovelID, mythrilTools).registerItemTexture("MythrilShovel").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilShovel");
	public static final Item MythrilAxe = new ToolAxe(y.MythrilAxeID, mythrilTools).registerItemTexture("MythrilAxe").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilAxe");
	
	//Divine
	public static final Item divineHelmet = new ItemBaseArmor(y.divineHelmID, divineArmor, 0, HEAD, true).setDescriptors(divineDesc).setUnlocalizedName("DivineHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item divineBody = new ItemBaseArmor(y.divineBodyID, divineArmor, 1, BODY, true).setDescriptors(divineDesc).setUnlocalizedName("DivineBody").setCreativeTab(DivineRPG.Armor);
	public static final Item divineLegs = new ItemBaseArmor(y.divineLegsID, divineArmor, 2, LEGS, true).setDescriptors(divineDesc).setUnlocalizedName("DivineLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item divineBoots = new ItemBaseArmor(y.divineBootsID, divineArmor, 3, BOOTS, true).setDescriptors(divineDesc).setUnlocalizedName("DivineBoots").setCreativeTab(DivineRPG.Armor);
	public static final Item DivinePickaxe = new ToolPickaxe(y.DivinePickaxeID, Divine).registerItemTexture("DivinePickaxe").setUnlocalizedName("DivinePickaxe");
	public static final Item DivineShovel = new ToolShovel(y.DivineShovelID, Divine).registerItemTexture("DivineShovel").setUnlocalizedName("DivineShovel");
	public static final Item DivineAxe = new ToolAxe(y.DivineAxeID, Divine).registerItemTexture("DivineAxe").setUnlocalizedName("DivineAxe");
	
	//Dravite
	public static final Item draviteFragment = new ItemDivineRPG(y.DraviteFragmentsID).registerTextures("DraviteFragments").setUnlocalizedName("Frag1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteChunk = new ItemDivineRPG(y.DraviteChunkID).registerTextures("DraviteChunk").setUnlocalizedName("Chunk1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteDust = new ItemDivineRPG(y.DraviteDustID).registerTextures("DraviteDust").setUnlocalizedName("Dust1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteGem = new ItemDivineRPG(y.DraviteGemID).registerTextures("DraviteGem").setUnlocalizedName("Gem1").setCreativeTab(DivineRPG.Raw);
	public static final Item DraviteBlade = new ToolSword(y.DraviteBladeID, dravite).registerItemTexture("DraviteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("DraviteBlade");
	public static final Item DravitePhaser = new ItemPhaser(y.DravitePhaserID, 0, 1, 2).registerTextures("DravitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DravitePhaser");
	public static final Item DraviteBlitz = new ItemBlitz(y.DraviteBlitzID).registerTextures("DraviteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteBlitz");
	public static final Item DraviteBow = new ItemBowCore(y.DraviteBowID).registerTextures("DraviteBow0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteBow");
	public static final Item DraviteHelmet = new ItemBaseArmor(y.DraviteHelmetID, draviteArmor, 0, HEAD, true).setDescriptors(draviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("DraviteHelmet");
	public static final Item DraviteChest = new ItemBaseArmor(y.DraviteChestID, draviteArmor, 1, BODY, true).setDescriptors(draviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("DraviteChest");
	public static final Item Dravitelegs = new ItemBaseArmor(y.DravitelegsID, draviteArmor, 2, LEGS, true).setDescriptors(draviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("Dravitelegs");
	public static final Item DraviteBoots = new ItemBaseArmor(y.DraviteBootsID, draviteArmor, 3, BOOTS, true).setDescriptors(draviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("DraviteBoots");
	public static final Item DraviteSlicer = new ItemSlicer(y.DraviteSlicerID).registerTextures("DraviteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteSlicer");
	public static final Item draviteSoul = new ItemDivineRPG(y.DraviteSoulID).registerTextures("DraviteSoul").setUnlocalizedName("DraviteSoul").setCreativeTab(DivineRPG.Raw);
	public static final Item DravitePickaxe = new ToolPickaxe(y.DravitePickaxeID, draviteTools).registerItemTexture("DravitePickaxe").setUnlocalizedName("DravitePick").setCreativeTab(DivineRPG.Tools);
	public static final Item DraviteShovel = new ToolShovel(y.DraviteShovelID, draviteTools).registerItemTexture("DraviteShovel").setUnlocalizedName("DraviteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item DraviteAxe = new ToolAxe(y.DraviteAxeID, draviteTools).registerItemTexture("DraviteAxe").setUnlocalizedName("DraviteAxe").setCreativeTab(DivineRPG.Tools);

	//Azurite
	public static final Item azuriteFragment = new ItemDivineRPG(y.AzuriteFragmentsID).registerTextures("AzuriteFragments").setUnlocalizedName("Frag2").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteSoul = new ItemDivineRPG(y.AzuriteSoulID).registerTextures("AzuriteSoul").setUnlocalizedName("Soul2").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteChunk = new ItemDivineRPG(y.AzuriteChunkID).registerTextures("AzuriteChunk").setUnlocalizedName("Chunk3").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteDust = new ItemDivineRPG(y.AzuriteDustID).registerTextures("AzuriteDust").setUnlocalizedName("Dust4").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteGem = new ItemDivineRPG(y.AzuriteGemID).registerTextures("AzuriteGem").setUnlocalizedName("Gem5").setCreativeTab(DivineRPG.Raw);
	public static final Item AzuriteBlade = new ToolSword(y.AzuriteBladeID, azurite).registerItemTexture("AzuriteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("AzuriteBlade");
	public static final Item AzuritePhaser = new ItemPhaser(y.AzuritePhaserID, 0, 1, 2).registerTextures("AzuritePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuritePhaser");
	public static final Item AzuriteBlitz = new ItemBlitz(y.AzuriteBlitzID).registerTextures("AzuriteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteBlitz");
	public static final Item AzuriteBow = new ItemBowCore(y.AzuriteBowID).registerTextures("AzuriteBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteBow");
	public static final Item AzuriteHelmet = new ItemBaseArmor(y.AzuriteHelmetID, azuriteArmor, 0, HEAD, true).setDescriptors(azuriteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AzuriteHelmet");
	public static final Item AzuriteBoots = new ItemBaseArmor(y.AzuriteBootsID, azuriteArmor, 3, BOOTS, true).setDescriptors(azuriteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AzuriteBoots");
	public static final Item Azuritelegs = new ItemBaseArmor(y.AzuritelegsID, azuriteArmor, 2, LEGS, true).setDescriptors(azuriteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("Azuritelegs");
	public static final Item AzuriteChest = new ItemBaseArmor(y.AzuriteChestID, azuriteArmor, 1, BODY, true).setDescriptors(azuriteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AzuriteBody");
	public static final Item AzuriteSlicer = new ItemSlicer(y.AzuriteSlicerID).registerTextures("AzuriteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteSlicer");
	public static final Item AzuriteArrow = new ItemDivineRPG(y.AzuriteArrowID).registerTextures("AzuriteArrow").setCreativeTab(DivineRPG.Misc).setUnlocalizedName("AzuriteArrow");
	public static final Item AzuritePickaxe = new ToolPickaxe(y.AzuritePickaxeID, azuriteTools).registerItemTexture("AzuritePickaxe").setUnlocalizedName("AzuritePick").setCreativeTab(DivineRPG.Tools);
	public static final Item AzuriteShovel = new ToolShovel(y.AzuriteShovelID, azuriteTools).registerItemTexture("AzuriteShovel").setUnlocalizedName("AzuriteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item AzuriteAxe = new ToolAxe(y.AzuriteAxeID, azuriteTools).registerItemTexture("AzuriteAxe").setUnlocalizedName("AzuriteAxe").setCreativeTab(DivineRPG.Tools);
	
	//Augite
	public static final Item augiteFragment = new ItemDivineRPG(y.AugiteFragmentsID).registerTextures("AugiteFragments").setUnlocalizedName("Frag5").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteSoul = new ItemDivineRPG(y.AugiteSoulID).registerTextures("AugiteSoul").setUnlocalizedName("Soul5").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteChunk = new ItemDivineRPG(y.AugiteChunkID).registerTextures("AugiteChunk").setUnlocalizedName("Chunk6").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteDust = new ItemDivineRPG(y.AugiteDustID).registerTextures("AugiteDust").setUnlocalizedName("Dust7").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteGem = new ItemDivineRPG(y.AugiteGemID).registerTextures("AugiteGem").setUnlocalizedName("Gem8").setCreativeTab(DivineRPG.Raw);
	public static final Item AugiteBlade = new ToolSword(y.AugiteBladeID, augite).registerItemTexture("AugiteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("AugiteBlade");
	public static final Item AugitePhaser = new ItemPhaser(y.AugitePhaserID, 0, 1, 2).registerTextures("AugitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugitePhaser");
	public static final Item AugiteBlitz = new ItemBlitz(y.AugiteBlitzID).registerTextures("AugiteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteBlitz");
	public static final Item AugiteBow = new ItemBowCore(y.AugiteBowID).registerTextures("AugiteBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteBow");
	public static final Item AugiteHelmet = new ItemBaseArmor(y.AugiteHelmetID, augiteArmor, 0, HEAD, true).setDescriptors(augiteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AugiteHelmet");
	public static final Item AugiteBoots = new ItemBaseArmor(y.AugiteBootsID, augiteArmor, 3, BOOTS, true).setDescriptors(augiteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AugiteBoots");
	public static final Item Augitelegs = new ItemBaseArmor(y.AugitelegsID, augiteArmor, 2, LEGS, true).setDescriptors(augiteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AugiteLegs");
	public static final Item AugiteChest = new ItemBaseArmor(y.AugiteChestID, augiteArmor, 1, BODY, true).setDescriptors(augiteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("AugiteBody");
	public static final Item AugiteSlicer = new ItemSlicer(y.AugiteSlicerID).registerTextures("AugiteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteSlicer");
	public static final Item AugitePickaxe = new ToolPickaxe(y.AugitePickaxeID, augiteTools).registerItemTexture("AugitePickaxe").setUnlocalizedName("AugitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item AugiteShovel = new ToolShovel(y.AugiteShovelID, augiteTools).registerItemTexture("AugiteShovel").setUnlocalizedName("AugiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item AugiteAxe = new ToolAxe(y.AugiteAxeID, augiteTools).registerItemTexture("AugiteAxe").setUnlocalizedName("AugiteAxe").setCreativeTab(DivineRPG.Tools);
	
	//Uvite
	public static final Item uviteFragment = new ItemDivineRPG(y.UviteFragmentsID).registerTextures("UviteFragments").setUnlocalizedName("Frag3").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteSoul = new ItemDivineRPG(y.UviteSoulID).registerTextures("UviteSoul").setUnlocalizedName("Soul3").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteChunk = new ItemDivineRPG(y.UviteChunkID).registerTextures("UviteChunk").setUnlocalizedName("Chunk4").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteDust = new ItemDivineRPG(y.UviteDustID).registerTextures("UviteDust").setUnlocalizedName("Dust5").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteGem = new ItemDivineRPG(y.UviteGemID).registerTextures("UviteGem").setUnlocalizedName("Gem6").setCreativeTab(DivineRPG.Raw);
	public static final Item UviteBlade = new ToolSword(y.UviteBladeID, uvite).registerItemTexture("UviteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("UviteBlade");
	public static final Item UvitePhaser = new ItemPhaser(y.UvitePhaserID, 0, 1, 2).registerTextures("UvitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UvitePhaser");
	public static final Item UviteBlitz = new ItemBlitz(y.UviteBlitzID).registerTextures("UviteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteBlitz");
	public static final Item UviteBow = new ItemBowCore(y.UviteBowID).registerTextures("UviteBow0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteBow");
	public static final Item UviteHelmet = new ItemBaseArmor(y.UviteHelmetID, UviteArmor, 0, HEAD, true).setDescriptors(uviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("UviteHelmet");
	public static final Item UviteBoots = new ItemBaseArmor(y.UviteBootsID, UviteArmor, 3, BOOTS, true).setDescriptors(uviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("UviteBoots");
	public static final Item Uvitelegs = new ItemBaseArmor(y.UvitelegsID, UviteArmor, 2, LEGS, true).setDescriptors(uviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("UviteLegs");
	public static final Item UviteChest = new ItemBaseArmor(y.UviteChestID, UviteArmor, 1, BODY, true).setDescriptors(uviteDesc).setCreativeTab(DivineRPG.Armor).setUnlocalizedName("UviteBody");
	public static final Item UviteSlicer = new ItemSlicer(y.UviteSlicerID).registerTextures("UviteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteSlicer");
	public static final Item UvitePickaxe = new ToolPickaxe(y.UvitePickaxeID, uviteTools).registerItemTexture("UvitePickaxe").setUnlocalizedName("UvitePick").setCreativeTab(DivineRPG.Tools);
	public static final Item UviteShovel = new ToolShovel(y.UviteShovelID, uviteTools).registerItemTexture("UviteShovel").setUnlocalizedName("UviteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item UviteAxe = new ToolAxe(y.UviteAxeID, uviteTools).registerItemTexture("UviteAxe").setUnlocalizedName("UviteAxe").setCreativeTab(DivineRPG.Tools);
	
	public static final Item cookedEmpoweredMeat = new ItemDivineRPGFood(y.cookedEmpoweredMeatID, 10, 1.5F, true).registerTextures("EmpoweredMeatCooked").setUnlocalizedName("CookedEmpoweredMeat").setCreativeTab(DivineRPG.Misc);
	public static final Item rawEmpoweredMeat = new ItemDivineRPGFood(y.empoweredMeatID, 4, 0.2F, true).registerTextures("EmpoweredMeatRaw").setUnlocalizedName("RawEmpoweredMeat").setCreativeTab(DivineRPG.Misc);
	public static final Item TwilightBow = new ItemBowCore(y.TwilightBowID).registerTextures("TwilightBow_0").setUnlocalizedName("TwilightBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item TwilightApple = new ItemDivineRPGFood(y.TwilightAppleID, 4, 0.6F, false).registerTextures("TwilightApple").setUnlocalizedName("TA").setCreativeTab(DivineRPG.Misc);
	public static final Item FuryArrow = new ItemDivineRPG(y.FuryArrowID).registerTextures("FuryArrow").setCreativeTab(DivineRPG.Misc).setUnlocalizedName("FuryArrow");
	public static final Item draviteSparkles = new ItemDivineRPG(y.draviteSparklesID).registerTextures("DraviteSparkles").setUnlocalizedName("DraviteS").setCreativeTab(DivineRPG.Misc);

	public static void addNames(){
		addItem(DraviteShickaxe, "Dravite Shickaxe");
		addItem(AzuriteShickaxe, "Azurite Shickaxe");
		addItem(UviteShickaxe, "Uvite Shickaxe");
		addItem(MythrilShickaxe, "Mythril Shickaxe");
		addItem(AugiteShickaxe, "Augite Shickaxe");
		addItem(DivineShickaxe, "Divine Shickaxe");

		addItem(DivinePickaxe, "Divine Pickaxe");
		addItem(DivineShovel, "Divine Shovel");
		addItem(DivineAxe, "Divine Axe");
		addItem(DravitePickaxe, "Dravite Pickaxe");
		addItem(DraviteAxe, "Dravite Axe");
		addItem(DraviteShovel, "Dravite Shovel");
		addItem(AzuritePickaxe, "Azurite pickaxe");
		addItem(AzuriteAxe, "Azurite Axe");
		addItem(AzuriteShovel, "Azurite Shovel");
		addItem(UvitePickaxe, "Uvite Pickaxe");
		addItem(UviteAxe, "Uvite Axe");
		addItem(UviteShovel, "Uvite Shovel");
		addItem(MythrilPickaxe, "Mythril Pickaxe");
		addItem(MythrilAxe, "Mythril Axe");
		addItem(MythrilShovel, "Mythril Shovel");
		addItem(AugitePickaxe, "Augite Pickaxe");
		addItem(AugiteAxe, "Augite Axe");
		addItem(AugiteShovel, "Augite Shovel");

		addItem(TwilightBow, "Twilight Bow");
		addItem(TwilightApple, "Twilight Apple");
		//addItem(DraviteShards, "Dravite Fragments");
		addItem(divineHelmet, "Divine Helmet");
		addItem(divineBody, "Divine Body");
		addItem(divineLegs, "Divine Legs");
		addItem(divineBoots, "Divine Boots");
		addItem(draviteGem, "Dravite Gem");
		addItem(draviteChunk, "Dravite Chunk");
		addItem(draviteFragment, "Dravite Fragments");
		addItem(draviteDust, "Dravite Dust");
		addItem(DraviteBlade, "Dravite Blade");
		addItem(DravitePhaser, "Dravite Phaser");
		addItem(DraviteBlitz, "Dravite Blitz");
		addItem(DraviteBow, "Dravite Bow");
		addItem(DraviteHelmet, "Dravite Helmet");
		addItem(DraviteBoots, "Dravite Boots");
		addItem(Dravitelegs, "Dravite Legs");
		addItem(DraviteChest, "Dravite Chestplate");
		addItem(DraviteSlicer, "Dravite Slicer");
		addItem(draviteSoul, "Dravite Soul");
		addItem(draviteSparkles, "Dravite Sparkles");

		addItem(azuriteGem, "Azurite Gem");
		addItem(azuriteChunk, "Azurite Chunk");
		addItem(azuriteFragment, "Azurite Fragments");
		addItem(azuriteDust, "Azurite Dust");
		addItem(AzuriteBlade, "Azurite Blade");
		addItem(AzuritePhaser, "Azurite Phaser");
		addItem(AzuriteBlitz, "Azurite Blitz");
		addItem(AzuriteBow, "Azurite Bow");
		addItem(AzuriteHelmet, "Azurite Helmet");
		addItem(AzuriteBoots, "Azurite Boots");
		addItem(Azuritelegs, "Azurite Legs");
		addItem(AzuriteChest, "Azurite Chestplate");
		addItem(AzuriteSlicer, "Azurite Slicer");
		addItem(azuriteSoul, "Azurite Soul");

		addItem(HaliteBlade, "Halite Blade");
		addItem(halitePhaser, "Halite Phaser");
		addItem(HaliteBlitz, "Halite Blitz");
		addItem(haliteBow, "Halite Bow");
		addItem(haliteHelmet, "Halite Helmet");
		addItem(haliteBoots, "Halite Boots");
		addItem(haliteLegs, "Halite Legs");
		addItem(haliteBody, "Halite Chestplate");
		addItem(HaliteSlicer, "Halite Slicer");

		addItem(uviteGem, "Uvite Gem");
		addItem(uviteChunk, "Uvite Chunk");
		addItem(uviteFragment, "Uvite Fragments");
		addItem(uviteDust, "Uvite Dust");
		addItem(UviteBlade, "Uvite Blade");
		addItem(UvitePhaser, "Uvite Phaser");
		addItem(UviteBlitz, "Uvite Blitz");
		addItem(UviteBow, "Uvite Bow");
		addItem(UviteHelmet, "Uvite Helmet");
		addItem(UviteBoots, "Uvite Boots");
		addItem(Uvitelegs, "Uvite Legs");
		addItem(UviteChest, "Uvite Chestplate");
		addItem(UviteSlicer, "Uvite Slicer");
		addItem(uviteSoul, "Uvite Soul");

		addItem(mythrilGem, "Mythril Gem");
		addItem(mythrilChunk, "Mythril Chunk");
		addItem(mythrilFragment, "Mythril Fragments");
		addItem(mythrilDust, "Mythril Dust");
		addItem(MythrilBlade, "Mythril Blade");
		addItem(MythrilPhaser, "Mythril Phaser");
		addItem(MythrilBlitz, "Mythril Blitz");
		addItem(MythrilBow, "Mythril Bow");
		addItem(MythrilHelmet, "Mythril Helmet");
		addItem(MythrilBoots, "Mythril Boots");
		addItem(Mythrillegs, "Mythril Legs");
		addItem(MythrilChest, "Mythril Chestplate");
		addItem(MythrilSlicer, "Mythril Slicer");
		addItem(mythrilSoul, "Mythril Soul");

		addItem(augiteGem, "Augite Gem");
		addItem(augiteChunk, "Augite Chunk");
		addItem(augiteFragment, "Augite Fragments");
		addItem(augiteDust, "Augite Dust");
		addItem(AugiteBlade, "Augite Blade");
		addItem(AugitePhaser, "Augite Phaser");
		addItem(AugiteBlitz, "Augite Blitz");
		addItem(AugiteBow, "Augite Bow");
		addItem(AugiteHelmet, "Augite Helmet");
		addItem(AugiteBoots, "Augite Boots");
		addItem(Augitelegs, "Augite Legs");
		addItem(AugiteChest, "Augite Chestplate");
		addItem(AugiteSlicer, "Augite Slicer");
		addItem(augiteSoul, "Augite Soul");

		addItem(FuryArrow, "Fury Arrow");
		addItem(AzuriteArrow, "Azurite Arrow");
		addItem(rawEmpoweredMeat, "Raw Empowered Meat");
		addItem(cookedEmpoweredMeat, "Cooked Empowered Meat");

	}
}
