package net.divinerpg.helper;

import net.divinerpg.anti_nether.BiomeGenAntiNether;
import net.divinerpg.anti_nether.WorldProviderAntiNether;
import net.divinerpg.arcana.gen.BiomeGenArcana;
import net.divinerpg.arcana.gen.WorldProviderArcana;
import net.divinerpg.augite.gen.BiomeGenAugite;
import net.divinerpg.augite.gen.WorldProviderDense;
import net.divinerpg.azurite.gen.BiomeGenAzurite;
import net.divinerpg.azurite.gen.WorldProviderAzurite;
import net.divinerpg.dravite.gen.BiomeGenDraviteHills;
import net.divinerpg.dravite.gen.WorldProviderTwilight;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.divinerpg.iceika.gen.BiomeGenIceikaMountians;
import net.divinerpg.iceika.gen.WorldProviderIceika;
import net.divinerpg.mythril.gen.BiomeGenMythil;
import net.divinerpg.mythril.gen.WorldProviderMythil;
import net.divinerpg.uvite.gen.BiomeGenUvite;
import net.divinerpg.uvite.gen.WorldProviderEnergy;
import net.divinerpg.vethea.gen.BiomeGenArksiane;
import net.divinerpg.vethea.gen.WorldProviderVethea;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry 
{
	public static DimensionConfigHelper x;
	
	public static final BiomeGenBase DraviteHills = new BiomeGenDraviteHills(x.draviteBiomeID); 
    public static final BiomeGenBase Azurite = new BiomeGenAzurite(x.azuriteBiomeID);
    public static final BiomeGenBase Uvite = new BiomeGenUvite(x.uviteBiomeID);
    public static final BiomeGenBase mythilBiome = new BiomeGenMythil(x.mythrilBiomeID);
    public static final BiomeGenBase AugiteBiome = new BiomeGenAugite(x.augiteBiomeID);
    public static final BiomeGenBase arcanaBiome = new BiomeGenArcana(x.arcanaBiomeID);
    public static final BiomeGenBase IceikaMountains = new BiomeGenIceikaMountians(x.iceikaBiomeID); 
    public static final BiomeGenBase AntiNether = new BiomeGenAntiNether(x.antiNetherBiomeID);  
    public static final BiomeGenBase arksianeBiome = new BiomeGenArksiane(x.arksianeBiomeID);

	public static void init(){		 

		DimensionManager.registerProviderType(x.DraviteID, WorldProviderTwilight.class, x.KeepLoadedDravite);
		DimensionManager.registerDimension(x.DraviteID, x.DraviteID);

		DimensionManager.registerProviderType(x.AzuriteID, WorldProviderAzurite.class, x.KeepLoadedAzurite);
		DimensionManager.registerDimension(x.AzuriteID, x.AzuriteID);

		DimensionManager.registerProviderType(x.UviteID, WorldProviderEnergy.class, x.KeepLoadedUvite);
		DimensionManager.registerDimension(x.UviteID, x.UviteID);

		DimensionManager.registerProviderType(x.MythrilID, WorldProviderMythil.class, x.KeepLoadedMythril);
		DimensionManager.registerDimension(x.MythrilID, x.MythrilID);

		DimensionManager.registerProviderType(x.AugiteID, WorldProviderDense.class, x.KeepLoadedAugite);
		DimensionManager.registerDimension(x.AugiteID, x.AugiteID);

		DimensionManager.registerProviderType(x.IceikaID, WorldProviderIceika.class, x.KeepLoadedIceika);
		DimensionManager.registerDimension(x.IceikaID, x.IceikaID);

		DimensionManager.registerProviderType(x.ArcanaID, WorldProviderArcana.class, x.KeepLoadedArcana);
		DimensionManager.registerDimension(x.ArcanaID, x.ArcanaID);

		DimensionManager.registerProviderType(x.antiNetherID, WorldProviderAntiNether.class, x.KeepLoadedAntiNether);
		DimensionManager.registerDimension(x.antiNetherID, x.antiNetherID);
		
		DimensionManager.registerProviderType(x.VetheaID, WorldProviderVethea.class, x.KeepLoadedVethea);
		DimensionManager.registerDimension(x.VetheaID, x.VetheaID); 
	}	
}

