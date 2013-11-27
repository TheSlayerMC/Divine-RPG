package net.divinerpg.vethea.item;

import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityEversightProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemVetheanEversight extends ItemVetheanCannon
{
    public ItemVetheanEversight(int par1, int par2, String name) 
    {
        super(par1, par2, name);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && (par3.capabilities.isCreativeMode || par3.inventory.consumeInventoryItem(VetheaItemHelper.acidfire.itemID)))
        {
            par2.playSoundAtEntity(par3, Sound.Blitz, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityEversightProjectile(par2, par3, this.damage));
        }

        return par1;
    }
}
