/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Customers;
import Models.SukiCustomers;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CustomerController {
    
    public SQL sql = new SQL();
    public JTable tab;
    public Connection con = sql.getConnection();
        
    public void createCustomer(Customers customers) throws SQLException{
        String insert = "INSERT INTO customers(cust_Fname,cust_Mname,cust_Lname,cust_address,cust_contactnum) VALUES (?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setString(1, customers.getcust_Fname());
        st.setString(2, customers.getcust_Mname());
        st.setString(3, customers.getcust_Lname());
        st.setString(4, customers.getcust_address());
        st.setString(5, customers.getcust_contactnum());
       st.executeUpdate();
//       checkIn() ;
    }
    
     public ArrayList<Customers> custList() throws SQLException{
        ArrayList<Customers> custList = new ArrayList<>();
        SQL sql = new SQL();
        Connection con = sql.getConnection();
        String tanong = "Select * from Customers";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Customers customers;
        
        while(rs.next()){
         customers=new Customers(rs.getInt("cust_id"),rs.getString("cust_Fname"),rs.getString("cust_Mname"),rs.getString("cust_Lname"),rs.getString("cust_address"),rs.getString("cust_contactnum"));
         custList.add(customers);
        }
        return custList;   
    }
     
      public void showCustomers(JTable customerTable) throws SQLException{
         ArrayList<Customers> list =custList();
         DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getcust_id();
            row[1] = list.get(i).getcust_fullname();
            row[2] = list.get(i).getcust_address();
            row[3] = list.get(i).getcust_contactnum();
            model.addRow(row);
         }
    }
      
      public void showCustomer(JComboBox customer) throws SQLException{
         ArrayList<Customers> list =custList();
         for (int i = 0; i < list.size(); i++) {
           String vin = list.get(i).getcust_fullname();
           customer.addItem(vin);
         }
    }
      
    public ArrayList<SukiCustomers> custSukiList() throws SQLException{
        ArrayList<SukiCustomers> custosukiList = new ArrayList<>();
        SQL sql = new SQL();
        Connection con = sql.getConnection();
        String tanong = "Select * from sukicustomers LEFT JOIN customers ON customers.cust_id=sukicustomers.custo_id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        SukiCustomers sukicustomers;
        
        while(rs.next()){
         String fullname = rs.getString("cust_Fname") + " " + rs.getString("cust_Mname") + " " + rs.getString("cust_Lname");  
         sukicustomers=new SukiCustomers(rs.getInt("id"),fullname,rs.getString("sukicode"),rs.getDouble("points"));
         custosukiList.add(sukicustomers);
        }
        return custosukiList;   
    }
      
    public void showSukiCustomer(JTable customerTable) throws SQLException{
        ArrayList<SukiCustomers> custosukiList = custSukiList();
        DefaultTableModel model = (DefaultTableModel)customerTable.getModel();
        Object[] row = new Object[8];
        for (int i = 0; i < custosukiList.size(); i++) {
//           row[0] = custosukiList.get(i).getId();
           row[0] = custosukiList.get(i).getsukiCode();
           row[1] = custosukiList.get(i).getcustomerName();
           row[2] = custosukiList.get(i).getpoints();
           model.addRow(row);
        }
    }
    
    public boolean addNewSuki(SukiCustomers sukicustomers,JTable sukicustomerstbl) throws SQLException{
        ArrayList<Customers> list =custList();
        String insert = "INSERT INTO sukicustomers(custo_id,sukicode,points) VALUES (?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1, list.get(sukicustomers.getcustoId()-1).getcust_id());
        st.setString(2, sukicustomers.getsukiCode());
        st.setDouble(3, sukicustomers.getpoints());
       int i = st.executeUpdate();
       
       if(i>0){
            DefaultTableModel model = (DefaultTableModel)sukicustomerstbl.getModel();
            model.setRowCount(0);
            new Alerts("save").setVisible(true);
            return true;
       }else{
           return false;
       }
    
    }
     
}
