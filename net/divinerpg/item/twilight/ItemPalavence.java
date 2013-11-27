package net.divinerpg.item.twilight;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumHelper;

public class ItemPalavence extends ItemDivineRPGSword {

    public ItemPalavence(int par1) {
        super(par1, EnumHelper.addToolMaterial("palavence_" + par1, 0, 125, 0, 1, 16));
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if(par3EntityPlayer.getHealth() < par3EntityPlayer.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue()) {
            par3EntityPlayer.heal(2); // half
            par1ItemStack.damageItem(1, par3EntityPlayer);
        }
        return par1ItemStack.stackSize == 0 ? null : par1ItemStack;
    }

}
