package net.divinerpg.block.overworld;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.block.BlockDivineRPGFence;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockLightFenceBlue extends BlockDivineRPGFence
{
    private final boolean powered;
    private final String field_94464_a;

    public BlockLightFenceBlue(int par1, boolean par2, String par4)
    {
        super(par1, par4);
        this.powered = par2;
        this.field_94464_a = Reference.MOD_ID + ":" + par4;

        if (par2)
        {
            this.setLightValue(1.0F);
        }
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    public void onBlockAdded(World par1, int par2, int par3, int par4)
    {
        if (!par1.isRemote)
        {
            if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlueOn.blockID);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1, int par2, int par3, int par4, int par5)
    {
        if (!par1.isRemote)
        {
            if (this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlueOn.blockID);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1, int par2, int par3, int par4, Random par5)
    {
        if (!par1.isRemote && this.powered && !par1.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
            par1.setBlock(par2, par3, par4, OverworldBlockHelper.lightFenceBlue.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2, int par3)
    {
        return OverworldBlockHelper.lightFenceBlue.blockID;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(this.field_94464_a);
    }
}
