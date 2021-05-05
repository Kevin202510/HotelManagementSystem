/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.Panels;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class Camera extends javax.swing.JPanel {

    /**
     * Creates new form Camera
     */
    Webcam wc;
    Image img;
    String name;
    JPanel lalagyanan;
    
    public Camera(JPanel lalagyanan,String name) {
        initComponents();
        this.name=name;
        wc = Webcam.getDefault();
         jTxtFileName.setText(name);
        wc.setViewSize(WebcamResolution.VGA.getSize());
        wc.open();
        this.lalagyanan=lalagyanan;
        new VideoFeeder().start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtFileName = new javax.swing.JTextField();
        jLblPix = new javax.swing.JLabel();
        jBtnClose = new javax.swing.JButton();
        jBtnCapture = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLblPix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLblPix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jBtnClose.setText("Close Cam");
        jBtnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCloseActionPerformed(evt);
            }
        });

        jBtnCapture.setText("Capture");
        jBtnCapture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCaptureActionPerformed(evt);
            }
        });

        jLabel1.setText("File Name: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblPix, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(jTxtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLblPix, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnCapture, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCloseActionPerformed
        // TODO add your handling code here:
        wc.close();
        jLblPix.setIcon(null);
    }//GEN-LAST:event_jBtnCloseActionPerformed

    private void jBtnCaptureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCaptureActionPerformed
        try {
            JOptionPane.showMessageDialog(null,new ImageIcon(img));
            ImageIO.write(wc.getImage(), "JPG", new File("src/Images/Pictures/" + name + ".jpg"));
            wc.close();
            new UsersPanel(lalagyanan).profileimg.setText("kevin caluag");
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Camera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtnCaptureActionPerformed

    class VideoFeeder extends Thread {
    
          public void run(){
          
               while(true){
                   try {
                        img = wc.getImage();
                        jLblPix.setIcon(new ImageIcon(img));
                       Thread.sleep(5);
                   } catch (InterruptedException ex) {
                       JOptionPane.showMessageDialog(null,ex);
                       Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                   }
                }
          
          }
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCapture;
    private javax.swing.JButton jBtnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblPix;
    private javax.swing.JTextField jTxtFileName;
    // End of variables declaration//GEN-END:variables
}
