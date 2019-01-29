/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltd.hotels1;

import java.beans.Statement;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author enxhikaziu
 */
public class AvailabilitiesController implements Initializable {
//Table characteristics
    @FXML
    private TableView<Room> room_table;
    @FXML
    private TableColumn<Room, String> col_roomNo;
    @FXML
    private TableColumn<Room, String> col_type;
    @FXML
    private TableColumn<Room, String> col_availability;
    
    ObservableList<Room>roomList = FXCollections.observableArrayList();
    @FXML
    private Button details;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        try {
            //New connection with database
            Connection con = DBConnector.getConnection();
            //Create sql statement and connect the columns to the Room class parameters
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM ROOMS");
            while (rs.next()){
                roomList.add(new Room(rs.getString("ROOMNO"), rs.getString("TYPE"), rs.getString("AVAILABILITY")));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AvailabilitiesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        col_roomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        col_type.setCellValueFactory(new PropertyValueFactory<>("type"));
        col_availability.setCellValueFactory(new PropertyValueFactory<>("availability"));
           
        room_table.setItems(roomList);    
        
    }    
//Display in GUI
    @FXML
    private void getDetails(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("roomInfo.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
 

 
		

