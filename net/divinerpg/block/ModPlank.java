package net.divinerpg.block;

import net.minecraft.block.material.Material;

public class ModPlank extends BlockBase{

    public ModPlank(int blockID, String Texture) {
        super(blockID, Material.wood);
        this.registerTexture(Texture + "Plank");
    }

}
