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
//        fillField();
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
        jLabel2 = new javax.swing.JLabel();
        co_custtime = new javax.swing.JLabel();
        co_custfullname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        co_custaddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pay = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        co_rooms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        co_custcontact = new javax.swing.JTextField();
        co_custdate = new javax.swing.JLabel();
        search_cust_checkin_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(128, 179, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 63, 64));
        jLabel2.setText("CHECK OUT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 54));

        co_custtime.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(co_custtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 210, 41));
        jPanel2.add(co_custfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 220, 41));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setText("CHECK OUT DATE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 160, 41));
        jPanel2.add(co_custaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 240, 41));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel13.setText("CONTACT #");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 100, 41));

        pay.setBackground(new java.awt.Color(51, 102, 255));
        pay.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        pay.setText("PAY");
        pay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 126, 61));

        delete1.setBackground(new java.awt.Color(51, 102, 255));
        delete1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete1.setText("DELETE");
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.blue, null, null));
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 126, 61));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel14.setText("ROOMS");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 73, 36));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel1.setText("CHECK OUT TIME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 160, 40));
        jPanel2.add(co_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 240, 41));

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel15.setText("FULL NAME");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, 41));

        jLabel16.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel16.setText("ADDRESS");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 80, 41));
        jPanel2.add(co_custcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 220, 41));

        co_custdate.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(co_custdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, 41));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 1120, 580));

        search_cust_checkin_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_cust_checkin_idKeyPressed(evt);
            }
        });
        jPanel1.add(search_cust_checkin_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 200, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("HOTEL MANAGEMENT");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

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
    private void fillField() throws SQLException{
        ArrayList<Customers> list = new CustomerController().custList();
        String room_id="";
        String datein="";
        String tanong = "Select * from checkinandout where id=2";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        
         while(rs.next()){
                    room_id = String.valueOf(rs.getInt("room_id"));
                     datein = rs.getString("checkin_date");
         }
           
         int index = id+1;
        co_custfullname.setText(list.get(index).getcust_fullname());
        co_custaddress.setText(list.get(index).getcust_address());
        co_custcontact.setText(list.get(index).getcust_contactnum());
        co_custtime.setText(check_in_out_controll.getTimeNow());
        co_custdate.setText(check_in_out_controll.getDateNow());
        co_rooms.setText(room_id);
        JOptionPane.showMessageDialog(null,datein);
        String checkindate = datein;
        String checkoutdate = String.valueOf(check_in_out_controll.getDateNow());
        LocalDate checkin = LocalDate.parse(checkindate);
        LocalDate checkout = LocalDate.parse(checkoutdate);
        Long days = ChronoUnit.DAYS.between(checkin,checkout);
        JOptionPane.showMessageDialog(null,days);
        int total = (int) (500 * days);
        JOptionPane.showMessageDialog(null,total);
    }
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        search_cust_checkin_id.setText("");
         try {
             addinventory();
         } catch (SQLException ex) {
             Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_payActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed

    }//GEN-LAST:event_delete1ActionPerformed

    private void search_cust_checkin_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_cust_checkin_idKeyPressed
        if (evt.getKeyCode()==10) {
            id=Integer.parseInt(search_cust_checkin_id.getText());
            try {
                fillField();
            } catch (SQLException ex) {
                Logger.getLogger(CheckoutPanels.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_search_cust_checkin_idKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField co_custaddress;
    private javax.swing.JTextField co_custcontact;
    private javax.swing.JLabel co_custdate;
    private javax.swing.JTextField co_custfullname;
    private javax.swing.JLabel co_custtime;
    private javax.swing.JTextField co_rooms;
    private javax.swing.JButton delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pay;
    private javax.swing.JTextField search_cust_checkin_id;
    // End of variables declaration//GEN-END:variables
}