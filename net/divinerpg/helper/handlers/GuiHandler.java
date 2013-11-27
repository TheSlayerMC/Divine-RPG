package net.divinerpg.helper.handlers;

import net.divinerpg.block.container.*;
import net.divinerpg.misc.*;
import net.divinerpg.overworld.block.tileentity.*;
import net.divinerpg.render.gui.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.tileentity.*;
import net.minecraft.world.*;
import cpw.mods.fml.common.network.*;

public class GuiHandler implements IGuiHandler {

	 static int guiID = 1;

	    public static final int MERIK = guiID++;
	    public static final int VATTICUS = guiID++;
	    public static final int LEORNA = guiID++;
	    public static final int ZELUS = guiID++;
	    public static final int DATTICON = guiID++;
	    public static final int TINKERER = guiID++;
	    public static final int WORKSHOP_MERCHANT = guiID++;
	    public static final int JACKOMAN = guiID++;
	    public static final int INFUSION_TABLE = guiID++;
	    public static final int DREAM_LAMP = guiID++;
	    public static final int HUNGER = guiID++;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        TileEntity entity = world.getBlockTileEntity(x, y, z);

        if(entity instanceof TileEntityInfusionTable)
            return new ContainerInfusionTable(player.inventory, (TileEntityInfusionTable) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityCoalStoneFurnace)
            return new ContainerCoalStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityExtractor)
            return new ContainerExtractinator(player.inventory, (TileEntityExtractor) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityWhitefireFurnace)
            return new ContainerWhitefireFurnace(player.inventory, (TileEntityWhitefireFurnace) world.getBlockTileEntity(x, y, z));

        if(entity instanceof TileEntityDreamLamp){
            return new ContainerDreamLamp(player.inventory, (TileEntityDreamLamp) world.getBlockTileEntity(x, y, z));
        }
        
        if(entity instanceof TileEntitySuperEnchantmentTable)
            return new ContainerSuperEnchant(player.inventory, world, x, y, z);
        
        if (ID == JACKOMAN) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        
        if (ID == MERIK) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == VATTICUS) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == LEORNA) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == ZELUS) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == DATTICON) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == WORKSHOP_MERCHANT) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == TINKERER) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        if (ID == HUNGER) {
            return new ContainerDivineMerchant(player.inventory, (IMerchant)DivineUtil.getEntityByID(x, world), world);
        }
        
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {

        TileEntity entity = world.getBlockTileEntity(x, y, z);

        if(entity instanceof TileEntityInfusionTable){
        	return new GuiInfusionTable((ContainerInfusionTable)this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if(entity instanceof TileEntityCoalStoneFurnace){
            return new GuiStoneFurnace(player.inventory, (TileEntityCoalStoneFurnace) world.getBlockTileEntity(x, y, z));
    	}
        
        else if(entity instanceof TileEntityExtractor){
            return new GuiExtractinator(player.inventory, (TileEntityExtractor) world.getBlockTileEntity(x, y, z));
		}
        
        else if(entity instanceof TileEntityWhitefireFurnace){
            return new GuiWhitefireFurnace(player.inventory, (TileEntityWhitefireFurnace) world.getBlockTileEntity(x, y, z));
        }
        
        else if(entity instanceof TileEntityDreamLamp){
        	return new GuiDreamLamp((ContainerDreamLamp)this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if(entity instanceof TileEntitySuperEnchantmentTable){
            return new GuiSuperEnchant(player.inventory, world, x, y, z);
        }
        
        else if (ID == JACKOMAN) {
            return new GuiJackOMan((ContainerDivineMerchant)this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == MERIK) {
            return new GuiCaptainMerik((ContainerDivineMerchant)getServerGuiElement(ID, player, world, x, y, z));
        }
        else if (ID == VATTICUS) {
            return new GuiVatticus((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == LEORNA) {
            return new GuiLeorna((ContainerDivineMerchant)this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == ZELUS) {
            return new GuiZelus((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == DATTICON) {
            return new GuiDatticon((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == WORKSHOP_MERCHANT) {
            return new GuiWorkshopMerchant((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == TINKERER) {
            return new GuiTinkerer((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        else if (ID == HUNGER) {
            return new GuiHungerHungry((ContainerDivineMerchant) this.getServerGuiElement(ID, player, world, x, y, z));
        }
        
        return null;
    }

}