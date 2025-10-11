package raven.main;

import raven.login.SimpleLogin;
import raven.manager.SimpleFormsManager;

import javax.swing.*;
import java.awt.*;

public class SimpleApplication extends JFrame {

    public SimpleApplication() {
        init();
    }

    private void init() {
        setTitle("Social Media UI - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(1200, 700));
        setLocationRelativeTo(null);
        
        // Set system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        setContentPane(new SimpleLogin());
        SimpleFormsManager.getInstance().initApplication(this);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new SimpleApplication().setVisible(true));
    }
}
