package net.divinerpg.helper;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.render.entity.*;
import net.divinerpg.render.entity.model.*;
import net.divinerpg.render.entity.overworld.*;
import net.divinerpg.twilight.mobs.*;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TwilightMobRendering 
{
	public static EntityResourceLocs x;
	
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityArrow.class, new RenderBasicArrow(x.DRAVITE_ARROW));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArrow.class, new RenderBasicArrow(x.MYTHRIL_ARROW));
        RenderingRegistry.registerEntityRenderingHandler(EntityFuryArrow.class, new RenderBasicArrow(x.FURY_ARROW));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerDravite.class, new RenderTeakerDisc(TwilightItemHelper.DraviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAzurite.class, new RenderTeakerDisc(TwilightItemHelper.AzuriteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerUvite.class, new RenderTeakerDisc(TwilightItemHelper.UviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMythril.class, new RenderTeakerDisc(TwilightItemHelper.MythrilSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAugite.class, new RenderTeakerDisc(TwilightItemHelper.AugiteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderTeakerDisc(TwilightItemHelper.HaliteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzDravite.class, new RenderBasicProjectile(x.BLITZ_DRAVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAzurite.class, new RenderBasicProjectile(x.BLITZ_AZURITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzUvite.class, new RenderBasicProjectile(x.BLITZ_UVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMythril.class, new RenderBasicProjectile(x.BLITZ_MYTHRIL));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAugite.class, new RenderBasicProjectile(x.BLITZ_AUGITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderBasicProjectile(x.BLITZ_HALITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserDravite.class, new RenderBasicProjectile(x.PHASER_DRAVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAzurite.class, new RenderBasicProjectile(x.PHASER_AZURITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserUvite.class, new RenderBasicProjectile(x.PHASER_UVITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMythril.class, new RenderBasicProjectile(x.PHASER_MYTHRIL));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAugite.class, new RenderBasicProjectile(x.PHASER_AUGITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderBasicProjectile(x.PHASER_HALITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzFury.class, new RenderBasicProjectile(x.BLITZ_FURY));

        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityDraviteTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.DRAVITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityBunny.class, new RenderDivineMob(new ModelBunny(), 0.0F, x.BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderSizeable(new ModelAngryBunny(), 0.0F, 2.0F, x.ANGRY_BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderDivineMob(new ModelCori(), 0.0F, x.WEAK_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderBasicProjectile(x.WEAK_CORI_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderDivineMob(new ModelMadivel(), 0.0F, x.MADIVEL));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderDivineMob(new ModelNesro(), 0.0F, x.NESRO));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.AZURITE_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.AZURITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.VAREK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderDivineMob(new ModelMoonWolf(), 0.0F, x.TWILIGHT_WOLF));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyTomo.class, new RenderDivineMob(new ModelTomo(), 0.0F, x.ENERGY_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.ENERGY_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityEchantedWarrior.class, new RenderEnchantedWarrior(new ModelEnchantedWarrior(), 0.0F, x.ENCHANTED_WARRIOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), 0.0F, x.TWILIGHT_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), 0.0F, x.MYTHRIL_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.SAMEK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilGolem.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, x.MYTHRIL_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderDivineMob(new ModelCori(), 0.0F, x.ADVANCED_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilFiend.class, new RenderDivineMob(new ModelMytrilFiend(), 0.0F, x.MYTHRIL_FIEND));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseCadillion.class, new RenderDivineMob(new ModelCadillion(), 0.0F, x.DENSE_CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseDemon.class, new RenderDivineMob(new ModelDenseDemon(), 0.0F, x.DENSE_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderDivineMob(new ModelBasalisk(), 0.0F, x.BASALISK));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderDivineMob(new ModelSoulStealer(), 0.0F, x.SOUL_STEALER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDivineMob(new ModelDensos(), 0.0F, x.DENSOS));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderDivineMob(new ModelDensos(), 0.0F, x.REYVOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderSizeable(new ModelTwilightDemon(), 0.0F, 2.0F, x.TWILIGHT_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSizeable(new ModelSoulFiend(), 0.0F, 1.0F, x.SOUL_FIEND));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderSizeable(new ModelVamacheron(), 0.0F, 3.0F, x.VAMACHERON));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderSizeable(new ModelKarot(), 0.0F, 5.0F, x.KAROT));
	}
}
