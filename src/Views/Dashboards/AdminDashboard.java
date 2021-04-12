/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Dashboards;

import Views.Authentication.Login;
import Views.Dashboards.ContainerManipulator;
import java.awt.Color;
import java.awt.Component;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JPanel;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form Sample
     * 
     */
    
    public static String fullname,role;
    
    public AdminDashboard(String fullname,String role) {
        initComponents();
        new ContainerManipulator(lalagyanan,new Views.Panels.Home());
        user_fullname.setText(fullname);
        userrole.setText(role);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        sidebar = new javax.swing.JPanel();
        hov1 = new javax.swing.JPanel();
        rooms = new javax.swing.JLabel();
        hov2 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        hov3 = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        hov4 = new javax.swing.JPanel();
        customers = new javax.swing.JLabel();
        jLabelRound1 = new jroundborder.JLabelRound();
        jLabelRound2 = new jroundborder.JLabelRound();
        jLabelRound3 = new jroundborder.JLabelRound();
        jLabelRound4 = new jroundborder.JLabelRound();
        user_fullname = new javax.swing.JLabel();
        userrole = new javax.swing.JLabel();
        lalagyanan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(83, 140, 198));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelmanagement.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(310, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1170, 70));

        sidebar.setBackground(new java.awt.Color(51, 51, 51));

        hov1.setBackground(new java.awt.Color(51, 51, 51));

        rooms.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/room.png"))); // NOI18N
        rooms.setText("ROOMS");
        rooms.setIconTextGap(40);
        rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roomsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roomsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov1Layout = new javax.swing.GroupLayout(hov1);
        hov1.setLayout(hov1Layout);
        hov1Layout.setHorizontalGroup(
            hov1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov1Layout.setVerticalGroup(
            hov1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hov1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        hov2.setBackground(new java.awt.Color(51, 51, 51));

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        home.setText("HOME");
        home.setIconTextGap(50);
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov2Layout = new javax.swing.GroupLayout(hov2);
        hov2.setLayout(hov2Layout);
        hov2Layout.setHorizontalGroup(
            hov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov2Layout.setVerticalGroup(
            hov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        hov3.setBackground(new java.awt.Color(51, 51, 51));

        users.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N
        users.setText("USERS");
        users.setIconTextGap(50);
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov3Layout = new javax.swing.GroupLayout(hov3);
        hov3.setLayout(hov3Layout);
        hov3Layout.setHorizontalGroup(
            hov3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov3Layout.setVerticalGroup(
            hov3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        hov4.setBackground(new java.awt.Color(51, 51, 51));

        customers.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 255));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customers.png"))); // NOI18N
        customers.setText("CUSTOMERS");
        customers.setIconTextGap(10);
        customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov4Layout = new javax.swing.GroupLayout(hov4);
        hov4.setLayout(hov4Layout);
        hov4Layout.setHorizontalGroup(
            hov4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov4Layout.setVerticalGroup(
            hov4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabelRound1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gearmoto.gif"))); // NOI18N
        jLabelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound1MouseClicked(evt);
            }
        });

        jLabelRound2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.gif"))); // NOI18N
        jLabelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound2MouseClicked(evt);
            }
        });

        jLabelRound3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unlock.gif"))); // NOI18N
        jLabelRound3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound3MouseClicked(evt);
            }
        });

        jLabelRound4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/QRCODE/about us.png"))); // NOI18N

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hov1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hov2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hov3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(hov4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_fullname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sidebarLayout.createSequentialGroup()
                                .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sidebarLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(user_fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userrole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(hov2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hov3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hov1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hov4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addComponent(jLabelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(426, Short.MAX_VALUE))
        );

        getContentPane().add(sidebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 900));

        lalagyanan.setPreferredSize(new java.awt.Dimension(1000, 780));
        lalagyanan.setLayout(new javax.swing.BoxLayout(lalagyanan, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(lalagyanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 1170, 780));

        jPanel3.setBackground(new java.awt.Color(83, 140, 198));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POWERED BY INNOVATECH");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 850, 1170, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void setC(JPanel kev){
         kev.setBackground(new Color(230,230,230));
    }
    
    private void resetC(JPanel kev1){
          kev1.setBackground(new Color(51,51,51));
    }

    private void roomsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseEntered
        setC(hov1);
    }//GEN-LAST:event_roomsMouseEntered

    private void roomsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseExited
        resetC(hov1);
    }//GEN-LAST:event_roomsMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        if (home.isEnabled()) {
        new ContainerManipulator(lalagyanan,new Views.Panels.Home());
        }
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        setC(hov2);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        resetC(hov2);
    }//GEN-LAST:event_homeMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        if (home.isEnabled()) {
        try {
            new ContainerManipulator(lalagyanan,new Views.Panels.UsersPanel());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        }
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        setC(hov3);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        resetC(hov3);
    }//GEN-LAST:event_usersMouseExited

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        if (customers.isEnabled()) {
            try {
            new ContainerManipulator(lalagyanan,new Views.Panels.CustomersPanel());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_customersMouseClicked

    private void customersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseEntered
        setC(hov4);
    }//GEN-LAST:event_customersMouseEntered

    private void customersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseExited
        resetC(hov4);
    }//GEN-LAST:event_customersMouseExited

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        if (rooms.isEnabled()) {
        try {
            new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_roomsMouseClicked

    private void jLabelRound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound2MouseClicked
         int result = JOptionPane.showConfirmDialog(this,"Are You Sure That You Want To Sign Out", "LogOut",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
         if (result==0){
            new Login().setVisible(true);
            this.dispose();
         }
        
    }//GEN-LAST:event_jLabelRound2MouseClicked

    private void jLabelRound3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound3MouseClicked
        if (home.isEnabled()) {
                home.setEnabled(false);
               users.setEnabled(false);
               rooms.setEnabled(false);
               customers.setEnabled(false);
               hov1.setEnabled(false);
               hov2.setEnabled(false);
               hov3.setEnabled(false);
               hov4.setEnabled(false);
        }else{
            home.setEnabled(true);
            users.setEnabled(true);
            rooms.setEnabled(true);
            customers.setEnabled(true);
            hov1.setEnabled(true);
            hov2.setEnabled(true);
            hov3.setEnabled(true);
            hov4.setEnabled(true);
        }
    }//GEN-LAST:event_jLabelRound3MouseClicked

    private void jLabelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound1MouseClicked
        JOptionPane.showConfirmDialog(null, new Views.Panels.Receipts(), "Receipt", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
//            new Views.Panels.Receipts().setVisible(true);
    }//GEN-LAST:event_jLabelRound1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard(fullname,role).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customers;
    private javax.swing.JLabel home;
    private javax.swing.JPanel hov1;
    private javax.swing.JPanel hov2;
    private javax.swing.JPanel hov3;
    private javax.swing.JPanel hov4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private jroundborder.JLabelRound jLabelRound1;
    private jroundborder.JLabelRound jLabelRound2;
    private jroundborder.JLabelRound jLabelRound3;
    private jroundborder.JLabelRound jLabelRound4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel lalagyanan;
    private javax.swing.JLabel rooms;
    private javax.swing.JPanel sidebar;
    private javax.swing.JLabel user_fullname;
    private javax.swing.JLabel userrole;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables
}
