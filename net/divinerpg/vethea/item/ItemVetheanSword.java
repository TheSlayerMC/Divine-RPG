package net.divinerpg.vethea.item;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanSword extends ItemDivineRPGSword
{
    public ItemVetheanSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.setMaxDamage(-1);
        this.setCreativeTab(DivineRPG.Swords);
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        //par3List.add(par1ItemStack.getDamageVsEntity(par2EntityPlayer) + " Melee Damage");
        //TODO: Add this once getDamageVsEntity is reimplemented.
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
            par3List.add("Infinite Uses");
        }
        if (this instanceof ItemVetheanClaw)
        {
            par3List.add("Can not Block");
        }
        par3List.add("\u00a72Vethean");
    }
}