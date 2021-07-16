package la;

import static org.bukkit.Bukkit.getLogger;

import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;


public class Partikel {

	public void schreibeAktuelleLocation(Player player) {
		player.getLocation();
		getLogger().info(" Die Position vom Spieler " + player.getLocation());
	}

	public void erstelleFeuerball(Player player) {

		player.getTargetBlock(null, 0);
		player.getClientViewDistance();
		player.sendMessage("->" + player.getClientViewDistance());

		player.sendMessage("erstelle Feuerball");
		Vector blickrichtung = player.getEyeLocation().getDirection();
		DragonFireball meinFeuerball = player.getWorld().spawn(player.getLocation(), DragonFireball.class);
		meinFeuerball.setDirection(blickrichtung);
		meinFeuerball.setVelocity(blickrichtung.multiply(5));
		meinFeuerball.setShooter(player);
	}
}