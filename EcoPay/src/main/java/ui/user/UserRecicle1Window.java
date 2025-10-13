package ui.user;

import ui.utils.Utils;

public class UserRecicle1Window extends javax.swing.JFrame {
    
    public UserRecicle1Window() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(NextBtn, "/img/next.png");
        NextBtn.setVisible(false);
       
        // Deshabilitar paneles y todos sus componentes hijos
        Utils.setPanelEnabled(QuantityPanel, false);
        Utils.setPanelEnabled(CoinPanel, false);
        Utils.setPanelEnabled(TotalCoinPanel, false);
        Utils.setPanelEnabled(CollectionCenterPanel, false);
        Utils.setPanelEnabled(CollectionCenterPanel, false);
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        NextBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Title2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        ConfirmBtn = new javax.swing.JButton();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        CollectionCentersTF = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MapBtn = new javax.swing.JButton();
        Confirm2Btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        CoinPanel = new javax.swing.JPanel();
        Title3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CoinsPerKiloTF = new javax.swing.JTextField();
        CoinsPerUnitTF = new javax.swing.JTextField();
        TotalCoinPanel = new javax.swing.JPanel();
        Title4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        QuantityPanel = new javax.swing.JPanel();
        Title6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        Confirm2Btn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 80, 950, 20);

        NextBtn.setBorder(null);
        NextBtn.setIconTextGap(0);
        NextBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        NextBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        NextBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        NextBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        NextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NextBtn);
        NextBtn.setBounds(870, 0, 80, 80);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        Title2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Material a Reciclar");
        jPanel2.add(Title2);
        Title2.setBounds(30, 30, 190, 31);

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Introduzca Material" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(30, 80, 190, 30);

        ConfirmBtn.setBackground(new java.awt.Color(15, 71, 34));
        ConfirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmBtn.setText("CONFIRMAR");
        ConfirmBtn.setBorder(null);
        ConfirmBtn.setIconTextGap(0);
        ConfirmBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ConfirmBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ConfirmBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ConfirmBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ConfirmBtn);
        ConfirmBtn.setBounds(30, 120, 190, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(80, 120, 250, 170);

        CollectionCenterPanel.setBackground(new java.awt.Color(28, 107, 74));
        CollectionCenterPanel.setLayout(null);

        Title5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText("¿Dónde Aceptan?");
        CollectionCenterPanel.add(Title5);
        Title5.setBounds(40, 30, 180, 31);

        CollectionCentersTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CollectionCentersTF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puntos de Acopio" }));
        CollectionCentersTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CollectionCentersTFActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(CollectionCentersTF);
        CollectionCentersTF.setBounds(30, 120, 190, 30);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Horario:");
        CollectionCenterPanel.add(jLabel4);
        jLabel4.setBounds(20, 230, 80, 30);

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contacto:");
        CollectionCenterPanel.add(jLabel3);
        jLabel3.setBounds(20, 160, 80, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("<Introducir Contacto>");
        CollectionCenterPanel.add(jLabel5);
        jLabel5.setBounds(90, 160, 140, 60);

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
        CollectionCenterPanel.add(MapBtn);
        MapBtn.setBounds(30, 80, 190, 30);

        Confirm2Btn1.setBackground(new java.awt.Color(15, 71, 34));
        Confirm2Btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confirm2Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Confirm2Btn1.setText("CONFIRMAR");
        Confirm2Btn1.setBorder(null);
        Confirm2Btn1.setIconTextGap(0);
        Confirm2Btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Confirm2Btn1.setMaximumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn1.setMinimumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn1.setPreferredSize(new java.awt.Dimension(40, 40));
        Confirm2Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm2Btn1ActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(Confirm2Btn1);
        Confirm2Btn1.setBounds(30, 310, 190, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<Introducir Horario>");
        CollectionCenterPanel.add(jLabel7);
        jLabel7.setBounds(90, 230, 140, 60);

        jPanel1.add(CollectionCenterPanel);
        CollectionCenterPanel.setBounds(350, 120, 250, 360);

        CoinPanel.setBackground(new java.awt.Color(28, 107, 74));
        CoinPanel.setLayout(null);

        Title3.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("Monedas");
        CoinPanel.add(Title3);
        Title3.setBounds(30, 30, 190, 31);

        jLabel1.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("x Kilo");
        CoinPanel.add(jLabel1);
        jLabel1.setBounds(140, 120, 60, 30);

        jLabel2.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("x Unidad");
        CoinPanel.add(jLabel2);
        jLabel2.setBounds(140, 80, 60, 30);

        CoinsPerKiloTF.setEditable(false);
        CoinsPerKiloTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CoinsPerKiloTF.setText("0");
        CoinPanel.add(CoinsPerKiloTF);
        CoinsPerKiloTF.setBounds(50, 120, 80, 30);

        CoinsPerUnitTF.setEditable(false);
        CoinsPerUnitTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CoinsPerUnitTF.setText("0");
        CoinPanel.add(CoinsPerUnitTF);
        CoinsPerUnitTF.setBounds(50, 80, 80, 30);

        jPanel1.add(CoinPanel);
        CoinPanel.setBounds(80, 310, 250, 170);

        TotalCoinPanel.setBackground(new java.awt.Color(28, 107, 74));
        TotalCoinPanel.setLayout(null);

        Title4.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("Total de Monedas");
        TotalCoinPanel.add(Title4);
        Title4.setBounds(40, 30, 169, 31);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<Introducir Total Monedas>");
        TotalCoinPanel.add(jLabel6);
        jLabel6.setBounds(20, 70, 210, 80);

        jPanel1.add(TotalCoinPanel);
        TotalCoinPanel.setBounds(620, 310, 250, 170);

        QuantityPanel.setBackground(new java.awt.Color(28, 107, 74));
        QuantityPanel.setLayout(null);

        Title6.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("¿Cuánto a Reciclar?");
        QuantityPanel.add(Title6);
        Title6.setBounds(30, 30, 198, 31);

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uds", "Kilo" }));
        QuantityPanel.add(jComboBox3);
        jComboBox3.setBounds(130, 80, 90, 30);

        jSpinner2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuantityPanel.add(jSpinner2);
        jSpinner2.setBounds(30, 80, 90, 30);

        Confirm2Btn.setBackground(new java.awt.Color(15, 71, 34));
        Confirm2Btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confirm2Btn.setForeground(new java.awt.Color(255, 255, 255));
        Confirm2Btn.setText("CONFIRMAR");
        Confirm2Btn.setBorder(null);
        Confirm2Btn.setIconTextGap(0);
        Confirm2Btn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Confirm2Btn.setMaximumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn.setMinimumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn.setPreferredSize(new java.awt.Dimension(40, 40));
        Confirm2Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm2BtnActionPerformed(evt);
            }
        });
        QuantityPanel.add(Confirm2Btn);
        Confirm2Btn.setBounds(30, 120, 190, 30);

        jPanel1.add(QuantityPanel);
        QuantityPanel.setBounds(620, 120, 250, 170);

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

    private void NextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextBtnActionPerformed
        UserRecicle2Window recicle2W = new UserRecicle2Window();
        recicle2W.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NextBtnActionPerformed

    private void ConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmBtnActionPerformed
        Utils.setPanelEnabled(CoinPanel, true);
        Utils.setPanelEnabled(CollectionCenterPanel, true);        
    }//GEN-LAST:event_ConfirmBtnActionPerformed

    private void CollectionCentersTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CollectionCentersTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CollectionCentersTFActionPerformed

    private void Confirm2BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm2BtnActionPerformed
        Utils.setPanelEnabled(TotalCoinPanel, true);
        NextBtn.setVisible(true);
    }//GEN-LAST:event_Confirm2BtnActionPerformed

    private void MapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapBtnActionPerformed
        UserMapWindow mapW = new UserMapWindow();
        mapW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MapBtnActionPerformed

    private void Confirm2Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm2Btn1ActionPerformed
        Utils.setPanelEnabled(QuantityPanel, true);
    }//GEN-LAST:event_Confirm2Btn1ActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoinPanel;
    private javax.swing.JTextField CoinsPerKiloTF;
    private javax.swing.JTextField CoinsPerUnitTF;
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JComboBox<String> CollectionCentersTF;
    private javax.swing.JButton Confirm2Btn;
    private javax.swing.JButton Confirm2Btn1;
    private javax.swing.JButton ConfirmBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton MapBtn;
    private javax.swing.JButton NextBtn;
    private javax.swing.JPanel QuantityPanel;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JPanel TotalCoinPanel;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
