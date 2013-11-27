package net.divinerpg.vethea.item;

import net.divinerpg.mob.entity.item.EntitySpinebackDisc;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemSpinebackDisc extends ItemVetheanDisk
{

    public ItemSpinebackDisc(int par1, int par2) {
        super(par1, par2);
        this.setMaxStackSize(5);
    }

    @Override
    public void shoot(World par2, EntityPlayer par3)
    {
        par2.spawnEntityInWorld(new EntitySpinebackDisc(par2, par3, this.damage, this));
    }
}