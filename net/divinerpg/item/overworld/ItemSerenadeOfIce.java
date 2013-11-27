package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGRanged;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityIce;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSerenadeOfIce extends ItemDivineRPGRanged {

    public ItemSerenadeOfIce(int id) {
        super(id, 100, 0);
    }

    @Override
    public Entity projectile(ItemStack stack, World world, EntityPlayer player) 
    {
        return new EntityIce(world, player);
    }

    @Override
    public String sound(ItemStack stack, World world, EntityPlayer player) 
    {
        return Sound.Serenade;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("Slows Target on Hit");
    }
}
