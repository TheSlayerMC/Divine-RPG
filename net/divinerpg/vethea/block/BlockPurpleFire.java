package net.divinerpg.vethea.block;

import net.divinerpg.lib.Reference;
import net.minecraft.block.BlockFire;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockPurpleFire extends BlockFire
{
    public BlockPurpleFire(int par1) 
    {
        super(par1);
        this.setTickRandomly(false);
    }
    
    @Override
    public void registerIcons(IconRegister icon) {
    	blockIcon = icon.registerIcon(Reference.MOD_ID + ":" + "PurpleFire");
    }
}
