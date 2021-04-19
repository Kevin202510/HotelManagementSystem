/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Users;
import Views.Authentication.Login;
import Views.Authentication.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public void createUser(Users user) throws SQLException{
        Connection con = sql.getConnection();
        String insert = "INSERT INTO users(role_id,user_Fname,user_Mname,user_Lname,user_address,user_DOB,user_contactnum,user_username,user_password) VALUES ('3','" +user.getuser_Fname()+ "','" +user.getuser_Mname()+"','" +user.getuser_Lname()+"','" +user.getuser_address()+"','" +user.getuser_DOB()+"','" +user.getuser_contactnum()+"','" +user.getuser_username()+"','" +user.getuser_password()+"')";
        PreparedStatement st = con.prepareStatement(insert);
        int i = st.executeUpdate();
        if (i > 0) {
            JOptionPane.showMessageDialog(null,"Successfully Register!!");
            new  Login().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
