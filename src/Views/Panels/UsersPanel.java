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
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
    Image img;
//    Webcam wc;
    
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
//        wc = Webcam.getDefault();
//        wc.setViewSize(WebcamResolution.VGA.getSize());
//        wc.open();
        this.lalagyanan=lalagyanan;
        
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
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        jtxussearch = new javax.swing.JTextField();
        userActionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtxusuaname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jtxusumi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jtxususn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtxusuadd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jtxusucon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jtxusuname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        udob = new com.toedter.calendar.JDateChooser();
        jtxuspass = new javax.swing.JPasswordField();
        role = new javax.swing.JLabel();
        roles = new javax.swing.JComboBox<>();
        viewpass = new javax.swing.JButton();
        hidepass = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        profileimg = new jroundborder.JLabelRound();
        jLabel1 = new javax.swing.JLabel();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 1150, 690));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USERS");

        Update.setBackground(new java.awt.Color(51, 102, 255));
        Update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(51, 102, 255));
        Delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(51, 102, 255));
        Add.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jtxussearch, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(559, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jtxussearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 80));

        userActionPanel.setBackground(new java.awt.Color(0, 77, 77));
        userActionPanel.setPreferredSize(new java.awt.Dimension(306, 642));
        userActionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FNAME :");
        userActionPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 61, 40));

        jtxusuaname.setBackground(new java.awt.Color(0, 77, 77));
        jtxusuaname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxusuaname.setForeground(new java.awt.Color(255, 255, 255));
        jtxusuaname.setBorder(null);
        jtxusuaname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxusuanameKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxusuaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 20));
        userActionPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 210, 10));

        jtxusumi.setBackground(new java.awt.Color(0, 77, 77));
        jtxusumi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxusumi.setForeground(new java.awt.Color(255, 255, 255));
        jtxusumi.setBorder(null);
        jtxusumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxusumiActionPerformed(evt);
            }
        });
        jtxusumi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxusumiKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxusumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 210, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MN :");
        userActionPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 40, 20));
        userActionPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 210, 5));

        jtxususn.setBackground(new java.awt.Color(0, 77, 77));
        jtxususn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxususn.setForeground(new java.awt.Color(255, 255, 255));
        jtxususn.setBorder(null);
        jtxususn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxususnKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxususn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 210, 20));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SN  :");
        userActionPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 50, 20));
        userActionPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 210, 10));

        jtxusuadd.setBackground(new java.awt.Color(0, 77, 77));
        jtxusuadd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxusuadd.setForeground(new java.awt.Color(255, 255, 255));
        jtxusuadd.setBorder(null);
        jtxusuadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxusuaddKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxusuadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 210, 20));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD :");
        userActionPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 60, 20));
        userActionPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 210, 10));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB :");
        userActionPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 61, 30));
        userActionPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 210, 5));

        jtxusucon.setBackground(new java.awt.Color(0, 77, 77));
        jtxusucon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxusucon.setForeground(new java.awt.Color(255, 255, 255));
        jtxusucon.setBorder(null);
        jtxusucon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxusuconKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxusucon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 210, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CON.#");
        userActionPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 50, 20));
        userActionPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 214, -1));

        jtxusuname.setBackground(new java.awt.Color(0, 77, 77));
        jtxusuname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxusuname.setForeground(new java.awt.Color(255, 255, 255));
        jtxusuname.setBorder(null);
        jtxusuname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxusunameActionPerformed(evt);
            }
        });
        jtxusuname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxusunameKeyTyped(evt);
            }
        });
        userActionPanel.add(jtxusuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 210, 20));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UNAME:");
        userActionPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, 20));
        userActionPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 180, 10));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASS :");
        userActionPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 61, 30));

        udob.setBackground(new java.awt.Color(0, 77, 77));
        udob.setDateFormatString("yyyy-MM-dd");
        udob.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        udob.setOpaque(false);
        userActionPanel.add(udob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 210, 30));

        jtxuspass.setBackground(new java.awt.Color(0, 77, 77));
        jtxuspass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxuspass.setForeground(new java.awt.Color(255, 255, 255));
        jtxuspass.setBorder(null);
        userActionPanel.add(jtxuspass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 570, 170, 30));

        role.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setText("ROLE :");
        userActionPanel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 30));

        roles.setBackground(new java.awt.Color(0, 77, 77));
        roles.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setOpaque(false);
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });
        userActionPanel.add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, 30));

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
        userActionPanel.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 30, 30));

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
        userActionPanel.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 30, 30));
        userActionPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 210, 10));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 198, 255), 5, true));
        userActionPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 310, 650));
        userActionPanel.add(profileimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 180));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER ACTION");
        userActionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 220, 38));

        add(userActionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxusunameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxusunameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxusunameActionPerformed

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
        userModel=new Users(0,Role,null,jtxusuaname.getText(), jtxusumi.getText(),jtxususn.getText(),jtxusuadd.getText(),df.format(udob.getDate()),jtxusucon.getText(),jtxusuname.getText(),String.valueOf(jtxuspass.getPassword()));
        
        try {
            boolean checkUser = userControll.createUser(userModel,jTable1);
            if (checkUser==true) {
                userControll.clearContent(jtxusuaname, jtxusumi, jtxususn, jtxusuadd, udob, jtxusucon, jtxusuname, jtxuspass);
                new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Role = roles.getSelectedIndex()+1;
         userModel=new Users(0,Role,jtxusuaname.getText(),jtxusuaname.getText(), jtxusumi.getText(),jtxususn.getText(),jtxusuadd.getText(),df.format(udob.getDate()),jtxusucon.getText(),jtxusuname.getText(),String.valueOf(jtxuspass.getPassword()));
        
        try {
            boolean checkUserUpdate = userControll.updateUser(userModel, id, jTable1);
            if (checkUserUpdate==true) {
                userControll.clearContent(jtxusuaname, jtxusumi, jtxususn, jtxusuadd, udob, jtxusucon, jtxusuname, jtxuspass);
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
            userControll.fillUserForm(id,roles,profileimg,jtxusuaname, jtxusumi, jtxususn, jtxusuadd, udob, jtxusucon, jtxusuname, jtxuspass);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(UsersPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void hidepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidepassActionPerformed
        viewpass.setVisible(true);
        hidepass.setVisible(false);
        jtxuspass.setEchoChar('*');
    }//GEN-LAST:event_hidepassActionPerformed

    private void viewpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpassActionPerformed
        jtxuspass.setEchoChar((char)0);
        hidepass.setVisible(true);
        viewpass.setVisible(false);
    }//GEN-LAST:event_viewpassActionPerformed

    private void takepictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takepictureActionPerformed
//        JOptionPane.showMessageDialog(this, new Camera(lalagyanan,uaname.getText()));
        
  
    }//GEN-LAST:event_takepictureActionPerformed

    private void jtxusuconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxusuconKeyTyped
        char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxusuconKeyTyped

    private void jtxusuanameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxusuanameKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxusuanameKeyTyped

    private void jtxusumiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxusumiKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
        
        
    }//GEN-LAST:event_jtxusumiKeyTyped

    private void jtxususnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxususnKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxususnKeyTyped

    private void jtxusuaddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxusuaddKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxusuaddKeyTyped

    private void jtxusunameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxusunameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
           if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxusunameKeyTyped

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolesActionPerformed

    private void jtxusumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxusumiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxusumiActionPerformed

    private boolean checkInputs(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (jtxusuaname.getText().isEmpty()||jtxusumi.getText().isEmpty()||jtxususn.getText().isEmpty()||jtxusuadd.getText().isEmpty()||udob.getDate()==null||jtxusucon.getText().isEmpty()||jtxusuname.getText().isEmpty()||jtxuspass.getPassword().length==0){
            JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
    }
    
//    class VideoFeeder extends Thread {
//    
//          public void run(){
//          
//               while(true){
//                   try {
//                        img = wc.getImage();
//                        profileimg.setIcon(new ImageIcon(img));
//                       Thread.sleep(5);
//                   } catch (InterruptedException ex) {
//                       JOptionPane.showMessageDialog(null,ex);
//                       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                   }
//                }
//          
//          }
//    
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPasswordField jtxuspass;
    private javax.swing.JTextField jtxussearch;
    private javax.swing.JTextField jtxusuadd;
    private javax.swing.JTextField jtxusuaname;
    private javax.swing.JTextField jtxusucon;
    private javax.swing.JTextField jtxusumi;
    private javax.swing.JTextField jtxusuname;
    private javax.swing.JTextField jtxususn;
    private jroundborder.JLabelRound profileimg;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> roles;
    private com.toedter.calendar.JDateChooser udob;
    private javax.swing.JPanel userActionPanel;
    private javax.swing.JButton viewpass;
    // End of variables declaration//GEN-END:variables

}
