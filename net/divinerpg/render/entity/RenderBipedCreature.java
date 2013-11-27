package net.divinerpg.render.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderBipedCreature extends RenderLiving
{
    protected ModelBiped ModelModBipedMain;


    ResourceLocation texture;
    public RenderBipedCreature(ModelBiped par1ModelBase, float shadowSize, ResourceLocation resourceLoc) {
        super(par1ModelBase, shadowSize);
        texture = resourceLoc;
    }
    
    @Override
	protected ResourceLocation getEntityTexture(Entity entity) {
 		return texture;
	}
}

