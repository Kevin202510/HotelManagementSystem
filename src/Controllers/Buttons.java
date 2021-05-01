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
    
    public Buttons(JPanel lalagyanan){
        this.lalagyanan=lalagyanan;
    }
    
    
    public void homeButton(JLabel home){
        if (home.isEnabled()) {
            new ContainerManipulator(lalagyanan,new Views.Panels.Home());
        }
    }
    
    
    public void costumerButton(JLabel customers){
    if (customers.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.CustomersPanel(lalagyanan));
                //                new ContainerManipulator(actions,new Views.Panels.CustomerActions());
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
    }
    }
    
    
     public void RRB_Button(JButton rate_RT_bed){
         //RATE-ROOMTYPE-BEDS
              if (rate_RT_bed.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            } catch (SQLException ex) {
                Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
     public void roomButton(JLabel rooms){
     if (rooms.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
     
     }
     
     public void userButton(JLabel users){
      if (users.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
     }
     
     public void saleButton(JLabel sales){
   if (sales.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.SalesPanel());
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
}
     
     
     public void checkoutButton(JLabel checkOut){
     if (checkOut.isEnabled()) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.CheckoutPanels(lalagyanan));
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
    }
     
     public void checkIn(){
          try {
                String tanong = "Select * from rooms where status=1";
                Connection con = new SQL().getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()){
                    new ContainerManipulator(lalagyanan,new Views.Panels.CheckinPanels(lalagyanan));
                }else{
                    JOptionPane.showMessageDialog(null,"Sorry there's have no available rooms at this moment");
                    new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan));
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
