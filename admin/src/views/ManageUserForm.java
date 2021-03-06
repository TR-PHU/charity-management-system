/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import connect_db.MyConnection;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.User;

/**
 *
 * @author PHUTRAN
 */
public class ManageUserForm extends javax.swing.JFrame {

    /**
     * Creates new form ManageUserForm
     */
    ArrayList<User> listUsers = new ArrayList<>();
    DefaultTableModel tableModelUser = null;
    
    public ManageUserForm() {
        initComponents();
        this.setTitle("Quản lý người dùng");
        this.setLocationRelativeTo(null);

        loadLogo();
        loadDataUserTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        panelChooseDateFilter = new javax.swing.JPanel();
        filterChooseCreateUser = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        searchUserField = new javax.swing.JTextField();
        panelHeader = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelManageUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(239, 202, 72));

        panelMain.setBackground(new java.awt.Color(189, 213, 234));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Quản lý người dùng");

        tableUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ và tên", "Username", "Vai trò", "Trạng thái", "Chi tiết hoạt động"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);
        if (tableUser.getColumnModel().getColumnCount() > 0) {
            tableUser.getColumnModel().getColumn(0).setResizable(false);
            tableUser.getColumnModel().getColumn(1).setResizable(false);
            tableUser.getColumnModel().getColumn(2).setResizable(false);
            tableUser.getColumnModel().getColumn(3).setResizable(false);
            tableUser.getColumnModel().getColumn(4).setResizable(false);
            tableUser.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Lọc người dùng đã tạo tài khoản sau thời gian:");

        panelChooseDateFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelChooseDateFilterMouseClicked(evt);
            }
        });

        filterChooseCreateUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                filterChooseCreateUserFocusGained(evt);
            }
        });
        filterChooseCreateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterChooseCreateUserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelChooseDateFilterLayout = new javax.swing.GroupLayout(panelChooseDateFilter);
        panelChooseDateFilter.setLayout(panelChooseDateFilterLayout);
        panelChooseDateFilterLayout.setHorizontalGroup(
            panelChooseDateFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterChooseCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        panelChooseDateFilterLayout.setVerticalGroup(
            panelChooseDateFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filterChooseCreateUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(16, 169, 218));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LỌC");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tìm kiếm người dùng:");

        searchUserField.setForeground(new java.awt.Color(153, 153, 153));
        searchUserField.setText("Mời nhập keyword");
        searchUserField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchUserFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchUserFieldFocusLost(evt);
            }
        });
        searchUserField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchUserFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelChooseDateFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1))
                        .addGap(30, 30, 30))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(searchUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelChooseDateFilter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        panelHeader.setBackground(new java.awt.Color(189, 213, 234));

        labelLogo.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Đăng xuất");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Hoạt động");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        labelManageUser.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelManageUser.setText("Người dùng");
        labelManageUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Nguồn tiền và tình nguyện viên");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelManageUser)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(labelManageUser)
                    .addComponent(jLabel3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked
        JTable  source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint(evt.getPoint());
        
        String userId = source.getModel().getValueAt(row, 0) + "";
        int option = 1;

        String isActive = source.getModel().getValueAt(row, 4) + "";
        
        if(column == 4 && isActive.equals("true")) { 
            option = JOptionPane.showOptionDialog(new JFrame(), "Chặn người dùng này ?", 
                "Block user", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                PreparedStatement ps;
                String queryUpdateDoneTimeLine = "update users set status = 0 where id = ?";
                try {
                    ps = MyConnection.getConnection().prepareStatement(queryUpdateDoneTimeLine);
                    ps.setInt(1, Integer.parseInt(userId));

                    if(ps.executeUpdate() != 0 ) { 
                        JOptionPane.showMessageDialog(null, "Chặn người dùng thành công", "Block user success", 2);
                        DefaultTableModel tableModelUser = (DefaultTableModel) tableUser.getModel();
                        tableModelUser.setValueAt(false, row, 4);
                    } else { 
                        JOptionPane.showMessageDialog(null, "Chặn người dùng thất bại", "Block user failed", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        } else if(column == 4 && isActive.equals("false")) { 
            option = JOptionPane.showOptionDialog(new JFrame(), "Bỏ chặn người dùng này ?", 
                "Unblock user", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, 
                null, new Object[] {"Yes", "No"}, JOptionPane.YES_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                PreparedStatement ps;
                String queryUpdateDoneTimeLine = "update users set status = 1 where id = ?";
                try {
                    ps = MyConnection.getConnection().prepareStatement(queryUpdateDoneTimeLine);
                    ps.setInt(1, Integer.parseInt(userId));

                    if(ps.executeUpdate() != 0 ) { 
                        JOptionPane.showMessageDialog(null, "Bỏ chặn người dùng thành công", "Unlock user success", 2);
                        DefaultTableModel tableModelUser = (DefaultTableModel) tableUser.getModel();
                        tableModelUser.setValueAt(true, row, 4);
                    } else { 
                        JOptionPane.showMessageDialog(null, "Bỏ chặn người dùng thất bại", "Unlock user failed", 2);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else if ( column == 3 ) { 
            String role = JOptionPane.showInputDialog(null,"Mời bạn nhập vai trò của người dùng (Admin or User)", "Thay đổi vai trò của người dùng", JOptionPane.INFORMATION_MESSAGE);
            String queryChangeRole = "update users set is_admin = ? where id = " + Integer.parseInt(userId);
            PreparedStatement ps;
            
            try {
                ps = MyConnection.getConnection().prepareStatement(queryChangeRole);
                if(role.equals("Admin") || role.equals("admin")) { 
                    ps.setInt(1, 1);
                } else if (role.equals("User") || role.equals("user")) { 
                    ps.setInt(1, 0);
                } else { 
                    JOptionPane.showMessageDialog(null, "Thay đổi vai trò của người dùng thất bại", "Change role failed",2);
                }
                
                if(ps.executeUpdate() != 0) { 
                    JOptionPane.showMessageDialog(null, "Thay đổi vai trò của người dùng thành công", "Change role success",2);
                    if(role.equals("Admin") || role.equals("admin")) { 
                        tableUser.setValueAt("Admin", row, 3);
                    } else if (role.equals("User") || role.equals("user")) { 
                        ps.setInt(1, 0);                       
                        tableUser.setValueAt("User", row, 3);
                    }
                } else { 
                    JOptionPane.showMessageDialog(null, "Thay đổi vai trò của người dùng thất bại", "Change role failed",2);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (column == 5) { 
            DetailUserPost detailUserPost = new DetailUserPost(Integer.parseInt(userId));
            detailUserPost.setVisible(true);
            detailUserPost.setLocationRelativeTo(null);
            detailUserPost.pack();
            detailUserPost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }                                                       
    }//GEN-LAST:event_tableUserMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.setLocationRelativeTo(null);
        loginForm.pack();
        loginForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void filterChooseCreateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterChooseCreateUserMouseClicked
        System.out.println("Hi");
    }//GEN-LAST:event_filterChooseCreateUserMouseClicked

    private void filterChooseCreateUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filterChooseCreateUserFocusGained
        
    }//GEN-LAST:event_filterChooseCreateUserFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(filterChooseCreateUser.getDate() != null) { 
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateCreateUser = sdf.format(filterChooseCreateUser.getDate());

            DefaultTableModel tableModelUser = (DefaultTableModel) tableUser.getModel();
            tableModelUser.setRowCount(0);
 
            String query = "select id, full_name, username, is_admin, status from users where created_at > '"+dateCreateUser+" 00:00:00'";
            Statement st;
            ResultSet rs;

            try {
                st = MyConnection.getConnection().createStatement();
                rs = st.executeQuery(query);

                while(rs.next()) {
                    tableUser.getColumn("Chi tiết hoạt động").setCellRenderer(new ButtonRenderer());
                    tableUser.getColumn("Chi tiết hoạt động").setCellEditor(new ButtonEditor(new JCheckBox()));
                    tableModelUser.addRow(new Object[] {
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4) == 1 ? "Admin" : "User",
                        rs.getInt(5) == 1 ? true : false,
                        "Xem"
                    });
                }
            } catch (SQLException ex) {
                Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        ManagePost managePost = new ManagePost();
        managePost.setVisible(true);
        managePost.setLocationRelativeTo(null);
        managePost.pack();
        managePost.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void panelChooseDateFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelChooseDateFilterMouseClicked

    }//GEN-LAST:event_panelChooseDateFilterMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        ManageDonateAndPeopleJoinForm manageDonateAndPeopleJoinForm = new ManageDonateAndPeopleJoinForm();
        manageDonateAndPeopleJoinForm.setVisible(true);
        manageDonateAndPeopleJoinForm.setLocationRelativeTo(null);
        manageDonateAndPeopleJoinForm.pack();
        manageDonateAndPeopleJoinForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void searchUserFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchUserFieldFocusGained
        searchUserField.setText("");
    }//GEN-LAST:event_searchUserFieldFocusGained

    private void searchUserFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchUserFieldFocusLost
        searchUserField.setText("Mời nhập keyword");
    }//GEN-LAST:event_searchUserFieldFocusLost

    private void searchUserFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchUserFieldKeyTyped
        tableModelUser = (DefaultTableModel) tableUser.getModel();
        tableModelUser.setRowCount(0);
        String keyword = searchUserField.getText();
        
        if(!keyword.equals("")) { 
            String query = "select id, full_name, username, email,gender, is_admin, avatar, status from users where id like '%" + keyword + "%' or username like '%" + keyword + "%' or email like '%" + keyword +"%' or full_name like '%" + keyword + "%'";
            
            Statement st;
            ResultSet rs;
            
            try {
                st = MyConnection.getConnection().createStatement();
                rs = st.executeQuery(query);
                
                while(rs.next()) { 
                tableUser.getColumn("Chi tiết hoạt động").setCellRenderer(new ButtonRenderer());
                tableUser.getColumn("Chi tiết hoạt động").setCellEditor(new ButtonEditor(new JCheckBox()));
                tableModelUser.addRow(new Object[] { 
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(6)== 1 ? "Admin" : "User",
                    rs.getInt(8) == 1 ? true : false,
                    "Xem"
                });
            }
            } catch (SQLException ex) {
                Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else { 
            for (User user : listUsers) {
                tableUser.getColumn("Chi tiết hoạt động").setCellRenderer(new ButtonRenderer());
                tableUser.getColumn("Chi tiết hoạt động").setCellEditor(new ButtonEditor(new JCheckBox()));
                tableModelUser.addRow(new Object[] { 
                    user.getId(),
                    user.getFullName(),
                    user.getUsername(),
                    user.getIsAdmin() == 1 ? "Admin" : "User",
                    user.getStatus() == 1 ? true : false,
                    "Xem"
                });
            }
        }
    }//GEN-LAST:event_searchUserFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    public  void loadLogo() { 
        File logo = new File(System.getProperty("user.dir") + "/src/images/logo.jpg");
        String path = logo.getAbsolutePath();
        ImageIcon myImage = new ImageIcon(path);
        
        Image image = myImage.getImage();
        Image newImage = image.getScaledInstance(labelLogo.getWidth(), labelLogo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(newImage);
        labelLogo.setIcon(imageIcon);
    }
    public void loadDataUserTable() { 
        tableModelUser = (DefaultTableModel) tableUser.getModel();
        
        String query = "select id, full_name, username, email,gender, is_admin, avatar, status from users";
        Statement st;
        ResultSet rs;
        
        try {
            st = MyConnection.getConnection().createStatement();
            rs = st.executeQuery(query);
            
            while(rs.next()) { 
                User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getBlob(7), rs.getInt(8));
                listUsers.add(user);
            }
            
            for (User user : listUsers) {
                tableUser.getColumn("Chi tiết hoạt động").setCellRenderer(new ButtonRenderer());
                tableUser.getColumn("Chi tiết hoạt động").setCellEditor(new ButtonEditor(new JCheckBox()));
                tableModelUser.addRow(new Object[] { 
                    user.getId(),
                    user.getFullName(),
                    user.getUsername(),
                    user.getIsAdmin() == 1 ? "Admin" : "User",
                    user.getStatus() == 1 ? true : false,
                    "Xem"
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageUserForm.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(ManageUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser filterChooseCreateUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelManageUser;
    private javax.swing.JPanel panelChooseDateFilter;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField searchUserField;
    private javax.swing.JTable tableUser;
    // End of variables declaration//GEN-END:variables
}
