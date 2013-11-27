package net.divinerpg.mob.entity.item;
import net.divinerpg.render.entity.RenderBlock.RenderBlock.IBlockRender;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

public class EntityCrabclawProjectile extends EntityDamageProjectile implements IBlockRender {

    public EntityCrabclawProjectile(World world) {
        super(world);
    }

    public EntityCrabclawProjectile(World var1, EntityLiving var2, int damage) {
        super(var1, var2, damage);
    }

    @Override
    public int getBlockID() {
        return Block.cactus.blockID;
    }

    @Override
    public int getBlockMeta() {
        return 0;
    }

    @Override
    public float getBlockScale() {
        return 0.25F;
    }

}
