package net.divinerpg.block.model;

import net.divinerpg.block.model.ModelDemonFurnace;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.lib.Reference;
import net.divinerpg.overworld.block.tileentity.TileEntityDemonFurnace;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderDemonFurnace extends TileEntitySpecialRenderer
{
    public static ResourceLocation ON = new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/DemonFurnace_ON.png");
    public static ResourceLocation OFF = new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/DemonFurnace.png");

    static final float scale = (float)(1.0 / 16.0);
    private ModelDemonFurnace modelDemonFurnace;

    public RenderDemonFurnace()
    {
        modelDemonFurnace = new ModelDemonFurnace();
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityDemonFurnace)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityDemonFurnace te, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y + 0.5F, (float)z + 0.5F);

        if(te.isBurning()) {
            this.bindTexture(ON);
        } else {
            this.bindTexture(OFF);
        }
        GL11.glPushMatrix();
        modelDemonFurnace.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
