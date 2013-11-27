package net.divinerpg.iceika.gen;

import net.minecraft.util.ChunkCoordinates;

public class IceikaPortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterIceika field_85088_e;

    public IceikaPortalPosition(TeleporterIceika iceikaTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = iceikaTeleporter;
        this.field_85087_d = par5;
    }
}