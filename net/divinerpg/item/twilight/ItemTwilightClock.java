package net.divinerpg.item.twilight;

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
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (var7 != 1)
            return false;
        else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
        {
            int var11 = var3.getBlockId(var4, var5, var6);

            //Dravite
            if (var11 == OverworldBlockHelper.divineRock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Azurite
            else if (var11 == TwilightBlockHelper.draviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Uvite
            else if (var11 == TwilightBlockHelper.azuriteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //Mythril
            else if (var11 == TwilightBlockHelper.uviteBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            } 

            //Augite
            else if (var11 == TwilightBlockHelper.mythrilBlock.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }

            //AUGITE BLOCK MAKES VETHEA BUT IN A DIFFERENT SHAPE

            //Iceika
            else if (var11 == Block.blockSnow.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }
            
            //Anti Hell
            if (var11 == Block.netherrack.blockID && var3.isAirBlock(var4, var5 + 1, var6))
            {
                var3.setBlock(var4, var5 + 1, var6, OverworldBlockHelper.bluefire.blockID);
                return true;
            }
            else
                return false;
        } else
            return false;
    }
}
