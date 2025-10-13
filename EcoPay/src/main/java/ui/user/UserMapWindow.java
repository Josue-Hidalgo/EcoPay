package ui.user;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import ui.utils.Map;
import ui.utils.Utils;

public class UserMapWindow extends javax.swing.JFrame {
    private Map mapaUtils;

    public UserMapWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");

        mapaUtils = new Map();
        SwingUtilities.invokeLater(() -> {
            mapaUtils.drawMap(MapPanel);

            // Agregar marcadores después si querés
            // mapaUtils.addMarker(9.94, -84.08, "Panadería El Sol");
        });
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        MapPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(950, 520));

        jPanel3.setBackground(new java.awt.Color(15, 71, 34));
        jPanel3.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 100));

        MapPanel.setBackground(new java.awt.Color(28, 107, 74));
        MapPanel.setMaximumSize(new java.awt.Dimension(950, 430));
        MapPanel.setMinimumSize(new java.awt.Dimension(950, 430));
        MapPanel.setPreferredSize(new java.awt.Dimension(950, 430));
        MapPanel.setLayout(null);

        Title.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        MapPanel.add(Title);
        Title.setBounds(136, 6, 220, 80);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(MapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(MapPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        UserMainWindow mainW = new UserMainWindow();
        mainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoBtn;
    private javax.swing.JPanel MapPanel;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
