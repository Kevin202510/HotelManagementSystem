/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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

         public Icon img;
        public String name;
        
        public ImagesNText(Icon img,String name) {
            this.img=img;
            this.name=name;
        }
        
        public Icon getImg(){
            return img;
        }
        
        public void setImg(Icon img){
            this.img=img;
        }
        
        public String getname(){
            return name;
        }
        
        public void setName(String name){
            this.name=name;
        }
        
    }
