package net.divinerpg.render.entity;

import net.divinerpg.lib.ResourceLocs;
import net.divinerpg.overworld.block.tileentity.TileEntityExtractor;
import net.divinerpg.render.entity.model.ModelExtractor;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderExtractor extends TileEntitySpecialRenderer
{
    static final float scale = (float)(1.0 / 16.0);
    private ModelExtractor modelAltar;
    private static final ResourceLocation texture = ResourceLocs.BLOCK_EXTRACTOR;
    public RenderExtractor()
    {
        modelAltar = new ModelExtractor(scale);
    }
    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityExtractor)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityExtractor tileentity1, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslated((float)x + 0.5F, (float)y, (float)z + 0.5F);
        this.bindTexture(texture);
        GL11.glPushMatrix();
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
