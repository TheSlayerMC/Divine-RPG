package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

/** @see net.divinerpg.helper.handlers.DivineRPG.utils.handlers.ExplosiveArrowHitHandler **/
public class EntityExplosiveArrow extends EntityDivineRPGArrow {

    public EntityExplosiveArrow(World var1, EntityLivingBase entity, float var3) {
        super(var1, entity, var3, 0);
        shootingEntity = entity;
    }

    public EntityExplosiveArrow(World par1World) {
        super(par1World, 0);
    }


}
