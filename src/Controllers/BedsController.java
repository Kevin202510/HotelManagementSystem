/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Beds;
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
public class BedsController {
    
    public ArrayList<Beds> roomList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
    public ArrayList<Beds> bedList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM beds";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Beds beds;
        
        while(rs.next()){
            beds=new Beds(rs.getInt("bed_id"),rs.getString("bed_quantity"));
            roomList.add(beds);
        }
        return roomList;   
    }
    
   public void showBeds() throws SQLException{
        ArrayList<Beds> list = bedList();
        Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getbed_id() + " " +
            list.get(i).getbed_quality();
            JOptionPane.showMessageDialog(null,name);
     //^       model.addRow(row);
         }
    }
    
    public static void main(String args[]) throws SQLException{
        new BedsController().showBeds();
    }

  
}