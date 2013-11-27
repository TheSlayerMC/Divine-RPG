package net.divinerpg.mob.entity.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityLivingStatueArrow extends EntityArrow
{
    public EntityLivingStatueArrow(World var1)
    {
        super(var1);
        this.setSize(0.5F, 0.5F);
        this.setDamage(26);
    }

    public EntityLivingStatueArrow(World var1, double var2, double var4, double var6)
    {
        super(var1);
        this.setDamage(26);
        this.setSize(0.5F, 0.5F);
        this.setPosition(var2, var4, var6);
        this.yOffset = 0.0F;
    }

    public EntityLivingStatueArrow(World var1, EntityLivingBase thrower, EntityLivingBase entity, float var4, float var5)
    {
        super(var1);
        this.setDamage(26);
        this.shootingEntity = thrower;

        if (thrower instanceof EntityPlayer)
        {
            this.canBePickedUp = 1;
        }

        this.posY = thrower.posY + thrower.getEyeHeight() - 0.10000000149011612D;
        double var6 = entity.posX - thrower.posX;
        double var8 = entity.posY + entity.getEyeHeight() - 0.699999988079071D - this.posY;
        double var10 = entity.posZ - thrower.posZ;
        double var12 = MathHelper.sqrt_double(var6 * var6 + var10 * var10);

        if (var12 >= 1.0E-7D)
        {
            float var14 = (float)(Math.atan2(var10, var6) * 180.0D / Math.PI) - 90.0F;
            float var15 = (float)(-(Math.atan2(var8, var12) * 180.0D / Math.PI));
            double var16 = var6 / var12;
            double var18 = var10 / var12;
            this.setLocationAndAngles(thrower.posX + var16, this.posY, thrower.posZ + var18, var14, var15);
            this.yOffset = 0.0F;
            float var20 = (float)var12 * 0.2F;
            this.setArrowHeading(var6, var8 + var20, var10, var4, var5);
        }
    }

    public EntityLivingStatueArrow(World world, EntityLivingBase entity, float var3)
    {
        super(world);
        this.setDamage(26);
        this.shootingEntity = entity;

        if (entity instanceof EntityPlayer)
        {
            this.canBePickedUp = 1;
        }

        this.setSize(0.5F, 0.5F);
        this.setLocationAndAngles(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ, entity.rotationYaw, entity.rotationPitch);
        this.posX -= MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F;
        this.posY -= 0.10000000149011612D;
        this.posZ -= MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F;
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0F;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI);
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI);
        this.motionY = (-MathHelper.sin(this.rotationPitch / 180.0F * (float)Math.PI));
        this.setArrowHeading(this.motionX, this.motionY, this.motionZ, var3 * 1.5F, 1.0F);
    }

    public void setArrowHeading(double var1, double var3, double var5, float var7, float var8)
    {
        this.setDamage(26);
        float var9 = MathHelper.sqrt_double(var1 * var1 + var3 * var3 + var5 * var5);
        var1 /= var9;
        var3 /= var9;
        var5 /= var9;
        var1 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
        var3 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
        var5 += this.rand.nextGaussian() * 0.007499999832361937D * var8;
        var1 *= var7;
        var3 *= var7;
        var5 *= var7;
        this.motionX = var1;
        this.motionY = var3;
        this.motionZ = var5;
        float var10 = MathHelper.sqrt_double(var1 * var1 + var5 * var5);
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(var1, var5) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(var3, var10) * 180.0D / Math.PI);
    }
}
