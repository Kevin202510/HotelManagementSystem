/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Dashboards.AdminDashboard;
import Views.Dashboards.ContainerManipulator;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CALUAG FAMILY
 */
public class Buttons {
    
    JPanel lalagyanan;
    JLabel home,customers,rate_RT_bed,rooms,users,sales,checkOut;
    
    public Buttons(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }
    
    public void displayDateAndTime(JLabel date,JLabel time){
        while(true){
            Calendar cal = Calendar.getInstance();
            
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);
            
            SimpleDateFormat kev = new SimpleDateFormat("hh:mm:ss aa");
            Date dat = cal.getTime();
            String times = kev.format(dat);
            
            time.setText(times);
        }
    }
    
    
    public void homeButton(JLabel home){
        this.home=home;
            new ContainerManipulator(lalagyanan,new Views.Panels.Home());
    }
    
    
    public void costumerButton(JLabel customers){
        this.customers=customers;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.CustomersPanel(lalagyanan));
                //                new ContainerManipulator(actions,new Views.Panels.CustomerActions());
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    
    
     public void RRB_Button(JLabel rate_RT_bed){
         this.rate_RT_bed=rate_RT_bed;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            } catch (SQLException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
     
     public void roomButton(JLabel rooms,String role){
         this.rooms=rooms;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan,role));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     }
     
     public void userButton(JLabel users){
         this.users=users;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     }
     
     public void saleButton(JLabel sales){
         this.sales=sales;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.SalesPanel());
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
}
     
     
     public void checkoutButton(JLabel checkOut){
         this.checkOut=checkOut;
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.CheckoutPanels(lalagyanan));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
     
     public void checkIn(){
         String role = "Staff";
         try {
                String tanong = "Select * from rooms where status=1";
                Connection con = new SQL().getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()){
                    new ContainerManipulator(lalagyanan,new Views.Panels.CheckinPanels(lalagyanan));
                }else{
                    JOptionPane.showMessageDialog(null,"Sorry there's have no available rooms at this moment");
                    new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan,role));
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
     }
     
    public void setC(JPanel kev){
       kev.setBackground(new Color(102, 140, 255));
    }
    
    public void resetC(JPanel kev1){
           kev1.setBackground(new Color(83,140,198));
    }
    
    public void checkButtons(){
        if (home.isEnabled()&& customers.isEnabled() && sales.isEnabled()&& checkOut.isEnabled()&& users.isEnabled()&& rooms.isEnabled()&& rate_RT_bed.isEnabled()) {
            home.setEnabled(false);
            customers.setEnabled(false);
            sales.setEnabled(false);
            checkOut.setEnabled(false);
            users.setEnabled(false);
            rooms.setEnabled(false);
            rate_RT_bed.setEnabled(false);
        }else{
            home.setEnabled(true);
            customers.setEnabled(true);
            sales.setEnabled(true);
            checkOut.setEnabled(true);
            users.setEnabled(true);
            rooms.setEnabled(true);
            rate_RT_bed.setEnabled(true);
        }
    }
}
//
// if (sales.isEnabled()) {
//            sales.setEnabled(false);
//            checkIn.setEnabled(false);
//            checkOut.setEnabled(false);
//            customers.setEnabled(false);
//            hov1.setEnabled(false);
//            hov2.setEnabled(false);
//            hov3.setEnabled(false);
//            hov4.setEnabled(false);
//        }else{
//            sales.setEnabled(true);
//            checkIn.setEnabled(true);
//            checkOut.setEnabled(true);
//            customers.setEnabled(true);
//            hov1.setEnabled(true);
//            hov2.setEnabled(true);
//            hov3.setEnabled(true);
//            hov4.setEnabled(true);
//        }
