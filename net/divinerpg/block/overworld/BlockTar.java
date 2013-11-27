package net.divinerpg.block.overworld;

import net.divinerpg.DivineRPG;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.BlockFluidClassic;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTar extends BlockFluidClassic{

    public Icon[] theTarIcon;
	
	public BlockTar(int id) {
		super(id, DivineRPG.TarFluid, Material.lava);
		DivineRPG.TarFluid.setBlockID(id);
	}
	
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 != 0 && par1 != 1 ? this.theTarIcon[1] : this.theTarIcon[0];
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if (this.blockMaterial == Material.lava)
        {
            this.theTarIcon = new Icon[] {par1IconRegister.registerIcon("DivineRPG:Tar_Flowing"), par1IconRegister.registerIcon("DivineRPG:Tar_Flowing")};
        }
    }

}
