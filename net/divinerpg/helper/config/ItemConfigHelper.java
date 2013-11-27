package net.divinerpg.helper.config;

import java.io.File;

import net.divinerpg.helper.HelperBase;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ItemConfigHelper extends HelperBase{
	
	
	
	
	
	
	public static void initConfig(FMLPreInitializationEvent event){
		File file = new File(event.getModConfigurationDirectory(), "DivineRPG Items.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		
		
		config.save();
	}

}
