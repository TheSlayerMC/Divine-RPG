package net.divinerpg.item.tool;


import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HoeBase extends ItemHoe{

    private String iconPath;

    public HoeBase(int par1, EnumToolMaterial par3ENUM){
        super(par1, par3ENUM);
        setMaxStackSize(1);
    }

    public Item registerItemTexture(String texture) {
        iconPath = texture;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + iconPath);
    }
}
