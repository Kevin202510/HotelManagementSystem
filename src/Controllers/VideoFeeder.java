/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Dashboards.AdminButtons;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class VideoFeeder extends Thread {
    
          public void run(){
                  
                  String ss = "00";
                  
                  while(true){
                      try {
                          Calendar cal = Calendar.getInstance();
                          SimpleDateFormat kevs = new SimpleDateFormat("hh:mm:ss aa");
                          Date dat = cal.getTime();
                          String timess = kevs.format(dat);
                          JOptionPane.showMessageDialog(null, timess);
                          time=timess;
                        checkCustomerCheckOut(timess);
                      } catch (SQLException ex) {
                          Logger.getLogger(VideoFeeder.class.getName()).log(Level.SEVERE, null, ex);
                      } catch (InterruptedException ex) {
                          Logger.getLogger(VideoFeeder.class.getName()).log(Level.SEVERE, null, ex);
                      }
          
          }
          }
          public String time;
          SQL sql = new SQL();
          Connection con = sql.getConnection();
    
    public void checkCustomerCheckOut(String timess) throws SQLException, InterruptedException{
            String checkOutCheck = "SELECT * FROM `checkinandout` LEFT JOIN customers ON customers.cust_id=checkinandout.cust_id LEFT JOIN rooms ON rooms.room_id=checkinandout.room_id";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(checkOutCheck);
                        
                        while(rs.next()){
                            String checkouttime = rs.getString("timeout");
                            if (timess.equals(checkouttime)) {
                            String checkoutnato = "Customer @ room " + " " + rs.getInt("room_id") + " " + "is time out";
                            new Alerts(checkoutnato).setVisible(true);
//                            new VideoFeeder().sleep(3000);
                            }
                        }
         }
}
