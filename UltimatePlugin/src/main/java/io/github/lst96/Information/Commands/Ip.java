/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 */
package io.github.lst96.Information.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class Ip
implements CommandExecutor {
    public Ip(UltimatePlugin instance) {
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("ip")) {
            // empty if block
        }
        if (sender.isOp() || sender.hasPermission("information.ip")) {
            sender.sendMessage(Bukkit.getServer().getIp().toString());
        }
        return false;
    }
}

