package de.fabidev.chatplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class joinmanager implements Listener {


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onJoin(PlayerJoinEvent e){
        e.getPlayer().teleport(Bukkit.getWorld("kingdomblockscity").getSpawnLocation());
        e.setJoinMessage(null);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onQuit(PlayerQuitEvent e){
        e.setQuitMessage(null);
    }


    @EventHandler(priority = EventPriority.HIGHEST)
    public void onKick(PlayerKickEvent e){
        e.setLeaveMessage(null);
    }

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onDeath(PlayerDeathEvent e){
        e.getEntity().teleport(Bukkit.getWorld("kingdomblockscity").getSpawnLocation());
        e.setDeathMessage(null);
    }




}
