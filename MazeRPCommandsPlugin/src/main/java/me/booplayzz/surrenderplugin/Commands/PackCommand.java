package me.booplayzz.surrenderplugin.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PackCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("pack")){

            Player p = (Player) sender;

            p.sendMessage("§6[§aMazeRP§a§6]:&f https://mazerp.schoolrp-cdn.net/resourcepack.zip");
        }


        return true;
    }
}
