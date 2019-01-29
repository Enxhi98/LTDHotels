/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltd.hotels1;

import java.io.Serializable;
import java.util.List;
import ltd.hotels1.RoomDetails;

//Create class Room
public class Room implements Serializable {
    private String roomNo;
    //private RoomDetails roomDetails;
    private String availability;
    private String type;
   
    //Setting parameters
    public Room(String roomNo, String type, String availability){
       
        this.roomNo = roomNo;
        this.type = type;
        this.availability = availability;
        //this.roomDetails = new RoomDetails();
        //roomDetails.setType();
        
        
    }
    //Getters
    public String getRoomNo(){
        return roomNo;
    }
    
    public String getType(){
        //return String.format(roomDetails.setType()); //roomDetails.getType();
        return type;
    }
    
    public String getAvailability(){
        return availability;
    }
    
    
    
}



