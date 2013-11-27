package net.divinerpg.item;


import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHaliteArmor extends ItemArmor{

	private String[] descriptors;

	public ItemHaliteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
	}


	public ItemHaliteArmor setDescriptors(String[] descs) {
		descriptors = descs;
		return this;
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
	{
		

		
		return Reference.MOD_ID + ":" + "/textures/armor/halite_2.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		if(itemID == TwilightItemHelper.haliteHelmet.itemID) {
			this.itemIcon = par1IconRegister.registerIcon("DivineRPG:HaliteHelmet");
		}
		if(itemID == TwilightItemHelper.haliteBody.itemID) {
			this.itemIcon = par1IconRegister.registerIcon("DivineRPG:HaliteBody");
		}
		if(itemID == TwilightItemHelper.haliteLegs.itemID) {
			this.itemIcon = par1IconRegister.registerIcon("DivineRPG:HaliteLegs");
		}
		if(itemID == TwilightItemHelper.haliteBoots.itemID) {
			this.itemIcon = par1IconRegister.registerIcon("DivineRPG:HaliteBoots");
		}
	}

}
