/*     
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Rooms;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class RoomController {
   
    public SQL sql = new SQL();
    public Connection con = sql.getConnection();
    public Rooms rooms;
    
//    QUERIES 
//    public String selectRoom = "SELECT * FROM rooms where room_id = ?";
    
    public ArrayList<Rooms> roomList() throws SQLException{
        ArrayList<Rooms> roomList = new ArrayList<>();
//         LEFT JOIN beds ON rooms.bed_id = beds.bed_id LEFT JOIN roomtypes ON rooms.RT_id = roomtypes.RT_id LEFT JOIN rates on rooms.rate_id = rates.rate_id
        String tanong = "SELECT * FROM `rooms` INNER JOIN beds on beds.bed_id = rooms.bed_id INNER JOIN roomtypes ON roomtypes.RT_id = rooms.RT_id INNER JOIN rates on rates.rate_id = rooms.rate_id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        
        while(rs.next()){
            rooms=new Rooms(rs.getInt("room_id"),rs.getString("bed_quantity"),rs.getString("room_type"),rs.getInt("rate_price"),rs.getInt("status"));
            roomList.add(rooms);
        }
        return roomList;   
    
    }
    
     public ArrayList<Rooms> showRoomsCheckin() throws SQLException{
        ArrayList<Rooms> checkinrooms = new ArrayList<>();
//         LEFT JOIN beds ON rooms.bed_id = beds.bed_id LEFT JOIN roomtypes ON rooms.RT_id = roomtypes.RT_id LEFT JOIN rates on rooms.rate_id = rates.rate_id
        String tanong = "SELECT * FROM rooms where status=1";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        
        while(rs.next()){
            rooms=new Rooms(rs.getInt("room_id"),rs.getInt("bed_id"),rs.getInt("RT_id"),rs.getInt("rate_id"),rs.getInt("status"));
            checkinrooms.add(rooms);
        }
        return checkinrooms;   
    
    }
    
     public void showRooms(JComboBox rooms1){
        String tanong = "Select * from rooms where status=1";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
         String vin = String.valueOf(rs.getInt("room_id"));
         rooms1.addItem(vin);
        }
        }
        catch (SQLException ex) {
        }
    }
     
////     SELECT * FROM `rooms` INNER JOIN beds on beds.bed_id = rooms.bed_id 
//INNER JOIN roomtypes ON roomtypes.RT_id = rooms.RT_id
//INNER JOIN rates on rates.rate_id = rooms.rate_id
     
    public void showRoomType(JComboBox rooms2){
        String tanong = "Select * from roomtypes";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
         String vin = rs.getString("room_type");
         rooms2.addItem(vin);
        }
        }
        catch (SQLException ex) {
        }
    }
    
    public void showBedType(JComboBox rooms3){
        String tanong = "Select * from beds";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
         String vin = rs.getString("bed_quantity");
         rooms3.addItem(vin);
        }
        }
        catch (SQLException ex) {
        }
    }
    
    public void showRate(JComboBox rooms4){
        String tanong = "Select * from rates";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
         String vin = String.valueOf(rs.getInt("rate_price"));
         rooms4.addItem(vin);
        }
        }
        catch (SQLException ex) {
        }
    }
    
//    public void showStatus(JComboBox rooms1){
//        String tanong = "Select * from rates";
//        try{
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(tanong);
//        while(rs.next()){
//         String vin = String.valueOf(rs.getInt("rate_id"));
//         rooms1.addItem(vin);
//        }
//        }
//        catch (SQLException ex) {
//        }
//    }
     
     public void Room(JTable roomstable) throws SQLException{
         ArrayList<Rooms> list = roomList();
         DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
         Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getroom_id();
            row[1] = list.get(i).getroomtype();
            row[2] = list.get(i).getbed();
            row[3] = list.get(i).getrates();
            row[4] = list.get(i).getstatus();
            model.addRow(row);
         }
       }
     
     public void ShowRoomInCheckin(JTable roomstable) throws SQLException{
         ArrayList<Rooms> list = showRoomsCheckin();
         DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
         Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getroom_id();
            row[1] = list.get(i).getbed_id();
            row[2] = list.get(i).getRT_id();
            row[3] = list.get(i).getrate_id();
            row[4] = list.get(i).getstatus();
            model.addRow(row);
         }
       }
    


  public boolean createRooms(Rooms rooms,JTable roomstable) throws SQLException{
        Connection con = sql.getConnection();
        String insert = "INSERT INTO rooms(bed_id,RT_id,rate_id,status) VALUES (?,?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1, rooms.getbed_id());
        st.setInt(2, rooms.getRT_id());
        st.setInt(3, rooms.getrate_id());
        st.setInt(4, rooms.getstatusid());
        int i = st.executeUpdate();
        if (i > 0) {
        DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(null,"Successfully Added!!");
        return true;
        } else {
            JOptionPane.showMessageDialog(null,"Error");
            return false;
        }
    }
  
  public void fillRoomForm(int id,JTextField Roomid,JComboBox Roomtype,JComboBox Bedtype,JComboBox Rate,JComboBox Status ) throws SQLException{
        JOptionPane.showMessageDialog(null,id);
        Statement st = con.createStatement();
        String selectRooms = "SELECT * FROM `rooms` INNER JOIN beds on beds.bed_id = rooms.bed_id INNER JOIN roomtypes ON roomtypes.RT_id = rooms.RT_id INNER JOIN rates on rates.rate_id = rooms.rate_id where rooms.room_id ='"+ id +"'";
        ResultSet rs = st.executeQuery(selectRooms);
        while(rs.next()){
//            String vins = rs.getInt("room_id")   +" "+ rs.getInt("bed_id") +" "+ rs.getInt("RT_id")  + " " + rs.getInt("rate_id") + " " + rs.getInt("status");
            Roomid.setText(String.valueOf(rs.getInt("room_id")));
            Bedtype.setSelectedItem(rs.getString("bed_quantity"));
             Roomtype.setSelectedItem(rs.getString("room_type"));
            Rate.setSelectedItem(String.valueOf(rs.getInt("rate_price")));
            if (rs.getInt("status")==1) {
              Status.setSelectedIndex(0);  
            }else{
                Status.setSelectedIndex(1);
            }
        }
  }
  
  public boolean updateRooms(Rooms rooms,int room_id,JTable usertables) throws SQLException{
      
        String updateRooms = "UPDATE rooms SET bed_id=?,RT_id=?,rate_id=?,status=? WHERE room_id = '"+room_id+"'";
        PreparedStatement st = con.prepareStatement(updateRooms);
        st.setInt(1, rooms.getbed_id());
//        JOptionPane.showMessageDialog(null,rooms.getbed_id());
        st.setInt(2, rooms.getRT_id());
//        JOptionPane.showMessageDialog(null,rooms.getRT_id());
        st.setInt(3, rooms.getrate_id());
//        JOptionPane.showMessageDialog(null,rooms.getrate_id());
        st.setInt(4, rooms.getstatusid());
//        JOptionPane.showMessageDialog(null,rooms.getstatusid());
         int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)usertables.getModel();
            model.setRowCount(0);
            return true;
        }else{
            return false;
        }
     }
  
  public void clearContent(JTextField Roomid,JTextField Roomtype,JTextField Bedtype,JTextField Rate,JTextField Status){
        Roomid.setText("");
        Roomtype.setText("");
        Bedtype.setText("");
        Rate.setText("");
        Status.setText("");
  }
  
}
