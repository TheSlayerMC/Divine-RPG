package net.divinerpg.vethea.entity;

import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityKazroticShot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityKazrotic extends EntityMob implements IRangedAttackMob
{
    private static final double spawnLayer = 3;

    public EntityKazrotic(World par1World)
    {
        super(par1World);
        double moveSpeed = 0.25F;
        
        this.tasks.addTask(7, new EntityAIArrowAttack(this, moveSpeed, 60, 64.0F));        
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIRestrictSun(this));
        this.tasks.addTask(3, new EntityAIFleeSun(this, moveSpeed));
        this.tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 64.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        //TODO: Set SharedMonsterAttributes.followRange to 64.0f to fix the new EntityAINearestAttackableTarget's range.
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    @Override
    protected void applyEntityAttributes() {
    	super.applyEntityAttributes();
    	this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25F); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(0); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(65); // MaxHP
    }
    
    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Kazrotic;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.KazroticHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return 0;
    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase par1, float par2)
    {
        EntityKazroticShot var1 = new EntityKazroticShot(this.worldObj, this);
        var1.setThrowableHeading(var1.motionX, var1.motionY, var1.motionZ, 0.3F, 0.3F);

        this.playSound("random.bow", 1.0F, 1.0F);
        this.worldObj.spawnEntityInWorld(var1);
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1, int par2)
    {
        if (par1.isExplosion())
            return false;
        return super.attackEntityFrom(par1, par2);
    }


    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheaItemHelper.polishedPearls.itemID, 1);
    }
}