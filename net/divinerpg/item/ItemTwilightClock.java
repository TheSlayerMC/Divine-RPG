package net.divinerpg.item;

import java.util.Random;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTwilightClock extends ItemsBase
{
    protected Random rand = new Random();
    public double lastX;
    public double lastY;
    public double lastZ;
    //public TeleporterTwilightClock teleporter = new TeleporterTwilightClock(null);

    public ItemTwilightClock(int var1)
    {
        super(var1);
        this.maxStackSize = 1;
    }

    @Override
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World world, int x, int y, int z, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
            return false;
        else if (var2.canPlayerEdit(x, y, z, var7, var1) && var2.canPlayerEdit(x, y + 1, z, var7, var1))
        {
            int targetBlock = world.getBlockId(x, y, z);

            //Dravite
            if (targetBlock == OverworldBlockHelper.divineRock.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Azurite
            else if (targetBlock == TwilightBlockHelper.draviteBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Uvite
            else if (targetBlock == TwilightBlockHelper.azuriteBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Mythril
            else if (targetBlock == TwilightBlockHelper.uviteBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            } 

            //Augite
            else if (targetBlock == TwilightBlockHelper.mythrilBlock.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //AUGITE BLOCK MAKES VETHEA BUT IN A DIFFERENT SHAPE

            //Iceika
            else if (targetBlock == Block.blockSnow.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }
            
            if (targetBlock == Block.netherrack.blockID && world.isAirBlock(x, y + 1, z))
            {
                world.setBlock(x, y + 1, z, OverworldBlockHelper.bluefire.blockID);
                return true;
            }
            else
                return false;
        } else
            return false;
    }
}
