package com.noxcraft.extgate.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.noxcraft.extgate.IGate;

public class GateWarpEvent extends GateEvent implements Cancellable {
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	protected Entity entity;
	private IGate from;
	private boolean isCancelled = false;
	private IGate to;
	public GateWarpEvent(Entity entity, IGate from, IGate to)
	{
		this.entity = entity;
		this.from = from;
		this.to = to;
	}

	/**
	 * @return the entity
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * @return the from
	 */
	public IGate getFrom() {
		return from;
	}

	public HandlerList getHandlers() {
		return handlers;
	}
	
	/**
	 * @return the to
	 */
	public IGate getTo() {
		return to;
	}
	
	public boolean isCancelled() {
		return isCancelled;
	}
	
	public void setCancelled(boolean cancel) {
		isCancelled = cancel;
	}
}
