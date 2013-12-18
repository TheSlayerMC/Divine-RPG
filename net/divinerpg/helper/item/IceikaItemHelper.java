package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.config.ConfigHelper;
import net.divinerpg.item.ItemBaseArmor;
import net.divinerpg.item.ItemMassivence;
import net.divinerpg.item.iceika.ItemEggNog;
import net.divinerpg.item.iceika.ItemEnderice;
import net.divinerpg.item.iceika.ItemFractiteCannon;
import net.divinerpg.item.iceika.ItemFrostClawCannon;
import net.divinerpg.item.iceika.ItemFrostkingSword;
import net.divinerpg.item.iceika.ItemFrozenMaul;
import net.divinerpg.item.iceika.ItemGlacierSword;
import net.divinerpg.item.iceika.ItemIceBow;
import net.divinerpg.item.iceika.ItemIceicleBane;
import net.divinerpg.item.iceika.ItemIceikaDoor;
import net.divinerpg.item.iceika.ItemIceineSword;
import net.divinerpg.item.iceika.ItemSnowSlash;
import net.divinerpg.item.iceika.ItemSnowStormBow;
import net.divinerpg.item.iceika.ItemSnowflakeShuriken;
import net.divinerpg.item.iceika.ItemSoundOfCarols;
import net.divinerpg.item.overworld.ItemSerenadeOfIce;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IceikaItemHelper extends HelperBase  {
	
	public static final Item snowFlake = new ItemDivineRPG(y.SnowflakeID).registerTextures("SnowFlake").setUnlocalizedName("SF").setCreativeTab(DivineRPG.Raw);
	public static final Item icicleBow = new ItemIceBow(y.IcicleBowID).setUnlocalizedName("IcicleBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item icicleBane = new ItemIceicleBane(y.IcicleBaneID).registerTextures("IcicleBane").setUnlocalizedName("icicleBane").setCreativeTab(DivineRPG.Swords);
	public static final Item soundOfCarols = new ItemSoundOfCarols(y.SoundOfCarolsID).registerTextures("SoundOfCarols").setUnlocalizedName("soundofCarols").setCreativeTab(DivineRPG.Projectile);
	public static final Item icineSword = new ItemIceineSword(y.IcineSwordID).registerTextures("IcineSword").setUnlocalizedName("icineSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderice = new ItemEnderice(y.EndericeID).registerTextures("Enderice").setUnlocalizedName("enderice").setCreativeTab(DivineRPG.Swords);
	public static final Item snowSlash = new ItemSnowSlash(y.SnowslashID).registerTextures("Snowslash").setUnlocalizedName("snowSlash").setCreativeTab(DivineRPG.Swords);
	public static final Item serenadeOfIce = new ItemSerenadeOfIce(y.SerenadeOfIceID).registerTextures("SerenadeOfIce").setUnlocalizedName("serenadeofIce").setCreativeTab(DivineRPG.Projectile);
	public static final Item glacierSword = new ItemGlacierSword(y.GlacierSwordID).registerTextures("GlacierSword").setUnlocalizedName("glacierSword").setCreativeTab(DivineRPG.Swords);
	public static final Item frostKingSword = new ItemFrostkingSword(y.FrostkingSwordID).registerTextures("FrostkingSword").setUnlocalizedName("frostKingSword").setCreativeTab(DivineRPG.Swords);
	public static final Item frozenMaul = new ItemFrozenMaul(y.FrozenMaulID).registerTextures("FrozenMaul").setUnlocalizedName("frozenMaul").setCreativeTab(DivineRPG.Swords);

	public static final Item frostClawCannon = new ItemFrostClawCannon(y.FrostclawCannonID).registerTextures("FrostclawCannon").setUnlocalizedName("frostClawCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item fractiteCannon = new ItemFractiteCannon(y.fractiteCannonID).registerTextures("FractiteCannon").setUnlocalizedName("fractiteCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item snowFlakeShuriken = new ItemSnowflakeShuriken(y.SnowflakeShurikenID).registerTextures("SnowFlakeShuriken").setUnlocalizedName("snowFlakeShuriken").setCreativeTab(DivineRPG.Projectile);
	public static final Item snowStormBow = new ItemSnowStormBow(y.SnowstormBowID).setUnlocalizedName("SnowstormBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item pepperMints = new ItemDivineRPGFood(y.PeppermintsID, 1, 0.3F, false).registerTextures("Peppermints").setUnlocalizedName("pepperMints").setCreativeTab(DivineRPG.Misc);
	public static final Item eggNog = new ItemEggNog(y.EggNogID).registerTextures("EggNog").setUnlocalizedName("eggNog").setCreativeTab(DivineRPG.Misc);
	public static final Item chocolateLog = new ItemDivineRPGFood(y.ChocolateLogID, 4, 1.0F, false).registerTextures("ChocolateLog").setUnlocalizedName("chocolateLog").setCreativeTab(DivineRPG.Misc);
	public static final Item snowCones = new ItemDivineRPGFood(y.SnowconesID, 2, 0.3F, false).registerTextures("SnowCones").setUnlocalizedName("snowCones").setCreativeTab(DivineRPG.Misc);
	public static final Item fruitCake = new ItemDivineRPGFood(y.FruitCakeID, 16, 2.0F, false).registerTextures("FruitCake").setUnlocalizedName("fruitCake").setCreativeTab(DivineRPG.Misc);

	public static final Item santaHead = new ItemBaseArmor(y.SantaHeadID, santa, HEAD, 0, true).setDescriptors(santaDesc).setUnlocalizedName("SantaHelmet").setCreativeTab(DivineRPG.Armor);
	public static final Item santaBody = new ItemBaseArmor(y.SantaBodyID, santa, BODY, 1, true).setDescriptors(santaDesc).setUnlocalizedName("SantaBody").setCreativeTab(DivineRPG.Armor);
	public static final Item santaLegs = new ItemBaseArmor(y.SantaLegsID, santa, LEGS, 2, true).setDescriptors(santaDesc).setUnlocalizedName("SantaLegs").setCreativeTab(DivineRPG.Armor);
	public static final Item santaBoots = new ItemBaseArmor(y.SantaBootsID, santa, BOOTS, 3, true).setDescriptors(santaDesc).setUnlocalizedName("SantaBoots").setCreativeTab(DivineRPG.Armor);
 
	public static final Item frossivence = new ItemMassivence(y.FrossivenceID, EnumToolMaterial.WOOD).registerTextures("Frossivence").setUnlocalizedName("frossivence").setCreativeTab(DivineRPG.Swords);
	public static final Item IceDoorItem = new ItemIceikaDoor(y.IceDoorItemID).setCreativeTab(DivineRPG.Blocks);
	
	public static void addNames() {
		addItem(IceDoorItem, "Frosty Door");
		addItem(snowFlake, "Snowflake");
		addItem(icicleBane, "Icicle Bane");
		addItem(soundOfCarols, "Sound of Carols");
		addItem(icineSword, "Icine Sword");
		addItem(frossivence, "Frossivence");
		addItem(enderice, "Enderice");
		addItem(snowSlash, "Snowslash");
		addItem(serenadeOfIce, "Serenade of Ice");
		addItem(glacierSword, "Glacier Sword");
		addItem(frostKingSword, "Frostking Sword");
		addItem(frozenMaul, "Frozen Maul");
		addItem(frostClawCannon, "Frostclaw Cannon");
		addItem(fractiteCannon, "Fractite Cannon");
		addItem(snowFlakeShuriken, "Snowflake Shuriken");
		addItem(icicleBow, "Icicle Bow");
		addItem(snowStormBow, "Snowstorm Bow");
		addItem(pepperMints, "Peppermints");
		addItem(eggNog, "Egg Nog");
		addItem(chocolateLog, "Chocolate Log");
		addItem(snowCones, "Snow Cones");
		addItem(fruitCake, "Fruit Cake");
		addItem(santaHead, "Santa Head");        
		addItem(santaBody, "Santa Body");
		addItem(santaLegs, "Santa Legs");
		addItem(santaBoots, "Santa Boots");
	}
}
