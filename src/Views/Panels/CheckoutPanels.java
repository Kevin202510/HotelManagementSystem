/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.CheckinAndOutController;
import Controllers.CustomerController;
import Controllers.SQL;
import Models.Customers;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Maria Crystaline
 */

public class CheckoutPanels extends javax.swing.JPanel {

    /**
     * Creates new form CheckoutPanels
     */
    
     public  SQL sql = new SQL();
     public Connection con = sql.getConnection();
     
     public Customers customers;
     public CheckinAndOutController check_in_out_controll = new CheckinAndOutController();
     
    public CheckoutPanels(JPanel lalagyanan) throws SQLException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        co_custtime = new javax.swing.JLabel();
        co_custfullname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        co_custaddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        co_rooms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        co_custcontact = new javax.swing.JTextField();
        co_custdate = new javax.swing.JLabel();
        checkindate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        checkintime = new javax.swing.JLabel();
        searchIcon = new javax.swing.JLabel();
        search_cust_checkin_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(128, 179, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        co_custtime.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jPanel2.add(co_custtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 210, 30));

        co_custfullname.setEditable(false);
        co_custfullname.setBackground(new java.awt.Color(128, 179, 255));
        co_custfullname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        co_custfullname.setBorder(null);
        jPanel2.add(co_custfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 300, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setText("CHECK OUT DATE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 160, 41));

        co_custaddress.setEditable(false);
        co_custaddress.setBackground(new java.awt.Color(128, 179, 255));
        co_custaddress.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        co_custaddress.setBorder(null);
        jPanel2.add(co_custaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 420, 30));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel13.setText("CONTACT # :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 110, 41));

        pay.setBackground(new java.awt.Color(51, 102, 255));
        pay.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        pay.setText("PAY");
        pay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 400, 210, 50));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel14.setText("ROOMS :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 73, 36));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("CHECK OUT TIME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 160, 40));

        co_rooms.setEditable(false);
        co_rooms.setBackground(new java.awt.Color(128, 179, 255));
        co_rooms.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        co_rooms.setBorder(null);
        jPanel2.add(co_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 240, 30));

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel15.setText("FULL NAME :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 41));

        jLabel16.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel16.setText("ADDRESS :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 90, 41));

        co_custcontact.setEditable(false);
        co_custcontact.setBackground(new java.awt.Color(128, 179, 255));
        co_custcontact.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        co_custcontact.setBorder(null);
        jPanel2.add(co_custcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 220, 30));

        co_custdate.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jPanel2.add(co_custdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 210, 30));

        checkindate.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jPanel2.add(checkindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 210, 30));

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel17.setText("CHECK IN DATE");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 160, 41));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setText("CHECK IN TIME");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 160, 40));

        checkintime.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jPanel2.add(checkintime, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 210, 30));

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        searchIcon.setMaximumSize(new java.awt.Dimension(40, 35));
        searchIcon.setMinimumSize(new java.awt.Dimension(40, 35));
        searchIcon.setPreferredSize(new java.awt.Dimension(40, 35));
        jPanel2.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 40, 40));

        search_cust_checkin_id.setBackground(new java.awt.Color(230, 230, 230));
        search_cust_checkin_id.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        search_cust_checkin_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_cust_checkin_id.setMargin(new java.awt.Insets(10, 2, 2, 2));
        search_cust_checkin_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_cust_checkin_idKeyPressed(evt);
            }
        });
        jPanel2.add(search_cust_checkin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 210, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel3.setText("QR Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 1120, 580));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHECK OUT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 54));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
     
     public int id;
     
     public void addinventory() throws SQLException{
        String insert = "INSERT INTO `inventories`(`id`, `sales_date`, `amount`, `user_id`) VALUES ('3','2021-05-21','900','3')";
        PreparedStatement st = con.prepareStatement(insert);
       int i = st.executeUpdate();
         if (i>0) {
             JOptionPane.showMessageDialog(null,"successfully");
         }
     }
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
         try {
             check_in_out_controll.payment(Integer.parseInt(search_cust_checkin_id.getText()),checkindate.getText());
         } catch (SQLException ex) {
             Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_payActionPerformed

    private void search_cust_checkin_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_cust_checkin_idKeyPressed
        if (evt.getKeyCode()==10) {
            searchIcon.setVisible(false);
            id=Integer.parseInt(search_cust_checkin_id.getText());
            try {
                check_in_out_controll.fillField(id, co_custfullname, co_custaddress, co_custcontact, co_custtime, co_custdate, co_rooms,checkindate,checkintime);
            } catch (SQLException ex) {
                Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_cust_checkin_idKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel checkindate;
    private javax.swing.JLabel checkintime;
    private javax.swing.JTextField co_custaddress;
    private javax.swing.JTextField co_custcontact;
    private javax.swing.JLabel co_custdate;
    private javax.swing.JTextField co_custfullname;
    private javax.swing.JLabel co_custtime;
    private javax.swing.JTextField co_rooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pay;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField search_cust_checkin_id;
    // End of variables declaration//GEN-END:variables
}
