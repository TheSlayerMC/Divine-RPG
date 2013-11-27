package net.divinerpg.helper;

import net.divinerpg.overworld.block.tileentity.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistry {

	public static void init(){
		GameRegistry.registerTileEntity(TileEntityAyeracoBeamBlue.class, "BlueBeam");
		GameRegistry.registerTileEntity(TileEntityAyeracoBeamRed.class, "RedBeam");
		GameRegistry.registerTileEntity(TileEntityAyeracoBeamGreen.class, "GreenBeam");
		GameRegistry.registerTileEntity(TileEntityAyeracoBeamPurple.class, "PuepleBeam");
		GameRegistry.registerTileEntity(TileEntityAyeracoBeamYellow.class, "YellowBeam");
		GameRegistry.registerTileEntity(TileEntityCoalStoneFurnace.class, "CoalStone");
		GameRegistry.registerTileEntity(TileEntityCondenser.class, "Condencer");
		GameRegistry.registerTileEntity(TileEntityDemonFurnace.class, "DemonFurnace");
		GameRegistry.registerTileEntity(TileEntityDramixAltar.class, "DramixAltar");
		GameRegistry.registerTileEntity(TileEntityExtractor.class, "Extractor");
		GameRegistry.registerTileEntity(TileEntityGreenlightFurnace.class, "GreenLight");
		GameRegistry.registerTileEntity(TileEntityIceikaChest.class, "IceikaChest");
		GameRegistry.registerTileEntity(TileEntityMoltenFurnace.class, "MoltenFurnace");
		GameRegistry.registerTileEntity(TileEntityMoonlightFurnace.class, "Moonlight");
		GameRegistry.registerTileEntity(TileEntityOceanfireFurnace.class, "OceanFire");
		GameRegistry.registerTileEntity(TileEntityParasectaAltar.class, "Parasecta");
		GameRegistry.registerTileEntity(TileEntityPheonixAltar.class, "Phoenix");
		GameRegistry.registerTileEntity(TileEntitySuperEnchantmentTable.class, "SuperTable");
		GameRegistry.registerTileEntity(TileEntityTwilightFurance.class, "TwilightFurnace");
		GameRegistry.registerTileEntity(TileEntityWhitefireFurnace.class, "WhiteFireFurnace");
		GameRegistry.registerTileEntity(TileEntityInfusionTable.class, "Infusion Table");
		GameRegistry.registerTileEntity(TileEntityDreamLamp.class, "Dream Lamp"); 


	}
	
}
