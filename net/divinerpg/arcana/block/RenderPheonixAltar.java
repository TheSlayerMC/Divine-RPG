package net.divinerpg.arcana.block;

import net.divinerpg.lib.ResourceLocs;
import net.divinerpg.overworld.block.tileentity.TileEntityDramixAltar;
import net.divinerpg.overworld.block.tileentity.TileEntityParasectaAltar;
import net.divinerpg.render.entity.model.ModelDramixAltar;
import net.divinerpg.render.entity.model.ModelPhoenixAltar;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;


public class RenderPheonixAltar extends TileEntitySpecialRenderer
{
    private static final ResourceLocation texture = ResourceLocs.BLOCK_PARASECTA_ALTAR;

    static final float scale = (float)(1.0 / 16.0);
    private ModelPhoenixAltar modelAltar;

    public RenderPheonixAltar()
    {
        modelAltar = new ModelPhoenixAltar(scale);
    }

    @Override
    public void renderTileEntityAt(TileEntity var1, double x, double y,
            double z, float tick)
    {
        this.renderAModelAt((TileEntityParasectaAltar)var1, x, y, z, tick);
    }

    public void renderAModelAt(TileEntityParasectaAltar tile, double x, double y, double z, float f)
    {
        int rotation = 0;
        if(tile.worldObj != null)
        {
            rotation = tile.getBlockMetadata();
        }

        this.bindTexture(texture);

        GL11.glPushMatrix();
        GL11.glTranslatef((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
        GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
        modelAltar.render(0.0625F);
        GL11.glPopMatrix();
    }

}
