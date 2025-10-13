package ui.user;

import ui.utils.Utils;

public class UserTrade2Window extends javax.swing.JFrame {

    public UserTrade2Window() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(ShopBtn, "/img/shop.png");
        
        Utils.adjustImageToButton(Prod1, "/img/food.png");
        Utils.adjustImageToButton(Prod2, "/img/food.png");
        Utils.adjustImageToButton(Prod3, "/img/food.png");
        
        PopUpPanel.setVisible(false);
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        CataloguePanel = new javax.swing.JPanel();
        Prod3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Prod2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Prod1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ShopBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();
        PopUpPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));

        CollectionCenterPanel.setBackground(new java.awt.Color(28, 107, 74));

        Title5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Catálogo de Canjes");

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        CataloguePanel.setBackground(new java.awt.Color(28, 107, 74));
        CataloguePanel.setLayout(null);

        Prod3.setBorder(null);
        Prod3.setIconTextGap(0);
        Prod3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Prod3.setMaximumSize(new java.awt.Dimension(40, 40));
        Prod3.setMinimumSize(new java.awt.Dimension(40, 40));
        Prod3.setPreferredSize(new java.awt.Dimension(40, 40));
        Prod3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prod3ActionPerformed(evt);
            }
        });
        CataloguePanel.add(Prod3);
        Prod3.setBounds(420, 10, 80, 80);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("<Inserte Nombre Producto>");
        CataloguePanel.add(jLabel1);
        jLabel1.setBounds(0, 90, 167, 18);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<Inserte Nombre Producto>");
        CataloguePanel.add(jLabel2);
        jLabel2.setBounds(191, 92, 167, 18);

        Prod2.setBorder(null);
        Prod2.setIconTextGap(0);
        Prod2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Prod2.setMaximumSize(new java.awt.Dimension(40, 40));
        Prod2.setMinimumSize(new java.awt.Dimension(40, 40));
        Prod2.setPreferredSize(new java.awt.Dimension(40, 40));
        Prod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prod2ActionPerformed(evt);
            }
        });
        CataloguePanel.add(Prod2);
        Prod2.setBounds(240, 10, 80, 80);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<Inserte Precio y Descuento>");
        CataloguePanel.add(jLabel3);
        jLabel3.setBounds(380, 150, 172, 18);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("<Inserte Nombre Comercio>");
        CataloguePanel.add(jLabel4);
        jLabel4.setBounds(190, 120, 170, 18);

        Prod1.setBorder(null);
        Prod1.setIconTextGap(0);
        Prod1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Prod1.setMaximumSize(new java.awt.Dimension(40, 40));
        Prod1.setMinimumSize(new java.awt.Dimension(40, 40));
        Prod1.setPreferredSize(new java.awt.Dimension(40, 40));
        Prod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prod1ActionPerformed(evt);
            }
        });
        CataloguePanel.add(Prod1);
        Prod1.setBounds(50, 10, 80, 80);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<Inserte Nombre Producto>");
        CataloguePanel.add(jLabel5);
        jLabel5.setBounds(380, 90, 167, 18);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<Inserte Nombre Comercio>");
        CataloguePanel.add(jLabel6);
        jLabel6.setBounds(380, 120, 170, 18);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<Inserte Nombre Comercio>");
        CataloguePanel.add(jLabel7);
        jLabel7.setBounds(0, 120, 170, 18);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("<Inserte Precio y Descuento>");
        CataloguePanel.add(jLabel8);
        jLabel8.setBounds(0, 150, 172, 18);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("<Inserte Precio y Descuento>");
        CataloguePanel.add(jLabel9);
        jLabel9.setBounds(190, 150, 172, 18);

        jPanel2.add(CataloguePanel);
        CataloguePanel.setBounds(40, 10, 550, 290);

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout CollectionCenterPanelLayout = new javax.swing.GroupLayout(CollectionCenterPanel);
        CollectionCenterPanel.setLayout(CollectionCenterPanelLayout);
        CollectionCenterPanelLayout.setHorizontalGroup(
            CollectionCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CollectionCenterPanelLayout.createSequentialGroup()
                .addGroup(CollectionCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CollectionCenterPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Title5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CollectionCenterPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CollectionCenterPanelLayout.setVerticalGroup(
            CollectionCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CollectionCenterPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Title5)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ShopBtn.setBorder(null);
        ShopBtn.setIconTextGap(0);
        ShopBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ShopBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ShopBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ShopBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ShopBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShopBtnActionPerformed(evt);
            }
        });

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

        PopUpPanel.setBackground(new java.awt.Color(0, 51, 0));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<Insertar Compras>");

        javax.swing.GroupLayout PopUpPanelLayout = new javax.swing.GroupLayout(PopUpPanel);
        PopUpPanel.setLayout(PopUpPanelLayout);
        PopUpPanelLayout.setHorizontalGroup(
            PopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PopUpPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        PopUpPanelLayout.setVerticalGroup(
            PopUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PopUpPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(CollectionCenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(PopUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(870, 870, 870)
                        .addComponent(ShopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(CollectionCenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(PopUpPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void Prod3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prod3ActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Prod3ActionPerformed

    private void ShopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopBtnActionPerformed
        PopUpPanel.setVisible(!PopUpPanel.isVisible());
    }//GEN-LAST:event_ShopBtnActionPerformed

    private void Prod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prod2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prod2ActionPerformed

    private void Prod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prod1ActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CataloguePanel;
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JPanel PopUpPanel;
    private javax.swing.JButton Prod1;
    private javax.swing.JButton Prod2;
    private javax.swing.JButton Prod3;
    private javax.swing.JButton ShopBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
