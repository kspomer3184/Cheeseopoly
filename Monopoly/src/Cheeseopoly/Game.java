/*
 * Game.java
 * handles the generated player objects
 * manages properties, prices, current player
 */
package Cheeseopoly;

import java.util.ArrayList;

/**
 *
 * @author kylespomer
 */
public class Game {

    private int numPlayers = 0;
    private final int[] properties = new int[40];
    private final int[] propValues = new int[40];
    private final int[] propRent = new int[40];
    ArrayList<Player> players = new ArrayList<>();
    int currentPlayer;
    private final boolean isOver;

    public Game() {
        //numPlayers = players;
        for (int i = 0; i < 40; i++) {
            properties[i] = 0;
        } //go
        setPrices();
        setRents();
        isOver = false;
        currentPlayer = 0;
    }

    public void addPlayer(Player player) {
        players.add(player);
        numPlayers++;
    }

    public void removePlayer(int play) {
        players.remove(play);
        numPlayers--;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public Player getPlayer(int n) {
        return players.get(n);
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int getRent(int loc) {
        return propRent[loc];
    }

    public int getOwner(int location) {

        return properties[location];
    }

    public void setOwner(int location, int player) {
        properties[location] = player;
    }

    public int[] getPrices() {
        return propValues;
    }

    public void payRent(int player, int location) {
        players.get(player).debitPlayerBank(propRent[location]);
        players.get(properties[location]).creditPlayerBank(propRent[location]);
    }

    public Player nextPlayer() {
        if (currentPlayer == 0) {
            currentPlayer++;
        } else if (currentPlayer == 1 && numPlayers == 2) {
            currentPlayer = 0;
        } else if (currentPlayer == 1 && numPlayers >= 3) {
            currentPlayer++;
        } else if (currentPlayer == 2 && numPlayers == 3) {
            currentPlayer = 0;
        } else if (currentPlayer == 2 && numPlayers == 4) {
            currentPlayer++;
        } else if (currentPlayer == 3) {
            currentPlayer = 0;
        }

        return players.get(currentPlayer);
    }

    public int propEval() {
        if (properties[players.get(currentPlayer).getPlayerPosition()] == 0) {
            return 0; //zero for unowned property;
        } else if (properties[players.get(currentPlayer).getPlayerPosition()] == currentPlayer) {
            return 1; //one for self owned property;
        } else {
            return 2; //two for others' property;
        }
    }

    public void setProperties(int player, int location) {
        properties[location] = player;
    }

    public boolean checkEnd() {
        return isOver;
    }

    public void setRent(int loc, int value) {
        propRent[loc] = value;
    }

    public int rentEval(Player player, int roll) {
        int count = 0;
        int owner = getOwner(player.getPlayerPosition());

        if (player.getPlayerPosition() == 12 || player.getPlayerPosition() == 28) {
            if (owner == getOwner(12)) {
                count++;
            }
            if (owner == getOwner(28)) {
                count++;
            }
            if (count == 2) {
                setRent(player.getPlayerPosition(), roll * 10);
                return roll * 10;

            } else {
                setRent(player.getPlayerPosition(), roll * 4);
                return roll * 4;
            }

        } else if (player.getPlayerPosition() == 5 || player.getPlayerPosition() == 15 || player.getPlayerPosition() == 25
                || player.getPlayerPosition() == 35) {
            if (owner == getOwner(5)) {
                count++;
            }
            if (owner == getOwner(15)) {
                count++;
            }
            if (owner == getOwner(25)) {
                count++;
            }
            if (owner == getOwner(35)) {
                count++;
            }

            switch (count) {
                case 1:
                    setRent(player.getPlayerPosition(), 25);
                    return 25;
                case 2:
                    setRent(player.getPlayerPosition(), 50);
                    return 50;
                case 3:
                    setRent(player.getPlayerPosition(), 100);
                    return 100;
                case 4:
                    setRent(player.getPlayerPosition(), 200);
                    return 200;
                default:
                    setRent(player.getPlayerPosition(), 25);
                    return 25;
            }
        } else {
            return propRent[player.getPlayerPosition()];
        }
    }

    public void otherSpace() {
        switch (players.get(currentPlayer).getPlayerPosition()) {
            case 2:
                players.get(currentPlayer).debitPlayerBank(200);
                break;
            case 38:
                players.get(currentPlayer).debitPlayerBank(100);
                break;
            default:
                break;
        }

    }

    private void setPrices() {
        propValues[0] = 0;
        propValues[1] = 60;
        propValues[2] = 3; //community chest
        propValues[3] = 60;
        propValues[4] = 5; //income tax
        propValues[5] = 200;
        propValues[6] = 100;
        propValues[7] = 4; //chance
        propValues[8] = 100;
        propValues[9] = 120;
        propValues[10] = 1; //just visiting
        propValues[11] = 140;
        propValues[12] = 150;
        propValues[13] = 140;
        propValues[14] = 160;
        propValues[15] = 200;
        propValues[16] = 180;
        propValues[17] = 3; //comm chest
        propValues[18] = 180;
        propValues[19] = 200;
        propValues[20] = 1; //free parking
        propValues[21] = 220;
        propValues[22] = 4; //chance
        propValues[23] = 220;
        propValues[24] = 240;
        propValues[25] = 200;
        propValues[26] = 260;
        propValues[27] = 260;
        propValues[28] = 150;
        propValues[29] = 280;
        propValues[30] = 2; //go to jail
        propValues[31] = 300;
        propValues[32] = 300;
        propValues[33] = 3; // comm chest
        propValues[34] = 320;
        propValues[35] = 200;
        propValues[36] = 4; // chance
        propValues[37] = 350;
        propValues[38] = 6; //luxury tax
        propValues[39] = 400;
    }

    private void setRents() {
        propRent[0] = 0;
        propRent[1] = 2;
        propRent[2] = 0; //community chest
        propRent[3] = 4;
        propRent[4] = 0; //income tax
        propRent[5] = 25;
        propRent[6] = 6;
        propRent[7] = 0; //chance
        propRent[8] = 6;
        propRent[9] = 8;
        propRent[10] = 0; //just visiting
        propRent[11] = 10;
        propRent[12] = 0;
        propRent[13] = 10;
        propRent[14] = 12;
        propRent[15] = 0;
        propRent[16] = 14;
        propRent[17] = 0; //comm chest
        propRent[18] = 14;
        propRent[19] = 16;
        propRent[20] = 0; //free parking
        propRent[21] = 18;
        propRent[22] = 0; //chance
        propRent[23] = 18;
        propRent[24] = 20;
        propRent[25] = 0;
        propRent[26] = 22;
        propRent[27] = 22;
        propRent[28] = 0;
        propRent[29] = 24;
        propRent[30] = 0; //go to jail
        propRent[31] = 26;
        propRent[32] = 26;
        propRent[33] = 0; // comm chest
        propRent[34] = 28;
        propRent[35] = 0;
        propRent[36] = 0; // chance
        propRent[37] = 35;
        propRent[38] = 0; //luxury tax
        propRent[39] = 50;
    }
}
