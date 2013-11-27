package net.divinerpg.arcana.item;

import java.util.List;

import net.divinerpg.arcana.ArcanaHelper;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityFirefly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFirefly extends ItemsBase
{
    public ItemFirefly(int par1)
    {
        super(par1);
        this.maxStackSize = 1;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote && ArcanaHelper.useBar((EntityPlayer)par3EntityPlayer, 5))
        {
        	par2World.playSoundAtEntity(par3EntityPlayer, Sound.FireFly, 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
            par2World.spawnEntityInWorld(new EntityFirefly(par2World));
        }

        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("5 Arcana");
        par3List.add("Homing Shots");
        par3List.add("10 Ranged Damage");
        //par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
