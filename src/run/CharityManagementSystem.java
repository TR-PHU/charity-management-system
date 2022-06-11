/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import views.LoginForm;

/**
 *
 * @author PHUTRAN
 */
public class CharityManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
//        JFrame test = new JFrame("Google Maps");
//
//        try {
//            String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center=40.714728,-73.998672&zoom=11&size=612x612&scale=2&maptype=roadmap&key=AIzaSyC3LlPPRuienzf54TI0JmAT-2YMdhzonVc";
//            String destinationFile = "image.jpg";
//            String str = destinationFile;
//            URL url = new URL(imageUrl);
//            InputStream is = url.openStream();
//            OutputStream os = new FileOutputStream(destinationFile);
//
//            byte[] b = new byte[2048];
//            int length;
//
//            while ((length = is.read(b)) != -1) {
//                os.write(b, 0, length);
//            }
//
//            is.close();
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.exit(1);
//        }
//
//        test.add(new JLabel(new ImageIcon((new ImageIcon("image.jpg")).getImage().getScaledInstance(630, 600,
//                java.awt.Image.SCALE_SMOOTH))));
//
//        test.setVisible(true);
//        test.pack();
//
//    }
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.pack();
        loginForm.setLocationRelativeTo(null);
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }
} 
