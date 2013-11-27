package net.divinerpg.twilight.mobs;

import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityAngryBunny extends EntityModMob
{
	public EntityAngryBunny(World var1)
	{
		super(var1);
		
		this.setSize(1F, 1.5F);
		this.experienceValue = 40;
		this.getNavigator().setAvoidsWater(true);
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
        this.setMaxHealth(60.0D);
        this.setMoveSpeed(0.53000000417232513D);
        this.setAttackDamage(18D);
	}


	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	protected String getLivingSound()
	{
		return Sound.Hiss;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return Sound.GrowlHit;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return Sound.GrowlHit;
	}
}
