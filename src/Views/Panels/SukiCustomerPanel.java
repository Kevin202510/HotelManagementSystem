/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.CustomerController;
import Models.SukiCustomers;
import Views.Dashboards.ContainerManipulator;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Maria Crystaline
 */
public class SukiCustomerPanel extends javax.swing.JPanel {

    /**
     * Creates new form SukiCustomerPanel
     */
    JPanel lalagyanan;
    CustomerController custo = new CustomerController();
    ArrayList<Models.SukiCustomers> sukiCustomerList = custo.custSukiList();
    SukiCustomers sukicustomers;
    
    public SukiCustomerPanel(JPanel lalagyanan) throws SQLException {
        initComponents();
        hideCompt();
        initRun();
        this.lalagyanan=lalagyanan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void hideCompt(){
        jtxt_SukiName.setVisible(false);
    }
    private void initRun() throws SQLException{
        jbtn_sudelete1.setVisible(false);
        jcbo_customername.setBackground(new Color(0, 0, 0, 0));
        jcbo_customername.setOpaque(false);
        custo.showSukiCustomer(jtbl_suki);
        custo.showCustomer(jcbo_customername);
        jtxt_sukisearch.requestFocusInWindow();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxt_sukisearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtxt_SukiCode = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_SukiName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jtxt_SukiPoints = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jbtn_susave = new javax.swing.JButton();
        jbtn_sureset = new javax.swing.JButton();
        jbtn_sudelete1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jcbo_customername = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_suki = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 77, 77));
        setMinimumSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CUSTOMER SUKI");

        jtxt_sukisearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_sukisearchKeyPressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search..png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(513, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_sukisearch, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxt_sukisearch)))
                .addGap(19, 19, 19))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 120));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxt_SukiCode.setEditable(false);
        jtxt_SukiCode.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_SukiCode.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_SukiCode.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_SukiCode.setBorder(null);
        jtxt_SukiCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_SukiCodeActionPerformed(evt);
            }
        });
        jtxt_SukiCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_SukiCodeKeyTyped(evt);
            }
        });
        jPanel2.add(jtxt_SukiCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 210, 30));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 210, 10));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUKI");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 40, 20));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CUSTOMERS");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jtxt_SukiName.setEditable(false);
        jtxt_SukiName.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_SukiName.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_SukiName.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_SukiName.setBorder(null);
        jtxt_SukiName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_SukiNameKeyTyped(evt);
            }
        });
        jPanel2.add(jtxt_SukiName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 40));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 210, 5));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("POINTS :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 20));

        jtxt_SukiPoints.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_SukiPoints.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_SukiPoints.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_SukiPoints.setBorder(null);
        jtxt_SukiPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxt_SukiPointsKeyTyped(evt);
            }
        });
        jPanel2.add(jtxt_SukiPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 80, 30));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 80, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 191, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUKI ACTION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 250, 38));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CODE:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NAME  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 60, 20));

        jbtn_susave.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_susave.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_susave.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_susave.setText("SAVE");
        jbtn_susave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_susaveActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_susave, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 110, 40));

        jbtn_sureset.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_sureset.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_sureset.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_sureset.setText("RESET");
        jbtn_sureset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_suresetActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_sureset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 110, 40));

        jbtn_sudelete1.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_sudelete1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_sudelete1.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_sudelete1.setText("DELETE");
        jbtn_sudelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_sudelete1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtn_sudelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 560, 110, 40));

        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 198, 255), 5, true));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 320, 510));

        jcbo_customername.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbo_customername.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jcbo_customername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 210, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, 670));

        jtbl_suki.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUKI CODE", "CUSTOMERS NAME", "POINTS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_suki.setRowHeight(20);
        jtbl_suki.getTableHeader().setReorderingAllowed(false);
        jtbl_suki.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_sukiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_suki);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 1130, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_SukiCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_SukiCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_SukiCodeActionPerformed

    private void jtxt_SukiCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_SukiCodeKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
            (c == KeyEvent.VK_PERIOD) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }

    }//GEN-LAST:event_jtxt_SukiCodeKeyTyped

    private void jtxt_SukiPointsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_SukiPointsKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')||
            (c == KeyEvent.VK_PERIOD) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jtxt_SukiPointsKeyTyped

    private void jbtn_susaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_susaveActionPerformed
        int custoid = jcbo_customername.getSelectedIndex()+1;
        String sukicode = jtxt_SukiCode.getText();
        double points = Double.parseDouble(jtxt_SukiPoints.getText());
        
        sukicustomers = new SukiCustomers(0,custoid,sukicode,points);
        try {
            boolean test = custo.addNewSuki(sukicustomers, jtbl_suki);
            if (test) {
                new ContainerManipulator(lalagyanan,new Views.Panels.SukiCustomerPanel(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SukiCustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_susaveActionPerformed

    private void jtxt_SukiNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_SukiNameKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
            (c == KeyEvent.VK_PERIOD) ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_jtxt_SukiNameKeyTyped

    private void jtxt_sukisearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_sukisearchKeyPressed
        if (evt.getKeyCode()==10) {
            try {
                boolean hey = custo.selectCustomerSuki(jtxt_sukisearch.getText(),jtxt_SukiCode,jtxt_SukiPoints);
//                if (hey==false) {
//                    custo.showCustomer(jcbo_customername);
//                }
            } catch (SQLException ex) {
                Logger.getLogger(SukiCustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtxt_sukisearchKeyPressed

    private void jtbl_sukiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_sukiMouseClicked
       jcbo_customername.setVisible(false);
       jtxt_SukiName.setVisible(true);
       jbtn_susave.setVisible(false);
       jbtn_sureset.setVisible(true);
       jtxt_SukiCode.setText((String) jtbl_suki.getValueAt(jtbl_suki.getSelectedRow(),0));
       jtxt_SukiName.setText((String) jtbl_suki.getValueAt(jtbl_suki.getSelectedRow(),1));
       jtxt_SukiPoints.setText(String.valueOf(jtbl_suki.getValueAt(jtbl_suki.getSelectedRow(),2)));
    }//GEN-LAST:event_jtbl_sukiMouseClicked

    private void jbtn_sudelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_sudelete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_sudelete1ActionPerformed

    private void jbtn_suresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_suresetActionPerformed
        String sukicode = jtxt_SukiCode.getText();
        boolean checksuki = custo.updateSukiPoints(sukicode,jtbl_suki);
        if (checksuki) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.SukiCustomerPanel(lalagyanan));
            } catch (SQLException ex) {
                Logger.getLogger(SukiCustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtn_suresetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtn_sudelete1;
    private javax.swing.JButton jbtn_sureset;
    private javax.swing.JButton jbtn_susave;
    private javax.swing.JComboBox<String> jcbo_customername;
    private javax.swing.JTable jtbl_suki;
    private javax.swing.JTextField jtxt_SukiCode;
    private javax.swing.JTextField jtxt_SukiName;
    private javax.swing.JTextField jtxt_SukiPoints;
    private javax.swing.JTextField jtxt_sukisearch;
    // End of variables declaration//GEN-END:variables
}
