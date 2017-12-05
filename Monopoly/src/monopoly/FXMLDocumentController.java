/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;


import java.awt.event.ActionEvent;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

/**
 *
 * @author kylespomer
 */
public class FXMLDocumentController implements Initializable {
    
    public Image  dice[] = new Image[6];

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
    private Button start;

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
    void startClicked() {
        if(mickey.isSelected()){
            mickeyPane.setVisible(true);
        }
        if(speedy.isSelected()){
            speedyPane.setVisible(true);
        }
        if(jerry.isSelected()){
            jerryPane.setVisible(true);
        }
        if(mighty.isSelected()){
            mightyPane.setVisible(true);
        }
        
        startPane.setVisible(false);
        startPane.setDisable(true);
    }

    @FXML
    void alfredoClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Fettucine Alfredo");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void americanClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #806239");
        cardName.setText("American");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void cheezitClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void colbyClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Colby");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void colbyjackClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Colby Jack");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void cottageClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Cottage");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void cowClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: purple");
        cardName.setText("Cow");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void dipClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("7 Layer Dip");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void duozClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it Duoz");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void farmerClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: purple");
        cardName.setText("Farmer");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void fondueClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("Fondue");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void grilledClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Grilled Cheese");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void hotspicyClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #grey");
        cardName.setText("Cheez-it Hot & Spicy");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void lasagnaClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Lasagna");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void macClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Mac N Cheese");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void marscaponeClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Marscapone");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void montjackClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #D97600");
        cardName.setText("Monterey Jack");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void mozerellaClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Mozerella");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void mozzyClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #0070D4");
        cardName.setText("Mozzerella Sticks");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void nachosClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF2612");
        cardName.setText("Nachos");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void parmClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Parmesan");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void pizzaClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #0070D4");
        cardName.setText("Pizza");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void quesoClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color:  #00B071");
        cardName.setText("Queso");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void ricottaClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #80B3FF");
        cardName.setText("Ricotta");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void romanoClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #FF24CC");
        cardName.setText("Romano");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void velveetaClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #806239");
        cardName.setText("Velveeta");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void whitecheddarClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: grey");
        cardName.setText("Cheez-it White Cheddar");
        cardPrice.setText("");
        cardRent.setText("");
    }

    @FXML
    void zitiClicked(MouseEvent event) {
        cardColor.setStyle("-fx-background-color: #DBCD21");
        cardName.setText("Baked Ziti");
        cardPrice.setText("");
        cardRent.setText("");
    }
    
    
    
    
    
    
    public int diceRoll(){
        Random rand = new Random();
        int roll1 = rand.nextInt(6);
        int roll2 = rand.nextInt(6);
        
        dice1.setImage(dice[roll1]);
        dice2.setImage(dice[roll2]);
        
        if (roll1 == roll2){
            //doubles();
        }
       
        return roll1 + roll2;
        
        
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
    
    
    
}
