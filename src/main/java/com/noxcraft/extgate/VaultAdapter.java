package com.noxcraft.extgate;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.RegisteredServiceProvider;

public class VaultAdapter {
	public static Permission permission = null;
    public static Economy economy = null;
    public static Chat chat = null;

    public static final int PERM = 1;
    public static final int ECO = 2;
    public static final int CHAT = 4;
    
    static void load()
    {
    	load(0);
    }
    
    static void load(int reqs)
    {
    	if (!setupPermissions() && isPerm(reqs))
    		EGLogger.severe("This plugin requires a permission system from vault to run. Plugin may not function properly without one.");
    	if (!setupEconomy() && isEco(reqs))
    		EGLogger.severe("This plugin requires an economy plugin to run. Plugin may not function properly without one.");
    	if (!setupChat() && isChat(reqs))
    		EGLogger.severe("This plugin requires a chat interface from vault. Plugin may not function properly without one.");
    }
    
    static void unload()
    {
    	permission = null;
    	economy = null;
    	chat = null;
    }
    
    private static boolean setupPermissions()
    {
        RegisteredServiceProvider<Permission> permissionProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.permission.Permission.class);
        if (permissionProvider != null) {
            permission = permissionProvider.getProvider();
        }
        return (permission != null);
    }

    private static boolean setupChat()
    {
        RegisteredServiceProvider<Chat> chatProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.chat.Chat.class);
        if (chatProvider != null) {
            chat = chatProvider.getProvider();
        }

        return (chat != null);
    }
    

	private static boolean setupEconomy()
    {
        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
        if (economyProvider != null) {
            economy = economyProvider.getProvider();
        }

        return (economy != null);
    }
	/////// Helpers
    private static boolean isPerm(int num)
    {
    	return ((num & PERM) == PERM);
    }
    
    private static boolean isEco(int num)
    {
    	return ((num & ECO) == ECO);
    }

    private static boolean isChat(int num)
    {
    	return ((num & CHAT) == CHAT);
    }
    
	private static Server getServer() {
		return Bukkit.getServer();
	}
}
