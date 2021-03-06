package net.divinerpg.render.gui;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.divinerpg.lib.ResourceGuiLoc;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

@SideOnly(Side.CLIENT)
public class GuiZelus extends GuiContainer
{

    private IMerchant theIMerchant;
    private ModGuiMerchantButton nextRecipeButtonIndex;
    private ModGuiMerchantButton previousRecipeButtonIndex;
    private int currentRecipeIndex;

    public GuiZelus(ContainerDivineMerchant container)
    {
        super(container);
        this.theIMerchant = container.getMerchant();
    }

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    public void initGui()
    {
        super.initGui();
        int i = (this.width - this.xSize) / 2;
        int j = (this.height - this.ySize) / 2;
        this.buttonList.add(this.nextRecipeButtonIndex = new ModGuiMerchantButton(1, i + 120 + 27, j + 24 - 1, true, ResourceGuiLoc.GUI_ZELUS));
        this.buttonList.add(this.previousRecipeButtonIndex = new ModGuiMerchantButton(2, i + 36 - 19, j + 24 - 1, false, ResourceGuiLoc.GUI_ZELUS));
        this.nextRecipeButtonIndex.enabled = false;
        this.previousRecipeButtonIndex.enabled = false;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	this.fontRenderer.drawString(StatCollector.translateToLocal("Zelus"), 56, 6, 4210752);
        this.fontRenderer.drawString(I18n.getString("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    /**
     * Called from the main game loop to update the screen.
     */
    public void updateScreen()
    {
        super.updateScreen();
        MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes(this.mc.thePlayer);

        if (merchantrecipelist != null)
        {
            this.nextRecipeButtonIndex.enabled = this.currentRecipeIndex < merchantrecipelist.size() - 1;
            this.previousRecipeButtonIndex.enabled = this.currentRecipeIndex > 0;
        }
    }

    /**
     * Fired when a control is clicked. This is the equivalent of ActionListener.actionPerformed(ActionEvent e).
     */
    protected void actionPerformed(GuiButton par1GuiButton)
    {
        boolean flag = false;

        if (par1GuiButton == this.nextRecipeButtonIndex)
        {
            ++this.currentRecipeIndex;
            flag = true;
        }
        else if (par1GuiButton == this.previousRecipeButtonIndex)
        {
            --this.currentRecipeIndex;
            flag = true;
        }

        if (flag)
        {
            ((ContainerDivineMerchant)this.inventorySlots).setCurrentRecipeIndex(this.currentRecipeIndex);
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);

            try
            {
                dataoutputstream.writeInt(this.currentRecipeIndex);
                this.mc.getNetHandler().addToSendQueue(new Packet250CustomPayload("MC|TrSel", bytearrayoutputstream.toByteArray()));
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
    }

    /**
     * Draw the background layer for the GuiContainer (everything behind the items)
     */
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(ResourceGuiLoc.GUI_ZELUS);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes(this.mc.thePlayer);

        if (merchantrecipelist != null && !merchantrecipelist.isEmpty())
        {
            int i1 = this.currentRecipeIndex;
            MerchantRecipe merchantrecipe = (MerchantRecipe)merchantrecipelist.get(i1);

            if (merchantrecipe.func_82784_g())
            {
                this.mc.getTextureManager().bindTexture(ResourceGuiLoc.GUI_ZELUS);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glDisable(GL11.GL_LIGHTING);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 21, 212, 0, 28, 21);
                this.drawTexturedModalRect(this.guiLeft + 83, this.guiTop + 51, 212, 0, 28, 21);
            }
        }
    }

    /**
     * Draws the screen and all the components in it.
     */
    public void drawScreen(int par1, int par2, float par3)
    {
        super.drawScreen(par1, par2, par3);
        MerchantRecipeList merchantrecipelist = this.theIMerchant.getRecipes(this.mc.thePlayer);

        if (merchantrecipelist != null && !merchantrecipelist.isEmpty())
        {
            int k = (this.width - this.xSize) / 2;
            int l = (this.height - this.ySize) / 2;
            int i1 = this.currentRecipeIndex;
            MerchantRecipe merchantrecipe = (MerchantRecipe)merchantrecipelist.get(i1);
            GL11.glPushMatrix();
            ItemStack itemstack = merchantrecipe.getItemToBuy();
            ItemStack itemstack1 = merchantrecipe.getSecondItemToBuy();
            ItemStack itemstack2 = merchantrecipe.getItemToSell();
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glDisable(GL11.GL_LIGHTING);
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glEnable(GL11.GL_COLOR_MATERIAL);
            GL11.glEnable(GL11.GL_LIGHTING);
            itemRenderer.zLevel = 100.0F;
            itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack, k + 36, l + 24);
            itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack, k + 36, l + 24);

            if (itemstack1 != null)
            {
                itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack1, k + 62, l + 24);
                itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack1, k + 62, l + 24);
            }

            itemRenderer.renderItemAndEffectIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack2, k + 120, l + 24);
            itemRenderer.renderItemOverlayIntoGUI(this.fontRenderer, this.mc.getTextureManager(), itemstack2, k + 120, l + 24);
            itemRenderer.zLevel = 0.0F;
            GL11.glDisable(GL11.GL_LIGHTING);

            if (this.isPointInRegion(36, 24, 16, 16, par1, par2))
            {
                this.drawItemStackTooltip(itemstack, par1, par2);
            }
            else if (itemstack1 != null && this.isPointInRegion(62, 24, 16, 16, par1, par2))
            {
                this.drawItemStackTooltip(itemstack1, par1, par2);
            }
            else if (this.isPointInRegion(120, 24, 16, 16, par1, par2))
            {
                this.drawItemStackTooltip(itemstack2, par1, par2);
            }

            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_LIGHTING);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            RenderHelper.enableStandardItemLighting();
        }
    }

    /**
     * Gets the Instance of IMerchant interface.
     */
    public IMerchant getIMerchant()
    {
        return this.theIMerchant;
    }
}
