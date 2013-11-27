package net.divinerpg.helper.base;

import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LeavesBase extends BlockLeavesBase
{

    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;

    /**
     * Used to determine how to display leaves based on the graphics level. May also be used in rendering for
     * transparency, not sure.
     */
    public boolean graphicsLevel;

    public LeavesBase(int par1, boolean graphicsLevel)
    {
        super(par1, Material.leaves, graphicsLevel);
        GameRegistry.registerBlock(this);
    }

    public Block registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
        return this;
    }

    public Block registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        tileSide = icon.registerIcon(Reference.MOD_ID + ":" + tileSideName);
        tileTop = icon.registerIcon(Reference.MOD_ID + ":" + tileTopName);
        tileBottom = icon.registerIcon(Reference.MOD_ID + ":" + tileBottomName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        int i1 = par1IBlockAccess.getBlockId(par2, par3, par4);
        return !this.graphicsLevel && i1 == this.blockID ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }
}
