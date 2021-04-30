/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views.Panels;

import Models.Users;
import Controllers.SQL;
import Controllers.UserController;
import Views.Dashboards.ContainerManipulator;
import java.awt.Font;
import java.util.ArrayList;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class UsersPanel extends javax.swing.JPanel {
     
    public UserController userControll = new UserController();
    
    int id;
    JPanel lalagyanan;
    Users userModel;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public UsersPanel(JPanel lalagyanan) throws SQLException {
        initComponents();
        InitRun();
        this.lalagyanan=lalagyanan;
    }
    
//    UDF
    private void InitRun() throws SQLException{
        Update.setVisible(false);
        userControll.showUsers(jTable1);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uaname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        umi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        usn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        uadd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        ucon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        uname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        udob = new com.toedter.calendar.JDateChooser();
        upass = new javax.swing.JPasswordField();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 77, 77));
        setMinimumSize(new java.awt.Dimension(950, 480));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(191, 191, 191));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Role", "Fullname", "Address", "DOB", "Contact #", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setOpaque(false);
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(false);
        jTable1.setSurrendersFocusOnKeystroke(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(4);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(5);
            jTable1.getColumnModel().getColumn(1).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(130);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 1170, 710));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(612, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(598, 598, 598))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, -1));

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(306, 642));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER ACTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 297, 53));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FNAME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 94, 61, 30));

        uaname.setBackground(new java.awt.Color(0, 77, 77));
        uaname.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        uaname.setForeground(new java.awt.Color(255, 255, 255));
        uaname.setBorder(null);
        jPanel1.add(uaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 98, 218, 22));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 119, 218, 5));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 160, 218, 5));

        umi.setBackground(new java.awt.Color(0, 77, 77));
        umi.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        umi.setForeground(new java.awt.Color(255, 255, 255));
        umi.setBorder(null);
        jPanel1.add(umi, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 139, 218, 22));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MI :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 61, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 201, 218, 5));

        usn.setBackground(new java.awt.Color(0, 77, 77));
        usn.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        usn.setForeground(new java.awt.Color(255, 255, 255));
        usn.setBorder(null);
        jPanel1.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, 218, 22));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 176, 61, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 242, 218, 5));

        uadd.setBackground(new java.awt.Color(0, 77, 77));
        uadd.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        uadd.setForeground(new java.awt.Color(255, 255, 255));
        uadd.setBorder(null);
        jPanel1.add(uadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 221, 218, 22));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 217, 61, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 279, 218, 5));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 61, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 320, 218, 5));

        ucon.setBackground(new java.awt.Color(0, 77, 77));
        ucon.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        ucon.setForeground(new java.awt.Color(255, 255, 255));
        ucon.setBorder(null);
        jPanel1.add(ucon, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 299, 218, 22));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CON.#");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 295, 61, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 372, 214, -1));

        uname.setBackground(new java.awt.Color(0, 77, 77));
        uname.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 336, 218, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UNAME:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 336, -1, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 417, 218, 5));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASS :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 392, 61, 30));

        Delete.setBackground(new java.awt.Color(51, 102, 255));
        Delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 93, 36));

        udob.setBackground(new java.awt.Color(0, 77, 77));
        udob.setDateFormatString("yyyy-MM-dd");
        udob.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        udob.setOpaque(false);
        jPanel1.add(udob, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 220, 30));

        upass.setBackground(new java.awt.Color(0, 77, 77));
        upass.setForeground(new java.awt.Color(255, 255, 255));
        upass.setBorder(null);
        jPanel1.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 220, 30));

        Add.setBackground(new java.awt.Color(51, 102, 255));
        Add.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 93, 36));

        Update.setBackground(new java.awt.Color(51, 102, 255));
        Update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 93, 36));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 306, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try {
            boolean checkDeleteUser = userControll.deleteUser(id, jTable1);
            if (checkDeleteUser==true) {
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        userModel=new Users(0,null,uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
        try {
            boolean checkUser = userControll.createUser(userModel,jTable1);
            if (checkUser==true) {
                userControll.clearContent(uaname, umi, usn, uadd, udob, ucon, uname, upass);
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        userModel=new Users(0,null,uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
        try {
            boolean checkUserUpdate = userControll.updateUser(userModel, id, jTable1);
            if (checkUserUpdate==true) {
                userControll.clearContent(uaname, umi, usn, uadd, udob, ucon, uname, upass);
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Update.setVisible(true);
        Add.setVisible(false);
        
        try { 
            id = (int) jTable1.getValueAt(jTable1.getSelectedRow(),0);
            userControll.fillUserForm(id, uaname, umi, usn, uadd, udob, ucon, uname, upass);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField uadd;
    private javax.swing.JTextField uaname;
    private javax.swing.JTextField ucon;
    private com.toedter.calendar.JDateChooser udob;
    private javax.swing.JTextField umi;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTextField usn;
    // End of variables declaration//GEN-END:variables

}
