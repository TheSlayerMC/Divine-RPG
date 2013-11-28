package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemLightningSword extends ItemDivineRPGSword{

	public ItemLightningSword(int par1, EnumToolMaterial enumToolMaterial) {
		super(par1, enumToolMaterial);
	}

	public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase)
	{
		par2EntityLivingBase.setFire(3);
		 lightningEffect(par2EntityLivingBase);
		 par1ItemStack.damageItem(1, par3EntityLivingBase);
		 return true;
	}
	  
	public void lightningEffect(EntityLivingBase par1EntityLiving)
	{
		 double x = par1EntityLiving.posX;
		 double y = par1EntityLiving.posY;
		 double z = par1EntityLiving.posZ;
		 World world = par1EntityLiving.worldObj;
		 EntityLightningBolt lightning = new EntityLightningBolt(world, x, y, z);
		 lightning.setPosition(x, y + 1, z);
		 world.spawnEntityInWorld(lightning);
	}
	
	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean par4) {
		list.add(item.getMaxDamage() - item.getItemDamage() + " Uses Remaining");
		list.add("On hit: Spawns lightning");
	}
	
}
