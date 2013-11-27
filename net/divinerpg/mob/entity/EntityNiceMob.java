package net.divinerpg.mob.entity;

import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAICreeperSwell;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityNiceMob extends EntityMob{
		
	public EntityNiceMob(World par1World) {
		super(par1World);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIWander(this, 0.8D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));

	}

	@Override
	protected boolean canTriggerWalking() {
		return false;
	}
    
    public void setMoveSpeed(double speed) {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(speed);
	}
    
    public void setMaxHealth(double health){
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(health);
    }
    
    public void setAttackDamage(double damage){
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(damage);
    }
	
    public void setFollowRange(double range){
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(range);
    }
    
    public void setKnockback(double knock) {
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(knock);
    }
    
    
    
    
    public void getMoveSpeed() {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue();
	}
    
    public void getModMaxHealth(){
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
    }
    
    public void getAttackDamage(){
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
    }
	
    public void getFollowRange(){
        this.getEntityAttribute(SharedMonsterAttributes.followRange).getAttributeValue();
    }
    
    public void getKnockback() {
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue();
    }
    
    public void swimming(EntityNiceMob entity) {
    	this.tasks.addTask(1, new EntityAISwimming(entity));
	}
    
    public void lookAtIdle(EntityNiceMob entity){
        this.tasks.addTask(2, new EntityAILookIdle(entity));
    }
    
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }
}