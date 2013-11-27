package net.divinerpg.vethea.gen;

import net.divinerpg.helper.DimensionRegistry;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderVethea extends WorldProvider
{
	public void registerWorldChunkManager() 
	{
		this.worldChunkMgr = new WorldChunkManagerHell(DimensionRegistry.arksianeBiome, 1.0F, 1.0F);
		this.dimensionId = DimensionConfigHelper.VetheaID;
	}

	public float getCloudHeight()
	{
		return 256.0F;
	}

	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderVethea(this.worldObj, this.worldObj.getSeed(), true);
	}

	public boolean isSurfaceWorld()
	{
		return false;
	}

	public boolean canCoordinateBeSpawn(int var1, int var2)
	{
		return false;
	}

	public float calculateCelestialAngle(long var1, float var3)
	{
		return 0.3F;
	}

	public boolean canRespawnHere()
	{
		return false;
	}

	public String getSaveFolder()
	{
		return "Vethea";
	}

	public String getWelcomeMessage()
	{
		return "Entering Vethea";
	}

	public String getDepartMessage()
	{
		return "Leaving Vethea";
	}

	public double getMovementFactor()
	{
		return 1.0D;
	}

	public String getDimensionName()
	{
		return "Vethea";
	}
}