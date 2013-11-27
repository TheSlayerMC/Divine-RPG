package net.divinerpg.item;

import java.util.List;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemHaliteBow extends ItemBow
{
    public ItemHaliteBow(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
        this.setMaxDamage(10000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        ArrowNockEvent var4 = new ArrowNockEvent(var3, var1);
        MinecraftForge.EVENT_BUS.post(var4);

        if (var4.isCanceled())
            return var4.result;
        else
        {
            if (var3.capabilities.isCreativeMode || var3.inventory.hasItem(TwilightItemHelper.haliteBow.itemID))
            {
                var3.setItemInUse(var1, this.getMaxItemUseDuration(var1));
            }

            return var1;
        }
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    @Override
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        int var6 = this.getMaxItemUseDuration(var1) - var4;
        float var7 = var6 / 20.0F;
        var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

        if (var7 < 0.1D)
            return;

        boolean var8 = false;

        if (var7 > 1.0F)
        {
            if (var7 > 9.0F)
            {
                var8 = true;
            }

            var7 = 1.0F;
        }

        EntityArrow var9 = new EntityArrow(var2, var3, var7 * 2.0F);

        int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, var1);

        if (var10 > 0)
        {
            var9.setDamage(var9.getDamage() + var10 * 0.5D + 0.5D);
        }

        int var11 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, var1);

        if (var11 > 0)
        {
            var9.setKnockbackStrength(var11);
        }

        if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, var1) > 0)
        {
            var9.setFire(100);
        }

        var1.damageItem(1, var3);
        var2.playSoundAtEntity(var3, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

        if (!var2.isRemote)
        {
            var2.spawnEntityInWorld(var9);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    private Icon[] Texture = new Icon[4];
    @Override
    public void registerIcons(IconRegister iconRegister)

    {

        itemIcon = iconRegister.registerIcon("DivineRPG:" + this.getUnlocalizedName().substring(5) + "_0");
        for (int N = 0; N < 4; N++)

        {
            this.Texture[N] = iconRegister.registerIcon("DivineRPG:" + this.getUnlocalizedName().substring(5) + "_" + N);
        }
    }
    @Override
    public Icon getIcon(ItemStack stack, int renderPass, EntityPlayer player, ItemStack usingItem, int useRemaining)
    {

        if(player.getItemInUse() == null) return this.itemIcon;

        int Pulling = stack.getMaxItemUseDuration() - useRemaining;

        if (Pulling >= 18)
            return Texture[3];
        else if (Pulling > 13)
            return Texture[2];
        else if (Pulling > 0)
            return Texture[1];	   
        return Texture[0];
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
