package net.divinerpg.mob.ai;

import net.divinerpg.twilight.mobs.EntityParatiku;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIParatikuOwnerHurtByTarget extends EntityAITarget
{
    EntityParatiku theDefendingTameable;
    EntityLivingBase theOwnerAttacker;

    public EntityAIParatikuOwnerHurtByTarget(EntityParatiku par1EntityTameable)
    {
        super(par1EntityTameable, false);
        this.theDefendingTameable = par1EntityTameable;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute()
    {
        if (!this.theDefendingTameable.isTamed())
            return false;
        else
        {
            EntityLivingBase var1 = this.theDefendingTameable.getOwner();

            if (var1 == null)
                return false;
            else
            {
                this.theOwnerAttacker = var1.getAITarget();
                return this.isSuitableTarget(this.theOwnerAttacker, false);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.theOwnerAttacker);
        super.startExecuting();
    }
}
