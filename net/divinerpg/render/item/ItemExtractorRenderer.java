package net.divinerpg.render.item;

import net.divinerpg.overworld.block.tileentity.TileEntityExtractor;
import net.divinerpg.render.entity.model.ModelExtractor;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemExtractorRenderer implements IItemRenderer {

    private ModelExtractor extractorModel;
    private float scale = 0.5F;

    public ItemExtractorRenderer() {

        extractorModel = new ModelExtractor(scale);
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {

        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, -0.1F, 0.0F);
        GL11.glScalef(0.7F, 0.7F, 0.7F);        
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityExtractor(), 0.0D, 0.0D, 0.0D, 0.0F);
        GL11.glPopMatrix();
    }
}