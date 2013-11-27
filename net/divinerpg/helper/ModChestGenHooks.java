package net.divinerpg.helper;

import java.util.*;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.overworld.gen.WorldGenSpawner;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemEnchantedBook;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.structure.*;
import net.minecraftforge.oredict.OreDictionary;

public class ModChestGenHooks
{
    public static final String SPAWNER_DRAMCRYX = "spawner_dramcryx";

    public static final ModWeightedRandomChest[] dramcryx = new ModWeightedRandomChest[] {new ModWeightedRandomChest(Item.ingotIron.itemID, 0, 1, 5, 10), new ModWeightedRandomChest(OverworldItemHelper.divineWoodShovel.itemID, 0, 1, 3, 5), new ModWeightedRandomChest(OverworldItemHelper.rupeeIngot.itemID, 0, 4, 9, 5), new ModWeightedRandomChest(OverworldItemHelper.arlemiteIngot.itemID, 4, 4, 9, 5), new ModWeightedRandomChest(Item.diamond.itemID, 0, 1, 2, 3), new ModWeightedRandomChest(Item.coal.itemID, 0, 3, 8, 10), new ModWeightedRandomChest(Item.bread.itemID, 0, 1, 3, 15), new ModWeightedRandomChest(Item.pickaxeIron.itemID, 0, 1, 1, 1), new ModWeightedRandomChest(Block.rail.blockID, 0, 4, 8, 1), new ModWeightedRandomChest(Item.melonSeeds.itemID, 0, 2, 4, 10), new ModWeightedRandomChest(Item.pumpkinSeeds.itemID, 0, 2, 4, 10), new ModWeightedRandomChest(Item.saddle.itemID, 0, 1, 1, 3)};
    
    private static final HashMap<String, ModChestGenHooks> chestInfo = new HashMap<String, ModChestGenHooks>();
    private static boolean hasInit = false;
    static
    {
        init();
    }

    private static void init()
    {
        if (hasInit)
        {
            return;
        }

        hasInit = true;

        addInfo(SPAWNER_DRAMCRYX, dramcryx, 3, 7);
        
        ItemStack book = new ItemStack(Item.enchantedBook, 1, 0);
        
        ModWeightedRandomChest tmp = new ModWeightedRandomChest(book, 1, 1, 1);
        getInfo(SPAWNER_DRAMCRYX).addItem(tmp);
    }

    static void addDungeonLoot(ModChestGenHooks dungeon, ItemStack item, int weight, int min, int max)
    {
        dungeon.addItem(new ModWeightedRandomChest(item, min, max, weight));
    }

    private static void addInfo(String category, ModWeightedRandomChest[] items, int min, int max)
    {
        chestInfo.put(category, new ModChestGenHooks(category, items, min, max));
    }

    public static ModChestGenHooks getInfo(String category)
    {
        if (!chestInfo.containsKey(category))
        {
            chestInfo.put(category, new ModChestGenHooks(category));
        }
        return chestInfo.get(category);
    }

    public static ItemStack[] generateStacks(Random rand, ItemStack source, int min, int max)
    {
        int count = min + (rand.nextInt(max - min + 1));

        ItemStack[] ret;
        if (source.getItem() == null)
        {
            ret = new ItemStack[0];
        }
        else if (count > source.getItem().getItemStackLimit())
        {
            ret = new ItemStack[count];
            for (int x = 0; x < count; x++)
            {
                ret[x] = source.copy();
                ret[x].stackSize = 1;
            }
        }
        else
        {
            ret = new ItemStack[1];
            ret[0] = source.copy();
            ret[0].stackSize = count;
        }
        return ret;
    }

    //shortcut functions, See the non-static versions below
    public static ModWeightedRandomChest[] getItems(String category, Random rnd){ return getInfo(category).getItems(rnd); }
    public static int getCount(String category, Random rand){ return getInfo(category).getCount(rand); }
    public static void addItem(String category, ModWeightedRandomChest item){ getInfo(category).addItem(item); }
    public static void removeItem(String category, ItemStack item){ getInfo(category).removeItem(item); }
    public static ItemStack getOneItem(String category, Random rand){ return getInfo(category).getOneItem(rand); }

    private String category;
    private int countMin = 0;
    private int countMax = 0;
    //TO-DO: Privatize this once again when we remove the Deprecated stuff in DungeonHooks
    ArrayList<ModWeightedRandomChest> contents = new ArrayList<ModWeightedRandomChest>();

    public ModChestGenHooks(String category)
    {
        this.category = category;
    }

    public ModChestGenHooks(String category, ModWeightedRandomChest[] items, int min, int max)
    {
        this(category);
        for (ModWeightedRandomChest item : items)
        {
            contents.add(item);
        }
        countMin = min;
        countMax = max;
    }

    public void addItem(ModWeightedRandomChest item)
    {
        contents.add(item);
    }

    public void removeItem(ItemStack item)
    {
        Iterator<ModWeightedRandomChest> itr = contents.iterator();
        while(itr.hasNext())
        {
            ModWeightedRandomChest cont = itr.next();
            if (item.isItemEqual(cont.theItemId) || (item.getItemDamage() == OreDictionary.WILDCARD_VALUE && item.itemID == cont.theItemId.itemID))
            {
                itr.remove();
            }
        }
    }

    public ModWeightedRandomChest[] getItems(Random rnd)
    {
        ArrayList<ModWeightedRandomChest> ret = new ArrayList<ModWeightedRandomChest>();

        for (ModWeightedRandomChest orig : contents)
        {
            Item item = orig.theItemId.getItem();

            /*if (item != null)
            {
                ModWeightedRandomChest n = item.getChestGenBase(this, rnd, orig);
                if (n != null)
                {
                    ret.add(n);
                }
            }*/
        }

        return ret.toArray(new ModWeightedRandomChest[ret.size()]); 
    }

    /*public ModWeightedRandomChest getChestGenBase(ModChestGenHooks chest, Random rnd, ModWeightedRandomChest original)
    {
        if (this instanceof ItemEnchantedBook)
        {
            return ((ItemEnchantedBook)this).func_92112_a(rnd,
                    original.theMinimumChanceToGenerateItem,
                    original.theMaximumChanceToGenerateItem, original.itemWeight);
        }
        return original;
    }*/
    
    /**
     * Gets a random number between countMin and countMax.
     *
     * @param rand A RNG
     * @return A random number where countMin <= num <= countMax
     */
    public int getCount(Random rand)
    {
        return countMin < countMax ? countMin + rand.nextInt(countMax - countMin) : countMin;
    }

    /**
     * Returns a single ItemStack from the possible items in this registry,
     * Useful if you just want a quick and dirty random Item.
     *
     * @param rand  A Random Number gen
     * @return A single ItemStack, or null if it could not get one.
     */
    public ItemStack getOneItem(Random rand)
    {
        ModWeightedRandomChest[] items = getItems(rand);
        ModWeightedRandomChest item = (ModWeightedRandomChest)ModWeightedRandom.getRandomItem(rand, items);
        ItemStack[] stacks = ModChestGenHooks.generateStacks(rand, item.theItemId, item.theMinimumChanceToGenerateItem, item.theMaximumChanceToGenerateItem);
        return (stacks.length > 0 ? stacks[0] : null);
    }

    //Accessors
    public int getMin(){ return countMin; }
    public int getMax(){ return countMax; }
    public void setMin(int value){ countMin = value; }
    public void setMax(int value){ countMax = value; }
}
