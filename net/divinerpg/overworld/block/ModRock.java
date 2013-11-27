package net.divinerpg.overworld.block;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRock extends BlockBase {

    public ModRock(int blockID) {
        super(blockID, Material.rock);
        GameRegistry.registerBlock(this);
    }

}
