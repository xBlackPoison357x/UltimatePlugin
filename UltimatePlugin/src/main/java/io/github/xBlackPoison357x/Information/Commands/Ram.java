package io.github.xBlackPoison357x.Information.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.xBlackPoison357x.Information.Runnables.Tps;
import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

public class Ram
implements CommandExecutor {
    public final long serverStart = System.currentTimeMillis();
    private UltimatePlugin plugin;

    public Ram(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        double tps = Tps.getTPS();
        ChatColor color = tps >= 18.0 ? ChatColor.GREEN : (tps >= 15.0 ? ChatColor.YELLOW : ChatColor.RED);
        Runtime runtime = Runtime.getRuntime();
        System.gc();
        if (sender.isOp() || sender.hasPermission("information.ram")) {
            long diff = System.currentTimeMillis() - this.serverStart;
            sender.sendMessage((Object)ChatColor.GOLD + "[Uptime]: " + (Object)ChatColor.WHITE + (int)(diff / 604800000L) + "w " + (int)(diff / 86400000L % 7L) + "d " + (int)(diff / 3600000L % 24L) + "h " + (int)(diff / 60000L % 60L) + "m " + (int)(diff / 1000L % 60L) + "s");
            sender.sendMessage((Object)ChatColor.GOLD + "[Tps]: " + (Object)color + Math.round(Tps.getTPS() / 100.0 * 100.0) + " " + Math.round(Tps.getTPS() / 20.0 * 100.0 / 100.0 * 100.0) + "%");
            sender.sendMessage((Object)ChatColor.GOLD + "[Processor(s)] " + (Object)ChatColor.WHITE + runtime.availableProcessors());
            sender.sendMessage((Object)ChatColor.GOLD + "[Maximum Ram]: " + (Object)ChatColor.WHITE + runtime.maxMemory() / 1024L / 1024L + " MB" + " " + runtime.maxMemory() * 100L / runtime.maxMemory() + "%");
            sender.sendMessage((Object)ChatColor.GOLD + "[Allocated Ram]: " + (Object)ChatColor.WHITE + runtime.totalMemory() / 1024L / 1024L + " MB" + " " + runtime.totalMemory() * 100L / runtime.maxMemory() + "%");
            sender.sendMessage((Object)ChatColor.GOLD + "[Used Ram]: " + (Object)ChatColor.WHITE + (runtime.totalMemory() - runtime.freeMemory()) / 1024L / 1024L + " MB" + " " + (runtime.maxMemory() - runtime.freeMemory()) * 100L / runtime.maxMemory() + "%");
            sender.sendMessage((Object)ChatColor.GOLD + "[Free Ram]: " + (Object)ChatColor.WHITE + runtime.freeMemory() / 1024L / 1024L + " MB" + " " + runtime.freeMemory() * 100L / runtime.maxMemory() + "%");
            if (Bukkit.getVersion().startsWith("git-Bukkit")) {
                sender.sendMessage((Object)ChatColor.GOLD + "[CraftBukkit Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            } else if (Bukkit.getVersion().startsWith("git-Spigot")) {
                sender.sendMessage((Object)ChatColor.GOLD + "[Spigot Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            } else {
                sender.sendMessage((Object)ChatColor.GOLD + "[Unknown Version]: " + (Object)ChatColor.WHITE + Bukkit.getVersion() + " (Implementing API version " + Bukkit.getBukkitVersion() + ")");
            }
            sender.sendMessage((Object)ChatColor.GOLD + "[" + this.plugin.pdfFile.getName() + "]: " + (Object)ChatColor.WHITE + "v" + this.plugin.pdfFile.getVersion());
            return true;
        }
        sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + " I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        return true;
    }
}

