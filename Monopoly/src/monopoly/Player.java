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
public class Player {
    private int playerNumber;
    private String token;
    private int playerBank;
    private int playerPosition;
    private int[] properties;
    
    
    public void Player(int num, String tkn){
        playerNumber = num;
        token = tkn;
        playerBank = 1500;
        playerPosition = 0;
        for(int i = 0; i < 40; i++){
            properties[i] = 0;
        }
    }
    
    public int getPlayerNumber(){
        return playerNumber;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }
    
    public String getToken(){
        return token;
    }
    
    public int getPlayerBank(){
        return playerBank;
    }
    
    public int[] getProperties(){
        return properties;
    }
    
    public void buyProperty(int location){
        properties[location] = 1;
    }
    
    public void loseProperty(int location){
        properties[location] = 0;
    }
    
    public int debitPlayerBank(int amount){
        playerBank -= amount;
        return playerBank;
    }
    
    public int creditPlayerBank(int amount){
        playerBank += amount;
        return playerBank;
    }
    
    public int incrementPlayerPosition(int num){
        int temp = playerPosition;
        playerPosition += num;
        if(playerPosition < temp)
            creditPlayerBank(200);
        return playerPosition;           
    }
    
    public int setPlayerPosition(int location){
        playerPosition = location;
        return playerPosition;
    }
    
}
