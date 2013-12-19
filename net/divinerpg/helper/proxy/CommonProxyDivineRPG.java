package net.divinerpg.helper.proxy;

import java.io.File;

import net.divinerpg.*;
import net.divinerpg.arcana.*;
import net.divinerpg.helper.*;
import net.divinerpg.helper.config.*;
import net.divinerpg.helper.handlers.*;
import net.divinerpg.overworld.block.tileentity.*;
import net.minecraft.block.BlockLever;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class CommonProxyDivineRPG {

	public void registerRenderInformation(){}

	//ClientProxyDivineRPG P.S this comment is just so i can easily get to the client proxy!
	public void preInit(FMLPreInitializationEvent event) {         
		ConfigHelper.initConfig();
		DimensionConfigHelper.configInit();
		tickRegistry();
		Registry.init();
		GameRegistry.registerPlayerTracker(new ArcanaHelper());
	} 

	public void tickRegistry(){
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}

	public void init(FMLInitializationEvent event){         
		AchievementPageDivineRPG.Init();
	}
}
