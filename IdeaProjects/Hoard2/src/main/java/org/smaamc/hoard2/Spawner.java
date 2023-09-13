package org.smaamc.hoard2;

import org.bukkit.command.CommandSender;
import java.util.List;

public class Spawner {
    private boolean startHoard(CommandSender sender, boolean hoardEnabled) {
        if (hoardEnabled) {
            getLogger().info("Hoard is already running.");
        }
        return false;
    }
}
