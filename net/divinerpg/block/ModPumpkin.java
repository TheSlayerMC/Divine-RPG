package net.divinerpg.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModPumpkin extends BlockDirectional
{
    protected Icon tileSide;
    protected Icon tileTop;
    protected Icon tileFront;
    protected String tileTopName;
    protected String tileSideName;
    protected String tileFrontName;
    protected String BlockName;

    public ModPumpkin(int par1)
    {
        super(par1, Material.pumpkin);
        this.setTickRandomly(true);
        this.setCreativeTab(DivineRPG.Blocks);
        this.setStepSound(soundWoodFootstep);
        setHardness(1.0F);
    }
    
    public Block registerPumpkinTexture(String Block) {
        BlockName = Block;
        return this;
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.tileTop : (par1 == 0 ? this.tileTop : (par2 == 2 && par1 == 2 ? this.tileFront : (par2 == 3 && par1 == 5 ? this.tileFront : (par2 == 0 && par1 == 3 ? this.tileFront : (par2 == 1 && par1 == 4 ? this.tileFront : this.tileSide)))));
    }
    
    public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
    {
        int l = par1World.getBlockId(par2, par3, par4);
        Block block = Block.blocksList[l];
        return (block == null || block.isBlockReplaceable(par1World, par2, par3, par4)) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
    }

    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
    	this.tileFront = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.BlockName + "Pumpkin_Front");
        this.tileTop = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.BlockName + "Pumpkin_Top");
        this.tileSide = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.BlockName + "Pumpkin_Side");
    }
}
