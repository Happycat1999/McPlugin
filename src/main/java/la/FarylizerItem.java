package la;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FarylizerItem extends ItemStack implements Listener {

	private static final int META_NUMER = 123888123;
	private static final String NAME = ChatColor.GOLD + "§6§k k k §4§s Farylizer §6§k k k ";
	private Schuss aktuellerSchuss;
	private Player player;
	private boolean lava;
	private boolean water;

	public FarylizerItem(Player player, boolean wirWollenLava, boolean wirWollenWasser) {
		super(Material.NETHERITE_PICKAXE);
		ItemMeta farylizerMeta = super.getItemMeta();
		farylizerMeta.setDisplayName(NAME);
		farylizerMeta.setCustomModelData(META_NUMER);
		super.setItemMeta(farylizerMeta);
		this.aktuellerSchuss = new Schuss();
		this.player = player;
		this.lava = wirWollenLava;
		this.water = wirWollenWasser;
	}

	@EventHandler
	public void benutzeItem(PlayerInteractEvent event) {
		player.sendMessage(" §4§s Starte Event ");
		player.sendMessage(" §5§s Aktion ausgelöst: " + event.getEventName());
		if (event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK) {
			if (event.getHand() == EquipmentSlot.HAND) {
				if (player.getEquipment().getItemInMainHand().getItemMeta().hasCustomModelData() && player.getEquipment().getItemInMainHand().getItemMeta().getCustomModelData() == META_NUMER) {
					Partikel Feuer = new Partikel();
					Feuer.erstelleFeuerball(player);
					Block zielBlock = player.getTargetBlock(null, 0);
					aktuellerSchuss.zerstöreBlock(zielBlock, lava, water);
					player.sendMessage(" §1§s ENDE! §4§k k k §5§s Beende Plugin §4§k k k ");
				}
			}
		}
	}

}
