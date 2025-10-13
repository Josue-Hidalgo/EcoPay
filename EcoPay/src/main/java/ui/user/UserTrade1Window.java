package ui.user;

import ui.utils.Utils;

public class UserTrade1Window extends javax.swing.JFrame {

    public UserTrade1Window() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(Catalogue1Btn, "/img/home.png");
        Utils.adjustImageToButton(Catalogue2Btn, "/img/raffle.png");
        Utils.adjustImageToButton(Catalogue3Btn, "/img/food.png");
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        Catalogue3Btn = new javax.swing.JButton();
        Catalogue1Btn = new javax.swing.JButton();
        Catalogue2Btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 80, 950, 20);

        CollectionCenterPanel.setBackground(new java.awt.Color(28, 107, 74));
        CollectionCenterPanel.setLayout(null);

        Title5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Catálogo de Canjes");
        CollectionCenterPanel.add(Title5);
        Title5.setBounds(220, 40, 190, 31);

        Catalogue3Btn.setBorder(null);
        Catalogue3Btn.setIconTextGap(0);
        Catalogue3Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Catalogue3Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        Catalogue3Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        Catalogue3Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Catalogue3Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Catalogue3BtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(Catalogue3Btn);
        Catalogue3Btn.setBounds(430, 100, 150, 150);

        Catalogue1Btn.setBorder(null);
        Catalogue1Btn.setIconTextGap(0);
        Catalogue1Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Catalogue1Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        Catalogue1Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        Catalogue1Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Catalogue1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Catalogue1BtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(Catalogue1Btn);
        Catalogue1Btn.setBounds(50, 100, 150, 150);

        Catalogue2Btn.setBorder(null);
        Catalogue2Btn.setIconTextGap(0);
        Catalogue2Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Catalogue2Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        Catalogue2Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        Catalogue2Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Catalogue2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Catalogue2BtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(Catalogue2Btn);
        Catalogue2Btn.setBounds(240, 100, 150, 150);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Utencilios de Casa");
        CollectionCenterPanel.add(jLabel1);
        jLabel1.setBounds(60, 260, 130, 30);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sorteos");
        CollectionCenterPanel.add(jLabel2);
        jLabel2.setBounds(290, 260, 60, 30);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alimento y Bebida");
        CollectionCenterPanel.add(jLabel3);
        jLabel3.setBounds(450, 260, 120, 30);

        jPanel1.add(CollectionCenterPanel);
        CollectionCenterPanel.setBounds(160, 120, 630, 350);

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

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void Catalogue3BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Catalogue3BtnActionPerformed
        // VAN AL MISMO PERO CON DIFERENTE CONSULTA

        UserTrade2Window trade2W = new UserTrade2Window();
        trade2W.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Catalogue3BtnActionPerformed

    private void Catalogue1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Catalogue1BtnActionPerformed
        // VAN AL MISMO PERO CON DIFERENTE CONSULTA
        
        UserTrade2Window trade2W = new UserTrade2Window();
        trade2W.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Catalogue1BtnActionPerformed

    private void Catalogue2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Catalogue2BtnActionPerformed
        // VAN AL MISMO PERO CON DIFERENTE CONSULTA
        
        UserTrade2Window trade2W = new UserTrade2Window();
        trade2W.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Catalogue2BtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Catalogue1Btn;
    private javax.swing.JButton Catalogue2Btn;
    private javax.swing.JButton Catalogue3Btn;
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
