/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CheckinAndOut;
import Models.Customers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CheckinAndOutController{
    
    public  SQL sql = new SQL();
    public  ArrayList<CheckinAndOut> checkinoutList = new ArrayList<>();
    
    
//    show data
    
    public ArrayList<CheckinAndOut> checkinandoutlist() throws SQLException{
        
        Connection con = sql.getConnection();
        String tanong = "Select * from checkInAndOut";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        CheckinAndOut checkInandOut;
        
        while(rs.next()){
            checkInandOut=new CheckinAndOut(rs.getInt("cust_id"),rs.getInt("room_id"),rs.getString("checkin_date"),rs.getString("checkout_date"),rs.getString("timein"),rs.getString("timeout"));
            checkinoutList.add(checkInandOut);
        }
        return checkinoutList;   
    }
    
//    public void showCustomers() throws SQLException{
//         ArrayList<CheckinAndOut> list = checkinandoutlist();
//         Object[] row = new Object[7];
//         for (int i = 0; i < list.size(); i++) {
//            Object data =  list.get(i).getcusId() + " " +
//            list.get(i).getroomId()+ " " +
//            list.get(i).getcheckin_date()+
//            list.get(i).getcheckout_date()+
//            list.get(i).gettimein()+
//            list.get(i).gettimeout();
//            JOptionPane.showMessageDialog(null,data);
//         }
//    }
    
//    public static void main(String args[]) throws SQLException{
//        CheckinAndOutController vin = new CheckinAndOutController();
//        vin.showCustomers();
//    }
    
}
