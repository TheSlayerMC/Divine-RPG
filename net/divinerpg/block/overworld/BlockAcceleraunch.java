package net.divinerpg.block.overworld;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockDivineRPGLadder;


public class BlockAcceleraunch extends BlockDivineRPGLadder
{
    public BlockAcceleraunch(int var1)
    {
        super(var1);
        this.slipperiness = 3.0F;
        setCreativeTab(DivineRPG.Blocks);
        registerTexture("Accelleraunch");
    }
}
