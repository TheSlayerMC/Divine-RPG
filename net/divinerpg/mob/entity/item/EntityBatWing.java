package net.divinerpg.mob.entity.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBatWing extends EntityThrowable
{
	public byte damage = 4;
	
    public EntityBatWing(World var1)
    {
        super(var1);
    }

    public EntityBatWing(World var1, EntityPlayer var2)
    {
        super(var1, var2);
    }
    
    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition var1)
    {
        if (var1.entityHit != null)
        {

            if (var1.entityHit instanceof EntityPlayer)
            {
                ((EntityPlayer)var1.entityHit).addPotionEffect(new PotionEffect(Potion.confusion.id, this.damage * 20, 0));
            }

            var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), this.damage);
        }

        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }
    }
}
