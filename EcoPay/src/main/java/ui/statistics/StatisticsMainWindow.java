package ui.statistics;

import ui.utils.Utils;

public class StatisticsMainWindow extends javax.swing.JFrame {

    public StatisticsMainWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        UsersBtn = new javax.swing.JButton();
        AffiliatedBusinessBtn = new javax.swing.JButton();
        Title1 = new javax.swing.JLabel();
        Title27 = new javax.swing.JLabel();
        Title28 = new javax.swing.JLabel();
        ProductsBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        UsersBtn.setBackground(new java.awt.Color(15, 71, 34));
        UsersBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UsersBtn.setForeground(new java.awt.Color(255, 255, 255));
        UsersBtn.setText("USUARIOS");
        UsersBtn.setBorder(null);
        UsersBtn.setIconTextGap(0);
        UsersBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        UsersBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        UsersBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        UsersBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        UsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersBtnActionPerformed(evt);
            }
        });
        jPanel2.add(UsersBtn);
        UsersBtn.setBounds(100, 240, 220, 40);

        AffiliatedBusinessBtn.setBackground(new java.awt.Color(15, 71, 34));
        AffiliatedBusinessBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AffiliatedBusinessBtn.setForeground(new java.awt.Color(255, 255, 255));
        AffiliatedBusinessBtn.setText("COMERCIOS AFILIADOS");
        AffiliatedBusinessBtn.setBorder(null);
        AffiliatedBusinessBtn.setIconTextGap(0);
        AffiliatedBusinessBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        AffiliatedBusinessBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        AffiliatedBusinessBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        AffiliatedBusinessBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        AffiliatedBusinessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffiliatedBusinessBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AffiliatedBusinessBtn);
        AffiliatedBusinessBtn.setBounds(100, 360, 220, 40);

        Title1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Módulo de Estadísticas");
        jPanel2.add(Title1);
        Title1.setBounds(100, 110, 230, 31);

        Title27.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title27.setForeground(new java.awt.Color(204, 153, 0));
        Title27.setText("quiera realizar...");
        jPanel2.add(Title27);
        Title27.setBounds(100, 190, 210, 31);

        Title28.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title28.setForeground(new java.awt.Color(204, 153, 0));
        Title28.setText("Seleccione la operación que");
        jPanel2.add(Title28);
        Title28.setBounds(100, 160, 210, 31);

        ProductsBtn.setBackground(new java.awt.Color(15, 71, 34));
        ProductsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ProductsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProductsBtn.setText("PRODUCTOS");
        ProductsBtn.setBorder(null);
        ProductsBtn.setIconTextGap(0);
        ProductsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ProductsBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ProductsBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ProductsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ProductsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ProductsBtn);
        ProductsBtn.setBounds(100, 300, 220, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(250, 0, 430, 520);

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
        LogoBtn.setBounds(0, 0, 70, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBtnActionPerformed
        StatisticsTopUsersWindow statsUsersW = new StatisticsTopUsersWindow();
        statsUsersW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsersBtnActionPerformed

    private void AffiliatedBusinessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AffiliatedBusinessBtnActionPerformed
        StatisticsAffiliatedBusinessWindow statsAffiliatedBW = new StatisticsAffiliatedBusinessWindow();
        statsAffiliatedBW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AffiliatedBusinessBtnActionPerformed

    private void ProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsBtnActionPerformed
        StatisticsProductsWindow statsMainW = new StatisticsProductsWindow();
        statsMainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProductsBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        StatisticsMainWindow statsMainW = new StatisticsMainWindow();
        statsMainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AffiliatedBusinessBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton ProductsBtn;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title27;
    private javax.swing.JLabel Title28;
    private javax.swing.JButton UsersBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
