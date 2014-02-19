package net.divinerpg.item;


import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemBaseArmor extends ItemArmor implements ISpecialArmor{

	private String[] descriptors;
	private double damageReduction;
	private String armorPrefix = Reference.MOD_ID + ":" + "textures/models/armor/";
    int durability;
	public boolean unbreakable;
	
	public ItemBaseArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, Boolean par5) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.setCreativeTab(DivineRPG.Armor);
        this.unbreakable = par5;

	}

	public ItemBaseArmor setDamageReduction(double reduc) {
		damageReduction = reduc;
		return this;
	}

	public ItemBaseArmor setDescriptors(String[] descs) {
		descriptors = descs;
		return this;
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
	{
		if (itemstack.itemID == OverworldItemHelper.ironHelmet.itemID || itemstack.itemID == OverworldItemHelper.ironBody.itemID || itemstack.itemID == OverworldItemHelper.ironBoots.itemID){
			return armorPrefix + "Iron_1.png";        
		}
		if (itemstack.itemID == OverworldItemHelper.diamondHelmet.itemID || itemstack.itemID == OverworldItemHelper.diamondBody.itemID || itemstack.itemID == OverworldItemHelper.diamondBoots.itemID){
			return armorPrefix + "Diamond_1.png";
		}        
		if (itemstack.itemID == OverworldItemHelper.grimReaperHead.itemID || itemstack.itemID == OverworldItemHelper.grimReaperBody.itemID || itemstack.itemID == OverworldItemHelper.grimReaperBoots.itemID){
			return armorPrefix + "Skeleman_1.png";
		}       
		if (itemstack.itemID == OverworldItemHelper.jackOManHead.itemID || itemstack.itemID == OverworldItemHelper.jackOManBody.itemID || itemstack.itemID == OverworldItemHelper.jackOManBoots.itemID){
			return armorPrefix + "Pumpkin_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.eliteRealmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBody.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBoots.itemID){
			return armorPrefix + "EliteRealmite_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.krakenHelmet.itemID || itemstack.itemID == OverworldItemHelper.krakenBody.itemID || itemstack.itemID == OverworldItemHelper.krakenBoots.itemID){
			return armorPrefix + "Kraken_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.rupeeHelmet.itemID || itemstack.itemID == OverworldItemHelper.rupeeBody.itemID || itemstack.itemID == OverworldItemHelper.rupeeBoots.itemID){
			return armorPrefix + "Rupee_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.arlemiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBody.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBoots.itemID){
			return armorPrefix + "Arlemite_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.realmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.realmiteBody.itemID || itemstack.itemID == OverworldItemHelper.realmiteBoots.itemID){
			return armorPrefix + "Realmite_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.angelicHelmet.itemID || itemstack.itemID == OverworldItemHelper.angelicBody.itemID || itemstack.itemID == OverworldItemHelper.angelicBoots.itemID){
			return armorPrefix + "Angelic_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.aquaticHelmet.itemID || itemstack.itemID == OverworldItemHelper.aquaticBody.itemID || itemstack.itemID == OverworldItemHelper.aquaticBoots.itemID){
			return armorPrefix + "Aquastrive_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.shadowHelmet.itemID || itemstack.itemID == OverworldItemHelper.shadowBody.itemID || itemstack.itemID == OverworldItemHelper.shadowBoots.itemID){
			return armorPrefix + "Shadow_1.png";
		}
		if (itemstack.itemID == IceikaItemHelper.santaHead.itemID || itemstack.itemID == IceikaItemHelper.santaBody.itemID || itemstack.itemID == IceikaItemHelper.santaBoots.itemID){
			return armorPrefix + "Santa_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.haliteHelmet.itemID || itemstack.itemID == TwilightItemHelper.haliteBody.itemID || itemstack.itemID == TwilightItemHelper.haliteBoots.itemID){
			return armorPrefix + "Halite_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.UviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.UviteChest.itemID || itemstack.itemID == TwilightItemHelper.UviteBoots.itemID){
			return armorPrefix + "Uvite_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.AugiteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AugiteChest.itemID || itemstack.itemID == TwilightItemHelper.AugiteBoots.itemID){
			return armorPrefix + "Augite_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.AzuriteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AzuriteChest.itemID || itemstack.itemID == TwilightItemHelper.AzuriteBoots.itemID){
			return armorPrefix + "Azurite_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.DraviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.DraviteChest.itemID || itemstack.itemID == TwilightItemHelper.DraviteBoots.itemID){
			return armorPrefix + "Dravite_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.MythrilHelmet.itemID || itemstack.itemID == TwilightItemHelper.MythrilChest.itemID || itemstack.itemID == TwilightItemHelper.MythrilBoots.itemID){
			return armorPrefix + "Mythril_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.netheriteHelmet.itemID || itemstack.itemID == OverworldItemHelper.netheriteBody.itemID || itemstack.itemID == OverworldItemHelper.netheriteBoots.itemID){
			return armorPrefix + "Netherite_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.infernoHelmet.itemID || itemstack.itemID == OverworldItemHelper.infernoBody.itemID || itemstack.itemID == OverworldItemHelper.infernoBoots.itemID){
			return armorPrefix + "Inferno_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.enderHelmet.itemID || itemstack.itemID == OverworldItemHelper.enderBody.itemID || itemstack.itemID == OverworldItemHelper.enderBoots.itemID){
			return armorPrefix + "Ender_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.bedrockHelmet.itemID || itemstack.itemID == OverworldItemHelper.bedrockBody.itemID || itemstack.itemID == OverworldItemHelper.bedrockBoots.itemID){
			return armorPrefix + "Bedrock_1.png";
		}
		if (itemstack.itemID == TwilightItemHelper.divineHelmet.itemID || itemstack.itemID == TwilightItemHelper.divineBody.itemID || itemstack.itemID == TwilightItemHelper.divineBoots.itemID){
			return armorPrefix + "Divine_1.png";
		}
		if (itemstack.itemID == OverworldItemHelper.ironLegs.itemID){
			return armorPrefix + "Iron_2.png";       
		}       
		if (itemstack.itemID == OverworldItemHelper.diamondLegs.itemID){
			return armorPrefix + "Diamond_2.png";      
		}        
		if (itemstack.itemID == OverworldItemHelper.grimReaperLegs.itemID){
			return armorPrefix + "Skeleman_2.png";
		}        
		if (itemstack.itemID == OverworldItemHelper.jackOManLegs.itemID){
			return armorPrefix + "Pumpkin_2.png";
		}   
		if (itemstack.itemID == OverworldItemHelper.eliteRealmiteLegs.itemID){
			return armorPrefix + "EliteRealmite_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.krakenLegs.itemID){
			return armorPrefix + "Kraken_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.rupeeLegs.itemID){
			return armorPrefix + "Rupee_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.arlemiteLegs.itemID){
			return armorPrefix + "Arlemite_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.realmiteLegs.itemID){
			return armorPrefix + "Realmite_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.angelicLegs.itemID){
			return armorPrefix + "Angelic_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.aquaticLegs.itemID){
			return armorPrefix + "Aquastrive_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.shadowLegs.itemID){
			return armorPrefix + "Shadow_2.png";
		}
		if (itemstack.itemID == IceikaItemHelper.santaLegs.itemID){
			return armorPrefix + "Santa_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.haliteLegs.itemID){
			return armorPrefix + "Halite_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.Augitelegs.itemID){
			return armorPrefix + "Augite_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.Uvitelegs.itemID){
			return armorPrefix + "Uvite_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.Azuritelegs.itemID){
			return armorPrefix + "Azurite_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.Dravitelegs.itemID){
			return armorPrefix + "Dravite_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.Mythrillegs.itemID){
			return armorPrefix + "Mythril_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.netheriteLegs.itemID){
			return armorPrefix + "Netherite_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.infernoLegs.itemID){
			return armorPrefix + "Inferno_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.enderLegs.itemID){
			return armorPrefix + "Ender_2.png";
		}
		if (itemstack.itemID == OverworldItemHelper.bedrockLegs.itemID){
			return armorPrefix + "Bedrock_2.png";
		}
		if (itemstack.itemID == TwilightItemHelper.divineLegs.itemID){
			return armorPrefix + "Divine_2.png";
		}

		return getArmorTexture(itemstack, entity, slot, (slot == 2 ? 2 : 1));
	}

	@Override
	public void registerIcons(IconRegister icon){
		this.itemIcon = icon.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}

    @Override
    public boolean isDamageable() {
        return !unbreakable;
    }

    @Override
    public boolean isItemTool(ItemStack par1ItemStack) {
        return true;
    }

    @Override
    public Icon getIconFromDamageForRenderPass(int par1, int par2) {
        return getIconFromDamage(par1);
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
    	int damRe = (int) Math.round((damageReduction*100)/4); 
		return slot = damRe;
    }

    @Override
    public void addInformation(ItemStack itemstack,	EntityPlayer par2EntityPlayer, List list, boolean par4) {
        //addDamageReductionString(itemstack, par2EntityPlayer, list, par4);
        list.add(!unbreakable ? (itemstack.getMaxDamage() - itemstack.getItemDamage() + " Uses Remaining") : "Unbreakable");
		list.add(damageReduction == 0.0 ? ("No Protection") : "Damage Reduction: " + damageReduction*100 + "%");
        if (itemstack.itemID == TwilightItemHelper.divineHelmet.itemID || itemstack.itemID == TwilightItemHelper.divineBody.itemID || itemstack.itemID == TwilightItemHelper.divineBoots.itemID || itemstack.itemID == TwilightItemHelper.divineLegs.itemID){
        	list.add("6x Melee damage"); list.add("2x Jump height"); list.add("No fall damage");
		}
        if (itemstack.itemID == OverworldItemHelper.grimReaperHead.itemID || itemstack.itemID == OverworldItemHelper.grimReaperBody.itemID || itemstack.itemID == OverworldItemHelper.grimReaperBoots.itemID || itemstack.itemID == OverworldItemHelper.grimReaperLegs.itemID){
			list.add("4x Scythe damage");
		}     
        if (itemstack.itemID == OverworldItemHelper.jackOManHead.itemID || itemstack.itemID == OverworldItemHelper.jackOManBody.itemID || itemstack.itemID == OverworldItemHelper.jackOManBoots.itemID || itemstack.itemID == OverworldItemHelper.jackOManLegs.itemID){
        	list.add("Replenishes hunger");
        }
		if (itemstack.itemID == OverworldItemHelper.eliteRealmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBody.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBoots.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteLegs.itemID){
			list.add("Full Set: No fall damage");
		}
		if (itemstack.itemID == OverworldItemHelper.krakenHelmet.itemID || itemstack.itemID == OverworldItemHelper.krakenBody.itemID || itemstack.itemID == OverworldItemHelper.krakenBoots.itemID || itemstack.itemID == OverworldItemHelper.krakenLegs.itemID){
			list.add("Full Set: Breathe underwater");
		}
		if (itemstack.itemID == OverworldItemHelper.rupeeHelmet.itemID || itemstack.itemID == OverworldItemHelper.rupeeBody.itemID || itemstack.itemID == OverworldItemHelper.rupeeBoots.itemID || itemstack.itemID == OverworldItemHelper.rupeeLegs.itemID){
			list.add("Full Set: 80% Melee damage protection");
		}
		if (itemstack.itemID == OverworldItemHelper.arlemiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBody.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBoots.itemID || itemstack.itemID == OverworldItemHelper.arlemiteLegs.itemID){
			list.add("Full Set: 80% Ranged damage protection");
		}
		if (itemstack.itemID == OverworldItemHelper.realmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.realmiteBody.itemID || itemstack.itemID == OverworldItemHelper.realmiteBoots.itemID || itemstack.itemID == OverworldItemHelper.realmiteLegs.itemID){
			
		}
		if (itemstack.itemID == OverworldItemHelper.angelicHelmet.itemID || itemstack.itemID == OverworldItemHelper.angelicBody.itemID || itemstack.itemID == OverworldItemHelper.angelicBoots.itemID || itemstack.itemID == OverworldItemHelper.angelicLegs.itemID){
			list.add("Full Set: Allows flight"); list.add("Full Set: No fall damage");
		}
		if (itemstack.itemID == OverworldItemHelper.aquaticHelmet.itemID || itemstack.itemID == OverworldItemHelper.aquaticBody.itemID || itemstack.itemID == OverworldItemHelper.aquaticBoots.itemID || itemstack.itemID == OverworldItemHelper.aquaticLegs.itemID){
			list.add("Full Set: Breathe underwater"); list.add("Full Set: Swim faster");;
		}
		if (itemstack.itemID == OverworldItemHelper.shadowHelmet.itemID || itemstack.itemID == OverworldItemHelper.shadowBody.itemID || itemstack.itemID == OverworldItemHelper.shadowBoots.itemID || itemstack.itemID == OverworldItemHelper.shadowLegs.itemID){
			list.add("Full Set: Move faster");
		}
		if (itemstack.itemID == IceikaItemHelper.santaHead.itemID || itemstack.itemID == IceikaItemHelper.santaBody.itemID || itemstack.itemID == IceikaItemHelper.santaBoots.itemID || itemstack.itemID == IceikaItemHelper.santaLegs.itemID){
			list.add("Massive buff in Iceika"); list.add("Iceika: Speeds up player"); list.add("Iceika: Adds 6x melee damage"); list.add("Iceika: Refills hunger"); list.add("Iceika: 80% Damage reduction");
		}
		if (itemstack.itemID == TwilightItemHelper.haliteHelmet.itemID || itemstack.itemID == TwilightItemHelper.haliteBody.itemID || itemstack.itemID == TwilightItemHelper.haliteBoots.itemID || itemstack.itemID == TwilightItemHelper.haliteLegs.itemID){
			list.add("24+ Melee damage");
		}
		if (itemstack.itemID == TwilightItemHelper.UviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.UviteChest.itemID || itemstack.itemID == TwilightItemHelper.UviteBoots.itemID || itemstack.itemID == TwilightItemHelper.Uvitelegs.itemID){
			list.add("Block damage protection");
		}
		if (itemstack.itemID == TwilightItemHelper.AugiteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AugiteChest.itemID || itemstack.itemID == TwilightItemHelper.AugiteBoots.itemID || itemstack.itemID == TwilightItemHelper.Augitelegs.itemID){
			list.add("Night vision");
		}
		if (itemstack.itemID == TwilightItemHelper.AzuriteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AzuriteChest.itemID || itemstack.itemID == TwilightItemHelper.AzuriteBoots.itemID || itemstack.itemID == TwilightItemHelper.Azuritelegs.itemID){
			list.add("Fast heath regen under water");
		}
		if (itemstack.itemID == TwilightItemHelper.DraviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.DraviteChest.itemID || itemstack.itemID == TwilightItemHelper.DraviteBoots.itemID || itemstack.itemID == TwilightItemHelper.Dravitelegs.itemID){
			list.add("3+ Twilight ore drops");
		}
		if (itemstack.itemID == TwilightItemHelper.MythrilHelmet.itemID || itemstack.itemID == TwilightItemHelper.MythrilChest.itemID || itemstack.itemID == TwilightItemHelper.MythrilBoots.itemID || itemstack.itemID == TwilightItemHelper.Mythrillegs.itemID){
			list.add("5x Jump height"); list.add("No fall damage");
		}
		if (itemstack.itemID == OverworldItemHelper.netheriteHelmet.itemID || itemstack.itemID == OverworldItemHelper.netheriteBody.itemID || itemstack.itemID == OverworldItemHelper.netheriteBoots.itemID || itemstack.itemID == OverworldItemHelper.netheriteLegs.itemID){
			list.add("Fire protection");
		}
		if (itemstack.itemID == OverworldItemHelper.infernoHelmet.itemID || itemstack.itemID == OverworldItemHelper.infernoBody.itemID || itemstack.itemID == OverworldItemHelper.infernoBoots.itemID || itemstack.itemID == OverworldItemHelper.infernoLegs.itemID){
			list.add("Fire protection"); list.add("Lava protection");
		}
		if (itemstack.itemID == OverworldItemHelper.enderHelmet.itemID || itemstack.itemID == OverworldItemHelper.enderBody.itemID || itemstack.itemID == OverworldItemHelper.enderBoots.itemID || itemstack.itemID == OverworldItemHelper.enderBoots.itemID){
			list.add("Explosion protection");
		}
		if (itemstack.itemID == OverworldItemHelper.bedrockHelmet.itemID || itemstack.itemID == OverworldItemHelper.bedrockBody.itemID || itemstack.itemID == OverworldItemHelper.bedrockBoots.itemID || itemstack.itemID == OverworldItemHelper.bedrockLegs.itemID){
			list.add("Explosion protection"); list.add("Fire protection"); list.add("Lava protection");
		}
    }

    public void addDamageReductionString(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        par3List.add((damageReduction * 100) + "% Damage Reduction");
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase arg0, ItemStack arg1, DamageSource arg2, double arg3, int arg4) {
        return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        if(isDamageable()) {
            stack.damageItem(1, entity);
        }

    }
}
