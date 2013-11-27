package net.divinerpg.arcana.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHeatTraps extends BlockBase
{
    public BlockHeatTraps(int var1)
    {
        super(var1, Material.sand);
    }

    /**
     * How many world ticks before ticking
     */
    @Override
    public int tickRate(World par1)
    {
        return 30;
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1 - var5, var4 + 1 - var5);
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World var1, int var2, int var3, int var4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().getAABB(var2 + var5, var3, var4 + var5, var2 + 1 - var5, var3 + 1, var4 + 1 - var5);
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (this.blockID == ArcanaBlockHelper.heatTrapsOn.blockID)
        {
            par1World.setBlock(par2, par3, par4, ArcanaBlockHelper.heatTraps.blockID);
        }
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void onEntityCollidedWithBlock(World var1, int var2, int var3, int var4, Entity var5)
    {
        if (this.blockID == ArcanaBlockHelper.heatTraps.blockID)
        {
            var1.setBlock(var2, var3, var4, ArcanaBlockHelper.heatTrapsOn.blockID);
        }

        if (this.blockID == ArcanaBlockHelper.heatTrapsOn.blockID && var5 instanceof EntityPlayerMP)
        {
            var5.attackEntityFrom(DamageSource.cactus, 16);
            var5.setFire(15);
            //((EntityPlayerMP)var5).addStat(AchievementPageDivineRPG.hoterthanHell, 1);
        }
    }
}
