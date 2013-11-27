package net.divinerpg.block;

import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBase extends Block {
    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;

    public BlockBase(int blockID, Material material) {
        super(blockID, material);
        setCreativeTab(DivineRPG.Blocks);
    }

    public Block registerTexture(String text) {
        tileSideName = tileTopName = tileBottomName = text;
        setUnlocalizedName(text);
        return this;
    }

    public Block registerTexture(String side, String top, String bottom) {
        tileSideName = side;
        tileTopName = top;
        tileBottomName = bottom;
        setUnlocalizedName(side);
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        tileSide = icon.registerIcon(Reference.MOD_ID +":" + tileSideName);
        tileTop = icon.registerIcon(Reference.MOD_ID +":" + tileTopName);
        tileBottom = icon.registerIcon(Reference.MOD_ID +":" + tileBottomName);
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
