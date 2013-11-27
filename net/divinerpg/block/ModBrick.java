package net.divinerpg.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class ModBrick extends BlockBase{


	public ModBrick(int ID, String Name) {
		super(ID, Material.rock);
		this.registerTexture(Name + "Bricks");
		setHardness(4.0F);
		setCreativeTab(DivineRPG.Blocks);
	}
}
