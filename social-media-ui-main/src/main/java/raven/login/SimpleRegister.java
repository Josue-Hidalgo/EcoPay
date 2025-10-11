package raven.login;

import raven.manager.SimpleFormsManager;
import raven.toast.SimpleNotifications;

import javax.swing.*;
import java.awt.*;

public class SimpleRegister extends JPanel {

    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;
    private JRadioButton jrMale;
    private JRadioButton jrFemale;
    private ButtonGroup groupGender;
    private JButton cmdRegister;

    public SimpleRegister() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        setBackground(new Color(240, 240, 240));
        
        // Main panel with padding
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        
        // Title
        JLabel lbTitle = new JLabel("Welcome to our Chat Application");
        lbTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(lbTitle, gbc);
        
        // Description
        JLabel description = new JLabel("Join us to chat, connect, and make new friends. Sign up now and start chatting!");
        description.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        description.setHorizontalAlignment(SwingConstants.CENTER);
        description.setForeground(new Color(100, 100, 100));
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        mainPanel.add(description, gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        
        // Full Name
        JLabel lblFullName = new JLabel("Full Name:");
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 1;
        mainPanel.add(lblFullName, gbc);
        
        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        namePanel.setBackground(new Color(240, 240, 240));
        txtFirstName = new JTextField(12);
        txtFirstName.setPreferredSize(new Dimension(120, 30));
        txtLastName = new JTextField(12);
        txtLastName.setPreferredSize(new Dimension(120, 30));
        namePanel.add(txtFirstName);
        namePanel.add(txtLastName);
        gbc.gridx = 1; gbc.gridy = 2;
        mainPanel.add(namePanel, gbc);
        
        // Gender
        JLabel lblGender = new JLabel("Gender:");
        gbc.gridx = 0; gbc.gridy = 3;
        mainPanel.add(lblGender, gbc);
        
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        genderPanel.setBackground(new Color(240, 240, 240));
        jrMale = new JRadioButton("Male");
        jrFemale = new JRadioButton("Female");
        groupGender = new ButtonGroup();
        groupGender.add(jrMale);
        groupGender.add(jrFemale);
        jrMale.setSelected(true);
        genderPanel.add(jrMale);
        genderPanel.add(jrFemale);
        gbc.gridx = 1; gbc.gridy = 3;
        mainPanel.add(genderPanel, gbc);
        
        // Separator
        JSeparator separator = new JSeparator();
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; gbc.fill = GridBagConstraints.HORIZONTAL;
        mainPanel.add(separator, gbc);
        gbc.fill = GridBagConstraints.NONE;
        
        // Username
        JLabel lblUsername = new JLabel("Username or Email:");
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 1; gbc.fill = GridBagConstraints.NONE;
        mainPanel.add(lblUsername, gbc);
        
        txtUsername = new JTextField(20);
        txtUsername.setPreferredSize(new Dimension(250, 30));
        gbc.gridx = 1; gbc.gridy = 5;
        mainPanel.add(txtUsername, gbc);
        
        // Password
        JLabel lblPassword = new JLabel("Password:");
        gbc.gridx = 0; gbc.gridy = 6;
        mainPanel.add(lblPassword, gbc);
        
        txtPassword = new JPasswordField(20);
        txtPassword.setPreferredSize(new Dimension(250, 30));
        gbc.gridx = 1; gbc.gridy = 6;
        mainPanel.add(txtPassword, gbc);
        
        // Confirm Password
        JLabel lblConfirmPassword = new JLabel("Confirm Password:");
        gbc.gridx = 0; gbc.gridy = 7;
        mainPanel.add(lblConfirmPassword, gbc);
        
        txtConfirmPassword = new JPasswordField(20);
        txtConfirmPassword.setPreferredSize(new Dimension(250, 30));
        gbc.gridx = 1; gbc.gridy = 7;
        mainPanel.add(txtConfirmPassword, gbc);
        
        // Register button
        cmdRegister = new JButton("Sign Up");
        cmdRegister.setPreferredSize(new Dimension(250, 35));
        cmdRegister.setBackground(new Color(76, 175, 80));
        cmdRegister.setForeground(Color.WHITE);
        cmdRegister.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        cmdRegister.setBorderPainted(false);
        cmdRegister.setFocusPainted(false);
        cmdRegister.addActionListener(e -> {
            if (isMatchPassword()) {
                SimpleNotifications.getInstance().show("Success", "Registration successful!");
            } else {
                SimpleNotifications.getInstance().show("Error", "Passwords don't match. Try again!");
            }
        });
        gbc.gridx = 0; gbc.gridy = 8; gbc.gridwidth = 2; gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(cmdRegister, gbc);
        
        // Login link
        JPanel loginPanel = new JPanel(new FlowLayout());
        loginPanel.setBackground(new Color(240, 240, 240));
        JLabel loginLabel = new JLabel("Already have an account?");
        loginLabel.setForeground(new Color(100, 100, 100));
        
        JButton cmdLogin = new JButton("Sign in here");
        cmdLogin.setBorderPainted(false);
        cmdLogin.setContentAreaFilled(false);
        cmdLogin.setForeground(new Color(33, 150, 243));
        cmdLogin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        cmdLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdLogin.addActionListener(e -> {
            SimpleFormsManager.getInstance().showForm(new SimpleLogin());
        });
        
        loginPanel.add(loginLabel);
        loginPanel.add(cmdLogin);
        
        gbc.gridx = 0; gbc.gridy = 9; gbc.gridwidth = 2;
        mainPanel.add(loginPanel, gbc);
        
        add(mainPanel, BorderLayout.CENTER);
    }

    public boolean isMatchPassword() {
        String password = String.valueOf(txtPassword.getPassword());
        String confirmPassword = String.valueOf(txtConfirmPassword.getPassword());
        return password.equals(confirmPassword);
    }
}
