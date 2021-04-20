/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.SQL;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class SalesPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPanel
     */
    public SalesPanel() throws SQLException {
        initComponents();
        showSales();
    }
    
    public void showSales() throws SQLException{
          SQL sql = new SQL();
         Connection con = sql.getConnection();
        String tanong = "SELECT * FROM inventories";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        DefaultTableModel model = (DefaultTableModel)salesTable.getModel();
         Object[] row = new Object[5];
      while(rs.next()){
            row[0] = rs.getInt("id");
            row[1] = rs.getString("sales_date");
            row[2] = rs.getInt("amount");
            row[3] = rs.getInt("user_id");
            model.addRow(row);
      }
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
        salesTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sales Date", "Amount", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(salesTable);
        if (salesTable.getColumnModel().getColumnCount() > 0) {
            salesTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 850, 370));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            salesTable.print();
        } catch (PrinterException ex) {
            Logger.getLogger(SalesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String[] args) throws SQLException {
        JOptionPane.showMessageDialog(null,new SalesPanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable salesTable;
    // End of variables declaration//GEN-END:variables
}
