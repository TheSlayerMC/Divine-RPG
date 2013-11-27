package net.divinerpg.azurite.gen;

import net.minecraft.util.ChunkCoordinates;

public class AzuritePortalPosition extends ChunkCoordinates
{
    public long field_85087_d;
    final TeleporterAzurite field_85088_e;

    public AzuritePortalPosition(TeleporterAzurite azuriteTeleporter, int par2, int par3, int par4, long par5)
    {
        super(par2, par3, par4);
        this.field_85088_e = azuriteTeleporter;
        this.field_85087_d = par5;
    }
}