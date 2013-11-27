package net.divinerpg.render.entity;

import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.twilight.mobs.EntitySerenityBunny;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSerenityBunny extends RenderLivingCreature
{
    public RenderSerenityBunny(ModelBase var1, float var2, ResourceLocation textureLoc )
    {
        super(var1, var2, textureLoc);
    }

    public void renderCow(EntitySerenityBunny var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    @Override
    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntitySerenityBunny)var1, var2, var4, var6, var8, var9);
    }

    protected ResourceLocation func_110914_a(EntitySerenityBunny par1EntityBunny)
    {
        return par1EntityBunny.isTamed() ? EntityResourceLocs.BUNNY_TAMED : EntityResourceLocs.BUNNY;
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
        this.renderCow((EntitySerenityBunny)var1, var2, var4, var6, var8, var9);
    }
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.func_110914_a((EntitySerenityBunny)par1Entity);
    }
}
