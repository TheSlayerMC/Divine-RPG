package net.divinerpg.arcana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.divinerpg.lib.RefDebug;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.IPlayerTracker;

public class ArcanaHelper implements IPlayerTracker {

	public static HashMap<String, Integer> bars = new HashMap<String, Integer>();
	public static HashMap<String, Integer> delays = new HashMap<String, Integer>();
	private static ArrayList arcanaList = new ArrayList(0);
	public static String playerID;
	private static int arcana = 0;
	private static int regenDelay = 0;



	public static void add(String username) {	
		playerID = username;
		arcanaList.ensureCapacity(arcanaList.size() + 1);
		bars.put(username, 200);
		delays.put(username, 200);
		//arcana = 200;
		//regen(1);
	}

	public static void remove(String par1) {
		bars.remove(par1);
		delays.remove(par1);
	}

	public static void updateAllBars(List<EntityPlayer> players) {
		for (int l = 0; l < players.size(); l++) {
			String user = players.get(l).username;
			if(user == null) {
				continue;
			}

			if (delays.get(user) == 0) {
				bars.put(user, bars.get(user) + 1);
				if(arcana != 200){
					regen(1);
				}else{
					regen(0);
				}
			}
			
			else if (delays.containsKey(user)) {
				delays.put(user, delays.get(user) - 1);
			} else {
				add(user);
			}

		}
	}

	public static ArcanaHelper get(String par1)
	{
		for (int i = 0; i < arcanaList.size(); i++) {
			arcanaList.get(i); 
			if (ArcanaHelper.playerID == par1)
				return (ArcanaHelper)arcanaList.get(i);
		}
		int i = 0;
		return (ArcanaHelper)arcanaList.get(i);
	}

	public static boolean useBar(EntityPlayer par1, int amount) {
		if (arcana < amount) {
			regenDelay = 30;
			return false;
		}

		arcana -= amount;
		regenDelay = 30;
		return true;
	}

	public static void regen(int par1) {
		if (regenDelay == 0) {
	      arcana += par1;
	    } else {
	      regenDelay -= 1;
	    }
	}

	public static float getBarValue() {
		return arcana;
	}

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		add(player.username);
	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		remove(player.username);
	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) { 
		add(player.username);
	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		add(player.username);
	}
}
