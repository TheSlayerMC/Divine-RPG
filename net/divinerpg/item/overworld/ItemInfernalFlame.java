package net.divinerpg.item.overworld;

import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.overworld.mobs.EntityKingOfScorchers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemInfernalFlame extends ItemDivineRPG {
	private World worldObj;

	public ItemInfernalFlame(int var1) {
		super(var1);
		this.maxStackSize = 1;
	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
		int var4 = 0;
		if(par3World.provider.dimensionId == -1){
			if (!par3World.isRemote) {
				while (var4 < 1) {
					EntityKingOfScorchers var5 = new EntityKingOfScorchers(
							par3World);
					var5.setPosition(par4, par5 + 1, par6);
					par3World.spawnEntityInWorld(var5);
					var4++;
					par2EntityPlayer.inventory.consumeInventoryItem(this.itemID);
				}
			}
		}
		if(par3World.isRemote)
			--par1ItemStack.stackSize;
		//par2EntityPlayer.inventory.consumeInventoryItem(this.itemID);
		par2EntityPlayer.addChatMessage("The King Of Scorchers can only be spawned in The Nether");
		
		return true;
	}

}