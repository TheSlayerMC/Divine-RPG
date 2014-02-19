package net.divinerpg.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenDivineOres implements IWorldGenerator{

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case -1:
			generateNether(world, rand, chunkX * 16, chunkZ * 16);
		case 0:
			generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
		case 1:
			generateEnd(world, rand, chunkX * 16, chunkZ * 16);
		}
	}
	
	private void generateOverworld(World world, Random random, int x, int z) {
		addOreSpawn(OverworldBlockHelper.realmiteOre, world, random, x, z, 16, 16, 5, 4, 5, 25);
		addOreSpawn(OverworldBlockHelper.arlemiteOre, world, random, x, z, 16, 16, 2, 3, 1, 15);
		addOreSpawn(OverworldBlockHelper.arlemiteOre, world, random, x, z, 16, 16, 2, 3, 1, 15);
	}

	private void generateNether(World world, Random random, int x, int z) {
		addNetherOreSpawn(OverworldBlockHelper.netheriteOre, world, random, x, z, 16, 16, 9, 4, 1, 128);
		addNetherOreSpawn(OverworldBlockHelper.bloodGemOre, world, random, x, z, 16, 16, 10, 5, 1, 128);
		
		if (random.nextInt(8) == 0) {
			int var5 = x + random.nextInt(16) + 8;
			int var6 = random.nextInt(128);
			int var7 = z + random.nextInt(16) + 8;

			if (var6 < 63 || random.nextInt(10) == 0) {
				(new WorldGenLakes(OverworldBlockHelper.Tar.blockID)).generate(world, random, var5, var6, var7);
			}
		}
	}
	
	private void generateEnd(World world, Random random, int x, int z) { }
	
	/**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     * 
     * @param The Block to spawn
     * @param The World to spawn in
     * @param A Random object for retrieving random positions within the world to spawn the Block
     * @param An int for passing the X-Coordinate for the Generation method
     * @param An int for passing the Z-Coordinate for the Generation method
     * @param An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param An int for the Number of chances available for the vein to spawn per-chunk
     * @param An int for setting the max size of a vein
     * @param An int for the minimum Y-Coordinate height at which this block may spawn
     * @param An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int chancesToSpawn, int maxVeinSize, int minY, int maxY)
    {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
 
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
    
    public void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int chancesToSpawn, int maxVeinSize, int minY, int maxY)
    {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
 
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, maxVeinSize, Block.netherrack.blockID)).generate(world, random, posX, posY, posZ);
        }
    }
    
    public void addEndOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int chancesToSpawn, int maxVeinSize, int minY, int maxY)
    {
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
 
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, maxVeinSize, Block.whiteStone.blockID)).generate(world, random, posX, posY, posZ);
        }
    }
}
