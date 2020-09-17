/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.configuration.file.FileConfiguration
 *  org.bukkit.plugin.PluginDescriptionFile
 */
package io.github.lst96.Information.Commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class Twitter
implements CommandExecutor {
    private UltimatePlugin plugin;

    public Twitter(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("twitter")) {
            // empty if block
        }
        if (sender.isOp() || sender.hasPermission("information.twitter")) {
            List<String> Twitter2 = this.plugin.getInformationConfig().getStringList("Twitter");
            sender.sendMessage((Object)ChatColor.DARK_BLUE + "--Twitter Link(s)--");
            for (String Twitter1 : Twitter2) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)Twitter1));
            }
            return true;
        }
        sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + "I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        return true;
    }
}

