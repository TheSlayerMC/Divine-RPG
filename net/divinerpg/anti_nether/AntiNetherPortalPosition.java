package net.divinerpg.anti_nether;

import net.minecraft.util.ChunkCoordinates;

public class AntiNetherPortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterAntiNether field_85088_e;

    public AntiNetherPortalPosition(TeleporterAntiNether antiTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = antiTeleporter;
        this.field_85087_d = par5;
    }
}