package net.divinerpg.block;

import net.divinerpg.DivineRPG;
import net.minecraft.block.material.Material;

public class ModBlock extends BlockBase
{

    public ModBlock(int blockID) {
        super(blockID, Material.rock);
        setCreativeTab(DivineRPG.Blocks);
    }

}
