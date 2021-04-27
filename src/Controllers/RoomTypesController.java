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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
     public void showRoomtypes(JTable RTtable) throws SQLException{
        ArrayList<Roomtypes> list = roomtypeList();
      DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getRT_id();
            row[1] = list.get(i).getroom_type();
            model.addRow(row);
         }
    }
    
  //  public static void main(String args[]) throws SQLException{
 //       new RoomTypesController().showRoomtypes();

    public void showCustomers(JTable RTtable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void showRoomtypes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    

