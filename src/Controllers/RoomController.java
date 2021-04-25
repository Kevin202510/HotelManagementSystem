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
    
    public ArrayList<Rooms> roomList() throws SQLException{
        ArrayList<Rooms> roomList = new ArrayList<>();
//         LEFT JOIN beds ON rooms.bed_id = beds.bed_id LEFT JOIN roomtypes ON rooms.RT_id = roomtypes.RT_id LEFT JOIN rates on rooms.rate_id = rates.rate_id
        String tanong = "SELECT * FROM rooms";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        
        while(rs.next()){
            rooms=new Rooms(rs.getInt("room_id"),rs.getInt("bed_id"),rs.getInt("RT_id"),rs.getInt("rate_id"),rs.getInt("status"));
            roomList.add(rooms);
        }
        return roomList;   
    
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
     
     public void Room(JTable roomstable) throws SQLException{
         ArrayList<Rooms> list = roomList();
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
        String insert = "INSERT INTO rooms(RT_id,bed_id,rate_id,status) VALUES (?,?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1, rooms.getRT_id());
        st.setInt(2, rooms.getbed_id());
        st.setInt(3, rooms.getrate_id());
        st.setInt(4, rooms.getstatusid());
        int i = st.executeUpdate();
        if (i > 0) {
        DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(null,"Successfully Check in!!");
        return true;
        } else {
            JOptionPane.showMessageDialog(null,"Error");
            return false;
        }
    }
  
  public void fillRoomForm(int id,JTextField Roomid,JTextField Roomtype,JTextField Bedtype,JTextField Rate,JTextField Status ) throws SQLException{
        ArrayList<Rooms> list = roomList();
        Roomid.setText(String.valueOf(list.get(id).getroom_id()));
        Roomtype.setText(String.valueOf(list.get(id).getRT_id()));
        Bedtype.setText(String.valueOf(list.get(id).getbed_id()));
        Rate.setText(String.valueOf(list.get(id).getrate_id()));
        Status.setText(String.valueOf(list.get(id).getstatusid()));
  }
  
  public boolean updateRooms(Rooms rooms,int room_id,JTable usertables) throws SQLException{
        ArrayList<Rooms> list = roomList(); 
        int id = list.get(room_id).getroom_id();
        String updateRooms = "UPDATE rooms SET bed_id=?,RT_id=?,rate_id=?,status=? WHERE room_id = '"+id+"'";
        PreparedStatement st = con.prepareStatement(updateRooms);
        st.setInt(1, rooms.getbed_id());
        st.setInt(2, rooms.getRT_id());
        st.setInt(3, rooms.getrate_id());
        st.setInt(4, rooms.getstatusid());
        
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
