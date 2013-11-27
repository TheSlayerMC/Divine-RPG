package net.divinerpg.item.tool;

import java.util.List;

import net.divinerpg.item.IItemDivineRPG;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ToolSword extends SwordBase{
    boolean unbreakable;
    float dmg;

    public ToolSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        this(par1, par2EnumToolMaterial, false);
    }

    public ToolSword(int par1, EnumToolMaterial enumToolMaterial, boolean unbreakable) {
        super(par1 - 256, enumToolMaterial);
        this.unbreakable = unbreakable;
        dmg = enumToolMaterial.getDamageVsEntity();
    }

    public ToolSword(int par1, int img, EnumToolMaterial par2EnumToolMaterial, boolean unbreakable) {
        super(par1 - 256, par2EnumToolMaterial);
        this.unbreakable = unbreakable;
        dmg = par2EnumToolMaterial.getDamageVsEntity();

    }

    @Override
    public Icon getIconFromDamageForRenderPass(int par1, int par2) {
        return getIconFromDamage(par1);
    }


    @Override
    public boolean hitEntity(ItemStack item,
            EntityLivingBase entity1,
            EntityLivingBase entity2) {
        if(!unbreakable) {
            item.damageItem(1, entity2);
        }

        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world, int blockID, int x, int y, int z, EntityLivingBase entity) {
        if (!unbreakable && Block.blocksList[blockID].getBlockHardness(world, x, y, z) != 0.0D) {
            item.damageItem(2, entity);
        }

        return true;

    }

    @Override
    public boolean isItemTool(ItemStack par1ItemStack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        //  par3List.add(par1ItemStack.getDamageVsEntity(par2EntityPlayer) + " Melee Damage");    TODO: Replace this with the updated hook once it's made. 
        par3List.add(!unbreakable ? (par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }
}
