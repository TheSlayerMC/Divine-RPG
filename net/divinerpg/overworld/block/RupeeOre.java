package net.divinerpg.overworld.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class RupeeOre extends BlockBase{

    public RupeeOre(int blockID) {
        super(blockID, Material.rock);
        GameRegistry.registerBlock(this);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return this.blockID;
    }

}
