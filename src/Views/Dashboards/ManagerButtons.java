/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Dashboards;

import Controllers.Buttons;
import Controllers.ImageTextRenderer;
import Controllers.ImagesNText;
import Views.Authentication.Login;
import Views.Panels.ProfileSettings;
import java.awt.Color;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author CALUAG FAMILY
 */
public class ManagerButtons extends javax.swing.JPanel {

    /**
     * Creates new form ManagerButtons
     */
    String fullname,role;
    JPanel lalagyanan;
    Buttons userButton;
    JFrame out;
    static int user_id;
    
    public ManagerButtons(int user_id,JFrame out,String fullname,String role,JPanel lalagyanan) throws SQLException {
        initComponents();
        this.out=out;
        this.lalagyanan=lalagyanan;
        this.user_id=user_id;
         jComboBox1.setModel(new ImageTextRenderer().pop(user_id));
        jComboBox1.setRenderer(new ImageTextRenderer());
        jComboBox1.setBackground(new Color(25,20,255));
        jComboBox1.setOpaque(false);
        userButton = new Buttons(lalagyanan);
        new ContainerManipulator(lalagyanan,new Views.Panels.Home());
        user_fullname.setText(fullname);
        userrole.setText(role);
        new VideoFeeder().start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StaffButtons = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        hov2 = new javax.swing.JPanel();
        rooms = new javax.swing.JLabel();
        hov3 = new javax.swing.JPanel();
        checkIn = new javax.swing.JLabel();
        hov1 = new javax.swing.JPanel();
        checkOut = new javax.swing.JLabel();
        hov4 = new javax.swing.JPanel();
        customers = new javax.swing.JLabel();
        logout = new jroundborder.JLabelRound();
        jLabelRound5 = new jroundborder.JLabelRound();
        jLabelRound6 = new jroundborder.JLabelRound();
        user_fullname = new javax.swing.JLabel();
        userrole = new javax.swing.JLabel();
        hov10 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();

        StaffButtons.setBackground(new java.awt.Color(83, 140, 198));
        StaffButtons.setPreferredSize(new java.awt.Dimension(1480, 894));
        StaffButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/hotelmanagement.gif"))); // NOI18N
        StaffButtons.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 10, 563, -1));

        hov2.setBackground(new java.awt.Color(83, 140, 198));
        hov2.setPreferredSize(new java.awt.Dimension(230, 40));

        rooms.setBackground(new java.awt.Color(51, 51, 255));
        rooms.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/room2.png"))); // NOI18N
        rooms.setText("ROOMS");
        rooms.setIconTextGap(10);
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

        javax.swing.GroupLayout hov2Layout = new javax.swing.GroupLayout(hov2);
        hov2.setLayout(hov2Layout);
        hov2Layout.setHorizontalGroup(
            hov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        hov2Layout.setVerticalGroup(
            hov2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        StaffButtons.add(hov2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 150, 50));

        hov3.setBackground(new java.awt.Color(83, 140, 198));
        hov3.setPreferredSize(new java.awt.Dimension(230, 40));

        checkIn.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        checkIn.setForeground(new java.awt.Color(255, 255, 255));
        checkIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkin2.jpg"))); // NOI18N
        checkIn.setText("CHECK IN");
        checkIn.setIconTextGap(5);
        checkIn.setPreferredSize(new java.awt.Dimension(136, 40));
        checkIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkInMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkInMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkInMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov3Layout = new javax.swing.GroupLayout(hov3);
        hov3.setLayout(hov3Layout);
        hov3Layout.setHorizontalGroup(
            hov3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkIn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        hov3Layout.setVerticalGroup(
            hov3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StaffButtons.add(hov3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, 50));

        hov1.setBackground(new java.awt.Color(83, 140, 198));
        hov1.setPreferredSize(new java.awt.Dimension(230, 40));

        checkOut.setBackground(new java.awt.Color(83, 140, 198));
        checkOut.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        checkOut.setForeground(new java.awt.Color(255, 255, 255));
        checkOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkout.png"))); // NOI18N
        checkOut.setText("CHECK OUT");
        checkOut.setIconTextGap(10);
        checkOut.setPreferredSize(new java.awt.Dimension(136, 40));
        checkOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkOutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov1Layout = new javax.swing.GroupLayout(hov1);
        hov1.setLayout(hov1Layout);
        hov1Layout.setHorizontalGroup(
            hov1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkOut, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        hov1Layout.setVerticalGroup(
            hov1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(checkOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StaffButtons.add(hov1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, -1, 50));

        hov4.setBackground(new java.awt.Color(83, 140, 198));

        customers.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 255));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cus2.jpg"))); // NOI18N
        customers.setText("CUSTOMERS");
        customers.setIconTextGap(10);
        customers.setPreferredSize(new java.awt.Dimension(136, 40));
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
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        hov4Layout.setVerticalGroup(
            hov4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StaffButtons.add(hov4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 90, -1, 54));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.gif"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        StaffButtons.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 41, 39));

        jLabelRound5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unlock.gif"))); // NOI18N
        jLabelRound5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound5MouseClicked(evt);
            }
        });
        StaffButtons.add(jLabelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 40, 39));

        jLabelRound6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/gearmoto.gif"))); // NOI18N
        jLabelRound6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound6MouseClicked(evt);
            }
        });
        StaffButtons.add(jLabelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 40, 39));

        user_fullname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user_fullname.setForeground(new java.awt.Color(255, 255, 255));
        StaffButtons.add(user_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 39));

        userrole.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        userrole.setForeground(new java.awt.Color(255, 255, 255));
        StaffButtons.add(userrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, 27));

        hov10.setBackground(new java.awt.Color(83, 140, 198));
        hov10.setPreferredSize(new java.awt.Dimension(230, 40));

        home.setBackground(new java.awt.Color(51, 51, 255));
        home.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home2.png"))); // NOI18N
        home.setText("HOME");
        home.setIconTextGap(10);
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

        javax.swing.GroupLayout hov10Layout = new javax.swing.GroupLayout(hov10);
        hov10.setLayout(hov10Layout);
        hov10Layout.setHorizontalGroup(
            hov10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
        );
        hov10Layout.setVerticalGroup(
            hov10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        StaffButtons.add(hov10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, 50));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(40, 40));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        StaffButtons.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, 240, 50));

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StaffButtons.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 30));

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StaffButtons.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StaffButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(StaffButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        userButton.roomButton(rooms,userrole.getText());
    }//GEN-LAST:event_roomsMouseClicked

    private void roomsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseEntered
        userButton.setC(hov2);
    }//GEN-LAST:event_roomsMouseEntered

    private void roomsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseExited
        userButton.resetC(hov2);
    }//GEN-LAST:event_roomsMouseExited

    private void checkInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInMouseClicked
        userButton.checkIn();
    }//GEN-LAST:event_checkInMouseClicked

    private void checkInMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInMouseEntered
        userButton.setC(hov3);
    }//GEN-LAST:event_checkInMouseEntered

    private void checkInMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkInMouseExited
        userButton.resetC(hov3);
    }//GEN-LAST:event_checkInMouseExited

    private void checkOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutMouseClicked
        userButton.checkoutButton(checkOut);
    }//GEN-LAST:event_checkOutMouseClicked

    private void checkOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutMouseEntered
        userButton.setC(hov1);
    }//GEN-LAST:event_checkOutMouseEntered

    private void checkOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkOutMouseExited
        userButton.resetC(hov1);
    }//GEN-LAST:event_checkOutMouseExited

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        userButton.costumerButton(customers);
    }//GEN-LAST:event_customersMouseClicked

    private void customersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseEntered
        userButton.setC(hov4);
    }//GEN-LAST:event_customersMouseEntered

    private void customersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseExited
        userButton.resetC(hov4);
    }//GEN-LAST:event_customersMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        signOut(out);
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabelRound5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound5MouseClicked
        //        if (rooms.isEnabled()) {
            //            rooms.setEnabled(false);
            //            checkIn.setEnabled(false);
            //            checkOut.setEnabled(false);
            //            customers.setEnabled(false);
            //            hov1.setEnabled(false);
            //            hov2.setEnabled(false);
            //            hov3.setEnabled(false);
            //            hov4.setEnabled(false);
            //        }else{
            //            rooms.setEnabled(true);
            //            checkIn.setEnabled(true);
            //            checkOut.setEnabled(true);
            //            customers.setEnabled(true);
            //            hov1.setEnabled(true);
            //            hov2.setEnabled(true);
            //            hov3.setEnabled(true);
            //            hov4.setEnabled(true);
            //        }
    }//GEN-LAST:event_jLabelRound5MouseClicked

    private void jLabelRound6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound6MouseClicked

    }//GEN-LAST:event_jLabelRound6MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        userButton.homeButton(home);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        userButton.setC(hov10);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        userButton.resetC(hov10);
    }//GEN-LAST:event_homeMouseExited

    public void signOut(JFrame out){
        int result = JOptionPane.showConfirmDialog(out,"Are You Sure That You Want To Sign Out", "LogOut",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (result==0){
            new Login().setVisible(true);
            out.dispose();
        }
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        DefaultComboBoxModel model = (DefaultComboBoxModel)jComboBox1.getModel();
        int vin = model.getSize();
        for (int i = 0; i < vin; i++) {
            if (i==jComboBox1.getSelectedIndex()) {
                String name = ((ImagesNText)jComboBox1.getSelectedItem()).getname();
                if (i==0) {
                    try {
                        //                    JOptionPane.showMessageDialog(out,new ProfileSettings());
                        new ProfileSettings(user_id,out).setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(ManagerButtons.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (i==1){
                    signOut(out);
                }else{
                    JOptionPane.showMessageDialog(out,"asdasdasd");
                }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

     class VideoFeeder extends Thread {
    
          public void run(){
          
                while(true){
                    Calendar cal = Calendar.getInstance();

                    int hour = cal.get(Calendar.HOUR_OF_DAY);
                    int minute = cal.get(Calendar.MINUTE);
                    int second = cal.get(Calendar.SECOND);

                    SimpleDateFormat kev = new SimpleDateFormat("hh:mm:ss aa");
                    Date dat = cal.getTime();
                    String times = kev.format(dat);
                    
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
                    String strDate = dateFormat.format(dat);
                    
                    date.setText(strDate);
                    time.setText(times);
                }
          
          }
    
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel StaffButtons;
    private javax.swing.JLabel checkIn;
    private javax.swing.JLabel checkOut;
    private javax.swing.JLabel customers;
    private javax.swing.JLabel date;
    private javax.swing.JLabel home;
    private javax.swing.JPanel hov1;
    private javax.swing.JPanel hov10;
    private javax.swing.JPanel hov2;
    private javax.swing.JPanel hov3;
    private javax.swing.JPanel hov4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel7;
    private jroundborder.JLabelRound jLabelRound5;
    private jroundborder.JLabelRound jLabelRound6;
    private jroundborder.JLabelRound logout;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel time;
    private javax.swing.JLabel user_fullname;
    private javax.swing.JLabel userrole;
    // End of variables declaration//GEN-END:variables
}
