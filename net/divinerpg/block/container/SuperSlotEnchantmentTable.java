package net.divinerpg.block.container;

import net.minecraft.inventory.InventoryBasic;

public class SuperSlotEnchantmentTable extends InventoryBasic
{
    /** The brewing stand this slot belongs to. */
    final ContainerSuperEnchant container;

    public SuperSlotEnchantmentTable(ContainerSuperEnchant containerSuperEnchant, String par2Str, int par3)
    {
        super(par2Str, false, par3);
        this.container = containerSuperEnchant;
    }

    /**
     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended. *Isn't
     * this more of a set than a get?*
     */
    @Override
    public int getInventoryStackLimit()
    {
        return 1;
    }

    /**
     * Called when an the contents of an Inventory change, usually
     */
    @Override
    public void onInventoryChanged()
    {
        super.onInventoryChanged();
        this.container.onCraftMatrixChanged(this);
    }
}