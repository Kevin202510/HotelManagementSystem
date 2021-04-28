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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CheckinAndOutController{
    
    public  SQL sql = new SQL();
    public  ArrayList<CheckinAndOut> checkinoutList = new ArrayList<>();
    public Connection con = sql.getConnection();
    
    public ArrayList<CheckinAndOut> checkinandoutlist() throws SQLException{
        String tanong = "Select * from checkInAndOut";
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
  
    public void GenerateQrCode(int cusid){
       try {
            String qrCodeData = String.valueOf(cusid);
            String filePath = "src\\Images\\QRCODE\\"+ cusid + ".png";
            String charset = "UTF-8"; // or "ISO-8859-1"
            Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                .lastIndexOf('.') + 1), new File(filePath));
            fuck(cusid);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public void fuck(int ids){
//         int recieptConfirm=0;
//         do{
////                    JOptionPane.showMessageDialog(null,"sadasd");
//                    recieptConfirm = JOptionPane.showConfirmDialog(null,new Views.Panels.Receipts(ids),"Receipt", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
//                    if (recieptConfirm==0) {
JOptionPane.showMessageDialog(null,ids);
                        printReceipt(new Views.Panels.Receipts(ids));
                        JOptionPane.showMessageDialog(null,"Thank you for Checking in in our Hotel");
//                    }else{
//                        JOptionPane.showMessageDialog(null,"You need to Print the Receipt","Error",JOptionPane.ERROR_MESSAGE);
//                    }
//                }while(recieptConfirm!=0);
    }
    
    public String getDateNow(){
         Date date = Calendar.getInstance().getTime();  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        String strDate = dateFormat.format(date);
        return strDate;
     }
     
     public String getTimeNow(){
         Date date = Calendar.getInstance().getTime();  
        DateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");  
        String strTime = timeFormat.format(date);
        return strTime;
     }
     
         public boolean checkIn(JLabel checkindate,JLabel checkintime,JComboBox rooms1) throws SQLException{
            ArrayList<Customers> list = new CustomerController().custList();
            ArrayList<CheckinAndOut> checkinoutList = checkinandoutlist();
            int id = list.size()-1;
            int ids = list.get(id).getcust_id();
            int checkinout = checkinoutList.size()+1; 
            JOptionPane.showMessageDialog(null,checkinout);
            String room_id1 = rooms1.getSelectedItem().toString();
            int room_id = Integer.parseInt(room_id1);
            String roomupdate = "UPDATE rooms SET status=? WHERE room_id='" +room_id+"'";
            PreparedStatement roomup =con.prepareStatement(roomupdate);
            roomup.setInt(1,0);
            roomup.executeUpdate();

            CheckinAndOut checkin;
            checkin = new CheckinAndOut(checkinout,ids,room_id,checkindate.getText(),null,checkintime.getText(),null);
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
                JOptionPane.showMessageDialog(null,"Successfully Check in!!");
                 GenerateQrCode(checkinout);
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Error");
                return false;
            }
     }
         
         
         
//         checkout filler
         
         public void fillField(int id,JTextField co_custfullname,JTextField co_custaddress,JTextField co_custcontact,JLabel co_custtime,JLabel co_custdate,JTextField co_rooms) throws SQLException{
            ArrayList<Customers> list = new CustomerController().custList();
            int room_id=0;
            String datein="";
            int customer_id=0;
            int index=0;
            String tanong = "Select * from checkinandout where id='"+id+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);

             while(rs.next()){
                        room_id = rs.getInt("room_id");
                        customer_id = rs.getInt("cust_id");
                        datein = rs.getString("checkin_date");
             }

             for(int i =0;i<list.size();i++){
                 int initid = list.get(i).getcust_id();
                 if (initid==customer_id) {
                   index=i;
                 }
             }

             JOptionPane.showMessageDialog(null,index);
            co_custfullname.setText(list.get(index).getcust_fullname());
            co_custaddress.setText(list.get(index).getcust_address());
            co_custcontact.setText(list.get(index).getcust_contactnum());
            co_custtime.setText(getTimeNow());
            co_custdate.setText(getDateNow());
            JOptionPane.showMessageDialog(null,room_id);
            co_rooms.setText(String.valueOf(room_id));
            String tanongs = "UPDATE checkinandout SET timeout = '"+getTimeNow()+"' , checkout_date = '"+getDateNow()+"'  where id='"+id+"'";
            Statement sts = con.createStatement();
            sts.executeUpdate(tanongs);

            JOptionPane.showMessageDialog(null,datein);
            String checkindate = datein;
            String checkoutdate = String.valueOf(getDateNow());
            LocalDate checkin = LocalDate.parse(checkindate);
            LocalDate checkout = LocalDate.parse(checkoutdate);
            Long days = ChronoUnit.DAYS.between(checkin,checkout);
            JOptionPane.showMessageDialog(null,days);
            int total = (int) (500 * days);
            JOptionPane.showMessageDialog(null,total);
            }
}
