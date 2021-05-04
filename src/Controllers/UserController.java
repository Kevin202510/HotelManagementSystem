/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Users;
import Views.Authentication.Login;
import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class UserController {
    
    public  ArrayList<Users> userList = new ArrayList<>();
    public ArrayList<Users> list;
    public  SQL sql = new SQL();
    public Connection con = sql.getConnection();
    public static int key = 6;
    Authentication auth = new Authentication();
    
//    QUERIES
    public String kuninLahatNgUser = "SELECT * FROM users where user_id>1";
    public String magdagdagNgUser = "INSERT INTO users(role_id,user_Fname,user_Mname,user_Lname,user_address,user_DOB,user_contactnum,user_username,user_password) VALUES (?,?,?,?,?,?,?,?,?)";
    
    public UserController() throws SQLException{
         this.list = userList();
    }
    
    public ArrayList<Users> userList() throws SQLException{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(kuninLahatNgUser);
        Users users;
        
        while(rs.next()){
            users=new Users(rs.getInt("user_id"),rs.getInt("role_Id"),rs.getString("profile"),rs.getString("user_Fname"),rs.getString("user_Mname"),rs.getString("user_Lname"),rs.getString("user_address"),rs.getString("user_DOB"),rs.getString("user_contactnum"),rs.getString("user_username"),rs.getString("user_password"));
            userList.add(users);
        }
        return userList;   
    }

    public boolean createUser(Users user,JTable roomstable) throws SQLException{
        PreparedStatement st = con.prepareStatement(magdagdagNgUser);
        st.setInt(1, user.getrole_id());
        st.setString(2, user.getuser_Fname());
        st.setString(3, user.getuser_Mname());
        st.setString(4, user.getuser_Lname());
        st.setString(5, user.getuser_address());
        st.setString(6, user.getuser_DOB());
        st.setString(7, user.getuser_contactnum());
        st.setString(8, user.getuser_username());
        st.setString(9, auth.encrypt(user.getuser_password()));
        
        int i = st.executeUpdate();
        if (i > 0) {
            DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
            model.setRowCount(0);
            new Alerts("save").setVisible(true);
            return true;
        } else {
            new Alerts("error").setVisible(true);
            return false;
        }
    }
    
    public void showUsers(JTable jTable1) throws SQLException{
//         ArrayList<Users> list = userList();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getuser_id();
            row[1] = list.get(i).getrole_displayname();
            row[2] = "<html>"+list.get(i).getuser_fullname()+"</html> ";
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
    
     public void fillUserForm(int user_id,JComboBox roles,JLabel profile,JTextField uaname,JTextField umi,JTextField usn,JTextField uadd,JDateChooser udob,JTextField ucon,JTextField uname,JPasswordField upass) throws SQLException, ParseException{
            String tanong = "SELECT * FROM `users` WHERE user_id='"+user_id+"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);
            ImageIcon vin = null;
            while(rs.next()){
                vin = new ImageIcon(getClass().getResource("/Images/Pictures/"+rs.getString("profile")+".jpg"));
                roles.setSelectedIndex(rs.getInt("role_id")-1);
                uaname.setText(rs.getString("user_Fname"));
                umi.setText(rs.getString("user_Mname"));
                usn.setText(rs.getString("user_Lname"));
                uadd.setText(rs.getString("user_address"));
                udob.setDate(rs.getDate("user_DOB"));
                ucon.setText(rs.getString("user_contactnum"));
                uname.setText(rs.getString("user_username"));
                upass.setText(auth.decrypt(rs.getString("user_password")));
            }
             Image kev = vin.getImage().getScaledInstance(150, 80, Image.SCALE_SMOOTH);
             profile.setIcon(new ImageIcon(kev));
        
    }
     
     public boolean updateUser(Users users,int user_id,JTable usertables) throws SQLException{
        String updates = "UPDATE users SET role_id = ? ,profile = ?, user_Fname = ?,user_Mname = ?,user_Lname = ?,user_address = ?,user_DOB = ?,user_contactnum = ?,user_username = ?,user_password = ? WHERE user_id = '" + user_id + "'";
        PreparedStatement st = con.prepareStatement(updates);
        st.setInt(1, users.getrole_id());
        st.setString(2, users.getprofile());
        JOptionPane.showMessageDialog(null,users.getprofile());
        st.setString(3, users.getuser_Fname());
        st.setString(4, users.getuser_Mname());
        st.setString(5, users.getuser_Lname());
        st.setString(6, users.getuser_address());
        st.setString(7, users.getuser_DOB());
        st.setString(8, users.getuser_contactnum());
        st.setString(9, users.getuser_username());
        st.setString(10, auth.encrypt(users.getuser_password()));
        
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)usertables.getModel();
            model.setRowCount(0);
            new Alerts("update").setVisible(true);
            return true;
        }else{
            new Alerts("error").setVisible(true);
            return false;
        }
     }
     
     public boolean deleteUser(int id,JTable jTable1) throws SQLException{
        String delete = "DELETE FROM users WHERE user_id = ?";
        PreparedStatement st = con.prepareStatement(delete);
        st.setInt(1, id);
        int i = st.executeUpdate();
        if (i > 0) {
           DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            new Alerts("delete").setVisible(true);
            return true;
        }else{
            new Alerts("error").setVisible(true);
            return false;
        }

     }
     
     public void showRoles(JComboBox roles){
        String tanong = "Select * from roles";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        while(rs.next()){
         String vin = rs.getString("role_displayname");
         roles.addItem(vin);
        }
        }
        catch (SQLException ex) {
        }
    }
     
}



//         " +user.getuser_Fname()+ "','" +user.getuser_Mname()+"','" +user.getuser_Lname()+"','" +user.getuser_address()+"','" +user.getuser_DOB()+"','" +user.getuser_contactnum()+"','" +user.getuser_username()+"','" +user.getuser_password()+"