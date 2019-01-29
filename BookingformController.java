/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltd.hotels1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author enxhikaziu
 */
public class BookingformController implements Initializable {

    @FXML
    private Text validation;
    @FXML
    private TextField fName;
    @FXML
    private TextField lName;
    @FXML
    private TextField email;
    @FXML
    private DatePicker checkin;
    @FXML
    private DatePicker checkout;
    @FXML
    private TextField card;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Error message preset to not visible
        validation.setVisible(false);
    }    

    @FXML
    private void bookingConfirmed(ActionEvent event) throws IOException {
        //If statement that checks if the fields are filled out and displays error message if not
        if (fName.getText().isEmpty() || lName.getText().isEmpty() || email.getText().isEmpty() || card.getText().isEmpty()) {
            validation.setVisible(true);
        }
        else{
           Parent root = FXMLLoader.load(getClass().getResource("congrats.fxml"));
           Scene scene = new Scene(root);
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setResizable(false);
           stage.setScene(scene);
           stage.show(); 
        }
        
    }
    
}
