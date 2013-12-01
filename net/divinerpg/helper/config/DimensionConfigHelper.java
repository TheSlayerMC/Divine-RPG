package net.divinerpg.helper.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class DimensionConfigHelper {
	
	public static int draviteBiomeID;
	public static int uviteBiomeID;
	public static int azuriteBiomeID;
	public static int mythrilBiomeID;
	public static int augiteBiomeID;
	public static int arcanaBiomeID;
	public static int iceikaBiomeID;
	public static int arksianeBiomeID;
	public static int heliosisBiomeID;
	public static int antiNetherBiomeID;

	public static int DraviteID;
	public static int AzuriteID;
	public static int ArcanaID;
	public static int UviteID;
	public static int IceikaID;
	public static int MythrilID;
	public static int VetheaID;
	public static int AugiteID;
	public static int antiNetherID;

	public static boolean KeepLoadedDravite;
	public static boolean KeepLoadedAzurite;
	public static boolean KeepLoadedArcana;
	public static boolean KeepLoadedUvite;
	public static boolean KeepLoadedIceika;
	public static boolean KeepLoadedMythril;
	public static boolean KeepLoadedVethea;
	public static boolean KeepLoadedAugite;
	public static boolean KeepLoadedAntiNether;

	public static void configInit(FMLPreInitializationEvent event){
		File file = new File(event.getModConfigurationDirectory(), "DivineRPG.cfg");
		Configuration config = new Configuration(file);

		config.load();
		
		KeepLoadedDravite = config.get("Dimensions", "KeepLoaded Dravite", true).getBoolean(true);
		KeepLoadedAzurite = config.get("Dimensions", "KeepLoaded Azurite", true).getBoolean(true);
		KeepLoadedArcana = config.get("Dimensions", "KeepLoaded Arcana", true).getBoolean(true);
		KeepLoadedUvite = config.get("Dimensions", "KeepLoaded Uvite", true).getBoolean(true);
		KeepLoadedIceika = config.get("Dimensions", "KeepLoaded Iceika", true).getBoolean(true);
		KeepLoadedMythril = config.get("Dimensions", "KeepLoaded Mythril", true).getBoolean(true);
		KeepLoadedVethea = config.get("Dimensions", "KeepLoaded Vethea", true).getBoolean(true);
		KeepLoadedAugite = config.get("Dimensions", "KeepLoaded Augite", true).getBoolean(true);
		KeepLoadedAntiNether = config.get("Dimensions", "KeepLoaded Anti Hell", true).getBoolean(true);

		DraviteID = config.get("Dimensions", "Dravite Dimension ID", 2).getInt();
		AzuriteID = config.get("Dimensions", "Azurite Dimension ID", 3).getInt();
		UviteID = config.get("Dimensions", "Uvite Dimension ID", 4).getInt();
		MythrilID = config.get("Dimensions", "Mythril Dimension ID", 5).getInt();
		AugiteID = config.get("Dimensions", "Augite Dimension ID", 6).getInt();
		ArcanaID = config.get("Dimensions", "Arcana Dimension ID", 7).getInt();
		IceikaID = config.get("Dimensions", "Iceika Dimension ID", 8).getInt();
		VetheaID = config.get("Dimensions", "Vethea Dimension ID", 9).getInt();
		antiNetherID = config.get("Dimensions", "Anti Hell Dimension ID", 10).getInt();

		
		draviteBiomeID  = config.get("Dimensions", "Dravite Biome ID", 60).getInt();
		uviteBiomeID  = config.get("Dimensions", "Uvite Biome ID", 61).getInt();
		azuriteBiomeID  = config.get("Dimensions", "Azurite Biome ID", 62).getInt();
		mythrilBiomeID  = config.get("Dimensions", "Mythril Biome ID", 63).getInt();
		augiteBiomeID  = config.get("Dimensions", "Augite Biome ID", 64).getInt();
		arcanaBiomeID  = config.get("Dimensions", "Arcana Biome ID", 65).getInt();
		iceikaBiomeID  = config.get("Dimensions", "Iceika Biome ID", 66).getInt();
		arksianeBiomeID  = config.get("Dimensions", "Arksaine Biome ID", 67).getInt(); 
		heliosisBiomeID  = config.get("Dimensions", "Heliosis Biome ID", 68).getInt();
		antiNetherBiomeID  = config.get("Dimensions", "Anti Hell Biome ID", 69).getInt();

		config.save();
	}
	
}
