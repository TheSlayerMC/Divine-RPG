package net.divinerpg.overworld.block;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Netherite extends BlockBase{

    public Netherite(int blockID) {
        super(blockID, Material.rock);
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return this.blockID;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
    }

    @Override
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        var5.attackEntityFrom(DamageSource.cactus, 1);
    }

    @Override
    public int damageDropped(int var1)
    {
        return var1;
    }

    @Override
    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
