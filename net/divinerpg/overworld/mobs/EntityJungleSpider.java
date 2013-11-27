package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityJungleSpider extends EntitySpider
{
	public EntityJungleSpider(World var1) {
		super(var1);
		this.setSize(1.4F, 0.9F);

	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.800000011920929D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(16); // Attack
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(120); // MaxHP
	}

	/**
	 * Returns the sound this mob makes while it's alive.
	 */
	@Override
	protected String getLivingSound()
	{
		return Sound.JungleSpider;
	}

	/**
	 * Returns the item ID for the item the mob drops on death.
	 */
	@Override
	protected int getDropItemId()
	{
		return OverworldItemHelper.jungleShard.itemID;
	}

	/**
	 * Drop 0-2 items of this living's type
	 */
	@Override
	protected void dropFewItems(boolean var1, int var2)
	{
		int var3 = this.rand.nextInt(4 + var2);
		int var4;

		this.dropItem(OverworldItemHelper.jungleShard.itemID, var3);
	}

}
