package net.divinerpg.helper;

import cpw.mods.fml.common.network.NetworkRegistry;
import net.divinerpg.DivineRPG;
import net.divinerpg.helper.block.*;
import net.divinerpg.helper.handlers.*;
import net.divinerpg.helper.item.*;
import net.minecraftforge.common.MinecraftForge;

public class Registry {

	public static void init() {
		addMobs();
		addItems();
		addBlocks();
		addEventBus();
		addMisc();
		addWorldGen();
		addRecipes();
	}
	
	public static void addMobs() {
		IceikaMobRegistry.init();
		TwilightMobRegistry.init();
		OverworldMobRegistry.init();
		VetheaMobRegistry.init();
		ArcanaMobRegistry.init();
		System.out.println("[DIVINE RPG] Registering Entitys!");
	}

	public static void addItems() {
		OverworldItemHelper.addNames();
		ArcanaItemHelper.addNames();
		IceikaItemHelper.addNames();
		TwilightItemHelper.addNames();
		VetheaItemHelper.addNames();
		System.out.println("[DIVINE RPG] Registering Items!");
	}

	public static void addBlocks() {
		OverworldBlockHelper.addNames();
		ArcanaBlockHelper.addNames();
		IceikaBlockHelper.addNames();
		TwilightBlockHelper.addNames();
		VetheaBlockHelper.addNames();
		System.out.println("[DIVINE RPG] Registering Blocks!");
	}

	public static void addEventBus() {
		MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
		MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());
		System.out.println("[DIVINE RPG] Registering Event Bus!");
	}

	public static void addMisc() {
		harvestLevelHelper.init();
		System.out.println("[DIVINE RPG] Registering Block Breakable Levels!");
	}

	public static void addWorldGen() {
		WorldGenHelper.init();
		DimensionRegistry.init();
		System.out.println("[DIVINE RPG] Registering World Generation!");
	}

	public static void addRecipes() {
		RecipeHelper.init();
		System.out.println("[DIVINE RPG] Registering Recipes!");
	}

	public static void addTileEntitys() {
		TileEntityRegistry.init();
		System.out.println("[DIVINE RPG] Registering TileEntitys!");
	}

}
