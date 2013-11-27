package net.divinerpg.helper;

import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
public class TwilightRecipeHelper {
    public static void init() {
        initBlocks();
        initWeapons();
        initTools();
        initArmor();
        initItems();
        initSmelting();
    }

    public static void initBlocks() {
       // GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.draviteChest, 1), new Object[] {"xxx", "x x", "xxx", 'x', TwilightItemHelper.draviteFragment});
       // GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.uviteRail, 4), new Object[] {"x x", "xxx", "x x", 'x', TwilightItemHelper.uviteFragment});

        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.draviteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.draviteFragment});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.azuriteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.azuriteFragment});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.uviteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.uviteFragment});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.mythrilBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.mythrilFragment});
        GameRegistry.addRecipe(new ItemStack(TwilightBlockHelper.augiteBlock, 1), new Object[] {"xxx", "xxx", "xxx", 'x', TwilightItemHelper.augiteFragment});
    }
    public static void initWeapons() {
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.draviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.draviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.draviteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DravitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.draviteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DraviteSlicer, 40), new Object[] {TwilightItemHelper.draviteGem});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.azuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuritePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AzuriteSlicer, 40), new Object[] {TwilightItemHelper.azuriteGem});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.uviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.uviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.uviteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UvitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.uviteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.UviteSlicer, 40), new Object[] {TwilightItemHelper.uviteGem});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.mythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilPhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilSlicer, 40), new Object[] {TwilightItemHelper.mythrilGem});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBlade, 1), new Object[] {" y ", " y ", " x ", 'y', TwilightItemHelper.augiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBlitz, 1), new Object[] {"y y", "y y", "yyy", 'y', TwilightItemHelper.augiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBow, 1), new Object[] {" yx", "y x", " yx", 'y', TwilightItemHelper.augiteChunk, 'x', Item.silk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugitePhaser, 1), new Object[] {" y ", "yyy", " x ", 'y', TwilightItemHelper.augiteChunk, 'x', Item.stick});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AugiteSlicer, 40), new Object[] {TwilightItemHelper.augiteGem});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteArrow, 4), new Object[]{" y ", " x ", " z ", 'y', TwilightItemHelper.azuriteFragment, 'x', Item.stick, 'z', Item.feather });
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.FuryArrow, 4), new Object[]{" y ", " x ", " z ", 'y', TwilightItemHelper.augiteFragment, 'x', Item.stick, 'z', Item.feather });
    }

    public static void initTools() {
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DraviteShickaxe, 1), new Object[] {TwilightItemHelper.DraviteShovel, TwilightItemHelper.DravitePickaxe, TwilightItemHelper.DraviteAxe});
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AzuriteShickaxe, 1), new Object[] {TwilightItemHelper.AzuriteShovel, TwilightItemHelper.AzuritePickaxe, TwilightItemHelper.AzuriteAxe});
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.UviteShickaxe, 1), new Object[] {TwilightItemHelper.UviteShovel, TwilightItemHelper.UvitePickaxe, TwilightItemHelper.UviteAxe});
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.MythrilShickaxe, 1), new Object[] {TwilightItemHelper.MythrilShovel, TwilightItemHelper.MythrilPickaxe, TwilightItemHelper.MythrilAxe});
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.AugiteShickaxe, 1), new Object[] {TwilightItemHelper.AugiteShovel, TwilightItemHelper.AugitePickaxe, TwilightItemHelper.AugiteAxe});
		GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.DivineShickaxe, 1), new Object[] {TwilightItemHelper.DivineShovel, TwilightItemHelper.DivinePickaxe, TwilightItemHelper.DivineAxe});

    	
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DravitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.draviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.draviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.draviteChunk, 'x', Item.stick});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuritePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.azuriteChunk, 'x', Item.stick});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UvitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.uviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.uviteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.uviteChunk, 'x', Item.stick});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilPickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.mythrilChunk, 'x', Item.stick});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugitePickaxe, 1), new Object[] {"yyy", " x ", " x ", 'y', TwilightItemHelper.augiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteAxe, 1), new Object[] {"yy ", "yx ", " x ", 'y', TwilightItemHelper.augiteChunk, 'x', Item.stick});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteShovel, 1), new Object[] {" y ", " x ", " x ", 'y', TwilightItemHelper.augiteChunk, 'x', Item.stick});
    }

    public static void initArmor() {
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.draviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.draviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Dravitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.draviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.DraviteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.draviteChunk});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.azuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.azuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Azuritelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.azuriteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AzuriteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.azuriteChunk});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.uviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.uviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Uvitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.uviteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.UviteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.uviteChunk});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.mythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.mythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Mythrillegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.mythrilChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.MythrilBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.mythrilChunk});


        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteHelmet, 1), new Object[] {"yyy", "y y", 'y', TwilightItemHelper.augiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteChest, 1), new Object[] {"y y", "yyy", "yyy", 'y', TwilightItemHelper.augiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.Augitelegs, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.augiteChunk});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.AugiteBoots, 1), new Object[] {"y y", "y y", 'y', TwilightItemHelper.augiteChunk});

    }

    public static void initItems() {
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.draviteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.draviteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.draviteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.draviteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.draviteFragment, 1), new Object[]{TwilightItemHelper.draviteSoul});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.azuriteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.azuriteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.azuriteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.azuriteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.azuriteFragment, 1), new Object[]{TwilightItemHelper.azuriteSoul});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.uviteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.uviteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.uviteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.uviteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.uviteFragment, 1), new Object[]{TwilightItemHelper.uviteSoul});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.mythrilChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.mythrilGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.mythrilGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.mythrilFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.mythrilFragment, 1), new Object[]{TwilightItemHelper.mythrilSoul});

        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.augiteChunk, 1), new Object[] {"yyy", "y y", "y y", 'y', TwilightItemHelper.augiteGem});
        GameRegistry.addRecipe(new ItemStack(TwilightItemHelper.augiteGem, 1), new Object[] {"yyy", 'y', TwilightItemHelper.augiteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.augiteFragment, 1), new Object[]{TwilightItemHelper.augiteSoul});

        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.baseSpawnCrystal, 1), new Object[] {TwilightItemHelper.mythrilSoul, TwilightItemHelper.mythrilSoul, TwilightItemHelper.mythrilSoul, TwilightItemHelper.mythrilSoul, TwilightItemHelper.mythrilSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.spawnVamacheron, 1), new Object[] {OverworldItemHelper.baseSpawnCrystal, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.spawnKarot, 1), new Object[] {OverworldItemHelper.baseSpawnCrystal, TwilightItemHelper.uviteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.mythrilSoul});
        //GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnReyvor, 1), new Object[] {TwilightItemHelper.baseSpawnCrystal, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.draviteSoul, TwilightItemHelper.azuriteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.spawnDensos, 1), new Object[] {OverworldItemHelper.baseSpawnCrystal, TwilightItemHelper.uviteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.azuriteSoul, TwilightItemHelper.mythrilSoul});
        GameRegistry.addRecipe(new ItemStack(OverworldItemHelper.infernalFlame, 1), new Object[] {"xxx", "xyx", "xxx", 'x', OverworldItemHelper.purpleBlaze, 'y', OverworldItemHelper.infernoSword});
        // GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.spawnZichile, 1), new Object[] {TwilightItemHelper.baseSpawnCrystal, TwilightItemHelper.draviteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.draviteSoul, TwilightItemHelper.azuriteSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.spawnTwilightDemon, 1), new Object[] {OverworldItemHelper.baseSpawnCrystal, TwilightItemHelper.augiteSoul, TwilightItemHelper.augiteSoul, TwilightItemHelper.azuriteSoul, TwilightItemHelper.mythrilSoul});
        GameRegistry.addShapelessRecipe(new ItemStack(OverworldItemHelper.spawnSoulFiend, 1), new Object[] {OverworldItemHelper.baseSpawnCrystal, TwilightItemHelper.uviteSoul, TwilightItemHelper.mythrilSoul, TwilightItemHelper.azuriteSoul, TwilightItemHelper.draviteSoul});

        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.draviteDust, 9), new Object[] {TwilightItemHelper.draviteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.azuriteDust, 9), new Object[] {TwilightItemHelper.azuriteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.mythrilDust, 9), new Object[] {TwilightItemHelper.mythrilFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.uviteDust, 9), new Object[] {TwilightItemHelper.uviteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.augiteDust, 9), new Object[] {TwilightItemHelper.augiteFragment});
        GameRegistry.addShapelessRecipe(new ItemStack(TwilightItemHelper.draviteFragment, 1), new Object[] {TwilightItemHelper.draviteSparkles});

        GameRegistry.addRecipe(new ItemStack(OverworldBlockHelper.DraviteLamp, 1), new Object[] { "xxx", "xyx", "xxx", 'y', TwilightItemHelper.draviteFragment, 'x', Item.ingotIron });
    }

    public static void initSmelting() {
        GameRegistry.addSmelting(TwilightBlockHelper.DraviteOre.blockID, new ItemStack(TwilightItemHelper.draviteFragment, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.AzuriteOre.blockID, new ItemStack(TwilightItemHelper.azuriteFragment, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.UviteOre.blockID, new ItemStack(TwilightItemHelper.uviteFragment, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.mythrilOre.blockID, new ItemStack(TwilightItemHelper.mythrilFragment, 1), 1.0F);
        GameRegistry.addSmelting(TwilightBlockHelper.augiteOre.blockID, new ItemStack(TwilightItemHelper.augiteFragment, 1), 1.0F);
        GameRegistry.addSmelting(TwilightItemHelper.draviteFragment.itemID, new ItemStack(TwilightItemHelper.draviteSparkles, 1), 1.0F);
    }
}
