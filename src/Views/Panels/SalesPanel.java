/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.SQL;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salesDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salesAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Userid = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 77, 77));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        salesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sales Date", "Amount", "User-id"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 1160, 690));

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(191, 191, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SALES ACTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 310, 54));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 80, 80, 41));

        ID.setBackground(new java.awt.Color(0, 77, 77));
        ID.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(255, 255, 255));
        ID.setBorder(null);
        ID.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sale Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 41));

        salesDate.setBackground(new java.awt.Color(0, 77, 77));
        salesDate.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        salesDate.setForeground(new java.awt.Color(255, 255, 255));
        salesDate.setBorder(null);
        jPanel1.add(salesDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 200, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 41));

        salesAmount.setBackground(new java.awt.Color(0, 77, 77));
        salesAmount.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        salesAmount.setForeground(new java.awt.Color(255, 255, 255));
        salesAmount.setBorder(null);
        jPanel1.add(salesAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("User-id");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 73, 41));

        Userid.setBackground(new java.awt.Color(0, 77, 77));
        Userid.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Userid.setForeground(new java.awt.Color(255, 255, 255));
        Userid.setBorder(null);
        jPanel1.add(Userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 200, 30));

        save.setBackground(new java.awt.Color(51, 102, 255));
        save.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 126, 50));

        delete.setBackground(new java.awt.Color(51, 102, 255));
        delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete.setText("DELETE");
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 126, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 200, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 200, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 200, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 200, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 310, 690));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sales");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
   //     customers = new Customers(0,salesID.getText(),salesDate.getText(),salesAmount.getText(),cusAddress.getText(),cusContact.getText());
     //   try {
       //     createCustomer(customers);
        //} catch (SQLException ex) {
            //            Logger.getLogger(CustomerActions.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String[] args) throws SQLException {
        JOptionPane.showMessageDialog(null,new SalesPanel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Userid;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField salesAmount;
    private javax.swing.JTextField salesDate;
    private javax.swing.JTable salesTable;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
