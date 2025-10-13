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
        Confirm2Btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        Confirm2Btn1.setBackground(new java.awt.Color(15, 71, 34));
        Confirm2Btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confirm2Btn1.setForeground(new java.awt.Color(255, 255, 255));
        Confirm2Btn1.setText("VOLVER");
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
        Confirm2Btn1.setBounds(160, 330, 190, 30);

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JButton Confirm2Btn1;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JLabel Title5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
