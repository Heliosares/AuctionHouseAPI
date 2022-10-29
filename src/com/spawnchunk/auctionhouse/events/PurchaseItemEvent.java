package com.spawnchunk.auctionhouse.events;

import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PurchaseItemEvent extends Event implements Cancellable {

	public String getWorld() {
		return null;
	}

	public OfflinePlayer getSeller() {
		return null;
	}

	public OfflinePlayer getBuyer() {
		return null;
	}

	public String getSeller_UUID() {
		return null;
	}

	public String getBuyer_UUID() {
		return null;
	}

	public float getPrice() {
		return 0;
	}

	public void setPrice(float price) {
	}

	public ItemStack getItem() {
		return null;
	}

	public void setItem(ItemStack item) {
	}

	public HandlerList getHandlers() {
		return null;
	}

	public static HandlerList getHandlerList() {
		return null;
	}

	public boolean isCancelled() {
		return false;
	}

	public void setCancelled(boolean cancelled) {
	}
}
