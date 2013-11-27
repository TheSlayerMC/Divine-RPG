package net.divinerpg.arcana.mobs;

import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityConstructor extends EntityModMob
{
    int angerLevel;
    float moveSpeed = 0.23F;
    public EntityConstructor(World par1World)
    {
        super(par1World);
        this.setSize(0.5F, 1.9F);
        this.angerLevel = 0;
        this.stepHeight = 1.0F;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(100.0D);
        this.setMoveSpeed(0.23000000417232513D);
        this.setAttackDamage(25D);
    }

    @Override
    public void onLivingUpdate()
    {
        if (this.entityToAttack != null)
        {
            this.faceEntity(this.entityToAttack, 100.0F, 100.0F);
        }

        if (!this.worldObj.isRemote && this.isEntityAlive())
        {
            if (this.entityToAttack != null)
            {
                if (this.entityToAttack instanceof EntityPlayer && this.angerLevel < 3)
                {
                    this.moveStrafing = this.moveForward = 0.0F;
                    this.moveSpeed = 0.0F;
                }
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return null;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.ConstructorHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return null;
    }

    protected int getDropItemId()
    {
        switch (this.rand.nextInt(4))
        {
        case 0:
        	return ArcanaItemHelper.key.itemID;
        case 1:
        	return ArcanaItemHelper.key1.itemID;
        case 2:
        	return ArcanaItemHelper.key2.itemID;
        case 3:
        	return ArcanaItemHelper.key3.itemID;
        }
        return 0;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

    public void teleportToEntity(Entity par1Entity, int x, int y, int z)
    {
        this.setPosition(par1Entity.posX, par1Entity.posY, par1Entity.posZ);
        this.findPlayerToAttack();
    }

    @Override
    protected boolean isValidLightLevel()
    {        
        return true;
    }


    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty();
    }

    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        this.worldObj.playSoundAtEntity(this, "mob.RPG.dungeonConstructorPunch", 1.0F, 1.0F);
        return super.attackEntityAsMob(par1Entity);
    }
}
