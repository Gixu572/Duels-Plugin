package me.gixu.duelsplugin.manager;

import me.gixu.duelsplugin.Duels_Plugin;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashSet;
import java.util.Set;

public class Game {
    private static Set<Player> playerManagers = new HashSet<>(2);
    private static Game game;
    public static boolean isStarted = false;

    public static void addPlayer(Player player) {
        playerManagers.add(player);
    }

    public Game(Player player1, Player player2) {
        playerManagers.add(player1);
        playerManagers.add(player2);
    }
    public Game(){
        startGame();
    }
    public static Game getGame(){
        return game;
    }

    public static void startGame(){
        for (Player player : playerManagers){
            Inventory.giveKits(player);
        }

    }

    public static void endGame(){
        playerManagers.clear();
        isStarted = false;
    }
    public static void setWinner(Player player,Player player2){
        player.sendMessage("You have won the game!");
        player2.sendMessage("You have lost the game!");
    }
}
