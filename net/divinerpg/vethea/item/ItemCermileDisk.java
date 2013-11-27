package net.divinerpg.vethea.item;

import net.divinerpg.mob.entity.item.EntityCermileDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemCermileDisk extends ItemVetheanDisk
{

    public ItemCermileDisk(int par1, int par2) {
        super(par1, par2);
    }

    @Override
    public void shoot(World world, EntityPlayer player)
    {
        world.spawnEntityInWorld(new EntityCermileDisk(world, player, this.damage, this));
    }
}
