package net.divinerpg.arcana.block;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;

public class BlockDungeonBlock extends BlockBase
{

    public BlockDungeonBlock(int par1)
    {
        super (par1, Material.rock);
        this.setBlockUnbreakable();
        this.setResistance(6000000.0F);
    }
}
