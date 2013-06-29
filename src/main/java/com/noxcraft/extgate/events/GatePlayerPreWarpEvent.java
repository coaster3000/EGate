package com.noxcraft.extgate.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import com.noxcraft.extgate.IGate;

public class GatePlayerPreWarpEvent extends GateEvent {
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	private IGate from, to;
	protected Player player;
	
	private boolean usePermissions = false;
	
	public GatePlayerPreWarpEvent(Player player, IGate from, IGate to)
	{
		this.player = player;
		this.from = from;
		this.to = to;
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
	
	public Player getPlayer() { return player; }

	/**
	 * @return the to
	 */
	public IGate getTo() {
		return to;
	}

	/**
	 * @return the usePermissions
	 */
	public boolean isUsePermissions() {
		return usePermissions;
	}

	public void setUsePermissions(boolean use) { usePermissions = use; }
	
}
