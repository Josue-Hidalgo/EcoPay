package ui.superuser;

import ui.utils.Utils;

public class SuperUserListsWindow extends javax.swing.JFrame {

    public SuperUserListsWindow() {
        initComponents();
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(PreviousBtn, "/img/previous.png");
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Title15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListBtn = new javax.swing.JButton();
        Title19 = new javax.swing.JLabel();
        Title20 = new javax.swing.JLabel();
        TypeCB = new javax.swing.JComboBox<>();
        NameCB = new javax.swing.JComboBox<>();
        AdminCB = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ListBtn1 = new javax.swing.JButton();
        Title21 = new javax.swing.JLabel();
        Title22 = new javax.swing.JLabel();
        DistrictCB = new javax.swing.JComboBox<>();
        ProvinceCB = new javax.swing.JComboBox<>();
        CantonCB = new javax.swing.JComboBox<>();
        IdTF = new javax.swing.JTextField();
        NameTF = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ListBtn2 = new javax.swing.JButton();
        Title23 = new javax.swing.JLabel();
        Title24 = new javax.swing.JLabel();
        Title27 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ListBtn3 = new javax.swing.JButton();
        Title25 = new javax.swing.JLabel();
        Title26 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        PreviousBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(15, 71, 34));
        jPanel2.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel2.setLayout(null);

        jSeparator2.setForeground(new java.awt.Color(77, 175, 124));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 79, 960, 10);

        Title15.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title15.setForeground(new java.awt.Color(255, 255, 255));
        Title15.setText("Listados SuperUsuario");
        jPanel2.add(Title15);
        Title15.setBounds(370, 30, 240, 31);

        jPanel1.setBackground(new java.awt.Color(28, 107, 74));
        jPanel1.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(15, 71, 34));

        jPanel4.setBackground(new java.awt.Color(15, 71, 34));
        jPanel4.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel4.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(28, 107, 74));
        jPanel5.setLayout(null);
        jPanel5.add(jLabel2);
        jLabel2.setBounds(610, 70, 0, 0);

        ListBtn.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn.setText("CAGAR LISTA");
        ListBtn.setBorder(null);
        ListBtn.setIconTextGap(0);
        ListBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtnActionPerformed(evt);
            }
        });
        jPanel5.add(ListBtn);
        ListBtn.setBounds(30, 320, 260, 40);

        Title19.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title19.setForeground(new java.awt.Color(255, 255, 255));
        Title19.setText("Comercios Afiliados");
        jPanel5.add(Title19);
        Title19.setBounds(30, 50, 210, 31);

        Title20.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title20.setForeground(new java.awt.Color(204, 153, 0));
        Title20.setText("Listado");
        jPanel5.add(Title20);
        Title20.setBounds(30, 70, 240, 31);

        TypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESAR TIPO DE COMERCIO>" }));
        jPanel5.add(TypeCB);
        TypeCB.setBounds(30, 250, 260, 40);

        NameCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE NOMBRE DEL COMERCIO>" }));
        jPanel5.add(NameCB);
        NameCB.setBounds(30, 130, 260, 40);

        AdminCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE NOMBRE DEL ENCARGADO>" }));
        jPanel5.add(AdminCB);
        AdminCB.setBounds(30, 190, 260, 40);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(640, 0, 320, 490);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "<Insert Colums>"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 640, 490);

        jTabbedPane1.addTab("Comercios", jPanel4);

        jPanel6.setBackground(new java.awt.Color(15, 71, 34));
        jPanel6.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel6.setLayout(null);

        jPanel7.setBackground(new java.awt.Color(28, 107, 74));
        jPanel7.setLayout(null);
        jPanel7.add(jLabel3);
        jLabel3.setBounds(610, 70, 0, 0);

        ListBtn1.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn1.setText("CARGAR LISTA");
        ListBtn1.setBorder(null);
        ListBtn1.setIconTextGap(0);
        ListBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn1ActionPerformed(evt);
            }
        });
        jPanel7.add(ListBtn1);
        ListBtn1.setBounds(30, 350, 260, 40);

        Title21.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title21.setForeground(new java.awt.Color(255, 255, 255));
        Title21.setText("Usuarios del Sistema");
        jPanel7.add(Title21);
        Title21.setBounds(30, 20, 210, 31);

        Title22.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title22.setForeground(new java.awt.Color(204, 153, 0));
        Title22.setText("Listado");
        jPanel7.add(Title22);
        Title22.setBounds(30, 40, 240, 31);

        DistrictCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL CONSULTA>", "PRODUCTOS MÁS SOLICITADOS", "PRODUCTOS OFRECIDOS", "TOP 5 PRODUCTOS MÁS CANJEADOS", "TOTAL PUNTOS POR PRODUCTO" }));
        jPanel7.add(DistrictCB);
        DistrictCB.setBounds(30, 290, 260, 40);

        ProvinceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL CONSULTA>", "PRODUCTOS MÁS SOLICITADOS", "PRODUCTOS OFRECIDOS", "TOP 5 PRODUCTOS MÁS CANJEADOS", "TOTAL PUNTOS POR PRODUCTO" }));
        jPanel7.add(ProvinceCB);
        ProvinceCB.setBounds(30, 190, 260, 40);

        CantonCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL CONSULTA>", "PRODUCTOS MÁS SOLICITADOS", "PRODUCTOS OFRECIDOS", "TOP 5 PRODUCTOS MÁS CANJEADOS", "TOTAL PUNTOS POR PRODUCTO" }));
        jPanel7.add(CantonCB);
        CantonCB.setBounds(30, 240, 260, 40);

        IdTF.setText("CÉDULA");
        IdTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTFActionPerformed(evt);
            }
        });
        jPanel7.add(IdTF);
        IdTF.setBounds(30, 140, 260, 40);

        NameTF.setText("NOMBRE");
        jPanel7.add(NameTF);
        NameTF.setBounds(30, 90, 260, 40);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(640, 0, 320, 490);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "<Insert Colums>"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel6.add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 640, 490);

        jTabbedPane1.addTab("Usuario", jPanel6);

        jPanel8.setBackground(new java.awt.Color(15, 71, 34));
        jPanel8.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel8.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel8.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(28, 107, 74));
        jPanel9.setLayout(null);
        jPanel9.add(jLabel4);
        jLabel4.setBounds(610, 70, 0, 0);

        ListBtn2.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn2.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn2.setText("CARGAR LISTA");
        ListBtn2.setBorder(null);
        ListBtn2.setIconTextGap(0);
        ListBtn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn2.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn2.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn2.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn2ActionPerformed(evt);
            }
        });
        jPanel9.add(ListBtn2);
        ListBtn2.setBounds(30, 340, 260, 40);

        Title23.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title23.setForeground(new java.awt.Color(255, 255, 255));
        Title23.setText("Usuarios del Sistema");
        jPanel9.add(Title23);
        Title23.setBounds(30, 20, 210, 31);

        Title24.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title24.setForeground(new java.awt.Color(204, 153, 0));
        Title24.setText("modificadas en los últimos meses");
        jPanel9.add(Title24);
        Title24.setBounds(30, 70, 250, 31);

        Title27.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title27.setForeground(new java.awt.Color(204, 153, 0));
        Title27.setText("cuyas claves no han sido");
        jPanel9.add(Title27);
        Title27.setBounds(30, 50, 240, 31);

        jTextField3.setText("NOMBRE");
        jPanel9.add(jTextField3);
        jTextField3.setBounds(160, 120, 120, 40);

        jTextField4.setText("USUARIO");
        jPanel9.add(jTextField4);
        jTextField4.setBounds(160, 220, 120, 40);

        jTextField5.setText("NOMBRE");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel9.add(jTextField5);
        jTextField5.setBounds(30, 120, 120, 40);

        jTextField6.setText("APELLIDO");
        jPanel9.add(jTextField6);
        jTextField6.setBounds(30, 170, 120, 40);

        jTextField7.setText("APELLIDO");
        jPanel9.add(jTextField7);
        jTextField7.setBounds(160, 170, 120, 40);

        jTextField9.setText("CÉDULA");
        jPanel9.add(jTextField9);
        jTextField9.setBounds(30, 220, 120, 40);
        jPanel9.add(jDateChooser1);
        jDateChooser1.setBounds(30, 270, 120, 40);
        jPanel9.add(jDateChooser2);
        jDateChooser2.setBounds(160, 270, 120, 40);

        jPanel8.add(jPanel9);
        jPanel9.setBounds(640, 0, 320, 490);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "<Insert Colums>"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel8.add(jScrollPane4);
        jScrollPane4.setBounds(0, 0, 640, 490);

        jTabbedPane1.addTab("Usuarios Claves No Cambiadas", jPanel8);

        jPanel10.setBackground(new java.awt.Color(15, 71, 34));
        jPanel10.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel10.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel10.setLayout(null);

        jPanel11.setBackground(new java.awt.Color(28, 107, 74));
        jPanel11.setLayout(null);
        jPanel11.add(jLabel5);
        jLabel5.setBounds(610, 70, 0, 0);

        ListBtn3.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn3.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn3.setText("CARGAR LISTA");
        ListBtn3.setBorder(null);
        ListBtn3.setIconTextGap(0);
        ListBtn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn3.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn3.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn3.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn3ActionPerformed(evt);
            }
        });
        jPanel11.add(ListBtn3);
        ListBtn3.setBounds(30, 200, 260, 40);

        Title25.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title25.setForeground(new java.awt.Color(255, 255, 255));
        Title25.setText("Productos");
        jPanel11.add(Title25);
        Title25.setBounds(30, 120, 210, 31);

        Title26.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title26.setForeground(new java.awt.Color(204, 153, 0));
        Title26.setText("con mayor solicitud de canje");
        jPanel11.add(Title26);
        Title26.setBounds(30, 140, 240, 31);

        jPanel10.add(jPanel11);
        jPanel11.setBounds(640, 0, 320, 490);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "<Insert Colums>"
            }
        ));
        jScrollPane5.setViewportView(jTable5);

        jPanel10.add(jScrollPane5);
        jScrollPane5.setBounds(0, 0, 640, 490);

        jTabbedPane1.addTab("Productos", jPanel10);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 960, 440);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 80, 960, 440);

        PreviousBtn.setBorder(null);
        PreviousBtn.setIconTextGap(0);
        PreviousBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PreviousBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        PreviousBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        PreviousBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        PreviousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousBtnActionPerformed(evt);
            }
        });
        jPanel2.add(PreviousBtn);
        PreviousBtn.setBounds(880, 0, 80, 80);

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
        jPanel2.add(LogoBtn);
        LogoBtn.setBounds(0, 0, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtnActionPerformed

    private void ListBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn1ActionPerformed

    private void IdTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTFActionPerformed

    private void ListBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void ListBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn3ActionPerformed

    private void PreviousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousBtnActionPerformed
        SuperUserMainWindow superusermainW = new SuperUserMainWindow();
        superusermainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PreviousBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        SuperUserMainWindow superusermainW = new SuperUserMainWindow();
        superusermainW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AdminCB;
    private javax.swing.JComboBox<String> CantonCB;
    private javax.swing.JComboBox<String> DistrictCB;
    private javax.swing.JTextField IdTF;
    private javax.swing.JButton ListBtn;
    private javax.swing.JButton ListBtn1;
    private javax.swing.JButton ListBtn2;
    private javax.swing.JButton ListBtn3;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JComboBox<String> NameCB;
    private javax.swing.JTextField NameTF;
    private javax.swing.JButton PreviousBtn;
    private javax.swing.JComboBox<String> ProvinceCB;
    private javax.swing.JLabel Title15;
    private javax.swing.JLabel Title19;
    private javax.swing.JLabel Title20;
    private javax.swing.JLabel Title21;
    private javax.swing.JLabel Title22;
    private javax.swing.JLabel Title23;
    private javax.swing.JLabel Title24;
    private javax.swing.JLabel Title25;
    private javax.swing.JLabel Title26;
    private javax.swing.JLabel Title27;
    private javax.swing.JComboBox<String> TypeCB;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
