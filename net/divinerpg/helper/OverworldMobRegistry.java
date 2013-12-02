package net.divinerpg.helper;

import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.overworld.mobs.EntityAncient;
import net.divinerpg.overworld.mobs.EntityAyeracoBlue;
import net.divinerpg.overworld.mobs.EntityAyeracoGreen;
import net.divinerpg.overworld.mobs.EntityAyeracoPurple;
import net.divinerpg.overworld.mobs.EntityAyeracoRed;
import net.divinerpg.overworld.mobs.EntityAyeracoYellow;
import net.divinerpg.overworld.mobs.EntityCaveCrawler;
import net.divinerpg.overworld.mobs.EntityCaveclops;
import net.divinerpg.overworld.mobs.EntityCrab;
import net.divinerpg.overworld.mobs.EntityCyclops;
import net.divinerpg.overworld.mobs.EntityDesertCrawler;
import net.divinerpg.overworld.mobs.EntityEnderSpider;
import net.divinerpg.overworld.mobs.EntityEnderTriplets;
import net.divinerpg.overworld.mobs.EntityEnderWatcher;
import net.divinerpg.overworld.mobs.EntityEnthralledDramcryx;
import net.divinerpg.overworld.mobs.EntityFrost;
import net.divinerpg.overworld.mobs.EntityHellBat;
import net.divinerpg.overworld.mobs.EntityHellSpider;
import net.divinerpg.overworld.mobs.EntityIceMan;
import net.divinerpg.overworld.mobs.EntityJackOMan;
import net.divinerpg.overworld.mobs.EntityJungleBat;
import net.divinerpg.overworld.mobs.EntityJungleDramcryx;
import net.divinerpg.overworld.mobs.EntityJungleSpider;
import net.divinerpg.overworld.mobs.EntityKingCrab;
import net.divinerpg.overworld.mobs.EntityKingOfScorchers;
import net.divinerpg.overworld.mobs.EntityMiner;
import net.divinerpg.overworld.mobs.EntityNetherWatcher;
import net.divinerpg.overworld.mobs.EntityRainbour;
import net.divinerpg.overworld.mobs.EntityRotatick;
import net.divinerpg.overworld.mobs.EntityScorcher;
import net.divinerpg.overworld.mobs.EntityShark;
import net.divinerpg.overworld.mobs.EntityTheEye;
import net.divinerpg.overworld.mobs.EntityWhale;
import net.divinerpg.overworld.mobs.EntityWildFire;
import net.divinerpg.twilight.mobs.EntityAridWarrior;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class OverworldMobRegistry {
	public static BiomeGenBase[] iceBiomes = new BiomeGenBase[]{BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills};
	public static BiomeGenBase[] overworldBiomes = new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river};
	
	
	public static void init() {		
        ModMobRegistry.registerEntity(EntityHellSpider.class, "Hell Spider");
        ModMobRegistry.registerEntity(EntityJungleSpider.class, "Jungle Spider");
        ModMobRegistry.registerEntity(EntityCyclops.class, "Cyclops");
        ModMobRegistry.registerEntity(EntityIceMan.class, "Ice Man");
        ModMobRegistry.registerEntity(EntityFrost.class, "Frost");
        ModMobRegistry.registerEntity(EntityNetherWatcher.class, "Watcher");
        ModMobRegistry.registerEntity(EntityEnderWatcher.class, "Ender Watcher");
       // ModMobRegistry.registerEntity(EntityHellPig.class, "Hell Pig");
        ModMobRegistry.registerEntity(EntityMiner.class, "Miner");
        ModMobRegistry.registerEntity(EntityAncient.class, "Ancient Entity");
        ModMobRegistry.registerEntity(EntityCrab.class, "Crab");
        ModMobRegistry.registerEntity(EntityShark.class, "Shark");
        ModMobRegistry.registerEntity(EntityWhale.class, "Whale");
        ModMobRegistry.registerEntity(EntityKingCrab.class, "King Crab");
        ModMobRegistry.registerEntity(EntityJackOMan.class, "Jack 'O' Man");
        
        ModMobRegistry.registerEntity(EntityDesertCrawler.class, "Desert Crawler");
        ModMobRegistry.registerEntity(EntityCaveCrawler.class, "Cave Crawler");
        ModMobRegistry.registerEntity(EntityAridWarrior.class, "Arid Warrior");
        ModMobRegistry.registerEntity(EntityRotatick.class, "Rotatick");
        ModMobRegistry.registerEntity(EntityJungleDramcryx.class, "Jungle Dramcryx");
        ModMobRegistry.registerEntity(EntityEnthralledDramcryx.class, "Enthralled Dramcryx");
        ModMobRegistry.registerEntity(EntityTheEye.class, "The Eye");
        ModMobRegistry.registerEntity(EntityEnderTriplets.class, "Ender Triplets");
        ModMobRegistry.registerEntity(EntityJungleBat.class, "Jungle Bat");
        ModMobRegistry.registerEntity(EntityCaveclops.class, "Caveclops");
        ModMobRegistry.registerEntity(EntityHellBat.class, "Hell Bat");
        ModMobRegistry.registerEntity(EntityEnderSpider.class, "Ender Spider");
        ModMobRegistry.registerEntity(EntityRainbour.class, "Rainbour");
        ModMobRegistry.registerEntity(EntityKingOfScorchers.class, "King Of Scorchers");
        ModMobRegistry.registerEntity(EntityScorcher.class, "Scorcher");
        ModMobRegistry.registerEntity(EntityWildFire.class, "Wild Fire");

        ModMobRegistry.registerProjectile(EntityShuriken.class, "Shuriken");
        ModMobRegistry.registerProjectile(EntityVailStorm.class, "VailStrom");
        ModMobRegistry.registerProjectile(EntityFireArrow.class, "FireArrow");
        ModMobRegistry.registerProjectile(EntityExplosiveArrow.class, "Explosive Arrow");
        ModMobRegistry.registerProjectile(EntityStromBall.class, "Stromball");
        ModMobRegistry.registerProjectile(EntityMusicBall.class, "MusicNote");
        ModMobRegistry.registerProjectile(EntityGhastTear.class, "GhastTear");
        ModMobRegistry.registerProjectile(EntityFrostShard.class, "FrostShard");
        ModMobRegistry.registerProjectile(EntityDeathSeranade.class, "KillSerande");
        ModMobRegistry.registerProjectile(EntityBlueFireBall.class, "BlueFireball");
        ModMobRegistry.registerProjectile(EntityWatcherShot.class, "Watcher Shot");
        ModMobRegistry.registerProjectile(EntityMamormeterShot.class, "King Of Scorchers Projectile");
        ModMobRegistry.registerProjectile(EntityBowCannon.class, "Bow Cannon");
        ModMobRegistry.registerProjectile(EntityCrabCannon.class, "Crab Cannon");
        ModMobRegistry.registerProjectile(EntityTripletProjectile.class, "Ender Triplet Projectile");
        ModMobRegistry.registerProjectile(EntityCaveRock.class, "Cave Rock");
        ModMobRegistry.registerProjectile(EntityEnderArrow.class, "Ender Arrow");
        ModMobRegistry.registerProjectile(EntityCorruptShot.class, "Corrupted Shot");
        ModMobRegistry.registerProjectile(EntityCyclopsianStaff.class, "Cyclops Shot");

        ModMobRegistry.registerEntity(EntityAyeracoBlue.class, "Blue Ayeraco");
        ModMobRegistry.registerEntity(EntityAyeracoRed.class, "Red Ayeraco");
        ModMobRegistry.registerEntity(EntityAyeracoGreen.class, "Green Ayeraco");
        ModMobRegistry.registerEntity(EntityAyeracoPurple.class, "Purple Ayeraco");
        ModMobRegistry.registerEntity(EntityAyeracoYellow.class, "Yellow Ayeraco");

        addSpawn();
        addDungeonMob();
	}
	
	public static void addSpawn() {
		EntityRegistry.addSpawn(EntityIceMan.class, 10, 1, 1, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityFrost.class, 10, 1, 4, EnumCreatureType.monster, iceBiomes);
        EntityRegistry.addSpawn(EntityHellSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityHellBat.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityScorcher.class, 7, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityMiner.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityJackOMan.class, 1, 1, 1, EnumCreatureType.creature, overworldBiomes);
        //EntityRegistry.addSpawn(EntityHellPig.class, 25, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityCrab.class, 15, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityKingCrab.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.beach});
        EntityRegistry.addSpawn(EntityWhale.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityShark.class, 50, 1, 1, EnumCreatureType.waterCreature, new BiomeGenBase[] {BiomeGenBase.ocean});
        EntityRegistry.addSpawn(EntityCaveCrawler.class, 20, 2, 3, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityAridWarrior.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});
        EntityRegistry.addSpawn(EntityRotatick.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityJungleDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityEnthralledDramcryx.class, 20, 3, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river});
        EntityRegistry.addSpawn(EntityTheEye.class, 7, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityEnderTriplets.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityJungleBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityCaveclops.class, 20, 1, 4, EnumCreatureType.monster, overworldBiomes);
        
		EntityRegistry.addSpawn(EntityEnderSpider.class, 2, 1, 4, EnumCreatureType.monster, overworldBiomes);
        EntityRegistry.addSpawn(EntityRainbour.class, 2, 1, 1, EnumCreatureType.creature, overworldBiomes);
        EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
	}
	
	/** Adds new DivineRPG Mobs to a different kind of dungeon spawner. **/
	public static void addDungeonMob() {
		ModDungeonHooks.addDungeonMob("Jungle Dramcryx", 200);
		/**
		 * Testing mobs
		 * *
		ModDungeonHooks.addDungeonMob("Cave Crawler", 200);
		ModDungeonHooks.addDungeonMob("Wild Fire", 200);
		ModDungeonHooks.addDungeonMob("Scorcher", 200);
		ModDungeonHooks.addDungeonMob("Rainbour", 200);
		ModDungeonHooks.addDungeonMob("Ender Spider", 200);
		ModDungeonHooks.addDungeonMob("Jungle Spider", 200);
		ModDungeonHooks.addDungeonMob("Jungle Bat", 200);
		ModDungeonHooks.addDungeonMob("Hell Bat", 200);
		ModDungeonHooks.addDungeonMob("Cyclops", 200);
		ModDungeonHooks.addDungeonMob("Ender Triplets", 200);
		ModDungeonHooks.addDungeonMob("King Crab", 200);
		ModDungeonHooks.addDungeonMob("Whale", 200);
		ModDungeonHooks.addDungeonMob("Shark", 200);
		ModDungeonHooks.addDungeonMob("Crab", 200);
		ModDungeonHooks.addDungeonMob("Frost", 200);
		ModDungeonHooks.addDungeonMob("Ice Man", 200);*/
	}
}
