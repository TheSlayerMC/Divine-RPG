package net.divinerpg.twilight.mobs;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityDenseCadillion extends EntityMob
{
    public EntityDenseCadillion(World var1)
    {
        super(var1);
    }

    public void setMoveSpeed(double speed) {
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(speed);
	}
    
    public void setMaxHealth(double health){
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(health);
    }
    
    public void setAttackDamage(double damage){
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(damage);
    }
	
    public void setFollowRange(double range){
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(range);
    }
    
    public void setKnockback(double knock) {
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setAttribute(knock);
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(800.0D);
        this.setMoveSpeed(0.41000000417232513D);
        this.setAttackDamage(39D);
    }

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

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Cadillion;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.zombie.hurt";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.zombie.death";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return TwilightItemHelper.augiteSoul.itemID;
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
