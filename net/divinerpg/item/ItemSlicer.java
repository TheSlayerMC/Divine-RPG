package net.divinerpg.item;

import java.util.List;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.mob.entity.item.EntitySlicerAugite;
import net.divinerpg.mob.entity.item.EntitySlicerAzurite;
import net.divinerpg.mob.entity.item.EntitySlicerDravite;
import net.divinerpg.mob.entity.item.EntitySlicerHalite;
import net.divinerpg.mob.entity.item.EntitySlicerMythril;
import net.divinerpg.mob.entity.item.EntitySlicerUvite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSlicer extends ItemsBase
{
	public ItemSlicer(int var1)
	{
		super(var1);
		this.maxStackSize = 64;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if (!var3.capabilities.isCreativeMode)
		{
			--var1.stackSize;
		}

		var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

		if(itemID == TwilightItemHelper.AzuriteSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerAzurite(var2, var3));
		}

		if(itemID == TwilightItemHelper.HaliteSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerHalite(var2, var3));
		}

		if(itemID == TwilightItemHelper.MythrilSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerMythril(var2, var3));
		}

		if(itemID == TwilightItemHelper.DraviteSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerDravite(var2, var3));
		}

		if(itemID == TwilightItemHelper.AugiteSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerAugite(var2, var3));
		}

		if(itemID == TwilightItemHelper.UviteSlicer.itemID) {
			var2.spawnEntityInWorld(new EntitySlicerUvite(var2, var3));
		}

		return var1;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(itemID == TwilightItemHelper.AzuriteSlicer.itemID)
		{
			par3List.add("18 Ranged Damage");
		}
		if(itemID == TwilightItemHelper.HaliteSlicer.itemID)
		{
			par3List.add("42 Ranged Damage");
		}
		if(itemID == TwilightItemHelper.MythrilSlicer.itemID)
		{
			par3List.add("28 Ranged Damage");
		}
		if(itemID == TwilightItemHelper.DraviteSlicer.itemID)
		{
			par3List.add("12 Ranged Damage");
		}
		if(itemID == TwilightItemHelper.AugiteSlicer.itemID)
		{
			par3List.add("36 Ranged Damage");
		}
		if(itemID == TwilightItemHelper.UviteSlicer.itemID)
		{
			par3List.add("22 Ranged Damage");
		}
	}
}
