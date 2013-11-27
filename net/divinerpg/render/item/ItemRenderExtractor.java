package net.divinerpg.render.item;

import net.divinerpg.overworld.block.tileentity.TileEntityExtractor;
import net.divinerpg.render.entity.model.ModelExtractor;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemRenderExtractor implements IItemRenderer {

    private ModelExtractor extractor;
    private float scale = 1.5F;

    public ItemRenderExtractor() {
        extractor = new ModelExtractor(scale);
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
        GL11.glScalef(0.5F, 0.5F, 0.5F);        
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityExtractor(), 0.0D, 0.0D, 0.0D, 0.0F);
        GL11.glPopMatrix();
    }
}