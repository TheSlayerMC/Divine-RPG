package net.divinerpg.arcana.mobs;

import java.util.Iterator;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.handlers.GuiHandler;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityDatticon extends EntityVillager implements INpc, IMerchant
{
    private int randomTickDivider;
    private EntityPlayer buyingPlayer;
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    private boolean needsInitilization;
    private int wealth;
    private String field_82189_bL;
    private boolean field_82190_bM;
    private float field_82191_bN;

    public EntityDatticon(World var1)
    {
        this(var1, 0);
    }

    public EntityDatticon(World var1, int var2)
    {
        super(var1, var2);
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, IMob.class, 8.0F, 0.3F, 0.35F));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        return this.posY < 40.0D && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    /**
     * main AI tick function, replaces updateEntityActionState
     */
    @Override
    protected void updateAITick()
    {
        if (!this.isTrading() && this.timeUntilReset > 0)
        {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0)
            {
                if (this.needsInitilization)
                {
                    if (this.buyingList.size() > 1)
                    {
                        Iterator var3 = this.buyingList.iterator();

                        while (var3.hasNext())
                        {
                            MerchantRecipe var2 = (MerchantRecipe)var3.next();

                            if (var2.func_82784_g())
                            {
                                var2.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;
                }

                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }

        super.updateAITick();
    }

    /**
     * Called when a player interacts with a mob. e.g. gets milk from a cow, gets into the saddle on a pig.
     */
    @Override
    public boolean interact(EntityPlayer var1)
    {
        if (this.isEntityAlive() && !this.isTrading() && !this.isChild())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(var1);

                switch (this.rand.nextInt(5))
                {
                    case 0:
                        var1.addChatMessage("Datticon: Keep an eye on Merik, he's stealing my technology.");
                        break;
                    case 1:
                        var1.addChatMessage("Datticon: Do you need something hotter than hell? I've come up with this new furnace.");
                        break;
                    case 2:
                        var1.addChatMessage("Datticon: Those other fools think it's all magic, I use science!");
                        break;
                    case 3:
                        var1.addChatMessage("Datticon: That doesn't need to be plugged in.");
                        break;
                    case 4:
                        var1.addChatMessage("Datticon: I tried using redstone, but it's primitive.");
                        break;
                }

                var1.openGui(DivineRPG.instance, GuiHandler.DATTICON, this.worldObj, this.entityId, 0, 0);
            }

            return true;
        } else
            return super.interact(var1);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(1000); // MaxHP
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        if (this.buyingList != null)
        {
            var1.setCompoundTag("Offers", this.buyingList.getRecipiesAsTags());
        }
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        if (var1.hasKey("Offers"))
        {
            NBTTagCompound var2 = var1.getCompoundTag("Offers");
            this.buyingList = new MerchantRecipeList(var2);
        }
    }



    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    @Override
    protected boolean canDespawn()
    {
        return true;
    }

    public void setRevengeTarget(EntityLiving var1)
    {
        super.setRevengeTarget(var1);
    }

    @Override
    public void setCustomer(EntityPlayer var1)
    {
        this.buyingPlayer = var1;
    }

    @Override
    public EntityPlayer getCustomer()
    {
        return this.buyingPlayer;
    }

    @Override
    public boolean isTrading()
    {
        return this.buyingPlayer != null;
    }

    @Override
    public void useRecipe(MerchantRecipe var1)
    {
        var1.incrementToolUses();

        if (var1.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1)))
        {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null)
            {
                this.field_82189_bL = this.buyingPlayer.getCommandSenderName();
            }
            else
            {
                this.field_82189_bL = null;
            }
        }

        if (var1.getItemToBuy().itemID == ArcanaItemHelper.arcanium.itemID)
        {
            this.wealth += var1.getItemToBuy().stackSize;
        }
    }

    @Override
    public MerchantRecipeList getRecipes(EntityPlayer var1)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(8);
        }

        return this.buyingList;
    }

    private float func_82188_j(float var1)
    {
        float var2 = var1 + this.field_82191_bN;
        return var2 > 0.9F ? 0.9F - (var2 - 0.9F) : var2;
    }

    private void addDefaultEquipmentAndRecipies(int var1)
    {
        if (this.buyingList != null)
        {
            this.field_82191_bN = MathHelper.sqrt_float(this.buyingList.size()) * 0.2F;
        }
        else
        {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList var2 = new MerchantRecipeList();

        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 1, 0), new ItemStack(ArcanaItemHelper.arcaniumBucket.itemID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 5, 0), new ItemStack(ArcanaBlockHelper.arcaniteRails.blockID, 8, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 8, 0), new ItemStack(ArcanaBlockHelper.starBridge.blockID, 16, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 3, 0), new ItemStack(ArcanaBlockHelper.arcaniteTubes.blockID, 16, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 2, 0), new ItemStack(ArcanaBlockHelper.moltenFurnace.blockID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 3, 0), new ItemStack(ArcanaBlockHelper.greenlightFurnace.blockID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 4, 0), new ItemStack(ArcanaBlockHelper.oceanfireFurnace.blockID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 5, 0), new ItemStack(ArcanaBlockHelper.moonlightFurnace.blockID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 7, 0), new ItemStack(ArcanaBlockHelper.whitefireFurnace.blockID, 1, 0)));
        var2.add(new MerchantRecipe(new ItemStack(ArcanaItemHelper.arcanium.itemID, 9, 0), new ItemStack(ArcanaBlockHelper.demonFurnace.blockID, 1, 0)));

        if (this.buyingList == null)
        {
            this.buyingList = new MerchantRecipeList();
        }

        for (int var3 = 0; var3 < var1 && var3 < var2.size(); ++var3)
        {
            this.buyingList.addToListWithCheck((MerchantRecipe)var2.get(var3));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void setRecipes(MerchantRecipeList var1) {}

    @Override
    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte var1)
    {
        if (var1 == 12)
        {
            this.generateRandomParticles("heart");
        }
        else if (var1 == 13)
        {
            this.generateRandomParticles("angryVillager");
        }
        else if (var1 == 14)
        {
            this.generateRandomParticles("happyVillager");
        }
        else
        {
            super.handleHealthUpdate(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    private void generateRandomParticles(String var1)
    {
        for (int var2 = 0; var2 < 5; ++var2)
        {
            double var3 = this.rand.nextGaussian() * 0.02D;
            double var5 = this.rand.nextGaussian() * 0.02D;
            double var7 = this.rand.nextGaussian() * 0.02D;
            this.worldObj.spawnParticle(var1, this.posX + this.rand.nextFloat() * this.width * 2.0F - this.width, this.posY + 1.0D + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0F - this.width, var3, var5, var7);
        }
    }

    @Override
    public void func_82187_q()
    {
        this.field_82190_bM = true;
    }

    public IMerchant leornaInv()
    {
        return this;
    }

    static
    {
    }
}
