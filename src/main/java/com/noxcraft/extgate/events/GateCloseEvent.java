package com.noxcraft.extgate.events;

import org.bukkit.event.HandlerList;

import com.noxcraft.extgate.IGate;

public class GateCloseEvent extends GateEvent {
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	private IGate source;
	
	private IGate target;
	public GateCloseEvent(IGate source, IGate target)
	{
		this.source = source;
		this.target = target;
	}

	public HandlerList getHandlers() {
		return handlers;
	}

	/**
	 * @return the source gate
	 */
	public IGate getSource() {
		return source;
	}

	/**
	 * @return the target gate
	 */
	public IGate getTarget() {
		return target;
	}
	
	
}
