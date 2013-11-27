package net.divinerpg.vethea.block;

import java.util.Random;

import net.divinerpg.helper.DimensionRegistry;
import net.divinerpg.helper.base.BreakableBase;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.divinerpg.render.portalFX.EntityMythrilPortalFX;
import net.divinerpg.vethea.gen.TeleporterVethea;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVetheaPortal extends BreakableBase
{
    private int firetick;
    private int firemax = 200;
    private NBTTagCompound data;

    public BlockVetheaPortal(int par1)
    {
        super(par1, "", Material.portal, false);
        this.setTickRandomly(true);
        this.setHardness(-1.0F);
        this.setStepSound(soundGlassFootstep);
        this.setLightValue(0.75F);
        GameRegistry.registerBlock(this);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World  world, int x, int y, int z)
    {
        return null;
    }

    /**
     * Updates the blocks bounds based on its current state. Args: world, x, y, z
     */
    @Override
    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        float var5;
        float var6;

        if (world.getBlockId(x - 1, y, z) != this.blockID && world.getBlockId(x + 1, y, z) != this.blockID)
        {
            var5 = 0.125F;
            var6 = 0.5F;
            this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
        }
        else
        {
            var5 = 0.5F;
            var6 = 0.125F;
            this.setBlockBounds(0.5F - var5, 0.0F, 0.5F - var6, 0.5F + var5, 1.0F, 0.5F + var6);
        }
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean tryToCreatePortal(World world, int x, int y, int z)
    {
        byte var5 = 0;
        byte var6 = 0;

        if (world.getBlockId(x - 1, y, z) == Block.blockSnow.blockID || world.getBlockId(x + 1, y, z) == Block.blockSnow.blockID)
        {
            var5 = 1;

        }

        if (world.getBlockId(x, y, z - 1) == Block.blockSnow.blockID || world.getBlockId(x, y, z + 1) == Block.blockSnow.blockID)
        {
            var6 = 1;
        }

        if (var5 == var6)
            return false;
        else
        {
            if (world.getBlockId(x - var5, y, z - var6) == 0)
            {
                x -= var5;
                z -= var6;
            }

            int var7;
            int var8;

            for (var7 = -1; var7 <= 2; ++var7)
            {
                for (var8 = -1; var8 <= 3; ++var8)
                {
                    boolean var9 = var7 == -1 || var7 == 2 || var8 == -1 || var8 == 3;

                    if (var7 != -1 && var7 != 2 || var8 != -1 && var8 != 3)
                    {
                        int var10 = world.getBlockId(x + var5 * var7, y + var8, z + var6 * var7);

                        if (var9)
                        {
                            if (var10 != Block.blockSnow.blockID)
                                return false;
                        }
                        else if (var10 != 0 && var10 != TwilightBlockHelper.augiteBlock.blockID)
                            return false;
                    }
                }
            }

            world.scheduledUpdatesAreImmediate = true;

            for (var7 = 0; var7 < 2; ++var7)
            {
                for (var8 = 0; var8 < 3; ++var8)
                {
                    world.setBlock(x + var5 * var7, y + var8, z + var6 * var7, TwilightBlockHelper.augiteBlock.blockID);
                }
            }

            world.scheduledUpdatesAreImmediate = false;
            return true;
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborID)
    {
        byte var6 = 0;
        byte var7 = 1;

        if (world.getBlockId(x - 1, y, z) == this.blockID || world.getBlockId(x + 1, y, z) == this.blockID)
        {
            var6 = 1;
            var7 = 0;
        }

        int var8;

        for (var8 = y; world.getBlockId(x, var8 - 1, z) == this.blockID; --var8)
        {
            ;
        }

        if (world.getBlockId(x, var8 - 1, z) != Block.blockSnow.blockID)
        {
            world.setBlock(x, y, z, 0);
        }
        else
        {
            int var9;

            for (var9 = 1; var9 < 4 && world.getBlockId(x, var8 + var9, z) == this.blockID; ++var9)
            {
                ;
            }

            if (var9 == 3 && world.getBlockId(x, var8 + var9, z) == Block.blockSnow.blockID)
            {
                boolean var10 = world.getBlockId(x - 1, y, z) == this.blockID || world.getBlockId(x + 1, y, z) == this.blockID;
                boolean var11 = world.getBlockId(x, y, z - 1) == this.blockID || world.getBlockId(x, y, z + 1) == this.blockID;

                if (var10 && var11)
                {
                    world.setBlock(x, y, z, 0);
                }
                else if ((world.getBlockId(x + var6, y, z + var7) != Block.blockSnow.blockID || world.getBlockId(x - var6, y, z - var7) != this.blockID) && (world.getBlockId(x - var6, y, z - var7) != Block.blockSnow.blockID || world.getBlockId(x + var6, y, z + var7) != this.blockID))
                {
                    world.setBlock(x, y, z, 0);
                }
            }
            else
            {
                world.setBlock(x, y, z, 0);
            }
        }
    }

    /**
     * Returns true if the given side of this block type should be rendered, if the adjacent block is at the given
     * coordinates.  Args: blockAccess, x, y, z, side
     */
    @Override
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
        if (world.getBlockId(x, y, z) == this.blockID)
            return false;
        else
        {
            boolean var6 = world.getBlockId(x - 1, y, z) == this.blockID && world.getBlockId(x - 2, y, z) != this.blockID;
            boolean var7 = world.getBlockId(x + 1, y, z) == this.blockID && world.getBlockId(x + 2, y, z) != this.blockID;
            boolean var8 = world.getBlockId(x, y, z - 1) == this.blockID && world.getBlockId(x, y, z - 2) != this.blockID;
            boolean var9 = world.getBlockId(x, y, z + 1) == this.blockID && world.getBlockId(x, y, z + 2) != this.blockID;
            boolean var10 = var6 || var7;
            boolean var11 = var8 || var9;
            return var10 && side == 4 ? true : (var10 && side == 5 ? true : (var11 && side == 2 ? true : var11 && side == 3));
        }
    }

    @Override
    public int quantityDropped(Random var1)
    {
        return 0;
    }

    @Override
    public int getRenderBlockPass()
    {
        return 1;
    }

   /* @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != DimensionConfigHelper.VetheaID)
            {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DimensionConfigHelper.VetheaID, new TeleporterVethea(thePlayer.mcServer.worldServerForDimension(DimensionConfigHelper.VetheaID)));
            }
            else {
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterVethea(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }*/
    
    
    @Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {        
        if (!world.isRemote)
        {
            this.firetick = this.firemax;
            if (this.firetick == this.firemax && this.firemax != 0)
            {
                if (entity instanceof EntityPlayerMP)
                {
                    WorldServer worldServer = (WorldServer)world;
                    EntityPlayerMP var6 = (EntityPlayerMP)entity;

                    if (entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayer)
                    {
                        EntityPlayer player = (EntityPlayer)entity;
                        data = player.getEntityData().getCompoundTag(player.PERSISTED_NBT_TAG);
                        if (var6.dimension != DimensionConfigHelper.VetheaID)
                        {
                            var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, DimensionConfigHelper.VetheaID, new TeleporterVethea(var6.mcServer.worldServerForDimension(DimensionConfigHelper.VetheaID)));
                            data.setTag("InventoryOverWorld", player.inventory.writeToNBT(new NBTTagList()));
                            player.getEntityData().setCompoundTag(player.PERSISTED_NBT_TAG, data);
                            player.inventory.clearInventory(-1, -1);
                            NBTTagList nbtVetheaInventory = data.getTagList("InventoryVethea");
                            player.inventory.readFromNBT(nbtVetheaInventory);
                        }
                        else
                        {
                            var6.mcServer.getConfigurationManager().transferPlayerToDimension(var6, 0, new TeleporterVethea(var6.mcServer.worldServerForDimension(0)));
                            data.setTag("InventoryVethea", player.inventory.writeToNBT(new NBTTagList()));
                            player.getEntityData().setCompoundTag(player.PERSISTED_NBT_TAG, data);
                            player.inventory.clearInventory(-1, -1);
                            NBTTagList nbtOverworldInventory = data.getTagList("InventoryOverWorld");
                            player.inventory.readFromNBT(nbtOverworldInventory);
                        }
                    }
                }

                this.firetick = 0;
            }
            else
            {
                ++this.firetick;
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World world, int x, int y, int z, Random rand)
    {

        for (int var6 = 0; var6 < 4; ++var6)
        {
            double var7 = x + rand.nextFloat();
            double var9 = y + rand.nextFloat();
            double var11 = z + rand.nextFloat();
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = rand.nextInt(2) * 2 - 1;
            var13 = (rand.nextFloat() - 0.5D) * 0.5D;
            var15 = (rand.nextFloat() - 0.5D) * 0.5D;
            var17 = (rand.nextFloat() - 0.5D) * 0.5D;

            if (world.getBlockId(x - 1, y, z) != this.blockID && world.getBlockId(x + 1, y, z) != this.blockID)
            {
                var7 = x + 0.5D + 0.25D * var19;
                var13 = rand.nextFloat() * 2.0F * var19;
            }
            else
            {
                var11 = z + 0.5D + 0.25D * var19;
                var17 = rand.nextFloat() * 2.0F * var19;
            }

            EntityMythrilPortalFX var20 = new EntityMythrilPortalFX(world, var7, var9, var11, var13, var15, var17);
            FMLClientHandler.instance().getClient().effectRenderer.addEffect(var20);
        }
    }
}