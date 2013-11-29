package net.divinerpg.iceika.block;

import java.util.Random;

import net.divinerpg.block.ModLeaves;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.minecraft.block.Block;

public class IceLeaves extends ModLeaves{

    public IceLeaves(int par1, String par2) {
		super(par1, par2);
	}

	public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return IceikaBlockHelper.iceSapling.blockID;
    }
	
}
