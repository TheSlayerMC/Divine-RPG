package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.divinerpg.mob.entity.item.EntityTripletProjectile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAyeraco extends EntityModMob implements IBossDisplayData
{
    private String colour;
    private int waitTick;
    private ChunkCoordinates currentFlightTarget;
    private boolean attacks;
    private double moveX;
    private double moveZ;
    private boolean halfHp;
    public float moveSpeed = 0.3F;
    public EntityAyeraco(World var1, String par3)
    {
        super(var1);
        this.setSize(3.0F, 1.9F);
        this.colour = par3;
        this.waitTick = 0;
        this.attacks = false;
        this.moveX = this.rand.nextGaussian() * 0.25  - 0.125;
        this.moveZ = this.rand.nextGaussian() * 0.25 - 0.125;
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(1000.0D);
        this.setMoveSpeed(0.43000000417232513D);
        this.setAttackDamage(48D);
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
    }
    
    @Override
    public String getEntityName()
    {
        return "Ayeraco " + this.colour;
    }

    public int getMaxArmor()
    {
        return 10;
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Ayeraco;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.AyeracoHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.AyeracoHit;
    }

    protected void func_85033_bc() {}

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.motionY *= 0.6000000238418579D;
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();

        //if (func_110138_aP() * 2 < func_110143_aJ())
        {
            this.tickAbility();
            if (this.halfHp = false)
            {
                this.worldObj.playSoundAtEntity(this, Sound.AyeracoHalfHealth, 20.0F,  0.4F / (this.rand.nextFloat() * 0.4F + 0.8F));
            }
        }

        if (this.waitTick == 0)
        {
            if (this.getAttackTarget() != null)
            {
                int var1 = (int) this.getAttackTarget().posX;
                int var2 = (int) this.getAttackTarget().posY;
                int var3 = (int) this.getAttackTarget().posZ;
                this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
            }

            this.motionY = 0;

            if (this.currentFlightTarget != null)
            {
                double var1 = this.currentFlightTarget.posX - this.posX;
                double var3 = this.currentFlightTarget.posY - this.posY;
                double var5 = this.currentFlightTarget.posZ - this.posZ;

                if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
                {
                    this.motionX = Math.signum(var1) * moveSpeed;
                    this.motionY += (Math.signum(var3) * 5.699999988079071D - this.motionY) * 0.10000000149011612D;
                    this.motionZ = Math.signum(var5) * moveSpeed;
                    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
                    this.moveForward = 0.5F;
                    this.rotationYaw += var8;
                }
            }
        }
        else
        {
            this.waitTick--;
            this.motionY = 0.3;
            this.motionX = this.moveX;
            this.motionZ = this.moveZ;
        }

        if (!this.attacks)
        {
            this.waitTick = 80;
            this.attacks = true;
            if (this.canTeleport())
            {
                this.waitTick = 0;
                this.teleportRandomUp(this.worldObj);
            }
        }

    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    @Override
    protected void fall(float par1) {}

    /**
     * Takes in the distance the entity has fallen this tick and whether its on the ground to update the fall distance
     * and deal fall damage if landing on the ground.  Args: distanceFallenThisTick, onGround
     */
    @Override
    protected void updateFallState(double par1, boolean par3) {}

    /**
     * Return whether this entity should NOT trigger a pressure plate or a tripwire.
     */
    @Override
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource par1DamageSource, int par2)
    {
        if (this.isEntityInvulnerable())
            return false;
        else if (par1DamageSource.getSourceOfDamage() instanceof EntityTripletProjectile)
            return false;
        else if (par1DamageSource.isProjectile() && this.canBlockProjectiles())
            return false;
        else
        {
            if (par1DamageSource.getSourceOfDamage() instanceof EntityPlayer)
            {
                this.attacks = false;
            }
            return super.attackEntityFrom(par1DamageSource, par2);
        }
    }

    /**
     * Initialize this creature.
     */
    public void initCreature() {}

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {
        this.dropItem(OverworldItemHelper.divineShard.itemID, 2 + this.rand.nextInt(2));
        if (this.rand.nextInt(100) < 2)
        {
            switch (this.rand.nextInt(2))
            {
                case 0:
                    this.dropItem(TwilightItemHelper.divineBody.itemID, 1);
                case 1:
                    this.dropItem(TwilightItemHelper.divineLegs.itemID, 1);
            }
        }

        if (this.rand.nextInt(100) < 5)
        {
            this.dropItem(TwilightItemHelper.divineBoots.itemID, 1);
        }


        if (this.rand.nextInt(100) < 3)
        {
            this.dropItem(TwilightItemHelper.divineHelmet.itemID, 1);
        }
    }

    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        this.attacks = false;
        return super.attackEntityAsMob(par1Entity);
    }

    protected void tickAbility(){}

    protected boolean canBlockProjectiles()
    {
        return true;
    }

    protected boolean canTeleport()
    {
        return true;
    }

    public boolean abilityActive()
    {
        //if (func_110138_aP() * 2 <= func_110143_aJ() && !this.isDead)
            return true;
       // return false;
    }

    protected void teleportRandomUp(World par1)
    {
        par1.playSoundAtEntity(this, Sound.AyeracoTeleport, 2.0F, 0.4F / (this.rand.nextFloat() * 0.4F + 0.8F));
        this.motionY = 20;
        this.motionX = this.rand.nextInt(5);
        this.motionZ = this.rand.nextInt(5);
    }
}
