/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Roomtypes;
import Views.Dashboards.ContainerManipulator;
import Views.Panels.Rate_RT_BedPanels;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
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
     
     
     public void showsaveRT(JPanel lalagyanan, JTable RTtable,JTextField RTid,JTextField RoomType){
      Connection con = sql.getConnection();
        String insert = "INSERT INTO roomtypes(RT_id,room_type) VALUES (?,?)";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            st.setInt(1, Integer.parseInt(RTid.getText()));
            st.setString(2, RoomType.getText());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
               model.setRowCount(0);
              
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            JOptionPane.showMessageDialog(null,"Successfully Added!!");
            } else {
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  //  public static void main(String args[]) throws SQLException{
 //       new RoomTypesController().showRoomtypes();

   // public void showCustomers(JTable RTtable) {
   //     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

   // public void showRoomtypes() {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    

