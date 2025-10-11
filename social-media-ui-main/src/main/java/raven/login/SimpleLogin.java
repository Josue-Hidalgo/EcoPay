package raven.login;

import raven.manager.SimpleFormsManager;
import raven.toast.SimpleNotifications;

import javax.swing.*;
import java.awt.*;

public class SimpleLogin extends JPanel {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberMe;
    private JButton cmdLogin;

    public SimpleLogin() {
        init();
    }

    private void init() {
        setLayout(new BorderLayout());
        setBackground(new Color(240, 240, 240));
        
        // Main panel with padding
        JPanel mainPanel = new JPanel(new GridBagLayout());
        mainPanel.setBackground(new Color(240, 240, 240));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        
        // Title
        JLabel lbTitle = new JLabel("Welcome back!");
        lbTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        mainPanel.add(lbTitle, gbc);
        
        // Description
        JLabel description = new JLabel("Please sign in to access your account");
        description.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 14));
        description.setHorizontalAlignment(SwingConstants.CENTER);
        description.setForeground(new Color(100, 100, 100));
        gbc.gridx = 0; gbc.gridy = 1; gbc.gridwidth = 2;
        mainPanel.add(description, gbc);
        
        // Username
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblUsername = new JLabel("Username:");
        gbc.gridx = 0; gbc.gridy = 2;
        mainPanel.add(lblUsername, gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        txtUsername = new JTextField(20);
        txtUsername.setPreferredSize(new Dimension(250, 30));
        gbc.gridx = 1; gbc.gridy = 2;
        mainPanel.add(txtUsername, gbc);
        
        // Password
        gbc.anchor = GridBagConstraints.EAST;
        JLabel lblPassword = new JLabel("Password:");
        gbc.gridx = 0; gbc.gridy = 3;
        mainPanel.add(lblPassword, gbc);
        
        gbc.anchor = GridBagConstraints.WEST;
        txtPassword = new JPasswordField(20);
        txtPassword.setPreferredSize(new Dimension(250, 30));
        gbc.gridx = 1; gbc.gridy = 3;
        mainPanel.add(txtPassword, gbc);
        
        // Remember me checkbox
        chRememberMe = new JCheckBox("Remember me");
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        mainPanel.add(chRememberMe, gbc);
        
        // Login button
        cmdLogin = new JButton("Login");
        cmdLogin.setPreferredSize(new Dimension(250, 35));
        cmdLogin.setBackground(new Color(33, 150, 243));
        cmdLogin.setForeground(Color.WHITE);
        cmdLogin.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        cmdLogin.setBorderPainted(false);
        cmdLogin.setFocusPainted(false);
        cmdLogin.addActionListener(e -> {
            // Simple login logic
            String username = txtUsername.getText();
            String password = String.valueOf(txtPassword.getPassword());
            
            if (username.isEmpty() || password.isEmpty()) {
                SimpleNotifications.getInstance().show("Error", "Please enter username and password");
            } else {
                SimpleNotifications.getInstance().show("Success", "Login successful!");
            }
        });
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2;
        mainPanel.add(cmdLogin, gbc);
        
        // Register link
        JPanel registerPanel = new JPanel(new FlowLayout());
        registerPanel.setBackground(new Color(240, 240, 240));
        JLabel registerLabel = new JLabel("Don't have an account?");
        registerLabel.setForeground(new Color(100, 100, 100));
        
        JButton cmdRegister = new JButton("Sign up");
        cmdRegister.setBorderPainted(false);
        cmdRegister.setContentAreaFilled(false);
        cmdRegister.setForeground(new Color(33, 150, 243));
        cmdRegister.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 12));
        cmdRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cmdRegister.addActionListener(e -> {
            SimpleFormsManager.getInstance().showForm(new SimpleRegister());
        });
        
        registerPanel.add(registerLabel);
        registerPanel.add(cmdRegister);
        
        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 2;
        mainPanel.add(registerPanel, gbc);
        
        add(mainPanel, BorderLayout.CENTER);
    }
}
