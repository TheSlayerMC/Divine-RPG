package net.divinerpg.arcana.item;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemKey extends ItemsBase{

	public ItemKey(int par1) {
		super(par1);
	}

	public boolean onItemUse(ItemStack item, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {

		if(item.itemID == ArcanaItemHelper.key.itemID && par3World.getBlockId(par4, par5, par6) == ArcanaBlockHelper.oreDoor1.blockID){

			int id = par3World.getBlockMetadata(par4, par5, par6);

			int j1 = 10 & 7;
			j1 ^= 4;
			switch(id){
			case 0:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 2, 2);
				break;
			case 1:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 1, 2);
				break;
			case 2:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1, 2);
				break;
			case 3:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 1, 2);
				break;
			case 4:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 10, 2);
				break;
			case 5:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 11, 2);
				break;
			case 6:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 4, 2);
				break;
			case 7:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 3, 2);
				break;
			}
			item.stackSize--;
			par3World.markBlockRangeForRenderUpdate(par4, par5, par6, par4, par5, par6);
		}
		
		if(item.itemID == ArcanaItemHelper.key1.itemID && par3World.getBlockId(par4, par5, par6) == ArcanaBlockHelper.oreDoor2.blockID){

			int id = par3World.getBlockMetadata(par4, par5, par6);

			int j1 = 10 & 7;
			j1 ^= 4;
			switch(id){
			case 0:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 2, 2);
				break;
			case 1:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 1, 2);
				break;
			case 2:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1, 2);
				break;
			case 3:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 1, 2);
				break;
			case 4:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 10, 2);
				break;
			case 5:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 11, 2);
				break;
			case 6:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 4, 2);
				break;
			case 7:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 3, 2);
				break;
			}
			par3World.markBlockRangeForRenderUpdate(par4, par5, par6, par4, par5, par6);
			item.stackSize--;
		}
		
		if(item.itemID == ArcanaItemHelper.key2.itemID && par3World.getBlockId(par4, par5, par6) == ArcanaBlockHelper.oreDoor3.blockID){

			int id = par3World.getBlockMetadata(par4, par5, par6);

			int j1 = 10 & 7;
			j1 ^= 4;
			switch(id){
			case 0:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 2, 2);
				break;
			case 1:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 1, 2);
				break;
			case 2:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1, 2);
				break;
			case 3:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 1, 2);
				break;
			case 4:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 10, 2);
				break;
			case 5:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 11, 2);
				break;
			case 6:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 4, 2);
				break;
			case 7:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 3, 2);
				break;
			}
			par3World.markBlockRangeForRenderUpdate(par4, par5, par6, par4, par5, par6);
			item.stackSize--;
		}
		
		if(item.itemID == ArcanaItemHelper.key3.itemID && par3World.getBlockId(par4, par5, par6) == ArcanaBlockHelper.oreDoor4.blockID){

			int id = par3World.getBlockMetadata(par4, par5, par6);

			int j1 = 10 & 7;
			j1 ^= 4;
			switch(id){
			case 0:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 2, 2);
				break;
			case 1:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 1, 2);
				break;
			case 2:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1, 2);
				break;
			case 3:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 1, 2);
				break;
			case 4:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 10, 2);
				break;
			case 5:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 + 11, 2);
				break;
			case 6:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 4, 2);
				break;
			case 7:
				par3World.setBlockMetadataWithNotify(par4, par5, par6, j1 - 3, 2);
				break;
			}
			par3World.markBlockRangeForRenderUpdate(par4, par5, par6, par4, par5, par6);
			item.stackSize--;
		}
		return true;
	}

}
