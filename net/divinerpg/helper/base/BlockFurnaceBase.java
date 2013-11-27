package net.divinerpg.helper.base;

import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFurnaceBase extends BlockDivineRPGContainer{

    protected Icon tileSide;
    protected String tileSideName;
    protected Icon tileTop;
    protected String tileTopName;
    protected Icon tileBottom;
    protected String tileBottomName;
    protected Icon tileFrontOn;
    protected String tileFrontOnName;
    protected Icon tileFrontIdle;
    protected String tileFrontIdleName;

    private boolean isActive;

    public BlockFurnaceBase(int id, Material mat) {
        super(id, mat);

    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return null;
    }

    @Override
    public Block registerTexture(String texture) {
        tileSideName = tileTopName = tileBottomName = tileFrontOnName = tileFrontIdleName = texture;
        return this;
    }


    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.tileTop : (par1 == 0 ? this.tileTop : (par1 != par2 ? this.blockIcon : this.tileFrontIdle));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        tileSide = iconRegister.registerIcon(Reference.MOD_ID + ":" + tileSideName);
        tileTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + tileTopName);
        tileBottom = iconRegister.registerIcon(Reference.MOD_ID + ":" + tileBottomName);
        tileFrontOn = iconRegister.registerIcon(Reference.MOD_ID + ":" + tileFrontOnName);
        tileFrontIdle = iconRegister.registerIcon(Reference.MOD_ID + ":" + tileFrontIdleName);
    }
}
