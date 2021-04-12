/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.io.File;
import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author ❤Kevin Felix Caluag❤
 */
public class CustomerController {
    
    public void GenerateQrCode(String cusname,String cusage,String custimein,String custimeout){
        try {
//            String name = JOptionPane.showInputDialog(null,"Name");
//            String age = JOptionPane.showInputDialog(null,"age");
//            String timein = JOptionPane.showInputDialog(null,"timein");
//            String timeout = JOptionPane.showInputDialog(null,"timeout");
            String qrCodeData = cusname + "\n" + cusage + "\n" + custimein + "\n" + custimeout;
            String filePath = "src\\Images\\QRCODE\\"+ cusname + ".png";
            String charset = "UTF-8"; // or "ISO-8859-1"
             Map < EncodeHintType, ErrorCorrectionLevel > hintMap = new HashMap < EncodeHintType, ErrorCorrectionLevel > ();
            hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix matrix = new MultiFormatWriter().encode(
                new String(qrCodeData.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, 200, 200, hintMap);
            MatrixToImageWriter.writeToFile(matrix, filePath.substring(filePath
                .lastIndexOf('.') + 1), new File(filePath));
            System.out.println("QR Code image created successfully!");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
