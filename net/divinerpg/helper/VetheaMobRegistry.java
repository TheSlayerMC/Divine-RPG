package net.divinerpg.helper;

import net.divinerpg.DivineRPG;
import net.divinerpg.arcana.mobs.EntityRazorback;
import net.divinerpg.arcana.mobs.EntityVermsillion;
import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.twilight.mobs.EntitySpinebackWorm;
import net.divinerpg.twilight.mobs.EntitySpinebackWormBody;
import net.divinerpg.vethea.entity.*;
import net.divinerpg.vethea.entity.item.*;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class VetheaMobRegistry {

	public static void init()
	{

		ModMobRegistry.registerEntity(EntityVermenous.class, "Vermenous");
        ModMobRegistry.registerEntity(EntityEnt.class, "Ent");
        ModMobRegistry.registerEntity(EntityCymesoid.class, "Cymesoid");
        ModMobRegistry.registerEntity(EntityDreamwrecker.class, "Dream Wrecker");
        ModMobRegistry.registerEntity(EntityTocaxin.class, "Tocaxin");
        ModMobRegistry.registerEntity(EntityShadahier.class, "Shadahier");
        ModMobRegistry.registerEntity(EntityAcidHag.class, "Acid Hag");
        ModMobRegistry.registerEntity(EntityKazrotic.class, "Kazrotic");
        ModMobRegistry.registerEntity(EntityHelio.class, "Helio");
        ModMobRegistry.registerEntity(EntityGorgosion.class, "Gorgosion");
        ModMobRegistry.registerEntity(EntityHoverStinger.class, "Hoverstinger");
        ModMobRegistry.registerEntity(EntityZone.class, "Zone");
        ModMobRegistry.registerEntity(EntityZoragon.class, "Zoragon");
        ModMobRegistry.registerEntity(EntityDissiment.class, "Dissiment");
        ModMobRegistry.registerEntity(EntitySpinebackWorm.class, "Spinarus");
        ModMobRegistry.registerEntity(EntityVhraak.class, "Vhraak");
        ModMobRegistry.registerEntity(EntityGalroid.class, "Galroid");
        ModMobRegistry.registerEntity(EntityLadyLuna.class, "Lady Luna");
        ModMobRegistry.registerEntity(EntityBohemite.class, "Bohemite");
        ModMobRegistry.registerEntity(EntityWreck.class, "Wreck");
        ModMobRegistry.registerEntity(EntityBiphron.class, "Biphron");
        ModMobRegistry.registerEntity(EntityHiveQueen.class, "Hive Queen");
        ModMobRegistry.registerEntity(EntityHiveSoldier.class, "hivesoldier");
        ModMobRegistry.registerEntity(EntityLheiva.class, "lheiva");
        ModMobRegistry.registerEntity(EntitySpinebackWormBody.class, "Spinarus");
        ModMobRegistry.registerEntity(EntityMandragora.class, "mandragora");
        ModMobRegistry.registerEntity(EntityTwins.class, "Twins");
        ModMobRegistry.registerEntity(EntityKaros.class, "Karos");
        ModMobRegistry.registerEntity(EntityRaglok.class, "Raglok");
        ModMobRegistry.registerEntity(EntityQuadro.class, "Quadro");
        ModMobRegistry.registerEntity(EntityDuo.class, "Duo");
        ModMobRegistry.registerEntity(EntityEndiku.class, "Endiku");
        ModMobRegistry.registerEntity(EntityLorga.class, "Lorga");
        ModMobRegistry.registerEntity(EntityLorgaFlight.class, "Lorga Flight");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer1.class, "Mysterious Man 1");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer2.class, "Mysterious Man 2");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer3.class, "Mysterious Man 3");
        ModMobRegistry.registerEntity(EntityHungerHungry.class, "Hunger Hungry");
        ModMobRegistry.registerEntity(EntityCryptKeeper.class, "Crypt Keeper");
        ModMobRegistry.registerEntity(EntityTempleGuardian.class, "Temple Guardian");
        ModMobRegistry.registerEntity(EntityEhu.class, "Ehu");
        ModMobRegistry.registerEntity(EntityStoneGolem.class, "Stone Golem");
        ModMobRegistry.registerEntity(EntityHusk.class, "Husk");
        ModMobRegistry.registerEntity(EntityVermsillion.class, "Vermsillion");
        ModMobRegistry.registerEntity(EntityRazorback.class, "Razorback");

		ModMobRegistry.registerProjectile(EntityTeakerDisk.class, "Teaker Disk");
        ModMobRegistry.registerProjectile(EntityAmthirmisDisk.class, "Amthirmis Disk");
        ModMobRegistry.registerProjectile(EntityDarvenDisk.class, "Darven Disk");
        ModMobRegistry.registerProjectile(EntityCermileDisk.class, "Cermile Disk");
        ModMobRegistry.registerProjectile(EntityPardimalDisk.class, "Pardimal Disk");
        ModMobRegistry.registerProjectile(EntityQuadroticDisk.class, "Quadrotic Disk");
        ModMobRegistry.registerProjectile(EntityKarosDisk.class, "Karos Disk");
        ModMobRegistry.registerProjectile(EntityHeliosisDisk.class, "Heliosis Disk");
        ModMobRegistry.registerProjectile(EntityArksianeDisk.class, "Arksiane Disk");
        ModMobRegistry.registerProjectile(EntitySpinebackDisc.class, "Spineback Disk");
        ModMobRegistry.registerProjectile(EntityVetheanCannonShot.class, "Vethean Cannon Shot");
        ModMobRegistry.registerProjectile(EntityVetheanArrow.class, "Teaker Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanArrow2.class, "Darven Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanWarArrow.class, "Pardimal Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanWrathArrow.class, "Karos Arrow");
        ModMobRegistry.registerProjectile(EntityKarosCannonShot.class, "Karos Cannon");
        ModMobRegistry.registerProjectile(EntitySpinebackCannonShot.class, "Spinback Cannon Shot");
        ModMobRegistry.registerProjectile(EntityEvernightProjectile.class, "Evernight Projectile");
        ModMobRegistry.registerProjectile(EntityBouncingProjectile.class, "Bouncing Projectile");
        ModMobRegistry.registerProjectile(EntityWreckExplosiveShot.class, "Wreck Explosive");
        ModMobRegistry.registerProjectile(EntityWreckStrengthShot.class, "Wreck Strength");
        ModMobRegistry.registerProjectile(EntityMandragoraProjectile.class, "Mandragora Projectile");

		Spawn();
	}

	public static void Spawn(){
		EntityRegistry.addSpawn(EntityVermenous.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityCymesoid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDreamwrecker.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDuo.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityTwins.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityBohemite.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityTocaxin.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityMandragora.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityShadahier.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLheiva.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityHoverStinger.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityAcidHag.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityKazrotic.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityVhraak.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityEndiku.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityHelio.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityBiphron.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityZoragon.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityGorgosion.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityDissiment.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityZone.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLorga.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityLorgaFlight.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});	
        EntityRegistry.addSpawn(EntityGalroid.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer1.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer2.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityMysteriousManLayer3.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        
        EntityRegistry.addSpawn(EntityEhu.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityVermsillion.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityHusk.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
        EntityRegistry.addSpawn(EntityStoneGolem.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arksianeBiome});
	}

}
