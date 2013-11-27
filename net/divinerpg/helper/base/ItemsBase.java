package net.divinerpg.helper.base;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemsBase extends Item {
    private String texture;

    public ItemsBase(int par1) {
        super(par1);
        setCreativeTab(DivineRPG.Misc);
    }

    public Item registerTextures(String texture) {
        this.texture = texture;
        setUnlocalizedName(texture);
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + texture);
    }
}
