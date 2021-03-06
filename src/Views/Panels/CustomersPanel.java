/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;
import Controllers.CustomerController;
import Controllers.RoomController;
import Models.Customers;
import Controllers.SQL;
import Views.Dashboards.ContainerManipulator;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
        public class CustomersPanel extends javax.swing.JPanel {
        public RoomController roomControll = new RoomController();  
        public CustomerController custo = new CustomerController();
        public  SQL sql = new SQL();
        public Customers customers;
        public JPanel lalag;
        
    public CustomersPanel(JPanel lalag) throws SQLException{
        initComponents();
        custo.showCustomers(jtbl_custable);
        roomControll.showRooms(jcbo_rooms);
        this.lalag=lalag;
    }

/**
     * Creates new form Customers
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_custable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_cusFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxt_cusMname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxt_cusLname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxt_cusAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxt_cusContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbo_rooms = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jbtn_GnrateQR = new javax.swing.JButton();
        jtxt_cussearch = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 77, 77));
        setMinimumSize(new java.awt.Dimension(1480, 790));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customers");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 33, 470, 60));

        jtbl_custable.setBackground(new java.awt.Color(191, 191, 191));
        jtbl_custable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtbl_custable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "Address", "Contact #"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_custable.setRowHeight(30);
        jScrollPane1.setViewportView(jtbl_custable);
        if (jtbl_custable.getColumnModel().getColumnCount() > 0) {
            jtbl_custable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 130, 1110, 650));

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMERS ACTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 111, 90, 50));

        jtxt_cusFname.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_cusFname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_cusFname.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_cusFname.setBorder(null);
        jtxt_cusFname.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxt_cusFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_cusFnameKeyTyped(evt);
            }
        });
        jPanel1.add(jtxt_cusFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("M.I :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 171, 60, 50));

        jtxt_cusMname.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_cusMname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_cusMname.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_cusMname.setBorder(null);
        jtxt_cusMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cusMnameActionPerformed(evt);
            }
        });
        jtxt_cusMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_cusMnameKeyTyped(evt);
            }
        });
        jPanel1.add(jtxt_cusMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 231, 100, 50));

        jtxt_cusLname.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_cusLname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_cusLname.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_cusLname.setBorder(null);
        jtxt_cusLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_cusLnameKeyTyped(evt);
            }
        });
        jPanel1.add(jtxt_cusLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 291, 80, 50));

        jtxt_cusAddress.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_cusAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_cusAddress.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_cusAddress.setBorder(null);
        jtxt_cusAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_cusAddressActionPerformed(evt);
            }
        });
        jtxt_cusAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_cusAddressKeyTyped(evt);
            }
        });
        jPanel1.add(jtxt_cusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact # :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 361, 90, 30));

        jtxt_cusContact.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_cusContact.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_cusContact.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_cusContact.setBorder(null);
        jtxt_cusContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_cusContactKeyTyped(evt);
            }
        });
        jPanel1.add(jtxt_cusContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ROOMS :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 73, 36));

        jcbo_rooms.setBackground(new java.awt.Color(0, 77, 77));
        jcbo_rooms.setForeground(new java.awt.Color(255, 255, 255));
        jcbo_rooms.setBorder(null);
        jcbo_rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jcbo_rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 190, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, 10));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 198, 255), 5, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 580));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 670));

        jbtn_GnrateQR.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_GnrateQR.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jbtn_GnrateQR.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_GnrateQR.setText("Generate QR");
        jbtn_GnrateQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_GnrateQRActionPerformed(evt);
            }
        });
        add(jbtn_GnrateQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 130, 50));

        jtxt_cussearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_cussearchKeyPressed(evt);
            }
        });
        add(jtxt_cussearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 80, 210, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search..png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_cusFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cusFnameKeyTyped
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
    }//GEN-LAST:event_jtxt_cusFnameKeyTyped

    private void jtxt_cusMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cusMnameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxt_cusMnameKeyTyped

    private void jtxt_cusLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cusLnameKeyTyped
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
    }//GEN-LAST:event_jtxt_cusLnameKeyTyped

    private void jtxt_cusAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cusAddressKeyTyped
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
    }//GEN-LAST:event_jtxt_cusAddressKeyTyped

    private void jtxt_cusContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cusContactKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_jtxt_cusContactKeyTyped

    private void jtxt_cusMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cusMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cusMnameActionPerformed

    private void jtxt_cusAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_cusAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_cusAddressActionPerformed

    
    private void jtxt_cussearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_cussearchKeyPressed
        //joSEARCH 
        
            DefaultTableModel model = (DefaultTableModel)jtbl_custable.getModel();
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        jtbl_custable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_cussearch.getText().trim()));
           
    }//GEN-LAST:event_jtxt_cussearchKeyPressed

    private void jbtn_GnrateQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_GnrateQRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_GnrateQRActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton jbtn_GnrateQR;
    private javax.swing.JComboBox<String> jcbo_rooms;
    private javax.swing.JTable jtbl_custable;
    private javax.swing.JTextField jtxt_cusAddress;
    private javax.swing.JTextField jtxt_cusContact;
    private javax.swing.JTextField jtxt_cusFname;
    private javax.swing.JTextField jtxt_cusLname;
    private javax.swing.JTextField jtxt_cusMname;
    private javax.swing.JTextField jtxt_cussearch;
    // End of variables declaration//GEN-END:variables
}
