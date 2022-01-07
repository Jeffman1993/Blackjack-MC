/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.bukkit.entity.Player;


class GameManager {

    private Map<UUID,Game> games = new HashMap();
    
    
    
    public GameManager(){
        
        
    }
    
    public void blackjackCmd(Player player){
        
        if(!games.containsKey(player.getUniqueId()))
            addGame(player);
        else
            removeGame(player);
    }
    
    private void addGame(Player player){
        games.put(player.getUniqueId(), new BlackjackGame(player));
        games.get(player.getUniqueId()).startGame();
    }
    
    private void removeGame(Player player){
        
        UUID playerUUID = player.getUniqueId();

        games.get(playerUUID).endGame();
        games.remove(playerUUID);
        
    }
}
