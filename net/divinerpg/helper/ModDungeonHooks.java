package net.divinerpg.helper;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.common.FMLLog;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandom;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.util.WeightedRandomItem;

import static net.minecraftforge.common.ChestGenHooks.DUNGEON_CHEST;

public class ModDungeonHooks
{
    private static ArrayList<DungeonMob> dungeonMobs = new ArrayList<DungeonMob>();

    public static float addDungeonMob(String name, int rarity)
    {
        if (rarity <= 0)
        {
            throw new IllegalArgumentException("Rarity must be greater then zero");
        }

        for (DungeonMob mob : dungeonMobs)
        {
            if (name.equals(mob.type))
            {
                return mob.itemWeight += rarity;
            }
        }

        dungeonMobs.add(new DungeonMob(rarity, name));
        return rarity;
    }

    /**
     * Will completely remove a Mob from the dungeon spawn list.
     *
     * @param name The name of the mob to remove
     * @return The rarity of the removed mob, prior to being removed.
     */
    public static int removeDungeonMob(String name)
    {
        for (DungeonMob mob : dungeonMobs)
        {
            if (name.equals(mob.type))
            {
                dungeonMobs.remove(mob);
                return mob.itemWeight;
            }
        }
        return 0;
    }

    /**
     * Gets a random mob name from the list.
     * @param rand World generation random number generator
     * @return The mob name
     */
    public static String getRandomDungeonMob(Random rand)
    {
        DungeonMob mob = (DungeonMob)WeightedRandom.getRandomItem(rand, dungeonMobs);
        if (mob == null)
        {
            return "";
        }
        return mob.type;
    }


    public static class DungeonMob extends WeightedRandomItem
    {
        public String type;
        public DungeonMob(int weight, String type)
        {
            super(weight);
            this.type = type;
        }

        @Override
        public boolean equals(Object target)
        {
            return target instanceof DungeonMob && type.equals(((DungeonMob)target).type);
        }
    }

    static
    {
        
    }
}
