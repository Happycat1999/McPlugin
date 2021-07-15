package la;

import static org.bukkit.Bukkit.getLogger;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.DragonFireball;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

//import net.minecraft.network.protocol.game.PacketPlayOutWorldParticles;

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
		blickrichtung.multiply(4);
		meinFeuerball.setDirection(blickrichtung);
		meinFeuerball.getVelocity();
		meinFeuerball.setShooter(player);

//		new BukkitRunnable() {
//			@Override
//			public void run() {
//				int red = 255;
//				int green = 0;
//				int blue = 0;
//				Location location = meinFeuerball.getLocation();
//				Particle p = Particle.DOLPHIN;
//				
//				player.getWorld().spawn(location, p);
////				PacketPlayOutWorldParticles eo = new PacketPlayOutWorldParticles()
////				PacketPlayOutWorldParticles particles = new PacketPlayOutWorldParticles(EnumParticle.FLAME, true,
////						(float) location.getX(), (float) location.getY(), (float) location.getZ(), red, green, blue,
////						(float) 255, 0, 10);
//			}
//		}.runTaskTimerAsynchronously(this, 0.5, 0.5);
	}
}