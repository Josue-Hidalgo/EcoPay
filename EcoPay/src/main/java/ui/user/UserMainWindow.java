package ui.user;

import ui.mainpkg.MainWindow;
import ui.utils.Utils;

public class UserMainWindow extends javax.swing.JFrame {
    public UserMainWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(ProfileBtn, "/img/perfil.png");
        PopUpPanel.setVisible(false);
        ProfileBtn.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
        TransactionsBtn = new javax.swing.JButton();
        TradeBtn = new javax.swing.JButton();
        Title5 = new javax.swing.JLabel();
        RecicleBtn = new javax.swing.JButton();
        MapBtn = new javax.swing.JButton();
        ProfileBtn = new javax.swing.JButton();
        PopUpPanel = new javax.swing.JPanel();
        ProfileChild1Btn = new javax.swing.JButton();
        ProfileChild2Btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));

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
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("NOMBRE USUARIO");
        jPanel2.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, -1));

        Title3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("NOMBRE USUARIO");
        jPanel2.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 170, -1));

        Title6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("GANADOS:");
        jPanel2.add(Title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, 31));

        Title7.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setText("CANJEADOS:");
        jPanel2.add(Title7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 130, 31));

        Title4.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title4.setForeground(new java.awt.Color(204, 153, 0));
        Title4.setText("MIS COINS:");
        jPanel2.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 31));

        CoinsTF.setEditable(false);
        CoinsTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsTF.setText("0");
        CoinsTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 130, 50));

        CoinsTradedTF.setEditable(false);
        CoinsTradedTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsTradedTF.setText("0");
        CoinsTradedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsTradedTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsTradedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 130, 50));

        CoinsObtainedTF.setEditable(false);
        CoinsObtainedTF.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CoinsObtainedTF.setText("0");
        CoinsObtainedTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoinsObtainedTFActionPerformed(evt);
            }
        });
        jPanel2.add(CoinsObtainedTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 130, 50));

        jPanel4.setBackground(new java.awt.Color(28, 107, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TransactionsBtn.setBackground(new java.awt.Color(15, 71, 34));
        TransactionsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TransactionsBtn.setForeground(new java.awt.Color(255, 255, 255));
        TransactionsBtn.setText("TRANSACCIONES");
        TransactionsBtn.setBorder(null);
        TransactionsBtn.setIconTextGap(0);
        TransactionsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TransactionsBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        TransactionsBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        TransactionsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        TransactionsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionsBtnActionPerformed(evt);
            }
        });
        jPanel4.add(TransactionsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 220, -1));

        TradeBtn.setBackground(new java.awt.Color(15, 71, 34));
        TradeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TradeBtn.setForeground(new java.awt.Color(255, 255, 255));
        TradeBtn.setText("CANJEAR");
        TradeBtn.setBorder(null);
        TradeBtn.setIconTextGap(0);
        TradeBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        TradeBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        TradeBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        TradeBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        TradeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TradeBtnActionPerformed(evt);
            }
        });
        jPanel4.add(TradeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 220, -1));

        Title5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("OPERACIONES");
        jPanel4.add(Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 130, -1));

        RecicleBtn.setBackground(new java.awt.Color(15, 71, 34));
        RecicleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RecicleBtn.setForeground(new java.awt.Color(255, 255, 255));
        RecicleBtn.setText("RECICLAR");
        RecicleBtn.setBorder(null);
        RecicleBtn.setIconTextGap(0);
        RecicleBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RecicleBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        RecicleBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        RecicleBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        RecicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecicleBtnActionPerformed(evt);
            }
        });
        jPanel4.add(RecicleBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 220, -1));

        MapBtn.setBackground(new java.awt.Color(15, 71, 34));
        MapBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MapBtn.setForeground(new java.awt.Color(255, 255, 255));
        MapBtn.setText("MAPA");
        MapBtn.setBorder(null);
        MapBtn.setIconTextGap(0);
        MapBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MapBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        MapBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        MapBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        MapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapBtnActionPerformed(evt);
            }
        });
        jPanel4.add(MapBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 220, -1));

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

        PopUpPanel.setBackground(new java.awt.Color(77, 175, 124));
        PopUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfileChild1Btn.setBackground(new java.awt.Color(15, 71, 34));
        ProfileChild1Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProfileChild1Btn.setForeground(new java.awt.Color(255, 255, 255));
        ProfileChild1Btn.setText("PERFIL");
        ProfileChild1Btn.setBorder(null);
        ProfileChild1Btn.setIconTextGap(0);
        ProfileChild1Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ProfileChild1Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        ProfileChild1Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        ProfileChild1Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        ProfileChild1Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileChild1BtnMouseClicked(evt);
            }
        });
        ProfileChild1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileChild1BtnActionPerformed(evt);
            }
        });
        PopUpPanel.add(ProfileChild1Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        ProfileChild2Btn.setBackground(new java.awt.Color(15, 71, 34));
        ProfileChild2Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProfileChild2Btn.setForeground(new java.awt.Color(255, 255, 255));
        ProfileChild2Btn.setText("SALIR");
        ProfileChild2Btn.setBorder(null);
        ProfileChild2Btn.setIconTextGap(0);
        ProfileChild2Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ProfileChild2Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        ProfileChild2Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        ProfileChild2Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        ProfileChild2Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileChild2BtnMouseClicked(evt);
            }
        });
        ProfileChild2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileChild2BtnActionPerformed(evt);
            }
        });
        PopUpPanel.add(ProfileChild2Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(770, 770, 770)
                .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(PopUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PopUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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

    private void TradeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TradeBtnActionPerformed
        UserTrade1Window tradeW = new UserTrade1Window();
        tradeW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TradeBtnActionPerformed

    private void ProfileChild1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileChild1BtnActionPerformed
        UserProfileWindow profileW = new UserProfileWindow();
        profileW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileChild1BtnActionPerformed

    private void TransactionsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionsBtnActionPerformed
        UserTransactionsWindow transactionsW = new UserTransactionsWindow();
        transactionsW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TransactionsBtnActionPerformed

    private void CoinsObtainedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsObtainedTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsObtainedTFActionPerformed

    private void CoinsTradedTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsTradedTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsTradedTFActionPerformed

    private void CoinsTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoinsTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CoinsTFActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void RecicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecicleBtnActionPerformed
        UserRecicle1Window recicleW = new UserRecicle1Window();
        recicleW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RecicleBtnActionPerformed

    private void ProfileChild2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileChild2BtnActionPerformed
        MainWindow mainW = new MainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileChild2BtnActionPerformed

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        // Set visible or invisible
        PopUpPanel.setVisible(!PopUpPanel.isVisible());
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void MapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapBtnActionPerformed
        UserMapWindow mapW = new UserMapWindow();
        mapW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MapBtnActionPerformed

    private void ProfileChild2BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileChild2BtnMouseClicked
        UserMainWindow userW = new UserMainWindow();
        userW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileChild2BtnMouseClicked

    private void ProfileChild1BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileChild1BtnMouseClicked
        UserProfileWindow userW = new UserProfileWindow();
        userW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileChild1BtnMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CoinsObtainedTF;
    private javax.swing.JTextField CoinsTF;
    private javax.swing.JTextField CoinsTradedTF;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton MapBtn;
    private javax.swing.JPanel PopUpPanel;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton ProfileChild1Btn;
    private javax.swing.JButton ProfileChild2Btn;
    private javax.swing.JButton RecicleBtn;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JButton TradeBtn;
    private javax.swing.JButton TransactionsBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
