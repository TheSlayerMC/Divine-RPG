package net.divinerpg.helper;


import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.twilight.mobs.EntityAngryBunny;
import net.divinerpg.twilight.mobs.EntityAzuriteGolem;
import net.divinerpg.twilight.mobs.EntityAzuriteTomo;
import net.divinerpg.twilight.mobs.EntityBaslisk;
import net.divinerpg.twilight.mobs.EntityCadillion;
import net.divinerpg.twilight.mobs.EntityCori;
import net.divinerpg.twilight.mobs.EntityCori2;
import net.divinerpg.twilight.mobs.EntityDenseCadillion;
import net.divinerpg.twilight.mobs.EntityDenseDemon;
import net.divinerpg.twilight.mobs.EntityDensos;
import net.divinerpg.twilight.mobs.EntityDraviteTomo;
import net.divinerpg.twilight.mobs.EntityEchantedWarrior;
import net.divinerpg.twilight.mobs.EntityEnergyArcher;
import net.divinerpg.twilight.mobs.EntityEnergyCadillion;
import net.divinerpg.twilight.mobs.EntityEnergyGolem;
import net.divinerpg.twilight.mobs.EntityEnergyTomo;
import net.divinerpg.twilight.mobs.EntityKarot;
import net.divinerpg.twilight.mobs.EntityMadivel;
import net.divinerpg.twilight.mobs.EntityMoonWolf;
import net.divinerpg.twilight.mobs.EntityMythrilArcher;
import net.divinerpg.twilight.mobs.EntityMythrilFiend;
import net.divinerpg.twilight.mobs.EntityMythrilGolem;
import net.divinerpg.twilight.mobs.EntityNesro;
import net.divinerpg.twilight.mobs.EntityReyvor;
import net.divinerpg.twilight.mobs.EntitySamek;
import net.divinerpg.twilight.mobs.EntitySerenityBunny;
import net.divinerpg.twilight.mobs.EntitySoulFiend;
import net.divinerpg.twilight.mobs.EntitySoulStealer;
import net.divinerpg.twilight.mobs.EntityTwilightDemon;
import net.divinerpg.twilight.mobs.EntityVamacheron;
import net.divinerpg.twilight.mobs.EntityVerek;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class TwilightMobRegistry 
{
	
	public static void init()
	{
		ModMobRegistry.registerEntity(EntityCadillion.class, "Cadillion");
        ModMobRegistry.registerEntity(EntityDraviteTomo.class, "Dravite Tomo");
        ModMobRegistry.registerEntity(EntitySerenityBunny.class, "Bunny");
        ModMobRegistry.registerEntity(EntityAngryBunny.class, "Angry Bunny");
        ModMobRegistry.registerEntity(EntityCori.class, "Cori");
        ModMobRegistry.registerEntity(EntityMadivel.class, "Madivel");
        ModMobRegistry.registerEntity(EntityNesro.class, "Nesro");
        ModMobRegistry.registerEntity(EntityAzuriteGolem.class, "Azurite Golem");
        ModMobRegistry.registerEntity(EntityAzuriteTomo.class, "Azurite Tomo");
        ModMobRegistry.registerEntity(EntityVerek.class, "Verek");
        ModMobRegistry.registerEntity(EntityMoonWolf.class, "Moon Wolf");
        ModMobRegistry.registerEntity(EntityEnergyCadillion.class, "Energy Cadillion");
        ModMobRegistry.registerEntity(EntityEnergyTomo.class, "Energy Tomo");
        ModMobRegistry.registerEntity(EntityEnergyGolem.class, "Energy Golem");
        ModMobRegistry.registerEntity(EntityEchantedWarrior.class, "Enchant Warrior");
        ModMobRegistry.registerEntity(EntityMythrilArcher.class, "Mythril Archer");
        ModMobRegistry.registerEntity(EntityEnergyArcher.class, "Twilight Archer");
        ModMobRegistry.registerEntity(EntitySamek.class, "Samek");
        ModMobRegistry.registerEntity(EntityMythrilGolem.class, "Mythril Golem");
        ModMobRegistry.registerEntity(EntityCori2.class, "cori2");
        ModMobRegistry.registerEntity(EntityMythrilFiend.class, "Mythril Fiend");
        ModMobRegistry.registerEntity(EntityDenseCadillion.class, "Dense Cadillion");
        ModMobRegistry.registerEntity(EntityDenseDemon.class, "Dense Demon");
        ModMobRegistry.registerEntity(EntityBaslisk.class, "Baslisk");
        ModMobRegistry.registerEntity(EntitySoulStealer.class, "Soul Stealer");
        ModMobRegistry.registerEntity(EntityDensos.class, "Densos");
        ModMobRegistry.registerEntity(EntityReyvor.class, "Reyvor");
        ModMobRegistry.registerEntity(EntityTwilightDemon.class, "Twilight Demon");
        ModMobRegistry.registerEntity(EntitySoulFiend.class, "Soul Fiend");
        ModMobRegistry.registerEntity(EntityVamacheron.class, "Vamacheron");
        ModMobRegistry.registerEntity(EntityKarot.class, "Karot");
        

        ModMobRegistry.registerProjectile(EntitySerenityArrow.class, "serenityarrow");
        ModMobRegistry.registerProjectile(EntityEnergyArrow.class, "energyarrow");
        ModMobRegistry.registerProjectile(EntityFuryArrow.class, "furyarrow");
        ModMobRegistry.registerProjectile(EntitySlicerDravite.class, "serenityslicer");
        ModMobRegistry.registerProjectile(EntitySlicerAzurite.class, "azuriteslicer");
        ModMobRegistry.registerProjectile(EntitySlicerUvite.class, "energyslicer");
        ModMobRegistry.registerProjectile(EntitySlicerMythril.class, "mythrilslicer");
        ModMobRegistry.registerProjectile(EntitySlicerAugite.class, "denseslicer");
        ModMobRegistry.registerProjectile(EntitySlicerHalite.class, "ultimaslicer");
        ModMobRegistry.registerProjectile(EntityPhaserDravite.class, "serenityphaser");
        ModMobRegistry.registerProjectile(EntityPhaserAzurite.class, "azuritephaser");
        ModMobRegistry.registerProjectile(EntityPhaserUvite.class, "energyphaser");
        ModMobRegistry.registerProjectile(EntityPhaserMythril.class, "mythrilphaser");
        ModMobRegistry.registerProjectile(EntityPhaserAugite.class, "densephaser");
        ModMobRegistry.registerProjectile(EntityPhaserHalite.class, "ultimaphaser");
        ModMobRegistry.registerProjectile(EntityCoriShot.class, "corishot");
        
		addSpawns();
 	}

	public static void addSpawns() 
	{
		EntityRegistry.addSpawn(EntityDraviteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
		EntityRegistry.addSpawn(EntitySerenityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
		EntityRegistry.addSpawn(EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
		EntityRegistry.addSpawn(EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        
		EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityAzuriteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityAzuriteGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.Azurite});;
        
        EntityRegistry.addSpawn(EntityEnergyCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEchantedWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        
        EntityRegistry.addSpawn(EntityMythrilFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityDenseDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityDenseCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
	}
}
