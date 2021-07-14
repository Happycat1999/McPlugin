package la;

import static org.bukkit.Bukkit.getLogger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

public class Schuss {

	public void zerstöreBlock(Block zielBlock) {
		setzeBlock(zielBlock, holeZufallsMaterial());
		setzeBlock(zielBlock.getRelative(-1, 0, 0), holeZufallsMaterial()); 	// links
		setzeBlock(zielBlock.getRelative(1, 0, 0), holeZufallsMaterial()); 		// rechts
		setzeBlock(zielBlock.getRelative(0, 0, 1), holeZufallsMaterial()); 		// darüber
		setzeBlock(zielBlock.getRelative(0, 0, -1), holeZufallsMaterial());		// darunter
		setzeBlock(zielBlock.getRelative(0, 1, 0), holeZufallsMaterial()); 		// davor
		setzeBlock(zielBlock.getRelative(0, -1, 0), holeZufallsMaterial()); 	// dahinter
		getLogger().info("Schuss abgegeben");
	}
	
	private Material holeZufallsMaterial() {
		double r = Math.random();
		Material zielMaterial = Material.AIR;
		if (r > 0.8)
			zielMaterial = Material.WATER;
		else if (r > 0.6)
			zielMaterial = Material.FIRE;
		
		return zielMaterial;
	}

	private void setzeBlock(Block block, Material material) {
		getLogger().info("Lösche Block: " + block.toString());
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
	
	
	
	

	public void old_unused(Location loc, int length, int breite, int Höhe, String direction, Player schütze) {

		int x1 = loc.getBlockX();
		int y1 = loc.getBlockY();
		int z1 = loc.getBlockZ();
		getLogger().info("X ---> " + x1);
		getLogger().info("Y ---> " + y1);
		getLogger().info("Z ---> " + z1);

		if (direction == "EAST") {

//	  löscheBlockEast(schütze) {
//		  while(direction == EAST) {
//	  }
			Block currentBlock1 = schütze.getTargetBlock(null, 0);
			getLogger().info("Block: " + currentBlock1.toString());
			currentBlock1.setType(Material.AIR);

			Block currentBlock2 = currentBlock1.getRelative(-1, 0, 0);
			getLogger().info("Block: " + currentBlock2.toString());
			currentBlock2.setType(Material.AIR);

			Block currentBlock3 = currentBlock1.getRelative(1, 0, 0);
			getLogger().info("Block: " + currentBlock3.toString());
			currentBlock3.setType(Material.AIR);

			Block currentBlock4 = currentBlock1.getRelative(0, 1, 0);
			getLogger().info("Block: " + currentBlock4.toString());
			currentBlock4.setType(Material.AIR);

			Block currentBlock5 = currentBlock1.getRelative(0, -1, 0);
			getLogger().info("Block: " + currentBlock5.toString());
			currentBlock5.setType(Material.AIR);

			Block currentBlock6 = currentBlock1.getRelative(0, 0, 1);
			getLogger().info("Block: " + currentBlock6.toString());
			currentBlock6.setType(Material.AIR);

			Block currentBlock7 = currentBlock1.getRelative(0, 0, -1);
			getLogger().info(currentBlock7.toString());
			currentBlock7.setType(Material.AIR);

			Block currentBlock8 = currentBlock1.getRelative(1, 0, -1);
			getLogger().info("Block: " + currentBlock8.toString());
			currentBlock8.setType(Material.AIR);

			Block currentBlock9 = currentBlock1.getRelative(1, 0, 1);
			getLogger().info("Block: " + currentBlock9.toString());
			currentBlock9.setType(Material.AIR);

			Block currentBlock10 = currentBlock1.getRelative(1, 1, 0);
			getLogger().info("Block: " + currentBlock10.toString());
			currentBlock10.setType(Material.AIR);

			Block currentBlock11 = currentBlock1.getRelative(1, -1, 0);
			getLogger().info("Block: " + currentBlock11.toString());
			currentBlock11.setType(Material.AIR);
			getLogger().info("Block wurde gelöscht ");
		}
	}

}
