package org.smaamc.hoard2;


import org.bukkit.plugin.java.JavaPlugin;

public final class Hoard2 extends JavaPlugin {

    private boolean isHoardRunning = false;
    private Hoard2 plugin;

    public Hoard2() {
        this.plugin = plugin;
    }

    public boolean getHoardRunning() {
        return isHoardRunning;
    }

    @Override
    public void onEnable() {
        getLogger().info("Hoard2 Enabled.");
    //        getConfig();
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        getLogger().info("Hoard2 Disabled.");
        // Plugin shutdown logic
    }
}
