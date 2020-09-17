package io.github.xBlackPoison357x.FrameProtector.Listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

public class ItemFramePlace implements Listener {
	private UltimatePlugin plugin;

	public ItemFramePlace(UltimatePlugin instance) {
		this.plugin = instance;
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void FrameRemove(HangingBreakByEntityEvent event) {
		if (event.getRemover() instanceof Player) {
			Player p = (Player) event.getRemover();
			if (event.getEntity().getType() == EntityType.ITEM_FRAME) {
				this.plugin.getFrameProtectorConfig().set("Item Frame.Owner", (Object) p.getName());
				this.plugin.getFrameProtectorConfig().set("Item Frame.UUID", (Object) p.getUniqueId());
				this.plugin.getFrameProtectorConfig().set("Item Frame.loc.world",
						(Object) event.getEntity().getLocation());
				this.plugin.getFrameProtectorConfig().set("Item Frame.loc.x",
						(Object) event.getEntity().getLocation().getBlockX());
				this.plugin.getFrameProtectorConfig().set("Item Frame.loc.y",
						(Object) event.getEntity().getLocation().getBlockY());
				this.plugin.getFrameProtectorConfig().set("Item Frame.loc.z",
						(Object) event.getEntity().getLocation().getBlockZ());
				Bukkit.broadcastMessage((String) "Code Appears to be working!");
				return;
			}
		}
	}
}
