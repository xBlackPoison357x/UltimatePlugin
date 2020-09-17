package io.github.lst96.Information.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class NetherBlock
implements Listener {
    private UltimatePlugin plugin;

    public NetherBlock(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void onPlayerMove(PlayerMoveEvent event) {
        Location playerLoc = event.getPlayer().getLocation();
        World world = Bukkit.getWorld((String)"world");
        Location loc = world.getSpawnLocation();
        String pname = event.getPlayer().getName();
        if (this.plugin.getInformationConfig().getBoolean("Blocktopofnetherbuilding") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.netherbuildbypass")) && event.getPlayer().getWorld().getName().endsWith("nether") && playerLoc.getY() == 128.0) {
            event.getPlayer().teleport(loc);
            event.getPlayer().sendMessage((Object)ChatColor.DARK_RED + "You are not allowed to walk/build on top of nether!");
            Bukkit.broadcast((String)((Object)ChatColor.RED + pname + " attempted to walk/build on top of nether."), (String)"information.netherbuild.notify");
        }
    }
}

