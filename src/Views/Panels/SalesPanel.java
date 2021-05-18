/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import Controllers.CheckinAndOutController;
import Controllers.SQL;
import Controllers.SaleController;
import Models.Sales;
import Views.Dashboards.ContainerManipulator;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class SalesPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesPanel
     */
    public SaleController salesControll = new SaleController();
    SaleController sale_controll = new SaleController();
    JPanel lalagyanan;
    public SalesPanel(JPanel lalagyanan) throws SQLException {
        initComponents();
        this.lalagyanan=lalagyanan;
        salesControll.showSales(jtbl_sales);
        jpnl_salesreport.setVisible(false);
        jbtn_show.setVisible(false);
        jbtn_printsales.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnl_salesreport = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jlbl_salesdates = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jlbl_totalsale = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jlbl_totalsale1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlbl_totalsale2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbl_sales = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        Salesfr = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Salest = new com.toedter.calendar.JDateChooser();
        jbtn_show = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxt_sales_search = new javax.swing.JTextField();
        jbtn_Generatereport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtn_printsales = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 77, 77));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl_salesreport.setBackground(new java.awt.Color(204, 204, 204));
        jpnl_salesreport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jpnl_salesreport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SALES REPORT");
        jpnl_salesreport.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 280, 40));

        jlbl_salesdates.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlbl_salesdates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jpnl_salesreport.add(jlbl_salesdates, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 380, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HOTEL MANAGEMENT");
        jpnl_salesreport.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 310, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TOTAL SALES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 30));

        jlbl_totalsale.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbl_totalsale.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jlbl_totalsale, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 250, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TOTAL SALES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        jlbl_totalsale1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbl_totalsale1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jlbl_totalsale1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 250, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TOTAL SALES");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 170, 30));

        jlbl_totalsale2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jlbl_totalsale2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jlbl_totalsale2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 250, 30));

        jpnl_salesreport.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 510, 420));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 5)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("INNOVATECH");
        jpnl_salesreport.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 10));

        add(jpnl_salesreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 630, 640));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(300, 300));

        jtbl_sales.setBackground(new java.awt.Color(191, 191, 191));
        jtbl_sales.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtbl_sales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Sales Date", "Amount", "User-id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_sales.setRowHeight(20);
        jScrollPane1.setViewportView(jtbl_sales);
        if (jtbl_sales.getColumnModel().getColumnCount() > 0) {
            jtbl_sales.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 1120, 680));

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sales");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, -1));

        Salesfr.setBackground(new java.awt.Color(0, 77, 77));
        Salesfr.setDateFormatString("yyyy-MM-dd");
        Salesfr.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        Salesfr.setOpaque(false);
        add(Salesfr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 200, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sales To:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 80, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sales From:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 100, 20));

        Salest.setBackground(new java.awt.Color(0, 77, 77));
        Salest.setDateFormatString("yyyy-MM-dd");
        Salest.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 14)); // NOI18N
        Salest.setOpaque(false);
        add(Salest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 200, 30));

        jbtn_show.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_show.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        jbtn_show.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_show.setText("Show");
        jbtn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_showActionPerformed(evt);
            }
        });
        add(jbtn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 40));

        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(179, 198, 255), 5, true));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 330, 390));

        jtxt_sales_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_sales_searchKeyPressed(evt);
            }
        });
        add(jtxt_sales_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, 200, 30));

        jbtn_Generatereport.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_Generatereport.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_Generatereport.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_Generatereport.setText("Generate Report");
        jbtn_Generatereport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_GeneratereportActionPerformed(evt);
            }
        });
        add(jbtn_Generatereport, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 191, 191));
        jLabel3.setText("SALES ACTION");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search..png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 60, -1, -1));

        jbtn_printsales.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jbtn_printsales.setText("PRINT");
        jbtn_printsales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_printsalesActionPerformed(evt);
            }
        });
        add(jbtn_printsales, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_showActionPerformed
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        
        
        if (checkInputs()==true) {
              new Alerts("Date is required Please Insert A Value").setVisible(true);        
        
         }else{
        try {
            JOptionPane.showConfirmDialog(null, df.format(Salesfr.getDate()),"",JOptionPane.YES_NO_OPTION);
            JOptionPane.showConfirmDialog(null, df.format(Salest.getDate()),"",JOptionPane.YES_NO_OPTION);
            
            SQL sql = new SQL();
            Connection con = sql.getConnection();
            String benta ="SELECT SUM(amount) FROM inventories WHERE sales_date BETWEEN '"+df.format(Salesfr.getDate())+"' AND '"+df.format(Salest.getDate())+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(benta);
            while(rs.next()){
                jlbl_totalsale.setText(String.valueOf(rs.getInt("SUM(amount)")));
                jlbl_totalsale1.setText(String.valueOf(rs.getInt("SUM(amount)")));
                jlbl_totalsale2.setText(String.valueOf(rs.getInt("SUM(amount)")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jbtn_showActionPerformed

    private void jtxt_sales_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_sales_searchKeyPressed
        //SALES SEARCH
         DefaultTableModel model = (DefaultTableModel)jtbl_sales.getModel();
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        jtbl_sales.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_sales_search.getText().trim()));
           
    }//GEN-LAST:event_jtxt_sales_searchKeyPressed

    private void jbtn_GeneratereportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_GeneratereportActionPerformed
          if (checkInputs()==true) {
             new Alerts("Date is required Please Insert A Value").setVisible(true);        
         }else{
              jScrollPane1.setVisible(false);
            jpnl_salesreport.setVisible(true);
                DateFormat df = new SimpleDateFormat("MMM,dd,yyyy");
              try {
                  getSales();
              } catch (SQLException ex) {
                  Logger.getLogger(SalesPanel.class.getName()).log(Level.SEVERE, null, ex);
              }
               jlbl_salesdates.setText(df.format(Salesfr.getDate()).toString() + "   -   " + df.format(Salest.getDate()).toString());
               jbtn_Generatereport.setVisible(false);
               jbtn_printsales.setVisible(true);
          }
    }//GEN-LAST:event_jbtn_GeneratereportActionPerformed

    private void getSales() throws SQLException{
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         
         SQL sql = new SQL();
        Connection con = sql.getConnection();
        String benta ="SELECT SUM(amount) FROM inventories WHERE sales_date BETWEEN '"+df.format(Salesfr.getDate())+"' AND '"+df.format(Salest.getDate())+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(benta);
        while(rs.next()){
             jlbl_totalsale.setText(String.valueOf(rs.getInt("SUM(amount)")));
            jlbl_totalsale1.setText(String.valueOf(rs.getInt("SUM(amount)")));
            jlbl_totalsale2.setText(String.valueOf(rs.getInt("SUM(amount)")));
    }
    }
    private void jbtn_printsalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_printsalesActionPerformed
        boolean test = sale_controll.printReceipt(jpnl_salesreport);
        if (test) {
            try {
                new ContainerManipulator(lalagyanan,new Views.Panels.SalesPanel(lalagyanan));
            } catch (SQLException ex) {
                Logger.getLogger(SalesPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jbtn_printsalesActionPerformed
    
       private boolean checkInputs(){
        if (Salesfr.getDate()==null||Salest.getDate()==null){
            return true;
        }else{
            return false;
        }
      }
    
    public static void main(String[] args) throws SQLException {
       // JOptionPane.showMessageDialog(null,new SalesPanel());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Salesfr;
    private com.toedter.calendar.JDateChooser Salest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton jbtn_Generatereport;
    private javax.swing.JButton jbtn_printsales;
    private javax.swing.JButton jbtn_show;
    private javax.swing.JLabel jlbl_salesdates;
    private javax.swing.JLabel jlbl_totalsale;
    private javax.swing.JLabel jlbl_totalsale1;
    private javax.swing.JLabel jlbl_totalsale2;
    private javax.swing.JPanel jpnl_salesreport;
    private javax.swing.JTable jtbl_sales;
    private javax.swing.JTextField jtxt_sales_search;
    // End of variables declaration//GEN-END:variables
}
