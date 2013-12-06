package net.divinerpg.worldgen;

import java.util.Random;

import net.divinerpg.helper.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenDivineOres implements IWorldGenerator {
	@Override
	public void generate(Random var1, int var2, int var3, World var4, IChunkProvider var5, IChunkProvider var6) {
		switch (var4.provider.dimensionId) {
		case -1:
			this.generateNether(var4, var1, var2 * 16, var3 * 16);
		case 0:
			this.generateSurface(var4, var1, var2 * 16, var3 * 16);
		default:
		}
	}

	public void generateEnd(World var4, Random var1, int i, int j) {

	}

	public void generateSurface(World var1, Random var2, int var3, int var4) {
		int var5;
		int var6;
		int var7;
		int var8;

		for (var5 = 0; var5 < 6; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(20);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(OverworldBlockHelper.realmiteOre.blockID, 5)).generate(var1, var2, var6, var7, var8);
		}

		for (var5 = 0; var5 < 4; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(15);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(OverworldBlockHelper.arlemiteOre.blockID, 3)).generate(var1, var2, var6, var7, var8);
		}

		for (var5 = 0; var5 < 4; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(15);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(OverworldBlockHelper.rupeeOre.blockID, 3)).generate(var1, var2, var6, var7, var8);
		}

		for (var5 = 0; var5 < 3; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(16);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(Block.oreDiamond.blockID, 6)).generate(var1, var2, var6, var7, var8);
		}

		if (var2.nextInt(8) == 0) {
			var5 = var3 + var2.nextInt(16) + 8;
			var6 = var2.nextInt(128);
			var7 = var4 + var2.nextInt(16) + 8;

			if (var6 < 63 || var2.nextInt(10) == 0) {
				(new WorldGenLakes(OverworldBlockHelper.Tar.blockID)).generate(var1, var2, var5, var6, var7);
			}
		}
	}

	public void generateNether(World var1, Random var2, int var3, int var4) {
		int var5;
		int var6;
		int var7;
		int var8;

		for (var5 = 0; var5 < 7; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(128);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(OverworldBlockHelper.netheriteOre.blockID, 6, Block.netherrack.blockID)).generate(var1, var2, var6, var7, var8);
		}

		for (var5 = 0; var5 < 7; ++var5) {
			var6 = var3 + var2.nextInt(16);
			var7 = var2.nextInt(128);
			var8 = var4 + var2.nextInt(16);
			(new WorldGenMinable(OverworldBlockHelper.bloodGemOre.blockID, 6, Block.netherrack.blockID)).generate(var1, var2, var6, var7, var8);
		}
	}
}
