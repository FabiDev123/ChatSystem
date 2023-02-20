package de.fabidev.chatplugin;

import de.fabidev.chatplugin.listeners.chatlistener;
import de.fabidev.chatplugin.listeners.joinmanager;
import org.bukkit.plugin.java.JavaPlugin;

public class MAIN extends JavaPlugin {


    @Override
    public void onEnable(){
        registerCommands();
        registerListeners();


        System.out.println("Das Plugin " + this.getName() + " wurde erfolgreich gestartet!");
    }

    @Override
    public void onDisable(){
        System.out.println("Das Plugin " + this.getName() + " wurde erfolgreich beendet!");
    }


    private void registerCommands(){
        //this.getCommand("test").setExecutor(new CommandClass());
    }

    private void registerListeners(){
        //getServer().getPluginManager().registerEvents(new Listener(), this);
        getServer().getPluginManager().registerEvents(new chatlistener(), this);
        getServer().getPluginManager().registerEvents(new joinmanager(), this);
    }


}
