package net.divinerpg.arcana;

import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ArcanaRecipeHelper {
    public static void init() {
        initItems(); 
    }

    public static void initItems() {
        GameRegistry.addRecipe(new ItemStack(ArcanaBlockHelper.arcanaPortalFrame, 12), new Object[]{" x ", "yyy", " x ", 'x', OverworldItemHelper.blueFireStone, 'y', Block.blockIron});
       
        
    }
}
