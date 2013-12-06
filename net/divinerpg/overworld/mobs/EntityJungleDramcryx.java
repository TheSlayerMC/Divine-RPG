package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityJungleDramcryx extends EntityModMob
{
    public EntityJungleDramcryx(World par1World)
    {
        super(par1World);        
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMoveSpeed(0.33000000417232513D);
        this.setMaxHealth(100D);
        this.setAttackDamage(19D);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Dramcryx;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.DramcryxHurt;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.DramcryxHurt;
    }



    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return OverworldItemHelper.jungleShard.itemID;
    }

}
