package la;

import static org.bukkit.Bukkit.getLogger;

import java.util.Set;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public class Standort {
	public Location holeEigenerStandort(Player player) {
		Location location = player.getLocation();

		getLogger().info("Location:");
		getLogger().info(location.toString());

		return location;
	}

	public Location holeZielStandort(Player player) {
		getLogger().info("Facing: " + player.getFacing().toString());
		getLogger().info("Target Block: " + player.getTargetBlock(null, 0).toString());
		getLogger().info("Line of Sight: " + player.getLineOfSight(Set.of(), 0).toString());
		getLogger().info("Location:");

		getLogger().info("-------");

		return null;
	}
}
