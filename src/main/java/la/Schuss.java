package la;

import static org.bukkit.Bukkit.getLogger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class Schuss {
	
	public void zerstöreBlock(Block zielBlock, boolean lava, boolean water) {
		setzeBlock(zielBlock, holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, 0), holeZufallsMaterial(lava, water));
		setzeBlock(zielBlock.getRelative(1, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -2, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, -1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, -1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, -1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(2, -1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -1, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -1, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, -1, -2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, -1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, -1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, -1, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, -1, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-3, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(2, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(3, 0, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, 3), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, -2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 0, -3), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(2, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 0, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(2, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 0, -2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, 0, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 0, -2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, 0, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 2, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-2, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(2, 1, 0), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, 2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(0, 1, -2), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 1, -1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(-1, 1, 1), holeZufallsMaterial(lava , water));
		setzeBlock(zielBlock.getRelative(1, 1, 1), holeZufallsMaterial(lava , water));

		getLogger().info("Schuss abgegeben");
	}

	private Material holeZufallsMaterial(boolean lava, boolean water) {
		double r = Math.random();
		Material zielMaterial;
		if (r > 0.8)
			zielMaterial = Material.FIRE;
		else if (r < 0.1 && lava)
			zielMaterial = Material.LAVA;
		else if (water)
			zielMaterial = Material.WATER;
		else 
			zielMaterial = Material.AIR;
		return zielMaterial;
	}

	private void setzeBlock(Block block, Material material) {
		block.setType(material);
	}

	public String holeBlickRichtung(Player spezifischePlayer) {
		int yaw = Float.floatToIntBits(spezifischePlayer.getLocation().getYaw());
		if (yaw >= 45 && yaw < 135)
			return "South";
		if (yaw >= 135 && yaw < 180)
			return "West";
		if (yaw >= 180 && yaw < 225)
			return "Noth";
		else
			return "East";
	}

}
