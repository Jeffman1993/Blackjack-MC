/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package club.jeffs.blackjack_n_hookers;

/**
 *
 * @author Jeffrey
 */
interface Game {
    
    public enum GameType{
        Blackjack
    }
    
    public GameType getType();
    public void startGame();
    public void endGame();
    
}
