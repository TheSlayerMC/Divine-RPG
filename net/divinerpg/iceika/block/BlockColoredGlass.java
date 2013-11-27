package net.divinerpg.iceika.block;

import net.divinerpg.helper.TextureHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredGlass extends BlockGlass {

    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;
    public BlockColoredGlass(int par1) {
        super(par1, Material.glass, true);
        //GameRegistry.registerBlock(this);
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess var1, int var2, int var3, int var4, int var5) {
        return super.shouldSideBeRendered(var1, var2, var3, var4, 1 - var5);
    }

    @Override
    public int getRenderBlockPass() {
        return 1;
    }

    public Block registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
        return this;
    }

    public void registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        tileSide = TextureHelper.getIconFromTextureName(par1IconRegister, tileSideName);
        tileTop = TextureHelper.getIconFromTextureName(par1IconRegister, tileTopName);
        tileBottom = TextureHelper.getIconFromTextureName(par1IconRegister, tileBottomName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return side == 1 ? tileTop : side == 0 ? tileBottom : tileSide;
    }

}
