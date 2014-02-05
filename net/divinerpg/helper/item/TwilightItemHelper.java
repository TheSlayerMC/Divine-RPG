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
	
	public static final Item DraviteShickaxe = new ItemBaseTwilightShickaxe(x.getID("DraviteShickaxe"), draviteShick).registerShickaxeTextures("DraviteShickaxe").setUnlocalizedName("DraviteShickaxe");
	public static final Item MythrilShickaxe = new ItemBaseTwilightShickaxe(x.getID("MythrilShickaxe"), mythrilShick).registerShickaxeTextures("MythrilShickaxe").setUnlocalizedName("MythrilShickaxe");
	public static final Item AzuriteShickaxe = new ItemBaseTwilightShickaxe(x.getID("AzuriteShickaxe"), azuriteShick).registerShickaxeTextures("AzuriteShickaxe").setUnlocalizedName("AzuriteShickaxe");
	public static final Item UviteShickaxe = new ItemBaseTwilightShickaxe(x.getID("UviteShickaxe"), uviteShick).registerShickaxeTextures("UviteShickaxe").setUnlocalizedName("UviteShickaxe");
	public static final Item AugiteShickaxe = new ItemBaseTwilightShickaxe(x.getID("AugiteShickaxe"), augiteShick).registerShickaxeTextures("AugiteShickaxe").setUnlocalizedName("AugiteShickaxe");
	public static final Item DivineShickaxe = new ItemBaseTwilightShickaxe(x.getID("DivineShickaxe"), divineShick).registerShickaxeTextures("DivineShickaxe").setUnlocalizedName("DivineShickaxe");

	//Halite
	public static final Item haliteHelmet = new ItemBaseArmor(x.getID("HaliteHelmet"), haliteArmor, 0, HEAD, "Halite");
	public static final Item haliteBody = new ItemBaseArmor(x.getID("HaliteBody"), haliteArmor, 1, BODY, "Halite");
	public static final Item haliteLegs = new ItemBaseArmor(x.getID("HaliteLegs"), haliteArmor, 2, LEGS, "Halite");
	public static final Item haliteBoots = new ItemBaseArmor(x.getID("HaliteBoots"), haliteArmor, 3, BOOTS, "Halite");
	public static final Item haliteBow = new ItemHaliteBow(x.getID("HaliteBow")).setUnlocalizedName("HaliteBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item halitePhaser = new ItemPhaser(x.getID("HalitePhaser"), 0, 1, 2).registerTextures("HalitePhaser").setUnlocalizedName("HalitePhaser").setCreativeTab(DivineRPG.Projectile);
	public static final Item HaliteBlade = new ToolSword(x.getID("HaliteBlade"), halite).registerItemTexture("HaliteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("HaliteBlade");
	public static final Item HaliteSlicer = new ItemSlicer(x.getID("HaliteSlicer")).registerTextures("HaliteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("HaliteSlicer");
	public static final Item HaliteBlitz = new ItemBlitz(x.getID("HaliteBlitz")).registerTextures("HaliteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("HaliteBlitz");

	//Mythril
	public static final Item mythrilFragment = new ItemDivineRPG(x.getID("MythrilFragment")).registerTextures("MythrilFragments").setUnlocalizedName("Frag4").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilSoul = new ItemDivineRPG(x.getID("MythrilSoul")).registerTextures("MythrilSoul").setUnlocalizedName("Soul4").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilChunk = new ItemDivineRPG(x.getID("MythrilChunk")).registerTextures("MythrilChunk").setUnlocalizedName("Chunk5").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilDust = new ItemDivineRPG(x.getID("MythrilDust")).registerTextures("MythrilDust").setUnlocalizedName("Dust6").setCreativeTab(DivineRPG.Raw);
	public static final Item mythrilGem = new ItemDivineRPG(x.getID("MythrilGem")).registerTextures("MythrilGem").setUnlocalizedName("Gem7").setCreativeTab(DivineRPG.Raw);
	public static final Item MythrilBlade = new ToolSword(x.getID("MythrilBlade"), mythril).registerItemTexture("MythrilBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("MythrilBlade");
	public static final Item MythrilPhaser = new ItemPhaser(x.getID("MythrilPhaser"), 0, 1, 2).registerTextures("MythrilPhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilPhaser");
	public static final Item MythrilBlitz = new ItemBlitz(x.getID("MythrilBlitz")).registerTextures("MythrilBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilBlitz");
	public static final Item MythrilBow = new ItemBowCore(x.getID("MythrilBow")).registerTextures("MythrilBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilBow");
	public static final Item MythrilHelmet = new ItemBaseArmor(x.getID("MythrilHelmet"), mythrilArmor, 0, HEAD, "Mythril");
	public static final Item MythrilBoots = new ItemBaseArmor(x.getID("MythrilBoots"), mythrilArmor, 3, BOOTS, "Mythril");
	public static final Item Mythrillegs = new ItemBaseArmor(x.getID("MythrilLegs"), mythrilArmor, 2, LEGS, "Mythril");
	public static final Item MythrilChest = new ItemBaseArmor(x.getID("MythrilBody"), mythrilArmor, 1, BODY, "Mythril");
	public static final Item MythrilSlicer = new ItemSlicer(x.getID("MythrilSlicer")).registerTextures("MythrilSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("MythrilSlicer");
	public static final Item MythrilPickaxe = new ToolPickaxe(x.getID("MythrilPickaxe"), mythrilTools).registerItemTexture("MythrilPickaxe").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilPick");
	public static final Item MythrilShovel = new ToolShovel(x.getID("MythrilShovel"), mythrilTools).registerItemTexture("MythrilShovel").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilShovel");
	public static final Item MythrilAxe = new ToolAxe(x.getID("MythrilAxe"), mythrilTools).registerItemTexture("MythrilAxe").setCreativeTab(DivineRPG.Tools).setUnlocalizedName("MythrilAxe");
	
	//Divine
	public static final Item divineHelmet = new ItemBaseArmor(x.getID("DivineHelmet"), divineArmor, 0, HEAD, "Divine");
	public static final Item divineBody = new ItemBaseArmor(x.getID("DivineBody"), divineArmor, 1, BODY, "Divine");
	public static final Item divineLegs = new ItemBaseArmor(x.getID("DivineLegs"), divineArmor, 2, LEGS, "Divine");
	public static final Item divineBoots = new ItemBaseArmor(x.getID("DivineBoots"), divineArmor, 3, BOOTS, "Divine");
	public static final Item DivinePickaxe = new ToolPickaxe(x.getID("DivinePickaxe"), Divine).registerItemTexture("DivinePickaxe").setUnlocalizedName("DivinePickaxe");
	public static final Item DivineShovel = new ToolShovel(x.getID("DivineShovel"), Divine).registerItemTexture("DivineShovel").setUnlocalizedName("DivineShovel");
	public static final Item DivineAxe = new ToolAxe(x.getID("DivineAxe"), Divine).registerItemTexture("DivineAxe").setUnlocalizedName("DivineAxe");
	
	//Dravite
	public static final Item draviteFragment = new ItemDivineRPG(x.getID("DraviteFragment")).registerTextures("DraviteFragments").setUnlocalizedName("Frag1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteChunk = new ItemDivineRPG(x.getID("DraviteChunk")).registerTextures("DraviteChunk").setUnlocalizedName("Chunk1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteDust = new ItemDivineRPG(x.getID("DraviteDust")).registerTextures("DraviteDust").setUnlocalizedName("Dust1").setCreativeTab(DivineRPG.Raw);
	public static final Item draviteGem = new ItemDivineRPG(x.getID("DraviteGem")).registerTextures("DraviteGem").setUnlocalizedName("Gem1").setCreativeTab(DivineRPG.Raw);
	public static final Item DraviteBlade = new ToolSword(x.getID("DraviteBlade"), dravite).registerItemTexture("DraviteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("DraviteBlade");
	public static final Item DravitePhaser = new ItemPhaser(x.getID("DravitePhaser"), 0, 1, 2).registerTextures("DravitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DravitePhaser");
	public static final Item DraviteBlitz = new ItemBlitz(x.getID("DraviteBlitz")).registerTextures("DraviteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteBlitz");
	public static final Item DraviteBow = new ItemBowCore(x.getID("DraviteBow")).registerTextures("DraviteBow0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteBow");
	public static final Item DraviteHelmet = new ItemBaseArmor(x.getID("DraviteHelmet"), draviteArmor, 0, HEAD, "Dravite");
	public static final Item DraviteChest = new ItemBaseArmor(x.getID("DraviteBody"), draviteArmor, 1, BODY, "Dravite");
	public static final Item Dravitelegs = new ItemBaseArmor(x.getID("DraviteLegs"), draviteArmor, 2, LEGS, "Dravite");
	public static final Item DraviteBoots = new ItemBaseArmor(x.getID("DraviteBoots"), draviteArmor, 3, BOOTS, "Dravite");
	public static final Item DraviteSlicer = new ItemSlicer(x.getID("DraviteSlicer")).registerTextures("DraviteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("DraviteSlicer");
	public static final Item draviteSoul = new ItemDivineRPG(x.getID("DraviteSoul")).registerTextures("DraviteSoul").setUnlocalizedName("DraviteSoul").setCreativeTab(DivineRPG.Raw);
	public static final Item DravitePickaxe = new ToolPickaxe(x.getID("DravitePickaxe"), draviteTools).registerItemTexture("DravitePickaxe").setUnlocalizedName("DravitePick").setCreativeTab(DivineRPG.Tools);
	public static final Item DraviteShovel = new ToolShovel(x.getID("DraviteShovel"), draviteTools).registerItemTexture("DraviteShovel").setUnlocalizedName("DraviteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item DraviteAxe = new ToolAxe(x.getID("DraviteAxe"), draviteTools).registerItemTexture("DraviteAxe").setUnlocalizedName("DraviteAxe").setCreativeTab(DivineRPG.Tools);

	//Azurite
	public static final Item azuriteFragment = new ItemDivineRPG(x.getID("AzuriteFragment")).registerTextures("AzuriteFragments").setUnlocalizedName("Frag2").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteSoul = new ItemDivineRPG(x.getID("AzuriteSoul")).registerTextures("AzuriteSoul").setUnlocalizedName("Soul2").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteChunk = new ItemDivineRPG(x.getID("AzuriteChunk")).registerTextures("AzuriteChunk").setUnlocalizedName("Chunk3").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteDust = new ItemDivineRPG(x.getID("AzuriteDust")).registerTextures("AzuriteDust").setUnlocalizedName("Dust4").setCreativeTab(DivineRPG.Raw);
	public static final Item azuriteGem = new ItemDivineRPG(x.getID("AzuriteGem")).registerTextures("AzuriteGem").setUnlocalizedName("Gem5").setCreativeTab(DivineRPG.Raw);
	public static final Item AzuriteBlade = new ToolSword(x.getID("AzuriteBlade"), azurite).registerItemTexture("AzuriteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("AzuriteBlade");
	public static final Item AzuritePhaser = new ItemPhaser(x.getID("AzuritePhaser"), 0, 1, 2).registerTextures("AzuritePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuritePhaser");
	public static final Item AzuriteBlitz = new ItemBlitz(x.getID("AzuriteBlitz")).registerTextures("AzuriteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteBlitz");
	public static final Item AzuriteBow = new ItemBowCore(x.getID("AzuriteBow")).registerTextures("AzuriteBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteBow");
	public static final Item AzuriteHelmet = new ItemBaseArmor(x.getID("AzuriteHelmet"), azuriteArmor, 0, HEAD, "Azurite");
	public static final Item AzuriteBoots = new ItemBaseArmor(x.getID("AzuriteBoots"), azuriteArmor, 3, BOOTS, "Azurite");
	public static final Item Azuritelegs = new ItemBaseArmor(x.getID("AzuriteLegs"), azuriteArmor, 2, LEGS, "Azurite");
	public static final Item AzuriteChest = new ItemBaseArmor(x.getID("AzuriteBody"), azuriteArmor, 1, BODY, "Azurite");
	public static final Item AzuriteSlicer = new ItemSlicer(x.getID("AzuriteSlicer")).registerTextures("AzuriteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AzuriteSlicer");
	public static final Item AzuriteArrow = new ItemDivineRPG(x.getID("AzuriteArrow")).registerTextures("AzuriteArrow").setCreativeTab(DivineRPG.Misc).setUnlocalizedName("AzuriteArrow");
	public static final Item AzuritePickaxe = new ToolPickaxe(x.getID("AzuritePickaxe"), azuriteTools).registerItemTexture("AzuritePickaxe").setUnlocalizedName("AzuritePick").setCreativeTab(DivineRPG.Tools);
	public static final Item AzuriteShovel = new ToolShovel(x.getID("AzuriteShovel"), azuriteTools).registerItemTexture("AzuriteShovel").setUnlocalizedName("AzuriteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item AzuriteAxe = new ToolAxe(x.getID("AzuriteAxe"), azuriteTools).registerItemTexture("AzuriteAxe").setUnlocalizedName("AzuriteAxe").setCreativeTab(DivineRPG.Tools);
	
	//Augite
	public static final Item augiteFragment = new ItemDivineRPG(x.getID("AugiteFragment")).registerTextures("AugiteFragments").setUnlocalizedName("Frag5").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteSoul = new ItemDivineRPG(x.getID("AugiteSoul")).registerTextures("AugiteSoul").setUnlocalizedName("Soul5").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteChunk = new ItemDivineRPG(x.getID("AugiteChunk")).registerTextures("AugiteChunk").setUnlocalizedName("Chunk6").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteDust = new ItemDivineRPG(x.getID("AugiteDust")).registerTextures("AugiteDust").setUnlocalizedName("Dust7").setCreativeTab(DivineRPG.Raw);
	public static final Item augiteGem = new ItemDivineRPG(x.getID("AugiteGem")).registerTextures("AugiteGem").setUnlocalizedName("Gem8").setCreativeTab(DivineRPG.Raw);
	public static final Item AugiteBlade = new ToolSword(x.getID("AugiteBlade"), augite).registerItemTexture("AugiteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("AugiteBlade");
	public static final Item AugitePhaser = new ItemPhaser(x.getID("AugitePhaser"), 0, 1, 2).registerTextures("AugitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugitePhaser");
	public static final Item AugiteBlitz = new ItemBlitz(x.getID("AugiteBlitz")).registerTextures("AugiteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteBlitz");
	public static final Item AugiteBow = new ItemBowCore(x.getID("AugiteBow")).registerTextures("AugiteBow_0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteBow");
	public static final Item AugiteHelmet = new ItemBaseArmor(x.getID("AugiteHelmet"), HelperBase.augiteArmor, 0, HEAD, "Augite");
	public static final Item AugiteBoots = new ItemBaseArmor(x.getID("AugiteBoots"), HelperBase.augiteArmor, 3, BOOTS, "Augite");
	public static final Item Augitelegs = new ItemBaseArmor(x.getID("AugiteLegs"), HelperBase.augiteArmor, 2, LEGS, "Augite");
	public static final Item AugiteChest = new ItemBaseArmor(x.getID("AugiteBody"), HelperBase.augiteArmor, 1, BODY, "Augite");
	public static final Item AugiteSlicer = new ItemSlicer(x.getID("AugiteSlicer")).registerTextures("AugiteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("AugiteSlicer");
	public static final Item AugitePickaxe = new ToolPickaxe(x.getID("AugitePickaxe"), augiteTools).registerItemTexture("AugitePickaxe").setUnlocalizedName("AugitePickaxe").setCreativeTab(DivineRPG.Tools);
	public static final Item AugiteShovel = new ToolShovel(x.getID("AugiteShovel"), augiteTools).registerItemTexture("AugiteShovel").setUnlocalizedName("AugiteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item AugiteAxe = new ToolAxe(x.getID("AugiteAxe"), augiteTools).registerItemTexture("AugiteAxe").setUnlocalizedName("AugiteAxe").setCreativeTab(DivineRPG.Tools);
	
	//Uvite
	public static final Item uviteFragment = new ItemDivineRPG(x.getID("UviteFragment")).registerTextures("UviteFragments").setUnlocalizedName("Frag3").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteSoul = new ItemDivineRPG(x.getID("UviteSoul")).registerTextures("UviteSoul").setUnlocalizedName("Soul3").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteChunk = new ItemDivineRPG(x.getID("UviteChunk")).registerTextures("UviteChunk").setUnlocalizedName("Chunk4").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteDust = new ItemDivineRPG(x.getID("UviteDust")).registerTextures("UviteDust").setUnlocalizedName("Dust5").setCreativeTab(DivineRPG.Raw);
	public static final Item uviteGem = new ItemDivineRPG(x.getID("UviteGem")).registerTextures("UviteGem").setUnlocalizedName("Gem6").setCreativeTab(DivineRPG.Raw);
	public static final Item UviteBlade = new ToolSword(x.getID("UviteBlade"), uvite).registerItemTexture("UviteBlade").setCreativeTab(DivineRPG.Swords).setUnlocalizedName("UviteBlade");
	public static final Item UvitePhaser = new ItemPhaser(x.getID("UvitePhaser"), 0, 1, 2).registerTextures("UvitePhaser").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UvitePhaser");
	public static final Item UviteBlitz = new ItemBlitz(x.getID("UviteBlitz")).registerTextures("UviteBlitz").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteBlitz");
	public static final Item UviteBow = new ItemBowCore(x.getID("UviteBow")).registerTextures("UviteBow0").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteBow");
	public static final Item UviteHelmet = new ItemBaseArmor(x.getID("UviteHelmet"), UviteArmor, 0, HEAD, "Uvite");
	public static final Item UviteBoots = new ItemBaseArmor(x.getID("UviteBoots"), UviteArmor, 3, BOOTS, "Uvite");
	public static final Item Uvitelegs = new ItemBaseArmor(x.getID("UviteLegs"), UviteArmor, 2, LEGS, "Uvite");
	public static final Item UviteChest = new ItemBaseArmor(x.getID("UviteBody"), UviteArmor, 1, BODY, "Uvite");
	public static final Item UviteSlicer = new ItemSlicer(x.getID("UviteSlicer")).registerTextures("UviteSlicer").setCreativeTab(DivineRPG.Projectile).setUnlocalizedName("UviteSlicer");
	public static final Item UvitePickaxe = new ToolPickaxe(x.getID("UvitePickaxe"), uviteTools).registerItemTexture("UvitePickaxe").setUnlocalizedName("UvitePick").setCreativeTab(DivineRPG.Tools);
	public static final Item UviteShovel = new ToolShovel(x.getID("UviteShovel"), uviteTools).registerItemTexture("UviteShovel").setUnlocalizedName("UviteShovel").setCreativeTab(DivineRPG.Tools);
	public static final Item UviteAxe = new ToolAxe(x.getID("UviteAxe"), uviteTools).registerItemTexture("UviteAxe").setUnlocalizedName("UviteAxe").setCreativeTab(DivineRPG.Tools);
	
	public static final Item cookedEmpoweredMeat = new ItemDivineRPGFood(x.getID("CookedEmpoweredMeat"), 10, 1.5F, true).registerTextures("EmpoweredMeatCooked").setUnlocalizedName("CookedEmpoweredMeat").setCreativeTab(DivineRPG.Misc);
	public static final Item rawEmpoweredMeat = new ItemDivineRPGFood(x.getID("EmpoweredMeat"), 4, 0.2F, true).registerTextures("EmpoweredMeatRaw").setUnlocalizedName("RawEmpoweredMeat").setCreativeTab(DivineRPG.Misc);
	public static final Item TwilightBow = new ItemBowCore(x.getID("TwilightBow")).registerTextures("TwilightBow_0").setUnlocalizedName("TwilightBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item TwilightApple = new ItemDivineRPGFood(x.getID("TwilightApple"), 4, 0.6F, false).registerTextures("TwilightApple").setUnlocalizedName("TA").setCreativeTab(DivineRPG.Misc);
	public static final Item FuryArrow = new ItemDivineRPG(x.getID("FuryArrow")).registerTextures("FuryArrow").setCreativeTab(DivineRPG.Misc).setUnlocalizedName("FuryArrow");
	public static final Item draviteSparkles = new ItemDivineRPG(x.getID("DraviteSparkles")).registerTextures("DraviteSparkles").setUnlocalizedName("DraviteS").setCreativeTab(DivineRPG.Misc);
	public static final Item enrichedMagicMeat = new ItemDivineRPGFood(x.getID("EnrichedMagicMeat"), 10, 1.5F, true).registerTextures("EnrichedMagicMeat").setCreativeTab(DivineRPG.Misc);
	
	public static void addNames(){
		addItem(enrichedMagicMeat, "Enriched Magic Meat");
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
