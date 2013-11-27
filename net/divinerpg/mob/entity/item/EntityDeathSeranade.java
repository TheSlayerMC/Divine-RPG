package net.divinerpg.mob.entity.item;

import net.divinerpg.render.portalFX.EntityGreenPortalFX;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityDeathSeranade extends EntityThrowable
{
	public EntityDeathSeranade(World var1)
	{
		super(var1);
	}

	public EntityDeathSeranade(World var1, EntityLivingBase var2)
	{
		super(var1, var2);
	}

	public EntityDeathSeranade(World var1, double var2, double var4, double var6)
	{
		super(var1, var2, var4, var6);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	@Override
	protected void onImpact(MovingObjectPosition var1)
	{
		if (var1.entityHit != null)
		{
			byte var2 = 19;

			if (var1.entityHit instanceof EntityBlaze)
			{
				var2 = 19;
			}

			((EntityLivingBase) var1.entityHit).addPotionEffect(new PotionEffect(Potion.poison.id, 200, 2));
			var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), var2);
		}

		if (!this.worldObj.isRemote)
		{
			this.setDead();
		}
	}
}
