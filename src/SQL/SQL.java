/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class SQL {
    
    
    public void connection() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagement","root","");
            Statement st = con.createStatement();
            String tanong = "Select * from users where role_id=3";
            ResultSet rs = st.executeQuery(tanong);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
