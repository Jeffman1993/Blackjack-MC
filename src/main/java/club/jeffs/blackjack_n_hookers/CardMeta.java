/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package club.jeffs.blackjack_n_hookers;


class CardMeta {

    public enum Suit{
        Hearts("\u2665"),
        Diamonds("\u2666"),
        Clubs("\u2663"),
        Spades("\u2660");
        
        public final String symbol;
        
        private Suit(String symbol){
            this.symbol = symbol;
        }
    }
    
    public enum CardType{
        Number(""),
        Jack("J"),
        King("K"),
        Queen("Q"),
        Ace("A");
        
        public final String symbol;
        
        private CardType(String symbol){
            this.symbol = symbol;
        }
    }
    
}
