package ui.statistics;

import ui.utils.Utils;

public class StatisticsUsersAgeWindow extends javax.swing.JFrame {

    public StatisticsUsersAgeWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Graphic = new javax.swing.JPanel();
        GraphicSP = new javax.swing.JScrollPane();
        LogoBtn = new javax.swing.JButton();
        Title2 = new javax.swing.JLabel();
        UsersBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));
        jPanel2.setLayout(null);

        Graphic.setLayout(null);
        Graphic.add(GraphicSP);
        GraphicSP.setBounds(0, 0, 480, 520);

        jPanel2.add(Graphic);
        Graphic.setBounds(0, 0, 480, 520);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(470, 0, 480, 520);

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

        Title2.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Estadísticas de ...");
        jPanel1.add(Title2);
        Title2.setBounds(160, 20, 170, 31);

        UsersBtn.setBackground(new java.awt.Color(28, 107, 74));
        UsersBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UsersBtn.setForeground(new java.awt.Color(255, 255, 255));
        UsersBtn.setText("GRAFICAR");
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
        jPanel1.add(UsersBtn);
        UsersBtn.setBounds(130, 460, 220, 40);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Edad", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 90, 340, 360);

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

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        StatisticsMainWindow statsMainW = new StatisticsMainWindow();
        statsMainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void UsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBtnActionPerformed
        StatisticsUsersTopWindow statsUsersW = new StatisticsUsersTopWindow();
        statsUsersW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsersBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Graphic;
    private javax.swing.JScrollPane GraphicSP;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JLabel Title2;
    private javax.swing.JButton UsersBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
