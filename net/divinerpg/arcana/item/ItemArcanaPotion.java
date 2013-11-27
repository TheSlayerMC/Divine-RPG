package net.divinerpg.arcana.item;

import net.divinerpg.arcana.ArcanaHelper;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArcanaPotion extends ItemsBase
{

	public ItemArcanaPotion(int id)
	{
		super(id);
	}

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
    	if(var1.itemID == ArcanaItemHelper.weakArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(100);
    		--var1.stackSize;
    	}
    	
    	if(var1.itemID == ArcanaItemHelper.strongArcanaPotion.itemID)
    	{
    		ArcanaHelper.regen(200);
    		--var1.stackSize;
    	}
    	
    	
		return var1;
    }
}
