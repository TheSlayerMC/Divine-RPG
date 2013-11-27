package net.divinerpg.render.entity;

import net.divinerpg.mob.entity.item.EntityBouncingProjectile;
import net.divinerpg.render.entity.model.ModelBouncingProjectile;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class RenderBouncingProjectile extends Render{

	private ModelBouncingProjectile model;

	public RenderBouncingProjectile(ModelBouncingProjectile projectile){
		model = projectile;
		shadowSize = 0.2F;
		
	}

	public static final ResourceLocation texture = new ResourceLocation("divinerpg", "textures/entity/BouncingProjectileModel.png");


	public void renderBouncing(EntityBouncingProjectile projectile, double x, double y, double z, float yaw, float partialTickTime){
		GL11.glPushMatrix();

		GL11.glTranslatef((float)x, (float)y, (float)z);
		GL11.glScalef(-1F, -1F, 1F);

		bindEntityTexture(projectile);

		GL11.glPopMatrix();
	}

	@Override
	public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTickTime) {
		renderBouncing((EntityBouncingProjectile)entity, x, y, z, yaw, partialTickTime);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return texture;
	}

}