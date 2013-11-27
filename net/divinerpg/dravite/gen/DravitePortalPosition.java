package net.divinerpg.dravite.gen;

import net.minecraft.util.ChunkCoordinates;

public class DravitePortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterDravite field_85088_e;

    public DravitePortalPosition(TeleporterDravite draviteeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = draviteeleporter;
        this.field_85087_d = par5;
    }
}