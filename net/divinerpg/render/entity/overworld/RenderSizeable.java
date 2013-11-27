package net.divinerpg.render.entity.overworld;

import org.lwjgl.opengl.GL11;

import net.divinerpg.overworld.mobs.EntityCaveclops;
import net.divinerpg.overworld.mobs.EntityKingCrab;
import net.divinerpg.render.entity.RenderLivingCreature;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.ResourceLocation;

public class RenderSizeable extends RenderLivingCreature
{
	private float scale;
	public RenderSizeable(ModelBase var1, float var2, float var3, ResourceLocation texture)
    {
        super(var1, var2, texture);
        this.scale = var3;
       }

       protected void preRenderScale(EntityMob var1, float var2)
       {
           GL11.glScalef(this.scale, this.scale, this.scale);
       }

       @Override
       protected void preRenderCallback(EntityLivingBase var1, float var2)
       {
           this.preRenderScale((EntityMob)var1, var2);
       }
       
       public void renderCow(EntityMob var1, double var2, double var4, double var6, float var8, float var9)
       {
           super.doRenderLiving(var1, var2, var4, var6, var8, var9);
       }

       public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
       {
           this.renderCow((EntityMob)var1, var2, var4, var6, var8, var9);
       }

       /**
        * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
        * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
        * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
        * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
        */
       public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
       {
           this.renderCow((EntityMob)var1, var2, var4, var6, var8, var9);
       }
   }