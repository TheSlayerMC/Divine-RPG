package net.divinerpg.item;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityAnchor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
public class ItemBaseAnchor extends ItemsBase {
	private int dmg;

	public ItemBaseAnchor(int id, int damage) {
		super(id);
		this.dmg = damage;
		this.maxStackSize = 1;
		this.setCreativeTab(DivineRPG.Swords);
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(OverworldItemHelper.sharkAnchor.itemID))
        {

            var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityAnchor(var2, var3, dmg));
            return var1;
        }
        
        else if (!var4 && !var3.inventory.hasItem(OverworldItemHelper.crabAnchor.itemID))
        {
            var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityAnchor(var2, var3, dmg));
            return var1;
        }  
        
        else if (!var4 && !var3.inventory.hasItem(OverworldItemHelper.bowHeadAnchor.itemID))
        {
            var2.playSoundAtEntity(var3, Sound.Blitz, 1.0F, 1.0F);
            var2.spawnEntityInWorld(new EntityAnchor(var2, var3, dmg));
            return var1;
        }  
        return var1;
    }
	
	@Override
	public float getDamageVsEntity(Entity par1Entity, ItemStack itemStack) {
		return dmg;
	}
	
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(this.dmg + " Ranged Damage");
    }
}
