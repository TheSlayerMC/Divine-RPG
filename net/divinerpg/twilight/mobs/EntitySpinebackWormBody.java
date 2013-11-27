package net.divinerpg.twilight.mobs;

import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySpinebackWormBody extends EntityModMob
{

    public EntityLiving head;
    public int spawnTick;
    public int moveMod;
    public int peiceNum;
    public EntitySpinebackWormBody(World var1)
    {
        super(var1);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWander(this, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
        this.noClip = true;
    }

    public EntitySpinebackWormBody(World var1, EntityLiving par2, int par3)
    {
        this(var1);
        this.head = par2;
        System.out.print(this.entityId);
        System.out.println(par3);
        this.setAttackTarget(par2);
        this.peiceNum = par3;
        if (this.peiceNum < 2)
        {
            EntitySpinebackWormBody peice = new EntitySpinebackWormBody(this.worldObj, this, this.peiceNum + 1);
            peice.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            this.worldObj.spawnEntityInWorld(peice);
        }
        this.spawnTick = 20;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMoveSpeed(0.83000000417232513D);
        this.setMaxHealth(1D);
        this.setAttackDamage(1D);
    }

    public int getAttackStrength(Entity var1)
    {
        return (int) this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    @Override
    protected float getSoundPitch()
    {
        return super.getSoundPitch() * 0.95F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return this.rand.nextInt(4) != 0 ? null : Sound.AlicantoHit;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.AlicantoHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.AlicantoHit;
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onLivingUpdate()
    {
        System.out.println(this.posX + " " + this.posY + " " + this.posZ);
        super.onLivingUpdate();
        if (this.head == null || this.head.isDead)
        {
            this.setDead();
        }
        this.motionY *= 0.2;
        if (this.spawnTick == 0)
        {
            this.moveMod = 1;
        }
        else if (this.spawnTick > 0)
        {
            --this.spawnTick;
            this.setVelocity(0, 0, 0);
            this.moveMod = 0;
        }
        this.moveFlying((float)this.motionX * this.moveMod, (float)this.motionY * this.moveMod, (float)this.motionZ * this.moveMod);
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    @Override
    protected void fall(float par1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    @Override
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    @Override
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        if (par1Entity != this.head)
            return this.head.attackEntityAsMob(par1Entity);
        return false;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        if (par1DamageSource == DamageSource.cactus || par1DamageSource == DamageSource.inWall)
            return false;
        return this.head.attackEntityFrom(par1DamageSource, par2);
    }
}