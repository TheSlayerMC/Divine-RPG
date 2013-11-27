package net.divinerpg.helper;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.handlers.GuiHandler;
import net.divinerpg.overworld.gen.WorldGenOverworld;
import net.divinerpg.worldgen.WorldGenDivineMinable;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHelper {

    /**
     * Registers world generators.
     */
    public static void init(){
        GameRegistry.registerWorldGenerator(new WorldGenDivineMinable());
        GameRegistry.registerWorldGenerator(new WorldGenOverworld());
    }

}
