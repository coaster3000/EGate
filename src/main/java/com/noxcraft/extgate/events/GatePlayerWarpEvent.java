package com.noxcraft.extgate.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.noxcraft.extgate.IGate;

public class GatePlayerWarpEvent extends GateWarpEvent implements Cancellable {
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	public GatePlayerWarpEvent(Player player, IGate from, IGate to) {
		super(player, from, to);
	}
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public Player getPlayer(){
		return (Player) entity;
	}
}
