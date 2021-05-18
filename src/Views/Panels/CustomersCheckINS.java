/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.CheckinAndOutController;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CustomersCheckINS extends javax.swing.JPanel {

    /**
     * Creates new form CustomersCheckINS
     */
    
    CheckinAndOutController checkinout_controll = new CheckinAndOutController();
    JPanel lalagyanan;
    public CustomersCheckINS(JPanel lalagyanan) throws SQLException {
        initComponents();
        this.lalagyanan=lalagyanan;
        checkinout_controll.showCustomersCheckin(jtbl_customercheckins);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_customercheckins = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 77, 77));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtbl_customercheckins.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Customer Name", "Room", "Checkin Date", "CheckIn Time", "CheckOut Date", "CheckOut Time", "Hours", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_customercheckins.setRowHeight(20);
        jtbl_customercheckins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_customercheckinsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbl_customercheckins);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1460, 650));

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHECK-IN CUSTOMERS DETAIL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 870, 90));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 130));
    }// </editor-fold>//GEN-END:initComponents

    private void jtbl_customercheckinsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_customercheckinsMouseClicked
          int id = (int) jtbl_customercheckins.getValueAt(jtbl_customercheckins.getSelectedRow(), 0);
//        JOptionPane.showMessageDialog(null,id);
        new Chooser(lalagyanan,id).setVisible(true);
    }//GEN-LAST:event_jtbl_customercheckinsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbl_customercheckins;
    // End of variables declaration//GEN-END:variables
}
