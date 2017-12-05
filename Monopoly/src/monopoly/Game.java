/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

/**
 *
 * @author kylespomer
 */
public class Game {
    private int numPlayers;
    private int[] properties;
    
    public void Game(int players){
        numPlayers = players;
        for(int i = 0; i < 40; i++){
            properties[i] = 0;
        }
    }
    
    public void setProperties(int player, int location){
        properties[location] = player;
    }
    
    public int getOwner(int location){
        return properties[location];
    }
}
