/*
 * Decompiled with CFR 0.137.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 */
package io.github.lst96.UltimatePlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class UltimateUpdate
implements CommandExecutor {
    private UltimatePlugin plugin;

    public UltimateUpdate(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("ultimateupdate") && (sender.isOp() || sender.hasPermission("ultimate.update"))) {
            this.plugin.setupUpdater();
        }
        return false;
    }
}

