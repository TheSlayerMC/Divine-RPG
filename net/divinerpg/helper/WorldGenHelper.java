package net.divinerpg.helper;

import net.divinerpg.overworld.gen.WorldGenOverworld;
import net.divinerpg.worldgen.WorldGenDivineOres;
import cpw.mods.fml.common.registry.GameRegistry;

public class WorldGenHelper {

    /**
     * Registers world generators.
     */
    public static void init(){
        GameRegistry.registerWorldGenerator(new WorldGenDivineOres());
        GameRegistry.registerWorldGenerator(new WorldGenOverworld());
    }

}
