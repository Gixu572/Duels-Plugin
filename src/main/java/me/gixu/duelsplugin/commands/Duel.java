package me.gixu.duelsplugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Duel implements CommandExecutor {
    private static Player sender;
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        sender = (Player) commandSender;
        if (args.length == 0) {
            commandSender.sendMessage("Please specify a player to duel!");
            return true;
        }
        else {

            Player player = (Player) commandSender;
            Player target = Bukkit.getPlayer(args[0]);
            if (command.getName().equalsIgnoreCase("duel")){
                if (target.isOnline()){
                    player.sendMessage("You have challenged " + target.getName() + " to a duel!");
                    target.sendMessage(player.getName() + " has challenged you to a duel!");
                }
                else {
                    player.sendMessage("That player is not online!");
                }
            }
        }
        return false;
    }

    public static Player getSender(){
        return sender;
    }
}
