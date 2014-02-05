package net.divinerpg.item;


import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBaseArmor extends ItemArmor{
	
	private String texturePath = Reference.MOD_ID + ":" + "textures/models/armor/";
	private String iconPath = Reference.MOD_ID + ":";
	
	public ItemBaseArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String type) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		setMaxStackSize(1);
		setCreativeTab(DivineRPG.Armor);
		setArmorType(type, par4);
	}
	
	private void setArmorType (String type, int par4) {
		switch(par4) {
		case 0:
			this.setUnlocalizedName(type + "Helmet");
			this.texturePath += type + "_1.png";
			this.iconPath += type + "Helmet";
			break;
		case 1:
			this.setUnlocalizedName(type + "Body");
			this.texturePath += type + "_1.png";
			this.iconPath += type + "Body";
			break;
		case 2:
			this.setUnlocalizedName(type + "Legs");
			this.texturePath += type + "_2.png";
			this.iconPath += type + "Legs";
			break;
		case 3:
			this.setUnlocalizedName(type + "Boots");
			this.texturePath += type + "_1.png";
			this.iconPath += type + "Boots";
			break;
		}
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(this.iconPath);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
		return this.texturePath;
	}
	
}