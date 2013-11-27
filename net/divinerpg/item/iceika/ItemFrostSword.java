package net.divinerpg.item.iceika;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFrostSword extends ItemDivineRPGSword
{

    public ItemFrostSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        super(par1, par2EnumToolMaterial);
        this.setMaxDamage(5000);
        this.registerItemTexture("FrostSword");
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack var1, EntityLiving var2, EntityLiving var3)
    {
        var3.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
        var1.damageItem(1, var3);
        return true;
    }

    public float getDamageVsEntity (Entity par1, ItemStack stack)
    {
        return 10;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("On Hit: Slows for 2 seconds");
    }

}