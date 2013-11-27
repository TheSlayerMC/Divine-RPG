package net.divinerpg.augite.gen;

import net.minecraft.util.ChunkCoordinates;

public class AugitePortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterAugite field_85088_e;

    public AugitePortalPosition(TeleporterAugite augiteTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = augiteTeleporter;
        this.field_85087_d = par5;
    }
}