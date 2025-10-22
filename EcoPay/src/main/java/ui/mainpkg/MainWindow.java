package ui.mainpkg;

// Bibliotecas
import ui.auth.LoginWindow;
import ui.auth.RegisterWindow;
import ui.utils.Utils;

// Main Class
public class MainWindow extends javax.swing.JFrame {
    
    public MainWindow() {
        initComponents();
        // Ajustando Botones
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        // Introduciendo Texto Largo
        Utils.setLongText(LongText);
    }


    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LogoBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        LongText = new javax.swing.JLabel();
        LogoBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 540));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

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
        LogoBtn.setBounds(0, 0, 80, 80);

        RegisterBtn.setBackground(new java.awt.Color(15, 71, 34));
        RegisterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("REGISTRARSE");
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
        RegisterBtn.setBounds(850, 0, 90, 80);

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
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(LoginBtn);
        LoginBtn.setBounds(750, 0, 90, 80);

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 80, 950, 20);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        Title.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("¿Qué es ECOPAY?");
        jPanel2.add(Title);
        Title.setBounds(210, 10, 170, 80);

        LongText.setBackground(new java.awt.Color(28, 107, 74));
        LongText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LongText.setForeground(new java.awt.Color(255, 255, 255));
        LongText.setText("Text");
        jPanel2.add(LongText);
        LongText.setBounds(60, 80, 450, 300);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(180, 80, 580, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 520);

        LogoBtn1.setBorder(null);
        LogoBtn1.setIconTextGap(0);
        LogoBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LogoBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        LogoBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        LogoBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        LogoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(LogoBtn1);
        LogoBtn1.setBounds(0, 0, 80, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        RegisterWindow registerW = new RegisterWindow();
        registerW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void LogoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtn1ActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        LoginWindow loginW = new LoginWindow();
        loginW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton LogoBtn1;
    private javax.swing.JLabel LongText;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
