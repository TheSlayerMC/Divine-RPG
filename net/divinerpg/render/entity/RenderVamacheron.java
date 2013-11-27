package net.divinerpg.render.entity;

import net.divinerpg.twilight.mobs.EntityVamacheron;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderVamacheron extends RenderLivingCreature
{
    private float scale;

    public RenderVamacheron(ModelBase var1, float var2, float var3, ResourceLocation textureLoc)
    {
        super(var1, var2 * var3, textureLoc);
        this.scale = var3;
    }

    public void renderCow(EntityVamacheron var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.setBossStatus(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    @Override
    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityVamacheron)var1, var2, var4, var6, var8, var9);
    }

    protected void preRenderScale(EntityVamacheron var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    protected void preRenderCallback(EntityLiving var1, float var2)
    {
        this.preRenderScale((EntityVamacheron)var1, var2);
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
        this.renderCow((EntityVamacheron)var1, var2, var4, var6, var8, var9);
    }
}
