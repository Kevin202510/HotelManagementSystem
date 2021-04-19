/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Roomtypes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chelsea
 */
public class RoomTypesController {
    
     public ArrayList<Roomtypes> rateList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
    public ArrayList<Roomtypes> roomtypeList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM roomtypes";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Roomtypes roomtypes;
        
        while(rs.next()){
           roomtypes=new Roomtypes(rs.getInt("RT_id"),rs.getString("room_type"));
            rateList.add(roomtypes);
        }
        return rateList;   
    }
     public void showRoomtypes() throws SQLException{
        ArrayList<Roomtypes> list = roomtypeList();
        Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getRT_id() + " " +
            list.get(i).getroom_type();
            JOptionPane.showMessageDialog(null,name);
          //model.addRow(row);
         }
    }
    
    public static void main(String args[]) throws SQLException{
        new RoomTypesController().showRoomtypes();
    }
    
    
    
}
