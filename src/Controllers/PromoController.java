/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Promos;
import Views.Dashboards.ContainerManipulator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import sweetalerts.Alerts;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class PromoController {

SQL sql = new SQL();
JPanel lalagyanan;
Connection con = sql.getConnection();
 String role;
    
    public PromoController(JPanel lalagyanan,String role){
        this.lalagyanan=lalagyanan;
        this.role=role;
    }
   
    
    public ArrayList<Promos> promoList() throws SQLException{
        ArrayList<Promos> PromoList = new ArrayList<>();
        String tanong = "SELECT * FROM promos";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
        Promos promos;
        
        while(rs.next()){
            promos=new Promos(rs.getInt("id"),rs.getString("description"),rs.getDouble("discount"));
            PromoList.add(promos);
        }
        return PromoList;   
    }
    
    public void showPromos(JTable promotable) throws SQLException{
        ArrayList<Promos> list = promoList();
        DefaultTableModel model = (DefaultTableModel)promotable.getModel();
         Object[] row = new Object[3];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getPromoId();
            row[1] = list.get(i).getDescription();
            row[2] = list.get(i).getDiscount();
            model.addRow(row);
          }
    }
    
   Promos promosModel;
   
    public void createNewPromos(JLabel id,JTextArea description,JTextField discount,JTable promostable) throws SQLException{
        double diss = Integer.parseInt(discount.getText());
        double dis = diss/100;
        promosModel = new Promos(Integer.parseInt(id.getText()),description.getText(),dis);
        
        String addPromos = "INSERT INTO promos (description,discount)VALUES(?,?)";
        PreparedStatement st = con.prepareStatement(addPromos);
        st.setString(1,promosModel.getDescription());
        st.setDouble(2, promosModel.getDiscount());
        
        int i = st.executeUpdate();
        if (i>0) {
            DefaultTableModel model = (DefaultTableModel)promostable.getModel();
                model.setRowCount(0);
               new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan,role));
            new Alerts("save").setVisible(true);
            } else {
                new Alerts("error").setVisible(true);
            }
        
    }
}
