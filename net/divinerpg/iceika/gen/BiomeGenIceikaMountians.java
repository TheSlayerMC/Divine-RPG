package net.divinerpg.iceika.gen;

import net.divinerpg.helper.block.IceikaBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenIceikaMountians extends BiomeGenBase
{
    public BiomeGenIceikaMountians(int var1)
    {
        super(var1);
        this.setBiomeName("Iceika Mountians");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.maxHeight = 2.0F;
        this.topBlock = ((byte)IceikaBlockHelper.IceGrass.blockID);
        this.fillerBlock = ((byte)IceikaBlockHelper.IceDirt.blockID);
        this.setEnableSnow();
        this.rainfall = 999;
    }

}
