package com.noxcraft.extgate.events;

import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.noxcraft.extgate.IGate;

public class GateOpenEvent extends GateEvent implements Cancellable {
	public static enum OpenCause {
		Entity,Plugin,Unknown;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	private final OpenCause cause;
	private Entity entity = null;
	private boolean isCancelled = false;
	private IGate source;
	
	private IGate target;
	public GateOpenEvent(Entity opener, IGate source, IGate target)
	{
		cause = OpenCause.Entity;
		this.source = source;
		this.target = target;
		this.entity = opener;
	}

	/**
	 * @return the cause
	 */
	public OpenCause getCause() {
		return cause;
	}

	/**
	 * @return the entity
	 */
	public Entity getEntity() {
		return entity;
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
	
	public boolean isCancelled() {
		return isCancelled;
	}
	
	public void setCancelled(boolean cancel) {
		isCancelled = cancel;
	}
}
