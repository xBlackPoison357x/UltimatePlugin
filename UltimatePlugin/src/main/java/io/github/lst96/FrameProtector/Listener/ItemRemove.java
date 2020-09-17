package io.github.lst96.FrameProtector.Listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemFrame;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class ItemRemove
implements Listener {
    private UltimatePlugin plugin;

    public ItemRemove(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void onDestroyByEntity(HangingBreakByEntityEvent event) {
        String msg1 = this.plugin.getFrameProtectorConfig().getString("Messages.Remove Frame Deny Message");
        if (event.getRemover() instanceof Player) {
            Player p = (Player)event.getRemover();
            if (event.getEntity().getType() == EntityType.ITEM_FRAME && !p.isOp() || !p.hasPermission("frame.remove")) {
                event.setCancelled(true);
                if (this.plugin.getFrameProtectorConfig().getBoolean("Messages.Enable")) {
                    p.sendMessage((Object)ChatColor.DARK_RED + msg1);
                    return;
                }
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void OnPlaceByEntity(HangingPlaceEvent event) {
        String msg2 = this.plugin.getFrameProtectorConfig().getString("Messages.Place Deny Message");
        Player p = event.getPlayer();
        if (event.getEntity().getType() == EntityType.ITEM_FRAME) {
            p.hasPermission("frame.place");
        }
        if (!p.isOp() && !p.hasPermission("frame.place")) {
            event.setCancelled(true);
            if (this.plugin.getFrameProtectorConfig().getBoolean("Messages.Enable")) {
                p.sendMessage((Object)ChatColor.DARK_RED + msg2);
                return;
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void canRotate(PlayerInteractEntityEvent event) {
        String msg3 = this.plugin.getFrameProtectorConfig().getString("Messages.Rotate Deny Message");
        Entity entity = event.getRightClicked();
        Player player = event.getPlayer();
        if (!entity.getType().equals((Object)EntityType.ITEM_FRAME)) {
            return;
        }
        ItemFrame iFrame = (ItemFrame)entity;
        if (iFrame.getItem().equals(null) || iFrame.getItem().getType().equals((Object)Material.AIR)) {
            return;
        }
        if (!player.isOp() && !player.hasPermission("frame.rotate")) {
            event.setCancelled(true);
            if (this.plugin.getFrameProtectorConfig().getBoolean("Messages.Enable")) {
                player.sendMessage((Object)ChatColor.DARK_RED + msg3);
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void ItemRemoval(EntityDamageByEntityEvent e) {
        Player p = null;
        String msg4 = this.plugin.getFrameProtectorConfig().getString("Messages.Remove Item Deny Message");
        if (e.getDamager() instanceof Player) {
            p = (Player)e.getDamager();
            if (e.getEntity().getType() == EntityType.ITEM_FRAME && !p.isOp() && !p.hasPermission("frame.item.remove")) {
                e.setCancelled(true);
                if (this.plugin.getFrameProtectorConfig().getBoolean("Messages.Enable")) {
                    p.sendMessage((Object)ChatColor.DARK_RED + msg4);
                }
            }
        }
        if (e.getDamager() instanceof Projectile && e.getEntity().getType() == EntityType.ITEM_FRAME && !(p.getPlayer().isOp()) && !p.hasPermission("frame.item.remove")) {
            e.setCancelled(true);
            if (this.plugin.getFrameProtectorConfig().getBoolean("Messages.Enable")) {
                p.sendMessage((Object)ChatColor.DARK_RED + msg4);
            }
        }
    }
}

