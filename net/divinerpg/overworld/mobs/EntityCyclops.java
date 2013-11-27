package net.divinerpg.overworld.mobs;

import java.util.List;
import java.util.UUID;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeInstance;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCyclops extends EntityModMob
{
	private static final UUID field_110189_bq = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
	private static final AttributeModifier field_110190_br = (new AttributeModifier(field_110189_bq, "Attacking speed boost", 0.45D, 0)).setSaved(false);

	private int angerLevel;

	private int randomSoundDelay;
	private Entity field_110191_bu;

	public EntityCyclops(World par1World)
	{
		super(par1World);
		this.experienceValue = 40;
		this.setSize(2.0F, 3.9F);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.setMaxHealth(400.0D);
		this.setAttackDamage(5.0D);
		this.setMoveSpeed(0.5D);
	}

	protected boolean isAIEnabled()
	{
		return false;
	}

	/**
	 * Called to update the entity's position/logic.
	 */
	public void onUpdate()
	{
		if (this.field_110191_bu != this.entityToAttack && !this.worldObj.isRemote)
		{
			AttributeInstance attributeinstance = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
			attributeinstance.removeModifier(field_110190_br);

			if (this.entityToAttack != null)
			{
				attributeinstance.applyModifier(field_110190_br);
			}
		}

		this.field_110191_bu = this.entityToAttack;

		if (this.randomSoundDelay > 0 && --this.randomSoundDelay == 0)
		{
			this.playSound(Sound.Cyclops, this.getSoundVolume() * 2.0F, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 1.8F);
		}

		super.onUpdate();
	}

	/**
	 * Checks if the entity's current position is a valid location to spawn this entity.
	 */
	public boolean getCanSpawnHere()
	{
		return this.worldObj.difficultySetting > 0 && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
	}

	/**
	 * (abstract) Protected helper method to write subclass entity data to NBT.
	 */
	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("Anger", (short)this.angerLevel);
	}

	/**
	 * (abstract) Protected helper method to read subclass entity data from NBT.
	 */
	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
	{
		super.readEntityFromNBT(par1NBTTagCompound);
		this.angerLevel = par1NBTTagCompound.getShort("Anger");
	}

	/**
	 * Finds the closest player within 16 blocks to attack, or null if this Entity isn't interested in attacking
	 * (Animals, Spiders at day, peaceful PigZombies).
	 */
	protected Entity findPlayerToAttack()
	{
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	/**
	 * Called when the entity is attacked.
	 */
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	{
		if (this.isEntityInvulnerable())
		{
			return false;
		}
		else
		{
			Entity entity = par1DamageSource.getEntity();

			if (entity instanceof EntityPlayer)
			{
				List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

				for (int i = 0; i < list.size(); ++i)
				{
					Entity entity1 = (Entity)list.get(i);

					if (entity1 instanceof EntityCyclops)
					{
						EntityCyclops entitypigzombie = (EntityCyclops)entity1;
						entitypigzombie.becomeAngryAt(entity);
					}
				}

				this.becomeAngryAt(entity);
			}

			return super.attackEntityFrom(par1DamageSource, par2);
		}
	}

	/**
	 * Causes this PigZombie to become angry at the supplied Entity (which will be a player).
	 */
	private void becomeAngryAt(Entity par1Entity)
	{
		this.entityToAttack = par1Entity;
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	protected String getLivingSound()
	{
		return Sound.Cyclops;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	protected String getHurtSound()
	{
		return Sound.CyclopsHurt;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	protected String getDeathSound()
	{
		return Sound.CyclopsHurt;
	}

	/**
	 * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
	 * par2 - Level of Looting used to kill this mob.
	 */
	protected void dropFewItems(boolean par1, int par2)
	{
		this.dropItem(OverworldItemHelper.cyclopseEye.itemID, 1);
	}

	protected void dropRareDrop(int par1)
	{
		this.dropItem(OverworldItemHelper.cyclopseEye.itemID, 1);
		this.dropItem(OverworldItemHelper.bloodGem.itemID, 1);

	}

	public EntityLivingData onSpawnWithEgg(EntityLivingData par1EntityLivingData)
	{
		super.onSpawnWithEgg(par1EntityLivingData);
		return par1EntityLivingData;
	}
}
