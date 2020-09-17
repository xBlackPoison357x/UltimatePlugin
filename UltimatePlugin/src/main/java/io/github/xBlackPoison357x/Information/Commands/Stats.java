package io.github.xBlackPoison357x.Information.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

public class Stats
implements CommandExecutor {
    private UltimatePlugin plugin;

    public Stats(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("stats")) {
            // empty if block
        }
        if (sender.isOp() || sender.hasPermission("information.stats")) {
            sender.sendMessage((Object)ChatColor.GOLD + "[Online Mode]: " + (Object)ChatColor.GREEN + Bukkit.getOnlineMode());
            sender.sendMessage((Object)ChatColor.GOLD + "[Flight Allowed]: " + (Object)ChatColor.GREEN + Bukkit.getAllowFlight());
            sender.sendMessage((Object)ChatColor.GOLD + "[Nether Allowed]: " + (Object)ChatColor.GREEN + Bukkit.getAllowNether());
            sender.sendMessage((Object)ChatColor.GOLD + "[End Allowed]: " + (Object)ChatColor.GREEN + Bukkit.getAllowEnd());
            sender.sendMessage((Object)ChatColor.GOLD + "[View Distance]: " + (Object)ChatColor.WHITE + Bukkit.getViewDistance());
            sender.sendMessage((Object)ChatColor.GOLD + "[Default GameMode]: " + (Object)ChatColor.WHITE + (Object)Bukkit.getDefaultGameMode());
            sender.sendMessage((Object)ChatColor.GOLD + "[Spawn Radius]: " + (Object)ChatColor.WHITE + Bukkit.getSpawnRadius());
            sender.sendMessage((Object)ChatColor.GOLD + "[Animal Spawn Limit]: " + (Object)ChatColor.WHITE + Bukkit.getAnimalSpawnLimit());
            sender.sendMessage((Object)ChatColor.GOLD + "[Monster Spawn Limit]: " + (Object)ChatColor.WHITE + Bukkit.getMonsterSpawnLimit());
            sender.sendMessage((Object)ChatColor.GOLD + "[Ambient Spawn Limit]: " + (Object)ChatColor.WHITE + Bukkit.getAmbientSpawnLimit());
            sender.sendMessage((Object)ChatColor.GOLD + "[Ticks Per Animal Spawn]: " + (Object)ChatColor.WHITE + Bukkit.getTicksPerAnimalSpawns());
            sender.sendMessage((Object)ChatColor.GOLD + "[Ticks Per Monster Spawn]: " + (Object)ChatColor.WHITE + Bukkit.getTicksPerMonsterSpawns());
            sender.sendMessage((Object)ChatColor.GOLD + "[Ops]: " + (Object)ChatColor.WHITE + Bukkit.getServer().getOperators());
            if (Bukkit.getVersion().startsWith("git-Bukkit")) {
                sender.sendMessage((Object)ChatColor.GOLD + "[CraftBukkit Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            } else if (Bukkit.getVersion().startsWith("git-Spigot")) {
                sender.sendMessage((Object)ChatColor.GOLD + "[Spigot Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            } else {
                sender.sendMessage((Object)ChatColor.GOLD + "[Unknown Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            }
            sender.sendMessage((Object)ChatColor.GOLD + this.plugin.pdfFile.getName() + (Object)ChatColor.WHITE + Bukkit.getServer().getPluginManager().getPlugin("UltimatePlugin").getDescription().getVersion());
            return true;
        }
        sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + " I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        return true;
    }
}

