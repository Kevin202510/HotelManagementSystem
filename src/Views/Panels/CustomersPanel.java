/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;
import Controllers.CustomerController;
import Models.Customers;
import Controllers.SQL;
import java.awt.Font;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CustomersPanel extends javax.swing.JPanel {

    public CustomerController custo = new CustomerController();
    
     public  SQL sql = new SQL();
     
     public Customers customers;
     
     public void showCustomers() throws SQLException{
         ArrayList<Customers> list = custo.custList();
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
         Object[] row = new Object[8];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getcust_id();
            row[1] = list.get(i).getcust_fullname();
            row[2] = list.get(i).getcust_address();
            row[3] = list.get(i).getcust_contactnum();
            model.addRow(row);
         }
    }
    
    public void createCustomer(Customers customers) throws SQLException{
        
        Connection con = sql.getConnection();
        String insert = "INSERT INTO customers(cust_Fname,cust_Mname,cust_Lname,cust_address,cust_contactnum) VALUES (?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setString(1, customers.getcust_Fname());
        st.setString(2, customers.getcust_Mname());
        st.setString(3, customers.getcust_Lname());
        st.setString(4, customers.getcust_address());
        st.setString(5, customers.getcust_contactnum());
        int i = st.executeUpdate();
        if (i > 0) {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        showCustomers();
        JOptionPane.showMessageDialog(null,"Successfully Check in!!");
        cusFname.setText("");
        cusMname.setText("");
        cusLname.setText("");
        cusAddress.setText("");
        cusContact.setText("");
////            new  Login().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
    public CustomersPanel() throws SQLException{
        initComponents();
        showCustomers();
        showRooms();
        jTable1.getTableHeader().setFont(new Font("Segoe UI", 1 , 16));
    
    }

/**
     * Creates new form Customers
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cusFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusMname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cusLname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cusAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cusContact = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        rooms = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 51, 51));
        setMinimumSize(new java.awt.Dimension(1480, 790));
        setPreferredSize(new java.awt.Dimension(1486, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customers");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 11, 301, 83));

        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fullname", "Address", "Contact #"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 100, 1150, 690));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("CUSTO ACTIONS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 54));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel3.setText("First name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 73, 41));
        jPanel1.add(cusFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 72, 213, 41));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 13)); // NOI18N
        jLabel4.setText("Middle name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, 73, 41));
        jPanel1.add(cusMname, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 119, 213, 41));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel5.setText("Last name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 166, 73, 41));
        jPanel1.add(cusLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 166, 213, 41));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, 73, 41));
        jPanel1.add(cusAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 213, 213, 41));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jLabel7.setText("Contact #");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 73, 41));
        jPanel1.add(cusContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 260, 213, 41));

        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 581, 126, 61));

        delete.setText("DELETE");
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 581, 126, 61));

        jLabel8.setText("ROOMS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 307, 73, 36));

        jPanel1.add(rooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
       customers = new Customers(0,cusFname.getText(),cusMname.getText(),cusLname.getText(),cusAddress.getText(),cusContact.getText());
        try {
            createCustomer(customers);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerActions.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_saveActionPerformed
    public void showRooms(){
         SQL sql = new SQL();
        Connection con = sql.getConnection();
        String tanong = "Select * from rooms where status=1";
        try{
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(tanong);
//        Customers customers;
        
        while(rs.next()){
         String vin = String.valueOf(rs.getInt("room_id"));
         rooms.addItem(vin);
        }}
        catch (SQLException ex) {
            Logger.getLogger(CustomerActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cusAddress;
    private javax.swing.JTextField cusContact;
    private javax.swing.JTextField cusFname;
    private javax.swing.JTextField cusLname;
    private javax.swing.JTextField cusMname;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> rooms;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
