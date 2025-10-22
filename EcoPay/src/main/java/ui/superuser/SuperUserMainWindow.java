package ui.superuser;

import ui.statistics.StatisticsWindow;
import ui.utils.Utils;

public class SuperUserMainWindow extends javax.swing.JFrame {

    public SuperUserMainWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(ProfileBtn, "/img/profile.png");
    }
    
    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ListsBtn = new javax.swing.JButton();
        StatisticsBtn = new javax.swing.JButton();
        Title1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        Title27 = new javax.swing.JLabel();
        Title28 = new javax.swing.JLabel();
        ProfileBtn = new javax.swing.JButton();
        ConsultsBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        ListsBtn.setBackground(new java.awt.Color(15, 71, 34));
        ListsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ListsBtn.setText("LISTADO");
        ListsBtn.setBorder(null);
        ListsBtn.setIconTextGap(0);
        ListsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListsBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ListsBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ListsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ListsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ListsBtn);
        ListsBtn.setBounds(50, 270, 220, 40);

        StatisticsBtn.setBackground(new java.awt.Color(15, 71, 34));
        StatisticsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StatisticsBtn.setForeground(new java.awt.Color(255, 255, 255));
        StatisticsBtn.setText("ESTADÍSTICAS");
        StatisticsBtn.setBorder(null);
        StatisticsBtn.setIconTextGap(0);
        StatisticsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        StatisticsBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        StatisticsBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        StatisticsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        StatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(StatisticsBtn);
        StatisticsBtn.setBounds(50, 390, 220, 40);

        Title1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("¡Bienvenido!...");
        jPanel2.add(Title1);
        Title1.setBounds(30, 30, 270, 31);

        Title2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("<Nombre de S. Usuario>");
        jPanel2.add(Title2);
        Title2.setBounds(40, 70, 240, 31);

        Title27.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title27.setForeground(new java.awt.Color(204, 153, 0));
        Title27.setText("quiera realizar...");
        jPanel2.add(Title27);
        Title27.setBounds(50, 230, 210, 31);

        Title28.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title28.setForeground(new java.awt.Color(204, 153, 0));
        Title28.setText("Seleccione la operación que");
        jPanel2.add(Title28);
        Title28.setBounds(50, 200, 210, 31);

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
        jPanel2.add(ProfileBtn);
        ProfileBtn.setBounds(110, 110, 80, 80);

        ConsultsBtn.setBackground(new java.awt.Color(15, 71, 34));
        ConsultsBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ConsultsBtn.setForeground(new java.awt.Color(255, 255, 255));
        ConsultsBtn.setText("CONSULTAS");
        ConsultsBtn.setBorder(null);
        ConsultsBtn.setIconTextGap(0);
        ConsultsBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ConsultsBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ConsultsBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ConsultsBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ConsultsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultsBtnActionPerformed(evt);
            }
        });
        jPanel2.add(ConsultsBtn);
        ConsultsBtn.setBounds(50, 330, 220, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(320, 30, 320, 460);

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

    private void ListsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListsBtnActionPerformed
        SuperUserListsWindow superListsW = new SuperUserListsWindow();
        superListsW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListsBtnActionPerformed

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void StatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsBtnActionPerformed
        StatisticsWindow superConsultsW = new StatisticsWindow();
        superConsultsW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StatisticsBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        SuperUserMainWindow superW = new SuperUserMainWindow();
        superW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void ConsultsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultsBtnActionPerformed
        SuperUserConsultsWindow superConsultsW = new SuperUserConsultsWindow();
        superConsultsW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ConsultsBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultsBtn;
    private javax.swing.JButton ListsBtn;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton StatisticsBtn;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title27;
    private javax.swing.JLabel Title28;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
