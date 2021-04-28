/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;


import Controllers.BedsController;
import Controllers.RatesController;
import Controllers.RoomTypesController;
import Controllers.SQL;
import Models.Roomtypes;
import Models.Rates;
import Models.Beds;
import Views.Dashboards.ContainerManipulator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chelsea
 */
public class Rate_RT_BedPanels extends javax.swing.JPanel {
    
    public RoomTypesController roomtypeControll = new RoomTypesController();  
            public RoomTypesController roomtype = new RoomTypesController();
            
    public RatesController rateControll = new RatesController();  
            public RatesController rate = new RatesController();
            
    public BedsController bedControll = new BedsController();  
        public BedsController bed = new BedsController();   
        
        public  SQL sql = new SQL();
        public JPanel lalagyanan;
    /**
     * Creates new form Rate_RT_BedPanels
     */
    public Rate_RT_BedPanels(JPanel lalagyanan) throws SQLException {
        initComponents();
        this.lalagyanan=lalagyanan;
        roomtype.showRoomtypes(RTtable);
        rate.showRates(ratestable);
        bed.showBeds(bedtable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ratestable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bedtable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        RTtable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BedID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BedQuantity = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RateID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RoomPrice = new javax.swing.JTextField();
        save1 = new javax.swing.JButton();
        delete1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RTid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RoomType = new javax.swing.JTextField();
        save2 = new javax.swing.JButton();
        delete2 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        ratestable.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        ratestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rate ID", "Rate Price"
            }
        ));
        ratestable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratestableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ratestable);

        bedtable.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        bedtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed ID", "Bed Quantity"
            }
        ));
        bedtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bedtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bedtable);

        RTtable.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        RTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RT ID", "Room Type"
            }
        ));
        RTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RTtable);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOMTYPES-RATES-BEDS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(680, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 191, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BED ACTION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bed ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 73, 41));

        BedID.setBackground(new java.awt.Color(0, 77, 77));
        BedID.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        BedID.setForeground(new java.awt.Color(255, 255, 255));
        BedID.setBorder(null);
        BedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedIDActionPerformed(evt);
            }
        });
        jPanel2.add(BedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 200, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bed Quantity");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 110, 41));

        BedQuantity.setBackground(new java.awt.Color(0, 77, 77));
        BedQuantity.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        BedQuantity.setForeground(new java.awt.Color(255, 255, 255));
        BedQuantity.setBorder(null);
        jPanel2.add(BedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));

        save.setBackground(new java.awt.Color(51, 102, 255));
        save.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 126, 50));

        delete.setBackground(new java.awt.Color(51, 102, 255));
        delete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete.setText("DELETE");
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 126, 50));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 102, 200, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 10));

        jPanel3.setBackground(new java.awt.Color(0, 77, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 191, 191));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RATE ACTION");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 54));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rate ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 73, 41));

        RateID.setBackground(new java.awt.Color(0, 77, 77));
        RateID.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        RateID.setForeground(new java.awt.Color(255, 255, 255));
        RateID.setBorder(null);
        RateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateIDActionPerformed(evt);
            }
        });
        jPanel3.add(RateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 200, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room Price");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 41));

        RoomPrice.setBackground(new java.awt.Color(0, 77, 77));
        RoomPrice.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        RoomPrice.setForeground(new java.awt.Color(255, 255, 255));
        RoomPrice.setBorder(null);
        jPanel3.add(RoomPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));

        save1.setBackground(new java.awt.Color(51, 102, 255));
        save1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save1.setText("SAVE");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel3.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 126, 50));

        delete1.setBackground(new java.awt.Color(51, 102, 255));
        delete1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete1.setText("DELETE");
        jPanel3.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 126, 50));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 102, 200, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, 10));

        jPanel4.setBackground(new java.awt.Color(0, 77, 77));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(191, 191, 191));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ROOMTYPE ACTION");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 54));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RT ID");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 41));

        RTid.setBackground(new java.awt.Color(0, 77, 77));
        RTid.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        RTid.setForeground(new java.awt.Color(255, 255, 255));
        RTid.setBorder(null);
        RTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTidActionPerformed(evt);
            }
        });
        jPanel4.add(RTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 200, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Room Type");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 100, 41));

        RoomType.setBackground(new java.awt.Color(0, 77, 77));
        RoomType.setFont(new java.awt.Font("Bell MT", 0, 14)); // NOI18N
        RoomType.setForeground(new java.awt.Color(255, 255, 255));
        RoomType.setBorder(null);
        jPanel4.add(RoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 30));

        save2.setBackground(new java.awt.Color(51, 102, 255));
        save2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        save2.setText("SAVE");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel4.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 126, 50));

        delete2.setBackground(new java.awt.Color(51, 102, 255));
        delete2.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        delete2.setText("DELETE");
        jPanel4.add(delete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 126, 50));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 102, 200, 10));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ratestableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratestableMouseClicked
       // JOptionPane.showMessageDialog(null,"hello");
       // update.setVisible(true);
       // save.setVisible(false);
       // id = (int) roomstable.getValueAt(roomstable.getSelectedRow(),0);
        //        roomTypeId.setSelectedIndex(2);
       // try {
           // roomControll.fillRoomForm(id,Roomid, roomTypeId, bedTypeId, rateId, statusId);
       // } catch (SQLException ex) {
           // Logger.getLogger(RoomsPanel.class.getName()).log(Level.SEVERE, null, ex);
       // }
    }//GEN-LAST:event_ratestableMouseClicked

    private void bedtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bedtableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bedtableMouseClicked

    private void RTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTtableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RTtableMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
         
    }//GEN-LAST:event_saveActionPerformed

    private void BedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BedIDActionPerformed

    private void RateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RateIDActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save1ActionPerformed

    private void RTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RTidActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        Connection con = sql.getConnection();
        String insert = "INSERT INTO roomtypes(RT_id,room_type) VALUES (?,?)";
        try {
            PreparedStatement st = con.prepareStatement(insert);
            st.setInt(1, Integer.parseInt(RTid.getText()));
            st.setString(2, RoomType.getText());
            int i = st.executeUpdate();
            if (i > 0) {
                DefaultTableModel model = (DefaultTableModel)RTtable.getModel();
               model.setRowCount(0);
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            JOptionPane.showMessageDialog(null,"Successfully Added!!");
            } else {
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_save2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BedID;
    private javax.swing.JTextField BedQuantity;
    private javax.swing.JTextField RTid;
    private javax.swing.JTable RTtable;
    private javax.swing.JTextField RateID;
    private javax.swing.JTextField RoomPrice;
    private javax.swing.JTextField RoomType;
    private javax.swing.JTable bedtable;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable ratestable;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    // End of variables declaration//GEN-END:variables
}
