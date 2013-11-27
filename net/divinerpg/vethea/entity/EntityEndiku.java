package net.divinerpg.vethea.entity;

import net.divinerpg.helper.block.VetheaBlockHelper;
import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityEndiku extends EntityMob
{
    private static final double spawnLayer = 3;
    public int eatX;
    public int eatY;
    public int eatZ;
    public int[] edible = new int[]{
            Block.wood.blockID
            , VetheaBlockHelper.firewood.blockID
            , VetheaBlockHelper.mintwood.blockID
            , VetheaBlockHelper.hyrewood.blockID
            , VetheaBlockHelper.dreamwood.blockID
    };
    private boolean isEaten;
    private int ability;
    float moveSpeed;

    public EntityEndiku(World var1)
    {
        super(var1);
        moveSpeed = 0.25F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, moveSpeed, false));
        this.tasks.addTask(4, new EntityAIMoveTowardsRestriction(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        // Need to set search range to 64.0F
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
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.2); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(17); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(70); // MaxHP
    }

    /**protected void updateAITasks()
    {
    	System.out.println(this.health);
    	if (this.health < this.getMaxHealth() * 0.2 && !this.isEaten)
    	{
    		for (int i = (int)this.posX - 2; i < (int)this.posX + 16; i++)
    		{
    			for (int j = (int)this.posZ - 2; j < (int)this.posZ + 16; j++)
        		{
    				for(int n = (int)this.posY - 2; n < (int)this.posY + 2; n++)
    				{
        				boolean var1 = this.worldObj.getBlockMaterial(i,(int)this.posY, j) == Material.wood;
        		    	System.out.println(i + " " + n + " " + j);
        		    	System.out.println(var1);
        				if (var1)
        				{
        			    	System.out.println("Moving");
        					this.isEaten = true;
        					this.eatX = i;
        					this.eatY = (int)this.posY;
        					this.eatZ = j;
        				}
    				}
        		}
    		}
    	}
    	super.updateAITasks();
    }**/
    //TODO: Look into this.

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if(this.isEaten && this.ability == 0)
        {
            if (this.getDistance(eatX, eatY, eatZ) < 2)
            {
                this.heal(70/8);
                this.worldObj.setBlock(eatX, eatY, eatZ, 0);
                this.isEaten = false;
                this.ability = 5;
            }
            else
            {
                this.getMoveHelper().setMoveTo(eatX, eatY, eatZ, moveSpeed);
                this.getLookHelper().setLookPosition(eatX, eatY, eatZ, 15F, 15F);
                this.moveEntityWithHeading(0F, moveSpeed / 4);
            }
        }
        else if (this.isEaten && this.ability > 0)
        {
            this.ability--;
        }
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
     * Returns the volume for the sounds this mob makes.
     */
    @Override
    protected float getSoundVolume()
    {
        return 0.7F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Endiku;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.EndikuHit;
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


    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(VetheaItemHelper.polishedPearls.itemID, 1);
    }
}