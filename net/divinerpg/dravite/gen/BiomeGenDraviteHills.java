package net.divinerpg.dravite.gen;

import java.awt.Color;
import java.util.Random;

import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BiomeGenDraviteHills extends BiomeGenBase
{
    protected int treesPerChunk;

    public BiomeGenDraviteHills(int var1)
    {
        super(var1);
        this.setBiomeName("Dravite Hills");
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.topBlock = (byte)TwilightBlockHelper.draviteGrass.blockID;
        this.fillerBlock = (byte)TwilightBlockHelper.draviteDirt.blockID;
        this.waterColorMultiplier = 2368548;
        this.setMinMaxHeight(0.3F, 1.5F);
        this.theBiomeDecorator.treesPerChunk = 6;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float par1)
    {
        return Color.getHSBColor(0.1361F, 0.95F, 1.0F).getRGB();
    }
}
