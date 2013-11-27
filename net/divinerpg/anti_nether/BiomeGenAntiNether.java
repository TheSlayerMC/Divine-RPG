package net.divinerpg.anti_nether;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenAntiNether extends BiomeGenBase
{
    public BiomeGenAntiNether(int var1)
    {
        super(var1);
        this.setBiomeName("Anti-Hell");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)Block.ice.blockID;
        this.fillerBlock = (byte)Block.ice.blockID;
    }
}
