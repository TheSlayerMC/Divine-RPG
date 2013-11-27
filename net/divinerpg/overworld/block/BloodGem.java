package net.divinerpg.overworld.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;

public class BloodGem extends BlockBase{

    public BloodGem(int blockID) {
        super(blockID, Material.rock);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return OverworldItemHelper.bloodGem.itemID;
    }

}
