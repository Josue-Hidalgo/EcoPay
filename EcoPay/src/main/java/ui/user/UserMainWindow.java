package ui.user;

import ui.utils.Utils;

public class UserMainWindow extends javax.swing.JFrame {
    public UserMainWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(ProfileBtn, "/img/perfil.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProfileBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LogoBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        Title6 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        CoinsTF = new javax.swing.JTextField();
        CoinsTradedTF = new javax.swing.JTextField();
        CoinsObtainedTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        LoginBtn = new javax.swing.JButton();
        LoginBtn1 = new javax.swing.JButton();
        LoginBtn2 = new javax.swing.JButton();
        Title1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));

        ProfileBtn.setBorder(null);
        ProfileBtn.setIconTextGap(0);
        ProfileBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ProfileBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ProfileBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ProfileBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBtnActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));

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

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        Title2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("NOMBRE USUARIO");
        jPanel2.add(Title2);
        Title2.setBounds(70, 30, 170, 31);

        Title3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("NOMBRE USUARIO");
        jPanel2.add(Title3);
        Title3.setBounds(70, 30, 170, 31);

        Title6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("GANADOS:");
        jPanel2.add(Title6);
        Title6.setBounds(90, 190, 130, 31);

        Title7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("CANJEADOS:");
        jPanel2.add(Title7);
        Title7.setBounds(90, 280, 130, 31);

        Title4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(204, 153, 0));
        Title4.setText("MIS COINS:");
        jPanel2.add(Title4);
        Title4.setBounds(90, 90, 130, 31);

        CoinsTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsTF.setText("0");
        CoinsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsTF);
        CoinsTF.setBounds(90, 120, 130, 50);

        CoinsTradedTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsTradedTF.setText("0");
        CoinsTradedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsTradedTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsTradedTF);
        CoinsTradedTF.setBounds(90, 310, 130, 50);

        CoinsObtainedTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsObtainedTF.setText("0");
        CoinsObtainedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsObtainedTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsObtainedTF);
        CoinsObtainedTF.setBounds(90, 220, 130, 50);

        jPanel3.setBackground(new java.awt.Color(28, 107, 74));
        jPanel3.setLayout(null);

        LoginBtn.setBackground(new java.awt.Color(15, 71, 34));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("MAPA");
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
        jPanel3.add(LoginBtn);
        LoginBtn.setBounds(50, 300, 220, 40);

        LoginBtn1.setBackground(new java.awt.Color(15, 71, 34));
        LoginBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginBtn1.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn1.setText("RECICLAR");
        LoginBtn1.setBorder(null);
        LoginBtn1.setIconTextGap(0);
        LoginBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn1ActionPerformed(evt);
            }
        });
        jPanel3.add(LoginBtn1);
        LoginBtn1.setBounds(50, 120, 220, 40);

        LoginBtn2.setBackground(new java.awt.Color(15, 71, 34));
        LoginBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginBtn2.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn2.setText("CANJEAR");
        LoginBtn2.setBorder(null);
        LoginBtn2.setIconTextGap(0);
        LoginBtn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginBtn2.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginBtn2.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginBtn2.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtn2ActionPerformed(evt);
            }
        });
        jPanel3.add(LoginBtn2);
        LoginBtn2.setBounds(50, 210, 220, 40);

        Title1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("OPERACIONES");
        jPanel3.add(Title1);
        Title1.setBounds(100, 30, 130, 31);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(800, 800, 800)
                .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        UserMainWindow userW = new UserMainWindow();
        userW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void LoginBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtn1ActionPerformed

    private void LoginBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtn2ActionPerformed

    private void CoinsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsTFActionPerformed

    private void CoinsTradedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsTradedTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsTradedTFActionPerformed

    private void CoinsObtainedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsObtainedTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsObtainedTFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoinsObtainedTF;
    private javax.swing.JTextField CoinsTF;
    private javax.swing.JTextField CoinsTradedTF;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton LoginBtn1;
    private javax.swing.JButton LoginBtn2;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
