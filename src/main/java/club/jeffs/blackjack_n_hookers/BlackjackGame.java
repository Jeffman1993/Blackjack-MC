/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;

import java.util.ArrayList;
import org.bukkit.entity.Player;


public class BlackjackGame implements Game {

    private Player player = null;
    private ArrayList<PlayingCard> shoeDeck = null;
    private ArrayList<PlayingCard> discardedDeck = null;
    
    
    public BlackjackGame(Player player){
        
        this.player = player;
        this.shoeDeck = BlackjackDeck.getDeck(2);
        
    }
    
    @Override
    public GameType getType(){
        return GameType.Blackjack;
    }
    
    @Override
    public void startGame() {
        
        player.sendMessage("Welcome to the game.");

        BlackjackDeck.shuffleDeck(shoeDeck);
        
        shoeDeck.forEach(card -> {
            player.sendMessage(card.getDisplayText() + " " + card.getValue() + " " + card.getType());
        });

        player.sendMessage("" + shoeDeck.size());
    }

    @Override
    public void endGame() {
        
        player.sendMessage("Your game has ended.");
    }

}
