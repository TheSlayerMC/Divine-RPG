package net.divinerpg.helper;

import net.divinerpg.helper.config.DimensionConfigHelper;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;

public class CommandDivineRPG extends CommandBase
{
	@Override
	public int getRequiredPermissionLevel() {
		return 2;
	}
	
	@Override
	public String getCommandName() 
	{
		return "DivineRPG"; 
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) 
	{
		if(args[0].matches("Iceika"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
			if(playerMP.dimension == 0)
				playerMP.travelToDimension(DimensionConfigHelper.IceikaID);
			else
				playerMP.travelToDimension(0);
		}
		if(args[0].matches("Azurite"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
				playerMP.travelToDimension(DimensionConfigHelper.AzuriteID);
		}
		if(args[0].matches("Dravite"))
		{
			EntityPlayerMP playerMP = (EntityPlayerMP) sender;
			if(playerMP.dimension == 0)
				playerMP.travelToDimension(DimensionConfigHelper.DraviteID);
			else
				playerMP.travelToDimension(0);
		}
	}

    @Override
    public String getCommandUsage(ICommandSender icommandsender) {
        return "/DivineRPG";
    }
}
