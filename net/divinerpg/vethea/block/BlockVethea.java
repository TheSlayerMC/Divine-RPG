package net.divinerpg.vethea.block;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;

public class BlockVethea extends BlockBase
{
    public BlockVethea(int par1, Material par3)
    {
        super(par1, par3);
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

}
