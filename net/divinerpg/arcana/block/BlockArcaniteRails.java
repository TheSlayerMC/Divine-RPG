package net.divinerpg.arcana.block;

import java.util.Random;

import net.divinerpg.helper.TextureHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockArcaniteRails extends BlockRail
{
    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;

    public BlockArcaniteRails(int var1)
    {
        super(var1);
        GameRegistry.registerBlock(this);
    }

    @Override
    public boolean isPowered()
    {
        return true;
    }

    @Override
    public float getRailMaxSpeed(World var1, EntityMinecart var2, int var3, int var4, int var5)
    {
        return 4.99999998E11F;
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

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return blockID;
    }

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {
        return 1;
    }

}
