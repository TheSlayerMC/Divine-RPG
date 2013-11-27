package net.divinerpg.vethea.item;

import net.divinerpg.mob.entity.item.EntityPardimalDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemPardimalDisk extends ItemVetheanDisk
{

    public ItemPardimalDisk(int par1, int par2) {
        super(par1, par2);
    }

    @Override
    public void shoot(World par2, EntityPlayer par3)
    {
        par2.spawnEntityInWorld(new EntityPardimalDisk(par2, par3, this.damage, this));
    }
}