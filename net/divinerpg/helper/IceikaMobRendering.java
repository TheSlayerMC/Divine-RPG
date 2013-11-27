package net.divinerpg.helper;

import net.divinerpg.iceika.mobs.EntityAlicanto;
import net.divinerpg.iceika.mobs.EntityFractite;
import net.divinerpg.iceika.mobs.EntityFrostArcher;
import net.divinerpg.iceika.mobs.EntityGlacide;
import net.divinerpg.iceika.mobs.EntityHastreus;
import net.divinerpg.iceika.mobs.EntityRollum;
import net.divinerpg.iceika.mobs.EntityWorkshopMerchant;
import net.divinerpg.iceika.mobs.EntityWorkshopTickerer;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.render.entity.RenderFrostArcher;
import net.divinerpg.render.entity.model.ModelAlicanto;
import net.divinerpg.render.entity.model.ModelFractite;
import net.divinerpg.render.entity.model.ModelGlacide;
import net.divinerpg.render.entity.model.ModelHastreus;
import net.divinerpg.render.entity.model.ModelRollum;
import net.divinerpg.render.entity.model.ModelWorkshop;
import net.divinerpg.render.entity.overworld.RenderDivineMob;
import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class IceikaMobRendering 
{
	public static EntityResourceLocs x;
	
	public static void init()
	{
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderDivineMob(new ModelAlicanto(), 0.0F, x.ALICANTO));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderDivineMob(new ModelFractite(), 2.0F, 2.0F, x.FRACTITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderDivineMob(new ModelGlacide(), 0.0F, 1.0F, x.GLACON));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderDivineMob(new ModelHastreus(), 0.0F, x.HASTERUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderFrostArcher(new ModelBiped(), 0.0F, x.FROZEN_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderDivineMob(new ModelRollum(), 0.0F, x.ROLLUM));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderDivineMob(new ModelWorkshop(), 0.0F, x.WORKSHOP_TINKER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderDivineMob(new ModelWorkshop(), 0.0F, x.WORKSHOP_MERCHANT));
        
       // RenderingRegistry.registerEntityRenderingHandler(EntityFractiteProjectile.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
        //RenderingRegistry.registerEntityRenderingHandler(EntityCrabclawProjectile.class, new RenderBasicProjectile(187, "/Xolovon3.png"));
       // RenderingRegistry.registerEntityRenderingHandler(EntityNoteProjectile.class, new RenderMusicNote(8));
	}
}
