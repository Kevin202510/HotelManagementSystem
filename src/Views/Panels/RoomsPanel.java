/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;
import Controllers.RoomController;
import Models.Rooms;
import Controllers.SQL;
import java.awt.Font;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chelsea
 * 
 */
public class RoomsPanel extends javax.swing.JPanel {
    public RoomController roomso = new RoomController();
    
     public  SQL sql = new SQL();
     
     public Rooms roomss;
    
       public void showRooms() throws SQLException{
        RoomController rooms = new RoomController();
         ArrayList<Rooms> list = rooms.roomList();
         DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
         Object[] row = new Object[5];
         for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getroom_id();
            row[1] = list.get(i).getbed();
            row[2] = list.get(i).getroomtype();
            row[3] = list.get(i).getrates();
            row[4] = list.get(i).getstatus();
            model.addRow(row);
         }
       }
    


  public void createRooms(Rooms rooms) throws SQLException{
        
        Connection con = sql.getConnection();
        String insert = "INSERT INTO rooms(room_id,RT_id,bed_id,rate_id,status) VALUES (?,?,?,?,?)";
        PreparedStatement st = con.prepareStatement(insert);
        st.setInt(1, rooms.getroom_id());
        st.setInt(2, rooms.getRT_id());
        st.setInt(3, rooms.getbed_id());
        st.setInt(4, rooms.getrate_id());
        st.setString(5, rooms.getstatus());
        int i = st.executeUpdate();
        if (i > 0) {
        DefaultTableModel model = (DefaultTableModel)roomstable.getModel();
        model.setRowCount(0);
        showRooms();
        JOptionPane.showMessageDialog(null,"Successfully Check in!!");
        Roomid.setText("");
        Roomtype.setText("");
        Bedtype.setText("");
        Rate.setText("");
        Status.setText("");
        } else {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    
  
    public RoomsPanel() throws SQLException{
        initComponents();
        showRooms();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Roomid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Roomtype = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Bedtype = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Rate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Status = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomstable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(0, 77, 77));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rooms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2084, -1));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 191, 191));
        jLabel2.setText("ROOM ACTIONS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 54));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 72, 73, 41));

        Roomid.setBackground(new java.awt.Color(0, 77, 77));
        Roomid.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Roomid.setForeground(new java.awt.Color(255, 255, 255));
        Roomid.setBorder(null);
        jPanel2.add(Roomid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 213, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Type");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, 41));

        Roomtype.setBackground(new java.awt.Color(0, 77, 77));
        Roomtype.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Roomtype.setForeground(new java.awt.Color(255, 255, 255));
        Roomtype.setBorder(null);
        jPanel2.add(Roomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 210, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bed Type");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, 41));

        Bedtype.setBackground(new java.awt.Color(0, 77, 77));
        Bedtype.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Bedtype.setForeground(new java.awt.Color(255, 255, 255));
        Bedtype.setBorder(null);
        jPanel2.add(Bedtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 213, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rate");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 73, 41));

        Rate.setBackground(new java.awt.Color(0, 77, 77));
        Rate.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Rate.setForeground(new java.awt.Color(255, 255, 255));
        Rate.setBorder(null);
        jPanel2.add(Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 210, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 73, 41));

        Status.setBackground(new java.awt.Color(0, 77, 77));
        Status.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(255, 255, 255));
        Status.setBorder(null);
        jPanel2.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 213, 30));

        save.setBackground(new java.awt.Color(51, 102, 255));
        save.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 126, 61));

        delete.setBackground(new java.awt.Color(51, 102, 255));
        delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete.setText("DELETE");
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 126, 61));

        roomstable.setBackground(new java.awt.Color(191, 191, 191));
        roomstable.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        roomstable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Type", "Bed Type", "Rate", "Status"
            }
        ));
        roomstable.setPreferredSize(new java.awt.Dimension(300, 0));
        jScrollPane1.setViewportView(roomstable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 1140, 700));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 210, -1));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 210, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 210, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 210, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, -1, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
//     roomss = new Rooms(Roomid.getText(),Roomtype.getText(),Bedtype.getText(),Rate.getText(),Status.getText());
        try {
            createRooms(roomss);
        } catch (SQLException ex) {
            //            Logger.getLogger(roomsomerActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bedtype;
    private javax.swing.JTextField Rate;
    private javax.swing.JTextField Roomid;
    private javax.swing.JTextField Roomtype;
    private javax.swing.JTextField Status;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable roomstable;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
