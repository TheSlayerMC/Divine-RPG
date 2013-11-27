package net.divinerpg.augite.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenDenseTree implements IWorldGenerator
{
    @Override
    public void generate(Random var1, int var2, int var3, World var4, IChunkProvider var5, IChunkProvider var6)
    {
        switch (var4.provider.dimensionId)
        {
            case -1:
                this.generateNether(var4, var1, var2 * 16, var3 * 16);

            case 0:
                this.generateSurface(var4, var1, var2 * 16, var3 * 16);

            case 6:
                this.generateDense(var4, var1, var2 * 16, var3 * 16);

            default:
        }
    }

    public void generateDense(World world, Random rand, int chunkX, int chunkZ) {
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
        WorldGenDenseTrees tree = new WorldGenDenseTrees(true);

        if((biome instanceof BiomeGenAugite))// then add ||BiomeGenXYZ if you want more.
        {
            for(int x = 0; x < 6; x++)
            {
                int i = chunkX + rand.nextInt(16);
                int k = chunkZ + rand.nextInt(16);
                int j = world.getHeightValue(i, k);
                tree.generate(world, rand, i, j, k);
            }
        }
    }

    public void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkX, chunkZ);
        WorldGenDenseTrees tree = new WorldGenDenseTrees(true);

        if((biome instanceof BiomeGenAugite))// then add ||BiomeGenXYZ if you want more.
        {
            for(int x = 0; x < 6; x++)
            {
                int i = chunkX + rand.nextInt(16);
                int k = chunkZ + rand.nextInt(16);
                int j = world.getHeightValue(i, k);
                tree.generate(world, rand, i, j, k);
            }
        }
    }

    public void generateNether(World var1, Random var2, int var3, int var4)
    {

    }
}
