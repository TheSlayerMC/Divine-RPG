package net.divinerpg.twilight.mobs;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityKarot extends EntityZombie implements IBossDisplayData
{
    private int spawnTick;

    public EntityKarot(World var1)
    {
        super(var1);
        this.spawnTick = 240;
        this.setSize(1.5F, 4.0F);
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.4); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(55); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4000); // MaxHP
    }
    
    @Override
    protected boolean isAIEnabled() {
    	return true;
    }

    /**
     * Returns the current armor value as determined by a call to InventoryPlayer.getTotalArmorValue
     */
    @Override
    public int getTotalArmorValue()
    {
        return 10;
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
                this.setFire(8);
            }
        }

        if (this.spawnTick == 0 && !this.worldObj.isRemote)
        {
            EntityAngryBunny var2 = new EntityAngryBunny(this.worldObj);
            var2.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rand.nextFloat() * 360.0F, 0.0F);
            this.worldObj.spawnEntityInWorld(var2);
            this.worldObj.spawnParticle("reddust", var2.posX, var2.posY + 0.5D, var2.posZ, this.rand.nextGaussian() * 2.0D - 1.0D, this.rand.nextGaussian() * 2.0D - 1.0D, this.rand.nextGaussian() * 2.0D - 1.0D);
            this.worldObj.playSoundAtEntity(var2, Sound.KarotSummon, 10.0F, 1.0F);
            this.spawnTick = 240;
        }

        this.spawnTick--;
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "mob.zombie";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.zombiehurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.zombiedeath";
    }

    @Override
    public void onDeath(DamageSource par1DamageSource)
    {
        for (int i = 0; i < 5; i++)
        {
        	EntityAngryBunny var1 = new EntityAngryBunny(this.worldObj);
            var1.setPosition(this.posX, this.posY, this.posZ);
            this.worldObj.spawnEntityInWorld(var1);
        }

        super.setDead();
    }

    @Override
    protected int getDropItemId()
    {
        return TwilightItemHelper.halitePhaser.itemID;
    }

    @Override
    public void dropFewItems(boolean par1, int par2)
    {
        int var1 = this.rand.nextInt(4);
        this.dropItem(this.getDropItemId(),1);
    }
}
