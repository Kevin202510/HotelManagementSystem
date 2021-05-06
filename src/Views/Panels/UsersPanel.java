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
import com.github.sarxos.webcam.WebcamResolution;
import com.github.sarxos.webcam.Webcam;
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
    Webcam wc;
    
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
        wc = Webcam.getDefault();
        wc.setViewSize(WebcamResolution.VGA.getSize());
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
        userActionPanel = new javax.swing.JPanel();
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
        takepicture = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        profile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        profileimg = new jroundborder.JLabelRound();

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
                .addContainerGap(741, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(469, 469, 469))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 60));

        userActionPanel.setBackground(new java.awt.Color(0, 77, 77));
        userActionPanel.setPreferredSize(new java.awt.Dimension(306, 642));
        userActionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FNAME :");
        userActionPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 61, 30));

        uaname.setBackground(new java.awt.Color(0, 77, 77));
        uaname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uaname.setForeground(new java.awt.Color(255, 255, 255));
        uaname.setBorder(null);
        uaname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uanameKeyTyped(evt);
            }
        });
        userActionPanel.add(uaname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 210, 30));
        userActionPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 10));

        umi.setBackground(new java.awt.Color(0, 77, 77));
        umi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        umi.setForeground(new java.awt.Color(255, 255, 255));
        umi.setBorder(null);
        umi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umiActionPerformed(evt);
            }
        });
        umi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                umiKeyTyped(evt);
            }
        });
        userActionPanel.add(umi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MN:");
        userActionPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 61, 30));
        userActionPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 210, 5));

        usn.setBackground(new java.awt.Color(0, 77, 77));
        usn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        usn.setForeground(new java.awt.Color(255, 255, 255));
        usn.setBorder(null);
        usn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usnKeyTyped(evt);
            }
        });
        userActionPanel.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 210, 22));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SN :");
        userActionPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 61, 30));
        userActionPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 210, 5));

        uadd.setBackground(new java.awt.Color(0, 77, 77));
        uadd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uadd.setForeground(new java.awt.Color(255, 255, 255));
        uadd.setBorder(null);
        uadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uaddKeyTyped(evt);
            }
        });
        userActionPanel.add(uadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 210, 22));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADD :");
        userActionPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 61, 30));
        userActionPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 210, 5));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DOB :");
        userActionPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 61, 30));
        userActionPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 210, 5));

        ucon.setBackground(new java.awt.Color(0, 77, 77));
        ucon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ucon.setForeground(new java.awt.Color(255, 255, 255));
        ucon.setBorder(null);
        ucon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uconKeyTyped(evt);
            }
        });
        userActionPanel.add(ucon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 210, 22));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CON.#");
        userActionPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 61, 30));
        userActionPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 214, -1));

        uname.setBackground(new java.awt.Color(0, 77, 77));
        uname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unameKeyTyped(evt);
            }
        });
        userActionPanel.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 210, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("UNAME:");
        userActionPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 30));
        userActionPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 180, 10));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PASS :");
        userActionPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 61, 30));

        Delete.setBackground(new java.awt.Color(51, 102, 255));
        Delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        userActionPanel.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 620, 93, 36));

        udob.setBackground(new java.awt.Color(0, 77, 77));
        udob.setDateFormatString("yyyy-MM-dd");
        udob.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        udob.setOpaque(false);
        userActionPanel.add(udob, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 210, 30));

        upass.setBackground(new java.awt.Color(0, 77, 77));
        upass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        upass.setForeground(new java.awt.Color(255, 255, 255));
        upass.setBorder(null);
        userActionPanel.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 170, 30));

        Add.setBackground(new java.awt.Color(51, 102, 255));
        Add.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        userActionPanel.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 93, 36));

        Update.setBackground(new java.awt.Color(51, 102, 255));
        Update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        userActionPanel.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 93, 36));

        role.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        role.setForeground(new java.awt.Color(255, 255, 255));
        role.setText("ROLE :");
        userActionPanel.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 30));

        roles.setBackground(new java.awt.Color(0, 77, 77));
        roles.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        roles.setForeground(new java.awt.Color(255, 255, 255));
        roles.setOpaque(false);
        roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolesActionPerformed(evt);
            }
        });
        userActionPanel.add(roles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 220, 30));

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
        userActionPanel.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 30, 30));

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
        userActionPanel.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 30, 30));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER ACTION");
        userActionPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, 53));
        userActionPanel.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, 10));

        takepicture.setText("TAKE");
        takepicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takepictureActionPerformed(evt);
            }
        });
        userActionPanel.add(takepicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 60, -1));
        userActionPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 320, 540));
        userActionPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 170, 5));

        profile.setBackground(new java.awt.Color(0, 77, 77));
        profile.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setBorder(null);
        profile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                profileKeyTyped(evt);
            }
        });
        userActionPanel.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 170, 22));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PROFILE");
        userActionPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 61, 30));
        userActionPanel.add(profileimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 260, 150));

        add(userActionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 340, 720));
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
        userModel=new Users(0,Role,profileimg.getText(),uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
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
        userModel=new Users(0,Role,uaname.getText(),uaname.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        
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
            userControll.fillUserForm(id,roles,profileimg,uaname, umi, usn, uadd, udob, ucon, uname, upass);
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

    private void takepictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takepictureActionPerformed
//        JOptionPane.showMessageDialog(this, new Camera(lalagyanan,uaname.getText()));
        
        if (takepicture.getText().equals("TAKE")) {
            wc.open();
            new VideoFeeder().start();
            takepicture.setText("SAVE");
        }else{
            try {
                JOptionPane.showMessageDialog(null,new ImageIcon(img));
                ImageIO.write(wc.getImage(), "JPG", new File("src/Images/Pictures/" + uaname.getText() + ".jpg"));
                profile.setText(uaname.getText() + ".jpg");
                wc.close();
            }catch (IOException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_takepictureActionPerformed

    private void uconKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uconKeyTyped
        char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_uconKeyTyped

    private void uanameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uanameKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_uanameKeyTyped

    private void umiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_umiKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
        
        
    }//GEN-LAST:event_umiKeyTyped

    private void usnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usnKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_usnKeyTyped

    private void uaddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uaddKeyTyped
         char c = evt.getKeyChar();
          if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_uaddKeyTyped

    private void unameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
           if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_unameKeyTyped

    private void rolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolesActionPerformed

    private void umiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umiActionPerformed

    private void profileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_profileKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_profileKeyTyped

    private boolean checkInputs(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (uaname.getText().isEmpty()||umi.getText().isEmpty()||usn.getText().isEmpty()||uadd.getText().isEmpty()||udob.getDate()==null||ucon.getText().isEmpty()||uname.getText().isEmpty()||upass.getPassword().length==0){
            JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
    }
    
    class VideoFeeder extends Thread {
    
          public void run(){
          
               while(true){
                   try {
                        img = wc.getImage();
                        profileimg.setIcon(new ImageIcon(img));
                       Thread.sleep(5);
                   } catch (InterruptedException ex) {
                       JOptionPane.showMessageDialog(null,ex);
                       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
          
          }
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JButton hidepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField profile;
    private jroundborder.JLabelRound profileimg;
    private javax.swing.JLabel role;
    private javax.swing.JComboBox<String> roles;
    private javax.swing.JButton takepicture;
    private javax.swing.JTextField uadd;
    private javax.swing.JTextField uaname;
    private javax.swing.JTextField ucon;
    private com.toedter.calendar.JDateChooser udob;
    private javax.swing.JTextField umi;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JPanel userActionPanel;
    private javax.swing.JTextField usn;
    private javax.swing.JButton viewpass;
    // End of variables declaration//GEN-END:variables

}
