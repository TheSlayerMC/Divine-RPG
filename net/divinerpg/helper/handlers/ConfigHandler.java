package net.divinerpg.helper.handlers;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {

	public static Configuration config;
	
	public static int BlockID = 500;
	public static int ItemID = 1000;
	public static int TerrainBlockID = 256;
	
	public static void init(){
		
		config = new Configuration();		
	}
	
	public static int addBlock(String name){
				
		config.get("BLOCKS", name , BlockID++);
		
		
		return BlockID++;
	}
	
	public static int addItem(String name){
				
		config.get("ITEMS", name , ItemID++);

		return ItemID++;
	}
	
	public static int addTerrainBlock(String name){
				
		config.get("TERRAIN BLOCKS", name , TerrainBlockID++);

		return TerrainBlockID++;
	}
	
}
