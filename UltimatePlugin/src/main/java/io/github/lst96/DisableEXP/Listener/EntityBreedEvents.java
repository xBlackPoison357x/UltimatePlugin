package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class EntityBreedEvents
implements Listener {
    private UltimatePlugin plugin;

    public EntityBreedEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onBreak(EntityBreedEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Breeding")) {
            e.setExperience(0);
            e.getBreeder().sendMessage("Breeding has been disabled on this server!");
        }
    }
}

