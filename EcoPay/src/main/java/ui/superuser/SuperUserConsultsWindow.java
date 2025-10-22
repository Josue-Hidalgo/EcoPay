
package ui.superuser;

import ui.auth.LoginWindow;
import ui.utils.Utils;

public class SuperUserConsultsWindow extends javax.swing.JFrame {

    public SuperUserConsultsWindow() {
        initComponents();
        
        Utils.adjustImageToButton(LogoBtn, "/img/mainlogo.png");
        Utils.adjustImageToButton(PreviousBtn, "/img/previous.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        Title15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        CollectionCenterPanel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ListBtn2 = new javax.swing.JButton();
        Title22 = new javax.swing.JLabel();
        Title23 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ListBtn3 = new javax.swing.JButton();
        Title24 = new javax.swing.JLabel();
        Title25 = new javax.swing.JLabel();
        Title26 = new javax.swing.JLabel();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ListBtn4 = new javax.swing.JButton();
        Title27 = new javax.swing.JLabel();
        Title28 = new javax.swing.JLabel();
        Title29 = new javax.swing.JLabel();
        UserNameTF = new javax.swing.JTextField();
        UserNameTF1 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ListBtn = new javax.swing.JButton();
        Title19 = new javax.swing.JLabel();
        Title20 = new javax.swing.JLabel();
        ComerciosCB1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ListBtn1 = new javax.swing.JButton();
        Title21 = new javax.swing.JLabel();
        Title30 = new javax.swing.JLabel();
        UserNameTF2 = new javax.swing.JTextField();
        UserNameTF3 = new javax.swing.JTextField();
        UserNameTF4 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ListBtn5 = new javax.swing.JButton();
        Title31 = new javax.swing.JLabel();
        Title32 = new javax.swing.JLabel();
        UserNameTF5 = new javax.swing.JTextField();
        UserNameTF6 = new javax.swing.JTextField();
        ComerciosCB2 = new javax.swing.JComboBox<>();
        ComerciosCB3 = new javax.swing.JComboBox<>();
        ComerciosCB4 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ListBtn6 = new javax.swing.JButton();
        Title33 = new javax.swing.JLabel();
        Title34 = new javax.swing.JLabel();
        UserNameTF7 = new javax.swing.JTextField();
        UserNameTF8 = new javax.swing.JTextField();
        UserNameTF9 = new javax.swing.JTextField();
        UserNameTF10 = new javax.swing.JTextField();
        UserNameTF11 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        Title35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ListBtn7 = new javax.swing.JButton();
        Title36 = new javax.swing.JLabel();
        Title37 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        Title38 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        PreviousBtn = new javax.swing.JButton();
        LogoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(15, 71, 34));
        jPanel2.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel2.setLayout(null);

        jSeparator2.setForeground(new java.awt.Color(77, 175, 124));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 79, 960, 10);

        Title15.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title15.setForeground(new java.awt.Color(255, 255, 255));
        Title15.setText("Consultas SuperUsuario");
        jPanel2.add(Title15);
        Title15.setBounds(370, 30, 240, 31);

        jPanel1.setBackground(new java.awt.Color(28, 107, 74));
        jPanel1.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(15, 71, 34));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        CollectionCenterPanel.setBackground(new java.awt.Color(28, 107, 74));
        CollectionCenterPanel.setMinimumSize(new java.awt.Dimension(960, 80));
        CollectionCenterPanel.setPreferredSize(new java.awt.Dimension(960, 100));
        CollectionCenterPanel.setLayout(null);

        jTabbedPane2.setBackground(new java.awt.Color(15, 71, 34));
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));

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
        ListBtn2.setText("CONSULTAR");
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
        ListBtn2.setBounds(30, 190, 260, 40);

        Title22.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title22.setForeground(new java.awt.Color(204, 153, 0));
        Title22.setText("Top 5 usuarios que más reciclan");
        jPanel9.add(Title22);
        Title22.setBounds(30, 150, 240, 31);

        Title23.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title23.setForeground(new java.awt.Color(255, 255, 255));
        Title23.setText("Centros de Acopio");
        jPanel9.add(Title23);
        Title23.setBounds(30, 120, 210, 31);

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

        jTabbedPane2.addTab("Top 5 Usuarios Que Más Reciclan", jPanel8);

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
        ListBtn3.setText("CONSULTAR");
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
        ListBtn3.setBounds(30, 240, 260, 40);

        Title24.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title24.setForeground(new java.awt.Color(204, 153, 0));
        Title24.setText("Mes y  Año");
        jPanel11.add(Title24);
        Title24.setBounds(30, 130, 240, 31);

        Title25.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title25.setForeground(new java.awt.Color(255, 255, 255));
        Title25.setText("Centros de Acopio");
        jPanel11.add(Title25);
        Title25.setBounds(30, 80, 210, 31);

        Title26.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title26.setForeground(new java.awt.Color(204, 153, 0));
        Title26.setText("Materiales Reciclados por Tipo,");
        jPanel11.add(Title26);
        Title26.setBounds(30, 110, 240, 31);

        jMonthChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.add(jMonthChooser1);
        jMonthChooser1.setBounds(30, 180, 140, 40);

        jYearChooser1.setBackground(new java.awt.Color(28, 107, 74));
        jPanel11.add(jYearChooser1);
        jYearChooser1.setBounds(170, 180, 120, 40);

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

        jTabbedPane2.addTab("Materiales Reciclados por Tipo", jPanel10);

        jPanel12.setBackground(new java.awt.Color(15, 71, 34));
        jPanel12.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel12.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel12.setLayout(null);

        jPanel13.setBackground(new java.awt.Color(28, 107, 74));
        jPanel13.setLayout(null);
        jPanel13.add(jLabel6);
        jLabel6.setBounds(610, 70, 0, 0);

        ListBtn4.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn4.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn4.setText("CONSULTAR");
        ListBtn4.setBorder(null);
        ListBtn4.setIconTextGap(0);
        ListBtn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn4.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn4.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn4.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn4ActionPerformed(evt);
            }
        });
        jPanel13.add(ListBtn4);
        ListBtn4.setBounds(30, 260, 260, 40);

        Title27.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title27.setForeground(new java.awt.Color(204, 153, 0));
        Title27.setText("que llegaron al Centro de Acopio");
        jPanel13.add(Title27);
        Title27.setBounds(30, 110, 240, 31);

        Title28.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title28.setForeground(new java.awt.Color(255, 255, 255));
        Title28.setText("Centros de Acopio");
        jPanel13.add(Title28);
        Title28.setBounds(30, 60, 210, 31);

        Title29.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title29.setForeground(new java.awt.Color(204, 153, 0));
        Title29.setText("Puntos obtenidos por usuarios ");
        jPanel13.add(Title29);
        Title29.setBounds(30, 90, 240, 31);

        UserNameTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF.setText("Nombre de Usuario");
        UserNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTFMouseClicked(evt);
            }
        });
        jPanel13.add(UserNameTF);
        UserNameTF.setBounds(30, 210, 260, 40);

        UserNameTF1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF1.setText("Cédula");
        UserNameTF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF1MouseClicked(evt);
            }
        });
        jPanel13.add(UserNameTF1);
        UserNameTF1.setBounds(30, 160, 260, 40);

        jPanel12.add(jPanel13);
        jPanel13.setBounds(640, 0, 320, 490);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable6);

        jPanel12.add(jScrollPane6);
        jScrollPane6.setBounds(0, 0, 640, 490);

        jTabbedPane2.addTab("Puntos de Usuarios que llegaron a Centro de Acopio", jPanel12);

        CollectionCenterPanel.add(jTabbedPane2);
        jTabbedPane2.setBounds(0, 0, 960, 520);

        jTabbedPane1.addTab("Centros de Acopio", CollectionCenterPanel);

        jPanel3.setBackground(new java.awt.Color(15, 71, 34));
        jPanel3.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel3.setLayout(null);

        jTabbedPane3.setBackground(new java.awt.Color(15, 71, 34));
        jTabbedPane3.setForeground(new java.awt.Color(255, 255, 255));

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
        ListBtn.setText("CONSULTAR");
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
        ListBtn.setBounds(30, 230, 260, 40);

        Title19.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title19.setForeground(new java.awt.Color(255, 255, 255));
        Title19.setText("Comercios Afiliados");
        jPanel5.add(Title19);
        Title19.setBounds(30, 110, 210, 31);

        Title20.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title20.setForeground(new java.awt.Color(204, 153, 0));
        Title20.setText("Consultas Directas");
        jPanel5.add(Title20);
        Title20.setBounds(30, 130, 240, 31);

        ComerciosCB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL CONSULTA>", "PRODUCTOS MÁS SOLICITADOS", "PRODUCTOS OFRECIDOS", "TOP 5 PRODUCTOS MÁS CANJEADOS", "TOTAL PUNTOS POR PRODUCTO" }));
        jPanel5.add(ComerciosCB1);
        ComerciosCB1.setBounds(30, 170, 260, 40);

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

        jTabbedPane3.addTab("Consultas Directas", jPanel4);

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
        ListBtn1.setText("CONSULTAR");
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
        ListBtn1.setBounds(30, 290, 260, 40);

        Title21.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title21.setForeground(new java.awt.Color(255, 255, 255));
        Title21.setText("Comercios Afiliados");
        jPanel7.add(Title21);
        Title21.setBounds(30, 30, 210, 31);

        Title30.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title30.setForeground(new java.awt.Color(204, 153, 0));
        Title30.setText("Listado de Comercios");
        jPanel7.add(Title30);
        Title30.setBounds(30, 50, 240, 31);

        UserNameTF2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF2.setText("Tipo de Comercio");
        UserNameTF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF2MouseClicked(evt);
            }
        });
        jPanel7.add(UserNameTF2);
        UserNameTF2.setBounds(30, 220, 260, 40);

        UserNameTF3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF3.setText("Nombre del Comercio");
        UserNameTF3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF3MouseClicked(evt);
            }
        });
        jPanel7.add(UserNameTF3);
        UserNameTF3.setBounds(30, 100, 260, 40);

        UserNameTF4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF4.setText("Administrador del Comercio");
        UserNameTF4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF4MouseClicked(evt);
            }
        });
        jPanel7.add(UserNameTF4);
        UserNameTF4.setBounds(30, 160, 260, 40);

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

        jTabbedPane3.addTab("Consultas Específicas", jPanel6);

        jPanel3.add(jTabbedPane3);
        jTabbedPane3.setBounds(0, 0, 960, 520);

        jTabbedPane1.addTab("Comercios", jPanel3);

        jPanel14.setBackground(new java.awt.Color(15, 71, 34));
        jPanel14.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel14.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel14.setLayout(null);

        jTabbedPane4.setBackground(new java.awt.Color(15, 71, 34));
        jTabbedPane4.setForeground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(15, 71, 34));
        jPanel15.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel15.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel15.setLayout(null);

        jPanel16.setBackground(new java.awt.Color(28, 107, 74));
        jPanel16.setLayout(null);
        jPanel16.add(jLabel7);
        jLabel7.setBounds(610, 70, 0, 0);

        ListBtn5.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn5.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn5.setText("CONSULTAR");
        ListBtn5.setBorder(null);
        ListBtn5.setIconTextGap(0);
        ListBtn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn5.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn5.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn5.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn5ActionPerformed(evt);
            }
        });
        jPanel16.add(ListBtn5);
        ListBtn5.setBounds(30, 320, 260, 30);

        Title31.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title31.setForeground(new java.awt.Color(255, 255, 255));
        Title31.setText("Usuarios");
        jPanel16.add(Title31);
        Title31.setBounds(30, 20, 210, 20);

        Title32.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title32.setForeground(new java.awt.Color(204, 153, 0));
        Title32.setText("Listado de Usuarios");
        jPanel16.add(Title32);
        Title32.setBounds(30, 40, 240, 20);

        UserNameTF5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF5.setText("Cédula");
        UserNameTF5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF5MouseClicked(evt);
            }
        });
        jPanel16.add(UserNameTF5);
        UserNameTF5.setBounds(30, 80, 260, 30);

        UserNameTF6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF6.setText("Nombre de Usuario");
        UserNameTF6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF6MouseClicked(evt);
            }
        });
        jPanel16.add(UserNameTF6);
        UserNameTF6.setBounds(30, 120, 260, 30);

        ComerciosCB2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComerciosCB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL DISTRITO>" }));
        jPanel16.add(ComerciosCB2);
        ComerciosCB2.setBounds(30, 270, 260, 30);

        ComerciosCB3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComerciosCB3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL PROVINCIA>" }));
        jPanel16.add(ComerciosCB3);
        ComerciosCB3.setBounds(30, 170, 260, 30);

        ComerciosCB4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ComerciosCB4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<INGRESE EL CANTÓN>" }));
        jPanel16.add(ComerciosCB4);
        ComerciosCB4.setBounds(30, 220, 260, 30);

        jPanel15.add(jPanel16);
        jPanel16.setBounds(640, 0, 320, 490);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable7);

        jPanel15.add(jScrollPane7);
        jScrollPane7.setBounds(0, 0, 640, 490);

        jTabbedPane4.addTab("Listar Usuarios", jPanel15);

        jPanel17.setBackground(new java.awt.Color(15, 71, 34));
        jPanel17.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel17.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel17.setLayout(null);

        jPanel18.setBackground(new java.awt.Color(28, 107, 74));
        jPanel18.setLayout(null);
        jPanel18.add(jLabel8);
        jLabel8.setBounds(610, 70, 0, 0);

        ListBtn6.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn6.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn6.setText("CONSULTAR");
        ListBtn6.setBorder(null);
        ListBtn6.setIconTextGap(0);
        ListBtn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn6.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn6.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn6.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn6ActionPerformed(evt);
            }
        });
        jPanel18.add(ListBtn6);
        ListBtn6.setBounds(30, 300, 260, 30);

        Title33.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title33.setForeground(new java.awt.Color(255, 255, 255));
        Title33.setText("Usuarios");
        jPanel18.add(Title33);
        Title33.setBounds(30, 40, 210, 30);

        Title34.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title34.setForeground(new java.awt.Color(255, 255, 255));
        Title34.setText("Rango de Fechas:");
        jPanel18.add(Title34);
        Title34.setBounds(30, 220, 260, 30);

        UserNameTF7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF7.setText("Cédula");
        UserNameTF7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF7MouseClicked(evt);
            }
        });
        jPanel18.add(UserNameTF7);
        UserNameTF7.setBounds(30, 100, 260, 30);

        UserNameTF8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF8.setText("2do Nombre");
        UserNameTF8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF8MouseClicked(evt);
            }
        });
        jPanel18.add(UserNameTF8);
        UserNameTF8.setBounds(170, 140, 120, 30);

        UserNameTF9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF9.setText("2do Apellido");
        UserNameTF9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF9MouseClicked(evt);
            }
        });
        UserNameTF9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTF9ActionPerformed(evt);
            }
        });
        jPanel18.add(UserNameTF9);
        UserNameTF9.setBounds(170, 180, 120, 30);

        UserNameTF10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF10.setText("1er Nombre");
        UserNameTF10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF10MouseClicked(evt);
            }
        });
        UserNameTF10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTF10ActionPerformed(evt);
            }
        });
        jPanel18.add(UserNameTF10);
        UserNameTF10.setBounds(30, 140, 120, 30);

        UserNameTF11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameTF11.setText("1er Apellido");
        UserNameTF11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserNameTF11MouseClicked(evt);
            }
        });
        UserNameTF11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTF11ActionPerformed(evt);
            }
        });
        jPanel18.add(UserNameTF11);
        UserNameTF11.setBounds(30, 180, 120, 30);
        jPanel18.add(jDateChooser1);
        jDateChooser1.setBounds(170, 250, 120, 30);
        jPanel18.add(jDateChooser2);
        jDateChooser2.setBounds(30, 250, 120, 30);

        Title35.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title35.setForeground(new java.awt.Color(204, 153, 0));
        Title35.setText("Usuarios con Claves No Modificadas");
        jPanel18.add(Title35);
        Title35.setBounds(30, 60, 260, 30);

        jPanel17.add(jPanel18);
        jPanel18.setBounds(640, 0, 320, 490);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(jTable8);

        jPanel17.add(jScrollPane8);
        jScrollPane8.setBounds(0, 0, 640, 490);

        jTabbedPane4.addTab("Usuarios con Claves No Modificadas", jPanel17);

        jPanel19.setBackground(new java.awt.Color(15, 71, 34));
        jPanel19.setMinimumSize(new java.awt.Dimension(960, 80));
        jPanel19.setPreferredSize(new java.awt.Dimension(960, 100));
        jPanel19.setLayout(null);

        jPanel20.setBackground(new java.awt.Color(28, 107, 74));
        jPanel20.setLayout(null);
        jPanel20.add(jLabel9);
        jLabel9.setBounds(610, 70, 0, 0);

        ListBtn7.setBackground(new java.awt.Color(15, 71, 34));
        ListBtn7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ListBtn7.setForeground(new java.awt.Color(255, 255, 255));
        ListBtn7.setText("CONSULTAR");
        ListBtn7.setBorder(null);
        ListBtn7.setIconTextGap(0);
        ListBtn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        ListBtn7.setMaximumSize(new java.awt.Dimension(40, 40));
        ListBtn7.setMinimumSize(new java.awt.Dimension(40, 40));
        ListBtn7.setPreferredSize(new java.awt.Dimension(40, 40));
        ListBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtn7ActionPerformed(evt);
            }
        });
        jPanel20.add(ListBtn7);
        ListBtn7.setBounds(30, 220, 260, 40);

        Title36.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Title36.setForeground(new java.awt.Color(255, 255, 255));
        Title36.setText("Usuarios");
        jPanel20.add(Title36);
        Title36.setBounds(30, 70, 210, 31);

        Title37.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title37.setForeground(new java.awt.Color(255, 255, 255));
        Title37.setText("Rango de Fechas:");
        jPanel20.add(Title37);
        Title37.setBounds(30, 130, 260, 31);
        jPanel20.add(jDateChooser3);
        jDateChooser3.setBounds(170, 160, 120, 40);
        jPanel20.add(jDateChooser4);
        jDateChooser4.setBounds(30, 160, 120, 40);

        Title38.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Title38.setForeground(new java.awt.Color(204, 153, 0));
        Title38.setText("Resumen de puntos por usuario");
        jPanel20.add(Title38);
        Title38.setBounds(30, 90, 260, 31);

        jPanel19.add(jPanel20);
        jPanel20.setBounds(640, 0, 320, 490);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTable9);

        jPanel19.add(jScrollPane9);
        jScrollPane9.setBounds(0, 0, 640, 490);

        jTabbedPane4.addTab("Resumen de puntos por usuario", jPanel19);

        jPanel14.add(jTabbedPane4);
        jTabbedPane4.setBounds(0, 0, 960, 520);

        jTabbedPane1.addTab("Usuarios", jPanel14);

        jPanel1.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 960, 520);

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

    private void ListBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn2ActionPerformed

    private void ListBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn3ActionPerformed

    private void ListBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn4ActionPerformed

    private void UserNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTFMouseClicked
        UserNameTF.setText("");
    }//GEN-LAST:event_UserNameTFMouseClicked

    private void UserNameTF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF1MouseClicked

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtnActionPerformed

    private void ListBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn1ActionPerformed

    private void UserNameTF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF2MouseClicked

    private void UserNameTF3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF3MouseClicked

    private void UserNameTF4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF4MouseClicked

    private void PreviousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousBtnActionPerformed
        SuperUserMainWindow superusermainW = new SuperUserMainWindow();
        superusermainW.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_PreviousBtnActionPerformed

    private void LogoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogoBtnActionPerformed

    private void ListBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn5ActionPerformed

    private void UserNameTF5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF5MouseClicked

    private void UserNameTF6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF6MouseClicked

    private void ListBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn6ActionPerformed

    private void UserNameTF7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF7MouseClicked

    private void UserNameTF8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF8MouseClicked

    private void UserNameTF9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF9MouseClicked

    private void UserNameTF9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTF9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF9ActionPerformed

    private void UserNameTF10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF10MouseClicked

    private void UserNameTF10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTF10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF10ActionPerformed

    private void UserNameTF11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserNameTF11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF11MouseClicked

    private void UserNameTF11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTF11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTF11ActionPerformed

    private void ListBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtn7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListBtn7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CollectionCenterPanel;
    private javax.swing.JComboBox<String> ComerciosCB1;
    private javax.swing.JComboBox<String> ComerciosCB2;
    private javax.swing.JComboBox<String> ComerciosCB3;
    private javax.swing.JComboBox<String> ComerciosCB4;
    private javax.swing.JButton ListBtn;
    private javax.swing.JButton ListBtn1;
    private javax.swing.JButton ListBtn2;
    private javax.swing.JButton ListBtn3;
    private javax.swing.JButton ListBtn4;
    private javax.swing.JButton ListBtn5;
    private javax.swing.JButton ListBtn6;
    private javax.swing.JButton ListBtn7;
    private javax.swing.JButton LogoBtn;
    private javax.swing.JButton PreviousBtn;
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
    private javax.swing.JLabel Title28;
    private javax.swing.JLabel Title29;
    private javax.swing.JLabel Title30;
    private javax.swing.JLabel Title31;
    private javax.swing.JLabel Title32;
    private javax.swing.JLabel Title33;
    private javax.swing.JLabel Title34;
    private javax.swing.JLabel Title35;
    private javax.swing.JLabel Title36;
    private javax.swing.JLabel Title37;
    private javax.swing.JLabel Title38;
    private javax.swing.JTextField UserNameTF;
    private javax.swing.JTextField UserNameTF1;
    private javax.swing.JTextField UserNameTF10;
    private javax.swing.JTextField UserNameTF11;
    private javax.swing.JTextField UserNameTF2;
    private javax.swing.JTextField UserNameTF3;
    private javax.swing.JTextField UserNameTF4;
    private javax.swing.JTextField UserNameTF5;
    private javax.swing.JTextField UserNameTF6;
    private javax.swing.JTextField UserNameTF7;
    private javax.swing.JTextField UserNameTF8;
    private javax.swing.JTextField UserNameTF9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
