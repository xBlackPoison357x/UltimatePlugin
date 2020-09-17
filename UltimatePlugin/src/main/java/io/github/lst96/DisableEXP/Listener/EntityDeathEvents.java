package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class EntityDeathEvents
implements Listener {
    private UltimatePlugin plugin;

    public EntityDeathEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onDeath(EntityDeathEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Mob")) {
            e.setDroppedExp(0);
        }
    }
}

