package de.fabidev.chatplugin.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class chatlistener implements Listener {

    @EventHandler (priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent event){
        event.setCancelled(true);
        String text = event.getMessage();
        Player p = event.getPlayer();
        String name = p.getPlayerListName();

        if (!name.startsWith("§")){
            if (p.hasPermission("chatprefix.owner")){
                name = "§4§lOwner §7|§4§l " + p.getName();
            }else if (p.hasPermission("chatprefix.admin")){
                name = "§4§lAdmin §7|§4§l " + p.getName();
            }else if (p.hasPermission("chatprefix.dev")){
                name = "§b§lDeveloper §7|§b§l " + p.getName();
            }else if (p.hasPermission("chatprefix.mod")){
                name = "§aModerator §7|§a " + p.getName();
            }else if (p.hasPermission("chatprefix.content")){
                name = "§aContent §7|§a " + p.getName();
            }else if (p.hasPermission("chatprefix.sup")){
                name = "§aSupporter §7|§a " + p.getName();
            }else if (p.hasPermission("chatprefix.streamer")){
                name = "§5Streamer §7|§5 " + p.getName();
            }else if (p.hasPermission("chatprefix.youtuber")){
                name = "§5YouTuber §7|§5 " + p.getName();
            }else if (p.hasPermission("chatprefix.empress")){
                name = "§2§lEmpress §7|§2§l " + p.getName();
            }else if (p.hasPermission("chatprefix.emperor")){
                name = "§2§lEmperor §7|§2§l " + p.getName();
            }else if (p.hasPermission("chatprefix.queen")){
                name = "§e§lQueen §7|§e§l " + p.getName();
            }else if (p.hasPermission("chatprefix.king")){
                name = "§e§lKing §7|§e§l " + p.getName();
            }else if (p.hasPermission("chatprefix.senator")){
                name = "§c§lSenator §7|§c§l " + p.getName();
            }else if (p.hasPermission("chatprefix.duke")){
                name = "§9Duke §7|§9 " + p.getName();
            }else if (p.hasPermission("chatprefix.knight")){
                name = "§7Knight §7|§7 " + p.getName();
            }else if (p.hasPermission("chatprefix.squire")){
                name = "§6Squire §7|§6 " + p.getName();
            }else if (p.hasPermission("chatprefix.dulli")){
                name = "§5§lDulli §7|§5§l " + p.getName();
            }else {
                name = "§8Farmer §7|§8 " + p.getName();
            }
        }



        if (p.hasPermission("chat.color")){
            text = text.replace("&1", "§1");
            text = text.replace("&2", "§2");
            text = text.replace("&3", "§3");
            text = text.replace("&4", "§4");
            text = text.replace("&5", "§5");
            text = text.replace("&6", "§6");
            text = text.replace("&7", "§7");
            text = text.replace("&8", "§8");
            text = text.replace("&9", "§9");
            text = text.replace("&0", "§0");
            text = text.replace("&a", "§a");
            text = text.replace("&b", "§b");
            text = text.replace("&c", "§c");
            text = text.replace("&d", "§d");
            text = text.replace("&e", "§e");
            text = text.replace("&f", "§f");
        }

        if (p.hasPermission("chat.sonder")){
            text = text.replace("&k", "§k");
            text = text.replace("&l", "§l");
            text = text.replace("&m", "§m");
            text = text.replace("&n", "§n");
            text = text.replace("&o", "§o");
            text = text.replace("&r", "§r");
        }






        if (p.hasPermission("chat.team")){
            for (Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage("§7>>");
                player.sendMessage("§7>>");
                player.sendMessage(name + "§7: §a§l" + text);
                player.sendMessage("§7>>");
                player.sendMessage("§7>>");
            }
        }else if(p.hasPermission("chatprefix.king") ||
                p.hasPermission("chatprefix.queen") ||
                p.hasPermission("chatprefix.emperor") ||
                p.hasPermission("chatprefix.empress") ||
                p.hasPermission("chatprefix.youtuber") ||
                p.hasPermission("chatprefix.streamer")){


            for (Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage(name + "§7: §b§l" + text);
            }



        }else{
            for (Player player : Bukkit.getOnlinePlayers()){
                player.sendMessage(name + "§7: " + text);
            }
        }


    }




}
