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
import java.text.ParseException;
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
            checkInandOut=new CheckinAndOut(rs.getInt("id"),rs.getInt("cust_id"),rs.getInt("room_id"),rs.getString("checkin_date"),rs.getString("checkout_date"),rs.getString("timein"),rs.getString("timeout"),rs.getDouble("total"));
            checkinoutList.add(checkInandOut);
        }
        return checkinoutList;   
    }
    
     public ArrayList<CheckinAndOut> checkinandoutlists() throws SQLException{
         ArrayList<CheckinAndOut> checkinoutLists = new ArrayList<>();
        String tanong = "Select * from checkinandout LEFT JOIN customers ON customers.cust_id = checkinandout.cust_id WHERE checkinandout.status=0";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        CheckinAndOut checkInandOut;
        
        while(rs.next()){
            String fullname = rs.getString("cust_Fname") + " " + rs.getString("cust_Mname") + " " + rs.getString("cust_Lname");  
            checkInandOut=new CheckinAndOut(rs.getInt("id"),rs.getDouble("hours_checkin"),fullname,rs.getInt("room_id"),rs.getString("checkin_date"),rs.getString("checkout_date"),rs.getString("timein"),rs.getString("timeout"),rs.getDouble("total"));
            checkinoutLists.add(checkInandOut);
        }
        return checkinoutLists;   
    }
     
    public void showCustomersCheckin(JTable customercheckinTable) throws SQLException{
        ArrayList<CheckinAndOut> checkinoutLists = checkinandoutlists();
         DefaultTableModel model = (DefaultTableModel)customercheckinTable.getModel();
         Object[] row = new Object[9];
         for (int i = 0; i < checkinoutLists.size(); i++) {
            row[0] = checkinoutLists.get(i).getcheckInOut();
            row[1] = checkinoutLists.get(i).getCustFullname();
            row[2] = checkinoutLists.get(i).getroomId();
            row[3] = checkinoutLists.get(i).getcheckin_date();
            row[4] = checkinoutLists.get(i).gettimein();
            row[5] = checkinoutLists.get(i).getcheckout_date();
            row[6] = checkinoutLists.get(i).gettimeout();
            row[7] = checkinoutLists.get(i).getHourscheckin();
            row[8] = checkinoutLists.get(i).gettotal();
            model.addRow(row);
         }
    }
    
            // Method For To Print Panel Contents
    public void printReceipt(JPanel panel){
        JOptionPane.showMessageDialog(null,panel,"Print", JOptionPane.PLAIN_MESSAGE);
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
//        boolean returningResult = printerJob.printDialog();
        // check if dilog is showing
//        
        boolean returningResult;
            
            do{
                returningResult = printerJob.printDialog();
                if (!returningResult) {
                    JOptionPane.showMessageDialog(null,"You Cannot Cancel Printing Receipt");
                }
            }while(returningResult==false);
            // Use try catch exeption for failure
            if(returningResult){
            try{
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
     JTable roomstables;
     
    private void updateRoomStatus(int roomstat,int room_id,JTable roomstable) throws SQLException{
        roomstables=roomstable;
         String roomupdate = "UPDATE rooms SET status=? WHERE room_id='" +room_id+"'";
            PreparedStatement roomup =con.prepareStatement(roomupdate);
            roomup.setInt(1,roomstat);
            int k = roomup.executeUpdate();
             if (k>0) {
                 DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
                 model.setRowCount(0);
                 roomControll.ShowRoomInCheckin(roomstable);
             }
     }
     
////     updateRoomStatus(room_id,roomstable);/
     private double getRoomRates(int room_id) throws SQLException{
        String getrateprice = "SELECT * FROM rooms LEFT JOIN rates ON rates.rate_id=rooms.rate_id WHERE rooms.room_id = '"+room_id+"'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(getrateprice);
        double total=0;
            if (rs.next()) {
               total = rs.getInt("rate_price");
         }
       return total;
     }
     double total;
     private double getDiscountPromo(int room_id,double hourVal,String checkinDate,String strDate) throws SQLException{
         
//         double dis1=0;
//            while(rs.next()){
//                dis
//            }
            
            if (hourVal==3) {
                String tanong = "SELECT * FROM promos where id = 1";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()) {
                    double dis1=rs.getDouble("discount");
//                    JOptionPane.showMessageDialog(null,dis1);
                    double initt = getRoomRates(room_id)*0.05;
                    total =getRoomRates(room_id)-initt;
                    JOptionPane.showMessageDialog(null,total);
                }
                return total;
             }else if (hourVal==6) {
                String tanong = "SELECT * FROM promos where id = 2";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()) {
                    double dis2=rs.getDouble("discount");
                    total =(hourVal/6)*getRoomRates(room_id)-(((hourVal/6)*getRoomRates(room_id))*dis2);
                    JOptionPane.showMessageDialog(null,total);
                }
                return total;
             }else if (hourVal==12) {
                String tanong = "SELECT * FROM promos where id = 3";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()) {
                    double dis3=rs.getDouble("discount");
                    total =(hourVal/6)*getRoomRates(room_id)-(((hourVal/6)*getRoomRates(room_id))*dis3);
                    JOptionPane.showMessageDialog(null,total);
//                     getRoomRates(room_id)-(getRoomRates(room_id)
                }
                return total;
             }else{
                String tanong = "SELECT * FROM promos where id = 4";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(tanong);
                if (rs.next()) {
                    double dis4=rs.getDouble("discount");
                LocalDate checkinsdate = LocalDate.parse(checkinDate);
                LocalDate checkoutdate = LocalDate.parse(strDate);
                Long days = ChronoUnit.DAYS.between(checkinsdate,checkoutdate);
                JOptionPane.showMessageDialog(null,days);
                total =(hourVal/6)*getRoomRates(room_id)-(((hourVal/6)*getRoomRates(room_id))*dis4);
                JOptionPane.showMessageDialog(null,total);
                }
                return total;
            }
     }
         public boolean checkIn(JTable roomstable,JLabel checkindate,JLabel checkintime,JComboBox rooms1,int hourVal,JLabel checkoutdates,JLabel checkouttime) throws SQLException{
            ArrayList<Customers> list = new CustomerController().custList();
            int id = list.size()-1;
            int ids = list.get(id).getcust_id();
            int room_id =  Integer.parseInt(rooms1.getSelectedItem().toString());
            CheckinAndOut checkin;
            String checkinDate = checkindate.getText();
            String checkinTime = checkintime.getText();
            
            Calendar cal = Calendar.getInstance();
            cal.add(Calendar.HOUR_OF_DAY ,hourVal);
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);
            SimpleDateFormat kev = new SimpleDateFormat("hh:mm:ss aa");
            Date dat = cal.getTime();
            String times = kev.format(dat);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            String strDate = dateFormat.format(dat); 
            
            checkin = new CheckinAndOut(0,ids,room_id,checkinDate,strDate,checkinTime,times,getDiscountPromo(room_id,hourVal,checkinDate,strDate));
            String insert = "INSERT INTO checkinandout(hours_checkin,timein,timeout,checkin_date,checkout_date,cust_id,room_id,total) VALUES (?,?,?,?,?,?,?,?)";
           PreparedStatement st = con.prepareStatement(insert);  
           st.setDouble(1, hourVal);
           st.setString(2, checkin.gettimein());
           st.setString(3, checkin.gettimeout());
           st.setString(4, checkin.getcheckin_date());
           st.setString(5, checkin.getcheckout_date());
           st.setInt(6, ids);
           st.setInt(7,checkin.getroomId());
           st.setDouble(8,checkin.gettotal());
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
                updateRoomStatus(0,room_id,roomstable);
                 GenerateQrCode(checkid);
                return true;
            }else{
                JOptionPane.showMessageDialog(null,"Error");
                return false;
            }
     }
         
    String checkoutdate;
    String checkindates;  
    double tottal;
    int rooms_id;
         
         public boolean fillField(int id,JTextField co_custfullname,JTextField co_custaddress,JTextField co_custcontact,JLabel co_custtime,JLabel co_custdate,JTextField co_rooms,JLabel checkindate,JLabel checkintime,JLabel total) throws SQLException{
            String datein="";
            String tanong = "SELECT * FROM `checkinandout` INNER JOIN customers ON customers.cust_id=checkinandout.cust_id where checkinandout.id='"+id+"' AND status=0";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);

             if(rs.next()){
                    co_custfullname.setText(rs.getString("cust_Fname") + " " + rs.getString("cust_Mname") + " " + rs.getString("cust_lname"));
                    co_custaddress.setText(rs.getString("cust_address"));
                    co_custcontact.setText(rs.getString("cust_contactnum"));
                    co_custtime.setText(rs.getString("timeout"));
                    checkoutdate=rs.getString("checkout_date");
                    co_custdate.setText(checkoutdate);
                    checkindates=rs.getString("checkin_date");
                    checkindate.setText(checkindates);
                    checkintime.setText(rs.getString("timein"));
                    rooms_id=rs.getInt("room_id");
                    co_rooms.setText(String.valueOf(rooms_id));
                    tottal = rs.getDouble("total");
                    total.setText(String.valueOf(rs.getDouble("total")));
                    return true;
             }else{
                 JOptionPane.showMessageDialog(null,"Customer Already CheckOut");
             }
             return false;
         }
         
         private void checkSuki() throws SQLException{
            int kev = JOptionPane.showConfirmDialog(null,"Do You Have A SukiCard?","Ask",JOptionPane.YES_NO_OPTION);
            if(kev==0){
                String sukicode = JOptionPane.showInputDialog(null,"Scan Suki Card");
                String ask = "Select * from sukicustomers LEFT JOIN customers ON customers.cust_id=sukicustomers.custo_id LEFT JOIN checkinandout on checkinandout.cust_id= sukicustomers.custo_id where sukicustomers.sukicode= '"+sukicode+"'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(ask);
                if (rs.next()) {
                    String fullname = rs.getString("cust_Fname") + " " + rs.getString("cust_Mname") + " " +rs.getString("cust_Lname");
                    JOptionPane.showMessageDialog(null,"Suki " + " " + fullname + " Exist");
                    double PTS = rs.getDouble("points");
                    String tanongs = "UPDATE sukicustomers SET points = ? WHERE sukicode='"+sukicode+"'";
                    PreparedStatement sts = con.prepareStatement(tanongs);
                    sts.setDouble(1, PTS+1.0);
                    int i = sts.executeUpdate(); 
                }else{
                    JOptionPane.showMessageDialog(null,"Suki Not Already Exist");
                }
            }
         }
         
         public boolean payment(int id,int user_ids) throws SQLException{
            checkSuki();
            String tanongs = "UPDATE checkinandout SET status = 1 where id='"+id+"'";
            Statement sts = con.createStatement();
            int i = sts.executeUpdate(tanongs);
            if (i>0) {
                    printReceipt(new Views.Panels.Receipts(id,"CHECKOUT RECEIPT"));
                    addSales(checkoutdate,tottal,user_ids);
                    return true;
             }
            return false;
         }
         
         public void addSales(String datenow,double amount,int user_id) throws SQLException{
             String insert = "INSERT INTO `inventories`(`sales_date`, `amount`, `user_id`) VALUES (?,?,?)";
            PreparedStatement st = con.prepareStatement(insert);
            st.setString(1, datenow);
           st.setDouble(2, amount);
           st.setInt(3, user_id);
           int i = st.executeUpdate();
             if (i>0) {
                String roomupdate = "UPDATE rooms SET status=? WHERE room_id='" +rooms_id+"'";
                PreparedStatement roomup =con.prepareStatement(roomupdate);
                roomup.setInt(1,1);
                roomup.executeUpdate();
             }
         }
         
         double hourvals,totals;
         int room_id;
         String checkinDates,checkoutDates,checkouttimes;
         
         public void CheckCustomerCheckInOut(int id,JLabel fname,JLabel mname,JLabel lname,JLabel address,JLabel contactnum,JLabel rooms,JLabel checkintime,JLabel checkindate,JLabel checkouttime,JLabel checkoutdate) throws SQLException{
            String tanong = "SELECT * FROM `checkinandout` INNER JOIN customers ON customers.cust_id=checkinandout.cust_id where checkinandout.id='"+id+"'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);
            
            while(rs.next()){
                hourvals=rs.getDouble("hours_checkin");
                totals=rs.getDouble("total");
                fname.setText(rs.getString("cust_Fname"));
                mname.setText(rs.getString("cust_Mname"));
                lname.setText(rs.getString("cust_Lname"));
                address.setText(rs.getString("cust_address"));
                contactnum.setText(rs.getString("cust_contactnum"));
                room_id=rs.getInt("room_id");
                rooms.setText(String.valueOf(room_id));
                checkintime.setText(rs.getString("timein"));
                checkinDates=rs.getString("checkin_date");
                checkindate.setText(checkinDates);
                checkoutDates=rs.getString("checkout_date");
                checkouttimes=rs.getString("timeout");
                checkouttime.setText(checkouttimes);
                checkoutdate.setText(checkoutDates);
            }
         }
         
         public void setCheckOutDateAndTime(int hours,JLabel checkoutdates,JLabel checkouttime) throws ParseException{
//            String checkoutdt = checkoutdates.getText();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss aa");  
            Date dat = dateFormat.parse(checkoutDates+" "+checkouttimes);
            JOptionPane.showMessageDialog(null,dat);
            Calendar cal = Calendar.getInstance();
            cal.setTime(dat);
            cal.add(Calendar.HOUR_OF_DAY , (int) hours);
            int hour = cal.get(Calendar.HOUR_OF_DAY);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);
            SimpleDateFormat kev = new SimpleDateFormat("hh:mm:ss aa");
            DateFormat dateFormats = new SimpleDateFormat("yyyy-MM-dd");  
            Date dats = cal.getTime();
            JOptionPane.showMessageDialog(null,dats);
            String times = kev.format(dats);
            JOptionPane.showMessageDialog(null,times);
            String strDate = dateFormats.format(dats); 
            checkoutdates.setText(strDate);
            checkouttime.setText(times);
         }
         
         public boolean updateCheckInAndOut(int room_id,int checkid,double hours,JLabel timeout,String checkindates,JLabel checkoutdates) throws SQLException{ 
             double extendtot = getDiscountPromo(room_id,hours,checkoutDates,checkoutdates.getText());
             String update = "UPDATE checkinandout SET hours_checkin=?,timeout=?,checkout_date=?,total=? where id = '"+checkid+"'";
             PreparedStatement st = con.prepareStatement(update);
             st.setInt(1, (int) (hourvals+hours));
             st.setString(2,timeout.getText());
             st.setString(3,checkoutdates.getText());
             st.setDouble(4,totals+extendtot);
             int i= st.executeUpdate();
             if(i>0){
                 JOptionPane.showMessageDialog(null,"updated successfully");
                 return true;
             }
             return false;
         }
}
