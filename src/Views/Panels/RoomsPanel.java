/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;
import Controllers.ImagesNText;
import Controllers.PromoController;
import Controllers.RoomController;
import Models.Promos;
import Models.Rooms;
import Views.Dashboards.ContainerManipulator;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Chelsea
 * 
 */
public class RoomsPanel extends javax.swing.JPanel{
    
    ArrayList<Promos> promolists;
    public RoomController roomControll = new RoomController();
    PromoController promoControll;
    ArrayList<Rooms> roomlist = roomControll.roomList();
     public Rooms roomModel;
     public JPanel lalagyanan;
    public int index,index1,id;
    String role;
    
    public RoomsPanel(JPanel lalagyanan,String role) throws SQLException{
        this.promoControll = new PromoController(lalagyanan,role);
        initComponents();
        this.role=role;
        
        if(role.equals("Staff")){
                roomAction.setVisible(false);
                promoscroll.setVisible(false);
                jLabel9.setVisible(false);
                jbtn_save.setVisible(false);
                jtbl_rooms.setVisible(false);
                roomscroll.setVisible(false);
                roomstablestaff.getTableHeader().setFont(new Font("Tw Cen MT", 0, 18));
                roomstablestaff.getTableHeader().setBackground(Color.white);
                roomscrollstaff.setVisible(true);
                roomstablestaff.setVisible(true);
                roomControll.Room(roomstablestaff);
                jbtn_update.setVisible(false);
        }else{
            roomControll.Room(jtbl_rooms);
            if (roomlist.size()==0) {
                jtxt_Roomid.setText("1");
                InitRun();
        }else{
            index1 = roomlist.size()-1;
            index = roomlist.get(index1).getroom_id() + 1;        
            jtxt_Roomid.setText(String.valueOf(index));
            InitRun();
        }
            if(promolists.size()==0){
                jlbl_promoid.setText("1");
            }else{
                int indes = promolists.get(promolists.size()-1).getPromoId()+1;
                jlbl_promoid.setText(String.valueOf(indes));
            }
        }
        this.lalagyanan=lalagyanan;
    }
    
//    UDF
    private void InitRun() throws SQLException{
        jbtn_update.setVisible(false);
        jcbo_roomTypeId.setBackground(new Color(0, 0, 0, 0));
        jcbo_roomTypeId.setOpaque(false);
        jcbo_bedTypeId.setBackground(new Color(0, 0, 0, 0));
        jcbo_bedTypeId.setOpaque(false);
        jcbo_rateId.setBackground(new Color(0, 0, 0, 0));
        jcbo_rateId.setOpaque(false);
        jcbo_statusId.setBackground(new Color(0, 0, 0, 0));
        jcbo_statusId.setOpaque(false);
//        jcbo_promoid.setBackground(new Color(0, 0, 0, 0));
//        jcbo_promoid.setOpaque(false);
        roomControll.showRoomType(jcbo_roomTypeId);
//        roomControll.showPromo(jcbo_promoid);
        roomControll.showBedType(jcbo_bedTypeId);
        roomControll.showRate(jcbo_rateId);
        roomscrollstaff.setVisible(false);
        roomstablestaff.setVisible(false);
        promoControll.showPromos(jtbl_promos);
        promolists = promoControll.promoList();
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
        jtxt_room_search = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        roomAction = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxt_Roomid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jcbo_statusId = new javax.swing.JComboBox<>();
        jcbo_roomTypeId = new javax.swing.JComboBox<>();
        jcbo_bedTypeId = new javax.swing.JComboBox<>();
        jcbo_rateId = new javax.swing.JComboBox<>();
        jbtn_update = new javax.swing.JButton();
        jbtn_save = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jlbl_promoid = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtarea_desciption = new javax.swing.JTextArea();
        jtxt_discount = new javax.swing.JTextField();
        jbtn_promoupdate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        roomscroll = new javax.swing.JScrollPane();
        jtbl_rooms = new javax.swing.JTable();
        promoscroll = new javax.swing.JScrollPane();
        jtbl_promos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        roomscrollstaff = new javax.swing.JScrollPane();
        roomstablestaff = new javax.swing.JTable();
        jtxt_promos_search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 77, 77));
        setPreferredSize(new java.awt.Dimension(1480, 790));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 77, 77));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rooms");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 220, -1));

        jtxt_room_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_room_searchKeyPressed(evt);
            }
        });
        jPanel1.add(jtxt_room_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search..png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, -1));

        roomAction.setBackground(new java.awt.Color(0, 77, 77));
        roomAction.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 191, 191));
        jLabel2.setText("PROMO ACTIONS");
        roomAction.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, 20));

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room ID");
        roomAction.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 73, 40));

        jtxt_Roomid.setEditable(false);
        jtxt_Roomid.setBackground(new java.awt.Color(0, 77, 77));
        jtxt_Roomid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jtxt_Roomid.setForeground(new java.awt.Color(255, 255, 255));
        jtxt_Roomid.setBorder(null);
        roomAction.add(jtxt_Roomid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 213, 30));

        jLabel4.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Type");
        roomAction.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        jLabel5.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DISCOUNT");
        roomAction.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 100, 30));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rate");
        roomAction.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 73, 30));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Status");
        roomAction.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 73, 30));
        roomAction.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 210, -1));
        roomAction.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, -1));
        roomAction.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, -1));
        roomAction.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, -1));
        roomAction.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 210, -1));

        jcbo_statusId.setBackground(new java.awt.Color(0, 77, 77));
        jcbo_statusId.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jcbo_statusId.setForeground(new java.awt.Color(255, 255, 255));
        jcbo_statusId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Not Available" }));
        roomAction.add(jcbo_statusId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 210, 30));

        jcbo_roomTypeId.setBackground(new java.awt.Color(0, 77, 77));
        jcbo_roomTypeId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jcbo_roomTypeId.setForeground(new java.awt.Color(255, 255, 255));
        roomAction.add(jcbo_roomTypeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 210, 30));

        jcbo_bedTypeId.setBackground(new java.awt.Color(0, 77, 77));
        jcbo_bedTypeId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jcbo_bedTypeId.setForeground(new java.awt.Color(255, 255, 255));
        roomAction.add(jcbo_bedTypeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 210, 30));

        jcbo_rateId.setBackground(new java.awt.Color(0, 77, 77));
        jcbo_rateId.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jcbo_rateId.setForeground(new java.awt.Color(255, 255, 255));
        roomAction.add(jcbo_rateId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 210, 30));

        jbtn_update.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_update.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_update.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_update.setText("UPDATE");
        jbtn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_updateActionPerformed(evt);
            }
        });
        roomAction.add(jbtn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 126, 30));

        jbtn_save.setBackground(new java.awt.Color(51, 102, 255));
        jbtn_save.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        jbtn_save.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_save.setText("SAVE");
        jbtn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_saveActionPerformed(evt);
            }
        });
        roomAction.add(jbtn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 126, 30));

        roomAction.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 340, 310));

        jLabel11.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(191, 191, 191));
        jLabel11.setText("ROOM ACTIONS");
        roomAction.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 54));

        jLabel13.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Bed Type");
        roomAction.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, 30));

        jlbl_promoid.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jlbl_promoid.setForeground(new java.awt.Color(255, 255, 255));
        roomAction.add(jlbl_promoid, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 170, 30));

        jLabel14.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DESCRIPTION");
        roomAction.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 320, 30));

        jLabel15.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID");
        roomAction.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 40, 30));

        jtxtarea_desciption.setEditable(false);
        jtxtarea_desciption.setColumns(20);
        jtxtarea_desciption.setLineWrap(true);
        jtxtarea_desciption.setRows(5);
        jtxtarea_desciption.setTabSize(4);
        jScrollPane2.setViewportView(jtxtarea_desciption);

        roomAction.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 320, 90));

        jtxt_discount.setEditable(false);
        roomAction.add(jtxt_discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 220, 30));

        jbtn_promoupdate.setText("UPDATE");
        jbtn_promoupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_promoupdateActionPerformed(evt);
            }
        });
        roomAction.add(jbtn_promoupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 120, 30));

        roomAction.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 340, 260));

        add(roomAction, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 86, 360, 710));

        jtbl_rooms.setBackground(new java.awt.Color(191, 191, 191));
        jtbl_rooms.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jtbl_rooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Type", "Bed Type", "Rate", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_rooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_roomsMouseClicked(evt);
            }
        });
        roomscroll.setViewportView(jtbl_rooms);

        add(roomscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 1110, 320));

        jtbl_promos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Description", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbl_promos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbl_promosMouseClicked(evt);
            }
        });
        promoscroll.setViewportView(jtbl_promos);

        add(promoscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 467, 1110, 310));

        jLabel9.setBackground(new java.awt.Color(0, 77, 77));
        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PROMOS");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, 320, 60));

        roomscrollstaff.setBackground(new java.awt.Color(0, 77, 77));

        roomstablestaff.setBackground(new java.awt.Color(191, 191, 191));
        roomstablestaff.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        roomstablestaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Room Type", "Bed Type", "Rate", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roomstablestaff.setEnabled(false);
        roomstablestaff.setGridColor(new java.awt.Color(0, 77, 77));
        roomstablestaff.setRowHeight(40);
        roomstablestaff.setSelectionBackground(new java.awt.Color(0, 77, 77));
        roomstablestaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomstablestaffMouseClicked(evt);
            }
        });
        roomscrollstaff.setViewportView(roomstablestaff);

        add(roomscrollstaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1470, 690));

        jtxt_promos_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxt_promos_searchKeyPressed(evt);
            }
        });
        add(jtxt_promos_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_saveActionPerformed
//        JOptionPane.showMessageDialog(null,"1");
        int roomtype=jcbo_roomTypeId.getSelectedIndex()+1;
        int bedtype=jcbo_bedTypeId.getSelectedIndex()+1;
        int rate=jcbo_rateId.getSelectedIndex()+1;
//        int promoid=jcbo_promoid.getSelectedIndex();
        int status=jcbo_statusId.getSelectedIndex();
        if (status==0) {
            roomModel = new Rooms(id,bedtype,roomtype,rate,status+1);  
        }else{
            roomModel = new Rooms(id,bedtype,roomtype,rate,status-1);
        }
        try {
            boolean checkRoom = roomControll.createRooms(roomModel,jtbl_rooms);
            if (checkRoom==true) {
//                roomControll.clearContent(Roomid, roomType, Bedtype, Rate, Status);
                new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan,role));
            }
        } catch (SQLException ex) {
            //            Logger.getLogger(roomsomerActions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_saveActionPerformed

    private void jbtn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_updateActionPerformed
         int roomtype=jcbo_roomTypeId.getSelectedIndex()+1;
        int bedtype=jcbo_bedTypeId.getSelectedIndex()+1;
        int rate=jcbo_rateId.getSelectedIndex()+1;
//        int promoid=jcbo_promoid.getSelectedIndex();
        int status=jcbo_statusId.getSelectedIndex();
        if (status==0) {
            roomModel = new Rooms(id,bedtype,roomtype,rate,status+1);  
        }else{
            roomModel = new Rooms(id,bedtype,roomtype,rate,status-1);
        }
        boolean checkUpdate;
        try {
            checkUpdate = roomControll.updateRooms(roomModel, id, jtbl_rooms);
             if (checkUpdate==true) {
                new ContainerManipulator(lalagyanan,new Views.Panels.RoomsPanel(lalagyanan,role));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_updateActionPerformed

    private void jtbl_roomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_roomsMouseClicked
        jbtn_update.setVisible(true);
        jbtn_save.setVisible(false);
        id = (int) jtbl_rooms.getValueAt(jtbl_rooms.getSelectedRow(),0);
        try {
            roomControll.fillRoomForm(id,jtxt_Roomid, jcbo_roomTypeId, jcbo_bedTypeId, jcbo_rateId,jcbo_statusId);
        } catch (SQLException ex) {
            Logger.getLogger(RoomsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtbl_roomsMouseClicked

    private void roomstablestaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomstablestaffMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roomstablestaffMouseClicked

    private void jbtn_promoupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_promoupdateActionPerformed
        int id = Integer.parseInt(jlbl_promoid.getText());
        double discount = Double.parseDouble(jtxt_discount.getText());
        Promos promos;
        promos = new Promos(id,jtxtarea_desciption.getText(),discount);
        try {
            promoControll.updatePromos(promos, roomstablestaff);
        } catch (SQLException ex) {
            Logger.getLogger(RoomsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtn_promoupdateActionPerformed

    private void jtxt_room_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_room_searchKeyPressed
        // ROOMS SEARCH
        DefaultTableModel model = (DefaultTableModel)jtbl_rooms.getModel(); 
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        jtbl_rooms.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_room_search.getText().trim()));
        
         search();
           
    }//GEN-LAST:event_jtxt_room_searchKeyPressed

    private void jtxt_promos_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxt_promos_searchKeyPressed
        // PROMOS
           DefaultTableModel model = (DefaultTableModel)jtbl_promos.getModel();
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        jtbl_promos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_promos_search.getText().trim()));
           
    }//GEN-LAST:event_jtxt_promos_searchKeyPressed

     private void search() {                                            
        // ROOMS SEARCH
        DefaultTableModel model = (DefaultTableModel)roomstablestaff.getModel();
//        model.setRowCount(0);
        TableRowSorter<DefaultTableModel>tr = new TableRowSorter<DefaultTableModel>(model);
        roomstablestaff.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(jtxt_room_search.getText().trim()));
           
    }                                           
    
    
    private void jtbl_promosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbl_promosMouseClicked
       jlbl_promoid.setText(String.valueOf(jtbl_promos.getValueAt(jtbl_promos.getSelectedRow(),0)));
       jtxtarea_desciption.setText((String) jtbl_promos.getValueAt(jtbl_promos.getSelectedRow(),1));
       jtxt_discount.setText(String.valueOf(jtbl_promos.getValueAt(jtbl_promos.getSelectedRow(),2)));
       jtxtarea_desciption.setEditable(true);
       jtxt_discount.setEditable(true);
    }//GEN-LAST:event_jtbl_promosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton jbtn_promoupdate;
    private javax.swing.JButton jbtn_save;
    private javax.swing.JButton jbtn_update;
    private javax.swing.JComboBox<String> jcbo_bedTypeId;
    private javax.swing.JComboBox<String> jcbo_rateId;
    private javax.swing.JComboBox<String> jcbo_roomTypeId;
    private javax.swing.JComboBox<String> jcbo_statusId;
    private javax.swing.JLabel jlbl_promoid;
    private javax.swing.JTable jtbl_promos;
    private javax.swing.JTable jtbl_rooms;
    private javax.swing.JTextField jtxt_Roomid;
    private javax.swing.JTextField jtxt_discount;
    private javax.swing.JTextField jtxt_promos_search;
    private javax.swing.JTextField jtxt_room_search;
    private javax.swing.JTextArea jtxtarea_desciption;
    private javax.swing.JScrollPane promoscroll;
    private javax.swing.JPanel roomAction;
    private javax.swing.JScrollPane roomscroll;
    private javax.swing.JScrollPane roomscrollstaff;
    private javax.swing.JTable roomstablestaff;
    // End of variables declaration//GEN-END:variables

}
