/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Views.Panels;

import Controllers.RoomController;
import Models.Users;
import Controllers.SQL;
import Controllers.UserController;
import Views.Dashboards.ContainerManipulator;
import com.github.sarxos.webcam.Webcam;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
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
    int Role;
    JPanel lalagyanan;
    Users userModel;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    Webcam wc;
    Image img;
    
    public UsersPanel(JPanel lalagyanan) throws SQLException {
        initComponents();
        InitRun();
        this.lalagyanan=lalagyanan; 
    }
    
//    UDF
    private void InitRun() throws SQLException{
        Update.setVisible(false);
        roles.setBackground(new Color(0, 0, 0, 0));
        roles.setOpaque(false);
        roles.setForeground(Color.red);
        userControll.showUsers(jTable1);
        userControll.showRoles(roles);
        
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
        profileimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        uaname = new javax.swing.JTextField();
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
        role = new javax.swing.JLabel();
        roles = new javax.swing.JComboBox<>();
        viewpass = new javax.swing.JButton();
        hidepass = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 77, 77));
        setMinimumSize(new java.awt.Dimension(950, 480));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(191, 191, 191));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
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
        jTable1.setRowHeight(65);
        jTable1.setRowMargin(0);
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
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 1140, 710));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(profileimg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(profileimg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 60));

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setPreferredSize(new java.awt.Dimension(306, 642));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FNAME :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 61, 30));

        uaname.setBackground(new java.awt.Color(0, 77, 77));
        uaname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uaname.setForeground(new java.awt.Color(255, 255, 255));
        uaname.setBorder(null);
        jPanel1.add(uaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 210, 22));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 210, 10));

        umi.setBackground(new java.awt.Color(0, 77, 77));
        umi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        umi.setForeground(new java.awt.Color(255, 255, 255));
        umi.setBorder(null);
        jPanel1.add(umi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, 22));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MN:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 61, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, 5));

        usn.setBackground(new java.awt.Color(0, 77, 77));
        usn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        usn.setForeground(new java.awt.Color(255, 255, 255));
        usn.setBorder(null);
        jPanel1.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, 22));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 61, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, 5));

        uadd.setBackground(new java.awt.Color(0, 77, 77));
        uadd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uadd.setForeground(new java.awt.Color(255, 255, 255));
        uadd.setBorder(null);
        jPanel1.add(uadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 210, 22));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 61, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 5));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 61, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 210, 5));

        ucon.setBackground(new java.awt.Color(0, 77, 77));
        ucon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ucon.setForeground(new java.awt.Color(255, 255, 255));
        ucon.setBorder(null);
        jPanel1.add(ucon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 210, 22));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CON.#");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 61, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 214, -1));

        uname.setBackground(new java.awt.Color(0, 77, 77));
        uname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 210, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UNAME:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 180, 5));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASS :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 61, 30));

        Delete.setBackground(new java.awt.Color(51, 102, 255));
        Delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 93, 36));

        udob.setBackground(new java.awt.Color(0, 77, 77));
        udob.setDateFormatString("yyyy-MM-dd");
        udob.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        udob.setOpaque(false);
        jPanel1.add(udob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 210, 30));

        upass.setBackground(new java.awt.Color(0, 77, 77));
        upass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        upass.setForeground(new java.awt.Color(255, 255, 255));
        upass.setBorder(null);
        jPanel1.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 180, 30));

        Add.setBackground(new java.awt.Color(51, 102, 255));
        Add.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 93, 36));

        Update.setBackground(new java.awt.Color(51, 102, 255));
        Update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 93, 36));

        role.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setText("ROLE :");
        jPanel1.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 50, 30));

        roles.setBackground(new java.awt.Color(0, 77, 77));
        roles.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setOpaque(false);
        jPanel1.add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 220, 30));

        viewpass.setBackground(new java.awt.Color(0, 204, 255));
        viewpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eyes.png"))); // NOI18N
        viewpass.setBorderPainted(false);
        viewpass.setContentAreaFilled(false);
        viewpass.setFocusPainted(false);
        viewpass.setFocusable(false);
        viewpass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewpass.setMaximumSize(new java.awt.Dimension(55, 49));
        viewpass.setMinimumSize(new java.awt.Dimension(55, 49));
        viewpass.setPreferredSize(new java.awt.Dimension(60, 49));
        viewpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpassActionPerformed(evt);
            }
        });
        jPanel1.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 30, 30));

        hidepass.setBackground(new java.awt.Color(0, 204, 255));
        hidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hide.png"))); // NOI18N
        hidepass.setBorderPainted(false);
        hidepass.setContentAreaFilled(false);
        hidepass.setFocusPainted(false);
        hidepass.setFocusable(false);
        hidepass.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hidepass.setPreferredSize(new java.awt.Dimension(60, 49));
        hidepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidepassActionPerformed(evt);
            }
        });
        jPanel1.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 30, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER ACTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 220, 53));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, 10));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 480));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 330, 720));
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
      
         if (checkInputs()==true) {
             System.out.print("hello world");
         }else{
        Role = roles.getSelectedIndex()+1;
        userModel=new Users(0,Role,uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
        try {
            boolean checkUser = userControll.createUser(userModel,jTable1);
            if (checkUser==true) {
                userControll.clearContent(uaname, umi, usn, uadd, udob, ucon, uname, upass);
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Role = roles.getSelectedIndex()+1;
        userModel=new Users(0,Role,uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
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
            userControll.fillUserForm(id,roles,uaname, umi, usn, uadd, udob, ucon, uname, upass);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void hidepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidepassActionPerformed
        viewpass.setVisible(true);
        hidepass.setVisible(false);
        upass.setEchoChar('*');
    }//GEN-LAST:event_hidepassActionPerformed

    private void viewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpassActionPerformed
        upass.setEchoChar((char)0);
        hidepass.setVisible(true);
        viewpass.setVisible(false);
    }//GEN-LAST:event_viewpassActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, new Camera(uaname.getText()));
//        if (k==0) {
            File f = new File("/Images/Pictures/"+uaname.getText()+".jpg");
            if(f.exists()) { 
            ImageIcon vin = new ImageIcon(getClass().getResource("/Images/Pictures/"+uaname.getText()+".jpg"));
            Image kev = vin.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
            ImageIcon shit = new ImageIcon(kev);
            profileimg.setIcon(shit);
            }
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean checkInputs(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (uaname.getText().isEmpty()||umi.getText().isEmpty()||usn.getText().isEmpty()||uadd.getText().isEmpty()||udob.getDate()==null||ucon.getText().isEmpty()||uname.getText().isEmpty()||upass.getPassword().length==0){
            JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton hidepass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel profileimg;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JTextField uadd;
    private javax.swing.JTextField uaname;
    private javax.swing.JTextField ucon;
    private com.toedter.calendar.JDateChooser udob;
    private javax.swing.JTextField umi;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JTextField usn;
    private javax.swing.JButton viewpass;
    // End of variables declaration//GEN-END:variables

}
