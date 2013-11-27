package net.divinerpg.block;

import java.util.Random;

import net.divinerpg.DivineRPG;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModGlass extends BlockBase
{
    public ModGlass(int par1)
    {
        super(par1, Material.glass);
        setStepSound(soundGlassFootstep);
        setCreativeTab(DivineRPG.Blocks);
        setHardness(0.2F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass(){
        return 1;
    }

    @Override
    public boolean isOpaqueCube(){
        return false;
    }

    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }

    @Override
    protected boolean canSilkHarvest(){
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5){
        int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return i1 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}