/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Models.Sales;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chelsea
 */
public class SaleController {
    public SQL sql = new SQL();
    public ArrayList<Sales> saleList = new ArrayList<>();
   
    
    // Method For To Print Panel Contents
    public boolean printReceipt(JPanel panel){
        JOptionPane.showMessageDialog(null,panel,"dasd",JOptionPane.PLAIN_MESSAGE);
        // Create PrinterJob Here
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        // Set Printer Job Name
        printerJob.setJobName("Print Record");
        // Set Printable
        printerJob.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                // Check If No Printable Content
                if(pageIndex > 0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                // Make 2D Graphics to map content
                Graphics2D graphics2D = (Graphics2D)graphics;
                // Set Graphics Translations
                // A Little Correction here Multiplication was not working so I replaced with addition
                graphics2D.translate(pageFormat.getImageableX()+10, pageFormat.getImageableY()+10);
                // This is a page scale. Default should be 0.3 I am using 0.5
                graphics2D.scale(0.5, 0.5);
                
                // Now paint panel as graphics2D
                panel.paint(graphics2D);
                
                // return if page exists
                return Printable.PAGE_EXISTS;
            }
        });
        // Store printerDialog as boolean
        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
        if(returningResult){
            // Use try catch exeption for failure
            try{
                // Now call print method inside printerJob to print
                printerJob.print();
            }catch (PrinterException printerException){
                JOptionPane.showMessageDialog(null, "Print Error: " + printerException.getMessage());
            }
        }
        return true;
}
    
    
//    store data
    
    public ArrayList<Sales> saleList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM inventories LEFT JOIN users ON users.user_id=inventories.user_id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Sales sales;
        
        while(rs.next()){
            String FullName = rs.getString("user_Fname")+ " " + rs.getString("user_Mname") + " " + rs.getString("user_Lname");
          sales = new Sales(rs.getInt("id"),rs.getString("sales_date"),rs.getInt("amount"),FullName);
            saleList.add(sales);
        }
        return saleList;   
    }
     public void showSales(JTable salestable) throws SQLException{
        ArrayList<Sales> list = saleList();
         DefaultTableModel model = (DefaultTableModel)salestable.getModel();
         Object[] row = new Object[4];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getsales_date();
            row[2] = list.get(i).getamount();
            row[3] = list.get(i).getUserFullname();
            model.addRow(row);
         }
    }
}
