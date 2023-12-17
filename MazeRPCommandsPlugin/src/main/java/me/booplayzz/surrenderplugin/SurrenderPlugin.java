package me.booplayzz.surrenderplugin;

import me.booplayzz.surrenderplugin.Commands.PackCommand;
import me.booplayzz.surrenderplugin.Commands.SurrenderCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class SurrenderPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginCommand("surrender").setExecutor(new SurrenderCommand());
        Bukkit.getPluginCommand("surrender").setExecutor(new PackCommand());

    }

}
