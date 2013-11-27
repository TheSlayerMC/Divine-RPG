package net.divinerpg.render.entity.overworld;

import net.divinerpg.overworld.mobs.EntityNetherWatcher;
import net.divinerpg.render.entity.RenderLivingCreature;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderNetherWatcher extends RenderLivingCreature
{
    private float scale;

    public RenderNetherWatcher(ModelBase var1, float var2, float var3, ResourceLocation texture)
    {
        super(var1, var2 * var3, texture);
        this.scale = var3;
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderWatcher((EntityNetherWatcher)var1, var2, var4, var6, var8, var9);
    }

    public void renderWatcher(EntityNetherWatcher var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.setBossStatus(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityNetherWatcher var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityNetherWatcher)var1, var2);
    }
    
    public void renderCow(EntityNetherWatcher var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }
}