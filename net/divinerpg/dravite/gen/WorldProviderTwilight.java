package net.divinerpg.dravite.gen;

import net.divinerpg.helper.DimensionRegistry;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTwilight extends WorldProvider
{
    /**
     * creates a new world chunk manager for WorldProvider
     */
    @Override
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(DimensionRegistry.DraviteHills, 0.5F, 0.5F);
        this.dimensionId = DimensionConfigHelper.DraviteID;
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
    /**
     * Returns a new chunk provider which generates chunks for this world
     */
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderTwilight(this.worldObj, this.worldObj.getSeed(), true);
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
        return 0.1F;
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
        return "Entering the Twilight";
    }

    @Override
    public String getDepartMessage()
    {
        return "Leaving the Twilight";
    }

    @Override
    public String getDimensionName()
    {
        return "Dravite";
    }
}
