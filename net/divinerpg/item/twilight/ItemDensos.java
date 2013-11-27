package net.divinerpg.item.twilight;

import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.twilight.mobs.EntityDensos;
import net.divinerpg.twilight.mobs.EntityReyvor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDensos extends ItemDivineRPG
{
    private World worldObj;

    public ItemDensos(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        int var4 = 0;
        if (!par3World.isRemote)
        {
            while (var4 < 1)//1 gets the amount of mobs to spawn at once
            {
                EntityDensos var5 = new EntityDensos(par3World);
                EntityReyvor var6 = new EntityReyvor(par3World);
                var5.setPosition(par4, par5+1, par6);
                var6.setPosition(par4, par5+1, par6);
                par3World.spawnEntityInWorld(var5);
                par3World.spawnEntityInWorld(var6);
                ++var4;
            }
        }


            --par1ItemStack.stackSize;
        

        return true;
    }

}