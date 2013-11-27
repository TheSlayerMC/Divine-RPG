package net.divinerpg.vethea.item;

import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.block.VetheaBlockHelper;
import net.divinerpg.vethea.entity.EntityKaros;
import net.divinerpg.vethea.entity.EntityQuadro;
import net.divinerpg.vethea.entity.EntityRaglok;
import net.divinerpg.vethea.entity.EntityWreck;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemDreamflint extends ItemDivineRPG
{

    public ItemDreamflint(int par1)
    {
        super(par1);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if(!var3.isRemote)
        {
            if (var7 != 1)
                return false;
            else if (var2.canPlayerEdit(var4, var5, var6, var7, var1) && var2.canPlayerEdit(var4, var5 + 1, var6, var7, var1))
            {
                int var11 = var3.getBlockId(var4, var5, var6);

                if (var11 == VetheaBlockHelper.wreckAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    EntityWreck wreck = new EntityWreck(var3);
                    wreck.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(wreck);
                    return true;
                }
                else if (var11 == VetheaBlockHelper.raglokAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    EntityRaglok raglok = new EntityRaglok(var3);
                    raglok.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(raglok);
                    return true;
                }
                else if (var11 == VetheaBlockHelper.karosAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    EntityKaros karos = new EntityKaros(var3, var4 - 27, var5 - 2, var6 - 9);
                    karos.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(karos);
                    return true;
                }
                else if (var11 == VetheaBlockHelper.quadroticAltar.blockID && var3.isAirBlock(var4, var5 + 1, var6))
                {
                    EntityQuadro quadro = new EntityQuadro(var3);
                    quadro.setLocationAndAngles(var4, var5 + 1.0F, var6, 0.0F, 0.0F);
                    var3.spawnEntityInWorld(quadro);
                    return true;
                } else
                    return false;
            } else
                return false;
        }
        return false;
    }

}