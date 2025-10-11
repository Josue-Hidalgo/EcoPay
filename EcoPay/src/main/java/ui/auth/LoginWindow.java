package ui.auth;

import ui.user.UserMainWindow;
import ui.utils.Utils;


public class LoginWindow extends javax.swing.JFrame {
    public LoginWindow() {
        initComponents();
    }
    
    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IdentificationTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        UserNameTF = new javax.swing.JTextField();
        PasswordTF = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();

        IdentificationTextField.setText("Identificación");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        Title.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Bienvenido: Ingrese Aquí");
        jPanel2.add(Title);
        Title.setBounds(110, 20, 250, 31);

        UserNameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF.setText("Nombre de Usuario");
        UserNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTFMouseClicked(evt);
            }
        });
        jPanel2.add(UserNameTF);
        UserNameTF.setBounds(120, 120, 220, 40);

        PasswordTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordTF.setText("Contraseña");
        PasswordTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordTFMouseClicked(evt);
            }
        });
        jPanel2.add(PasswordTF);
        PasswordTF.setBounds(120, 180, 220, 40);

        LoginBtn.setBackground(new java.awt.Color(15, 71, 34));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("INGRESAR");
        LoginBtn.setBorder(null);
        LoginBtn.setIconTextGap(0);
        LoginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel2.add(LoginBtn);
        LoginBtn.setBounds(120, 250, 220, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(240, 70, 440, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        UserMainWindow userW = new UserMainWindow();
        userW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void UserNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTFMouseClicked
        UserNameTF.setText("");
    }//GEN-LAST:event_UserNameTFMouseClicked

    private void PasswordTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordTFMouseClicked
        PasswordTF.setText("");
    }//GEN-LAST:event_PasswordTFMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdentificationTextField;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField PasswordTF;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UserNameTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
