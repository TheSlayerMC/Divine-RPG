package net.divinerpg.helper;

import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class ModWeightedRandom
{
    /**
     * Returns the total weight of all items in a collection.
     */
    public static int getTotalWeight(Collection par0Collection)
    {
        int i = 0;
        ModWeightedRandomItem ModWeightedRandomItem;

        for (Iterator iterator = par0Collection.iterator(); iterator.hasNext(); i += ModWeightedRandomItem.itemWeight)
        {
            ModWeightedRandomItem = (ModWeightedRandomItem)iterator.next();
        }

        return i;
    }

    /**
     * Returns a random choice from the input items, with a total weight value.
     */
    public static ModWeightedRandomItem getRandomItem(Random par0Random, Collection par1Collection, int par2)
    {
        if (par2 <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            int j = par0Random.nextInt(par2);
            Iterator iterator = par1Collection.iterator();
            ModWeightedRandomItem ModWeightedRandomItem;

            do
            {
                if (!iterator.hasNext())
                {
                    return null;
                }

                ModWeightedRandomItem = (ModWeightedRandomItem)iterator.next();
                j -= ModWeightedRandomItem.itemWeight;
            }
            while (j >= 0);

            return ModWeightedRandomItem;
        }
    }

    /**
     * Returns a random choice from the input items.
     */
    public static ModWeightedRandomItem getRandomItem(Random par0Random, Collection par1Collection)
    {
        return getRandomItem(par0Random, par1Collection, getTotalWeight(par1Collection));
    }

    /**
     * Returns the total weight of all items in a array.
     */
    public static int getTotalWeight(ModWeightedRandomItem[] par0ArrayOfModWeightedRandomItem)
    {
        int i = 0;
        ModWeightedRandomItem[] aModWeightedRandomItem1 = par0ArrayOfModWeightedRandomItem;
        int j = par0ArrayOfModWeightedRandomItem.length;

        for (int k = 0; k < j; ++k)
        {
            ModWeightedRandomItem ModWeightedRandomItem = aModWeightedRandomItem1[k];
            i += ModWeightedRandomItem.itemWeight;
        }

        return i;
    }

    /**
     * Returns a random choice from the input array of items, with a total weight value.
     */
    public static ModWeightedRandomItem getRandomItem(Random par0Random, ModWeightedRandomItem[] par1ArrayOfModWeightedRandomItem, int par2)
    {
        if (par2 <= 0)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            int j = par0Random.nextInt(par2);
            ModWeightedRandomItem[] aModWeightedRandomItem1 = par1ArrayOfModWeightedRandomItem;
            int k = par1ArrayOfModWeightedRandomItem.length;

            for (int l = 0; l < k; ++l)
            {
                ModWeightedRandomItem ModWeightedRandomItem = aModWeightedRandomItem1[l];
                j -= ModWeightedRandomItem.itemWeight;

                if (j < 0)
                {
                    return ModWeightedRandomItem;
                }
            }

            return null;
        }
    }

    /**
     * Returns a random choice from the input items.
     */
    public static ModWeightedRandomItem getRandomItem(Random par0Random, ModWeightedRandomItem[] par1ArrayOfModWeightedRandomItem)
    {
        return getRandomItem(par0Random, par1ArrayOfModWeightedRandomItem, getTotalWeight(par1ArrayOfModWeightedRandomItem));
    }
}
