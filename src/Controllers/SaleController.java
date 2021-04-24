/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.Sales;
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
public class SaleController {
    public SQL sql = new SQL();
    public ArrayList<Sales> saleList = new ArrayList<>();
   
    
//    store data
    
    public ArrayList<Sales> saleList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM inventories";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Sales sales;
        
        while(rs.next()){
          sales = new Sales(rs.getInt("id"),rs.getString("sales_date"),rs.getInt("amount"),rs.getInt("user_id"));
            saleList.add(sales);
        }
        return saleList;   
    }
     public void showSales(JTable salestable) throws SQLException{
        ArrayList<Sales> list = saleList();
         DefaultTableModel model = (DefaultTableModel)salestable.getModel();
         Object[] row = new Object[4];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getsales_date();
            row[2] = list.get(i).getamount();
            row[3] = list.get(i).getuser_id();
            model.addRow(row);
         }
    }
}
