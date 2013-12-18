package net.divinerpg.item.overworld;

import java.util.List;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityBowCannon;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemGhastCannon extends ItemsBase
{
    private int damage;
    private int reloadtick;
    private int reloadmax;
    private int clipid;
    private int firetick;
    private int firemax;
    private String firesound;
    private String reloadsound;

    public ItemGhastCannon(int var1, int var2, int var4, int var5, String var6, String var7)
    {
        super(var1);
        this.damage = var2;
        this.firemax = var5;
        this.firetick = this.firemax;
        this.reloadmax = 5;
        this.reloadtick = 0;
        this.clipid = var4;
        this.firesound = var6;
        this.reloadsound = var7;
        this.setMaxStackSize(1);
        this.setMaxDamage(1000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        if (!var2.isRemote && var3.inventory.hasItem(this.clipid) || var3.capabilities.isCreativeMode)
        {
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                var2.spawnEntityInWorld(new EntityBowCannon(var2, var3));
                var2.playSoundAtEntity(var3, Sound.GhastCannon, 1.0F, 1.0F);
                var3.inventory.consumeInventoryItem(Item.ghastTear.itemID);
                var1.damageItem(1, var3);
                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }

            if (this.firemax == 0 && var3.inventory.hasItem(this.clipid))
            {
                var2.spawnEntityInWorld(new EntityBowCannon(var2, var3));
                var2.playSoundAtEntity(var3, this.firesound, 1.0F, 1.0F);
                var1.damageItem(1, var3);
            }
        }
        else if (!var2.isRemote && var3.inventory.hasItem(this.clipid))
        {
            if (this.reloadtick == this.reloadmax)
            {
                this.reloadtick = 0;
                var2.playSoundAtEntity(var3, this.reloadsound, 1.0F, 1.0F);
                var3.inventory.consumeInventoryItem(this.clipid);
            }
            else
            {
                ++this.reloadtick;
            }
        }

        return var1;
    }

    /**
     * called when the player releases the use item button. Args: itemstack, world, entityplayer, itemInUseCount
     */
    public void onPlayerStoppedUsing(ItemStack var1, World var2, EntityPlayer var3, int var4)
    {
        this.firetick = this.firemax;
    }
   
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("19 Ranged Damage");
        par3List.add("Ammo: Ghast Tear");
        par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
    }
}
