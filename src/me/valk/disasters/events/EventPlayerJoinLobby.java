package me.valk.disasters.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class EventPlayerJoinLobby extends Event {
	private Player p;
	private String lobbyName;
	
	public EventPlayerJoinLobby(Player p, String lobbyName) {
		this.p = p;
		this.lobbyName = lobbyName;
	}
	
	public Player getPlayer() {
		return p;
	}
	
	public String getLobbyName() {
		return lobbyName;
	}
	
	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
	    return handlers;
	}

	public static HandlerList getHandlerList() {
	    return handlers;
	}
}
