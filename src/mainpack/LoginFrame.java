/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mainpack;

import dao.UserDAO;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Admin
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    User loginUser;
    public LoginFrame() {
        initComponents();
        this.setResizable(false);
        this.setIconImage(new ImageIcon("D:\\Java_source\\Lab_Java_3\\Assignment\\src\\imgicon\\user.png").getImage());
//        loginBtn.setSelected(true);
//        this.getRootPane().setDefaultButton(loginBtn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        passInput = new javax.swing.JPasswordField();
        userInput = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login ");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.setOpaque(true);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Login Page");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        passInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passInputKeyPressed(evt);
            }
        });

        passLabel.setText("Password");

        userLabel.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(passLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userInput)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        try {
            
            if (userInput.getText().equals("") || passInput.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap vao username hoac password");
                userInput.setText("");
                passInput.setText("");
                return;
            }
            
            loginUser = UserDAO.getInstance().selectById(userInput.getText());
            if (userInput.getText().equals(loginUser.getUsername()) && passInput.getText().equals(loginUser.getPassword())) {
                if (loginUser.isRole()) {
                    AdminFrame frame = new AdminFrame();
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công Vào Tài Khoản Cán Bộ!");
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                }else{
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công Vào Tài Khoản Giảng Viên");
                    UserFrame frame = new UserFrame();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Bạn Nhập Sai Username hoặc Password");
            }            
            
        } catch (HeadlessException e) {
            System.out.println("Loi");
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt.getKeyCode());
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
            
            if (userInput.getText().equals("") || passInput.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap vao username hoac password");
                userInput.setText("");
                passInput.setText("");
                return;
            }
            
            loginUser = UserDAO.getInstance().selectById(userInput.getText());
            if (userInput.getText().equals(loginUser.getUsername()) && passInput.getText().equals(loginUser.getPassword())) {
                if (loginUser.isRole()) {
                    AdminFrame frame = new AdminFrame();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    this.setVisible(false);
                }else{
                    UserFrame frame = new UserFrame();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                    this.setVisible(false);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Bạn Nhập Sai Username hoặc Password");
            }            
            
            } catch (HeadlessException e) {
                System.out.println("Loi");
            }
        }    
    }//GEN-LAST:event_formKeyPressed

    private void passInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passInputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
            
            if (userInput.getText().equals("") || passInput.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Ban chua nhap vao username hoac password");
                userInput.setText("");
                passInput.setText("");
                return;
            }
            
            loginUser = UserDAO.getInstance().selectById(userInput.getText());
            if (userInput.getText().equals(loginUser.getUsername()) && passInput.getText().equals(loginUser.getPassword())) {
                if (loginUser.isRole()) {
                    AdminFrame frame = new AdminFrame();
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công Vào Tài Khoản Cán Bộ!");
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                }else{
                    this.setVisible(false);
                    JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công Vào Tài Khoản Giảng Viên");
                    UserFrame frame = new UserFrame();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Bạn Nhập Sai Username hoặc Password");
            }            
            
            } catch (HeadlessException e) {
                System.out.println("Loi");
            }
        }
    }//GEN-LAST:event_passInputKeyPressed

    
    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginFrame login = new LoginFrame();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                login.requestFocusInWindow();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField userInput;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
