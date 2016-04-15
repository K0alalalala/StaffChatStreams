package me.K0alaCraft.SCS;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class main extends JavaPlugin {

	
	Logger myPluginLogger = Bukkit.getLogger();
	@Override
	public void onEnable(){
		
	myPluginLogger.info("StaffChat Plugin by K0alaCraft");
	this.saveDefaultConfig();
	
	org.bukkit.plugin.PluginManager pm = Bukkit.getPluginManager();
	pm.registerEvents((Listener) this, this);

	}

	
		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
			Player p = (Player) sender;
			if(label.equalsIgnoreCase("s") || label.equalsIgnoreCase("sc") || label.equalsIgnoreCase("staffchat")){
				if(sender instanceof Player){
					
						
						
					}
					if(p.hasPermission("staffchat.mainchatsend")){
						
						if(args.length == 0){
							p.sendMessage(ChatColor.DARK_RED + "Invaild usage! Put the message you want to send after using the command.");
							
						}

						 if(args.length >= 1) {
							StringBuilder str = new StringBuilder();
							for(int i = 0; i < args.length; i++){
								str.append(args[i] + " ");

									}
							
									for(Player staff : Bukkit.getOnlinePlayers()){
										
										if(staff.hasPermission("staffchat.mainchatsee")){
											
											String prefixS = this.getConfig().getString("staffchat.prefix");
											prefixS = ChatColor.translateAlternateColorCodes('&', prefixS);
											String chatColorS = this.getConfig().getString("staffchat.chat-color");
											chatColorS = ChatColor.translateAlternateColorCodes('&', chatColorS);
											String playerColorS = this.getConfig().getString("staffchat.player-name-color");
											playerColorS = ChatColor.translateAlternateColorCodes('&', playerColorS);
											
											staff.sendMessage(prefixS + " " + playerColorS + p.getName() + ": " + chatColorS + str.toString().trim()); 
											
								}
										}
								
							
						}
							
							
						
					
					}
					
					
						
						
						
				
				}
				
			
			if(label.equalsIgnoreCase("mc") || label.equalsIgnoreCase("modchat")){
				if(sender instanceof Player){
					
						
						
					}
					if(p.hasPermission("staffchat.modchatsend")){
					
						if(args.length == 0){
							p.sendMessage(ChatColor.DARK_RED + "Invaild usage! Put the message you want to send after using the command.");
							
						}

						 if(args.length >= 1) {
							StringBuilder str = new StringBuilder();
							for(int i = 0; i < args.length; i++){
								str.append(args[i] + " ");
								
										
								
									
									
										
									}
							
									for(Player moderators : Bukkit.getOnlinePlayers()){
										if(moderators.hasPermission("staffchat.modchatsee")){
										String prefixM = this.getConfig().getString("modchat.prefix");
										prefixM = ChatColor.translateAlternateColorCodes('&', prefixM);
										String chatColorM = this.getConfig().getString("modchat.chat-color");
										chatColorM = ChatColor.translateAlternateColorCodes('&', chatColorM);
										String playerColorM = this.getConfig().getString("modchat.player-name-color");
										playerColorM = ChatColor.translateAlternateColorCodes('&', playerColorM);
										
										moderators.sendMessage(prefixM + " " + playerColorM + p.getName() + ": " + chatColorM + str.toString().trim()); 
								}
									}
										}
								
							
						
						
					}
					}
				
			
			if(label.equalsIgnoreCase("ac") || label.equalsIgnoreCase("adminchat")){
				if(sender instanceof Player){

					}
					if(p.hasPermission("staffchat.adminchatsend")){
					
						if(args.length == 0){
							p.sendMessage(ChatColor.DARK_RED + "Invaild usage! Put the message you want to send after using the command.");
							
						}
						
						 if(args.length >= 1) {
							StringBuilder str = new StringBuilder();
							for(int i = 0; i < args.length; i++){
								str.append(args[i] + " ");
								
										
								
									
									
										
									}
							
									for(Player admin : Bukkit.getOnlinePlayers()){
										if(admin.hasPermission("staffchat.adminchatsee")){
										String prefixA = this.getConfig().getString("adminchat.prefix");
										prefixA = ChatColor.translateAlternateColorCodes('&', prefixA);
										String chatColorA = this.getConfig().getString("adminchat.chat-color");
										chatColorA = ChatColor.translateAlternateColorCodes('&', chatColorA);
										String playerColorA= this.getConfig().getString("adminchat.player-name-color");
										playerColorA = ChatColor.translateAlternateColorCodes('&', playerColorA);
										
										admin.sendMessage(prefixA + " " + playerColorA + p.getName() + ": " + chatColorA + str.toString().trim()); 
								}
									}
										}
								
							
						}
							
						
					}
					
				
			return false;
}
		
}
