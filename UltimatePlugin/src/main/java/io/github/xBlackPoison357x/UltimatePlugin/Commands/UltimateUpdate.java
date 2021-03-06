package io.github.xBlackPoison357x.UltimatePlugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

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

