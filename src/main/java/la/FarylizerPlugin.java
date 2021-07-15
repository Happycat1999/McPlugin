package la;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
//import org.bukkit.craftbukkit.libs.org.apache.commons.io.FileUtils;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class FarylizerPlugin extends JavaPlugin {

	private FarylizerItem farylizerItem;

	@Override
	public void onEnable() {
		getLogger().info("onEnable has been invoken");
	}

	@Override
	public void onDisable() {
		if (this.farylizerItem != null)
			HandlerList.unregisterAll(this.farylizerItem);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		getLogger().info("Kommando aufgerufen:" + cmd.getName());
		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("farylizer")) {
			// erstelle für den Spieler das neue Farylizer Item
			this.farylizerItem = new FarylizerItem(player);
			

			// packe das Item in das Inventory des Spielers
			gibCoolesItem(player, farylizerItem);

			// reagiere auf Ereignisse des Items
			getServer().getPluginManager().registerEvents(farylizerItem, this);
		}

		if (cmd.getName().equalsIgnoreCase("generateCube")) {
			Cube cube = new Cube();
			cube.erstelleCube(player.getLocation(), 10, 10, 10);
		}
		if (cmd.getName().equalsIgnoreCase("sichtweite")) {
			Partikel p = new Partikel();
			p.erstelleFeuerball(player);
		}
		if (cmd.getName().equalsIgnoreCase("deleteWorld"))
			deleteWorld();

		return true;
	}

	private void gibCoolesItem(Player player, ItemStack item) {
		player.sendMessage("§4§s Erhalte " + item.getItemMeta().getDisplayName() + " §4§s  Item ");

		player.getInventory().addItem(item);
	}

	private void deleteWorld() {
		for (Player all : Bukkit.getOnlinePlayers()) {
			all.kickPlayer("Lösche Welt");
		}
		List<World> worlds = Bukkit.getWorlds();
		worlds.stream().forEach(world -> {
			getLogger().info("Lösche Welt " + world.getName() + " ...");
			final File src = new File(Bukkit.getWorldContainer() + File.separator + world.getName());

			world.setKeepSpawnInMemory(false);
			Bukkit.unloadWorld(world, false);
			world.getWorldFolder().delete();
			
//			try {
//				FileUtils.deleteDirectory(src);
//			} catch (Exception e) {
				getLogger().info("Datei " +src.getPath() + " " + src.getName());
//				e.printStackTrace();
//			}
		});
	}

}