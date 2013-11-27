package net.divinerpg.dravite.block;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;

public class BlockDraviteLog extends BlockBase{

    public BlockDraviteLog(int blockID) {
        super(blockID, Material.wood);
        this.registerTexture("DraviteLog_Side", "DraviteLog_Top", "DraviteLog_Top");
    }

}
