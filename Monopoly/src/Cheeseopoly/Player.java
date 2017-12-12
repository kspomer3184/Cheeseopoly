/*
 * Player.java
 * handles information for individual players
 * keeps track of money, player number, token, position, and owned properties
 */
package Cheeseopoly;

/**
 *
 * @author kylespomer
 */
public class Player {

    private final int playerNumber;
    private final String token;
    private int playerBank;
    private int playerPosition;
    private final int[] properties = new int[40];
    int jailCount;

    public Player(int num, String tkn) {
        playerNumber = num;
        token = tkn;
        playerBank = 1500;
        playerPosition = 0;
        for (int i = 0; i < 40; i++) {
            properties[i] = 0;
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public String getToken() {

        return token;
    }

    public int getPlayerBank() {
        return playerBank;
    }

    public int[] getProperties() {
        return properties;
    }

    public void buyProperty(int location, int[] prices) {
        properties[location] = 1;
        debitPlayerBank(prices[location]);
    }

    public void loseProperty(int location) {
        properties[location] = 0;
    }

    public int debitPlayerBank(int amount) {
        playerBank -= amount;
        return playerBank;
    }

    public int creditPlayerBank(int amount) {
        playerBank += amount;
        return playerBank;
    }

    public int incrementPlayerPosition(int num) {
        int temp = playerPosition;
        temp += num;
        if (temp > 39) {
            creditPlayerBank(200);
            playerPosition = temp - 40;
        } else {
            playerPosition = temp;
        }
        return playerPosition;
    }

    public int setPlayerPosition(int location) {
        playerPosition = location;
        return playerPosition;
    }

    public boolean exists() {
        return true;
    }

    public void jail() {
        if (jailCount < 2) {
            jailCount++;

        } else {
            jailBreak();

        }
    }

    public boolean checkJail() {
        if (jailCount == 0) {
            return false;
        } else {
            return true;
        }
    }

    public void jailBreak() {
        jailCount = 0;
        debitPlayerBank(50);
    }
}
