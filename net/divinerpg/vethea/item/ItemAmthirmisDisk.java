package net.divinerpg.vethea.item;

import net.divinerpg.mob.entity.item.EntityAmthirmisDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemAmthirmisDisk extends ItemVetheanDisk
{

    public ItemAmthirmisDisk(int par1, int par2) {
        super(par1, par2);
    }

    @Override
    public void shoot(World world, EntityPlayer player)
    {
        world.spawnEntityInWorld(new EntityAmthirmisDisk(world, player, this.damage, this));
    }
}
