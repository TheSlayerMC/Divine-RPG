package net.divinerpg.item.iceika;

import net.divinerpg.helper.base.ItemDivineRPGRangedConsumable;
import net.divinerpg.mob.entity.item.EntityDamageProjectile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSnowflakeShuriken extends ItemDivineRPGRangedConsumable {

    public ItemSnowflakeShuriken(int id) {
        super(id, 7);

    }

    @Override
    public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
        EntityDamageProjectile projectile = new EntityDamageProjectile(world, player, dmg);
        projectile.setIcon(itemID);
        return projectile;
    }

}