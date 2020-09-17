package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class PlayerFishEvents
implements Listener {
    private UltimatePlugin plugin;

    public PlayerFishEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onFish(PlayerFishEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Fish")) {
            e.setExpToDrop(0);
        }
    }
}

