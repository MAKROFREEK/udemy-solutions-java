package org.smaamc.hoard2;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.io.File;
import java.util.*;

public class Location {

    private Map<UUID, org.bukkit.Location> playerLocation;
    // method that pings player(s) location every 15 seconds
    public org.bukkit.Location getPlayerLocation(UUID playerId) {
        return playerLocation.get(playerId);
    }

    // for safer mob spawning

        private Location getRandomSafeLocation(Location center, int minDistance, int maxDistance) {
            World world = center.getWorld();
            int x = center.getBlockX();
            int z = center.getBlockZ();
            // int y = center.getBlockY();

            for (int i = 0; i < 10; i++) { // Try 10 times to find a safe location
                x += (int) ((random.nextDouble() * (maxDistance - minDistance) + minDistance) * (random.nextBoolean() ? -1 : 1));
                z += (int) ((random.nextDouble() * (maxDistance - minDistance) + minDistance) * (random.nextBoolean() ? -1 : 1));

                // Limit the x and z coordinates to prevent going outside the world bounds
                x = Math.max(-30000000, Math.min(30000000, x));
                z = Math.max(-30000000, Math.min(30000000, z));

                // Ensure the Y-coordinate is within the specified range for Nether
                int minY = 50; // Minimum Y-coordinate for Nether spawns
                int maxY = 100; // Maximum Y-coordinate for Nether spawns
                int newY = random.nextInt(maxY - minY) + minY;

                Location location = new Location(world, x + 0.5, newY + 0.5, z + 0.5);
                Location bottomBlockLocation = location.clone().subtract(0, 1, 0);

                if (bottomBlockLocation.getBlock().isPassable()) {
                    // Check if the block below the location is passable
                    return location;
                }
            }
            return null;
        }

        private Location teleportToGround(Location location) {
            World world = location.getWorld();
            int x = location.getBlockX();
            int y = location.getBlockY();
            int z = location.getBlockZ();

            // Find the nearest solid block vertically from the given location
            while (y >= 0) {
                assert world != null;
                if (!!world.getBlockAt(x, y, z).getType().isSolid()) break;
                y--;
            }
            // Ensure the Y-coordinate is within valid bounds
            if (y < 0) {
                y = 0; // Set Y to 0 if no solid block was found above
            } else if (y > 255) {
                y = 255; // Set Y to 255 if no solid block was found below
            }

            // Teleport the entity to the nearest block on the ground
            return new Location(world, x + 0.5, y + 1.0, z + 0.5);
        }
    }
}
