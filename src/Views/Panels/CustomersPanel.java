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
import javax.swing.table.DefaultTableModel;

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
        custo.showCustomers(jTable1);
        roomControll.showRooms(rooms);
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cusFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusMname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cusLname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cusAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cusContact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jtxcussearch = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 77, 77));
        setMinimumSize(new java.awt.Dimension(1480, 790));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customers");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 33, 470, 60));

        jTable1.setBackground(new java.awt.Color(191, 191, 191));
        jTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 130, 1120, 660));

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

        cusFname.setBackground(new java.awt.Color(0, 77, 77));
        cusFname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cusFname.setForeground(new java.awt.Color(255, 255, 255));
        cusFname.setBorder(null);
        cusFname.setCaretColor(new java.awt.Color(255, 255, 255));
        cusFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusFnameKeyTyped(evt);
            }
        });
        jPanel1.add(cusFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 200, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("M.I :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 171, 60, 50));

        cusMname.setBackground(new java.awt.Color(0, 77, 77));
        cusMname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cusMname.setForeground(new java.awt.Color(255, 255, 255));
        cusMname.setBorder(null);
        cusMname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusMnameActionPerformed(evt);
            }
        });
        cusMname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusMnameKeyTyped(evt);
            }
        });
        jPanel1.add(cusMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 200, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 231, 100, 50));

        cusLname.setBackground(new java.awt.Color(0, 77, 77));
        cusLname.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cusLname.setForeground(new java.awt.Color(255, 255, 255));
        cusLname.setBorder(null);
        cusLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusLnameKeyTyped(evt);
            }
        });
        jPanel1.add(cusLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 200, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 291, 80, 50));

        cusAddress.setBackground(new java.awt.Color(0, 77, 77));
        cusAddress.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cusAddress.setForeground(new java.awt.Color(255, 255, 255));
        cusAddress.setBorder(null);
        cusAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusAddressActionPerformed(evt);
            }
        });
        cusAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusAddressKeyTyped(evt);
            }
        });
        jPanel1.add(cusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 200, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact # :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 361, 90, 30));

        cusContact.setBackground(new java.awt.Color(0, 77, 77));
        cusContact.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cusContact.setForeground(new java.awt.Color(255, 255, 255));
        cusContact.setBorder(null);
        cusContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cusContactKeyTyped(evt);
            }
        });
        jPanel1.add(cusContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 200, 30));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ROOMS :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 73, 36));

        rooms.setBackground(new java.awt.Color(0, 77, 77));
        rooms.setForeground(new java.awt.Color(255, 255, 255));
        rooms.setBorder(null);
        rooms.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 190, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 200, -1));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, 10));

        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 198, 255), 5, true));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 340, 580));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 360, 690));

        save.setBackground(new java.awt.Color(51, 102, 255));
        save.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 126, 50));

        delete.setBackground(new java.awt.Color(51, 102, 255));
        delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete.setText("DELETE");
        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 126, 50));

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jButton1.setText("Generate QR");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 130, 50));
        add(jtxcussearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

    }//GEN-LAST:event_saveActionPerformed

    private void cusFnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusFnameKeyTyped
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
    }//GEN-LAST:event_cusFnameKeyTyped

    private void cusMnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusMnameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_cusMnameKeyTyped

    private void cusLnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusLnameKeyTyped
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
    }//GEN-LAST:event_cusLnameKeyTyped

    private void cusAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusAddressKeyTyped
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
    }//GEN-LAST:event_cusAddressKeyTyped

    private void cusContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cusContactKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_cusContactKeyTyped

    private void cusMnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusMnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusMnameActionPerformed

    private void cusAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusAddressActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusAddress;
    private javax.swing.JTextField cusContact;
    private javax.swing.JTextField cusFname;
    private javax.swing.JTextField cusLname;
    private javax.swing.JTextField cusMname;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtxcussearch;
    private javax.swing.JComboBox<String> rooms;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
