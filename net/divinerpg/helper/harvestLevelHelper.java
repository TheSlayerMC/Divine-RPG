package net.divinerpg.helper;

import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraftforge.common.MinecraftForge;

public class harvestLevelHelper {

    public static void init(){

        MinecraftForge.setBlockHarvestLevel(OverworldBlockHelper.bloodGemOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OverworldBlockHelper.netheriteOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OverworldBlockHelper.realmiteOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OverworldBlockHelper.rupeeOre, "pickaxe", 2);
        MinecraftForge.setBlockHarvestLevel(OverworldBlockHelper.arlemiteOre, "pickaxe", 2);

        MinecraftForge.setToolClass(OverworldItemHelper.arlemitePickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(OverworldItemHelper.realmitePickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(OverworldItemHelper.rupeePickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(OverworldItemHelper.rupeeShickaxe, "pickaxe", 4);
        MinecraftForge.setToolClass(OverworldItemHelper.arlemiteShickaxe, "pickaxe", 4);

    }
}
