package me.Liebs.AmongUs.Commands;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.inventivetalent.nicknamer.api.event.disguise.NickDisguiseEvent;

import me.Liebs.AmongUs.Main;
import net.md_5.bungee.api.ChatColor;

public class AmongUsCommands implements CommandExecutor, Listener{
	private Main plugin;
	public static Player ImposterPlayer;
	public static ItemStack Sword = new ItemStack(Material.DIAMOND_SWORD);
	public static ItemStack Compass = new ItemStack(Material.COMPASS);
	public AmongUsCommands(Main plugin)
	{
		this.plugin = plugin;
		
		//this lines string is the command
		plugin.getCommand("amongus").setExecutor(this);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender; //creates player
		Location loc = p.getLocation(); //gets location of player
		World w = p.getWorld();
		Imposter();
		
		return false;
	}

	static ArrayList<Player> people = new ArrayList<Player>(Bukkit.getServer().getOnlinePlayers().size());
	public static void Imposter(){
        people.addAll(Bukkit.getOnlinePlayers());
       
        int random = new Random().nextInt(people.size());
       
        Player Imposter = (Player) Bukkit.getServer().getOnlinePlayers().toArray()[random];
        ImposterPlayer = Imposter;
        ItemMeta meta = Sword.getItemMeta();
        meta.setDisplayName("Imposter Sword");
        Sword.setItemMeta(meta);
        Imposter.getInventory().addItem(Sword);
        Imposter.sendMessage(ChatColor.RED+"You are the imposter");
        for(Player p:people)
        {
        	p.getInventory().addItem(Compass);
        	if(p!=Imposter)
        		p.sendMessage(ChatColor.LIGHT_PURPLE+"You are not the imposter");
        }

	}
	public static Player getImposter()
	{
		return ImposterPlayer;
	}
	
}

