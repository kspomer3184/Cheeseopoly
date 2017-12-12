/*
 * Board.java
 * serves as the FXML controller class
 * Handles all operations regarding the GUI
 */
package Cheeseopoly;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author kylespomer
 */
public class Board implements Initializable {

    public Image dice[] = new Image[6];
    Game game = new Game();
    private int roll;
    private boolean doubles;

    @FXML
    private ImageView dice1;

    @FXML
    private ImageView dice2;

    @FXML
    private Pane cardColor;

    @FXML
    private Label cardName;

    @FXML
    private Label cardPrice;

    @FXML
    private Label cardRent;

    @FXML
    private Pane queso;

    @FXML
    private Pane dip;

    @FXML
    private Pane fondue;

    @FXML
    private Pane duoz;

    @FXML
    private Pane pizza;

    @FXML
    private Pane mozzy;

    @FXML
    private Pane velveeta;

    @FXML
    private Pane american;

    @FXML
    private Pane cheezit;

    @FXML
    private Pane cottage;

    @FXML
    private Pane ricotta;

    @FXML
    private Pane marscapone;

    @FXML
    private Pane mac;

    @FXML
    private Pane nachos;

    @FXML
    private Pane grilled;

    @FXML
    private Pane hotspicy;

    @FXML
    private Pane lasagna;

    @FXML
    private Pane ziti;

    @FXML
    private Pane farmer;

    @FXML
    private Pane alfredo;

    @FXML
    private Pane colbyjack;

    @FXML
    private Pane montjack;

    @FXML
    private Pane colby;

    @FXML
    private Pane whitecheddar;

    @FXML
    private Pane mozzerella;

    @FXML
    private Pane parm;

    @FXML
    private Pane cow;

    @FXML
    private Pane romano;

    @FXML
    private ImageView _0;

    @FXML
    private ImageView _1;

    @FXML
    private ImageView _2;

    @FXML
    private ImageView _3;

    @FXML
    private ImageView _4;

    @FXML
    private ImageView _5;

    @FXML
    private ImageView _6;

    @FXML
    private ImageView _7;

    @FXML
    private ImageView _8;

    @FXML
    private ImageView _9;

    @FXML
    private ImageView _10;

    @FXML
    private ImageView _11;

    @FXML
    private ImageView _12;

    @FXML
    private ImageView _13;

    @FXML
    private ImageView _14;

    @FXML
    private ImageView _15;

    @FXML
    private ImageView _16;

    @FXML
    private ImageView _17;

    @FXML
    private ImageView _18;

    @FXML
    private ImageView _19;

    @FXML
    private ImageView _20;

    @FXML
    private ImageView _21;

    @FXML
    private ImageView _22;

    @FXML
    private ImageView _23;

    @FXML
    private ImageView _24;

    @FXML
    private ImageView _25;

    @FXML
    private ImageView _26;

    @FXML
    private ImageView _27;

    @FXML
    private ImageView _28;

    @FXML
    private ImageView _29;

    @FXML
    private ImageView _30;

    @FXML
    private ImageView _31;

    @FXML
    private ImageView _32;

    @FXML
    private ImageView _33;

    @FXML
    private ImageView _34;

    @FXML
    private ImageView _35;

    @FXML
    private ImageView _36;

    @FXML
    private ImageView _37;

    @FXML
    private ImageView _38;

    @FXML
    private ImageView _39;

    @FXML
    private Button start;

    @FXML
    private Button buy;

    @FXML
    private Button rent;

    @FXML
    private Button pass;

    @FXML
    private Button end;

    @FXML
    private CheckBox mickey;

    @FXML
    private CheckBox speedy;

    @FXML
    private CheckBox jerry;

    @FXML
    private CheckBox mighty;

    @FXML
    private Pane mickeyPane;

    @FXML
    private Pane speedyPane;

    @FXML
    private Pane jerryPane;

    @FXML
    private Pane mightyPane;

    @FXML
    private AnchorPane startPane;

    @FXML
    private Label mickeyMoney;

    @FXML
    private Label speedyMoney;

    @FXML
    private Label jerryMoney;

    @FXML
    private Label mightyMoney;

    @FXML
    private Label owner;

    @FXML
    private Pane cccPane;

    @FXML
    private Label cccTitle;

    @FXML
    private Label cccText;

    @FXML
    void alfredoClicked() {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Fettucine Alfredo");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(29) != 0) {
            owner.setText(game.getPlayer(game.getOwner(29)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void americanClicked() {
        cardColor.setStyle("-fx-background-color: #806239");
        cardName.setText("American");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(3) != 0) {
            owner.setText(game.getPlayer(game.getOwner(3)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void cheezitClicked() {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(5) != 0) {
            owner.setText(game.getPlayer(game.getOwner(5)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void colbyClicked() {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Colby");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(16) != 0) {
            owner.setText(game.getPlayer(game.getOwner(16)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void colbyjackClicked() {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Colby Jack");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(19) != 0) {
            owner.setText(game.getPlayer(game.getOwner(19)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void cottageClicked() {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Cottage");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(6) != 0) {
            owner.setText(game.getPlayer(game.getOwner(6)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void cowClicked() {
        cardColor.setStyle("-fx-background-color: purple");
        cardName.setText("Cow");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(12) != 0) {
            owner.setText(game.getPlayer(game.getOwner(12)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void dipClicked() {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("7 Layer Dip");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(31) != 0) {
            owner.setText(game.getPlayer(game.getOwner(31)).getToken());
        }
    }

    @FXML
    void duozClicked() {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it Duoz");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(35) != 0) {
            owner.setText(game.getPlayer(game.getOwner(35)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void farmerClicked() {
        cardColor.setStyle("-fx-background-color: purple");
        cardName.setText("Farmer");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(28) != 0) {
            owner.setText(game.getPlayer(game.getOwner(28)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void fondueClicked() {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("Fondue");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(34) != 0) {
            owner.setText(game.getPlayer(game.getOwner(34)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void grilledClicked() {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Grilled Cheese");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(24) != 0) {
            owner.setText(game.getPlayer(game.getOwner(24)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void hotspicyClicked() {
        cardColor.setStyle("-fx-background-color: #grey");
        cardName.setText("Cheez-it Hot & Spicy");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(25) != 0) {
            owner.setText(game.getPlayer(game.getOwner(25)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void lasagnaClicked() {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Lasagna");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(26) != 0) {
            owner.setText(game.getPlayer(game.getOwner(26)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void macClicked() {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Mac N Cheese");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(21) != 0) {
            owner.setText(game.getPlayer(game.getOwner(21)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void marscaponeClicked() {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Marscapone");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(9) != 0) {
            owner.setText(game.getPlayer(game.getOwner(9)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void montjackClicked() {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Monterey Jack");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(18) != 0) {
            owner.setText(game.getPlayer(game.getOwner(18)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void mozerellaClicked() {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Mozerella");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(14) != 0) {
            owner.setText(game.getPlayer(game.getOwner(14)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void mozzyClicked() {
        cardColor.setStyle("-fx-background-color: #0070D4");
        cardName.setText("Mozzerella Sticks");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(39) != 0) {
            owner.setText(game.getPlayer(game.getOwner(39)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void nachosClicked() {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Nachos");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(13) != 0) {
            owner.setText(game.getPlayer(game.getOwner(13)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void parmClicked() {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Parmesan");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(13) != 0) {
            owner.setText(game.getPlayer(game.getOwner(13)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void pizzaClicked() {
        cardColor.setStyle("-fx-background-color: #0070D4");
        cardName.setText("Pizza");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(37) != 0) {
            owner.setText(game.getPlayer(game.getOwner(37)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void quesoClicked() {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("Queso");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(32) != 0) {
            owner.setText(game.getPlayer(game.getOwner(32)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void ricottaClicked() {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Ricotta");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(8) != 0) {
            owner.setText(game.getPlayer(game.getOwner(8)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void romanoClicked() {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Romano");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(11) != 0) {
            owner.setText(game.getPlayer(game.getOwner(11)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void velveetaClicked() {
        cardColor.setStyle("-fx-background-color: #806239");
        cardName.setText("Velveeta");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(1) != 0) {
            owner.setText(game.getPlayer(game.getOwner(1)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void whitecheddarClicked() {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it White Cheddar");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(15) != 0) {
            owner.setText(game.getPlayer(game.getOwner(15)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void zitiClicked() {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Baked Ziti");
        cardPrice.setText("" + game.getPrices()[game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()]);
        cardRent.setText("" + game.getRent(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition()));
        if (game.getOwner(27) != 0) {
            owner.setText(game.getPlayer(game.getOwner(27)).getToken());
        } else {
            owner.setText(null);
        }
    }

    @FXML
    void startClicked() {

        if (mickey.isSelected()) {
            mickeyPane.setVisible(true);
            game.addPlayer(new Player(1, "mickey"));

        }
        if (speedy.isSelected()) {
            speedyPane.setVisible(true);
            game.addPlayer(new Player(2, "speedy"));
        }
        if (jerry.isSelected()) {
            jerryPane.setVisible(true);
            game.addPlayer(new Player(3, "jerry"));
        }
        if (mighty.isSelected()) {
            mightyPane.setVisible(true);
            game.addPlayer(new Player(4, "mightymouse"));
        }
        startPane.setVisible(false);
        startPane.setDisable(true);

        moveToken(0, new Image("tokens/" + game.getPlayer(game.getCurrentPlayer()).getToken() + ".png"));

    }

    @FXML
    void buyClicked() {
        game.getPlayer(game.getCurrentPlayer()).buyProperty(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition(), game.getPrices());
        game.setOwner(game.getPlayer(game.getCurrentPlayer()).getPlayerPosition(), game.getCurrentPlayer());
        setMoney();
        setButtons(3);
        end.setDisable(false);

    }

    @FXML
    void passClicked() {
        setButtons(3);
        end.setDisable(false);
    }

    @FXML
    void rentClicked() {
        game.payRent(game.getCurrentPlayer(), game.getPlayer(game.getCurrentPlayer()).getPlayerPosition());
        setMoney();
        setButtons(3);
        end.setDisable(false);
    }

    @FXML
    void endClicked() {
        dice1.setDisable(false);
        dice2.setDisable(false);
        cccPane.setVisible(false);
        setCurrentPlayer(game.nextPlayer().getToken());
        if (game.getPlayer(game.getCurrentPlayer()).getPlayerPosition() == 0) {
            moveToken(0, new Image("tokens/" + game.getPlayer(game.getCurrentPlayer()).getToken() + ".png"));
        }
        setMoney();
    }

    private int roll() {
        Random rand = new Random();

        int roll1 = rand.nextInt(6);
        int roll2 = rand.nextInt(6);

        dice1.setImage(dice[roll1]);
        dice2.setImage(dice[roll2]);

        if (roll1 == roll2) {
            //doubles();
        }

        return roll1 + roll2 + 2;

    }

    public void diceRoll() {
        //while(!game.checkEnd()){
        //    for(int i = 0; i < game.getNumPlayers(); i++){

        setMoney();
        setCurrentPlayer(game.getPlayer(game.getCurrentPlayer()).getToken());
        if (!game.getPlayer(game.getCurrentPlayer()).checkJail()) {
            turn(game.getPlayer(game.getCurrentPlayer()));
        } else {
            game.getPlayer(game.getCurrentPlayer()).jail();
            moveToken(game.getPlayer(game.getCurrentPlayer()).setPlayerPosition(10), new Image("tokens/" + game.getPlayer(game.getCurrentPlayer()).getToken() + ".png"));

        }
        //    }
        //}
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        dice[0] = new Image("dice/1.png");
        dice[1] = new Image("dice/2.png");
        dice[2] = new Image("dice/3.png");
        dice[3] = new Image("dice/4.png");
        dice[4] = new Image("dice/5.png");
        dice[5] = new Image("dice/6.png");

    }

    private void turn(Player player) {

        moveToken(player.getPlayerPosition(), null);

        roll = roll();

        moveToken(player.incrementPlayerPosition(roll), new Image("tokens/" + player.getToken() + ".png"));

        setCard(player.getPlayerPosition());
        if (player.getPlayerPosition() == 30) {
            player.jail();
            moveToken(game.getPlayer(game.getCurrentPlayer()).setPlayerPosition(10), new Image("tokens/" + game.getPlayer(game.getCurrentPlayer()).getToken() + ".png"));
            moveToken(30, new Image(""));

        } else if (player.getPlayerPosition() == 2 || player.getPlayerPosition() == 17 || player.getPlayerPosition() == 33) {
            comCheese();
        } else if (player.getPlayerPosition() == 7 || player.getPlayerPosition() == 22 || player.getPlayerPosition() == 36) {
            chance();
        }
        setMoney();
        if (game.getPrices()[player.getPlayerPosition()] < 60) {
            setButtons(3);
            end.setDisable(false);
        } else {
            setButtons(game.propEval());
        }

    }

    private void setButtons(int eval) {
        switch (eval) {
            case 0: //unowned property
                buy.setDisable(false);
                pass.setDisable(false);
                rent.setDisable(true);
                dice1.setDisable(true);
                dice2.setDisable(true);
                break;
            case 1: //self owned property
                buy.setDisable(true);
                pass.setDisable(true);
                rent.setDisable(true);
                end.setDisable(false);
                dice1.setDisable(true);
                dice2.setDisable(true);
                break;
            case 2: //others' property
                buy.setDisable(true);
                pass.setDisable(true);
                rentSet();
                rent.setDisable(false);
                dice1.setDisable(true);
                dice2.setDisable(true);
                break;
            case 3: //turn off buttons
                buy.setDisable(true);
                pass.setDisable(true);
                rent.setDisable(true);
                dice1.setDisable(true);
                dice2.setDisable(true);
                owner.setText(null);
                game.otherSpace();
                break;
        }
    }

    private void comCheese() {
        Random rand = new Random();

        int draw = rand.nextInt(4);
        cccTitle.setText("Community Cheese!");
        switch (draw) {
            case 1:
                cccText.setText("You've won second prize at a cheese contest! Collect $10.");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).creditPlayerBank(10);
                break;
            case 2:
                cccText.setText("Cheese investment pays out in your favor! Collect $50.");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).creditPlayerBank(50);
                break;
            case 3:
                cccText.setText("Got caught smuggling muenster! Fined $60.");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).debitPlayerBank(10);
                break;
            case 4:
                cccText.setText("Found some aged cheddar under the sofa! Collect $10.");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).creditPlayerBank(10);
                break;
        }
    }

    private void chance() {
        Random rand = new Random();

        int draw = rand.nextInt(4);
        cccTitle.setText("Chance!");
        switch (draw) {
            case 1:
                cccText.setText("Mozzerella Maintainence! Lose $40");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).debitPlayerBank(10);
                break;
            case 2:
                cccText.setText("Deposed king of Havarti needs your help! Lose $50.");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).debitPlayerBank(50);
                break;
            case 3:
                cccText.setText("Happy Gruyere Day! Collect $5");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).creditPlayerBank(5);
                break;
            case 4:
                cccText.setText("Replace your car wheels with wheels of cheese! Lose $80");
                cccPane.setVisible(true);
                game.getPlayer(game.currentPlayer).debitPlayerBank(80);
                break;
        }
    }

    private void setMoney() {
        for (int i = 0; i < game.getNumPlayers(); i++) {

            switch (game.getPlayer(i).getToken()) {

                case "mickey":
                    mickeyMoney.setText("$" + game.getPlayer(i).getPlayerBank());
                    if (game.getPlayer(i).getPlayerBank() < 1) {
                        game.removePlayer(i);
                        mickeyPane.setVisible(false);
                    }
                    break;
                case "speedy":
                    speedyMoney.setText("$" + game.getPlayer(i).getPlayerBank());
                    if (game.getPlayer(i).getPlayerBank() < 1) {
                        game.removePlayer(i);
                        speedyPane.setVisible(false);
                    }
                    break;
                case "jerry":
                    jerryMoney.setText("$" + game.getPlayer(i).getPlayerBank());
                    if (game.getPlayer(i).getPlayerBank() < 1) {
                        game.removePlayer(i);
                        jerryPane.setVisible(false);
                    }
                    break;
                case "mightymouse":
                    mightyMoney.setText("$" + game.getPlayer(i).getPlayerBank());
                    if (game.getPlayer(i).getPlayerBank() < 1) {
                        game.removePlayer(i);
                        mightyPane.setVisible(false);
                    }
                    break;
            }
        }
        if (game.getNumPlayers() == 1) {
            end.setText(game.getPlayer(1).getToken() + " wins!");
        }
    }

    private void setCard(int location) {
        switch (location) {
            case 0: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 1: {
                velveetaClicked();
                break;
            }
            case 2: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 3: {
                americanClicked();
                break;
            }
            case 4: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 5: {
                cheezitClicked();
                break;
            }
            case 6: {
                cottageClicked();
                break;
            }
            case 7: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 8: {
                ricottaClicked();
                break;
            }
            case 9: {
                marscaponeClicked();
                break;
            }
            case 10: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 11: {
                romanoClicked();
                break;
            }
            case 12: {
                cowClicked();
                break;
            }
            case 13: {
                parmClicked();
                break;
            }
            case 14: {
                mozerellaClicked();
                break;
            }
            case 15: {
                whitecheddarClicked();
                break;
            }
            case 16: {
                colbyClicked();
                break;
            }
            case 17: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 18: {
                montjackClicked();
                break;
            }
            case 19: {
                colbyjackClicked();
                break;
            }
            case 20: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 21: {
                macClicked();
                break;
            }
            case 22: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 23: {
                nachosClicked();
                break;
            }
            case 24: {
                grilledClicked();
                break;
            }
            case 25: {
                hotspicyClicked();
                break;
            }
            case 26: {
                lasagnaClicked();
                break;
            }
            case 27: {
                zitiClicked();
                break;
            }
            case 28: {
                farmerClicked();
                break;
            }
            case 29: {
                alfredoClicked();
                break;
            }
            case 30: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 31: {
                dipClicked();
                break;
            }
            case 32: {
                quesoClicked();
                break;
            }
            case 33: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 34: {
                fondueClicked();
                break;
            }
            case 35: {
                duozClicked();
                break;
            }
            case 36: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 37: {
                pizzaClicked();
                break;
            }
            case 38: {
                cardColor.setStyle("-fx-background-color: #000000");
                cardName.setText("");
                cardPrice.setText("");
                cardRent.setText("");
                break;
            }
            case 39: {
                mozzyClicked();
                break;
            }
        }
    }

    private void setCurrentPlayer(String player) {
        end.setDisable(true);
        switch (player) {
            case "mickey": {
                mickeyPane.setVisible(true);
                mickeyPane.setStyle("-fx-background-color: yellow");
                speedyPane.setStyle("-fx-background-color: null");
                jerryPane.setStyle("-fx-background-color: null");
                mightyPane.setStyle("-fx-background-color: null");
                break;
            }
            case "speedy": {
                speedyPane.setVisible(true);
                mickeyPane.setStyle("-fx-background-color: null");
                speedyPane.setStyle("-fx-background-color: blue");
                jerryPane.setStyle("-fx-background-color: null");
                mightyPane.setStyle("-fx-background-color: null");
                break;
            }
            case "jerry": {
                jerryPane.setVisible(true);
                mickeyPane.setStyle("-fx-background-color: null");
                speedyPane.setStyle("-fx-background-color: null");
                jerryPane.setStyle("-fx-background-color: red");
                mightyPane.setStyle("-fx-background-color: null");
                break;
            }
            case "mightymouse": {
                mightyPane.setVisible(true);
                mickeyPane.setStyle("-fx-background-color: null");
                speedyPane.setStyle("-fx-background-color: null");
                jerryPane.setStyle("-fx-background-color: null");
                mightyPane.setStyle("-fx-background-color: green");
                break;
            }
        }
    }

    private void moveToken(int loc, Image token) {

        switch (loc) {
            case 0:
                _0.setImage(token);
                break;
            case 1:
                _1.setImage(token);
                break;
            case 2:
                _2.setImage(token);
                break;
            case 3:
                _3.setImage(token);
                break;
            case 4:
                _4.setImage(token);
                break;
            case 5:
                _5.setImage(token);
                break;
            case 6:
                _6.setImage(token);
                break;
            case 7:
                _7.setImage(token);
                break;
            case 8:
                _8.setImage(token);
                break;
            case 9:
                _9.setImage(token);
                break;
            case 10:
                _10.setImage(token);
                break;
            case 11:
                _11.setImage(token);
                break;
            case 12:
                _12.setImage(token);
                break;
            case 13:
                _13.setImage(token);
                break;
            case 14:
                _14.setImage(token);
                break;
            case 15:
                _15.setImage(token);
                break;
            case 16:
                _16.setImage(token);
                break;
            case 17:
                _17.setImage(token);
                break;
            case 18:
                _18.setImage(token);
                break;
            case 19:
                _19.setImage(token);
                break;
            case 20:
                _20.setImage(token);
                break;
            case 21:
                _21.setImage(token);
                break;
            case 22:
                _22.setImage(token);
                break;
            case 23:
                _23.setImage(token);
                break;
            case 24:
                _24.setImage(token);
                break;
            case 25:
                _25.setImage(token);
                break;
            case 26:
                _26.setImage(token);
                break;
            case 27:
                _27.setImage(token);
                break;
            case 28:
                _28.setImage(token);
                break;
            case 29:
                _29.setImage(token);
                break;
            case 30:
                _30.setImage(token);
                break;
            case 31:
                _31.setImage(token);
                break;
            case 32:
                _32.setImage(token);
                break;
            case 33:
                _33.setImage(token);
                break;
            case 34:
                _34.setImage(token);
                break;
            case 35:
                _35.setImage(token);
                break;
            case 36:
                _36.setImage(token);
                break;
            case 37:
                _37.setImage(token);
                break;
            case 38:
                _38.setImage(token);
                break;
            case 39:
                _39.setImage(token);
                break;
        }
    }

    private void rentSet() {
        cardRent.setText("" + game.rentEval(game.getPlayer(game.getCurrentPlayer()), roll));
    }
}
