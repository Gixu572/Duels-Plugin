package me.gixu.duelsplugin.commands;

import me.gixu.duelsplugin.manager.Game;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Accept implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (command.getName().equalsIgnoreCase("accept")){
            Game game=new Game((Player) commandSender, Bukkit.getPlayer(strings[0]));
            Game.startGame();
        }

        return false;
    }
}
