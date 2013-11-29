package net.divinerpg.helper.handlers;

import java.awt.Color;
import java.awt.Point;
import java.util.EnumSet;

import net.divinerpg.arcana.ArcanaHelper;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Reference;
import net.divinerpg.misc.BossBar;
import net.divinerpg.overworld.mobs.EntityAncient;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class ClientTickHandler implements ITickHandler
{
	private static boolean initialized = false;

	@Override
	public void tickStart(EnumSet var1, Object ... mc) {
		onTickInGame();
	}

	@Override
	public void tickEnd(EnumSet var1, Object ... mc) {
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;

		if (!var1.equals(EnumSet.of(TickType.RENDER)) && var1.equals(EnumSet.of(TickType.CLIENT)) && FMLClientHandler.instance().getClient().currentScreen == null && !initialized)
		{
			initialized = true;
			FMLClientHandler.instance().getClient().ingameGUI.getChatGUI().printChatMessage(EnumChatFormatting.GREEN + "Thank you " + player.username + " for downloading and playing DivineRPG!");
		}
		else if (var1.equals(EnumSet.of(TickType.RENDER)))
		{
			onRenderTick();
			onBossTick();
		}

	}


	@Override
	public EnumSet ticks() {
		return EnumSet.of(TickType.RENDER, TickType.CLIENT, TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return "DivineRPG Client Ticks";
	}
    public static final ResourceLocation ancient = new ResourceLocation(Reference.MOD_ID + ":" + "textures/gui/BossBars/AncientEntity.png");

	public void onBossTick() {
		GuiIngame gig = mc.ingameGUI;

		        if (BossBar.bossName != null && BossBar.statusBarLength > 0)
		        {
		            --BossBar.statusBarLength;
		            FontRenderer fontrenderer = this.mc.fontRenderer;
		            ScaledResolution scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
		            int i = scaledresolution.getScaledWidth();
		            short short1 = 182;
		            int j = i / 2 - short1 / 2;
		            int k = (int)(BossBar.healthScale * (float)(short1 + 1));
		            byte b0 = 12;
		            gig.drawTexturedModalRect(j, b0, 0, 0, short1, 10);
		            gig.drawTexturedModalRect(j, b0, 0, 10, short1, 10);

		            if (k > 0){
		            	
		            	gig.drawTexturedModalRect(j, b0, 0, 0, k, 10);
		            }

		            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		            this.mc.getTextureManager().bindTexture(ancient);
		        }
		    }
	
	public void onRenderTick() {

		Minecraft mc = Minecraft.getMinecraft();
		GuiIngame gig = mc.ingameGUI;
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		World world = FMLClientHandler.instance().getClient().theWorld;
		if(mc.currentScreen == null) {
		int var29;
		int var19;
		int var26;
		int var47;
		ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int k = scaledresolution.getScaledHeight();
		this.mc.getTextureManager().bindTexture(new ResourceLocation("DivineRPG:textures/gui/ArcanaBar.png"));
		var26 = k - 18;
		var29 = i - 111;
		gig.drawTexturedModalRect(var29, var26, 0, 0, 99, 9);
		gig.drawTexturedModalRect(var29, var26, 0, 9, (int)(12.5 * (ArcanaHelper.getBarValue() / 25)), 18);  
		}
	}

	Minecraft mc = Minecraft.getMinecraft();

	ScaledResolution scaledresolution = new ScaledResolution(mc.gameSettings, mc.displayWidth, mc.displayHeight);

	int height = scaledresolution.getScaledHeight();
	int width = scaledresolution.getScaledWidth();
	GuiIngame gig = mc.ingameGUI;
	World world = FMLClientHandler.instance().getClient().theWorld;
	EntityAncient entity = new EntityAncient(world);	

	// ================== CONSTANTS ======================== //
	final int tempArcana = 400; // Test value!! Will be weird if it's larger than the barWidth!
	final int startY = (scaledresolution.getScaledHeight() - 30) * 2;
	final int startX = (scaledresolution.getScaledWidth() - 250) * 2;
	final int barHeight = 40;
	final int barWidth = 400;
	final int lines = 6;
	final int vertexes = 14;
	final int vertexSpread = 30;
	final int colorOutline = 0x8EC7FF;
	final int colorInside = 0x46A3FF;
	final int colorGray = 0x888888;
	final float insideBarWidth = 1.5F;
	final float outlineBarWidth =  3F;
	final float grayBarWidth = 2F;
	// ====================================================== /
/*
	//GL11.glPushMatrix();
	//GL11.glScalef(0.5F, 0.5F, 0.5F);
	//startDrawingLines();
	int distancePerVertex = (tempArcana / vertexes);
	int distancePer = (barHeight / lines);
	int lastX = 0;
	{
		if(mc.currentScreen == null && entity != null)
		{		

			int xBoss;
			int zBoss;

			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			xBoss = i / 2;
			zBoss = k / 2 - 20;			
			//GL11.glBindTexture(GL11.GL_TEXTURE_2D, mc.renderEngine.getTexture(ResourceLocs.GUI_ANCIENT_ENTITY).getGlTextureId());
			//gig.drawTexturedModalRect(xBoss, zBoss, 0, 0, 91, 10);
			gig.drawTexturedModalRect(xBoss, zBoss, 0, 10, entity.getAncientHealth() / 18, 20);
		}

		/*for(int i = 0; i < lines; i++) {
					int[] vertexArray = new int[vertexes + 1];
					vertexArray[0] = vertexArray[vertexes] = startY + distancePer * i;
					for(int j = 0; j < (vertexes - 1); j++)
						vertexArray[j + 1] = (int) Math.round(((startY + distancePer * i) + (Math.random() - 0.5) * vertexSpread));

					for(int j = 0; j < vertexes; j++) {
						drawSimpleLine(new Point(startX + distancePerVertex * j, vertexArray[j]), new Point(startX + distancePerVertex * (j + 1), vertexArray[j + 1]), outlineBarWidth, colorOutline, 0.6F);
						drawSimpleLine(new Point(startX + distancePerVertex * j, vertexArray[j]), new Point(startX + distancePerVertex * (j + 1), vertexArray[j + 1]), insideBarWidth, colorInside, 1F);
						lastX = startX + distancePerVertex * (j + 1);
					}	 
				}

				for(int i = 0; i < lines; i++)
					drawSimpleLine(new Point(lastX, startY + distancePer * i), new Point(startX + barWidth, startY + distancePer * i), grayBarWidth, colorGray, 1F);
				endDrawingLines();
				GL11.glPopMatrix();
			}


	}*/



	/** Sets the GL values to draw lines **/
	public static void startDrawingLines() {
		GL11.glDisable(GL11.GL_TEXTURE_2D);
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
	}

	/** Draws a line in the plane from point A to point B **/
	public static void drawSimpleLine(Point pointA, Point pointB, float width, int color, float transparency) {
		GL11.glLineWidth(width);
		GL11.glBegin(GL11.GL_LINES);
		Color colorRGB = new Color(color);
		GL11.glColor4ub((byte) colorRGB.getRed(), (byte) colorRGB.getGreen(), (byte) colorRGB.getBlue(), (byte) (transparency * 255));
		GL11.glVertex2i(pointA.x, pointA.y);
		GL11.glVertex2i(pointB.x, pointB.y);
		GL11.glEnd();
	}

	/** Reverts the GL values for drawing lines **/
	public static void endDrawingLines() {
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glColor4f(1F, 1F, 1F, 1F);
	}

	public void onTickInGUI(GuiScreen var1) {}

	public void onTickInGame()
	{
		Minecraft mc = Minecraft.getMinecraft();
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		WorldClient world = mc.theWorld;
		//DamageSource d;
		
		

		if (player != null)
		{
			ItemStack boots = player.inventory.armorInventory[0];
			ItemStack legs = player.inventory.armorInventory[1];
			ItemStack chest = player.inventory.armorInventory[2];
			ItemStack helm = player.inventory.armorInventory[3];
			if ((boots == null || legs == null || chest == null || helm == null))
			{
				if (player.capabilities.isCreativeMode)
				{
					player.capabilities.allowFlying = true;
				}
				else
				{
					player.capabilities.allowFlying = false;
					player.capabilities.isFlying = false;
				}
				//player.capabilities.setFlySpeed(0.1F);
			}
			else if (boots.itemID == OverworldItemHelper.angelicBoots.itemID
					&& legs.itemID == OverworldItemHelper.angelicLegs.itemID
					&& chest.itemID == OverworldItemHelper.angelicBody.itemID 
					&& helm.itemID == OverworldItemHelper.angelicHelmet.itemID)
			{
				player.capabilities.allowFlying = true;
				player.fallDistance = 0;
				//minecraftInstance.thePlayer.isImmuneToFire = true; //<--That line will make the player immune to fire.
				//minecraftInstance.thePlayer.fallDistance = 0; //<-- That line will make the player take no fall damage.
				//minecraftInstance.thePlayer.fireResistance(20); //<-- That line will make the player have less fire damage.
				//minecraftInstance.thePlayer.capabilities.isFlying = true; //<-- That line may make the player fly, but I'm not entirely sure.
			}
			else if (boots.itemID == OverworldItemHelper.eliteRealmiteBoots.itemID
					&& legs.itemID == OverworldItemHelper.eliteRealmiteLegs.itemID
					&& chest.itemID == OverworldItemHelper.eliteRealmiteBody.itemID
					&& helm.itemID == OverworldItemHelper.eliteRealmiteHelmet.itemID)
			{
				player.fallDistance = 0;
			}
			else if (boots.itemID == OverworldItemHelper.shadowBoots.itemID
					&& legs.itemID == OverworldItemHelper.shadowLegs.itemID
					&& chest.itemID == OverworldItemHelper.shadowBody.itemID
					&& helm.itemID == OverworldItemHelper.shadowHelmet.itemID)
			{
				player.capabilities.setPlayerWalkSpeed(0.2F);
			}
			
			else if(boots.itemID == OverworldItemHelper.krakenBoots.itemID
					&& legs.itemID == OverworldItemHelper.krakenLegs.itemID
					&& chest.itemID == OverworldItemHelper.krakenBody.itemID
					&& helm.itemID == OverworldItemHelper.krakenHelmet.itemID){
				player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 1, 1));
			}
			else if (boots.itemID == IceikaItemHelper.santaBoots.itemID
					&& legs.itemID == IceikaItemHelper.santaLegs.itemID
					&& chest.itemID == IceikaItemHelper.santaBody.itemID
					&& helm.itemID == IceikaItemHelper.santaHead.itemID)
			{
				player.capabilities.setPlayerWalkSpeed(0.2F);
			}
			/*
			else if (boots.itemID == VetheaItemHelper.glisteningBoots.itemID
					&& legs.itemID == VetheaItemHelper.glisteningLegs.itemID
					&& chest.itemID == VetheaItemHelper.glisteningChest.itemID
					&& helm.itemID == VetheaItemHelper.glisteningHelmetRanged.itemID)
			{
				player.capabilities.setPlayerWalkSpeed(0.14F);
			}
			else if (boots.itemID == VetheaItemHelper.demonizedBoots.itemID
					&& legs.itemID == VetheaItemHelper.demonizedLegs.itemID
					&& chest.itemID == VetheaItemHelper.demonizedChest.itemID
					&& helm.itemID == VetheaItemHelper.demonizedHelmetRanged.itemID)
			{
				player.capabilities.setPlayerWalkSpeed(0.18F);
			}
			else if (boots.itemID == VetheaItemHelper.tormentedBoots.itemID
					&& legs.itemID == VetheaItemHelper.tormentedLegs.itemID
					&& chest.itemID == VetheaItemHelper.tormentedChest.itemID
					&& helm.itemID == VetheaItemHelper.tormentedHelmetRanged.itemID)
			{
				player.capabilities.setPlayerWalkSpeed(0.2F);
			}*/
			
			
			else if (boots.itemID == OverworldItemHelper.aquaticBoots.itemID
					&& legs.itemID == OverworldItemHelper.aquaticLegs.itemID
					&& chest.itemID == OverworldItemHelper.aquaticBody.itemID
					&& helm.itemID == OverworldItemHelper.aquaticHelmet.itemID)
			{

				int var5 = MathHelper.floor_double(player.posX);
				int var6 = MathHelper.floor_double(player.posY - 2.0D);
				int var7 = MathHelper.floor_double(player.posZ);


				// Ice effect Test  \\


				if (world.getBlockId(var5, var6, var7) == IceikaBlockHelper.IceGrass.blockID)
				{


					player.motionX *= 1.11D;
					player.motionZ *= 1.11D;

					double maxMotion = 1.12D;

					if (player.motionX > maxMotion)
						player.motionX = maxMotion;
					else if (player.motionX < - maxMotion)
						player.motionX = -maxMotion;

					if (player.motionZ > maxMotion)
						player.motionZ = maxMotion;
					else if (player.motionZ < - maxMotion)
						player.motionZ = -maxMotion;

				} 
			}
			else
			{
				player.capabilities.setPlayerWalkSpeed(0.1F);
			}
		}	
	}
}

