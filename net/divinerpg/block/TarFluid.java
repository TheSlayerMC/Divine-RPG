package net.divinerpg.block;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class TarFluid extends Fluid{

	public TarFluid() {
		super("Tar");
		setDensity(10);
		setViscosity(5000);
		FluidRegistry.registerFluid(this);
 	}

}
