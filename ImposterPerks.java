package me.Liebs.ImposterPerks.Commands;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Liebs.AmongUs.Commands.AmongUsCommands;
import net.md_5.bungee.api.ChatColor;

public class ImposterPerks implements Listener{
	Player ImposterPlayer=AmongUsCommands.getImposter();
	private HashMap<UUID, Long> cooldown = new HashMap<UUID,Long>();
	@EventHandler
	public void onPlayerClicks(PlayerInteractEvent event) {
	    Player player = event.getPlayer();
	    Action action = event.getAction();
	    ItemStack item = event.getItem();
	   
	     if ( (action.equals( Action.RIGHT_CLICK_AIR ) || action.equals( Action.RIGHT_CLICK_BLOCK ) )) {
	         if ( item != null && item.getType() == Material.DIAMOND_SWORD && item.hasItemMeta() ) {
	        	 if(cooldown.containsKey(player.getUniqueId())&&cooldown.get(player.getUniqueId())>System.currentTimeMillis())
	        	 {
	        		 event.setCancelled(true);
	        		 long remianingTime = cooldown.get(player.getUniqueId())-System.currentTimeMillis();
	        		 player.sendMessage(ChatColor.RED+"You can not use kill mode for another "+remianingTime/1000+" seconds!");
	        	 }
	        	 else
	        	 {
	        		 cooldown.put(player.getUniqueId(), System.currentTimeMillis()+(900*1000));
	        		 player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 0));
		             player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 200, 0));
		        
	        	 }
	             
	         }

	     }

	}
}
