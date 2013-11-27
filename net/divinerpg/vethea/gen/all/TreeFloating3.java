/*
*** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
*/

package net.divinerpg.vethea.gen.all;
import java.util.Random;

import net.divinerpg.helper.block.VetheaBlockHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class TreeFloating3 extends WorldGenerator
{
	protected int[] GetValidSpawnBlocks() {
		return new int[] {
		};
	}
	
	public TreeFloating3() { }

	public boolean generate(World world, Random rand, int i, int j, int k) {

		world.setBlock(i + 0, j + 2, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 0, j + 2, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 0, j + 2, k + 3, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 0, j + 5, k + 1, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 0, j + 5, k + 2, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 1, j + 0, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 0, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 1, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 0, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 2, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 2, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 2, k + 3, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 3, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 3, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 3, k + 3, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 1, j + 4, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 4, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 1, j + 5, k + 0, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 1, j + 5, k + 1, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 1, j + 5, k + 2, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 1, j + 5, k + 3, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 2, j + 1, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 2, j + 1, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 0, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 2, j + 2, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 2, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 2, k + 3, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 2, j + 3, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 3, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 4, k + 1, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 4, k + 2, VetheaBlockHelper.firewood.blockID);
		world.setBlock(i + 2, j + 5, k + 0, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 2, j + 5, k + 1, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 2, j + 5, k + 2, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 2, j + 5, k + 3, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 3, j + 2, k + 1, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 3, j + 2, k + 2, VetheaBlockHelper.firewoodLeaves.blockID);
		world.setBlock(i + 3, j + 5, k + 1, VetheaBlockHelper.dreamStone.blockID);
		world.setBlock(i + 3, j + 5, k + 2, VetheaBlockHelper.dreamStone.blockID);

		return true;
	}
}