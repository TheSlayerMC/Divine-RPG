package net.divinerpg.overworld.block.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.Packet132TileEntityData;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TileEntityAyeracoBeamYellow extends TileEntity
{
	
    @SideOnly(Side.CLIENT)
    private long field_82137_b;
    @SideOnly(Side.CLIENT)
    private float field_82138_c;
 
    @SideOnly(Side.CLIENT)
    public float func_82125_v_()
    {
    	int i = (int)(this.worldObj.getTotalWorldTime() - this.field_82137_b);
        this.field_82137_b = this.worldObj.getTotalWorldTime();

        if (i > 1)
        {
            this.field_82138_c -= (float)i / 40.0F;

            if (this.field_82138_c < 0.0F)
            {
                this.field_82138_c = 0.0F;
            }
        }

        this.field_82138_c += 0.025F;

        if (this.field_82138_c > 1.0F)
        {
            this.field_82138_c = 1.0F;
        }

        return this.field_82138_c;
    }

    /**
     * Overriden in a sign to provide the text.
     */
    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound var1 = new NBTTagCompound();
        this.writeToNBT(var1);
        return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 3, var1);
    }

    @SideOnly(Side.CLIENT)
    public double getMaxRenderDistanceSquared()
    {
        return 65536.0D;
    }

    /**
     * Reads a tile entity from NBT.
     */
    @Override
    public void readFromNBT(NBTTagCompound par1NBTTagCompound)
    { }

    /**
     * Writes a tile entity to NBT.
     */
    @Override
    public void writeToNBT(NBTTagCompound par1NBTTagCompound)
    { }
}