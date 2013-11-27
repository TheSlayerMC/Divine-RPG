package net.divinerpg.item.overworld;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;

public class ItemCorruptedMaul extends ItemDivineRPGSword
{
	private float weaponDamage;

	public ItemCorruptedMaul(int par1, EnumToolMaterial par2EnumToolMaterial)
	{
		super(par1, par2EnumToolMaterial);
		this.weaponDamage = 18.0F;
	}

	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack) {
		return weaponDamage;
	}   
}
