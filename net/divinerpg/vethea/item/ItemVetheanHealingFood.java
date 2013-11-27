package net.divinerpg.vethea.item;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVetheanHealingFood extends ItemVetheanFood
{

    private int healthGain;

    public ItemVetheanHealingFood(int par1, int par2, float par3, boolean par4, int par5) {
        super(par1, par2, par3, par4);
        this.healthGain = par5;
        this.setAlwaysEdible();
    }

    /**
     * How long it takes to use or consume an item
     */
    @Override
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 16;
    }

    @Override
    public void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player)
    {
        //player.setEntityHealth(player.func_110143_aJ() + healthGain);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Replenishes " + this.healthGain + " Health");
        par3List.add(((ItemFood) par1ItemStack.getItem()).getSaturationModifier() + " Saturation");
        par3List.add("Pet Food: " + ((ItemFood) par1ItemStack.getItem()).isWolfsFavoriteMeat());
        par3List.add("\u00a72Vethean");
    }
}
