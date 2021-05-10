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
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
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
    
    
    
   
        public  SQL sql = new SQL();
        public JPanel lalagyanan;
         public int index,index1,id;
         RoomTypesController roomtypeControll = new RoomTypesController(lalagyanan); 
         ArrayList<Roomtypes> roomtypelist = roomtypeControll.roomtypeList();
         RatesController ratesControll = new RatesController(lalagyanan); 
         ArrayList<Rates> ratelist = ratesControll.rateList();
         BedsController bedsControll = new BedsController(lalagyanan); 
         ArrayList<Beds> bedlist = bedsControll.bedList();
    /**
     * Creates new form Rate_RT_BedPanels
     */
    public Rate_RT_BedPanels(JPanel lalagyanan) throws SQLException {
        initComponents();
        this.lalagyanan=lalagyanan;
        roomtypeControll = new RoomTypesController(lalagyanan);
        ratesControll=new RatesController(lalagyanan);
        bedsControll=new BedsController(lalagyanan);
        roomtypeControll.showRoomtypes(RTtable);
        ratesControll.showRates(ratestable);
       bedsControll.showBeds(bedtable);
   

       
       
            if (roomtypelist.size()==0) {
                RTid.setText("1");
          
            }else{
                index1 = roomtypelist.size()-1;
                JOptionPane.showMessageDialog(null,index1);
                index = roomtypelist.get(index1).getRT_id() + 1;        
                RTid.setText(String.valueOf(index));

            }
//    }

         if (ratelist.size()==0) {
            RateID.setText("1");
          
        }else{
            index1 = ratelist.size()-1;
            index = ratelist.get(index1).getrate_id() + 1;        
            RateID.setText(String.valueOf(index));
    
        }
          if (bedlist.size()==0) {
            BedID.setText("1");
          
        }else{
            index1 = bedlist.size()-1;
            index = bedlist.get(index1).getbed_id() + 1;        
            BedID.setText(String.valueOf(index));
          }
          tagokamuna();
}
    
    
    
    
    public void tagokamuna(){
        RTdelete.setVisible(false);
        Ratedelete.setVisible(false);
         Beddelete.setVisible(false);
    }
    
    public void labaskana(){
        RTdelete.setVisible(true);
         Ratedelete.setVisible(true);
          Beddelete.setVisible(true);
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
        jLabel7 = new javax.swing.JLabel();
        BedQuantity = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        BedID = new javax.swing.JTextField();
        Beddelete = new javax.swing.JButton();
        Bedsave = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RateID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RatePrice = new javax.swing.JTextField();
        Ratesave = new javax.swing.JButton();
        Ratedelete = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RTid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RoomType = new javax.swing.JTextField();
        RTsave = new javax.swing.JButton();
        RTdelete = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(213, 221, 221));
        setPreferredSize(new java.awt.Dimension(1480, 790));

        ratestable.setBackground(new java.awt.Color(191, 191, 191));
        ratestable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        ratestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rate ID", "Rate Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ratestable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ratestableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ratestable);

        bedtable.setBackground(new java.awt.Color(191, 191, 191));
        bedtable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        bedtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bed ID", "Bed Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bedtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bedtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bedtable);

        RTtable.setBackground(new java.awt.Color(191, 191, 191));
        RTtable.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        RTtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RT ID", "Room Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RTtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RTtableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RTtable);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOMTYPES-RATES-BEDS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 26, 778, -1));

        jPanel2.setBackground(new java.awt.Color(0, 77, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(191, 191, 191));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BED ACTION");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 50));

        jLabel6.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bed ID");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 60, 60, 41));

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bed Quantity");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 41));

        BedQuantity.setBackground(new java.awt.Color(0, 77, 77));
        BedQuantity.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BedQuantity.setForeground(new java.awt.Color(255, 255, 255));
        BedQuantity.setBorder(null);
        BedQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BedQuantityKeyTyped(evt);
            }
        });
        jPanel2.add(BedQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 170, 30));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 190, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 170, 10));

        BedID.setBackground(new java.awt.Color(153, 255, 51));
        BedID.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BedID.setForeground(new java.awt.Color(255, 255, 255));
        BedID.setBorder(null);
        BedID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedIDActionPerformed(evt);
            }
        });
        BedID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BedIDKeyTyped(evt);
            }
        });
        jPanel2.add(BedID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 190, 30));

        Beddelete.setBackground(new java.awt.Color(51, 102, 255));
        Beddelete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Beddelete.setText("DELETE");
        Beddelete.setPreferredSize(new java.awt.Dimension(63, 23));
        Beddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeddeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Beddelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 30));

        Bedsave.setBackground(new java.awt.Color(51, 102, 255));
        Bedsave.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Bedsave.setText("SAVE");
        Bedsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedsaveActionPerformed(evt);
            }
        });
        jPanel2.add(Bedsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 30));

        jPanel3.setBackground(new java.awt.Color(0, 77, 77));
        jPanel3.setPreferredSize(new java.awt.Dimension(310, 212));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(191, 191, 191));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RATE ACTION");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 50));

        jLabel9.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rate ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 73, 41));

        RateID.setBackground(new java.awt.Color(0, 77, 77));
        RateID.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RateID.setForeground(new java.awt.Color(255, 255, 255));
        RateID.setBorder(null);
        RateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RateIDActionPerformed(evt);
            }
        });
        RateID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RateIDKeyTyped(evt);
            }
        });
        jPanel3.add(RateID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room Price");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 41));

        RatePrice.setBackground(new java.awt.Color(0, 77, 77));
        RatePrice.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RatePrice.setForeground(new java.awt.Color(255, 255, 255));
        RatePrice.setBorder(null);
        RatePrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RatePriceKeyTyped(evt);
            }
        });
        jPanel3.add(RatePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 30));

        Ratesave.setBackground(new java.awt.Color(51, 102, 255));
        Ratesave.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Ratesave.setText("SAVE");
        Ratesave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatesaveActionPerformed(evt);
            }
        });
        jPanel3.add(Ratesave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, 30));

        Ratedelete.setBackground(new java.awt.Color(51, 102, 255));
        Ratedelete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        Ratedelete.setText("DELETE");
        Ratedelete.setPreferredSize(new java.awt.Dimension(63, 23));
        Ratedelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RatedeleteActionPerformed(evt);
            }
        });
        jPanel3.add(Ratedelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 110, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 190, 10));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 180, 10));

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
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 41));

        RTid.setBackground(new java.awt.Color(0, 77, 77));
        RTid.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RTid.setForeground(new java.awt.Color(255, 255, 255));
        RTid.setBorder(null);
        RTid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTidActionPerformed(evt);
            }
        });
        RTid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RTidKeyTyped(evt);
            }
        });
        jPanel4.add(RTid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 200, 30));

        jLabel12.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Room Type");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 100, 41));

        RoomType.setBackground(new java.awt.Color(0, 77, 77));
        RoomType.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        RoomType.setForeground(new java.awt.Color(255, 255, 255));
        RoomType.setBorder(null);
        RoomType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RoomTypeKeyTyped(evt);
            }
        });
        jPanel4.add(RoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 180, 30));

        RTsave.setBackground(new java.awt.Color(51, 102, 255));
        RTsave.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        RTsave.setText("SAVE");
        RTsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTsaveActionPerformed(evt);
            }
        });
        jPanel4.add(RTsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 30));

        RTdelete.setBackground(new java.awt.Color(51, 102, 255));
        RTdelete.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 11)); // NOI18N
        RTdelete.setText("DELETE");
        RTdelete.setPreferredSize(new java.awt.Dimension(63, 23));
        RTdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(RTdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 110, 30));
        jPanel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 200, 10));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)))
            .addGroup(layout.createSequentialGroup()
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
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ratestableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ratestableMouseClicked
     try {
            id = (int) ratestable.getValueAt(ratestable.getSelectedRow(),0);
            ratesControll.fillForm(id, RateID, RatePrice);
            labaskana();
            Ratesave.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_ratestableMouseClicked

    private void bedtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bedtableMouseClicked
        // TODO add your handling code here:
        
         try {
            id = (int) bedtable.getValueAt(bedtable.getSelectedRow(),0);
            bedsControll.fillForm(id, BedID, BedQuantity);
            labaskana();
            Bedsave.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bedtableMouseClicked

    private void RTtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RTtableMouseClicked
        // TODO add your handling code here:
        
         try {
            id = (int) RTtable.getValueAt(RTtable.getSelectedRow(),0);
            roomtypeControll.fillForm(id, RTid, RoomType);
            labaskana();
            RTsave.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_RTtableMouseClicked

    private void BedsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedsaveActionPerformed

        
           if (checkInputsBed()==true) {
             JOptionPane.showMessageDialog(this,"ERROR");        
      }else{     
        try {
             
            bedsControll.saveBeds(BedID, BedQuantity, bedtable);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);          
            
        
    }              
           }   
        
    }//GEN-LAST:event_BedsaveActionPerformed

    private void BedIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BedIDActionPerformed

    private void RateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RateIDActionPerformed

    private void RatesaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatesaveActionPerformed
        // TODO add your handling code here:
        
        
           if (checkInputsRate()==true) {
             JOptionPane.showMessageDialog(this,"ERROR");        
      }else{     
        try {
             
            ratesControll.saveRates(RateID, RatePrice, ratestable);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);          
            
        }
           }   
    }//GEN-LAST:event_RatesaveActionPerformed

    private void RTidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RTidActionPerformed

    private void RTsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTsaveActionPerformed
      
         if (checkInputsRT()==true) {
             JOptionPane.showMessageDialog(this,"ERROR");
          
      }else{     
        try { 
            roomtypeControll.saveRT(RTid,RoomType,RTtable);
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
            
            
            
        }
         }
    }//GEN-LAST:event_RTsaveActionPerformed

    private void RTdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTdeleteActionPerformed
        // TODO add your handling code here:
        
          try {
            boolean checkDeleteRoomtypes = roomtypeControll.deleteRoomtypes(id, RTtable);
            if (checkDeleteRoomtypes==true) {
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RTdeleteActionPerformed

    private void RatedeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RatedeleteActionPerformed
        // TODO add your handling code here:
        
        
        try {
            boolean checkDeleteRates = ratesControll.deleteRates(id, ratestable);
            if (checkDeleteRates==true) {
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RatedeleteActionPerformed

    private void BeddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeddeleteActionPerformed
        // TODO add your handling code here:
        
        try {
            boolean checkDeleteBeds = bedsControll.deleteBeds(id, bedtable);
            if (checkDeleteBeds==true) {
                new ContainerManipulator(lalagyanan,new Views.Panels.Rate_RT_BedPanels(lalagyanan));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Rate_RT_BedPanels.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_BeddeleteActionPerformed

    private void RTidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RTidKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_RTidKeyTyped

    private void RateIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RateIDKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }     
        
    }//GEN-LAST:event_RateIDKeyTyped

    private void BedIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BedIDKeyTyped
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_BedIDKeyTyped

    private void RatePriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RatePriceKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
          if (!((c >= '0') && (c <= '9') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
        
    }//GEN-LAST:event_RatePriceKeyTyped

    private void RoomTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RoomTypeKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_RoomTypeKeyTyped

    private void BedQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BedQuantityKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
         if (!((c >= 'a') && (c <= 'z') || (c >= 'A') && (c <= 'Z') ||
             (c == KeyEvent.VK_PERIOD) ||
             (c == KeyEvent.VK_BACK_SPACE) ||
             (c == KeyEvent.VK_DELETE))) {
               getToolkit().beep();
             evt.consume();
          }
    }//GEN-LAST:event_BedQuantityKeyTyped
      
    
     private boolean checkInputsRT(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (RTid.getText().isEmpty()||RoomType.getText().isEmpty()){
         //   JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
      }
     private boolean checkInputsRate(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (RateID.getText().isEmpty()||RatePrice.getText().isEmpty()){
         //   JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
      } 
    private boolean checkInputsBed(){
        String notice = "Theres Have A Field That Empty Please make an Input";
        if (BedID.getText().isEmpty()||BedQuantity.getText().isEmpty()){
         //   JOptionPane.showMessageDialog(this,notice);
            return true;
        }else{
            return false;
        }
      }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BedID;
    private javax.swing.JTextField BedQuantity;
    private javax.swing.JButton Beddelete;
    private javax.swing.JButton Bedsave;
    private javax.swing.JButton RTdelete;
    private javax.swing.JTextField RTid;
    private javax.swing.JButton RTsave;
    private javax.swing.JTable RTtable;
    private javax.swing.JTextField RateID;
    private javax.swing.JTextField RatePrice;
    private javax.swing.JButton Ratedelete;
    private javax.swing.JButton Ratesave;
    private javax.swing.JTextField RoomType;
    private javax.swing.JTable bedtable;
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
    // End of variables declaration//GEN-END:variables
}
