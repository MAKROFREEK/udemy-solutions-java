import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.smaamc.hoard2.Hoard2;

import java.util.List;
import java.util.Random;

public class Commands extends Hoard2 {

    public void startHoard(CommandSender sender) {
        FileConfiguration config = Hoard2.getPlugin().getConfig();
        int spawnLimit = config.getInt("spawn_limit");
        int radius = config.getInt("max_distance");

        Player player = (Player) sender;
        String worldName = player.getWorld().getName();

        ConfigurationSection worldSection = config.getConfigurationSection("worlds." + worldName);
        if (worldSection != null) {
            List<String> mobs = worldSection.getStringList("mobs");
            if (!mobs.isEmpty()) {
                Random random = new Random();
                for (int i = 0; i < spawnLimit; i++) {
                    String mobType = mobs.get(random.nextInt(mobs.size()));
                    EntityType entityType = EntityType.valueOf(mobType);
                    spawnEnemyNearPlayer(player, radius, entityType);
                }
            } else {
                sender.sendMessage("No mobs specified for this world.");
            }
        } else {
            sender.sendMessage("No configuration found for this world.");
        }
    }

    private void spawnEnemyNearPlayer(Player player, int radius, EntityType entityType) {
        // Generate random X and Z offsets within the given radius
        double randomAngle = Math.random() * 2 * Math.PI;
        double randomDistance = Math.random() * radius;
        double offsetX = Math.cos(randomAngle) * randomDistance;
        double offsetZ = Math.sin(randomAngle) * randomDistance;

        // Calculate the spawn location relative to the player
        double spawnX = player.getLocation().getX() + offsetX;
        double spawnZ = player.getLocation().getZ() + offsetZ;

        // Spawn the enemy entity at the calculated location
        Entity enemy = player.getWorld().spawnEntity(player.getLocation().clone().setX(spawnX).setZ(spawnZ), entityType);

        // Teleport the enemy to the nearest block on the ground if it's in the air
        Location enemyLocation = enemy.getLocation();
        Entity entity = enemyLocation.getWorld().getNearbyEntities(enemyLocation, 0.1, 0.1, 0.1)
                .stream()
                .filter(e -> e.getType() == entityType && e.getLocation().distanceSquared(enemyLocation) < 0.1)
                .findFirst()
                .orElse(null);

        if (entity != null && entity.isValid()) {
            entity.teleport(teleportToGround(entity.getLocation()));
        }
    }

    private Location teleportToGround(Location location) {
        World world = location.getWorld();
        int x = location.getBlockX();
        int y = world.getHighestBlockYAt(location);
        int z = location.getBlockZ();
        return new Location(world, x, y, z);
    }

        private boolean reloadHoardConfig(CommandSender sender) {
            plugin.reloadConfig();
            getLogger().info("Hoard configuration reloaded.");
            sender.sendMessage("Hoard configuration reloaded.");
            return true;
        }

        private boolean stopHoard(CommandSender sender) {
            if (!isHoardRunning) {
                getLogger().info("Hoard is not running.");
                return true;
            }
            isHoardRunning = false;
            if (taskId != null) {
                taskId.cancel();
                taskId = null;
            }
            getLogger().info("Hoard spawning stopped.");
            return true;
        }

}