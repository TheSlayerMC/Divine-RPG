package net.divinerpg.item.tool;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PickaxeBase extends ItemPickaxe{

    private String iconPath;

    public PickaxeBase(int par1, EnumToolMaterial par3ENUM){
        super(par1, par3ENUM);
        setMaxStackSize(1);
        this.setCreativeTab(DivineRPG.Tools);

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
