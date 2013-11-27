
package net.divinerpg.render.entity;

import net.divinerpg.overworld.block.tileentity.TileEntityDemonFurnace;
import net.divinerpg.render.entity.model.ModelDemonFurnace;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderDemonFurnace extends TileEntitySpecialRenderer
{
    public static ResourceLocation ON = new ResourceLocation("/assets/divinerpg/textures/blocks/DemonFurnaceON.png");
    public static ResourceLocation OFF = new ResourceLocation("/assets/divinerpg/textures/blocks/DemonFurnace.png");

    static final float scale = (float)(1.0 / 16.0);
    private ModelDemonFurnace modelDemonFurnace;

    public RenderDemonFurnace()
    {
        modelDemonFurnace = new ModelDemonFurnace(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDemonFurnace)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDemonFurnace tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F);

        if(tileentity1.isBurning())
        {
            this.bindTexture(ON);
        }
        else
        {
            this.bindTexture(OFF);
        }
        GL11.glPushMatrix();
        modelDemonFurnace.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
