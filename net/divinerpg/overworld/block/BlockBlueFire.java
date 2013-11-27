package net.divinerpg.overworld.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlueFire extends BlockBase
{

	private int[] chanceToEncourageFire = new int[256];
	private int[] abilityToCatchFire = new int[256];
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;

	public BlockBlueFire(int par1)
	{
		super(par1, Material.fire);
		setTickRandomly(true);
		setCreativeTab(null);
	}
	@Override
	public Icon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}

	private void setBurnRate(int par1, int par2, int par3)
	{
		Block.setBurnProperties(par1, par2, par3);
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
	{
		return null;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int quantityDropped(Random par1Random)
	{
		return 0;
	}

	@Override
	public int tickRate(World par1World)
	{
		return 30;
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random rand)
	{
		if (world.getGameRules().getGameRuleBooleanValue("doFireTick"))
		{
			Block base = Block.blocksList[world.getBlockId(x, y - 1, z)];
			boolean flag = (base != null) && (base.isFireSource(world, x, y - 1, z, world.getBlockMetadata(x, y - 1, z), ForgeDirection.UP));
			if (!canPlaceBlockAt(world, x, y, z))
			{
				world.setBlockToAir(x, y, z);
			}
			if ((!flag) && (world.isRaining()) && ((world.canLightningStrikeAt(x, y, z)) || (world.canLightningStrikeAt(x - 1, y, z)) || (world.canLightningStrikeAt(x + 1, y, z)) || (world.canLightningStrikeAt(x, y, z - 1)) || (world.canLightningStrikeAt(x, y, z + 1))))
			{
				world.setBlockToAir(x, y, z);
			}
			else
			{
				int l = world.getBlockMetadata(x, y, z);
				if (l < 15)
				{
					world.setBlockMetadataWithNotify(x, y, z, l + rand.nextInt(3) / 2, 4);
				}
				world.scheduleBlockUpdate(x, y, z, this.blockID, tickRate(world) + rand.nextInt(10));
				if ((!flag) && (!canNeighborBurn(world, x, y, z)))
				{
					if ((!world.doesBlockHaveSolidTopSurface(x, y - 1, z)) || (l > 3))
					{
						world.setBlockToAir(x, y, z);
					}
				}
				else if ((!flag) && (!canBlockCatchFire(world, x, y - 1, z, ForgeDirection.UP)) && (l == 15) && (rand.nextInt(4) == 0))
				{
					world.setBlockToAir(x, y, z);
				}
				else
				{
					boolean flag1 = world.isBlockHighHumidity(x, y, z);
					byte b0 = 0;
					if (flag1)
					{
						b0 = -50;
					}
					tryToCatchBlockOnFire(world, x + 1, y, z, 300 + b0, rand, l, ForgeDirection.WEST);
					tryToCatchBlockOnFire(world, x - 1, y, z, 300 + b0, rand, l, ForgeDirection.EAST);
					tryToCatchBlockOnFire(world, x, y - 1, z, 250 + b0, rand, l, ForgeDirection.UP);
					tryToCatchBlockOnFire(world, x, y + 1, z, 250 + b0, rand, l, ForgeDirection.DOWN);
					tryToCatchBlockOnFire(world, x, y, z - 1, 300 + b0, rand, l, ForgeDirection.SOUTH);
					tryToCatchBlockOnFire(world, x, y, z + 1, 300 + b0, rand, l, ForgeDirection.NORTH);
					for (int i1 = x - 1; i1 <= x + 1; i1++)
					{
						for (int j1 = z - 1; j1 <= z + 1; j1++)
						{
							for (int k1 = y - 1; k1 <= y + 4; k1++)
							{
								if ((i1 != x) || (k1 != y) || (j1 != z))
								{
									int l1 = 100;
									if (k1 > y + 1)
									{
										l1 += (k1 - (y + 1)) * 100;
									}
									int i2 = getChanceOfNeighborsEncouragingFire(world, i1, k1, j1);
									if (i2 > 0)
									{
										int j2 = (i2 + 40 + world.difficultySetting * 7) / (l + 30);
										if (flag1)
										{
											j2 /= 2;
										}
										if ((j2 > 0) && (rand.nextInt(l1) <= j2) && ((!world.isRaining()) || (!world.canLightningStrikeAt(i1, k1, j1))) && (!world.canLightningStrikeAt(i1 - 1, k1, z)) && (!world.canLightningStrikeAt(i1 + 1, k1, j1)) && (!world.canLightningStrikeAt(i1, k1, j1 - 1)) && (!world.canLightningStrikeAt(i1, k1, j1 + 1)))
										{
											int k2 = l + rand.nextInt(5) / 4;
											if (k2 > 15)
											{
												k2 = 15;
											}
											world.setBlock(i1, k1, j1, this.blockID, k2, 3);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public boolean func_82506_l() {
		return true;
	}

	@Deprecated
	private void tryToCatchBlockOnFire(World par1World, int par2, int par3, int par4, int par5, Random par6Random, int par7) {
		tryToCatchBlockOnFire(par1World, par2, par3, par4, par5, par6Random, par7, ForgeDirection.UP);
	}

	private void tryToCatchBlockOnFire(World par1World, int par2, int par3, int par4, int par5, Random par6Random, int par7, ForgeDirection face) {
		int j1 = 0;
		Block block = Block.blocksList[par1World.getBlockId(par2, par3, par4)];
		if (block != null)
		{
			j1 = block.getFlammability(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), face);
		}

		if (par6Random.nextInt(par5) < j1)
		{

			boolean flag = par1World.getBlockId(par2, par3, par4) == Block.tnt.blockID;
			if ((par6Random.nextInt(par7 + 10) < 5) && (!par1World.canLightningStrikeAt(par2, par3, par4)))
			{

				int k1 = par7 + par6Random.nextInt(5) / 4;
				if (k1 > 15)
				{
					k1 = 15;
				}

				par1World.setBlock(par2, par3, par4, this.blockID, k1, 3);
			}
			else
			{

				par1World.setBlockToAir(par2, par3, par4);
			}
			if (flag)
			{
				Block.tnt.onBlockDestroyedByPlayer(par1World, par2, par3, par4, 1);
			}
		}
	}

	private boolean canNeighborBurn(World par1World, int par2, int par3, int par4)
	{

		return (canBlockCatchFire(par1World, par2 + 1, par3, par4, ForgeDirection.WEST)) ||
				(canBlockCatchFire(par1World, par2 - 1, par3, par4, ForgeDirection.EAST)) ||
				(canBlockCatchFire(par1World, par2, par3 - 1, par4, ForgeDirection.UP)) ||
				(canBlockCatchFire(par1World, par2, par3 + 1, par4, ForgeDirection.DOWN)) ||
				(canBlockCatchFire(par1World, par2, par3, par4 - 1, ForgeDirection.SOUTH)) ||
				(canBlockCatchFire(par1World, par2, par3, par4 + 1, ForgeDirection.NORTH));
	}

	private int getChanceOfNeighborsEncouragingFire(World par1World, int par2, int par3, int par4)
	{
		byte b0 = 0;
		if (!par1World.isAirBlock(par2, par3, par4))
			return 0;
		int l = getChanceToEncourageFire(par1World, par2 + 1, par3, par4, b0, ForgeDirection.WEST);
		l = getChanceToEncourageFire(par1World, par2 - 1, par3, par4, l, ForgeDirection.EAST);
		l = getChanceToEncourageFire(par1World, par2, par3 - 1, par4, l, ForgeDirection.UP);
		l = getChanceToEncourageFire(par1World, par2, par3 + 1, par4, l, ForgeDirection.DOWN);
		l = getChanceToEncourageFire(par1World, par2, par3, par4 - 1, l, ForgeDirection.SOUTH);
		l = getChanceToEncourageFire(par1World, par2, par3, par4 + 1, l, ForgeDirection.NORTH);
		return l;
	}

	@Override
	public boolean isCollidable()
	{
		return false;
	}

	public boolean canBlockCatchFire(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		return canBlockCatchFire(par1IBlockAccess, par2, par3, par4, ForgeDirection.UP);
	}

	public int getChanceToEncourageFire(World par1World, int par2, int par3, int par4, int par5)
	{
		return getChanceToEncourageFire(par1World, par2, par3, par4, par5, ForgeDirection.UP);
	}
	@Override
	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		return (par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4)) || (canNeighborBurn(par1World, par2, par3, par4));
	}	
	@Override
	public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
	{

		if ((!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4)) && (!canNeighborBurn(par1World, par2, par3, par4)))
		{
			par1World.setBlockToAir(par2, par3, par4);
		}	
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z)
	{
		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != OverworldBlockHelper.divineRock.blockID || !TwilightBlockHelper.DravitePortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}

		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != TwilightBlockHelper.draviteBlock.blockID || !TwilightBlockHelper.AzuritePortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}

		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != TwilightBlockHelper.azuriteBlock.blockID || !TwilightBlockHelper.UvitePortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}

		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != TwilightBlockHelper.uviteBlock.blockID || !TwilightBlockHelper.MythrilPortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}

		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != TwilightBlockHelper.mythrilBlock.blockID || !TwilightBlockHelper.AugitePortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}
		
		// Iceika
		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != Block.blockSnow.blockID || !IceikaBlockHelper.IceikaPortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}

		if (world.provider.dimensionId > 0 || world.getBlockId(x, y - 1, z) != Block.netherrack.blockID || !OverworldBlockHelper.AntiNetherPortal.tryToCreatePortal(world, x, y, z))
		{
			if (!world.doesBlockHaveSolidTopSurface(x, y - 1, z))
			{
				world.setBlock(x, y, z, 0);
			}
			else
			{
				world.scheduleBlockUpdate(x, y, z, this.blockID, this.tickRate(world) + world.rand.nextInt(10));
			}
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
	{
		if (par5Random.nextInt(24) == 0)
		{

			par1World.playSound(par2 + 0.5F, par3 + 0.5F, par4 + 0.5F, "fire.fire", 1.0F + par5Random.nextFloat(), par5Random.nextFloat() * 0.7F + 0.3F, false);
		}
		if ((!par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4)) && (!OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2, par3 - 1, par4, ForgeDirection.UP)))
		{
			if (OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2 - 1, par3, par4, ForgeDirection.EAST))
			{
				for (int l = 0; l < 2; l++)
				{
					float f = par2 + par5Random.nextFloat() * 0.1F;
					float f1 = par3 + par5Random.nextFloat();
					float f2 = par4 + par5Random.nextFloat();
					par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
				}
			}	

			if (OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2 + 1, par3, par4, ForgeDirection.WEST)){

				for (int l = 0; l < 2; l++){

					float f = par2 + 1 - par5Random.nextFloat() * 0.1F;
					float f1 = par3 + par5Random.nextFloat();
					float f2 = par4 + par5Random.nextFloat();
					par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
				}
			}

			if (OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2, par3, par4 - 1, ForgeDirection.SOUTH)){

				for (int l = 0; l < 2; l++){

					float f = par2 + par5Random.nextFloat();
					float f1 = par3 + par5Random.nextFloat();
					float f2 = par4 + par5Random.nextFloat() * 0.1F;
					par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
				}
			}

			if (OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2, par3, par4 + 1, ForgeDirection.NORTH))
			{
				for (int l = 0; l < 2; l++)
				{
					float f = par2 + par5Random.nextFloat();
					float f1 = par3 + par5Random.nextFloat();
					float f2 = par4 + 1 - par5Random.nextFloat() * 0.1F;
					par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
				}
			}

			if (OverworldBlockHelper.bluefire.canBlockCatchFire(par1World, par2, par3 + 1, par4, ForgeDirection.DOWN))
			{
				for (int l = 0; l < 2; l++)
				{
					float f = par2 + par5Random.nextFloat();
					float f1 = par3 + 1 - par5Random.nextFloat() * 0.1F;
					float f2 = par4 + par5Random.nextFloat();
					par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
				}
			}
		}
		else
		{
			for (int l = 0; l < 3; l++)
			{
				float f = par2 + par5Random.nextFloat();
				float f1 = par3 + par5Random.nextFloat() * 0.5F + 0.5F;
				float f2 = par4 + par5Random.nextFloat();
				par1World.spawnParticle("largesmoke", f, f1, f2, 0.0D, 0.0D, 0.0D);
			}
		}
	}


	public boolean canBlockCatchFire(IBlockAccess world, int x, int y, int z, ForgeDirection face)
	{
		Block block = Block.blocksList[world.getBlockId(x, y, z)];
		if (block != null)
			return block.isFlammable(world, x, y, z, world.getBlockMetadata(x, y, z), face);

		return false;
	}	

	public int getChanceToEncourageFire(World world, int x, int y, int z, int oldChance, ForgeDirection face)

	{

		int newChance = 0;

		Block block = Block.blocksList[world.getBlockId(x, y, z)];
		if (block != null)
		{

			newChance = block.getFireSpreadSpeed(world, x, y, z, world.getBlockMetadata(x, y, z), face);
		}
		return newChance > oldChance ? newChance : oldChance;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.iconArray = new Icon[] { par1IconRegister.registerIcon("fire_0"), par1IconRegister.registerIcon("fire_1") };
		this.blockIcon = par1IconRegister.registerIcon("fire_0");
	}


	@SideOnly(Side.CLIENT)
	public Icon getBlockTextureFromSideAndMetadata(int par1, int par2)
	{
		return this.iconArray[0];
	} 
}
