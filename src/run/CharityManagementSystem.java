/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
public class CharityManagementSystem extends  JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
        });
    }
} 
