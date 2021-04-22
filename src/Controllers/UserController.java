/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Users;
import Views.Authentication.Login;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class UserController {
   
    public  SQL sql = new SQL();
    public  ArrayList<Users> userList = new ArrayList<>();
    
    public ArrayList<Users> userList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "Select * from users INNER JOIN roles ON users.role_id = roles.role_id";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Users users;
        
        while(rs.next()){
            users=new Users(rs.getInt("user_id"),rs.getString("role_displayname"),rs.getString("user_Fname"),rs.getString("user_Mname"),rs.getString("user_Lname"),rs.getString("user_address"),rs.getString("user_DOB"),rs.getString("user_contactnum"),rs.getString("user_username"),rs.getString("user_password"));
            userList.add(users);
        }
        return userList;   
    }
    
    public boolean createUser(Users user,JTable roomstable) throws SQLException{
        Connection con = sql.getConnection();
        String insert = "INSERT INTO users(role_id,user_Fname,user_Mname,user_Lname,user_address,user_DOB,user_contactnum,user_username,user_password) VALUES ('3','" +user.getuser_Fname()+ "','" +user.getuser_Mname()+"','" +user.getuser_Lname()+"','" +user.getuser_address()+"','" +user.getuser_DOB()+"','" +user.getuser_contactnum()+"','" +user.getuser_username()+"','" +user.getuser_password()+"')";
        PreparedStatement st = con.prepareStatement(insert);
        int i = st.executeUpdate();
        if (i > 0) {
            DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
            model.setRowCount(0);
            showUsers(roomstable);
            JOptionPane.showMessageDialog(null,"Successfully Register!!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null,"Error");
            return false;
        }
    }
    
    public void showUsers(JTable jTable1) throws SQLException{
         UserController user = new UserController();
         ArrayList<Users> list = user.userList();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getuser_id();
            row[1] = list.get(i).getrole_displayname();
            row[2] = list.get(i).getuser_fullname();
            row[3] = list.get(i).getuser_address();
            row[4] = list.get(i).getuser_DOB();
            row[5] = list.get(i).getuser_contactnum();
            row[6] = list.get(i).getuser_username();
            row[7] = list.get(i).getuser_password();
            model.addRow(row);
         }
    }
    
    public void clearContent(JTextField uaname,JTextField umi,JTextField usn,JTextField uadd,JDateChooser udob,JTextField ucon,JTextField uname,JPasswordField upass){
       uaname.setText("");
       umi.setText("");
       usn.setText("");
       uadd.setText("");
       udob.setDate(null);
       ucon.setText("");
       uname.setText("");
       upass.setText("");
    }
    
     public void fillUserForm(int user_id,JTable jTable1,JTextField uaname,JTextField umi,JTextField usn,JTextField uadd,JDateChooser udob,JTextField ucon,JTextField uname,JPasswordField upass) throws SQLException, ParseException{
        ArrayList<Users> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        JOptionPane.showMessageDialog(null,user_id);
            uaname.setText(model.getValueAt(user_id, 0).toString());
            umi.setText(model.getValueAt(user_id, 1).toString());
            usn.setText(model.getValueAt(user_id, 2).toString());
            uadd.setText(model.getValueAt(user_id, 3).toString());
            udob.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(list.get(user_id).getuser_DOB()));
            ucon.setText(model.getValueAt(user_id, 5).toString());
            uname.setText(model.getValueAt(user_id, 6).toString());
            upass.setText(model.getValueAt(user_id, 7).toString());
        
    }
     
     public boolean updateUser(Users users,int user_id,JTable usertables) throws SQLException{
        
        JOptionPane.showMessageDialog(null,"hello");
        ArrayList<Users> list = userList();
        int id = list.get(user_id).getuser_id();
        JOptionPane.showMessageDialog(null,id);
        Connection con = sql.getConnection();
        String updates = "UPDATE users SET user_Fname = ?,user_Mname = ?,user_Lname = ?,user_address = ?,user_DOB = ?,user_contactnum = ?,user_username = ?,user_password = ? WHERE user_id = '" + id + "'";
        PreparedStatement st = con.prepareStatement(updates);
//        '" + list.get(selectedRow).getuser_id() + "'
        st.setString(1, users.getuser_Fname());
        st.setString(2, users.getuser_Mname());
        st.setString(3, users.getuser_Lname());
        st.setString(4, users.getuser_address());
        st.setString(5, users.getuser_DOB());
        st.setString(6, users.getuser_contactnum());
        st.setString(7, users.getuser_username());
        st.setString(8, users.getuser_password());
        
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)usertables.getModel();
            model.setRowCount(0);
            showUsers(usertables);
            JOptionPane.showMessageDialog(null,"Successfully Updated!!");
            return true;
        }else{
            return false;
        }
     }
}
