/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Roles;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Chelsea
 */
public class RoleController {
     public ArrayList<Roles> roleList = new ArrayList<>();
    public SQL sql = new SQL();
    
//    store data
    
    public ArrayList<Roles> roleList() throws SQLException{
        Connection con = sql.getConnection();
        String tanong = "SELECT * FROM roles";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Roles roles;
        
        while(rs.next()){
           roles=new Roles(rs.getInt("role_id"),rs.getString("role_displayname"));
            roleList.add(roles);
        }
        return roleList;   
    }
     public void showRoles() throws SQLException{
        ArrayList<Roles> list = roleList();
        Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getrole_id() + " " +
            list.get(i).getrole_displayname();
            JOptionPane.showMessageDialog(null,name);
          //model.addRow(row);
         }
    }
    
    public static void main(String args[]) throws SQLException{
        new RoleController().showRoles();
    }
    
    
    
}
