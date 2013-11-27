package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemInfernoSword extends ItemDivineRPGSword
{
    private float weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemInfernoSword(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.weaponDamage = 9;
    }

    public boolean hitEntity(ItemStack var1, EntityLivingBase var2, EntityLivingBase var3)
    {
        var1.damageItem(1, var3);
        var2.setFire(12);
        return true;
    }

    public boolean onBlockDestroyed(ItemStack var1, int var2, int var3, int var4, int var5, EntityLivingBase var6)
    {
        var1.damageItem(2, var6);
        return true;
    }

    /**
     * Returns the damage against a given entity.
     */
    public float getDamageVsEntity(Entity var1, ItemStack item)
    {
        return this.weaponDamage;
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @Override
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    @Override
    public EnumAction getItemUseAction(ItemStack var1)
    {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    @Override
    public int getMaxItemUseDuration(ItemStack var1)
    {
        return 72000;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
        return var1;
    }


    /**
     * Return the enchantability factor of the item, most of the time is based on material.
     */
    @Override
    public int getItemEnchantability()
    {
        return this.field_40439_b.getEnchantability();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add("On Hit: Burns for 12 seconds");
        par3List.add(EnumChatFormatting.GREEN + "Infinate Uses");
        //par3List.add("Does " + dmg + "Burns for 12 seconds");

    }
}
