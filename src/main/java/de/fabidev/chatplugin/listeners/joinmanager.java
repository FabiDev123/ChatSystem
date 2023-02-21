package de.fabidev.chatplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
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
        Location loc = Bukkit.getWorld("kingdomblockscity").getSpawnLocation();
        loc.add(0.5, 0, 0.5);
        e.getPlayer().teleport(loc);
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
        Location loc = Bukkit.getWorld("kingdomblockscity").getSpawnLocation();
        loc.add(0.5, 0, 0.5);
        e.getEntity().teleport(loc);
        e.setDeathMessage(null);
    }




}
