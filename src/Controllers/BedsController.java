/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Beds;
import Views.Dashboards.ContainerManipulator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sweetalerts.Alerts;

/**
 *
 * @author Chelsea
 */
public class BedsController {
    
    public ArrayList<Beds> roomList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
      public JPanel lalagyanan;
    
    public BedsController(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }
   
    
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
    
   public void showBeds(JTable bedtable) throws SQLException{
        ArrayList<Beds> list = bedList();
        DefaultTableModel model = (DefaultTableModel)bedtable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getbed_id();
            row[1] = list.get(i).getbed_quality();
            model.addRow(row);
    }
    
  
    }
     public void saveBeds(JTextField BedID,JTextField BedQuantity,JTable bedtable){
   
        try {
            //  JOptionPane.showMessageDialog(null,"hello");fn
            Connection con = sql.getConnection();
            String insert = "INSERT INTO beds(bed_quantity) VALUES (?)";
            //     JOptionPane.showMessageDialog(null,"hellolast");
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, BedQuantity.getText());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)bedtable.getModel();
                model.setRowCount(0);
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
                new Alerts("save").setVisible(true);
            } else {
                new Alerts("error").setVisible(true);
            }
        } catch (SQLException ex) {
            new Alerts("Error" + " " + ex).setVisible(true);
        }
     }
     
     public void updateBeds(int id,JTextField BedQuantity,JTable bedtable){
   
        try {
            Connection con = sql.getConnection();
            String insert = "UPDATE beds set bed_quantity=? where bed_id = ?";
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, BedQuantity.getText());
            st.setInt(2,id);
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)bedtable.getModel();
                model.setRowCount(0);
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
                new Alerts("update").setVisible(true);
            } else {
                new Alerts("error").setVisible(true);
            }
        } catch (SQLException ex) {
            new Alerts("Error" + " " + ex).setVisible(true);
        }
     }
     
     
        public void fillForm(int id,JTextField BedID,JTextField BedQuantity) throws SQLException{
         Connection con = sql.getConnection();
        String selectbed = "SELECT * FROM beds WHERE bed_id ='"+id+"'";
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(selectbed);
       BedID.setEditable(false);
        while(rs.next()){
            BedID.setText(rs.getString("bed_id"));
            BedQuantity.setText(rs.getString("bed_quantity"));
        }
     }
     
     
     
     public boolean deleteBeds(int id, JTable bedtable) throws SQLException{
       Connection con = sql.getConnection();
        String delete = "DELETE FROM beds WHERE bed_id = ?";
      //  JOptionPane.showMessageDialog(null,"hello");
        PreparedStatement st = con.prepareStatement(delete);
        st.setInt(1, id);
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)bedtable.getModel();
            model.setRowCount(0);
            new Alerts("deleted").setVisible(true);
            return true;
        }else{
            new Alerts("error").setVisible(true);
            return false;
        }

     }
    

  
}
