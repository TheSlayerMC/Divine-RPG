package net.divinerpg.mythril.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.block.material.Material;

public class BlockMythrilOre extends BlockBase{

    public BlockMythrilOre(int blockID) {
        super(blockID, Material.rock);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return TwilightItemHelper.mythrilFragment.itemID;
    }

}
