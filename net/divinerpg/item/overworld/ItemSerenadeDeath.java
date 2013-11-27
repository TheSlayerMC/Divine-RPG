package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityDeathSeranade;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSerenadeDeath extends ItemsBase
{
	private int weaponDamage;

	public ItemSerenadeDeath(int var1)
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
		if(!var2.isRemote)
		{
			var2.playSoundAtEntity(var3, Sound.Serenade, 1.0F, 1.0F);
			var2.spawnEntityInWorld(new EntityDeathSeranade(var2, var3));
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
		par3List.add("Poisonous");
		par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
	}
}
