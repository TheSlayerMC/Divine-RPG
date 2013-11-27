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
		System.out.print("[DIVINE RPG] Registering Entitys!");
	}

	public static void addItems() {
		OverworldItemHelper.addNames();
		ArcanaItemHelper.addNames();
		IceikaItemHelper.addNames();
		TwilightItemHelper.addNames();
		VetheaItemHelper.addNames();
		System.out.print("[DIVINE RPG] Registering Items!");
	}

	public static void addBlocks() {
		OverworldBlockHelper.addNames();
		ArcanaBlockHelper.addNames();
		IceikaBlockHelper.addNames();
		TwilightBlockHelper.addNames();
		VetheaBlockHelper.addNames();
		System.out.print("[DIVINE RPG] Registering Blocks!");
	}

	public static void addEventBus() {
		MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
		MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());
		System.out.print("[DIVINE RPG] Registering Even Bus!");
	}

	public static void addMisc() {
		harvestLevelHelper.init();
		NetworkRegistry.instance().registerGuiHandler(DivineRPG.instance, new GuiHandler());
		System.out.print("[DIVINE RPG] Registering Misc Things!");
	}

	public static void addWorldGen() {
		WorldGenHelper.init();
		DimensionRegistry.init();
		System.out.print("[DIVINE RPG] Registering World Generation!");
	}

	public static void addRecipes() {
		RecipeHelper.init();
		System.out.print("[DIVINE RPG] Registering Recipes!");
	}

	public static void addTileEntitys() {
		TileEntityRegistry.init();
		System.out.print("[DIVINE RPG] Registering TileEntitys!");
	}

}
