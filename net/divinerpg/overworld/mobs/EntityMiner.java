package net.divinerpg.overworld.mobs;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityMiner extends EntityZombie
{
    private static final ItemStack defaultHeldItem = new ItemStack(Item.pickaxeDiamond, 1);

    public EntityMiner(World var1)
    {
        super(var1);
    }
    @Override
    protected void applyEntityAttributes() { 
        super.applyEntityAttributes();
        
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(40);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(4);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.23F);
    }

    public int getTotalArmorValue()
    {
        return 10;
    }

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

    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    protected int getDropItemId()
    {
        return Item.rottenFlesh.itemID;
    }

    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }

    protected void dropRareDrop(int var1)
    {
        switch (this.rand.nextInt(5))
        {
            case 0:
                this.dropItem(Item.pickaxeDiamond.itemID, 1);
                break;

            case 1:
                this.dropItem(Item.ingotGold.itemID, 1);
                break;

            case 2:
                this.dropItem(Item.ingotIron.itemID, 1);
                break;

            case 3:
                this.dropItem(Item.diamond.itemID, 1);
                break;

            case 4:
                this.dropItem(Block.torchWood.blockID, 64);
        }
    }
}
