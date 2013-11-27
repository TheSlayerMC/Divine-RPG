package net.divinerpg.block.model;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

	public class TileDivineAltar extends TileEntity {
		
	    public ResourceLocation texture;
	    public ModelDivineBlock model;
	    
	    public TileDivineAltar() {
	        
	    }

	    public TileDivineAltar(ResourceLocation texture, ModelDivineBlock model) {
	        this.model = model;
	        this.texture = texture;
	    }
	
}
