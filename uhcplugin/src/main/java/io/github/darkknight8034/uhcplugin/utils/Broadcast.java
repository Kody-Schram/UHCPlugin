package io.github.darkknight8034.uhcplugin.utils;

import org.bukkit.entity.Player;
import io.github.darkknight8034.uhcplugin.Main;

// Util class for broadcasting messages, commonly used chat related code
public class Broadcast
{
    
    private Main plugin;

    public Broadcast(Main plugin)
    {

        this.plugin = plugin;

    }

    // Sends to all players
    public void send(String msg)
    {

        for (Player p : this.plugin.getServer().getOnlinePlayers())
        {

            p.sendMessage(msg);

        }

    }

    public void title(String title, String subtitle, int fadein, int seconds, int fadout)
    {

        for (Player p : this.plugin.getServer().getOnlinePlayers())
        {

            p.sendTitle(title, subtitle, fadein, (int) seconds * 20, fadout);

        }

    }

    public void command(String command)
    {

        this.plugin.getServer().dispatchCommand(this.plugin.getServer().getConsoleSender(), command);

    }

}
