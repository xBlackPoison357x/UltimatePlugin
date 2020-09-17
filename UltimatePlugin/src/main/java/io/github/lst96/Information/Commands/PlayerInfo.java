/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.PluginDescriptionFile
 */
package io.github.lst96.Information.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class PlayerInfo
implements CommandExecutor {
    private UltimatePlugin plugin;

    public PlayerInfo(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("player")) {
            if (sender.isOp() || sender.hasPermission("information.player")) {
                if (args.length != 1) {
                    sender.sendMessage((Object)ChatColor.RED + "Incorrect usage! Correct usage /player <playername>.");
                    return false;
                }
                Player targetplayer = Bukkit.getServer().getPlayer(args[0]);
                if (targetplayer == null) {
                    sender.sendMessage((Object)ChatColor.DARK_RED + args[0] + (Object)ChatColor.RED + " is currently not online.");
                    return true;
                }
                sender.sendMessage((Object)ChatColor.GOLD + "====== Player: " + (Object)ChatColor.RED + targetplayer.getName() + (Object)ChatColor.GOLD + " ======");
                sender.sendMessage((Object)ChatColor.GOLD + " Nick: " + (Object)ChatColor.WHITE + targetplayer.getDisplayName());
                sender.sendMessage((Object)ChatColor.GOLD + " UUID: " + (Object)ChatColor.WHITE + targetplayer.getUniqueId());
                sender.sendMessage((Object)ChatColor.GOLD + " Health: " + (Object)ChatColor.WHITE + targetplayer.getHealth() + "/20");
                sender.sendMessage((Object)ChatColor.GOLD + " Hunger: " + (Object)ChatColor.WHITE + targetplayer.getFoodLevel() + "/20" + " (+" + targetplayer.getSaturation() + " saturation)");
                sender.sendMessage((Object)ChatColor.GOLD + " Exp: " + (Object)ChatColor.WHITE + targetplayer.getExp() + "(Level " + targetplayer.getLevel() + ")");
                sender.sendMessage((Object)ChatColor.GOLD + " Location: " + (Object)ChatColor.WHITE + "(" + targetplayer.getLocation().getWorld().getName() + ", " + targetplayer.getLocation().getBlockX() + ", " + targetplayer.getLocation().getBlockY() + ", " + targetplayer.getLocation().getBlockZ() + ")");
                sender.sendMessage((Object)ChatColor.GOLD + " IP Address: " + (Object)ChatColor.WHITE + targetplayer.getAddress());
                sender.sendMessage((Object)ChatColor.GOLD + " Gamemode: " + (Object)ChatColor.WHITE + (Object)targetplayer.getGameMode());
                sender.sendMessage((Object)ChatColor.GOLD + " OP: " + (Object)ChatColor.GREEN + targetplayer.isOp());
                sender.sendMessage((Object)ChatColor.GOLD + " Fly mode: " + (Object)ChatColor.GREEN + targetplayer.isFlying());
                return true;
            }
            sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + " I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
            return false;
        }
        return false;
    }
}

