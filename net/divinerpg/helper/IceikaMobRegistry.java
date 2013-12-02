package net.divinerpg.helper;

import net.divinerpg.iceika.mobs.EntityAlicanto;
import net.divinerpg.iceika.mobs.EntityFractite;
import net.divinerpg.iceika.mobs.EntityFrostArcher;
import net.divinerpg.iceika.mobs.EntityGlacide;
import net.divinerpg.iceika.mobs.EntityHastreus;
import net.divinerpg.iceika.mobs.EntityRollum;
import net.divinerpg.iceika.mobs.EntityWorkshopMerchant;
import net.divinerpg.iceika.mobs.EntityWorkshopTickerer;
import net.divinerpg.mob.entity.item.EntityFractiteCannonShot;
import net.divinerpg.mob.entity.item.EntityFractiteProjectile;
import net.divinerpg.mob.entity.item.EntityFrostclawProjectile;
import net.divinerpg.mob.entity.item.EntityFrostyShuriken;
import net.divinerpg.mob.entity.item.EntityIce;
import net.divinerpg.mob.entity.item.EntityNoteProjectile;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class IceikaMobRegistry 
{
	
	public static void init()
	{
		ModMobRegistry.registerEntity(EntityAlicanto.class, "Alicanto");
        ModMobRegistry.registerEntity(EntityFractite.class, "Fractite");
        ModMobRegistry.registerEntity(EntityGlacide.class, "Glacide");
        ModMobRegistry.registerEntity(EntityHastreus.class, "Hastreus");
        ModMobRegistry.registerEntity(EntityFrostArcher.class, "Frost Archer");
        ModMobRegistry.registerEntity(EntityRollum.class, "Rollum");
        ModMobRegistry.registerEntity(EntityWorkshopTickerer.class, "Workshop Tinkerer");
        ModMobRegistry.registerEntity(EntityWorkshopMerchant.class, "Workshop Merchant");
		
		ModMobRegistry.registerProjectile(EntityNoteProjectile.class, "noteProjectile");
		ModMobRegistry.registerProjectile(EntityIce.class, "Ice");
		ModMobRegistry.registerProjectile(EntityFrostclawProjectile.class, "frostClawProjectile");
		ModMobRegistry.registerProjectile(EntityFractiteCannonShot.class, "fractiteCannonShot");
		ModMobRegistry.registerProjectile(EntityFrostyShuriken.class, "frostyShuriken");
		ModMobRegistry.registerProjectile(EntityFractiteProjectile.class, "fractiteProjectile");
		
		addSpawns();
	}
	
	public static void addSpawns()
	{
        EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFractite.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
	}
	
}
