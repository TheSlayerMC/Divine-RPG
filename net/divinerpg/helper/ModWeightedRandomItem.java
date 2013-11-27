package net.divinerpg.helper;

public class ModWeightedRandomItem
{
    /**
     * The Weight is how often the item is chosen(higher number is higher chance(lower is lower))
     */
    public int itemWeight;

    public ModWeightedRandomItem(int par1)
    {
        this.itemWeight = par1;
    }
}
