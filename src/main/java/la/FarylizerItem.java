package la;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.event.player.PlayerInteractEvent;

public class FarylizerItem extends ItemStack implements Listener {

	private static final String NAME = ChatColor.GOLD + "§6§k k k §4§s Farylizer §6§k k k ";
	private Schuss aktuellerSchuss;
	private Standort aktuellerStandort;
	private Player player;

	public FarylizerItem(Player player) {
		super(Material.NETHERITE_PICKAXE);
		ItemMeta farylizerMeta = super.getItemMeta();
		farylizerMeta.setDisplayName(NAME);
		
		super.setItemMeta(farylizerMeta);

		this.aktuellerSchuss = new Schuss();
		this.aktuellerStandort = new Standort();
		this.player = player;
		System.out.println(aktuellerStandort);
	}

	@EventHandler
	public void benutzeItem(PlayerInteractEvent event) {
		player.sendMessage(" §5§s Aktion ausgelöst: " + event.getEventName());

//		String blickrichtung = aktuellerSchuss.holeBlickRichtung(player);
//		if (blickrichtung.equalsIgnoreCase("EAST")) {
//			getLogger().info("Wir blicken nach osten");
//		}
		if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (event.getHand() == EquipmentSlot.HAND) {
				player.sendMessage("if 2 : " + player.getEquipment().getItemInMainHand().getItemMeta().getDisplayName());
				if (player.getEquipment().getItemInMainHand() instanceof FarylizerItem) {
					player.sendMessage("if 3 ");
					Block zielBlock = player.getTargetBlock(null, 0);
					aktuellerSchuss.zerstöreBlock(zielBlock);
					player.sendMessage(" §1§s ENDE! §4§k k k §5$s Beende Plugin §4§k k k ");
				}
			}
		}
	}

}
