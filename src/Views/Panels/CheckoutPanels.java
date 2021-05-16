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
     int user_ids;
     JPanel lalagyanan;
     
    public CheckoutPanels(JPanel lalagyanan,int user_ids) throws SQLException {
        initComponents();
        this.user_ids=user_ids;
        this.lalagyanan = lalagyanan;
        lalagyanan.setRequestFocusEnabled(true);
        lalagyanan.setFocusable(true);
        jtxtsearch_cust_checkin_id.requestFocus();
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
        jlbl_co_custtime = new javax.swing.JLabel();
        jtxtco_custfullname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtco_custaddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jbtn_pay = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtco_rooms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtco_custcontact = new javax.swing.JTextField();
        jlbl_co_custdate = new javax.swing.JLabel();
        jlbl_checkindate = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbl_checkintime = new javax.swing.JLabel();
        searchIcon = new javax.swing.JLabel();
        jtxtsearch_cust_checkin_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlbl_totals = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbl_change = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        user_id = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(128, 179, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_co_custtime.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_co_custtime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_co_custtime.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_co_custtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 210, 50));

        jtxtco_custfullname.setEditable(false);
        jtxtco_custfullname.setBackground(new java.awt.Color(128, 179, 255));
        jtxtco_custfullname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtxtco_custfullname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtco_custfullname.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jtxtco_custfullname.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(jtxtco_custfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 420, 40));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CHECK OUT DATE :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, 50));

        jtxtco_custaddress.setEditable(false);
        jtxtco_custaddress.setBackground(new java.awt.Color(128, 179, 255));
        jtxtco_custaddress.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtxtco_custaddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtco_custaddress.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jtxtco_custaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 390, 40));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CONTACT # :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 110, 41));

        jbtn_pay.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_pay.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_pay.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_pay.setText("PAY");
        jbtn_pay.setBorder(null);
        jbtn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_payActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 250, 50));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ROOMS :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 130, 73, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHECK OUT TIME :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 160, 50));

        jtxtco_rooms.setEditable(false);
        jtxtco_rooms.setBackground(new java.awt.Color(128, 179, 255));
        jtxtco_rooms.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtxtco_rooms.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtco_rooms.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jtxtco_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 150, 40));

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("FULL NAME :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 41));

        jLabel16.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ADDRESS :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, 41));

        jtxtco_custcontact.setEditable(false);
        jtxtco_custcontact.setBackground(new java.awt.Color(128, 179, 255));
        jtxtco_custcontact.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtxtco_custcontact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtco_custcontact.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jtxtco_custcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 190, 40));

        jlbl_co_custdate.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_co_custdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_co_custdate.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_co_custdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 220, 50));

        jlbl_checkindate.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_checkindate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_checkindate.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_checkindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 170, 40));

        jLabel17.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CHECK IN DATE :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 140, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CHECK IN TIME :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 140, 60));

        jlbl_checkintime.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_checkintime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_checkintime.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_checkintime, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 130, 40));

        searchIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        jPanel2.add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 40, 40));

        jtxtsearch_cust_checkin_id.requestFocusInWindow();
        jtxtsearch_cust_checkin_id.setBackground(new java.awt.Color(230, 230, 230));
        jtxtsearch_cust_checkin_id.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtxtsearch_cust_checkin_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtsearch_cust_checkin_id.setMargin(new java.awt.Insets(10, 2, 2, 2));
        jtxtsearch_cust_checkin_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtsearch_cust_checkin_idKeyPressed(evt);
            }
        });
        jPanel2.add(jtxtsearch_cust_checkin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 210, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel3.setText("QR Code");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 80, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 70, 50));

        jlbl_totals.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_totals.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_totals.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_totals, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 160, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CHANGE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 70, 50));

        jlbl_change.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jlbl_change.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbl_change.setBorder(javax.swing.BorderFactory.createLineBorder(null));
        jPanel2.add(jlbl_change, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, 160, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 1120, 580));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CHECK OUT");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 340, 54));
        jPanel1.add(user_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1425, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
     public int id;
     
     private boolean getAmount(double topay){
         double toOutPay = Double.parseDouble(JOptionPane.showInputDialog(lalagyanan,"Amount"));
         if (toOutPay<topay) {
             return false;
         }else{
             return true;
         }
     }
     double keytoout,toOutPay;
    private void jbtn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_payActionPerformed
        keytoout = Double.parseDouble(jlbl_totals.getText());
        do{
             toOutPay = Double.parseDouble(JOptionPane.showInputDialog(lalagyanan,"Amount"));
        }while(toOutPay<keytoout);
        double minus = toOutPay - keytoout;
        jlbl_change.setText(String.valueOf(minus));
            try {
                boolean check = check_in_out_controll.payment(Integer.parseInt(jtxtsearch_cust_checkin_id.getText()),user_ids);
                if (check) {
                    jtxtco_custfullname.setText("");
                    jtxtco_custcontact.setText("");
                    jtxtco_rooms.setText("");
                    jlbl_checkindate.setText("");
                    jtxtco_custaddress.setText("");
                    jlbl_checkintime.setText("");
                    jlbl_co_custdate.setText("");
                    jlbl_co_custtime.setText("");
                    jlbl_totals.setText("");
                    jlbl_change.setText("");
                    jtxtsearch_cust_checkin_id.setText("");
                    jtxtsearch_cust_checkin_id.requestFocusInWindow();
                }
            } catch (SQLException ex) {
                Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
            }   
    }//GEN-LAST:event_jbtn_payActionPerformed

    private void jtxtsearch_cust_checkin_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtsearch_cust_checkin_idKeyPressed
        if (evt.getKeyCode()==10) {
            searchIcon.setVisible(false);
            id=Integer.parseInt(jtxtsearch_cust_checkin_id.getText());
            try {
                check_in_out_controll.fillField(id, jtxtco_custfullname, jtxtco_custaddress, jtxtco_custcontact, jlbl_co_custtime, jlbl_co_custdate, jtxtco_rooms,jlbl_checkindate,jlbl_checkintime,jlbl_totals);
            } catch (SQLException ex) {
                Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtxtsearch_cust_checkin_idKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbtn_pay;
    private javax.swing.JLabel jlbl_change;
    private javax.swing.JLabel jlbl_checkindate;
    private javax.swing.JLabel jlbl_checkintime;
    private javax.swing.JLabel jlbl_co_custdate;
    private javax.swing.JLabel jlbl_co_custtime;
    private javax.swing.JLabel jlbl_totals;
    private javax.swing.JTextField jtxtco_custaddress;
    private javax.swing.JTextField jtxtco_custcontact;
    private javax.swing.JTextField jtxtco_custfullname;
    private javax.swing.JTextField jtxtco_rooms;
    private javax.swing.JTextField jtxtsearch_cust_checkin_id;
    private javax.swing.JLabel searchIcon;
    public javax.swing.JLabel user_id;
    // End of variables declaration//GEN-END:variables
}
