package io.github.xBlackPoison357x.Information.Commands;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import io.github.xBlackPoison357x.UltimatePlugin.UltimatePlugin;

public class Vote
implements CommandExecutor {
    private UltimatePlugin plugin;

    public Vote(UltimatePlugin instance) {
        this.plugin = instance;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (commandLabel.equalsIgnoreCase("infovote")) {
            // empty if block
        }
        if (sender.isOp() || sender.hasPermission("information.vote")) {
            List<String> Vote2 = this.plugin.getInformationConfig().getStringList("Vote");
            sender.sendMessage((Object)ChatColor.DARK_BLUE + "--Current Voting Link(s)--");
            for (String Vote1 : Vote2) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)Vote1));
            }
            return true;
        }
        sender.sendMessage((Object)ChatColor.DARK_RED + this.plugin.pdfFile.getName() + (Object)ChatColor.RED + " I'm sorry, but you do not have permission to perform this command. Please contact the server administrators if you believe that this is in error.");
        return true;
    }
}

