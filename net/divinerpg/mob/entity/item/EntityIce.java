package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityIce extends EntityDamageProjectile {

    public EntityIce(World var1, EntityLivingBase var2) {
        super(var1, var2, 0);
    }

    public EntityIce(World world) {
        super(world, 16);
    }

    @Override
    protected void onImpact(MovingObjectPosition pos) {
        super.onImpact(pos);
        if(pos.entityHit != null && pos.entityHit instanceof EntityLivingBase && pos.entityHit != getThrower()) {
            ((EntityLivingBase) pos.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 90, 0));
        }
    }
}
