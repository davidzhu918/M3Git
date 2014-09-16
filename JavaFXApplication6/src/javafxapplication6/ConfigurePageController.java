/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javafxapplication6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.util.converter.IntegerStringConverter;
/**
 * FXML Controller class
 *
 * @author zixiangzhu
 */
public class ConfigurePageController implements Initializable, ControlledScreen {
    /**
     * Initializes the controller class.
     */
    
    ScreensController myController;
    
    private int total = 16;
    private int count = 0;
    public String userName;
    public int pilotP = 0, fighterP = 0, traderP = 0, engineerP = 0;
    
    @FXML
    private TextField userNameInput;
    
    @FXML
    private TextField pilotPt;
    
    @FXML
    private TextField fighterPt;
    
    @FXML
    private TextField traderPt;
    
    @FXML
    private TextField engineerPt;
    
    @FXML
    private Label ptRecord;
    
    @FXML
    private Button cancelButton;
    
    @FXML
    private Button okButton;
    
    public void setScreenParent(ScreensController screenParent) {
        myController = screenParent;
    }
    
    @FXML
    private void okButtonFired(ActionEvent event) {
        System.out.println("You clicked me");
    }
    
    @FXML
    private void cancelButtonFired(ActionEvent event) {
        System.out.println("You clicked me");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        pilotPt.textProperty().addListener((observable, oldCalue, newValue) -> {
            IntegerStringConverter converter = new IntegerStringConverter();
            pilotP = converter.fromString(newValue);
            ptRecord.setText(getPtRemain(pilotP, fighterP, traderP, engineerP) + "/16 points remaining");
        });
        
        fighterPt.textProperty().addListener((observable, oldCalue, newValue) -> {
            IntegerStringConverter converter = new IntegerStringConverter();
            fighterP = converter.fromString(newValue);
            ptRecord.setText(getPtRemain(pilotP, fighterP, traderP, engineerP) + "/16 points remaining");
        });
        
        traderPt.textProperty().addListener((observable, oldCalue, newValue) -> {
            IntegerStringConverter converter = new IntegerStringConverter();
            pilotP = converter.fromString(newValue);
            ptRecord.setText(getPtRemain(pilotP, fighterP, traderP, engineerP) + "/16 points remaining");
        });
        
        engineerPt.textProperty().addListener((observable, oldCalue, newValue) -> {
            IntegerStringConverter converter = new IntegerStringConverter();
            pilotP = converter.fromString(newValue);
            ptRecord.setText(getPtRemain(pilotP, fighterP, traderP, engineerP) + "/16 points remaining");
        });
    }
    
    private int getPtRemain(int p, int f, int t, int e) {
        return 16 - (p + f + e);
    }
    
    
    
    
    
}
