/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
import javax.swing.ListCellRenderer;

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
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }else{
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }
           setFont(list.getFont());
           
           return this;
           
        }
        
         public DefaultComboBoxModel pop(String fullname,int user_id) throws SQLException{
             String profile="";
           SQL sql = new SQL();
           Connection con = sql.getConnection();
           String tanong = "SELECT * FROM `users` WHERE user_id='"+user_id+"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(tanong);
            while(rs.next()){
                  profile=rs.getString("profile");
            }
            
             ImageIcon vin = new ImageIcon(getClass().getResource("/Images/Pictures/"+profile+".jpg"));
            Image kevs = vin.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            ImageIcon shit = new ImageIcon(kevs);
            
        DefaultComboBoxModel kev = new DefaultComboBoxModel();
        kev.addElement(new ImagesNText(shit,fullname));
        kev.addElement(new ImagesNText(new ImageIcon("src\\Images\\logout.png"),"LOG OUT"));
        kev.addElement(new ImagesNText(new ImageIcon("src\\Images\\logout.png"),"LOG OUT"));
        return kev;
    }
        
    }
