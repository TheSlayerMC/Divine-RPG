package net.divinerpg.block.overworld;

import java.util.Random;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.BlockDivineRPGContainer;
import net.divinerpg.overworld.block.tileentity.TileEntitySuperEnchantmentTable;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockSuperEnchantmentTable extends BlockDivineRPGContainer
{
    public BlockSuperEnchantmentTable(int par1)
    {
        super(par1, Material.rock);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
        this.setLightOpacity(0);
        this.setCreativeTab(DivineRPG.Blocks);
        this.registerTexture("SuperEnchantmentTable_Side", "SuperEnchantmentTable_Top", "SuperEnchantmentTable_Bottom");
    }
 
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.randomDisplayTick(par1World, par2, par3, par4, par5Random);

        for (int var6 = par2 - 2; var6 <= par2 + 2; ++var6)
        {
            for (int var7 = par4 - 2; var7 <= par4 + 2; ++var7)
            {
                if (var6 > par2 - 2 && var6 < par2 + 2 && var7 == par4 - 1)
                {
                    var7 = par4 + 2;
                }

                if (par5Random.nextInt(16) == 0)
                {
                    for (int var8 = par3; var8 <= par3 + 1; ++var8)
                    {
                        par1World.spawnParticle("enchantmenttable", (double)par2 + 0.5D, (double)par3 + 2.0D, (double)par4 + 0.5D, (double)((float)(var6 - par2) + par5Random.nextFloat()) - 0.5D, (double)((float)(var8 - par3) - par5Random.nextFloat() - 1.0F), (double)((float)(var7 - par4) + par5Random.nextFloat()) - 0.5D);
                    }
                }
            }
        }
    }
 
    public boolean isOpaqueCube()
    {
        return false;
    }
 
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntitySuperEnchantmentTable();
    }
 
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int i, float a, float b, float c){
        TileEntity chest = world.getBlockTileEntity(x, y, z);

        if(chest == null || player.isSneaking())
            return false;

        player.openGui(DivineRPG.instance, 0, world, x, y, z);

        return true;
    }
}
