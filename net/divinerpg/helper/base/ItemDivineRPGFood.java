package net.divinerpg.helper.base;

import net.divinerpg.item.tool.FoodBase;

public class ItemDivineRPGFood extends FoodBase {

    public final int itemUseDuration;

    public ItemDivineRPGFood(int par1, int par2, float par3, boolean par4) {
        super(par1, par2, par3, par4);
        this.itemUseDuration = 1;
    }	
}
