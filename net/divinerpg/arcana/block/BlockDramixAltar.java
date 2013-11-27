package net.divinerpg.arcana.block;

import net.divinerpg.helper.base.BlockDivineRPGContainer;
import net.divinerpg.overworld.block.tileentity.TileEntityDramixAltar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDramixAltar extends BlockDivineRPGContainer
{
    public BlockDramixAltar(int id)
    {
        super(id, Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World var1)
    {
        return new TileEntityDramixAltar();
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister){}


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
