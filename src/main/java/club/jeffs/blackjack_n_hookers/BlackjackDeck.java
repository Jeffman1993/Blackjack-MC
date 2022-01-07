/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;

import club.jeffs.blackjack_n_hookers.CardMeta.CardType;
import club.jeffs.blackjack_n_hookers.CardMeta.Suit;
import java.util.ArrayList;
import java.util.Collections;


public class BlackjackDeck {

    private static ArrayList<PlayingCard> masterDeck = new ArrayList();
    
    
    
    //Initialize the master deck.
    public static void initDeck(){
        
        //Generate number cards.
        for(int value = 2; value <= 10; value++){
            for(int suit = 0; suit < 4; suit++){
                
                PlayingCard card = new PlayingCard(CardType.Number, Suit.values()[suit], value);
                
                masterDeck.add(card);
            }
        }
        
        //Generate face and ace cards.
        for(int type = 1; type <= 4; type++){
            for(int suit = 0; suit < 4; suit++){
                
                CardType cardType = CardType.values()[type];
                
                int value = 10;
                
                
                if(cardType == CardType.Ace)
                    value = 11;
                    
                
                PlayingCard card = new PlayingCard(cardType, Suit.values()[suit], value);
                
                masterDeck.add(card);
            }
        }
        
    }
    
    public static void shuffleDeck(ArrayList<PlayingCard> deck){
        Collections.shuffle(deck);
    }
    
    public static ArrayList<PlayingCard> getDeck(int deckStacks){
        
        ArrayList<PlayingCard> deck = new ArrayList<>(masterDeck);
        
        for(int i = 1; i < deckStacks; i++){
            
            deck.addAll(masterDeck);
        }
        
        
        return deck;
    }
    
}
