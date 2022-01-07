/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class BlackjackHookers extends JavaPlugin {
    
    GameManager gm = new GameManager();
    
    
    @Override
    public void onEnable(){
        BlackjackDeck.initDeck();
    }
    
    @Override
    public void onDisable(){
        
    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
        
        
        if(sender instanceof Player && cmd.getName().equalsIgnoreCase("bj")){
            
            gm.blackjackCmd((Player)sender);
 
        }
        
        
        return true;
    }
}
