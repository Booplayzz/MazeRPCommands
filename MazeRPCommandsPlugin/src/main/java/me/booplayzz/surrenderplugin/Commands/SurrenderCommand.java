package me.booplayzz.surrenderplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SurrenderCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("surrender")){

            Player p = (Player) sender;

            p.setHealth(0.0);
            p.sendMessage("§6[§aMazeRP§a§6]: You have surrendered to the maze");
        }


        return true;
    }
}
