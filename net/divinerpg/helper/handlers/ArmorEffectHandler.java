package net.divinerpg.helper.handlers;

import net.divinerpg.helper.config.DimensionConfigHelper;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class ArmorEffectHandler  {
	
	EntityPlayer player;
	
	@ForgeSubscribe
    public void onLivingHurtEvent(LivingHurtEvent e) {
		if (!(e.entityLiving instanceof EntityPlayer))
			return;
		
		EntityPlayer var5 = (EntityPlayer)e.entityLiving;
		ItemStack boots = var5.inventory.armorInventory[0];
		ItemStack legs = var5.inventory.armorInventory[1];
		ItemStack chest = var5.inventory.armorInventory[2];
		ItemStack helm = var5.inventory.armorInventory[3];

		int bootID = 0;
		int chestID = 0;
		int legID = 0;
		int helmID = 0;
		if (boots != null)
		{
			bootID = boots.itemID;
		}
		if (chest != null)
		{
			chestID = chest.itemID;
		}
		if (legs != null)
		{
			legID = legs.itemID;
		}
		if (helm != null)
		{
			helmID = helm.itemID;
		}
		DamageSource s = e.source;

		//Netherite
		if (bootID == OverworldItemHelper.netheriteBoots.itemID
					&& legID == OverworldItemHelper.netheriteLegs.itemID
					&& chestID == OverworldItemHelper.netheriteBody.itemID
					&& helmID == OverworldItemHelper.netheriteHelmet.itemID)
			{
				if (s.equals(DamageSource.inFire) || s.equals(DamageSource.onFire))
				{
					e.setCanceled(true);
				}
			}

		//Inferno
		else if (bootID == OverworldItemHelper.infernoBoots.itemID
					&& legID == OverworldItemHelper.infernoLegs.itemID
					&& chestID == OverworldItemHelper.infernoBody.itemID
					&& helmID == OverworldItemHelper.infernoHelmet.itemID)
			{
				if (s == DamageSource.inFire || s == DamageSource.onFire || s == DamageSource.lava)
				{
					e.setCanceled(true);
				}
			}

		
			//Wither Reaper
		if (bootID == OverworldItemHelper.grimReaperBoots.itemID
					&& legID == OverworldItemHelper.grimReaperLegs.itemID
					&& chestID == OverworldItemHelper.grimReaperBody.itemID
					&& helmID == OverworldItemHelper.grimReaperHead.itemID)
			{
				if (s == DamageSource.wither)
				{
					e.setCanceled(true);
				}
			}

		/*//Ender
		else if (bootID == OverworldItemHelper.enderBoots.itemID
					&& legID == OverworldItemHelper.enderLegs.itemID
					&& chestID == OverworldItemHelper.enderBody.itemID
					&& helmID == OverworldItemHelper.enderHead.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

		//Red Ender
		else if (bootID == OverworldItemHelper.enderBootsRed.itemID
					&& legID == OverworldItemHelper.enderLegsRed.itemID
					&& chestID == OverworldItemHelper.enderBodyRed.itemID
					&& helmID == OverworldItemHelper.enderHeadRed.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

		//Blue Ender
	else if (bootID == OverworldItemHelper.enderBootsBlue.itemID
					&& legID == OverworldItemHelper.enderLegsBlue.itemID
					&& chestID == OverworldItemHelper.enderBodyBlue.itemID
					&& helmID == OverworldItemHelper.enderHeadBlue.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

			//Green Ender
			else if (bootID == OverworldItemHelper.enderBootsGreen.itemID
					&& legID == OverworldItemHelper.enderLegsGreen.itemID
					&& chestID == OverworldItemHelper.enderBodyGreen.itemID
					&& helmID == OverworldItemHelper.enderHeadGreen.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

		//Yellow Ender
		else if (bootID == OverworldItemHelper.enderBootsYellow.itemID
					&& legID == OverworldItemHelper.enderLegsYellow.itemID
					&& chestID == OverworldItemHelper.enderBodyYellow.itemID
					&& helmID == OverworldItemHelper.enderHeadYellow.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}

		//Black Ender
		else if (bootID == OverworldItemHelper.enderBootsBlack.itemID
					&& legID == OverworldItemHelper.enderLegsBlack.itemID
					&& chestID == OverworldItemHelper.enderBodyBlack.itemID
					&& helmID == OverworldItemHelper.enderHeadBlack.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2)
				{
					e.setCanceled(true);
				}
			}*/

		//Bedrock
		/*else if (bootID == OverworldItemHelper.bedrockBoots.itemID
					&& legID == OverworldItemHelper.bedrockLegs.itemID
					&& chestID == OverworldItemHelper.bedrockBody.itemID
					&& helmID == OverworldItemHelper.bedrockHelmet.itemID)
			{
				if (s == DamageSource.explosion || s == DamageSource.explosion2 ||
						s == DamageSource.lava || s == DamageSource.inFire || s == DamageSource.onFire)
				{
					e.setCanceled(true);
				}
			}*/

		//Elite Realmite
		

		//Arlemite
		else if (bootID == OverworldItemHelper.arlemiteBoots.itemID
					&& legID == OverworldItemHelper.arlemiteLegs.itemID
					&& chestID == OverworldItemHelper.arlemiteBody.itemID
					&& helmID == OverworldItemHelper.arlemiteHelmet.itemID)
			{
				if (s.isProjectile() || s.damageType.equals("thrown"))
				{
					e.ammount *= 0.2;
				}
			}

		//Rupee
		else if (bootID == OverworldItemHelper.rupeeBoots.itemID
					&& legID == OverworldItemHelper.rupeeLegs.itemID
					&& chestID == OverworldItemHelper.rupeeBody.itemID
					&& helmID == OverworldItemHelper.rupeeHelmet.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}

		/*//Rupee Red
		else if (bootID == OverworldItemHelper.plasmaBootsRed.itemID
					&& legID == OverworldItemHelper.plasmaLegsRed.itemID
					&& chestID == OverworldItemHelper.plasmaBodyRed.itemID
					&& helmID == OverworldItemHelper.plasmaHeadRed.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}

		//Rupee Green
		else if (bootID == OverworldItemHelper.plasmaBootsGreen.itemID
					&& legID == OverworldItemHelper.plasmaLegsGreen.itemID
					&& chestID == OverworldItemHelper.plasmaBodyGreen.itemID
					&& helmID == OverworldItemHelper.plasmaHeadGreen.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}

		//Rupee Yellow
		else if (bootID == OverworldItemHelper.plasmaBootsYellow.itemID
					&& legID == OverworldItemHelper.plasmaLegsYellow.itemID
					&& chestID == OverworldItemHelper.plasmaBodyYellow.itemID
					&& helmID == OverworldItemHelper.plasmaHeadYellow.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}

		//Rupee Blue
		else if (bootID == OverworldItemHelper.plasmaBootsBlue.itemID
					&& legID == OverworldItemHelper.plasmaLegsBlue.itemID
					&& chestID == OverworldItemHelper.plasmaBodyBlue.itemID
					&& helmID == OverworldItemHelper.plasmaHeadBlue.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}

		//Rupee Black
		else if (bootID == OverworldItemHelper.plasmaBootsBlack.itemID
					&& legID == OverworldItemHelper.plasmaLegsBlack.itemID
					&& chestID == OverworldItemHelper.plasmaBodyBlack.itemID
					&& helmID == OverworldItemHelper.plasmaHeadBlack.itemID)
			{
				if (s == DamageSource.generic || (s.damageType.equals("mob") && !s.isProjectile()))
				{
					e.ammount *= 0.2;
				}
			}*/

		//santa
		else if (bootID == IceikaItemHelper.santaBoots.itemID
				&& legID == IceikaItemHelper.santaLegs.itemID
				&& chestID == IceikaItemHelper.santaBody.itemID
				&& helmID == IceikaItemHelper.santaHead.itemID)
		{
			if (e.entityLiving.worldObj.provider.dimensionId == DimensionConfigHelper.IceikaID)
			{
				e.ammount *= 0.2;
			}
		}

		//Divine
		/*else if (bootID == TwilightItemHelper.divineBoots.itemID
					&& legID == TwilightItemHelper.divineLegs.itemID
					&& chestID == TwilightItemHelper.divineBody.itemID
					&& helmID == TwilightItemHelper.divineHelmet.itemID)
			{
				if (s == DamageSource.fall)
				{
					e.setCanceled(true);
				}
			}*/

		//Divine
		else if (bootID == TwilightItemHelper.MythrilBoots.itemID
					&& legID == TwilightItemHelper.Mythrillegs.itemID
					&& chestID == TwilightItemHelper.MythrilChest.itemID
					&& helmID == TwilightItemHelper.MythrilHelmet.itemID)
			{
				if (s == DamageSource.fall)
				{
					e.setCanceled(true);
				}
			}

		//Uvite
		else if (bootID == TwilightItemHelper.UviteBoots.itemID
					&& legID == TwilightItemHelper.Uvitelegs.itemID
					&& chestID == TwilightItemHelper.UviteChest.itemID
					&& helmID == TwilightItemHelper.UviteHelmet.itemID)
			{
				if (s == DamageSource.cactus || s == DamageSource.fallingBlock || s == DamageSource.anvil || s == DamageSource.inWall)
				{
					e.setCanceled(true);
				}
			}

		/*//Degraded Melee
		else if (helmID == DivineRPG.degradedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//Degraded Ranged
		else if (helmID == DivineRPG.degradedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//Degraded Arcana
		else if (helmID == DivineRPG.degradedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.degradedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.degradedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.degradedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//glistening Melee
		else if (helmID == DivineRPG.glisteningHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//glistening Ranged
		else if (helmID == DivineRPG.glisteningHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//glistening Arcana
		else if (helmID == DivineRPG.glisteningHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.glisteningChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.glisteningLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.glisteningBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//finished Melee
		else if (helmID == DivineRPG.finishedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//finished Ranged
		else if (helmID == DivineRPG.finishedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//finished Arcana
		else if (helmID == DivineRPG.finishedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.finishedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.finishedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.finishedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//demonized Melee
		else if (helmID == DivineRPG.demonizedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//demonized Ranged
		else if (helmID == DivineRPG.demonizedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}
			
		//demonized Arcana
		else if (helmID == DivineRPG.demonizedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.demonizedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.demonizedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.demonizedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//tormented Melee
		else if (helmID == DivineRPG.tormentedHelmetMelee.itemID)
			{
				if (this.isMelee(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//tormented Ranged
		else if (helmID == DivineRPG.tormentedHelmetRanged.itemID)
			{
				if (this.isRanged(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}

		//tormented Arcana
		else if (helmID == DivineRPG.tormentedHelmetArcana.itemID)
			{
				if (this.isArcana(s))
				{
					double a = 0.15 * 0.2;
					if (chestID == DivineRPG.tormentedChest.itemID)
					{
						a += 0.15 * 0.4;
					}
					if (legID == DivineRPG.tormentedLegs.itemID)
					{
						a += 0.15 * 0.3;
					}
					if (bootID == DivineRPG.tormentedBoots.itemID)
					{
						a += 0.15 * 0.1;
					}

					e.ammount *= 1 - a;
				}
			}*/
}

	@ForgeSubscribe
	public void onLivingJumpEvent(LivingJumpEvent e)
	{
		if (e.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer var5 = (EntityPlayer)e.entityLiving;
			ItemStack boots = var5.inventory.armorInventory[0];
			ItemStack legs = var5.inventory.armorInventory[1];
			ItemStack chest = var5.inventory.armorInventory[2];
			ItemStack helm = var5.inventory.armorInventory[3];
			int bootID = 0;
			int chestID = 0;
			int legID = 0;
			int helmID = 0;
			if (boots != null)
			{
				bootID = boots.itemID;
			}
			if (chest != null)
			{
				chestID = chest.itemID;
			}
			if (legs != null)
			{
				legID = legs.itemID;
			}
			if (helm != null)
			{
				helmID = helm.itemID;
			}
			//Mythril
			if (bootID == TwilightItemHelper.MythrilBoots.itemID
						&& legID == TwilightItemHelper.Mythrillegs.itemID
						&& chestID == TwilightItemHelper.MythrilChest.itemID
						&& helmID == TwilightItemHelper.MythrilHelmet.itemID)
				{
					var5.addVelocity(0, 0.5D, 0);
				}
	
			//Divine
		        else if (bootID == TwilightItemHelper.divineBoots.itemID
						&& legID == TwilightItemHelper.divineLegs.itemID
						&& chestID == TwilightItemHelper.divineBody.itemID
						&& helmID == TwilightItemHelper.divineHelmet.itemID)
				{
					var5.addVelocity(0, 0.2D, 0);
				}

			/*//glistening
			else if (helmID == DivineRPG.glisteningHelmetArcana.itemID
						&& legID == DivineRPG.glisteningLegs.itemID
						&& chestID == DivineRPG.glisteningChest.itemID
						&& bootID == DivineRPG.glisteningBoots.itemID)
				{
					var5.addVelocity(0, 0.2D, 0);
				}
	
			//demonized
			else if (helmID == DivineRPG.demonizedHelmetArcana.itemID
						&& legID == DivineRPG.demonizedLegs.itemID
						&& chestID == DivineRPG.demonizedChest.itemID
						&& bootID == DivineRPG.demonizedBoots.itemID)
				{
					var5.addVelocity(0, 0.3D, 0);
				}
	
			//tormented
			else if (helmID == DivineRPG.tormentedHelmetArcana.itemID
						&& legID == DivineRPG.tormentedLegs.itemID
						&& chestID == DivineRPG.tormentedChest.itemID
						&& bootID == DivineRPG.tormentedBoots.itemID)
				{
					var5.addVelocity(0, 0.4D, 0);
				}*/
		}
    }
	
	private boolean isRanged(DamageSource s)
	{
		if (s.isProjectile() || s.damageType.equals("thrown"))
		{
			return true;
		}
		return false;
	}
	
	private boolean isArcana(DamageSource s)
	{
		if (s.isMagicDamage())
		{
			return true;
		}
		return false;
	}
	
	private boolean isMelee(DamageSource s)
	{
		if (!s.isProjectile() && !s.isFireDamage() && !s.isMagicDamage() 
				&& !this.isExplosion(s) && s != DamageSource.fall && s != DamageSource.cactus
				&& s != DamageSource.wither && s != DamageSource.starve)
		{
			return true;
		}
		return false;
	}
	
	private boolean isExplosion(DamageSource s)
	{
		return s.damageType.contains("explosion");
	}
}
