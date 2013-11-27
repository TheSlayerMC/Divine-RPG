package net.divinerpg.render.entity;

import net.divinerpg.twilight.mobs.EntityKarot;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderKarot extends RenderLivingCreature
{
    private float scale;

    public RenderKarot(ModelBase var1, float var2, float var3, ResourceLocation textureLoc )
    {
        super(var1, var2 * var3, textureLoc);
        this.scale = var3;
    }

    public void func_48421_a(EntityKarot var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.setBossStatus(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    @Override
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityKarot)var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityKarot var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a(var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityKarot var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityKarot)var1, var2);
    }
}
