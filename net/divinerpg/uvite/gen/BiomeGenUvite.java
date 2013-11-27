package net.divinerpg.uvite.gen;

import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenUvite extends BiomeGenBase
{
    public BiomeGenUvite(int var1)
    {
        super(var1);
        this.setBiomeName("Uvite");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.uviteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.uviteDirt.blockID;
        this.waterColorMultiplier = 2368548;
        this.theBiomeDecorator.treesPerChunk = 6;
    }
}
