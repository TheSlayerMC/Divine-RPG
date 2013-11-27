package net.divinerpg.arcana.block;

import net.divinerpg.helper.base.BlockDivineRPGContainer;
import net.divinerpg.overworld.block.tileentity.TileEntityParasectaAltar;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockParasectaAltar extends BlockDivineRPGContainer
{
    public BlockParasectaAltar(int id)
    {
        super(id, Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityParasectaAltar();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public int getRenderType()
    {
        return -1;
    }
}
