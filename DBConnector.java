/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltd.hotels1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Connect to a certain database using username and password
public class DBConnector {
    public static Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Rooms;user=root;password=password");
        return connection;
    }
    
}
