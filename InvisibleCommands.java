package me.Liebs.Invisible.Commands;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Hoglin;
import org.bukkit.entity.Husk;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Player;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.ZombieVillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Liebs.Invisible.Main;

	public class InvisibleCommands implements Listener{

		@EventHandler
		public void creatureSpawn(CreatureSpawnEvent event)
		{
			if(event.getEntityType()==EntityType.CREEPER)
			{
				Creeper creeper = (Creeper)  event.getEntity();
				creeper.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.SKELETON)
			{
				Skeleton skeleton = (Skeleton)  event.getEntity();
				skeleton.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.ZOMBIE)
			{
				Zombie zombie = (Zombie)  event.getEntity();
				zombie.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.BLAZE)
			{
				Blaze blaze = (Blaze)  event.getEntity();
				blaze.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.ZOMBIE_VILLAGER)
			{
				ZombieVillager zombievillager = (ZombieVillager)  event.getEntity();
				zombievillager.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.WITHER_SKELETON)
			{
				WitherSkeleton witherskelly = (WitherSkeleton)  event.getEntity();
				witherskelly.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.SPIDER)
			{
				Spider spider = (Spider)  event.getEntity();
				spider.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.CAVE_SPIDER)
			{
				CaveSpider cavespider = (CaveSpider)  event.getEntity();
				cavespider.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.DROWNED)
			{
				Drowned drowned = (Drowned)  event.getEntity();
				drowned.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.HOGLIN)
			{
				Hoglin hoglin = (Hoglin)  event.getEntity();
				hoglin.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.MAGMA_CUBE)
			{
				MagmaCube magma = (MagmaCube)  event.getEntity();
				magma.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.WITCH)
			{
				Witch witch = (Witch)  event.getEntity();
				witch.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.HUSK)
			{
				Husk husk = (Husk)  event.getEntity();
				husk.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.ENDERMAN)
			{
				Enderman enderman = (Enderman)  event.getEntity();
				enderman.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.ENDER_DRAGON)
			{
				EnderDragon enderdragon = (EnderDragon)  event.getEntity();
				enderdragon.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.SILVERFISH)
			{
				Silverfish silverfish = (Silverfish)  event.getEntity();
				silverfish.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.STRAY)
			{
				Stray stray = (Stray)  event.getEntity();
				stray.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.GHAST)
			{
				Ghast ghast = (Ghast)  event.getEntity();
				ghast.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			if(event.getEntityType()==EntityType.PHANTOM)
			{
				Phantom phantom = (Phantom)  event.getEntity();
				phantom.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 20000, 1));
			}
			
				
			
		}
		 @EventHandler
		    public void onCreeperExplode(EntityExplodeEvent event) {
		        if (event.getEntityType() == EntityType.CREEPER) {
		            Creeper creeper = (Creeper) event.getEntity();
		            creeper.getActivePotionEffects().forEach(x -> creeper.removePotionEffect(x.getType()));
		        }
		    }

}