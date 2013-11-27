package net.divinerpg.overworld.block.tileentity;

import net.divinerpg.block.model.ModelDivineBlock;
import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityStatue extends TileEntity {
	
    public ResourceLocation texture;
    public ModelDivineBlock model;
    
    public TileEntityStatue() {
        
    }

    public TileEntityStatue(ResourceLocation texture, ModelDivineBlock model) {
        this.model = model;
        this.texture = texture;
    }
    
    
    
}
