package ui.auth;

import ui.administrator.AdminMainWindow;
import ui.superuser.SuperUserConsultsWindow;
import ui.superuser.SuperUserMainWindow;
import ui.user.UserMainWindow;
import ui.utils.Utils;


public class LoginWindow extends javax.swing.JFrame {
    public LoginWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
    }
    
    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoBtn2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        UserNameTF = new javax.swing.JTextField();
        ShowPWCkB = new javax.swing.JCheckBox();
        PasswordPF = new javax.swing.JPasswordField();
        LoginBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();

        LogoBtn2.setBorder(null);
        LogoBtn2.setIconTextGap(0);
        LogoBtn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LogoBtn2.setMaximumSize(new java.awt.Dimension(40, 40));
        LogoBtn2.setMinimumSize(new java.awt.Dimension(40, 40));
        LogoBtn2.setPreferredSize(new java.awt.Dimension(40, 40));
        LogoBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoBtn2ActionPerformed(evt);
            }
        });

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
        Title.setText("¡BIENVENIDO! INGRESE AQUÍ");
        jPanel2.add(Title);
        Title.setBounds(30, 30, 260, 31);

        UserNameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF.setText("Nombre de Usuario");
        UserNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTFMouseClicked(evt);
            }
        });
        jPanel2.add(UserNameTF);
        UserNameTF.setBounds(50, 90, 220, 40);

        ShowPWCkB.setText("Mostrar Contraseña");
        ShowPWCkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPWCkBActionPerformed(evt);
            }
        });
        jPanel2.add(ShowPWCkB);
        ShowPWCkB.setBounds(50, 200, 140, 22);

        PasswordPF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PasswordPF.setText("jPasswordField1");
        PasswordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordPFActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordPF);
        PasswordPF.setBounds(50, 150, 220, 40);

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
        LoginBtn.setBounds(50, 240, 220, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(320, 130, 320, 300);

        LogoBtn.setBorder(null);
        LogoBtn.setIconTextGap(0);
        LogoBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LogoBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        LogoBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        LogoBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        LogoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LogoBtn);
        LogoBtn.setBounds(420, 10, 120, 120);

        RegisterBtn.setBackground(new java.awt.Color(15, 71, 34));
        RegisterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("¿NO TENGO CUENTA? HAZ CLIC AQUÍ");
        RegisterBtn.setBorder(null);
        RegisterBtn.setIconTextGap(0);
        RegisterBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RegisterBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        RegisterBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        RegisterBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterBtn);
        RegisterBtn.setBounds(370, 440, 220, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        RegisterWindow registerW = new RegisterWindow();
        registerW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void UserNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTFMouseClicked
        UserNameTF.setText("");
    }//GEN-LAST:event_UserNameTFMouseClicked

    private void ShowPWCkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPWCkBActionPerformed
        if (ShowPWCkB.isSelected())
            PasswordPF.setEchoChar((char) 0);
        else
            PasswordPF.setEchoChar('•'); // Puedes usar '*' también
    }//GEN-LAST:event_ShowPWCkBActionPerformed

    private void LogoBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtn2ActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        //Case 1
        UserMainWindow regW = new UserMainWindow();
        regW.setVisible(true);
        //Case 2 
        AdminMainWindow adminW = new AdminMainWindow();
        adminW.setVisible(true);
        //Case 3
        SuperUserMainWindow superW = new SuperUserMainWindow();
        superW.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void PasswordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordPFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton LogoBtn2;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JCheckBox ShowPWCkB;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UserNameTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
