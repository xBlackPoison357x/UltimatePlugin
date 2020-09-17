package io.github.lst96.Information.Commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class Einfo
implements CommandExecutor {
    private UltimatePlugin plugin;

    public Einfo(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("einfo")) {
            // empty if block
        }
        if (sender.isOp() || sender.hasPermission("information.extra")) {
            List<String> Extra = this.plugin.getInformationConfig().getStringList("Extra");
            sender.sendMessage((Object)ChatColor.DARK_BLUE + "--Extra(s)--");
            for (String Extra1 : Extra) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)Extra1));
            }
            return true;
        }
        sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + "I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        return true;
    }
}
