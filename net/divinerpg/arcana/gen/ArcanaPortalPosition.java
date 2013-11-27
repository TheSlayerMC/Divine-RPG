package net.divinerpg.arcana.gen;

import net.minecraft.util.ChunkCoordinates;

public class ArcanaPortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterArcana field_85088_e;

    public ArcanaPortalPosition(TeleporterArcana arcanaTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = arcanaTeleporter;
        this.field_85087_d = par5;
    }
}