/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Models.Rates;
import Views.Dashboards.ContainerManipulator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class RatesController {
    
      public ArrayList<Rates> rateList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
         public JPanel lalagyanan;
    
    public RatesController(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }

    
    public ArrayList<Rates> rateList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM rates";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Rates rates;
        
        while(rs.next()){
           rates=new Rates(rs.getInt("rate_id"),rs.getInt("rate_price"));
            rateList.add(rates);
        }
        return rateList;   
    }
     public void showRates(JTable ratestable) throws SQLException{
        ArrayList<Rates> list = rateList();
      DefaultTableModel model = (DefaultTableModel)ratestable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getrate_id();
            row[1] = list.get(i).getrate_price();
            model.addRow(row);
//model.addRow(row);
         }
    }
        public void saveRates(JTextField RateID,JTextField RatePrice,JTable ratestable){
          try {
              //for Save Funktion :)
              //   JOptionPane.showMessageDialog(null,"hello");
              Connection con = sql.getConnection();
              String insert = "INSERT INTO rates(rate_id,rate_price) VALUES (?,?)";
              //     JOptionPane.showMessageDialog(null,"hellolast");
              PreparedStatement st = con.prepareStatement(insert);
              st.setInt(1, Integer.parseInt(RateID.getText()));
              st.setInt(2, Integer.parseInt(RatePrice.getText()));
              int i = st.executeUpdate();
              if (i > 0) {
                  DefaultTableModel model = (DefaultTableModel)ratestable.getModel();
                  model.setRowCount(0);
                  new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
                  new Alerts("save").setVisible(true);
              } else {
                  new Alerts("error").setVisible(true);
              }
          } catch (SQLException ex) {
                new Alerts("Error " + ex).setVisible(true);
          }
       
        }
        
         public void fillForm(int id,JTextField RateID,JTextField RatePrice) throws SQLException{
         Connection con = sql.getConnection();
        String selectrate = "SELECT * FROM rates WHERE rate_id ='"+id+"'";
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(selectrate);
       RateID.setEditable(false);
       RatePrice.setEditable(false);
        while(rs.next()){
            RateID.setText(rs.getString("rate_id"));
            RatePrice.setText(rs.getString("rate_price"));
        }
    
}
         
         
         public boolean deleteRates(int id,JTable ratestable) throws SQLException{
       Connection con = sql.getConnection();
        String delete = "DELETE FROM rates WHERE rate_id = ?";
       // JOptionPane.showMessageDialog(null,"hello");
        PreparedStatement st = con.prepareStatement(delete);
        st.setInt(1, id);
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)ratestable.getModel();
            model.setRowCount(0);
            new Alerts("delete").setVisible(true);
            return true;
        }else{
            new Alerts("error").setVisible(true);
            return false;
        }

     }

} 
