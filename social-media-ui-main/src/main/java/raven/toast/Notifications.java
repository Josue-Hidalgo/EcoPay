package raven.toast;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Notifications {
    
    public enum Type {
        SUCCESS, ERROR, WARNING, INFO
    }
    
    private static Notifications instance;
    private JFrame jFrame;
    
    public static Notifications getInstance() {
        if (instance == null) {
            instance = new Notifications();
        }
        return instance;
    }
    
    private Notifications() {
    }
    
    public void setJFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }
    
    public void show(Type type, String message) {
        if (jFrame == null) {
            System.err.println("Notifications: JFrame not set");
            return;
        }
        
        SwingUtilities.invokeLater(() -> {
            JDialog dialog = createNotificationDialog(type, message);
            dialog.setVisible(true);
            
            // Auto-close after 3 seconds
            Timer timer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            timer.setRepeats(false);
            timer.start();
        });
    }
    
    private JDialog createNotificationDialog(Type type, String message) {
        JDialog dialog = new JDialog(jFrame, "", true);
        dialog.setUndecorated(true);
        dialog.setSize(300, 80);
        dialog.setLocationRelativeTo(jFrame);
        
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));
        
        // Set background color based on type
        Color bgColor;
        Color textColor = Color.WHITE;
        String icon = "";
        
        switch (type) {
            case SUCCESS:
                bgColor = new Color(76, 175, 80); // Green
                icon = "✓";
                break;
            case ERROR:
                bgColor = new Color(244, 67, 54); // Red
                icon = "✗";
                break;
            case WARNING:
                bgColor = new Color(255, 152, 0); // Orange
                icon = "⚠";
                break;
            case INFO:
            default:
                bgColor = new Color(33, 150, 243); // Blue
                icon = "ℹ";
                break;
        }
        
        panel.setBackground(bgColor);
        
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 16));
        iconLabel.setForeground(textColor);
        iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        JLabel messageLabel = new JLabel("<html><div style='text-align: center;'>" + message + "</div></html>");
        messageLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 12));
        messageLabel.setForeground(textColor);
        messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        panel.add(iconLabel, BorderLayout.WEST);
        panel.add(messageLabel, BorderLayout.CENTER);
        
        dialog.add(panel);
        
        return dialog;
    }
}
