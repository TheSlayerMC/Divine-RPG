package net.divinerpg.helper;

import net.divinerpg.arcana.block.RenderPheonixAltar;
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
import net.divinerpg.block.model.RenderDemonFurnace;
import net.divinerpg.block.model.RenderDemonItem;
import net.divinerpg.block.model.RenderStatue;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.iceika.mobs.EntityRoamer;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.mob.entity.item.EntityFirefly;
import net.divinerpg.mob.entity.item.EntityGrenade;
import net.divinerpg.mob.entity.item.EntityLamona;
import net.divinerpg.mob.entity.item.EntityMerikMissile;
import net.divinerpg.mob.entity.item.EntityReflector;
import net.divinerpg.mob.entity.item.EntitySparkler;
import net.divinerpg.mob.entity.item.EntityStarfall;
import net.divinerpg.overworld.block.tileentity.TileEntityDemonFurnace;
import net.divinerpg.overworld.block.tileentity.TileEntityDramixAltar;
import net.divinerpg.overworld.block.tileentity.TileEntityExtractor;
import net.divinerpg.overworld.block.tileentity.TileEntityParasectaAltar;
import net.divinerpg.render.entity.RenderBasicProjectile;
import net.divinerpg.render.entity.RenderDramix;
import net.divinerpg.render.entity.RenderDramixAltar;
import net.divinerpg.render.entity.RenderExtractor;
import net.divinerpg.render.entity.RenderParasecta;
import net.divinerpg.render.entity.model.ModelDeathHound;
import net.divinerpg.render.entity.model.ModelDeathcryx;
import net.divinerpg.render.entity.model.ModelDramix;
import net.divinerpg.render.entity.model.ModelDungeonDemon;
import net.divinerpg.render.entity.model.ModelDungeonPrisoner;
import net.divinerpg.render.entity.model.ModelLeorna;
import net.divinerpg.render.entity.model.ModelParasecta;
import net.divinerpg.render.entity.model.ModelParatiku;
import net.divinerpg.render.entity.model.ModelRazorback;
import net.divinerpg.render.entity.model.ModelRoamer;
import net.divinerpg.render.entity.model.ModelSamek;
import net.divinerpg.render.entity.model.ModelSeimer;
import net.divinerpg.render.entity.model.ModelTwilightGolem;
import net.divinerpg.render.entity.model.ModelWraith;
import net.divinerpg.render.entity.overworld.RenderDivineMob;
import net.divinerpg.render.entity.overworld.RenderSizeable;
import net.divinerpg.render.item.ItemDramixAltarRenderer;
import net.divinerpg.render.item.ItemExtractorRenderer;
import net.divinerpg.render.item.ItemParasectaAltarRenderer;
import net.divinerpg.twilight.mobs.EntityParatiku;
import net.divinerpg.twilight.mobs.EntitySeimer;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ArcanaMobRendering 
{
	public static EntityResourceLocs x;
	
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderBasicProjectile(x.SPARKLER));
        RenderingRegistry.registerEntityRenderingHandler(EntityReflector.class, new RenderBasicProjectile(x.REFLECTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderBasicProjectile(x.GRENADE));
        RenderingRegistry.registerEntityRenderingHandler(EntityMerikMissile.class, new RenderBasicProjectile(x.MERIK_MISSLE));
        RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, new RenderBasicProjectile(x.FIREFLY));
        RenderingRegistry.registerEntityRenderingHandler(EntityStarfall.class, new RenderBasicProjectile(x.STARFALL));
        RenderingRegistry.registerEntityRenderingHandler(EntityLamona.class, new RenderBasicProjectile(x.LAMONA));

        RenderingRegistry.registerEntityRenderingHandler(EntityRoamer.class, new RenderDivineMob(new ModelRoamer(), 0.0F, x.ROAMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathcryx.class, new RenderDivineMob(new ModelDeathcryx(), 0.0F, x.DEATHCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathHound.class, new RenderDivineMob(new ModelDeathHound(), 0.0F, x.DEATH_HOUND));
        RenderingRegistry.registerEntityRenderingHandler(EntityLeorna.class, new RenderDivineMob(new ModelLeorna(), 0.0F, x.LEORNA));
        RenderingRegistry.registerEntityRenderingHandler(EntityRazorback.class, new RenderDivineMob(new ModelRazorback(), 0.0F, x.RAZORBACK));
        RenderingRegistry.registerEntityRenderingHandler(EntityConstructor.class, new RenderSizeable(new ModelDramix(), 0.0F, 0.5F, x.DUNGEON_CONSTRUCTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityLivingStatue.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.LIVING_STATUE_SLEEP));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonPrisoner.class, new RenderDivineMob(new ModelDungeonPrisoner(), 0.0F, x.DUNGEON_PRISONER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonDemon.class, new RenderDivineMob(new ModelDungeonDemon(), 0.0F, x.DUNGEON_PRISONER));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaptianMerik.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.CAPTAIN_MERIK));
        RenderingRegistry.registerEntityRenderingHandler(EntityDatticon.class, new RenderDivineMob(new ModelSamek(), 0.0F, x.SAMEK));
        RenderingRegistry.registerEntityRenderingHandler(EntityVatticus.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.VATTICUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityZelus.class, new RenderDivineMob(new ModelBiped(), 0.0F, x.ZELUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFyracryx.class, new RenderDivineMob(new ModelDeathcryx(), 0.0F, x.FYRACRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityParatiku.class, new RenderDivineMob(new ModelParatiku(), 0.0F, x.PARATIKU));
        RenderingRegistry.registerEntityRenderingHandler(EntityGolemOfRejuv.class, new RenderDivineMob(new ModelTwilightGolem(), 0.0F, 0.5F, x.GOLEM_REJUV));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeimer.class, new RenderDivineMob(new ModelSeimer(), 0.0F, x.SEIMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, new RenderDivineMob(new ModelWraith(), 0.0F, x.WRAITH));

        RenderingRegistry.registerEntityRenderingHandler(EntityDramix.class, new RenderDramix(new ModelDramix(), 1.0F, x.DRAMIX));
        RenderingRegistry.registerEntityRenderingHandler(EntityParasecta.class, new RenderParasecta(new ModelParasecta(), 1.0F, 1.0F, x.PARASECTA));
	
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityParasectaAltar.class, new RenderPheonixAltar());  
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.parasectaAltar.blockID, new ItemParasectaAltarRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExtractor.class, new RenderExtractor());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.extractor.blockID, new ItemExtractorRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDramixAltar.class, new RenderDramixAltar());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.dramixAltar.blockID, new ItemDramixAltarRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDemonFurnace.class, new RenderDemonFurnace());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.demonFurnace.blockID, new RenderDemonItem());
	}
}
