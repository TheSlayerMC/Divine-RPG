package net.divinerpg.iceika.gen;

import net.divinerpg.helper.DimensionRegistry;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderIceika extends WorldProvider
{
    /**
     * creates a new world chunk manager for WorldProvider
     */
    @Override
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerIceika(DimensionRegistry.IceikaMountains);
        this.dimensionId = DimensionConfigHelper.IceikaID;
    }

    /**
     * the y level at which clouds are rendered.
     */
    @Override
    public float getCloudHeight()
    {
        return 128.0F;
    }

    @Override
    public boolean canSnowAt(int x, int y, int z)
    {
        return true;
    }

    @Override
    /**
     * Returns a new chunk provider which generates chunks for this world
     */
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderIceika(this.worldObj, this.worldObj.getSeed());
    }

    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }

    /**
     * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
     */
    @Override
    public float calculateCelestialAngle(long var1, float var3)
    {
        return 0.3F;
    }

    /**
     * True if the player can respawn in this dimension (true = overworld, false = nether).
     */
    @Override
    public boolean canRespawnHere()
    {
        return false;
    }

    @Override
    public String getWelcomeMessage()
    {
        return "Entering Iceika";
    }

    @Override
    public String getDepartMessage()
    {
        return "Leaving Iceika";
    }

    @Override
    public String getDimensionName()
    {
        return "Iceika";
    }
}