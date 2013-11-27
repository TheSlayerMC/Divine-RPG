package net.divinerpg.overworld.mobs;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.world.World;

public class EntityEnderWatcher extends EntityEnderman
{
    public EntityEnderWatcher(World var1)
    {
        super(var1);
        this.setSize(1.0F, 2.0F);
        this.experienceValue = 20;
        

    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.2); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(13); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(60); // MaxHP
    }

    @Override
    protected int getDropItemId()
    {
        return OverworldItemHelper.enderShard.itemID;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {
        int var3 = this.rand.nextInt(3 + var2);
        int var4;

        for (var4 = 0; var4 < var3; ++var4)
        {
            this.dropItem(OverworldItemHelper.enderShard.itemID, 1);
        }

        var3 = this.rand.nextInt(10);

        if (var3 == 0)
        {
            this.dropItem(OverworldItemHelper.watchingEye.itemID, 1);
        }
    }

    /**
     * Called when the mob is falling. Calculates and applies fall damage.
     */
    @Override
    protected void fall(float var1) {}
}
