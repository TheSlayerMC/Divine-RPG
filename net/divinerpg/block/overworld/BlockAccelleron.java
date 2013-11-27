package net.divinerpg.block.overworld;

import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;

public class BlockAccelleron extends BlockBase
{
	public BlockAccelleron(int var1)
    {
        super(var1, Material.rock);
        this.slipperiness = 1.2F;
        setCreativeTab(DivineRPG.Blocks);
        registerTexture("Acceleron_Side", "Acceleron_Top", "Acceleron_Side");
    }
}
