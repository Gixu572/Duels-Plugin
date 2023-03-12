package me.gixu.duelsplugin;

import me.gixu.duelsplugin.commands.Accept;
import me.gixu.duelsplugin.commands.Duel;
import me.gixu.duelsplugin.listeners.Listeners;
import me.gixu.duelsplugin.manager.Game;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class Duels_Plugin extends JavaPlugin {

    public static Duels_Plugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin= this;
        getServer().getPluginCommand("duel").setExecutor(new Duel());
        getServer().getPluginCommand("accept").setExecutor(new Accept());
        getServer().getPluginManager().registerEvents(new Listeners(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
