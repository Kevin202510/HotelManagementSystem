/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import static Views.Dashboards.StaffButtons.fullname;
import Views.Panels.NewJFrame;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class ImagesNText {

         public ImageIcon img;
        public String name;
        
        public ImagesNText(ImageIcon img,String name) {
            this.img=img;
            this.name=name;
        }
        
        public ImageIcon getImg(){
            return img;
        }
        
        public void setImg(ImageIcon img){
            this.img=img;
        }
        
        public String getname(){
            return name;
        }
        
        public void setName(String name){
            this.name=name;
        }
        
    }
