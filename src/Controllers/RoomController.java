/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.RoomModels.Rooms;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class RoomController {
    
    public ArrayList<Rooms> roomList = new ArrayList<>();
    public SQL sql = new SQL();
    
    public ArrayList<Rooms> roomList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "Select * from rooms";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Rooms rooms;
        
        while(rs.next()){
            rooms=new Rooms(rs.getInt("room_id"),rs.getInt("bed_id"),rs.getInt("RT_id"),rs.getInt("rate_id"));
            roomList.add(rooms);
        }
        return roomList;   
    
    }
}
