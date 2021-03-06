/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweetalerts;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class Alerts extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Alerts
     */
    static String notif;
    public Alerts(String notif) {
        initComponents();
        this.notif=notif;
         Notif();

    }
    
    private void Notif(){
        if (notif.equals("success")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("SUCCESSFULLY LOGIN");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else if (notif.equals("save")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("ADDED SUCCESSFULLY");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else if (notif.equals("update")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("UPDATED SUCCESSFULLY");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else if (notif.equals("delete")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("DELETED SUCCESSFULLY");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else if (notif.equals("checkin")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("CHECKIN SUCCESSFULLY");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else if (notif.equals("checkout")) {
            jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/sucs.gif")));
            jLabel1.setText("CHECKOUT SUCCESSFULLY");
            Timer t = new Timer(3000, this);    // Timer in 3 seconds
             t.start();
        }else{
           jLabelRound1.setIcon(new ImageIcon(getClass().getResource("/Images/GifIcon/error.gif")));
           jLabel1.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 10));
            jLabel1.setText(notif);
            Timer t = new Timer(5000, this);    // Timer in 10 seconds
             t.start();
        }
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
        jLabelRound1 = new jroundborder.JLabelRound();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 10));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRound1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, 120));

        jLabel1.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 390, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alerts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alerts(notif).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private jroundborder.JLabelRound jLabelRound1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

 public void actionPerformed(ActionEvent e) {
         this.dispose();
     }


}
