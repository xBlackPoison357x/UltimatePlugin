package io.github.lst96.DisableEXP.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import io.github.lst96.UltimatePlugin.UltimatePlugin;

public class BlockBreakEvents
implements Listener {
    private UltimatePlugin plugin;

    public BlockBreakEvents(UltimatePlugin instance) {
        this.plugin = instance;
    }

    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        if (this.plugin.getDisableEXPConfig().getBoolean("EXP.Ore")) {
            e.setExpToDrop(0);
        }
    }
}

