package net.divinerpg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.divinerpg.lib.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ModLog extends BlockBase{
	
    public ModLog(int blockID, String par2) {
        super(blockID, Material.wood);
        setStepSound(soundWoodFootstep);
        setUnlocalizedName(par2);
        this.registerTexture(par2 + "Log_Side", par2 + "Log_Top", par2 + "Log_Top");
    }

    @Override
    public boolean isWood(World world, int x, int y, int z) {
    	return true;
    }
    
    @Override
    public boolean canSustainLeaves(World world, int x, int y, int z) {
    	return true;
    }
}
