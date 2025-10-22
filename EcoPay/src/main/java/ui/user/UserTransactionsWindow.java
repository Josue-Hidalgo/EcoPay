package ui.user;

import ui.utils.Utils;

public class UserTransactionsWindow extends javax.swing.JFrame {

    public UserTransactionsWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
    }
    
    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        CollectionCenterPanel = new javax.swing.JPanel();
        Title5 = new javax.swing.JLabel();
        LoadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackBtn = new javax.swing.JButton();
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
        Title5.setText("Transacciones");
        CollectionCenterPanel.add(Title5);
        Title5.setBounds(180, 30, 150, 31);

        LoadBtn.setBackground(new java.awt.Color(15, 71, 34));
        LoadBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoadBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoadBtn.setText("CARGAR TRANSACCIONES");
        LoadBtn.setBorder(null);
        LoadBtn.setIconTextGap(0);
        LoadBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoadBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        LoadBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        LoadBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        LoadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadBtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(LoadBtn);
        LoadBtn.setBounds(280, 340, 190, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        CollectionCenterPanel.add(jScrollPane1);
        jScrollPane1.setBounds(50, 90, 420, 220);

        BackBtn.setBackground(new java.awt.Color(15, 71, 34));
        BackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("VOLVER");
        BackBtn.setBorder(null);
        BackBtn.setIconTextGap(0);
        BackBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BackBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        BackBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        BackBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        CollectionCenterPanel.add(BackBtn);
        BackBtn.setBounds(50, 340, 190, 30);

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

    private void LoadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoadBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton LoadBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
