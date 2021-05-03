/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.Authentication;
import Controllers.SQL;
import Models.Users;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.relation.Role;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CALUAG FAMILY
 */
public class ProfileSettings extends javax.swing.JFrame {

    /**
     * Creates new form ProfileSettings
     */
    static int UserIdSended;
    Users userModel;
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    
    public ProfileSettings(int user_id) throws SQLException {
        initComponents();
        this.UserIdSended=user_id;
        userId.setText(String.valueOf(UserIdSended));
        getUserInfo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userActionPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        uaname2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        umi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        usn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        uadd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        ucon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        uname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        udob = new com.toedter.calendar.JDateChooser();
        upass = new javax.swing.JPasswordField();
        Update = new javax.swing.JButton();
        viewpass = new javax.swing.JButton();
        hidepass = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        userId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(447, 674));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/kevz.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 240, 130));

        userActionPanel2.setBackground(new java.awt.Color(0, 77, 77));
        userActionPanel2.setPreferredSize(new java.awt.Dimension(306, 642));
        userActionPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FNAME :");
        userActionPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 61, 30));

        uaname2.setBackground(new java.awt.Color(0, 77, 77));
        uaname2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uaname2.setForeground(new java.awt.Color(255, 255, 255));
        uaname2.setBorder(null);
        uaname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uaname2KeyTyped(evt);
            }
        });
        userActionPanel2.add(uaname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 270, 22));
        userActionPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 270, 10));

        umi.setBackground(new java.awt.Color(0, 77, 77));
        umi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        umi.setForeground(new java.awt.Color(255, 255, 255));
        umi.setBorder(null);
        userActionPanel2.add(umi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 270, 22));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MN:");
        userActionPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 61, 30));
        userActionPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 270, 5));

        usn.setBackground(new java.awt.Color(0, 77, 77));
        usn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        usn.setForeground(new java.awt.Color(255, 255, 255));
        usn.setBorder(null);
        userActionPanel2.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 270, 22));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SN :");
        userActionPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 61, 30));
        userActionPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 270, 5));

        uadd.setBackground(new java.awt.Color(0, 77, 77));
        uadd.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uadd.setForeground(new java.awt.Color(255, 255, 255));
        uadd.setBorder(null);
        userActionPanel2.add(uadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 270, 22));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ADD :");
        userActionPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 61, 30));
        userActionPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 270, 5));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DOB :");
        userActionPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 61, 30));
        userActionPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 270, 5));

        ucon.setBackground(new java.awt.Color(0, 77, 77));
        ucon.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ucon.setForeground(new java.awt.Color(255, 255, 255));
        ucon.setBorder(null);
        ucon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uconKeyTyped(evt);
            }
        });
        userActionPanel2.add(ucon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 270, 22));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CON.#");
        userActionPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 61, 30));
        userActionPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 270, -1));

        uname.setBackground(new java.awt.Color(0, 77, 77));
        uname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setBorder(null);
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        userActionPanel2.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 270, 30));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("UNAME:");
        userActionPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, 30));
        userActionPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, 250, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("PASS :");
        userActionPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 61, 30));

        udob.setBackground(new java.awt.Color(0, 77, 77));
        udob.setDateFormatString("yyyy-MM-dd");
        udob.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        udob.setOpaque(false);
        userActionPanel2.add(udob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 270, 30));

        upass.setBackground(new java.awt.Color(0, 77, 77));
        upass.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        upass.setForeground(new java.awt.Color(255, 255, 255));
        upass.setBorder(null);
        userActionPanel2.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 250, 30));

        Update.setBackground(new java.awt.Color(51, 102, 255));
        Update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        userActionPanel2.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 600, 340, 36));

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
        userActionPanel2.add(viewpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 30, 30));

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
        userActionPanel2.add(hidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 30, 30));
        userActionPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, 10));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        userActionPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 650));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        userActionPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 60, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        userActionPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 43, 36));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Profile");
        userActionPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 250, 50));

        userId.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        userActionPanel2.add(userId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 50, 40));

        getContentPane().add(userActionPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //        JOptionPane.showMessageDialog(this, new Camera(uaname.getText()));
        //        //        if (k==0) {
            //            File f = new File("/Images/Pictures/"+uaname.getText()+".jpg");
            //            if(f.exists()) {
                //                ImageIcon vin = new ImageIcon(getClass().getResource("/Images/Pictures/"+uaname.getText()+".jpg"));
                //                Image kev = vin.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
                //                ImageIcon shit = new ImageIcon(kev);
                //                profileimg.setIcon(shit);
                //            }
            //        }
    }//GEN-LAST:event_jButton2ActionPerformed

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

    public  SQL sql = new SQL();
    public Connection con = sql.getConnection();
    int role_id;
    Authentication auth = new Authentication();
    
    private void getUserInfo() throws SQLException{
        String tanong = "SELECT * FROM `users` WHERE user_id='"+UserIdSended+"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);

            while(rs.next()){
                role_id=rs.getInt("role_id");
                uaname2.setText(rs.getString("user_Fname"));
                umi.setText(rs.getString("user_Mname"));
                usn.setText(rs.getString("user_Lname"));
                uadd.setText(rs.getString("user_address"));
                udob.setDate(rs.getDate("user_DOB"));
                ucon.setText(rs.getString("user_contactnum"));
                uname.setText(rs.getString("user_username"));
                upass.setText(auth.decrypt(rs.getString("user_password")));
            }
    }
    
    public boolean updateUser(Users users) throws SQLException{
        String updates = "UPDATE users SET user_Fname = ?,user_Mname = ?,user_Lname = ?,user_address = ?,user_DOB = ?,user_contactnum = ?,user_username = ?,user_password = ? WHERE user_id = '" + UserIdSended + "'";
        PreparedStatement st = con.prepareStatement(updates);
        st.setString(1, users.getuser_Fname());
        st.setString(2, users.getuser_Mname());
        st.setString(3, users.getuser_Lname());
        st.setString(4, users.getuser_address());
        st.setString(5, users.getuser_DOB());
        st.setString(6, users.getuser_contactnum());
        st.setString(7, users.getuser_username());
        st.setString(8, auth.encrypt(users.getuser_password()));
        
        int i = st.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(null,"Successfully Updated!!");
            this.dispose();
            return true;
        }else{
            return false;
        }
     }
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
            userModel=new Users(0,role_id,uaname2.getText(), umi.getText(),usn.getText(),uadd.getText(),df.format(udob.getDate()),ucon.getText(),uname.getText(),String.valueOf(upass.getPassword()));
        try {
            updateUser(userModel);
        } catch (SQLException ex) {
            Logger.getLogger(ProfileSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

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

    private void uaname2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uaname2KeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') ||
            (c == KeyEvent.VK_PERIOD) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_uaname2KeyTyped

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
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProfileSettings(UserIdSended).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProfileSettings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton hidepass;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField uadd;
    public javax.swing.JTextField uaname2;
    private javax.swing.JTextField ucon;
    private com.toedter.calendar.JDateChooser udob;
    private javax.swing.JTextField umi;
    private javax.swing.JTextField uname;
    private javax.swing.JPasswordField upass;
    private javax.swing.JPanel userActionPanel2;
    public javax.swing.JLabel userId;
    private javax.swing.JTextField usn;
    private javax.swing.JButton viewpass;
    // End of variables declaration//GEN-END:variables
}
