package net.divinerpg.arcana.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class BlockArcaniteGrass extends BlockBase
{
    public BlockArcaniteGrass(int par1)
    {
        super(par1, Material.grass);
        this.registerTexture("ArcaniteGrass_Side", "ArcaniteGrass_Top", "ArcaniteGrass_Bottom");
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ArcanaBlockHelper.arcaniteDirt.blockID;
    }
    /**
     * returns true if there is at least one cropblock nearby (x-1 to x+1, y+1, z-1 to z+1)
     */
    private boolean isCropsNearby(World par1World, int par2, int par3, int par4)
    {
        byte var5 = 0;

        for (int var6 = par2 - var5; var6 <= par2 + var5; ++var6)
        {
            for (int var7 = par4 - var5; var7 <= par4 + var5; ++var7)
            {
                int var8 = par1World.getBlockId(var6, par3 + 1, var7);
                Block plant = blocksList[var8];

                if (plant instanceof IPlantable && canSustainPlant(par1World, par2, par3, par4, ForgeDirection.UP, (IPlantable)plant))
                    return true;
            }
        }

        return false;
    }

    private boolean isWaterNearby(World par1World, int par2, int par3, int par4)
    {
        for (int var5 = par2 - 4; var5 <= par2 + 4; ++var5)
        {
            for (int var6 = par3; var6 <= par3 + 1; ++var6)
            {
                for (int var7 = par4 - 4; var7 <= par4 + 4; ++var7)
                {
                    if (par1World.getBlockId(var5, var6, var7) == OverworldBlockHelper.Tar.blockID)
                    {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
        return true;
    }
}
