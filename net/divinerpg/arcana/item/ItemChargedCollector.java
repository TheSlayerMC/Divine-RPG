package net.divinerpg.arcana.item;

import net.divinerpg.arcana.mobs.EntityConstructor;
import net.divinerpg.arcana.mobs.EntityDramix;
import net.divinerpg.arcana.mobs.EntityParasecta;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemChargedCollector extends ItemsBase{

	public ItemChargedCollector(int par1) {
		super(par1);
	}

	public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
	{
		if(!var3.isRemote)
		{
			if (var7 != 1)
			{
				return false;
			}
			else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
			{
				int var11 = var3.getBlockId(var4, var5, var6);

				if (var11 == ArcanaBlockHelper.dramixAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
				{
					EntityConstructor tinkerer = new EntityConstructor(var3);
					tinkerer.setLocationAndAngles((double)var4 + 0.0D, (double)var5 + 1.0D, (double)var6 + 0.0D, 0.0F, 0.0F);
					var3.spawnEntityInWorld(tinkerer);
					return true;
				} else {
					return false;
				}
			}else{
				return false;
			}
		}
		return false;
	}
}