package net.divinerpg.block.model;

import net.divinerpg.overworld.block.tileentity.TileEntityStatue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

public class RenderStatue extends TileEntitySpecialRenderer {
    
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick) {
        if (te instanceof TileEntityStatue) {
        	TileEntityStatue teds = (TileEntityStatue)te;
            
            int rotation = 0;
            if(teds.worldObj != null)
            {
                rotation = teds.getBlockMetadata();
            }
            
            // Bind texture
            Minecraft.getMinecraft().getTextureManager().bindTexture(teds.texture);

            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glTranslatef((float)x + 0.5F, (float)y+0.7F, (float)z + 0.5F);
            GL11.glScaled(0.5, 0.5, 0.5);
            GL11.glRotatef(rotation*90, 0.0F, 1.0F, 0.0F);
            GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
            teds.model.render(0.0625F);
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glPopMatrix();
        }
        
    }
    
    
    
}
