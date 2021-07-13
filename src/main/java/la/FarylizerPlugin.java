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

import sun.tools.jconsole.Plotter;

public class FarylizerPlugin extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoken");
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		getLogger().info("Kommando aufgerufen:" + cmd.getName());
		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("getLocation")) {
			holeEigenerStandort(player);
			holeZielStandort(player);
		}

		if (cmd.getName().equalsIgnoreCase("DeleteBlock")) {
			löscheBlock(player);
			gugunlerCube(player.getLocation(), 0, 0, 0);
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

	public void gugunlerCube(Location loc, int length, int breite, int Höhe) {

		int x1 = loc.getBlockX();
		int y1 = loc.getBlockY();
		int z1 = loc.getBlockZ();
		getLogger().info("X ---> " + x1);
		getLogger().info("Y ---> " + y1);
		getLogger().info("Z ---> " + z1);
	}

	private void löscheBlock(Player player) {
		Block currentBlock1 = player.getTargetBlock(null, 0);
		getLogger().info("Block: " + currentBlock1.toString());
		currentBlock1.setType(Material.STONE);

		Block currentBlock2 = currentBlock1.getRelative(-1, 0, 0);
		getLogger().info("Block: " + currentBlock2.toString());
		currentBlock2.setType(Material.STONE);

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

	private String testeMethode(Player spezifischePlayer) {
	    int yaw = Float.floatToIntBits(spezifischePlayer.getLocation().getYaw());
	    if(yaw >= 45 && yaw < 135)
	       return "South";
	    if(yaw >= 135 && yaw < 180)
	       return "West";
	
	    if(yaw >= 180 && yaw < 225)
	       return "Noth";
	
	    return "East";
	}

}