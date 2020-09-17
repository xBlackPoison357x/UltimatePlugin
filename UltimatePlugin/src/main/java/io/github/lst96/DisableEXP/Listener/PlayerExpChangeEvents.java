package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class PlayerExpChangeEvents
implements Listener {
    private UltimatePlugin plugin;

    public PlayerExpChangeEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onPlayerExpChange(PlayerExpChangeEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.ALL")) {
            e.setAmount(0);
        }
    }
}

