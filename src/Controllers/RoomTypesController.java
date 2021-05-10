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
import sweetalerts.Alerts;

/**
 *
 * @author Chelsea
 */
public class RoomTypesController {
    
     public ArrayList<Roomtypes> rateList = new ArrayList<>();
    public SQL sql = new SQL();
    
    
    public JPanel lalagyanan;
    
    public RoomTypesController(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }
    
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
     
     
//     public void showsaveRT(JPanel lalagyanan, JTable RTtable,JTextField RTid,JTextField RoomType){
//      Connection con = sql.getConnection();
//        String insert = "INSERT INTO roomtypes(RT_id,room_type) VALUES (?,?)";
//        try {
//            PreparedStatement st = con.prepareStatement(insert);
//            st.setInt(1, Integer.parseInt(RTid.getText()));
//            st.setString(2, RoomType.getText());
//            int i = st.executeUpdate();
//            if (i > 0) {
//                DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
//               model.setRowCount(0);
//              
//                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
//        //    JOptionPane.showMessageDialog(null,"Successfully Added!!");
//            } else {
//                JOptionPane.showMessageDialog(null,"Error");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
     
     
     public void saveRT(JTextField RTid,JTextField RoomType,JTable RTtable) throws SQLException{
         //for Save Funktion :)
       //  JOptionPane.showMessageDialog(null,"hello");
          Connection con = sql.getConnection();
         String insert = "INSERT INTO roomtypes(RT_id,room_type) VALUES (?,?)";
         //   JOptionPane.showMessageDialog(null,"hellolast");
            PreparedStatement st = con.prepareStatement(insert);
           st.setInt(1, Integer.parseInt(RTid.getText()));
           st.setString(2, RoomType.getText());
           int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
                model.setRowCount(0);
               new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
             new Alerts("save").setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null,"Error");
            }
     
     
      }
     
     public void fillForm(int id,JTextField RTid,JTextField RoomType) throws SQLException{
         Connection con = sql.getConnection();
      //   JOptionPane.showMessageDialog(null,id);
        String selectRT = "SELECT * FROM roomtypes WHERE RT_id ='"+id+"'";
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(selectRT);
       RTid.setEditable(false);
       RoomType.setEditable(false);
        while(rs.next()){
            RTid.setText(rs.getString("RT_id"));
            RoomType.setText(rs.getString("room_type"));
        }
     }
     
      public boolean deleteRoomtypes(int id,JTable RTtable) throws SQLException{
       Connection con = sql.getConnection();
        String delete = "DELETE FROM roomtypes WHERE RT_id = ?";
        PreparedStatement st = con.prepareStatement(delete);
        st.setInt(1, id);
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
            model.setRowCount(0);
          new Alerts("deleted").setVisible(true);
            return true;
        }else{
            return false;
        }
      }
}
     
 

    
    
    

