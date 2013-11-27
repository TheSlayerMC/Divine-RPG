package net.divinerpg.dravite.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.block.material.Material;

public class BlockDraviteOre extends BlockBase{

    public BlockDraviteOre(int blockID) {
        super(blockID, Material.rock);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return TwilightItemHelper.draviteFragment.itemID;
    }

}
