package net.divinerpg.helper.proxy;

import net.divinerpg.helper.ArcanaMobRegistry;
import net.divinerpg.helper.ArcanaMobRendering;
import net.divinerpg.helper.IceikaMobRegistry;
import net.divinerpg.helper.IceikaMobRendering;
import net.divinerpg.helper.OverworldMobRegistry;
import net.divinerpg.helper.OverworldMobRendering;
import net.divinerpg.helper.TwilightMobRegistry;
import net.divinerpg.helper.TwilightMobRendering;
import net.divinerpg.helper.VetheaMobRegistry;
import net.divinerpg.helper.VetheaMobRendering;
import net.divinerpg.helper.handlers.ClientTickHandler;
import net.divinerpg.helper.handlers.SoundHandler;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxyDivineRPG extends CommonProxyDivineRPG {

	@Override
	public void registerRenderInformation(){
		OverworldMobRendering.init();
		ArcanaMobRendering.init();
		TwilightMobRendering.init();
		IceikaMobRendering.init();
		VetheaMobRendering.init();
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}

	@Override
	public void tickRegistry(){
		super.tickRegistry();
		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT); 
	}
}
