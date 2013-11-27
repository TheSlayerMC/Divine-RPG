package net.divinerpg.vethea.block;

import net.minecraft.block.material.Material;

public class BlockVetheaMetalCage extends BlockVethea {

    public BlockVetheaMetalCage(int par1, Material par3) {
        super(par1, par3);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }

}
