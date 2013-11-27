package net.divinerpg.vethea.item;

import net.divinerpg.mob.entity.item.EntityHeliosisDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemHeliosisDisk extends ItemVetheanDisk
{

    public ItemHeliosisDisk(int par1, int par2) {
        super(par1, par2);
    }

    @Override
    public void shoot(World par2, EntityPlayer par3)
    {
        par2.spawnEntityInWorld(new EntityHeliosisDisk(par2, par3, this.damage, this));
    }
}