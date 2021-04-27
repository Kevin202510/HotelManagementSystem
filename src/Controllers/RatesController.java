/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Rates;
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
public class RatesController {
    
      public ArrayList<Rates> rateList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
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
    
    
   
    
}
