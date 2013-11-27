package net.divinerpg.block.overworld;

import java.util.Random;

import net.divinerpg.helper.base.BlockDivineRPGContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;

public class BlockDivineDungenSpawner extends BlockDivineRPGContainer {


    public BlockDivineDungenSpawner(int id, String mobName) {
        super(id, Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World world) {
        return new TileEntityMobSpawner();
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return 0;
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 0;
    }

    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7) {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);
        int var8 = 15 + par1World.rand.nextInt(15) + par1World.rand.nextInt(15);
        this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public int idPicked(World par1World, int par2, int par3, int par4) {
        return this.blockID;
    }
}
