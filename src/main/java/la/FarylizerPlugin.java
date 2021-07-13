package la;

import java.util.List;
import java.util.Set;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class FarylizerPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoken");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		getLogger().info("Kommando aufgerufen:" + cmd.getName());
		Player player = (Player) sender;

		System.out.println("Test");

		if (cmd.getName().equalsIgnoreCase("getLocation")) {
			holeEigenerStandort(player);
			holeZielStandort(player);
		}

		if (cmd.getName().equalsIgnoreCase("DeleteBlock")) {

			gugunlerCube(player.getLocation(), 0, 0, 0, "EAST", player);
			String direction = testeMethode(player);
			if (direction.equalsIgnoreCase("EAST")) {
//				löscheBlockEast(player);
			}
			if (direction.equalsIgnoreCase("WEST")) {
				löscheBlockWest(player);
			}

		}

		return true;
	}

	private Location holeEigenerStandort(Player player) {
		Location location = player.getLocation();

		getLogger().info("Location:");
		getLogger().info(location.toString());

		return location;
	}

	private Location holeZielStandort(Player player) {
		getLogger().info("Facing: " + player.getFacing().toString());
		getLogger().info("Target Block: " + player.getTargetBlock(null, 0).toString());
		getLogger().info("Line of Sight: " + player.getLineOfSight(Set.of(), 0).toString());
		getLogger().info("Location:");

		getLogger().info("-------");

		return null;
	}

	public void gugunlerCube(Location loc, int length, int breite, int Höhe, String direction, Player schütze) {

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
			currentBlock2.setType(Material.AIR);

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

	private void löscheBlockWest(Player player) {
		Material zielMaterial = Material.AIR;
		Block startBlock = player.getTargetBlock(null, 0);
		setzeBlock(startBlock, zielMaterial);
		setzeBlock(startBlock.getRelative(-1, 0, 0), zielMaterial);
		setzeBlock(startBlock.getRelative(1, 0, 0), zielMaterial);
		setzeBlock(startBlock.getRelative(0, 1, 0), zielMaterial);
		setzeBlock(startBlock.getRelative(0, -1, 0), zielMaterial);
		setzeBlock(startBlock.getRelative(0, 0, 1), zielMaterial);
		setzeBlock(startBlock.getRelative(0, 0, -1), zielMaterial);
		setzeBlock(startBlock.getRelative(1, 0, -1), zielMaterial);
		setzeBlock(startBlock.getRelative(1, 0, 1), zielMaterial);
		setzeBlock(startBlock.getRelative(1, 1, 0), zielMaterial);
		setzeBlock(startBlock.getRelative(1, -1, 0), zielMaterial);
		getLogger().info("Schuss abgegeben");
	}

	private void setzeBlock(Block block, Material material) {
		getLogger().info("Lösche Block: " + block.toString());
		block.setType(material);
	}

	private String testeMethode(Player spezifischePlayer) {
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