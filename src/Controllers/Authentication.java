/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Views.Dashboards.MainDashboard;
import Views.Panels.CheckoutPanels;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import sweetalerts.Alerts;

/**
 *
 * @author CALUAG FAMILY
 */
//ProfileSettings vins = new ProfileSettings();

public class Authentication {
    
    public String decrypt(String str){
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
    
    public void signIn(JFrame out,JTextField username,JPasswordField password) throws InterruptedException{
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
                    int user_id;
                    
                    user_id=rs.getInt("user_id");
                    role_id = Integer.parseInt(rs.getString("role_id"));
                    String fullname;
                    fullname = rs.getString("user_Fname") + " " + rs.getString("user_Mname")  + " " + rs.getString("user_Lname");
                    String roles;
                    roles = rs.getString("role_displayname");
//                    new CheckoutPanels(user_id).user_id.setText(String.valueOf(user_id));
                    if (role_id==1) {
                      new  MainDashboard(user_id,fullname,roles).setVisible(true);
                      out.dispose();
                    }else if (role_id==2) {
                      new  MainDashboard(user_id,fullname,roles).setVisible(true);
                      out.dispose();  
                    }else{
                      new  MainDashboard(user_id,fullname,roles).setVisible(true);
                      out.dispose();  
                    }
                    new Alerts("success").setVisible(true);
                    
                }else{
                    new Alerts("error").setVisible(true);
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(out,e);
            }
    }
    
}
