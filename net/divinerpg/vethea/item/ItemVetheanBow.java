package net.divinerpg.vethea.item;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityVetheanArrow;
import net.divinerpg.mob.entity.item.EntityVetheanArrow2;
import net.divinerpg.mob.entity.item.EntityVetheanWarArrow;
import net.divinerpg.mob.entity.item.EntityVetheanWrathArrow;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVetheanBow extends ItemBow
{

    private double damageModifier;
    private Item arrow;
    private int lastDamage = -1;
    private String name;
    public final String[] texture;
    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    public ItemVetheanBow(int par1, double par2, Item par3, String par4, boolean unbreakable, int maxDamage, int damage) {
        super(par1);
        this.damageModifier = par2;
        this.arrow = par3;
        this.setMaxDamage(-1);
        this.setUnlocalizedName(par4);
        this.name = par4;
        this.setCreativeTab(DivineRPG.Projectile);
        texture = new String[] {name + "_0", name + "_1", name + "_2"};
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    @Override
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4)
    {
        int var6 = this.getMaxItemUseDuration(par1ItemStack) - par4;

        ArrowLooseEvent event = new ArrowLooseEvent(par3EntityPlayer, par1ItemStack, var6);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return;
        var6 = event.charge;

        boolean var5 = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, par1ItemStack) > 0;

        if (var5 || par3EntityPlayer.inventory.hasItem(this.arrow.itemID))
        {
            float var7 = var6 / 20.0F;
            var7 = (var7 * var7 + var7 * 2.0F) / 3.0F;

            if (var7 < 0.1D)
                return;

            if (var7 > 1.0F)
            {
                var7 = 1.0F;
            }
            par2World.playSoundAtEntity(par3EntityPlayer, Sound.VetheaBow, 1.0F, 1.0F);
            EntityArrow var8 = null;

            if (this.arrow == VetheaItemHelper.vetheanArrow)
            {
                var8 = new EntityVetheanArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanArrow2)
            {
                var8 = new EntityVetheanArrow2(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanWarArrow)
            {
                var8 = new EntityVetheanWarArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else if (this.arrow == VetheaItemHelper.vetheanWrathArrow)
            {
                var8 = new EntityVetheanWrathArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }
            else
            {
                var8 = new EntityArrow(par2World, par3EntityPlayer, var7 * 2.0F);
            }

            if (var7 == 1.0F)
            {
                var8.setIsCritical(true);
            }

            int var9 = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, par1ItemStack);

            if (var9 > 0)
            {
                var8.setDamage((var8.getDamage() + var9 * 0.5D + 0.5D) * this.damageModifier);
            }
            else
            {
                var8.setDamage(var8.getDamage() * this.damageModifier);
            }

            int var10 = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, par1ItemStack);

            if (var10 > 0)
            {
                var8.setKnockbackStrength(var10);
            }

            if (EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, par1ItemStack) > 0)
            {
                var8.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.2F) + var7 * 0.5F);

            if (var5)
            {
                var8.canBePickedUp = 2;
            }
            else
            {
                par3EntityPlayer.inventory.consumeInventoryItem(Item.arrow.itemID);
            }

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(var8);
            }
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

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        ArrowNockEvent event = new ArrowNockEvent(par3EntityPlayer, par1ItemStack);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.isCanceled())
            return event.result;

        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(this.arrow.itemID))
        {
            par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(Math.ceil(10 * this.damageModifier) + " Ranged Damage");
        par3List.add("Ammo: " + this.arrow.getItemDisplayName(new ItemStack(this.arrow)));
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
            par3List.add("Infinite Uses");
        }
        par3List.add("\u00a72Vethean");
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
}