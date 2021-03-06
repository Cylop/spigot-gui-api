package xyz.upperlevel.spigot.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import xyz.upperlevel.spigot.gui.link.Link;

public interface Gui extends Link {
    /**
     * Called when a player clicks on the inventory
     * The event is cancelled before the call so if someone for some reason wants to re-enable it (idk why) he/she could
     * @param event the click event
     */
    void onClick(InventoryClickEvent event);

    /**
     * Prints the Gui to the player that views it
     * @param player the player that is viewing it
     */
    void print(Player player);

    /**
     * Called when a player opens this Gui
     * @param player the player that is opening the Gui
     */
    void onOpen(Player player);

    /**
     * Called when a player closes this Gui (either by force or normally)
     * @param player the player that closed the door
     */
    void onClose(Player player);


    /**
     * The action that this does when called as an action (from links)
     * @param player the player that executes this link
     */
    @Override
    default void run(Player player) {
        GuiManager.open(player, this);
    }
}
