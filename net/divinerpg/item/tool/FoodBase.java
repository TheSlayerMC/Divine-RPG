package net.divinerpg.item.tool;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class FoodBase extends ItemFood{
    private String iconPath;


    public FoodBase(int par1, int par2, float par3, boolean par4) {
        super(par1, par2, par3, par4);
        setCreativeTab(DivineRPG.Misc);
    }
    public Item registerTextures(String texture) {
        iconPath = texture;
        setUnlocalizedName(texture);
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + iconPath);
    }
}