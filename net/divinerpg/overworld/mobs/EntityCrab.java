package net.divinerpg.overworld.mobs;

import java.util.List;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityCrab extends EntityMob {
	private int angerLevel = 0;
	private int randomSoundDelay = 5;

	public EntityCrab(World var1) {
		super(var1);
		this.setSize(1.5F, 0.5F);
		this.experienceValue = 40;
	}
	
	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(25.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(160.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.9F);
	}

	protected boolean isAIEnabled() {
		return false;
	}

	public void onLivingUpdate() {
		super.onLivingUpdate();
	}

	public void onUpdate() {
		super.onUpdate();
	}

	public boolean getCanSpawnHere() {
		return this.worldObj.difficultySetting > 0 && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).size() == 0 && !this.worldObj.isAnyLiquid(this.boundingBox);
	}

	public void writeEntityToNBT(NBTTagCompound var1) {
		super.writeEntityToNBT(var1);
		var1.setShort("Anger", (short) this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound var1) {
		super.readEntityFromNBT(var1);
		this.angerLevel = var1.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public boolean attackEntityFrom(DamageSource var1, int var2) {
		Entity var3 = var1.getEntity();

		if (var3 instanceof EntityPlayer) {
			List var4 = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.boundingBox.expand(32.0D, 32.0D, 32.0D));

			for (int var5 = 0; var5 < var4.size(); ++var5) {
				Entity var6 = (Entity) var4.get(var5);

				if (var6 instanceof EntityCrab) {
					EntityCrab var7 = (EntityCrab) var6;
				} else if (var6 instanceof EntityKingCrab) {
					EntityKingCrab var7 = (EntityKingCrab) var6;
				}
			}

			this.becomeAngryAt(var3);
		}

		return super.attackEntityFrom(var1, var2);
	}

	private void becomeAngryAt(Entity var1) {
		this.entityToAttack = var1;
		this.angerLevel = 400 + this.rand.nextInt(400);
		this.randomSoundDelay = this.rand.nextInt(40);
	}

	protected String getLivingSound() {
		return Sound.Crab;
	}

	protected String getHurtSound() {
		return Sound.CrabHurt;
	}

	protected String getDeathSound() {
		return Sound.CrabHurt;
	}

	protected void dropFewItems(boolean var1, int var2) {
		int var3 = this.rand.nextInt(2 + var2);

		for (int var4 = 0; var4 < var3; var4++) {
			this.dropItem(OverworldItemHelper.crabClaw.itemID, 1);
		}
	}

	protected int getDropItemId() {
		return OverworldItemHelper.crabClaw.itemID;
	}
}
