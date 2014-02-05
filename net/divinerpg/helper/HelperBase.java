package net.divinerpg.helper;

import net.divinerpg.helper.config.ConfigHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class HelperBase {

	public static ConfigHelper x, y;
	
	public static String picPrefix = Reference.MOD_ID + ":" + "textures/images/";
	
	public static String[] screenShots = {picPrefix + "dravite.png", picPrefix + "azurite.png"};
	public static String logo = picPrefix + "logo.png";
	
	public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;
	public static int itemID = 4000, blockID = 700, vetheaBlockID = 3000, vetheaItemID = 6666;
	public static int genBlockID = 180;
	
    public static void addBlock(Block block, String Name){
    	GameRegistry.registerBlock(block);
    	LanguageRegistry.addName(block, Name);
    }
    
    public static void addItem(Item item, String Name){
    	GameRegistry.registerItem(item, Name);
    	LanguageRegistry.addName(item, Name);
    }
    
    public void addTabName(String Name){
		LanguageRegistry.instance().addStringLocalization("itemGroup." + Name, "DivineRPG: " + Name);
	}

	public static String[] angelicDesc = {"12.5% Damage reduction", "Full Set: Allows flight", "Full Set: No fall damage"};
	public static String[] realmiteDesc = {"8.25% Damage reduction"};
	public static String[] eliteRealmiteDesc = {"12.5% Damage reduction", "Full Set: No fall damage"};
	public static String[] arlemiteDesc = {"12.5% Damage reduction", "Full Set: 80% Ranged damage protection"};
	public static String[] krakenDesc = {"7.5% Damage reduction", "Full Set: Breathe underwater"};
	public static String[] rupeeDesc = {"13.75% Damage reduction", "Full Set: 80% Melee damage protection"};
	public static String[] aquaticDesc = {"13.75% Damage reduction", "Full Set: Breathe underwater", "Full Set: Swim faster"};
	public static String[] shadowDesc = {"15% Damage reduction", "Full Set: Move faster"};
	public static String[] santaDesc = {"Massive buff in Iceika", "Iceika: Speeds up player", "Iceika: Adds 6x melee damage", "Iceika: Refills hunger", "Iceika: 80% Damage reduction"};
	public static String[] netheriteDesc = {"1.25% Damage reduction", "Fire protection"};
	public static String[] infernoDesc = {"15% Damage reduction", "Fire protection", "Lava protection"};
	public static String[] bedrockDesc = {"18.25% Damage reduction", "Explosion protection", "Fire protection", "Lava protection"};
	public static String[] divineDesc = {"18.75% Damage reduction", "6x Melee damage", "2x Jump height", "No fall damage"};
	public static String[] donatorDesc = {"Unbreakable"};
	public static String[] enderDesc = {"16.25% Damage reduction", "Explosion protection"};
	public static String[] draviteDesc = {"15% Damage reduction", "3+ Twilight ore drops"};
	public static String[] azuriteDesc = {"16.25% Damage reduction", "Fast heath regen under water"};
	public static String[] uviteDesc = {"18% Damage reduction", "Block damage protection"};
	public static String[] mythrilDesc = {"18.75% Damage reduction", "5x Jump height", "No fall damage"};
	public static String[] augiteDesc = {"20% Damage reduction", "Night vision"};
	public static String[] haliteDesc = {"20.75% Damage reduction", "24+ Melee damage"};
	public static String[] jackDesc = {"4x Scythe damage"};
	public static String[] skeletonDesc = {"Replenishes hunger"};
	public static String[] witherDesc = {"Wither protection"};
	public static String[] vemosDesc = {"11% Damage reduction", "Health regen"};
	public static String[] kormaDesc = {"11% Damage reduction", "Arcana regen"};
	
	public static EnumToolMaterial Rupee = EnumHelper.addToolMaterial("plasma", 6, 2500, 16.0F, 1, 0);
	public static EnumToolMaterial Arlemite = EnumHelper.addToolMaterial("Crystal", 3, 3000, 13.0F, 1, 10);
	public static EnumToolMaterial BlazingCrystalleSword = EnumHelper.addToolMaterial("crystallsword", 1, -1, 1.5F, 9, 10);
	public static EnumToolMaterial AquaSword = EnumHelper.addToolMaterial("aquasword", 1, 10000, 1.5F, 18, 10);
	public static EnumToolMaterial Aqutic = EnumHelper.addToolMaterial("Aquatic", 3, 7000, 1.5F, 15, 10);
	public static EnumToolMaterial Realmite = EnumHelper.addToolMaterial("REALMITE", 3, 4000, 12.0F, 1, 10);
	public static EnumToolMaterial Inferno = EnumHelper.addToolMaterial("infernosword", 0, -1, 0, 9, 22);
	public static EnumToolMaterial RupeeShick = EnumHelper.addToolMaterial("RupeeShick", 4, -1, 16.0F, 7, 15);
	public static EnumToolMaterial ArlemiteSword = EnumHelper.addToolMaterial("arlemite", 1, 4000, 1.5F, 6, 10);
	public static EnumToolMaterial arlemiteShick = EnumHelper.addToolMaterial("ArlemiteShick", 4, 13000, 15.0F, 7, 15);
	public static EnumToolMaterial divineWood = EnumHelper.addToolMaterial("divineWood", 0, 59, 2.0F, 0, 15);
	public static EnumToolMaterial Massivence = EnumHelper.addToolMaterial("massivence", 0, 520, 2.0F, 5, 15);
	public static EnumToolMaterial BloodgemTool = EnumHelper.addToolMaterial("massivence", 0, 520, 2.0F, 5, 15);
	public static EnumToolMaterial Cyclopse = EnumHelper.addToolMaterial("Cyclopse", 0, 1000, 8.0F, 3.0F, 10);
	public static EnumToolMaterial Bedrock = EnumHelper.addToolMaterial("BEDROCK", 3, -1, 9.0F, 1, 10);
	public static EnumToolMaterial BedrockMaul = EnumHelper.addToolMaterial("bedrockmaul", 1, -1, 1.5F, 19, 10);
	public static EnumToolMaterial Donator = EnumHelper.addToolMaterial("donator", 3, 3000, 150.0F, 1, 10);
	public static EnumToolMaterial EnderSword = EnumHelper.addToolMaterial("enderSword", 0, -1, 0, 23, 16);
	public static EnumToolMaterial SlimeSword = EnumHelper.addToolMaterial("slimesword", 0, 1000, 0, 11, 22);
	public static EnumToolMaterial DivineSword = EnumHelper.addToolMaterial("divinesword", 0, -1, 0, 29, 22);
	public static EnumToolMaterial Aquaton = EnumHelper.addToolMaterial("aquaton", 0, 10000, 0, 18, 22);
	public static EnumToolMaterial DeathBringer = EnumHelper.addToolMaterial("deathbringer", 0, 6000, 0, 13, 22);
	public static EnumToolMaterial OceanKnife = EnumHelper.addToolMaterial("aquaticknife", 0, 2000, 0, 14, 22);
	public static EnumToolMaterial MoltenSword = EnumHelper.addToolMaterial("moltensword", 0, 5000, 0, 10, 22);
	public static EnumToolMaterial BedrockSword = EnumHelper.addToolMaterial("bedrocksword", 0, 14000, 0, 13, 22);
	public static EnumToolMaterial FrostSword = EnumHelper.addToolMaterial("frostsword", 0, 5000, 0, 10, 22);
	public static EnumToolMaterial SandSlash = EnumHelper.addToolMaterial("sandslash", 0, 200, 0, 32, 22);
	public static EnumToolMaterial arcanaSword = EnumHelper.addToolMaterial("Arcana", 1, -1, 1, 1, 22);

	
	public static EnumArmorMaterial angelicArmor = EnumHelper.addArmorMaterial("Angelic", -1, new int[] { 3, 4, 3, 2 }, 10);
	public static EnumArmorMaterial realmiteArmor = EnumHelper.addArmorMaterial("Realmite", -1, new int[] { 2, 3, 2, 1 }, 10);
	public static EnumArmorMaterial arlemiteArmor = EnumHelper.addArmorMaterial("arlemite", -1, new int[] {3, 4, 4, 2}, 22);
	public static EnumArmorMaterial rupeeArmor = EnumHelper.addArmorMaterial("RupeeArmor", -1, new int[] { 3, 4, 4, 2 }, 10);
	public static EnumArmorMaterial shadow = EnumHelper.addArmorMaterial("Shadow", -1, new int[] { 3, 5, 4, 3 }, 10);
	public static EnumArmorMaterial aquatic = EnumHelper.addArmorMaterial("Aquastrive", -1, new int[] { 3, 4, 4, 3 }, 10);
	public static EnumArmorMaterial angelic = EnumHelper.addArmorMaterial("Angelic", -1, new int[] { 3, 4, 4, 2 }, 22);
	public static EnumArmorMaterial eliteRealmite = EnumHelper.addArmorMaterial("Elite Realmite", -1, new int[] { 3, 4, 4, 2 }, 10);
	public static EnumArmorMaterial diamond = EnumHelper.addArmorMaterial("Diamond", 33, new int[]{ 2, 3, 3, 2 }, 10);
	public static EnumArmorMaterial iron = EnumHelper.addArmorMaterial("Iron", 15, new int[]{ 2, 2, 2, 1 }, 9);
	public static EnumArmorMaterial grim = EnumHelper.addArmorMaterial("grim", -1, new int[] { 0, 0, 0, 0 }, 22);
	public static EnumArmorMaterial jack = EnumHelper.addArmorMaterial("jack", -1, new int[] { 0, 0, 0, 0 }, 22);
	public static EnumArmorMaterial ender = EnumHelper.addArmorMaterial("Ender", -1, new int[] { 4, 5, 4, 3 }, 10);
	public static EnumArmorMaterial energyRealmiteArmor = EnumHelper.addArmorMaterial("Energy", -1, new int[] { 3, 4, 3, 2 }, 10);
	public static EnumArmorMaterial costumes = EnumHelper.addArmorMaterial("Costumes", -1, new int[] { 0, 0, 0, 0 }, 0);
	public static EnumArmorMaterial kraken = EnumHelper.addArmorMaterial("Kraken", -1, new int[] { 2, 3, 2, 1 }, 10);
	public static EnumArmorMaterial netherite = EnumHelper.addArmorMaterial("Neterite", -1, new int[] { 3, 4, 4, 2 }, 10);
	public static EnumArmorMaterial inferno = EnumHelper.addArmorMaterial("Inferno", -1, new int[] { 3, 5, 4, 3 }, 10);
	public static EnumArmorMaterial bedrockArmor = EnumHelper.addArmorMaterial("Bedrock", -1, new int[] { 4, 5, 5, 4 }, 10);
	public static EnumArmorMaterial santa = EnumHelper.addArmorMaterial("santa", -1, new int[] { 0, 0, 0, 0 }, 22);
	public static EnumArmorMaterial korma = EnumHelper.addArmorMaterial("korma", -1, new int[] { 2, 4, 3, 2 }, 22);

	public static EnumToolMaterial halite = EnumHelper.addToolMaterial("halite", 10, 2000, 0, 86, 22);
	public static EnumToolMaterial mythril = EnumHelper.addToolMaterial("mythril", 100, 6000, 48.0F, 55, 22);
	public static EnumToolMaterial dravite = EnumHelper.addToolMaterial("serenity", 100, 6000, 20.0F, 25, 22);
	public static EnumToolMaterial azurite = EnumHelper.addToolMaterial("azurite", 100, 6000, 28.0F, 35, 22);
	public static EnumToolMaterial uvite = EnumHelper.addToolMaterial("energy", 100, 6000, 40.0F, 45, 22);
	public static EnumToolMaterial augite = EnumHelper.addToolMaterial("dense", 100, 6000, 55.0F, 65, 22);
	public static EnumToolMaterial twilight = EnumHelper.addToolMaterial("twilight", 100, -1, 65.0F, 75, 22);
	public static EnumToolMaterial Divine = EnumHelper.addToolMaterial("Divine", 8, 35000, 20.0F, 85, 10);

	public static EnumToolMaterial mythrilTools = EnumHelper.addToolMaterial("mythril", 100, 6000, 48.0F, 0, 22);
	public static EnumToolMaterial draviteTools = EnumHelper.addToolMaterial("serenity", 100, 6000, 20.0F, 0, 22);
	public static EnumToolMaterial azuriteTools = EnumHelper.addToolMaterial("azurite", 100, 6000, 28.0F, 0, 22);
	public static EnumToolMaterial uviteTools = EnumHelper.addToolMaterial("energy", 100, 6000, 40.0F, 0, 22);
	public static EnumToolMaterial augiteTools = EnumHelper.addToolMaterial("dense", 100, 6000, 55.0F, 0, 22);
	public static EnumToolMaterial DivineTools = EnumHelper.addToolMaterial("Divine", 8, 35000, 20.0F, 0, 10);
	
	public static EnumToolMaterial mythrilShick = EnumHelper.addToolMaterial("mythril", 100, 40000, 48.0F, 0, 22);
	public static EnumToolMaterial draviteShick = EnumHelper.addToolMaterial("serenity", 100, 40000, 20.0F, 0, 22);
	public static EnumToolMaterial azuriteShick = EnumHelper.addToolMaterial("azurite", 100, 40000, 28.0F, 0, 22);
	public static EnumToolMaterial uviteShick = EnumHelper.addToolMaterial("energy", 100, 40000, 40.0F, 0, 22);
	public static EnumToolMaterial augiteShick = EnumHelper.addToolMaterial("dense", 100, 40000, 55.0F, 0, 22);
	public static EnumToolMaterial divineShick = EnumHelper.addToolMaterial("Divine", 8, -1, 20.0F, 0, 10);
	
 	public static EnumArmorMaterial divineArmor = EnumHelper.addArmorMaterial("divine", -1, new int[] { 4, 5, 5, 4 }, 10);
 	public static EnumArmorMaterial UviteArmor = EnumHelper.addArmorMaterial("uvite", -1, new int[] {4, 5, 5, 4 }, 10);
 	public static EnumArmorMaterial draviteArmor = EnumHelper.addArmorMaterial("Serenity", -1, new int[] { 3, 5, 4, 3 }, 10);
 	public static EnumArmorMaterial azuriteArmor = EnumHelper.addArmorMaterial("Azurite", -1, new int[] { 4, 5, 4, 3 }, 10);
 	public static EnumArmorMaterial mythrilArmor = EnumHelper.addArmorMaterial("Mythril", -1, new int[] { 4, 6, 5, 4 }, 10);
 	public static EnumArmorMaterial augiteArmor = EnumHelper.addArmorMaterial("dense", -1, new int[] { 4, 6, 6, 4 }, 10);
 	public static EnumArmorMaterial haliteArmor = EnumHelper.addArmorMaterial("ultima", -1, new int[] { 5, 6, 5, 5 }, 12);

}
