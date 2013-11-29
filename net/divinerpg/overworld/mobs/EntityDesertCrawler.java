package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.EntityModMob;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityDesertCrawler extends EntityModMob
{
    public EntityDesertCrawler(World par1World)
    {
        super(par1World);
        this.setSize(1.5F, 2.0F);
    }
    
    @Override
    protected String getLivingSound()
    {
        return Sound.Crawler;
    }

    @Override
    protected String getHurtSound()
    {
        return Sound.CrawlerHurt;
    }

    @Override
    protected String getDeathSound()
    {
        return Sound.CrawlerHurt;
    }

    @Override
    protected boolean isAIEnabled() {
    	return true;
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.setMaxHealth(60.0);
        this.setMoveSpeed(0.33000000417232513D);
        this.setAttackDamage(12F);
        this.setFollowRange(10);
    }

    @Override
    protected int getDropItemId()
    {
        return Block.sandStone.blockID;
    }


    @Override
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3;
        int var4;
        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Block.sandStone.blockID, 20);
        }

        var3 = this.rand.nextInt(3 + par2);

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(Block.sandStone.blockID, 60);
        }
    }

    @Override
    protected boolean isValidLightLevel()
    {
        return true;
    }
}
