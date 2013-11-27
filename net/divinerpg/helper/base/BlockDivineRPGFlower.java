package net.divinerpg.helper.base;

import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockDivineRPGFlower extends BlockFlower
{

	public String name;
	
    public BlockDivineRPGFlower(int id) {
        super(id, Material.plants);
    }

    public BlockDivineRPGFlower registerTexture(String texture){
    	name = texture;
    	return this;
    }
    
    @Override
    public void registerIcons(IconRegister icon) {
    	blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + name);
    }
    
}
