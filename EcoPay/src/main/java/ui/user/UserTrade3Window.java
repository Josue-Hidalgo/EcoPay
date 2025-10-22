package ui.user;
public class UserTrade3Window extends javax.swing.JFrame {
    public UserTrade3Window() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        ShopBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();
        PopUpPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 79, 950, 10);

        CollectionCenterPanel.setBackground(new java.awt.Color(28, 107, 74));
        CollectionCenterPanel.setLayout(null);

        Title5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("Catálogo de Canjes");
        CollectionCenterPanel.add(Title5);
        Title5.setBounds(220, 40, 190, 31);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        CollectionCenterPanel.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 600, 280);

        jPanel1.add(CollectionCenterPanel);
        CollectionCenterPanel.setBounds(160, 100, 626, 390);

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
        jPanel1.add(ShopBtn);
        ShopBtn.setBounds(870, 0, 80, 80);

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

        PopUpPanel.setBackground(new java.awt.Color(0, 51, 0));
        PopUpPanel.setLayout(null);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("<Insertar Compras>");
        PopUpPanel.add(jLabel10);
        jLabel10.setBounds(20, 20, 119, 404);

        jPanel1.add(PopUpPanel);
        PopUpPanel.setBounds(790, 93, 166, 430);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShopBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShopBtnActionPerformed
        PopUpPanel.setVisible(!PopUpPanel.isVisible());
    }//GEN-LAST:event_ShopBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JPanel PopUpPanel;
    private javax.swing.JButton ShopBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
