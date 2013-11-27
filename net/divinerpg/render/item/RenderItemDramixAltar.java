package net.divinerpg.render.item;

import net.divinerpg.render.entity.model.ModelDramixAltar;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class RenderItemDramixAltar implements IItemRenderer
{
    private ModelDramixAltar dramixAltar;
    public ResourceLocation texture = new ResourceLocation("/DivineRPG/DramixSpawn.png");

    public RenderItemDramixAltar()
    {
        dramixAltar = new ModelDramixAltar(1 / 16F);
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type)
    {
        return true;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,ItemRendererHelper helper)
    {
        return true;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data)
    {
        switch (type)
        {
            case ENTITY:
                renderAltar(-0.5F, 0F, -0.5F);
                break;

            case EQUIPPED:
                renderAltar(0F, 0.4F, 0F);
                break;

            case INVENTORY:
                renderAltar(1F, 0.65F, 1F);
                break;

            default:
                break;
        }
    }

    private void renderAltar(float x, float y, float z)
    {
        Tessellator tesselator = Tessellator.instance;
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(texture);
        GL11.glPushMatrix(); //start
        GL11.glTranslatef(x, y - 0.7F, z); //size
        dramixAltar.render(0.0275F);
        GL11.glPopMatrix(); //end
    }
}
