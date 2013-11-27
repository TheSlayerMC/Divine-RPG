package net.divinerpg.arcana.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockPinfly extends BlockBase implements IPlantable
{
	public BlockPinfly(int ID)
	{
		super(ID, Material.plants);
		float size = 0.375F;
		this.setBlockBounds(0.5F - size, 0.0F, 0.5F - size, 0.5F + size, 1.0F, 0.5F + size);
		this.setTickRandomly(true);
	}

	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{}

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if(blockID == ArcanaBlockHelper.pinFly.blockID)
		{
			par1World.setBlock(par2, par3 + 1, par4, ArcanaBlockHelper.pinFly2.blockID);
		}
	}

	public void fertilize(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4) + MathHelper.getRandomIntegerInRange(par1World.rand, 2, 5);

        if (l > 7)
        {
            l = 7;
        }

        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{
		this.checkBlockCoordValid(par1World, par2, par3, par4);
	}

	protected final void checkBlockCoordValid(World par1World, int par2, int par3, int par4)
	{
		if (!this.canBlockStay(par1World, par2, par3, par4))
		{
			this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
			par1World.setBlock(par2, par3, par4, 0);
		}
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		if(blockID == ArcanaBlockHelper.pinFly2.blockID)
		{
			return ArcanaItemHelper.pinFlyItem.itemID;
		}
		return 0;
	}

    public int quantityDropped(Random par1Random)
    {
        return 3;
    }

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean renderAsNormalBlock()
	{
		return false;
	}

	public int getRenderType()
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return ArcanaItemHelper.pinFlySeeds.itemID;
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z)
	{
		return EnumPlantType.Beach;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z)
	{
		return blockID;
	}
	
	public boolean canBlockStay(World par1World, int par2, int par3, int par4)
    {
        return par1World.getBlockMaterial(par2, par3 - 1, par4).isSolid();
    }
	
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        return !super.canPlaceBlockAt(par1World, par2, par3, par4) ? false : this.canBlockStay(par1World, par2, par3, par4);
    }

	@Override
	public int getPlantMetadata(World world, int x, int y, int z)
	{
		return world.getBlockMetadata(x, y, z);
	}
}
