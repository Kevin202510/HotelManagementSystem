/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.CheckinAndOut;
import Models.Customers;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CheckinAndOutController{
    
    public  ArrayList<CheckinAndOut> checkinoutList = new ArrayList<>();
    public  SQL sql = new SQL();
    public Connection con = sql.getConnection();
    public RoomController roomControll = new RoomController();   
    
    public ArrayList<CheckinAndOut> checkinandoutlist() throws SQLException{
        String tanong = "Select * from checkinandout";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        CheckinAndOut checkInandOut;
        
        while(rs.next()){
            checkInandOut=new CheckinAndOut(rs.getInt("id"),rs.getInt("cust_id"),rs.getInt("room_id"),rs.getString("checkin_date"),rs.getString("checkout_date"),rs.getString("timein"),rs.getString("timeout"));
            checkinoutList.add(checkInandOut);
        }
        return checkinoutList;   
    }
    
            // Method For To Print Panel Contents
    public void printReceipt(JPanel panel){
        JOptionPane.showMessageDialog(null,panel);
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
}
  
    public void GenerateQrCode(int checkinid){
       try {
            String qrCodeData = String.valueOf(checkinid);
            String filePath = "src\\Images\\QRCODE\\"+ checkinid + ".png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                .lastIndexOf('.') + 1), new File(filePath));
            ImageIcon kk = new ImageIcon(filePath);
            printReceipt(new Views.Panels.Receipts(checkinid));
            JOptionPane.showMessageDialog(null,"Thank you for Checking in in our Hotel");
//            fuck(checkinid);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void fuck(int ids){
        printReceipt(new Views.Panels.Receipts(ids));
    }
    
    public String getDateNow(){
         Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = dateFormat.format(date);
        return strDate;
     }
     
     public String getTimeNow(){
         Date date = Calendar.getInstance().getTime();  
        SimpleDateFormat kevs = new SimpleDateFormat("hh:mm:00 aa"); 
        String strTime = kevs.format(date);
        return strTime;
     }
     
         public boolean checkIn(JTable roomstable,JLabel checkindate,JLabel checkintime,JComboBox rooms1) throws SQLException{
            ArrayList<Customers> list = new CustomerController().custList();
            int id = list.size()-1;
             int ids = list.get(id).getcust_id();
            String room_id1 = rooms1.getSelectedItem().toString();
            int room_id = Integer.parseInt(room_id1);
            String roomupdate = "UPDATE rooms SET status=? WHERE room_id='" +room_id+"'";
            PreparedStatement roomup =con.prepareStatement(roomupdate);
            roomup.setInt(1,0);
            int k = roomup.executeUpdate();
             if (k>0) {
                 DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
                 model.setRowCount(0);
                 roomControll.ShowRoomInCheckin(roomstable);
             }

            CheckinAndOut checkin;
            checkin = new CheckinAndOut(0,ids,room_id,checkindate.getText(),null,checkintime.getText(),null);
//             ArrayList<CheckinAndOut> checkinoutList = checkinandoutlist();
            String insert = "INSERT INTO checkinandout(timein,timeout,checkin_date,checkout_date,cust_id,room_id) VALUES (?,?,?,?,?,?)";
           PreparedStatement st = con.prepareStatement(insert);
           st.setString(1, checkin.gettimein());
           st.setString(2, checkin.gettimeout());
           st.setString(3, checkin.getcheckin_date());
           st.setString(4, checkin.getcheckout_date());
           st.setInt(5, ids);
           st.setInt(6,checkin.getroomId());
           int i = st.executeUpdate();
            if (i>0) {
                new Alerts("checkin").setVisible(true);
                int checkid = 0;
                 String tanongs = "SELECT MAX(id) FROM checkinandout";
                  Statement sts = con.createStatement();
                   ResultSet rs = st.executeQuery(tanongs);
                while(rs.next()){
                    checkid=rs.getInt("MAX(id)");
                }
//               JOptionPane.showMessageDialog(null,checkid);
                 GenerateQrCode(checkid);
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Error");
                return false;
            }
     }
         
         
         
//         checkout filler
         public void fillField(int id,JTextField co_custfullname,JTextField co_custaddress,JTextField co_custcontact,JLabel co_custtime,JLabel co_custdate,JTextField co_rooms,JLabel checkindate,JLabel checkintime) throws SQLException{
            String datein="";
            String tanong = "SELECT * FROM `checkinandout` INNER JOIN customers ON customers.cust_id=checkinandout.cust_id where checkinandout.id='"+id+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);

             while(rs.next()){
                    co_custfullname.setText(rs.getString("cust_Fname") + " " + rs.getString("cust_Mname") + " " + rs.getString("cust_lname"));
                    co_custaddress.setText(rs.getString("cust_address"));
                    co_custcontact.setText(rs.getString("cust_contactnum"));
                    co_custtime.setText(getTimeNow());
                    co_custdate.setText(getDateNow());
                    checkindate.setText(rs.getString("checkin_date"));
                    checkintime.setText(rs.getString("timein"));
                    co_rooms.setText(String.valueOf(rs.getInt("room_id")));
             }
         }
         
         public void payment(int id,String checkindate,int user_ids) throws SQLException{
              String tanongs = "UPDATE checkinandout SET timeout = '"+getTimeNow()+"' , checkout_date = '"+getDateNow()+"'  where id='"+id+"'";
                    Statement sts = con.createStatement();
                    int i = sts.executeUpdate(tanongs);
                    if (i>0) {
                            String checkoutdate = String.valueOf(getDateNow());
                            LocalDate checkin = LocalDate.parse(checkindate);
                            LocalDate checkout = LocalDate.parse(checkoutdate);
                            Long days = ChronoUnit.DAYS.between(checkin,checkout);
                            JOptionPane.showMessageDialog(null,days);
                            int total = (int) (500 * days);
                            JOptionPane.showMessageDialog(null,"Your Total Amount Is " + total);
                            addSales(checkoutdate,total,user_ids);
             }
         }
         
         public void addSales(String datenow,int amount,int user_id) throws SQLException{
             String insert = "INSERT INTO `inventories`(`sales_date`, `amount`, `user_id`) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, datenow);
           st.setInt(2, amount);
           st.setInt(3, user_id);
           int i = st.executeUpdate();
             if (i>0) {
                 JOptionPane.showMessageDialog(null,"successfully");
             }
         }
}
