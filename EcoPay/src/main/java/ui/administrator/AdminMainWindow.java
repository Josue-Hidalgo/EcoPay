package ui.administrator;

import ui.utils.Utils;

public class AdminMainWindow extends javax.swing.JFrame {
    public AdminMainWindow() {
        initComponents();
        
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(LogoBtn2, "/img/mainlogo.png");
        Utils.adjustImageToButton(PreviousBtn, "/img/previous.png");
        Utils.adjustImageToButton(PreviousBtn2, "/img/previous.png");
        
        PreviousBtn.setVisible(false);
        PreviousBtn2.setVisible(false);
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        PreviousBtn2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        SaveBtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ListBtn1 = new javax.swing.JButton();
        DeleteBtn1 = new javax.swing.JButton();
        UpdateBtn1 = new javax.swing.JButton();
        ComerciosCB1 = new javax.swing.JComboBox<>();
        Title18 = new javax.swing.JLabel();
        LogoBtn2 = new javax.swing.JButton();
        Title15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        PreviousBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        SaveBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        ListBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ComerciosCB = new javax.swing.JComboBox<>();
        LogoBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Title8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel1.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(15, 71, 34));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setBackground(new java.awt.Color(15, 71, 34));
        jPanel2.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 100));

        jSeparator2.setForeground(new java.awt.Color(77, 175, 124));

        PreviousBtn2.setBorder(null);
        PreviousBtn2.setIconTextGap(0);
        PreviousBtn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        PreviousBtn2.setMaximumSize(new java.awt.Dimension(40, 40));
        PreviousBtn2.setMinimumSize(new java.awt.Dimension(40, 40));
        PreviousBtn2.setPreferredSize(new java.awt.Dimension(40, 40));
        PreviousBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousBtn2ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(28, 107, 74));
        jPanel5.setLayout(null);

        SaveBtn1.setBackground(new java.awt.Color(15, 71, 34));
        SaveBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SaveBtn1.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn1.setText("GUADAR COMERCIO");
        SaveBtn1.setBorder(null);
        SaveBtn1.setIconTextGap(0);
        SaveBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        SaveBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        SaveBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        SaveBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        SaveBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtn1ActionPerformed(evt);
            }
        });
        jPanel5.add(SaveBtn1);
        SaveBtn1.setBounds(30, 210, 260, 40);
        jPanel5.add(jLabel2);
        jLabel2.setBounds(610, 70, 0, 0);

        ListBtn1.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn1.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn1.setText("CARGAR CATÁLOGO");
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
        jPanel5.add(ListBtn1);
        ListBtn1.setBounds(30, 150, 260, 40);

        DeleteBtn1.setBackground(new java.awt.Color(51, 0, 0));
        DeleteBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn1.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn1.setText("ELIMINAR COMERCIO");
        DeleteBtn1.setBorder(null);
        DeleteBtn1.setIconTextGap(0);
        DeleteBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        DeleteBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        DeleteBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        DeleteBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        DeleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtn1ActionPerformed(evt);
            }
        });
        jPanel5.add(DeleteBtn1);
        DeleteBtn1.setBounds(30, 330, 260, 40);

        UpdateBtn1.setBackground(new java.awt.Color(15, 71, 34));
        UpdateBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn1.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn1.setText("MODIFICAR COMERCIO");
        UpdateBtn1.setBorder(null);
        UpdateBtn1.setIconTextGap(0);
        UpdateBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        UpdateBtn1.setMaximumSize(new java.awt.Dimension(40, 40));
        UpdateBtn1.setMinimumSize(new java.awt.Dimension(40, 40));
        UpdateBtn1.setPreferredSize(new java.awt.Dimension(40, 40));
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });
        jPanel5.add(UpdateBtn1);
        UpdateBtn1.setBounds(30, 270, 260, 40);

        ComerciosCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL COMERCIO>" }));
        jPanel5.add(ComerciosCB1);
        ComerciosCB1.setBounds(30, 90, 260, 40);

        Title18.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title18.setForeground(new java.awt.Color(255, 255, 255));
        Title18.setText("Comercios");
        jPanel5.add(Title18);
        Title18.setBounds(30, 40, 126, 31);

        LogoBtn2.setBorder(null);
        LogoBtn2.setIconTextGap(0);
        LogoBtn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LogoBtn2.setMaximumSize(new java.awt.Dimension(40, 40));
        LogoBtn2.setMinimumSize(new java.awt.Dimension(40, 40));
        LogoBtn2.setPreferredSize(new java.awt.Dimension(40, 40));
        LogoBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoBtn2ActionPerformed(evt);
            }
        });

        Title15.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title15.setForeground(new java.awt.Color(255, 255, 255));
        Title15.setText("Catálogo de Comercios");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Legal", "Nombre", "Horario", "Coordenadas"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(LogoBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(Title15, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300)
                .addComponent(PreviousBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Title15))
                    .addComponent(PreviousBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Comercios", jPanel2);

        jPanel3.setBackground(new java.awt.Color(15, 71, 34));
        jPanel3.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 100));

        jSeparator1.setForeground(new java.awt.Color(77, 175, 124));

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

        jPanel4.setBackground(new java.awt.Color(28, 107, 74));
        jPanel4.setLayout(null);

        SaveBtn.setBackground(new java.awt.Color(15, 71, 34));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setText("GUADAR PRODUCTO");
        SaveBtn.setBorder(null);
        SaveBtn.setIconTextGap(0);
        SaveBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        SaveBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        SaveBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        SaveBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel4.add(SaveBtn);
        SaveBtn.setBounds(30, 210, 260, 40);
        jPanel4.add(jLabel1);
        jLabel1.setBounds(610, 70, 0, 0);

        Title9.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setText("Productos");
        jPanel4.add(Title9);
        Title9.setBounds(30, 40, 100, 31);

        ListBtn.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn.setText("CARGAR CATÁLOGO");
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
        jPanel4.add(ListBtn);
        ListBtn.setBounds(30, 150, 260, 40);

        DeleteBtn.setBackground(new java.awt.Color(51, 0, 0));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("ELIMINAR PRODUCTO");
        DeleteBtn.setBorder(null);
        DeleteBtn.setIconTextGap(0);
        DeleteBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        DeleteBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        DeleteBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        DeleteBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel4.add(DeleteBtn);
        DeleteBtn.setBounds(30, 330, 260, 40);

        UpdateBtn.setBackground(new java.awt.Color(15, 71, 34));
        UpdateBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("MODIFICAR PRODUCTO");
        UpdateBtn.setBorder(null);
        UpdateBtn.setIconTextGap(0);
        UpdateBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        UpdateBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        UpdateBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        UpdateBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel4.add(UpdateBtn);
        UpdateBtn.setBounds(30, 270, 260, 40);

        ComerciosCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE PRODUCTO>" }));
        jPanel4.add(ComerciosCB);
        ComerciosCB.setBounds(30, 90, 260, 40);

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Costo", "Descuento", "Canjeos", "Provisión", "Foto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Title8.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title8.setForeground(new java.awt.Color(255, 255, 255));
        Title8.setText("Catálogo de Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(Title8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addComponent(PreviousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Title8))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(LogoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(PreviousBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.addTab("Productos", jPanel3);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 950, 520);

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

    private void PreviousBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreviousBtn2ActionPerformed

    private void SaveBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtn1ActionPerformed

    private void ListBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn1ActionPerformed

    private void DeleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtn1ActionPerformed

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtn1ActionPerformed

    private void LogoBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtn2ActionPerformed

    private void PreviousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreviousBtnActionPerformed

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComerciosCB;
    private javax.swing.JComboBox<String> ComerciosCB1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DeleteBtn1;
    private javax.swing.JButton ListBtn;
    private javax.swing.JButton ListBtn1;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton LogoBtn2;
    private javax.swing.JButton PreviousBtn;
    private javax.swing.JButton PreviousBtn2;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SaveBtn1;
    private javax.swing.JLabel Title15;
    private javax.swing.JLabel Title18;
    private javax.swing.JLabel Title8;
    private javax.swing.JLabel Title9;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
