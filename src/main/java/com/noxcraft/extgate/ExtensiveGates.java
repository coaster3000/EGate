package com.noxcraft.extgate;

import org.bukkit.plugin.java.JavaPlugin;

public class ExtensiveGates extends JavaPlugin {
	
	@Override
	public void onLoad() {
		EGLogger.load(this);
	}
	
	@Override
	public void onEnable() {
		VaultAdapter.load();
	}
	
	@Override
	public void onDisable() {
		EGLogger.unload(); //Prevent Possible memory leaks from bukkit.
	}
}
