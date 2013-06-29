package com.noxcraft.extgate.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GateEvent extends Event {
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	public HandlerList getHandlers() {
		return handlers;
	}
}
