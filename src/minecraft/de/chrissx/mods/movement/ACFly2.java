package de.chrissx.mods.movement;

import de.chrissx.mods.Mod;

public class ACFly2 extends Mod {

	double startY = 0;
	
	public ACFly2() {
		super("Fly-Bypass2", "flyac2");
	}

	@Override
	public void onTick() {
		if(startY > player().posY)
			player().motionY = 0.5;
	}

	@Override
	public void toggle() {
		enabled = !enabled;
		startY = player().posY;
	}
}
