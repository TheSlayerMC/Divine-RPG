package net.divinerpg.vethea.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemVetheanHammerSword extends ItemVetheanSword
{
    private static float weaponDamage;

    public ItemVetheanHammerSword(int i, String name, float damage)
    {
        super(i, enumz);
        this.setUnlocalizedName(name);
        this.weaponDamage = damage;
    }
    
    public static EnumToolMaterial enumz = EnumHelper.addToolMaterial("enumz", 0, -1, 0, weaponDamage, 22);

}
