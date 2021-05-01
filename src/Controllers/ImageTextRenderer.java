/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Component;
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
        
    }
