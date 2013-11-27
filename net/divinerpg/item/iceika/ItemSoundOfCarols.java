package net.divinerpg.item.iceika;

import net.divinerpg.helper.base.ItemDivineRPGRanged;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityNoteProjectile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSoundOfCarols extends ItemDivineRPGRanged {

    public ItemSoundOfCarols(int par1) {
        super(par1, 4000, 16);

    }

    @Override
    public Entity projectile(ItemStack stack, World world, EntityPlayer player) {
        return new EntityNoteProjectile(world, player);
    }

    @Override
    public String sound(ItemStack stack, World world, EntityPlayer player) {
        return Sound.SoundOfCarols;
    }

}
