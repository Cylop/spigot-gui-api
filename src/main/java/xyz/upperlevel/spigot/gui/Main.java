package xyz.upperlevel.spigot.gui;

import lombok.Getter;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

//TODO re-implement the slot checking
//TODO Should I join the Hotbar and Gui HashMaps?
public class Main extends JavaPlugin implements Listener {
    @Getter
    private static Main instance;

    public Main() {
        if(instance == null)
            instance = this;
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GuiEventListener(), this);
    }
}
