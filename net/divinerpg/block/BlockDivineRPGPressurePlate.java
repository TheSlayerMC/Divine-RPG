package net.divinerpg.block;

import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public abstract class BlockDivineRPGPressurePlate extends BlockBasePressurePlate {

	protected BlockDivineRPGPressurePlate(int par1, String par2) {
		super(par1, par2, Material.wood);
	}
	

	
}