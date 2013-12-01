package net.divinerpg.block.model;

import net.divinerpg.arcana.block.BlockDemonFurnace;
import net.divinerpg.block.BlockStatue;
import net.divinerpg.lib.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class RenderDemonItem implements IItemRenderer {
    
    ModelDivineBlock model;
    ResourceLocation texture;
    
    public RenderDemonItem() {
        this.model = new ModelDemonFurnace();
        this.texture = new ResourceLocation(Reference.MOD_ID + ":" + "textures/model/DemonFurnace.png");
    }
   
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }
     
    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
    {
        return true;
    }
     
    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch(type)
        {
            case ENTITY:
            {
            	renderItem(0f, 0f, 0f, 1.3f);
                return;
            }
             
            case EQUIPPED:
            {
            	renderItem(0f, 1f, 1f, 1.1f);
                return;
            }
                 
            case INVENTORY:
            {
            	renderItem(0f, 0f, 0f, 0.6f);
                return;
            }
             
            default:
            	return;
        }
    }
    
    private void renderItem(float x, float y, float z, float scale)
    {
        GL11.glPushMatrix();
     
        // Disable Lighting Calculations
        GL11.glDisable(GL11.GL_LIGHTING);
         
        GL11.glTranslatef(x,  y+0.2F,  z);
        GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(180, 1.0F, 0.0F, 0.0F);
        
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        
        model.render(0.0625F);
         
        // Re-enable Lighting Calculations
        GL11.glEnable(GL11.GL_LIGHTING);
        GL11.glPopMatrix();
    }
    
}
