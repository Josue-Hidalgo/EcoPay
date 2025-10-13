package ui.user;

import ui.utils.Utils;

public class UserRecicle2Window extends javax.swing.JFrame {
    public UserRecicle2Window() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(PhotoMaterialBtn, "/img/bottle.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Confirm2Btn1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PhotoMaterialBtn = new javax.swing.JButton();
        Confirm2Btn2 = new javax.swing.JButton();
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
        Title5.setText("Confirmación de Depósito a Punto de Acopio");
        CollectionCenterPanel.add(Title5);
        Title5.setBounds(60, 30, 430, 31);

        jLabel4.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Número de Autorización:");
        CollectionCenterPanel.add(jLabel4);
        jLabel4.setBounds(20, 90, 160, 30);

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
        Confirm2Btn1.setBounds(280, 330, 190, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("<Introducir Número>");
        CollectionCenterPanel.add(jLabel7);
        jLabel7.setBounds(190, 90, 290, 30);

        jLabel5.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Foto del Material:");
        CollectionCenterPanel.add(jLabel5);
        jLabel5.setBounds(20, 140, 160, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Toma una foto en la que se vean los materiales.");
        CollectionCenterPanel.add(jLabel8);
        jLabel8.setBounds(130, 280, 250, 30);

        PhotoMaterialBtn.setBorder(null);
        PhotoMaterialBtn.setIconTextGap(0);
        PhotoMaterialBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PhotoMaterialBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        PhotoMaterialBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        PhotoMaterialBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        PhotoMaterialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhotoMaterialBtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(PhotoMaterialBtn);
        PhotoMaterialBtn.setBounds(180, 140, 150, 140);

        Confirm2Btn2.setBackground(new java.awt.Color(15, 71, 34));
        Confirm2Btn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confirm2Btn2.setForeground(new java.awt.Color(255, 255, 255));
        Confirm2Btn2.setText("CANCELAR");
        Confirm2Btn2.setBorder(null);
        Confirm2Btn2.setIconTextGap(0);
        Confirm2Btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Confirm2Btn2.setMaximumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn2.setMinimumSize(new java.awt.Dimension(40, 40));
        Confirm2Btn2.setPreferredSize(new java.awt.Dimension(40, 40));
        Confirm2Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm2Btn2ActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(Confirm2Btn2);
        Confirm2Btn2.setBounds(50, 330, 190, 30);

        jPanel1.add(CollectionCenterPanel);
        CollectionCenterPanel.setBounds(210, 100, 510, 390);

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

    private void PhotoMaterialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhotoMaterialBtnActionPerformed
        String imagePath = Utils.selectImage(this);
        if (imagePath != null) {
            Utils.adjustImageToButton(PhotoMaterialBtn, imagePath);
            
            //OBTENER IMG
        }
    }//GEN-LAST:event_PhotoMaterialBtnActionPerformed

    private void Confirm2Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm2Btn1ActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Confirm2Btn1ActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void Confirm2Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm2Btn2ActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Confirm2Btn2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton Confirm2Btn1;
    private javax.swing.JButton Confirm2Btn2;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton PhotoMaterialBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
