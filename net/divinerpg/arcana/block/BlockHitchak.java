package net.divinerpg.arcana.block;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.helper.base.BlockDivineRPGFlower;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockHitchak extends BlockDivineRPGFlower
{
	public Icon[] iconArray;
	
	public BlockHitchak(int par1)
	{
		super(par1);
		this.setTickRandomly(true);
		float var3 = 0.5F;
		this.setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 0.25F, 0.5F + var3);
		this.setCreativeTab((CreativeTabs)null);
		this.setHardness(0.0F);
		this.setStepSound(soundGrassFootstep);
		this.disableStats();
	}

	protected boolean canThisPlantGrowOnThisBlockID(int par1)
	{
		return par1 == ArcanaBlockHelper.arcaniteGrass.blockID;
	}

	public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		super.updateTick(par1World, par2, par3, par4, par5Random);

		if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
		{
			int var6 = par1World.getBlockMetadata(par2, par3, par4);

			if (var6 < 3)
			{
				float var7 = this.getGrowthRate(par1World, par2, par3, par4);

				if (par5Random.nextInt((int)(25.0F / var7) + 1) == 0)
				{
					++var6;
					par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 2);
				}
			}
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

	private float getGrowthRate(World par1World, int par2, int par3, int par4)
	{
		float var5 = 1.0F;
		int var6 = par1World.getBlockId(par2, par3, par4 - 1);
		int var7 = par1World.getBlockId(par2, par3, par4 + 1);
		int var8 = par1World.getBlockId(par2 - 1, par3, par4);
		int var9 = par1World.getBlockId(par2 + 1, par3, par4);
		int var10 = par1World.getBlockId(par2 - 1, par3, par4 - 1);
		int var11 = par1World.getBlockId(par2 + 1, par3, par4 - 1);
		int var12 = par1World.getBlockId(par2 + 1, par3, par4 + 1);
		int var13 = par1World.getBlockId(par2 - 1, par3, par4 + 1);
		boolean var14 = var8 == this.blockID || var9 == this.blockID;
		boolean var15 = var6 == this.blockID || var7 == this.blockID;
		boolean var16 = var10 == this.blockID || var11 == this.blockID || var12 == this.blockID || var13 == this.blockID;

		for (int var17 = par2 - 1; var17 <= par2 + 1; ++var17)
		{
			for (int var18 = par4 - 1; var18 <= par4 + 1; ++var18)
			{
				int var19 = par1World.getBlockId(var17, par3 - 1, var18);
				float var20 = 0.0F;

				if (blocksList[var19] != null && blocksList[var19].canSustainPlant(par1World, var17, par3 - 1, var18, ForgeDirection.UP, this))
				{
					var20 = 0.0F;

					if (blocksList[var19].isFertile(par1World, var17, par3 - 1, var18))
					{
						var20 = 3.0F;
					}
				}

				if (var17 != par2 || var18 != par4)
				{
					var20 /= 4.0F;
				}

				var5 += var20;
			}
		}

		if (var16 || var14 && var15)
		{
			var5 /= 2.0F;
		}

		return var5;
	}

	public int getRenderType()
	{
		return 6;
	}

	protected int getSeedItem()
	{
		return ArcanaItemHelper.hitchakSeeds.itemID;
	}

	protected int getCropItem()
	{
		return ArcanaItemHelper.hitchakItem.itemID;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
	{
		super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, 0);
	}

	@Override
	public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

		if (metadata >= 3)
		{
			ret.add(new ItemStack(this.getSeedItem(), 1, 0));
		}

		return ret;
	}

	public int idDropped(int par1, Random par2Random, int par3)
	{
		return par1 == 3 ? this.getCropItem() : this.getSeedItem();
	}

	public int quantityDropped(Random par1Random)
	{
		return 1;
	}

	@SideOnly(Side.CLIENT)
	public int idPicked(World par1World, int par2, int par3, int par4)
	{
		return this.getSeedItem();
	}

	@Override
	public EnumPlantType getPlantType(World world, int x, int y, int z) 
	{
		return EnumPlantType.Crop;
	}

	@Override
	public int getPlantID(World world, int x, int y, int z) 
	{
		return blockID;
	}

	@Override
	public int getPlantMetadata(World world, int x, int y, int z) 
	{
		return world.getBlockMetadata(x, y, z);
	}
	
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        if (par2 < 0 || par2 > 4)
        {
            par2 = 4;
        }

        return this.iconArray[par2];
    }

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.iconArray = new Icon[4];

		for (int i = 0; i < this.iconArray.length; ++i)
		{
			this.iconArray[i] = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + "Hitchak_" + i);
		}
	}
}
