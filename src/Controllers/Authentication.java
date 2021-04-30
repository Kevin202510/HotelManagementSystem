/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Dashboards.AdminDashboard;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author CALUAG FAMILY
 */
public class Authentication {
    
    public static String decrypt(String str){
	String storen2 = "";
		
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
		
            int asci = (int)c - 5;
	    storen2 += (char) asci;
        }
        return storen2;
      }
    
    public String encrypt(String str){
	String storen = "";
		
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
		
            int asci = (int)c + 5;
	    storen += (char) asci;
        }
        return storen;
    }
    
    public void signIn(JFrame out,JTextField username,JPasswordField password){
        String uname=username.getText();
        String pass=encrypt(String.valueOf(password.getPassword()));
             try {
                SQL sql = new SQL();
                Connection con;
                con = sql.getConnection();
                String tanong = "Select * from users INNER JOIN roles ON users.role_id = roles.role_id where user_username= ? AND user_password= ?";
                PreparedStatement st = con.prepareStatement(tanong);
                st.setString(1,uname);
                st.setString(2,pass);
                ResultSet rs = st.executeQuery();
                if(rs.next()){
                    int role_id;
                    role_id = Integer.parseInt(rs.getString("role_id"));
                    String fullname;
                    fullname = rs.getString("user_Fname") + " " + rs.getString("user_Mname")  + " " + rs.getString("user_Lname");
                    String roles;
                    roles = rs.getString("role_displayname");
                    JOptionPane.showMessageDialog(out,"Welcome to Our System " + uname.toUpperCase());
                    if (role_id==1) {
                      new  AdminDashboard(fullname,roles).setVisible(true);
                      out.dispose();
                    }else if (role_id==2) {
                      new  AdminDashboard(fullname,roles).setVisible(true);
                      out.dispose();  
                    }else{
                      new  AdminDashboard(fullname,roles).setVisible(true);
                      out.dispose();  
                    }
                }else{
                    JOptionPane.showMessageDialog(out,"Error");
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(out,e);
            }
    }
    
}
