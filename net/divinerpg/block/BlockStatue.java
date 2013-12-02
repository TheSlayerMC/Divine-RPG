package net.divinerpg.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divinerpg.DivineRPG;
import net.divinerpg.block.model.ModelDivineBlock;
import net.divinerpg.overworld.block.tileentity.TileEntityStatue;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlockStatue extends Block {

    public ModelDivineBlock model;
    public ResourceLocation texture;
    
    public BlockStatue(int ID, ResourceLocation texture, ModelDivineBlock model, String Name) {
        super(ID, Material.air);
        this.setTextureName("cobblestone");
        this.texture = texture;
        this.model = model;
        this.setCreativeTab(DivineRPG.Blocks);
        setUnlocalizedName(Name);
    }

    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileEntityStatue(texture, model);
    }
    
    @Override
    public int getRenderType() {
        return -1;
    }
    
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }
    
    @Override
    public void onBlockPlacedBy(World w, int x, int y, int z,
            EntityLivingBase entity, ItemStack item) {

        int rotation = ((MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
       
        if (rotation == 3)
            rotation = 1;
        else if (rotation == 1)
            rotation = 3;
        
        w.setBlockMetadataWithNotify(x, y, z, rotation, 3);
    }
    
    
}
