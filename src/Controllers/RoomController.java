/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Rooms;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class RoomController {
    
    public ArrayList<Rooms> roomList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
    public ArrayList<Rooms> roomList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM rooms LEFT JOIN beds ON rooms.bed_id = beds.bed_id LEFT JOIN roomtypes ON rooms.RT_id = roomtypes.RT_id LEFT JOIN rates on rooms.rate_id = rates.rate_id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Rooms rooms;
        
        while(rs.next()){
            rooms=new Rooms(rs.getInt("room_id"),rs.getString("room_type"),rs.getString("bed_quantity"),rs.getInt("rate_price"));
            roomList.add(rooms);
        }
        return roomList;   
    
    }
}
