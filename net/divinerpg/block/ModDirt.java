package net.divinerpg.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.IPlantable;

public class ModDirt extends BlockBase{

    public ModDirt(int blockID) 
    {
        super(blockID, Material.ground);
    }
    
    private boolean isWaterNearby(World par1World, int par2, int par3, int par4)
    {
        for (int var5 = par2 - 4; var5 <= par2 + 4; ++var5)
        {
            for (int var6 = par3; var6 <= par3 + 1; ++var6)
            {
                for (int var7 = par4 - 4; var7 <= par4 + 4; ++var7)
                {
                    if (par1World.getBlockId(var5, var6, var7) == Block.waterMoving.blockID)
                    {
                        return true;
                    }
                    
                    if (par1World.getBlockId(var5, var6, var7) == Block.waterStill.blockID)
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
