/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;

import club.jeffs.blackjack_n_hookers.CardMeta.CardType;
import club.jeffs.blackjack_n_hookers.CardMeta.Suit;



public class PlayingCard {

    private CardType type;
    private Suit suit;
    private int value;
    private String displayText;
    
    
    
    public PlayingCard(CardType type, Suit suit, int value){
        
        this.type = type;
        this.suit = suit;
        this.value = value;
        
        setDisplayText();
        
    }
    
    private void setDisplayText(){
        
        if(type == CardType.Number)
            displayText = suit.symbol + "" + value;
        else
            displayText = suit.symbol + "" + type.symbol;
    }
    
    
    
    
    public CardType getType(){
        return this.type;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public String getDisplayText(){
        return this.displayText;
    }
}
