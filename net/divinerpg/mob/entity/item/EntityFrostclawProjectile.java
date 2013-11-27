package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**   NYI
 * Does not seem to be implemented yet.
 * @author Mazetar
 *
 */
public class EntityFrostclawProjectile extends EntityThrowable {

    public EntityFrostclawProjectile(World world) {
        super(world);
    }

    public EntityFrostclawProjectile(World var1, EntityLivingBase var2, int damage) {
        super(var1, var2);
    }

    @Override
    protected void onImpact(MovingObjectPosition movingobjectposition) {
        // TODO Auto-generated method stub

    }

}
