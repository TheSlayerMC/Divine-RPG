package net.divinerpg.arcana.mobs;

import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityDramix extends EntityModMob implements IBossDisplayData
{

    private int firetick;
    private int firemax = 300;
    private int firemax2 = 200;

    private boolean isInvi;

    public EntityDramix(World var1)
    {
        super(var1);
        if(isInvi == true)
        {
          this.setMoveSpeed(0.63000000417232513D); 
        }
        if(isInvi == false)
        {
            this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        }

        this.isImmuneToFire = true;

    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(5000.0D);
        this.setMoveSpeed(0.53000000417232513D);
        this.setAttackDamage(39D);
    }
    
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Gets the username of the entity.
     */
    @Override
    public String getEntityName()
    {
        return "Dramix";
    }

    /**
     * Returns the health points of the dragon.
     */
    public int getDragonHealth()
    {
        return this.dataWatcher.getWatchableObjectInt(16);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer((int) this.getHealth()));
    }

    public boolean isInv()
    {
        return isInvi;
    }

    public int getAttackStrength(Entity var1)
    {
        if (!this.worldObj.isRemote && this.worldObj.difficultySetting > 0)
            return 39;
        return 39;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
            }
        }

        if(firemax == firetick && firetick !=0)
        {
            this.isInvi = true;
            this.firetick = 0;
        }
        else
        {
            ++firetick;
        }

        if(firemax2 == firetick && firetick !=0)
        {
            this.isInvi = false;
            this.firetick = 0;
        }
        else
        {
            ++firetick;
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "mob.RPG.Dramix";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.RPG.DramixHurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.RPG.DramixHurt";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return 0;
    }

    @Override
    public void dropFewItems(boolean par1, int par2)
    {
        this.dropItem(ArcanaItemHelper.dungeonToken.itemID, 5);
    }

    /**
     * Get this Entity's EnumCreatureAttribute
     */
    @Override
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

}
