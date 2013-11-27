package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityAncient extends EntityModMob implements IBossDisplayData
{
    private int field_48119_b = 0;
    Village villageObj = null;
    private int field_48120_c;
    private int field_48118_d;

    public EntityAncient(World var1)
    {
        super(var1);
        this.setSize(4.0F, 9.0F);
        this.isImmuneToFire = true;
        float moveSpeed = 0.5F;
	}

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(4000.0D);
        this.setMoveSpeed(0.53000000417232513D);
        this.setAttackDamage(16D);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
    }
    
    @Override
    public String getEntityName()
    {
        return "Ancient Entity";
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }


    /**
     * Called when the entity is attacked.
     */
    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        super.attackEntityAsMob(par1Entity);

        if (this.entityToAttack != null)
        {
            this.entityToAttack.addVelocity(this.motionX * 10.0D, 3.0D, this.motionZ * 10.0D);
            if(this.entityToAttack instanceof EntityLiving)
            {
                ((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5 * 20, 0));
            }
            return true;
        }

        return false;
    }
    /**
     * Decrements the entity's air supply when underwater
     */
    @Override
    protected int decreaseAirSupply(int var1)
    {
        return var1;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "none";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.irongolem.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {

      this.dropItem(OverworldItemHelper.divineShard.itemID, 7);
        
    }
    
	public int getAncientHealth()
	{
		return 4000;
	}

    /**
     * knocks back this entity
     */
    public void knockBack(Entity par1Entity, int par2, double par3, double par5)
    {
    }
}
