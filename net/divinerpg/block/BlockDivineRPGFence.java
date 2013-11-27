package net.divinerpg.block;

import net.divinerpg.helper.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockDivineRPGFence extends BlockFence{


	public BlockDivineRPGFence(int id, String textureName) {
		super(id, textureName, Material.wood);
		setCreativeTab(null);
	}	
	
    public boolean canConnectFenceTo(IBlockAccess par1, int par2, int par3, int par4)
    {
        int par5 = par1.getBlockId(par2, par3, par4);

        if (par5 != OverworldBlockHelper.lightFenceGreenOn.blockID && par5 != OverworldBlockHelper.lightFenceGreen.blockID && par5 != Block.netherFence.blockID && par5 != Block.fence.blockID && par5 != OverworldBlockHelper.lightFenceBlue.blockID && par5 != Block.fenceGate.blockID && par5 != OverworldBlockHelper.lightFenceBlueOn.blockID && par5 != OverworldBlockHelper.lightFenceRedOn.blockID && par5 != OverworldBlockHelper.lightFenceRed.blockID)
        {
            Block par6 = Block.blocksList[par5];
            return par6 != null && par6.blockMaterial.isOpaque() && par6.renderAsNormalBlock() ? par6.blockMaterial != Material.pumpkin : false;
        }
        else
        {
            return true;
        }
    }
}
