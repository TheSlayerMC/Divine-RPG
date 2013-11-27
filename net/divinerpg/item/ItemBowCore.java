package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBowCore extends ItemBow
{
	public static final String[] Mythril = new String[] {"DivineRPG:MythrilBow_1", "DivineRPG:MythrilBow_2", "DivineRPG:MythrilBow_3"};
	public static final String[] Uvite = new String[] {"DivineRPG:UviteBow1", "DivineRPG:UviteBow2", "DivineRPG:UviteBow3"};
	public static final String[] Augite = new String[] {"DivineRPG:AugiteBow_1", "DivineRPG:AugiteBow_2", "DivineRPG:AugiteBow_3"};
	public static final String[] Azurite = new String[] {"DivineRPG:AzuriteBow_1", "DivineRPG:AzuriteBow_2", "DivineRPG:AzuriteBow_3"};
	public static final String[] Dravite = new String[] {"DivineRPG:DraviteBow1", "DivineRPG:DraviteBow2", "DivineRPG:DraviteBow3"};
	public static final String[] Twilight = new String[] {"DivineRPG:TwilightBow_1", "DivineRPG:TwilightBow_2", "DivineRPG:TwilightBow_3"};

	private String iconPath;
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public ItemBowCore(int par1)
	{
		super(par1);
		this.maxStackSize = 1;
	}


	public Item registerTextures(String texture) 
	{
		iconPath = texture;
		return this;
	}


	@Override
	public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
	{
		int j = this.getMaxItemUseDuration(par1ItemStack) - par4;

		ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
			return;
		j = event.charge;

		boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

		if (flag || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
		{
			float f = j / 20.0F;
			f = (f * f + f * 2.0F) / 3.0F;

			if (f < 0.1D)
				return;

			if (f > 1.0F)
			{
				f = 1.0F;
			}

			EntityArrow entityarrow = new EntityArrow(par2World, par3EntityPlayer, f * 2.0F);

			if (f == 1.0F)
			{
				entityarrow.setIsCritical(true);
			}

			int k = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

			if (k > 0)
			{
				entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D);
			}

			int l = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

			if (l > 0)
			{
				entityarrow.setKnockbackStrength(l);
			}

			if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
			{
				entityarrow.setFire(100);
			}

			par1ItemStack.damageItem(1, par3EntityPlayer);
			par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + f * 0.5F);

			if (flag)
			{
				entityarrow.canBePickedUp = 2;
			}
			else
			{
				par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
			}

			if (!par2World.isRemote)
			{
				par2World.spawnEntityInWorld(entityarrow);
			}
		}
	}

	@Override
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		return par1ItemStack;
	}

	/**
	 * How long it takes to use or consume an item
	 */
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 72000;
	}

	/**
	 * returns the action that specifies what animation to play when the items is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.bow;
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled())
			return event.result;

		if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(Item.arrow.itemID))
		{
			par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		}

		return par1ItemStack;
	}

	/**
	 * Return the enchantability factor of the item, most of the time is based on material.
	 */
	@Override
	public int getItemEnchantability()
	{
		return 1;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + iconPath);

		if(itemID == TwilightItemHelper.MythrilBow.itemID) 
		{
			this.iconArray = new Icon[Mythril.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Mythril[i]);
			}
		}

		if(itemID == TwilightItemHelper.UviteBow.itemID) 
		{
			this.iconArray = new Icon[Uvite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Uvite[i]);
			}
		}
		
		if(itemID == TwilightItemHelper.AugiteBow.itemID) 
		{
			this.iconArray = new Icon[Augite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Augite[i]);
			}
		}
		
		if(itemID == TwilightItemHelper.AzuriteBow.itemID) 
		{
			this.iconArray = new Icon[Azurite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Azurite[i]);
			}
		}
		
		if(itemID == TwilightItemHelper.DraviteBow.itemID) 
		{
			this.iconArray = new Icon[Dravite.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Dravite[i]);
			}
		}
		
		if(itemID == TwilightItemHelper.TwilightBow.itemID) 
		{
			this.iconArray = new Icon[Twilight.length];

			for (int i = 0; i < this.iconArray.length; ++i)
			{
				this.iconArray[i] = par1IconRegister.registerIcon(Twilight[i]);
			}
		}
	}

	@Override
	public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
	{
		if(player.getItemInUse() == null) return this.itemIcon;
		int var4 = stack.getMaxItemUseDuration() - useRemaining;
		if (var4 > 18)
			return iconArray[2];
		else if (var4 > 13)
			return iconArray[1];
		else if (var4 > 0)
			return iconArray[0];
		return iconArray[0];
	}

	@Override
	public Icon getItemIconForUseDuration(int par1)
	{
		return this.iconArray[par1];
	}

}
