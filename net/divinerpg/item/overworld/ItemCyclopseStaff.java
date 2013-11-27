package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityCyclopsianStaff;
import net.divinerpg.mob.entity.item.EntityPhaserAugite;
import net.divinerpg.mob.entity.item.EntityPhaserAzurite;
import net.divinerpg.mob.entity.item.EntityPhaserDravite;
import net.divinerpg.mob.entity.item.EntityPhaserHalite;
import net.divinerpg.mob.entity.item.EntityPhaserMythril;
import net.divinerpg.mob.entity.item.EntityPhaserUvite;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCyclopseStaff extends ItemsBase
{
	private int damage;
	private int firetick;
	private int firemax;
	private String firesound;
	private String reloadsound;

	public ItemCyclopseStaff(int var1, int var2, int var3, int var4, String var5, String var6)
	{
		super(var1);
		this.damage = var2;
        this.firemax = var4;
        this.firetick = this.firemax;
        this.firesound = var5;
        this.reloadsound = var6;
        this.setMaxStackSize(1);
        this.setMaxDamage(3000);
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
	{
		if(!var2.isRemote)
		{
			if (this.firetick == this.firemax && this.firemax != 0)
			{

				if(itemID == OverworldItemHelper.cyclopseStaff.itemID)
				{
					var2.playSoundAtEntity(var3, Sound.Staff, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityCyclopsianStaff(var2, var3));
					var1.damageItem(1, var3);
				}
				
                this.firetick = 0;
			}
			else
			{
				++this.firetick;
			}

			if (this.firemax == 0)
			{

				if(itemID == OverworldItemHelper.cyclopseStaff.itemID)
				{
					var2.playSoundAtEntity(var3, Sound.Staff, 1.0F, 1.0F);
					var2.spawnEntityInWorld(new EntityCyclopsianStaff(var2, var3));
					var1.damageItem(1, var3);
				}
			}

		}
		return var1;
	}

	/**
	 * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
	 */
	@Override
	public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
	{
		this.firetick = this.firemax;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * Returns True is the item is renderer in full 3D when hold.
	 */
	public boolean isFull3D()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)

	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(itemID == OverworldItemHelper.cyclopseStaff.itemID)
		{
			par3List.add("17 Ranged Damage");
			par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
		}
	}
}
