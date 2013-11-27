package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityBlitzAugite;
import net.divinerpg.mob.entity.item.EntityBlitzAzurite;
import net.divinerpg.mob.entity.item.EntityBlitzDravite;
import net.divinerpg.mob.entity.item.EntityBlitzHalite;
import net.divinerpg.mob.entity.item.EntityBlitzMythril;
import net.divinerpg.mob.entity.item.EntityBlitzUvite;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBlitz extends ItemsBase
{
	private int weaponDamage;

	public ItemBlitz(int var1)
	{
		super(var1);
		this.maxStackSize = 1;
		this.setMaxDamage(-1);
		this.setCreativeTab(DivineRPG.Projectile);
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		boolean var4 = var3.capabilities.isCreativeMode;

		if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.azuriteDust.itemID))
		{
			return var1;
		}
		else
		{
			if(itemID == TwilightItemHelper.AzuriteBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzAzurite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.azuriteDust.itemID);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.augiteDust.itemID))
		{
			return var1;
		}
		else
		{
			if(itemID == TwilightItemHelper.HaliteBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzHalite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.augiteDust.itemID);
			}

			if(itemID == TwilightItemHelper.AugiteBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzAugite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.augiteDust.itemID);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.uviteDust.itemID))
		{
			return var1;
		}
		else
		{
			if(itemID == TwilightItemHelper.UviteBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzUvite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.uviteDust.itemID);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.mythrilDust.itemID))
		{
			return var1;
		}
		else
		{
			if(itemID == TwilightItemHelper.MythrilBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzMythril(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.mythrilDust.itemID);
			}
		}

		if (!var4 && !var3.inventory.hasItem(TwilightItemHelper.draviteDust.itemID))
		{
			return var1;
		}
		else
		{
			if(itemID == TwilightItemHelper.DraviteBlitz.itemID)
			{
				if(!var2.isRemote)
				{
					var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityBlitzDravite(var2, var3));
				}
				var3.inventory.consumeInventoryItem(TwilightItemHelper.draviteDust.itemID);
			}
		}
		var1.damageItem(1, var3);
		return var1;
	}

	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

	/**
	 * Returns the damage against a given entity.
	 */
	public int getDamageVsEntity(Entity var1)
	{
		return this.weaponDamage;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(itemID == TwilightItemHelper.HaliteBlitz.itemID)
		{
			par3List.add("33 Ranged Damage");
			par3List.add("Ammo: Augite Dust");
		}
		if(itemID == TwilightItemHelper.MythrilBlitz.itemID)
		{
			par3List.add("27 Ranged Damage");
			par3List.add("Ammo: Mythril Dust");
		}
		if(itemID == TwilightItemHelper.UviteBlitz.itemID)
		{
			par3List.add("22 Ranged Damage");
			par3List.add("Ammo: Uvite Dust");
		}
		if(itemID == TwilightItemHelper.AugiteBlitz.itemID)
		{
			par3List.add("31 Ranged Damage");
			par3List.add("Ammo: Augite Dust");
		}
		if(itemID == TwilightItemHelper.DraviteBlitz.itemID)
		{
			par3List.add("14 Ranged Damage");
			par3List.add("Ammo: Dravite Dust");
		}
		if(itemID == TwilightItemHelper.AzuriteBlitz.itemID)
		{
			par3List.add("19 Ranged Damage");
			par3List.add("Ammo: Azurite Dust");
		}
		par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
	}
}
