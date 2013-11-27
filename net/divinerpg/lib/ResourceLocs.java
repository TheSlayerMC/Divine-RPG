package net.divinerpg.lib;

import net.minecraft.util.ResourceLocation;

public class ResourceLocs {
	
	public static String bossPrefix = Reference.MOD_ID + ":" + "/textures/gui/BossBars/";

    /* TEMP MISSING TEXTURE */
    public static ResourceLocation ADD_TEXTURE_HERE = new ResourceLocation(Reference.MOD_ID + ":" + "/textures/gui/Missing.png");



    /* GUI's */
    public static ResourceLocation GUI_ARCANA_BAR = new ResourceLocation(Reference.MOD_ID + ":" + "/textures/gui/ArcanaBar.png");
    public static ResourceLocation GUI_ANCIENT_ENTITY = new ResourceLocation(bossPrefix + "AncientEntity.png");

    
    /* Special Blocks */
    public static ResourceLocation BLOCK_DRAMIX_ALTAR =  new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/DramixAltar.png");
    public static ResourceLocation BLOCK_EXTRACTOR =  new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/Extractor.png");
    public static ResourceLocation BLOCK_PARASECTA_ALTAR =  new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/ParasectaAltar.png");
}
