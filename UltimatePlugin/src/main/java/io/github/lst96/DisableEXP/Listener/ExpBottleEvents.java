package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class ExpBottleEvents
implements Listener {
    private UltimatePlugin plugin;

    public ExpBottleEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onBottle(ExpBottleEvent event) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Exp Bottle")) {
            event.setExperience(0);
        }
    }
}

