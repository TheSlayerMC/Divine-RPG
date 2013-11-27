package net.divinerpg.item;

import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMassivence extends ItemSword 
{
	private String iconPath;

	public ItemMassivence(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, par2EnumToolMaterial);
	}

	public Item registerTextures(String texture) 
	{
		iconPath = texture;
		return this;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) 
	{
		itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + iconPath);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
	{
		//if(par3EntityPlayer.func_110143_aJ() < par3EntityPlayer.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111126_e()) 
		{
			par3EntityPlayer.heal(1); // half
			par1ItemStack.damageItem(1, par3EntityPlayer);
		}
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
	}

}