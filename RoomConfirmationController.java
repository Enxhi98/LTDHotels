/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltd.hotels1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author enxhikaziu
 */
public class RoomConfirmationController implements Initializable {

    @FXML
    private Button book;
    @FXML
    private Button book1;
    @FXML
    private Button book2;
    @FXML
    private Button back;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void bookFRoom(ActionEvent event) throws SQLException, IOException {
        //SQL statement that changes the room availability when "BookFRoom" button is pressed
        String newAvailability = "Available";
        String sql = "update Rooms set availability ='" +newAvailability+"' where roomno ='2'";
        try {
            Connection con1 = DBConnector.getConnection();
            PreparedStatement pst = con1.prepareStatement(sql);
            
            pst = con1.prepareStatement(sql);
            pst.execute();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AvailabilitiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent root = FXMLLoader.load(getClass().getResource("bookingform.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }


    @FXML
    private void bookSRoom(ActionEvent event) throws SQLException, IOException {
        //SQL statement that changes the room availability when "BookSRoom" button is pressed
        String newAvailability = "Booked";
        String sql = "update Rooms set availability ='" +newAvailability+"' where roomno = '6'";
        try {
            Connection con2 = DBConnector.getConnection();
            PreparedStatement pst1 = con2.prepareStatement(sql);
            
            pst1 = con2.prepareStatement(sql);
            pst1.execute();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AvailabilitiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent root = FXMLLoader.load(getClass().getResource("bookingform.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void bookDRoom(ActionEvent event) throws SQLException, IOException {
        //SQL statement that changes the room availability when "BookDRoom" button is pressed
        String newAvailability = "Booked";
        String sql = "update Rooms set availability ='" +newAvailability+"' where roomno = '14'";
        try {
            Connection con3 = DBConnector.getConnection();
            PreparedStatement pst1 = con3.prepareStatement(sql);
            
            pst1 = con3.prepareStatement(sql);
            pst1.execute();
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(AvailabilitiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Parent root = FXMLLoader.load(getClass().getResource("bookingform.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goBack1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("roomInfo.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

   
    
    
}
