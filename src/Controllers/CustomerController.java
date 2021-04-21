/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Customers;
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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
     
}
