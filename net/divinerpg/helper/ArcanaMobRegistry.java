package net.divinerpg.helper;

import net.divinerpg.arcana.mobs.EntityCaptianMerik;
import net.divinerpg.arcana.mobs.EntityConstructor;
import net.divinerpg.arcana.mobs.EntityDatticon;
import net.divinerpg.arcana.mobs.EntityDeathHound;
import net.divinerpg.arcana.mobs.EntityDeathcryx;
import net.divinerpg.arcana.mobs.EntityDramix;
import net.divinerpg.arcana.mobs.EntityDungeonDemon;
import net.divinerpg.arcana.mobs.EntityDungeonPrisoner;
import net.divinerpg.arcana.mobs.EntityFyracryx;
import net.divinerpg.arcana.mobs.EntityGolemOfRejuv;
import net.divinerpg.arcana.mobs.EntityLeorna;
import net.divinerpg.arcana.mobs.EntityLivingStatue;
import net.divinerpg.arcana.mobs.EntityParasecta;
import net.divinerpg.arcana.mobs.EntityRazorback;
import net.divinerpg.arcana.mobs.EntityVatticus;
import net.divinerpg.arcana.mobs.EntityWraith;
import net.divinerpg.arcana.mobs.EntityZelus;
import net.divinerpg.iceika.mobs.EntityRoamer;
import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.twilight.mobs.EntityParatiku;
import net.divinerpg.twilight.mobs.EntitySeimer;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ArcanaMobRegistry 
{
	
	public static void init(){
		
		ModMobRegistry.registerEntity(EntityRazorback.class, "Razorback");
		ModMobRegistry.registerEntity(EntityLivingStatue.class, "Living Statue");
		ModMobRegistry.registerEntity(EntityDeathcryx.class, "Deathcryx");
		ModMobRegistry.registerEntity(EntityDungeonPrisoner.class, "Dungeon Prisoner");
		ModMobRegistry.registerEntity(EntityDungeonDemon.class, "Dungeon Demon");
		ModMobRegistry.registerEntity(EntityRoamer.class, "Roamer");
		ModMobRegistry.registerEntity(EntityConstructor.class, "Constructor");
		ModMobRegistry.registerEntity(EntityDeathHound.class, "Death Hound");
		ModMobRegistry.registerEntity(EntityLeorna.class, "Leorna");
		ModMobRegistry.registerEntity(EntityCaptianMerik.class, "Captain Merik");
		ModMobRegistry.registerEntity(EntityDatticon.class, "Datticon");
		ModMobRegistry.registerEntity(EntityZelus.class, "Zelus");
		ModMobRegistry.registerEntity(EntityVatticus.class, "Lord Vatticus");
		ModMobRegistry.registerEntity(EntityFyracryx.class, "Fyracryx");
		ModMobRegistry.registerEntity(EntityParatiku.class, "Paratiku");
		ModMobRegistry.registerEntity(EntitySeimer.class, "Seimer");
		ModMobRegistry.registerEntity(EntityGolemOfRejuv.class, "Golem Of Rejuv");
		ModMobRegistry.registerEntity(EntityWraith.class, "Wraith");
		ModMobRegistry.registerEntity(EntityParasecta.class, "Parasecta");
		ModMobRegistry.registerEntity(EntityDramix.class, "Dramix");
		
		ModMobRegistry.registerEntity(EntityFirefly.class, "Firefly");
		ModMobRegistry.registerEntity(EntityFyracryxFireball.class, "Fyracryx Fireball");
		ModMobRegistry.registerEntity(EntityGrenade.class, "Grenade");
		ModMobRegistry.registerEntity(EntityLamona.class, "Lamona");
		ModMobRegistry.registerEntity(EntityLivingStatueArrow.class, "Living Statue Arrow");
		ModMobRegistry.registerEntity(EntityMerikMissile.class, "Meric Missile");
		ModMobRegistry.registerEntity(EntityReflector.class, "Reflector");
		ModMobRegistry.registerEntity(EntitySparkler.class, "Sparkler");
		ModMobRegistry.registerEntity(EntityStarfall.class, "Starlight");
		
		addSpawns();
	}
	
	public static void addSpawns()
	{
        EntityRegistry.addSpawn(EntityLeorna.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityDatticon.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityZelus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityVatticus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityCaptianMerik.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
	}
}
