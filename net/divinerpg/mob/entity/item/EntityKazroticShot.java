package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityKazroticShot extends EntityThrowable
{
    public EntityKazroticShot(World par1World)
    {
        super(par1World);
    }

    public EntityKazroticShot(World par1World, EntityLiving par2EntityLiving)
    {
        super(par1World, par2EntityLiving);
    }

    public EntityKazroticShot(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            this.setDead();
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, 9, false);
        }
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    @Override
    protected float getGravityVelocity()
    {
        return 0.0007F;
    }
}