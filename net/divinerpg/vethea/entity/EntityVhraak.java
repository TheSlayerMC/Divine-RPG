package net.divinerpg.vethea.entity;

import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityVhraak extends EntityMob
{
    private static final double spawnLayer = 4;
    private int waitTick;
    private int lifeTick;
    private int spawnTick;

    public EntityVhraak(World var1)
    {
        super(var1);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue(), false));
        this.tasks.addTask(6, new EntityAIWander(this, this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        //TODO: Set SharedMonsterAttributes.followRange to 64.0f to fix the new EntityAINearestAttackableTarget's range.
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));


        this.lifeTick = -1;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.4); // Speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(30); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100); // MaxHP
    }

    public int getAttackStrength(Entity var1)
    {
        return (int) this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 64.0D * spawnLayer  && this.posY > 64.0D * (spawnLayer - 1) && super.getCanSpawnHere();
    }

    public EntityVhraak(World var1, int life)
    {
        this(var1);
        this.lifeTick = life;
    }

    @Override
    protected void updateAITasks()
    {
        if (this.getAttackTarget() != null && this.getDistanceToEntity(this.getAttackTarget()) < 0.5)
        {
            this.waitTick = 30;
            this.hasAttacked = false;
        }
        else if (this.waitTick == 0)
        {
            if (this.spawnTick == 0 && this.lifeTick == -1)
            {
                EntityVhraak var2 = new EntityVhraak(this.worldObj, 30);
                var2.setLocationAndAngles(this.posX + 1, this.posY, this.posZ + 1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var2);

                var2 = new EntityVhraak(this.worldObj, 30);
                var2.setLocationAndAngles(this.posX - 1, this.posY, this.posZ + 1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var2);

                var2 = new EntityVhraak(this.worldObj, 30);
                var2.setLocationAndAngles(this.posX + 1, this.posY, this.posZ - 1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var2);

                var2 = new EntityVhraak(this.worldObj, 30);
                var2.setLocationAndAngles(this.posX - 1, this.posY, this.posZ - 1, this.rotationYaw, this.rotationPitch);
                this.worldObj.spawnEntityInWorld(var2);
                this.spawnTick = 50;
            }
            else if (this.spawnTick > 0)
            {
                this.spawnTick--;
            }
            super.updateAITasks();
        }
        else
        {
            --this.waitTick;
        }
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (this.lifeTick > 0)
        {
            this.lifeTick--;
        }
        else if (this.lifeTick == 0 && !this.worldObj.isRemote)
        {
            this.setDead();
        }
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
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue()
    {
        return 0;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Vhraak;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.VhraakHit;
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
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        //return VetheaItemHelper.fyrossom.itemID;
    	return VetheaItemHelper.shinyPearls.itemID;
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }


    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheaItemHelper.shinyPearls.itemID, 1);
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    @Override
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer) 
    {
        this.attackEntityAsMob(par1EntityPlayer);
    }
}