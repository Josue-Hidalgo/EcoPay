package ui.auth;

import ui.utils.Utils;

public class RegisterWindow extends javax.swing.JFrame {

    public RegisterWindow() {
        initComponents();
        // Inicializar IMG
        Utils.adjustImageToButton(ProfileBtn, "/img/profile.png");
    }

    // DO NOT TOUCH
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SexGroupBtn = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ProfileBtn = new javax.swing.JButton();
        IdentificationTypeComboBox = new javax.swing.JComboBox<>();
        IdentificationTF = new javax.swing.JTextField();
        FirstNameTF = new javax.swing.JTextField();
        FirstLastNameTF = new javax.swing.JTextField();
        SecondNameTF = new javax.swing.JTextField();
        SecondLastNameTF = new javax.swing.JTextField();
        PhoneTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        MaleCkB = new javax.swing.JCheckBox();
        FemaleCkB = new javax.swing.JCheckBox();
        CountryCB = new javax.swing.JComboBox<>();
        ProvinceCB = new javax.swing.JComboBox<>();
        CantonCB = new javax.swing.JComboBox<>();
        DistrictCB = new javax.swing.JComboBox<>();
        UserTF = new javax.swing.JTextField();
        ShowPWCkB = new javax.swing.JCheckBox();
        PasswordPF = new javax.swing.JPasswordField();
        ConfirmationPF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        RegisterBtn = new javax.swing.JButton();
        LoginBtn = new javax.swing.JButton();
        DateBorn = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(960, 540));

        jPanel1.setBackground(new java.awt.Color(15, 71, 34));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 100));

        jPanel2.setBackground(new java.awt.Color(28, 107, 74));

        Title.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Register");

        ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBtnActionPerformed(evt);
            }
        });

        IdentificationTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo Identificación" }));

        IdentificationTF.setText("Identificación");
        IdentificationTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IdentificationTFMouseClicked(evt);
            }
        });

        FirstNameTF.setText("Nombre");
        FirstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameTFMouseClicked(evt);
            }
        });
        FirstNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTFActionPerformed(evt);
            }
        });

        FirstLastNameTF.setText("Apellido");
        FirstLastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstLastNameTFMouseClicked(evt);
            }
        });

        SecondNameTF.setText("Nombre (Opcional)");
        SecondNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecondNameTFMouseClicked(evt);
            }
        });

        SecondLastNameTF.setText("Apellido (2do)");
        SecondLastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SecondLastNameTFMouseClicked(evt);
            }
        });

        PhoneTF.setText("Número Teléfono");
        PhoneTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneTFMouseClicked(evt);
            }
        });

        EmailTF.setText("Email");
        EmailTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTFMouseClicked(evt);
            }
        });

        SexGroupBtn.add(MaleCkB);
        MaleCkB.setText("Masculino");
        MaleCkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleCkBActionPerformed(evt);
            }
        });

        SexGroupBtn.add(FemaleCkB);
        FemaleCkB.setText("Femenino");

        CountryCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Country" }));
        CountryCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CountryCBMouseClicked(evt);
            }
        });
        CountryCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryCBActionPerformed(evt);
            }
        });

        ProvinceCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Province" }));

        CantonCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Canton" }));

        DistrictCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "District" }));

        UserTF.setText("Nombre Usuario");
        UserTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserTFMouseClicked(evt);
            }
        });

        ShowPWCkB.setText("Mostrar Contraseña");
        ShowPWCkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPWCkBActionPerformed(evt);
            }
        });

        PasswordPF.setText("Password");
        PasswordPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordPFActionPerformed(evt);
            }
        });

        ConfirmationPF.setText("Password");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha de Nacimiento");

        RegisterBtn.setBackground(new java.awt.Color(15, 71, 34));
        RegisterBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegisterBtn.setText("REGISTER");
        RegisterBtn.setBorder(null);
        RegisterBtn.setIconTextGap(0);
        RegisterBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        RegisterBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        RegisterBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        RegisterBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(28, 107, 74));
        LoginBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("QUIERO INICIAR SESIÓN");
        LoginBtn.setBorder(null);
        LoginBtn.setIconTextGap(0);
        LoginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        LoginBtn.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginBtn.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginBtn.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MaleCkB)
                                    .addComponent(FemaleCkB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(DateBorn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IdentificationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IdentificationTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FirstLastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SecondNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SecondLastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CountryCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ProvinceCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CantonCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(DistrictCB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(UserTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ShowPWCkB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ConfirmationPF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(ProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MaleCkB)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(FemaleCkB)))
                        .addGap(116, 116, 116)
                        .addComponent(DateBorn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdentificationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdentificationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstLastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecondNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SecondLastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CountryCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProvinceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantonCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DistrictCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UserTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PasswordPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowPWCkB)
                            .addComponent(ConfirmationPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(RegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        String imagePath = Utils.selectImage(this);
        if (imagePath != null) {
            System.out.println("Selected image: " + imagePath);
            // Optionally show it in a JLabel:
            Utils.adjustImageToButton(ProfileBtn, imagePath);
            //ImageIcon icon = new ImageIcon(imagePath);
            //Image scaled = icon.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
            //ProfileBtn.setIcon(new ImageIcon(scaled));
        }
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void FirstNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTFActionPerformed

    private void MaleCkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleCkBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaleCkBActionPerformed

    private void CountryCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CountryCBActionPerformed

    private void ShowPWCkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPWCkBActionPerformed
        if (ShowPWCkB.isSelected()) {
            // Mostrar texto plano
            PasswordPF.setEchoChar((char) 0);
            ConfirmationPF.setEchoChar((char) 0);
        } else {
            // Ocultar texto (volver a usar el carácter de ocultamiento por defecto)
            PasswordPF.setEchoChar('•'); // Puedes usar '*' también
            ConfirmationPF.setEchoChar('•');
        }
    }//GEN-LAST:event_ShowPWCkBActionPerformed

    private void IdentificationTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IdentificationTFMouseClicked
        IdentificationTF.setText("");
    }//GEN-LAST:event_IdentificationTFMouseClicked

    private void FirstNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTFMouseClicked
        FirstNameTF.setText("");
    }//GEN-LAST:event_FirstNameTFMouseClicked

    private void FirstLastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstLastNameTFMouseClicked
        FirstLastNameTF.setText("");
    }//GEN-LAST:event_FirstLastNameTFMouseClicked

    private void SecondNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondNameTFMouseClicked
        SecondNameTF.setText("");
    }//GEN-LAST:event_SecondNameTFMouseClicked

    private void SecondLastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SecondLastNameTFMouseClicked
        SecondLastNameTF.setText("");
    }//GEN-LAST:event_SecondLastNameTFMouseClicked

    private void PhoneTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneTFMouseClicked
        PhoneTF.setText("");
    }//GEN-LAST:event_PhoneTFMouseClicked

    private void EmailTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTFMouseClicked
        EmailTF.setText("");
    }//GEN-LAST:event_EmailTFMouseClicked

    private void CountryCBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CountryCBMouseClicked
        
    }//GEN-LAST:event_CountryCBMouseClicked

    private void UserTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserTFMouseClicked
        UserTF.setText("");
    }//GEN-LAST:event_UserTFMouseClicked

    private void PasswordPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordPFActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        RegisterWindow regW = new RegisterWindow();
        regW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        LoginWindow loginW = new LoginWindow();
        loginW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LoginBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CantonCB;
    private javax.swing.JPasswordField ConfirmationPF;
    private javax.swing.JComboBox<String> CountryCB;
    private com.toedter.calendar.JDateChooser DateBorn;
    private javax.swing.JComboBox<String> DistrictCB;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JCheckBox FemaleCkB;
    private javax.swing.JTextField FirstLastNameTF;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField IdentificationTF;
    private javax.swing.JComboBox<String> IdentificationTypeComboBox;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JCheckBox MaleCkB;
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JTextField PhoneTF;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JComboBox<String> ProvinceCB;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JTextField SecondLastNameTF;
    private javax.swing.JTextField SecondNameTF;
    private javax.swing.ButtonGroup SexGroupBtn;
    private javax.swing.JCheckBox ShowPWCkB;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UserTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
