/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.command.ConsoleCommandSender
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerChangedWorldEvent
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package io.github.lst96.Information.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class JoinWorld
implements Listener {
    private UltimatePlugin plugin;

    public JoinWorld(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void onPlayerChangeWorld(PlayerChangedWorldEvent event) {
        World world;
        Location loc;
        World end;
        World nether;
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.end")) && event.getPlayer().getWorld().getName().endsWith("end")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world")) {
                world = Bukkit.getWorld((String)"world");
                loc = world.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the end!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether")) {
                nether = Bukkit.getWorld((String)"world_nether");
                loc = nether.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_nether instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.nether")) && event.getPlayer().getWorld().getName().endsWith("nether")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world")) {
                world = Bukkit.getWorld((String)"world");
                loc = world.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the nether!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
                end = Bukkit.getWorld((String)"world_the_end");
                loc = end.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_end instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.world")) && event.getPlayer().getWorld().getName().endsWith("world")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether")) {
                nether = Bukkit.getWorld((String)"world_nether");
                loc = nether.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the world!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
                end = Bukkit.getWorld((String)"world_the_end");
                loc = end.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_the_end instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world") && this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_nether") && this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
            event.getPlayer().kickPlayer("Config Error, all worlds are disabled, please undisable at least 1 world.");
            this.plugin.console.sendMessage((Object)ChatColor.DARK_RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST)
    public void onPlayerChangeWorld(PlayerJoinEvent event) {
        World world;
        Location loc;
        World end;
        World nether;
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.end")) && event.getPlayer().getWorld().getName().endsWith("end")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world")) {
                world = Bukkit.getWorld((String)"world");
                loc = world.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the end!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether")) {
                nether = Bukkit.getWorld((String)"world_nether");
                loc = nether.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_nether instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.nether")) && event.getPlayer().getWorld().getName().endsWith("nether")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world")) {
                world = Bukkit.getWorld((String)"world");
                loc = world.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the nether!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
                end = Bukkit.getWorld((String)"world_the_end");
                loc = end.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_end instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world") && (!event.getPlayer().isOp() || !event.getPlayer().hasPermission("information.joinbypass.world")) && event.getPlayer().getWorld().getName().endsWith("world")) {
            if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_nether")) {
                nether = Bukkit.getWorld((String)"world_nether");
                loc = nether.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage((Object)ChatColor.RED + "You are not allowed to join the world!");
            } else if (!this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
                end = Bukkit.getWorld((String)"world_the_end");
                loc = end.getSpawnLocation();
                event.getPlayer().teleport(loc);
                event.getPlayer().sendMessage("World disabled, teleporting to world_the_end instead");
            } else {
                event.getPlayer().sendMessage((Object)ChatColor.RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            }
        }
        if (this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world") && this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_nether") && this.plugin.getInformationConfig().getBoolean("Disabled Join Worlds.world_the_end")) {
            event.getPlayer().kickPlayer((Object)ChatColor.DARK_RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            this.plugin.console.sendMessage((Object)ChatColor.DARK_RED + "Config Error, all worlds are disabled, please undisable at least 1 world.");
            Bukkit.broadcastMessage((String)((Object)ChatColor.DARK_RED + "Config Error, all worlds are disabled, please undisable at least 1 world."));
        }
    }
}

