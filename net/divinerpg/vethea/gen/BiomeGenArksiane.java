package net.divinerpg.vethea.gen;

import net.divinerpg.helper.block.VetheaBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenArksiane extends BiomeGenBase
{
    public BiomeGenArksiane(int var1)
    {
        super(var1);
        this.setBiomeName("Vethea");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)VetheaBlockHelper.dreamGrass.blockID;
        this.fillerBlock = (byte)VetheaBlockHelper.dreamDirt.blockID;
        this.setMinMaxHeight(-1.5F, 0.25F);
    }
}
