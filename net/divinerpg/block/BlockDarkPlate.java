package net.divinerpg.block;

import java.util.Iterator;
import java.util.List;

import net.minecraft.block.EnumMobType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockDarkPlate extends BlockDivineRPGPressurePlate
{
    private EnumMobType triggerMobType;

    public BlockDarkPlate(int par1, String par2Str, Material par3Material, EnumMobType par4EnumMobType, int par5)
    {
        super(par1, par2Str);
        this.triggerMobType = par4EnumMobType;
    }
 
    protected int getMetaFromWeight(int par1)
    {
        return par1 > 0 ? 1 : 0;
    }
 
    protected int getPowerSupply(int par1)
    {
        return par1 == 1 ? 15 : 0;
    }
 
    protected int getPlateState(World par1World, int par2, int par3, int par4)
    {
        List list = null;

        if (this.triggerMobType == EnumMobType.everything)
        {
            list = par1World.getEntitiesWithinAABBExcludingEntity((Entity)null, this.getSensitiveAABB(par2, par3, par4));
        }

        if (this.triggerMobType == EnumMobType.mobs)
        {
            list = par1World.getEntitiesWithinAABB(EntityLiving.class, this.getSensitiveAABB(par2, par3, par4));
        }

        if (this.triggerMobType == EnumMobType.players)
        {
            list = par1World.getEntitiesWithinAABB(EntityPlayer.class, this.getSensitiveAABB(par2, par3, par4));
        }

        if (!list.isEmpty())
        {
            Iterator iterator = list.iterator();

            while (iterator.hasNext())
            {
                Entity entity = (Entity)iterator.next();

                if (!entity.doesEntityNotTriggerPressurePlate())
                {
                    return 15;
                }
            }
        }

        return 0;
    }
}
