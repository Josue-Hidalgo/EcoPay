package ui.administrator;

import ui.user.UserMainWindow;
import ui.utils.Utils;

public class AdminMainWindow extends javax.swing.JFrame {

    public AdminMainWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OperationGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        LogoBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        MapBtn1 = new javax.swing.JButton();
        Title8 = new javax.swing.JLabel();
        MapBtn4 = new javax.swing.JButton();
        OperationsCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 79, 950, 10);

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

        jPanel4.setBackground(new java.awt.Color(28, 107, 74));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MapBtn1.setBackground(new java.awt.Color(15, 71, 34));
        MapBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MapBtn1.setForeground(new java.awt.Color(255, 255, 255));
        MapBtn1.setText("EDITAR");
        MapBtn1.setBorder(null);
        MapBtn1.setIconTextGap(0);
        MapBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MapBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        MapBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        MapBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        MapBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapBtn1ActionPerformed(evt);
            }
        });
        jPanel4.add(MapBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 220, -1));

        Title8.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title8.setForeground(new java.awt.Color(255, 255, 255));
        Title8.setText("OPERACIONES");
        jPanel4.add(Title8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        MapBtn4.setBackground(new java.awt.Color(15, 71, 34));
        MapBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MapBtn4.setForeground(new java.awt.Color(255, 255, 255));
        MapBtn4.setText("LISTAR");
        MapBtn4.setBorder(null);
        MapBtn4.setIconTextGap(0);
        MapBtn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MapBtn4.setMaximumSize(new java.awt.Dimension(40, 40));
        MapBtn4.setMinimumSize(new java.awt.Dimension(40, 40));
        MapBtn4.setPreferredSize(new java.awt.Dimension(40, 40));
        MapBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapBtn4ActionPerformed(evt);
            }
        });
        jPanel4.add(MapBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 220, -1));

        OperationsCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CENTRO_ACOPIO", "CENTRO_ACOPIO_MATERIALES_TIPO_CANT", "CENTRO_ACOPIO_TIPO_MATERIAL", "CENTRO_ACOPIO_TOP_5_USUARIOS_MAYOR_CANTIDAD_CANJEADA", "COMERCIO_AFILIADO", "COMERCIO_AFILIADO_PRODUCTOS", "COMERCIO_AFILIADO_TOP_5", "COMERCIO_AFILIADO_TOTAL_PUNTOS_CANJEADOS", "USUARIO_ADMIN", "USUARIO_MODIFICACIÓN_ANTIGUA", "USUARIO_PERSONA", "USUARIO_PERSONA_DIVISA", "USUARIO_PERSONA_PUNTOS", "USUARIO_PERSONA_TIPO_ID", "USUARIO_PRODUCTO_CON_MAYOR_SOLICITUD_CANJES", "USUARIO_SUPER_USUARIO", "PAÍS", "PROVINCIA", "CANTÓN", "DISTRITO" }));
        jPanel4.add(OperationsCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 500, 30));

        jPanel1.add(jPanel4);
        jPanel4.setBounds(80, 80, 790, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 950, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void MapBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MapBtn1ActionPerformed

    private void MapBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MapBtn4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton MapBtn1;
    private javax.swing.JButton MapBtn4;
    private javax.swing.ButtonGroup OperationGroup;
    private javax.swing.JComboBox<String> OperationsCB;
    private javax.swing.JLabel Title8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
