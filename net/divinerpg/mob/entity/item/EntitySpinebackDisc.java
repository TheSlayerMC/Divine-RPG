package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class EntitySpinebackDisc extends EntityDisk
{
    public EntitySpinebackDisc(World par1World)
    {
        super(par1World);
    }

    public EntitySpinebackDisc(World par1World, EntityLivingBase par2EntityLiving, int par3, Item i)
    {
        super(par1World, par2EntityLiving, par3, i);
    }

    public EntitySpinebackDisc(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
}