/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import jroundborder.JLabelRound;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
    public class ImageTextRenderer extends JLabel implements ListCellRenderer{

        @Override
        public Component getListCellRendererComponent(JList list, Object val, int index, boolean selected, boolean focused) {
           ImagesNText it  = (ImagesNText) val;
           setIcon(it.getImg());
           setText(it.getname());
           
            if (selected) {
                setBackground(Color.decode("#538cc6"));
                setForeground(Color.WHITE);
            }else{
                setBackground(Color.decode("#538cc6"));
                setForeground(Color.WHITE);
            }
           setFont(new java.awt.Font("Rockwell Extra Bold", 1, 12));
           
           return this;
           
        }
        Image kevs;
         public DefaultComboBoxModel pop(int user_id) throws SQLException{
             String profile="";
             String fullname="";
           SQL sql = new SQL();
           Connection con = sql.getConnection();
           String tanong = "SELECT * FROM `users` WHERE user_id='"+user_id+"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);
            while(rs.next()){
                  profile=rs.getString("profile");
                  fullname = rs.getString("user_Fname") + " " + rs.getString("user_Mname") + " " + rs.getString("user_Lname");
            }
             if (profile==null) {
                   ImageIcon vin = new ImageIcon(getClass().getResource("/Images/Pictures/sampleuser.jpg"));
                kevs = vin.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
             }else{
                  ImageIcon vin = new ImageIcon(getClass().getResource("/Images/Pictures/"+profile+".jpg"));
                  kevs = vin.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);  
             }
            ImageIcon shit = new ImageIcon(kevs);
            
             ImageIcon vin1 = new ImageIcon(getClass().getResource("/Images/gearmoto.gif"));
        DefaultComboBoxModel kev = new DefaultComboBoxModel();
        kev.addElement(new ImagesNText(shit,fullname));
        kev.addElement(new ImagesNText(new ImageIcon("src\\Images\\checkout.png"),"LOG OUT"));
        kev.addElement(new ImagesNText(vin1,"Developer Settings"));
        return kev;
    }
        
    }
