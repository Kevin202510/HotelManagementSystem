/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Dashboards;

import Controllers.Buttons;
import Controllers.CheckinAndOutController;
import Controllers.ImagesNText;
import Controllers.ImageTextRenderer;
import Controllers.SQL;
import Views.Authentication.Login;
import Views.Panels.ProfileSettings;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import sweetalerts.Alerts;

/**
 *
 * @author CALUAG FAMILY
 */
public class AdminButtons extends javax.swing.JPanel {

    /**
     * Creates new form AdminButtons
     */
    public static String fullname,role;
    JPanel lalagyanan;
    Buttons userButton;
    JFrame out;
    static int user_id;
//    CheckinAndOutController checks = new CheckinAndOutController();
    
//    ImagesNText vk = new ImagesNText();
    
    public AdminButtons(int user_id,JFrame out,String fullname,String role,JPanel lalagyanan) throws SQLException {
        initComponents();
        this.fullname=fullname;
        jComboBox1.setModel(new ImageTextRenderer().pop(user_id));
        jComboBox1.setRenderer(new ImageTextRenderer());
        this.out=out;
        this.user_id=user_id;
        this.lalagyanan=lalagyanan;
        userButton = new Buttons(lalagyanan,user_id);
        new ContainerManipulator(lalagyanan,new Views.Panels.Home());
        user_fullname.setText(fullname);
        userrole.setText(role);
        userrole.setForeground(Color.decode("#0039e6"));
        jComboBox1.setBackground(new Color(0, 0, 0, 0));
        jComboBox1.setOpaque(false);
        new VideoFeeder().start();
//        checkCustomerCheckOut();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminButtons = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelRound3 = new jroundborder.JLabelRound();
        user_fullname = new javax.swing.JLabel();
        userrole = new javax.swing.JLabel();
        hov5 = new javax.swing.JPanel();
        sales = new javax.swing.JLabel();
        hov6 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        hov7 = new javax.swing.JPanel();
        users = new javax.swing.JLabel();
        hov8 = new javax.swing.JPanel();
        rooms = new javax.swing.JLabel();
        hov9 = new javax.swing.JPanel();
        customers = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        hov10 = new javax.swing.JPanel();
        rate_rt_bed = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1480, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminButtons.setBackground(new java.awt.Color(83, 140, 198));
        AdminButtons.setPreferredSize(new java.awt.Dimension(1480, 894));
        AdminButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1 (2).gif"))); // NOI18N
        AdminButtons.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 10, 550, -1));

        jLabelRound3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unlock.gif"))); // NOI18N
        jLabelRound3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRound3MouseClicked(evt);
            }
        });
        AdminButtons.add(jLabelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 40, 39));

        user_fullname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        user_fullname.setForeground(new java.awt.Color(255, 255, 255));
        AdminButtons.add(user_fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 39));

        userrole.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        userrole.setForeground(new java.awt.Color(255, 255, 255));
        AdminButtons.add(userrole, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, 27));

        hov5.setBackground(new java.awt.Color(83, 140, 198));
        hov5.setPreferredSize(new java.awt.Dimension(230, 40));

        sales.setBackground(new java.awt.Color(51, 51, 255));
        sales.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        sales.setForeground(new java.awt.Color(255, 255, 255));
        sales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sales.png"))); // NOI18N
        sales.setText("SALES");
        sales.setIconTextGap(10);
        sales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov5Layout = new javax.swing.GroupLayout(hov5);
        hov5.setLayout(hov5Layout);
        hov5Layout.setHorizontalGroup(
            hov5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov5Layout.setVerticalGroup(
            hov5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AdminButtons.add(hov5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 150, 50));

        hov6.setBackground(new java.awt.Color(83, 140, 198));
        hov6.setPreferredSize(new java.awt.Dimension(230, 40));

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

        javax.swing.GroupLayout hov6Layout = new javax.swing.GroupLayout(hov6);
        hov6.setLayout(hov6Layout);
        hov6Layout.setHorizontalGroup(
            hov6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        hov6Layout.setVerticalGroup(
            hov6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        AdminButtons.add(hov6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 150, 50));

        hov7.setBackground(new java.awt.Color(83, 140, 198));
        hov7.setPreferredSize(new java.awt.Dimension(230, 40));

        users.setBackground(new java.awt.Color(51, 51, 255));
        users.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        users.setForeground(new java.awt.Color(255, 255, 255));
        users.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user3.png"))); // NOI18N
        users.setText("USERS");
        users.setIconTextGap(10);
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

        javax.swing.GroupLayout hov7Layout = new javax.swing.GroupLayout(hov7);
        hov7.setLayout(hov7Layout);
        hov7Layout.setHorizontalGroup(
            hov7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hov7Layout.setVerticalGroup(
            hov7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AdminButtons.add(hov7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 150, 50));

        hov8.setBackground(new java.awt.Color(83, 140, 198));
        hov8.setPreferredSize(new java.awt.Dimension(230, 40));

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

        javax.swing.GroupLayout hov8Layout = new javax.swing.GroupLayout(hov8);
        hov8.setLayout(hov8Layout);
        hov8Layout.setHorizontalGroup(
            hov8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        hov8Layout.setVerticalGroup(
            hov8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rooms, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        AdminButtons.add(hov8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 150, 50));

        hov9.setBackground(new java.awt.Color(83, 140, 198));
        hov9.setPreferredSize(new java.awt.Dimension(230, 40));

        customers.setBackground(new java.awt.Color(51, 51, 255));
        customers.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 255));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cus2.jpg"))); // NOI18N
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

        javax.swing.GroupLayout hov9Layout = new javax.swing.GroupLayout(hov9);
        hov9.setLayout(hov9Layout);
        hov9Layout.setHorizontalGroup(
            hov9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        hov9Layout.setVerticalGroup(
            hov9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        AdminButtons.add(hov9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 190, 50));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(40, 40));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        AdminButtons.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 240, 50));

        hov10.setBackground(new java.awt.Color(83, 140, 198));
        hov10.setPreferredSize(new java.awt.Dimension(230, 40));

        rate_rt_bed.setBackground(new java.awt.Color(51, 51, 255));
        rate_rt_bed.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        rate_rt_bed.setForeground(new java.awt.Color(255, 255, 255));
        rate_rt_bed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rate_rt_bed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled.png"))); // NOI18N
        rate_rt_bed.setText("RATE-RT-BED");
        rate_rt_bed.setIconTextGap(10);
        rate_rt_bed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rate_rt_bedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                rate_rt_bedMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                rate_rt_bedMouseExited(evt);
            }
        });

        javax.swing.GroupLayout hov10Layout = new javax.swing.GroupLayout(hov10);
        hov10.setLayout(hov10Layout);
        hov10Layout.setHorizontalGroup(
            hov10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rate_rt_bed, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        hov10Layout.setVerticalGroup(
            hov10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rate_rt_bed, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        AdminButtons.add(hov10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 90, 210, 50));

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdminButtons.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 180, 30));

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AdminButtons.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, 30));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        AdminButtons.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 10, 50, 36));

        add(AdminButtons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));
    }// </editor-fold>//GEN-END:initComponents
    public void signOut(JFrame out){
            new Login().setVisible(true);
            out.dispose();
    }
    private void jLabelRound3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRound3MouseClicked
        userButton.checkButtons();
    }//GEN-LAST:event_jLabelRound3MouseClicked

    private void salesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseClicked
        userButton.saleButton(sales);
    }//GEN-LAST:event_salesMouseClicked

    private void salesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseEntered
        userButton.setC(hov5);
    }//GEN-LAST:event_salesMouseEntered

    private void salesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salesMouseExited
        userButton.resetC(hov5);
    }//GEN-LAST:event_salesMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        userButton.homeButton(home);
    }//GEN-LAST:event_homeMouseClicked

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
        userButton.setC(hov6);
    }//GEN-LAST:event_homeMouseEntered

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
        userButton.resetC(hov6);
    }//GEN-LAST:event_homeMouseExited

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
        userButton.userButton(users);
    }//GEN-LAST:event_usersMouseClicked

    private void usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseEntered
        userButton.setC(hov7);
    }//GEN-LAST:event_usersMouseEntered

    private void usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseExited
        userButton.resetC(hov7);
    }//GEN-LAST:event_usersMouseExited

    private void roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseClicked
        // TODO add your handling code here:
        userButton.roomButton(rooms,userrole.getText());
    }//GEN-LAST:event_roomsMouseClicked

    private void roomsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseEntered
        userButton.setC(hov8);
    }//GEN-LAST:event_roomsMouseEntered

    private void roomsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomsMouseExited
        userButton.resetC(hov8);
    }//GEN-LAST:event_roomsMouseExited

    private void customersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseClicked
        // TODO add your handling code here:
        userButton.costumerButton(customers);
    }//GEN-LAST:event_customersMouseClicked

    private void customersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseEntered
        userButton.setC(hov9);
    }//GEN-LAST:event_customersMouseEntered

    private void customersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersMouseExited
        userButton.resetC(hov9);
    }//GEN-LAST:event_customersMouseExited

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
                        Logger.getLogger(AdminButtons.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if (i==1){
                    int result = JOptionPane.showConfirmDialog(out,"You want to log out","LogOut",
                    JOptionPane.YES_NO_OPTION,
                   JOptionPane.QUESTION_MESSAGE);
                    if (result==0) {
                        signOut(out);
                    }
                }else{
                    JOptionPane.showMessageDialog(out,"asdasdasd");
                }
            }
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void rate_rt_bedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rate_rt_bedMouseClicked
       userButton.RRB_Button(rate_rt_bed);
    }//GEN-LAST:event_rate_rt_bedMouseClicked

    
    private void rate_rt_bedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rate_rt_bedMouseEntered
        userButton.setC(hov10);
    }//GEN-LAST:event_rate_rt_bedMouseEntered

    private void rate_rt_bedMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rate_rt_bedMouseExited
        userButton.resetC(hov10);
    }//GEN-LAST:event_rate_rt_bedMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        signOut(out);
    }//GEN-LAST:event_jLabel2MouseClicked

    public  SQL sql = new SQL();
    public Connection con = sql.getConnection();
    
    public void checkCustomerCheckOut(String timess) throws SQLException, InterruptedException{
            String checkOutCheck = "SELECT * FROM `checkinandout` LEFT JOIN customers ON customers.cust_id=checkinandout.cust_id LEFT JOIN rooms ON rooms.room_id=checkinandout.room_id";
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery(checkOutCheck);
                        
                        while(rs.next()){
                            String checkouttime = rs.getString("timeout");
                            if (timess.equals(checkouttime)) {
                            String checkoutnato = "Customer @ room " + " " + rs.getInt("room_id") + " " + "is time out";
                            new Alerts(checkoutnato).setVisible(true);
                            new VideoFeeder().sleep(3000);
                            }
                        }
         }
    
    class VideoFeeder extends Thread {
    
          public void run(){
              try {
                  
                  String ss = "00";
                  
                  while(true){
                      Calendar cal = Calendar.getInstance();
                      SimpleDateFormat kevs = new SimpleDateFormat("hh:mm:ss aa");
                      Date dat = cal.getTime();
                      String timess = kevs.format(dat);
//                      time.setText(timess);
                      checkCustomerCheckOut(timess);
                  }
              } catch (SQLException ex) {
                  Logger.getLogger(AdminButtons.class.getName()).log(Level.SEVERE, null, ex);
              } catch (InterruptedException ex) {
                  Logger.getLogger(AdminButtons.class.getName()).log(Level.SEVERE, null, ex);
              }
          
          }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminButtons;
    private javax.swing.JLabel customers;
    private javax.swing.JLabel date;
    private javax.swing.JLabel home;
    private javax.swing.JPanel hov10;
    private javax.swing.JPanel hov5;
    private javax.swing.JPanel hov6;
    private javax.swing.JPanel hov7;
    private javax.swing.JPanel hov8;
    private javax.swing.JPanel hov9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private jroundborder.JLabelRound jLabelRound3;
    private javax.swing.JLabel rate_rt_bed;
    private javax.swing.JLabel rooms;
    private javax.swing.JLabel sales;
    private javax.swing.JLabel time;
    private javax.swing.JLabel user_fullname;
    private javax.swing.JLabel userrole;
    private javax.swing.JLabel users;
    // End of variables declaration//GEN-END:variables

    
}
