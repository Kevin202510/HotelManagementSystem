/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.CustomerController;
import Controllers.SQL;
import Models.Customers;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

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
     
    public CheckoutPanels() throws SQLException {
        initComponents();
        fillField();
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

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("CHECK OUT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 54));

        co_custtime.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(co_custtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 210, 41));
        jPanel2.add(co_custfullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, 213, 41));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel12.setText("CHECK OUT DATE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 41));
        jPanel2.add(co_custaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 220, 41));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel13.setText("Contact #");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 80, 41));

        pay.setText("PAY");
        pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payActionPerformed(evt);
            }
        });
        jPanel2.add(pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 126, 61));

        delete1.setText("DELETE");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel2.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 126, 61));

        jLabel14.setText("ROOMS");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 73, 36));

        jLabel1.setText("CHECK OUT TIME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 90, 40));
        jPanel2.add(co_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 220, 41));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel15.setText("Full Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 73, 41));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel16.setText("Address");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 41));
        jPanel2.add(co_custcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 220, 41));

        co_custdate.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel2.add(co_custdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 210, 41));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 1120, 580));

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
    
    public String getDateNow(){
         java.util.Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        String strDate = dateFormat.format(date);
        return strDate;
     }
     
     public String getTimeNow(){
         java.util.Date date = Calendar.getInstance().getTime();  
        DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");  
        String strTime = timeFormat.format(date);
        return strTime;
     }
     
    private void fillField() throws SQLException{
        ArrayList<Customers> list = new CustomerController().custList();
        int id = 2;
        String room_id="";
        String tanong = "Select * from checkinandout where id='"+id+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
                room_id = String.valueOf(rs.getInt("room_id"));
        }
        int index = id;
        co_custfullname.setText(list.get(index).getcust_fullname());
        co_custaddress.setText(list.get(index).getcust_address());
        co_custcontact.setText(list.get(index).getcust_contactnum());
        co_custtime.setText(getDateNow());
        co_custdate.setText(getTimeNow());
        co_rooms.setText(room_id);
    }
    private void payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payActionPerformed
        

//        customers = new Customers(0,cusFname1.getText(),cusMname1.getText(),cusLname1.getText(),cusAddress1.getText(),cusContact2.getText());
//        createCustomer(customers);
    }//GEN-LAST:event_payActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed

    }//GEN-LAST:event_delete1ActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pay;
    // End of variables declaration//GEN-END:variables
}
