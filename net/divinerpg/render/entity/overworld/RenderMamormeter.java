package net.divinerpg.render.entity.overworld;

import net.divinerpg.overworld.mobs.EntityKingOfScorchers;
import net.divinerpg.render.entity.RenderLivingCreature;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderMamormeter extends RenderLivingCreature
{
    private float scale;

    public RenderMamormeter(ModelBase var1, float var2, float var3, ResourceLocation texture)
    {
        super(var1, var2, texture);
        this.scale = var3;
    }

    public void func_48421_a(EntityKingOfScorchers var1, double var2, double var4, double var6, float var8, float var9)
    {
        BossStatus.setBossStatus(var1, true);
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }
    
    public void doRender(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a((EntityKingOfScorchers)var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityKingOfScorchers var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.func_48421_a(var1, var2, var4, var6, var8, var9);
    }
    
    protected void preRenderScale(EntityKingOfScorchers var1, float var2)
    {
        GL11.glScalef(this.scale, this.scale, this.scale);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase var1, float var2)
    {
        this.preRenderScale((EntityKingOfScorchers)var1, var2);
    }
    
    public void renderCow(EntityKingOfScorchers var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderCow((EntityKingOfScorchers)var1, var2, var4, var6, var8, var9);
    }
}