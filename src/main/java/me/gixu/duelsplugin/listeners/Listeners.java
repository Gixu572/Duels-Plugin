package me.gixu.duelsplugin.listeners;

import me.gixu.duelsplugin.manager.Game;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listeners implements Listener {
    public void onPlayerJoin(PlayerJoinEvent e){
        org.bukkit.entity.Player player = e.getPlayer();
        Game.addPlayer(player);
    }
    public void onPlayerDeath(PlayerDeathEvent event){
        Game.setWinner(event.getEntity().getKiller(),event.getEntity());
    }

}
