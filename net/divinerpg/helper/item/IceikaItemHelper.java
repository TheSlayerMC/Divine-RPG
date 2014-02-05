package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.HelperBase;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
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
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class IceikaItemHelper extends HelperBase  {
	
	public static final Item snowFlake = new ItemDivineRPG(x.getID("SnowFlake")).registerTextures("SnowFlake").setUnlocalizedName("SF").setCreativeTab(DivineRPG.Raw);
	public static final Item icicleBow = new ItemIceBow(x.getID("IcicleBow")).setUnlocalizedName("IcicleBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item icicleBane = new ItemIceicleBane(x.getID("IcicleBane")).registerTextures("IcicleBane").setUnlocalizedName("icicleBane").setCreativeTab(DivineRPG.Swords);
	public static final Item soundOfCarols = new ItemSoundOfCarols(x.getID("SoundOfCarols")).registerTextures("SoundOfCarols").setUnlocalizedName("soundofCarols").setCreativeTab(DivineRPG.Projectile);
	public static final Item icineSword = new ItemIceineSword(x.getID("IcineSword")).registerTextures("IcineSword").setUnlocalizedName("icineSword").setCreativeTab(DivineRPG.Swords);
	public static final Item enderice = new ItemEnderice(x.getID("EnderIce")).registerTextures("Enderice").setUnlocalizedName("enderice").setCreativeTab(DivineRPG.Swords);
	public static final Item snowSlash = new ItemSnowSlash(x.getID("SnowSlash")).registerTextures("Snowslash").setUnlocalizedName("snowSlash").setCreativeTab(DivineRPG.Swords);
	public static final Item serenadeOfIce = new ItemSerenadeOfIce(x.getID("SerenadeOfIce")).registerTextures("SerenadeOfIce").setUnlocalizedName("serenadeofIce").setCreativeTab(DivineRPG.Projectile);
	public static final Item glacierSword = new ItemGlacierSword(x.getID("GlacierSword")).registerTextures("GlacierSword").setUnlocalizedName("glacierSword").setCreativeTab(DivineRPG.Swords);
	public static final Item frostKingSword = new ItemFrostkingSword(x.getID("FrostkingSword")).registerTextures("FrostkingSword").setUnlocalizedName("frostKingSword").setCreativeTab(DivineRPG.Swords);
	public static final Item frozenMaul = new ItemFrozenMaul(x.getID("FrozenMaul")).registerTextures("FrozenMaul").setUnlocalizedName("frozenMaul").setCreativeTab(DivineRPG.Swords);

	public static final Item frostClawCannon = new ItemFrostClawCannon(x.getID("FrostClawCannon")).registerTextures("FrostclawCannon").setUnlocalizedName("frostClawCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item fractiteCannon = new ItemFractiteCannon(x.getID("FractiteCannon")).registerTextures("FractiteCannon").setUnlocalizedName("fractiteCannon").setCreativeTab(DivineRPG.Projectile);
	public static final Item snowFlakeShuriken = new ItemSnowflakeShuriken(x.getID("SnowFlakeShuriken")).registerTextures("SnowFlakeShuriken").setUnlocalizedName("snowFlakeShuriken").setCreativeTab(DivineRPG.Projectile);
	public static final Item snowStormBow = new ItemSnowStormBow(x.getID("SnowStormBow")).setUnlocalizedName("SnowstormBow").setCreativeTab(DivineRPG.Projectile);
	public static final Item pepperMints = new ItemDivineRPGFood(x.getID("PepperMints"), 1, 0.3F, false).registerTextures("Peppermints").setUnlocalizedName("pepperMints").setCreativeTab(DivineRPG.Misc);
	public static final Item eggNog = new ItemEggNog(x.getID("EggNog")).registerTextures("EggNog").setUnlocalizedName("eggNog").setCreativeTab(DivineRPG.Misc);
	public static final Item chocolateLog = new ItemDivineRPGFood(x.getID("ChocolateLog"), 4, 1.0F, false).registerTextures("ChocolateLog").setUnlocalizedName("chocolateLog").setCreativeTab(DivineRPG.Misc);
	public static final Item snowCones = new ItemDivineRPGFood(x.getID("SnowCone"), 2, 0.3F, false).registerTextures("SnowCones").setUnlocalizedName("snowCones").setCreativeTab(DivineRPG.Misc);
	public static final Item fruitCake = new ItemDivineRPGFood(x.getID("FruitCake"), 16, 2.0F, false).registerTextures("FruitCake").setUnlocalizedName("fruitCake").setCreativeTab(DivineRPG.Misc);

	public static final Item santaHead = new ItemBaseArmor(x.getID("SantaHelmet"), santa, 0, 0, "Santa");
	public static final Item santaBody = new ItemBaseArmor(x.getID("SantaBody"), santa, 1, 1, "Santa");
	public static final Item santaLegs = new ItemBaseArmor(x.getID("SantaLegs"), santa, 2, 2, "Santa");
	public static final Item santaBoots = new ItemBaseArmor(x.getID("SantaBoots"), santa, 3, 3, "Santa");
 
	public static final Item frossivence = new ItemMassivence(x.getID("Frossivence"), EnumToolMaterial.WOOD).registerTextures("Frossivence").setUnlocalizedName("frossivence").setCreativeTab(DivineRPG.Swords);
	public static final Item IceDoorItem = new ItemIceikaDoor(x.getID("IceDoorItem")).setCreativeTab(DivineRPG.Blocks);
	
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
