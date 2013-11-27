package net.divinerpg.render.item;

import net.divinerpg.overworld.block.tileentity.TileEntityParasectaAltar;
import net.divinerpg.render.entity.model.ModelPhoenixAltar;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class ItemParasectaAltarRenderer implements IItemRenderer {

    private ModelPhoenixAltar altarModel;
    private float scale = 0.5F;

    public ItemParasectaAltarRenderer() {

        altarModel = new ModelPhoenixAltar(scale);
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
        GL11.glScalef(1.0F, 1.0F, 1.0F);        
        TileEntityRenderer.instance.renderTileEntityAt(new TileEntityParasectaAltar(), 0.0D, 0.0D, 0.0D, 0.0F);
        GL11.glPopMatrix();
    }
}