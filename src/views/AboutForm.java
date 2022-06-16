/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author AD
 */
public class AboutForm extends javax.swing.JFrame {

    /**
     * Creates new form About
     */
    private static  int userId = -1;
    public AboutForm(int userId) {
        this.userId = userId;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Về chúng tôi");
        
        this.add(labelHome);
        labelHome.setBounds(375,37,53,16);
        this.add(labelAbout);
        labelAbout.setBounds(450,37, 70, 16);
        loadImageLabel();
        
        //Them mau nen
        getContentPane().setBackground(new java.awt.Color(189,213,234));
        setVisible(true);
    }
    public AboutForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Về chúng tôi");

        
        this.add(labelLogIn);
        this.add(labelHome);
        this.add(labelAbout);
        labelLogIn.setBounds(650, 37, 60, 16);
        labelAbout.setBounds(550, 37, 70, 16);
        labelHome.setBounds(470, 37, 60, 16);
        comboBoxDirection.setVisible(false);
        

        loadImageLabel();
        
        //Them mau nen [189,213,234]
        getContentPane().setBackground(new java.awt.Color(189,213,234));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogIn = new javax.swing.JLabel();
        labelHome = new javax.swing.JLabel();
        labelAbout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lableImage = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        comboBoxDirection = new javax.swing.JComboBox<>();

        labelLogIn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelLogIn.setText("Đăng nhập");
        labelLogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelLogIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLogInMouseClicked(evt);
            }
        });

        labelHome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelHome.setText("Trang chủ");
        labelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHomeMouseClicked(evt);
            }
        });

        labelAbout.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelAbout.setText("Về chúng tôi");
        labelAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAboutMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("TỪ THIỆN");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("* Gây quỹ vì cộng đồng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Kêu gọi hàng triệu trái tim cùng quyên góp tiền");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("tài trợ cho các mục đích từ thiện và cứu trợ khẩn cấp.");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("* Truy vấn sao kê tức thời");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Ứng dụng công khai toàn bộ số dư và giao dịch");

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setText("* Là giải pháp công nghệ minh bạch tài chính");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("thu chi ngay khi phát sinh từ tài khoản thiện nguyện");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("cho hoạt động thiện nguyện.");

        lableImage.setText("jLabel8");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");

        comboBoxDirection.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        comboBoxDirection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xem tài khoản của bạn", "Quản lý hoạt động của bạn", "Đăng bài", "Đăng xuất" }));
        comboBoxDirection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxDirectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lableImage, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxDirection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(119, 119, 119)))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(comboBoxDirection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lableImage, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxDirectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxDirectionActionPerformed
        int index = comboBoxDirection.getSelectedIndex();

        if(index == 0) { 
            ProfileForm profileForm = new ProfileForm(userId, "");
            profileForm.setVisible(true);
            profileForm.pack();
            profileForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else if (index == 1) { 
            ManageUserPost manageUserPost = new ManageUserPost(userId);
            manageUserPost.setVisible(true);
            manageUserPost.pack();
            manageUserPost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else if (index == 2 ) { 
            CreatePost createPostForm = new CreatePost(userId);
            createPostForm.setVisible(true);
            createPostForm.pack();
            createPostForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else { 
            LoginForm loginForm = new LoginForm();
            loginForm.setVisible(true);
            loginForm.pack();
            loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_comboBoxDirectionActionPerformed

    private void labelLogInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLogInMouseClicked
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
        loginForm.pack();
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_labelLogInMouseClicked

    private void labelAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAboutMouseClicked

    }//GEN-LAST:event_labelAboutMouseClicked

    private void labelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHomeMouseClicked
        if(userId > 0) { 
            Home home = new Home(userId);
            home.setVisible(true);
            home.setLocationRelativeTo(null);
            home.pack();
            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else { 
            Home home = new Home();
            home.setVisible(true);
            home.setLocationRelativeTo(null);
            home.pack();
            home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_labelHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public void loadImageLabel() { 
        File logo = new File(System.getProperty("user.dir") + "/src/images/image-about.png");
        String path = logo.getAbsolutePath();
        ImageIcon myImage = new ImageIcon(path);
        
        Image image = myImage.getImage();
        Image newImage = image.getScaledInstance(lableImage.getWidth(), lableImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImage);
        lableImage.setIcon(imageIcon);
    }
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
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxDirection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel labelAbout;
    private javax.swing.JLabel labelHome;
    private javax.swing.JLabel labelLogIn;
    private javax.swing.JLabel lableImage;
    // End of variables declaration//GEN-END:variables
}
