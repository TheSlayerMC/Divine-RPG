package net.divinerpg.vethea.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.BlockDivineRPGContainer;
import net.divinerpg.helper.handlers.GuiHandler;
import net.divinerpg.overworld.block.tileentity.TileEntityInfusionTable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockInfusionTable extends BlockDivineRPGContainer
{

	public BlockInfusionTable(int par1) 
	{
		super(par1, Material.rock);          
		this.registerTexture("InfusionTable_Side", "InfusionTable_Top", "InfusionTable_Side");
	}

	@Override
	public TileEntity createNewTileEntity(World world) 
	{
		return new TileEntityInfusionTable();
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
	{
		TileEntityInfusionTable tile_entity = (TileEntityInfusionTable)world.getBlockTileEntity(x, y, z);
		if(tile_entity == null || par5EntityPlayer.isSneaking())
		{
			return false;
		}
		par5EntityPlayer.openGui(DivineRPG.instance, GuiHandler.INFUSION_TABLE, world, x, y, z);
		return true;

	}
}
