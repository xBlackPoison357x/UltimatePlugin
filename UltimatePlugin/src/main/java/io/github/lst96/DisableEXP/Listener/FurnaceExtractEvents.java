package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceExtractEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class FurnaceExtractEvents
implements Listener {
    private UltimatePlugin plugin;

    public FurnaceExtractEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onSmelt(FurnaceExtractEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Smelt")) {
            e.setExpToDrop(0);
        }
    }
}

