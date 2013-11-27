package net.divinerpg.render.entity.overworld;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderDivineMob extends RenderLiving
{
    float scale;
    ResourceLocation texture;
    
	public RenderDivineMob(ModelBase model, float shadowSize, float scale, ResourceLocation loc)
    {
        super(model, shadowSize);
        texture = loc;
        this.scale = scale;
    }

	public RenderDivineMob(ModelBase model, float shadowSize, ResourceLocation loc)
    {
        super(model, shadowSize);
        texture = loc;
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return texture;
    }
}