package raven.manager;

import raven.main.SimpleApplication;

import javax.swing.*;
import java.awt.*;

public class SimpleFormsManager {
    private SimpleApplication application;
    private static SimpleFormsManager instance;

    public static SimpleFormsManager getInstance() {
        if (instance == null) {
            instance = new SimpleFormsManager();
        }
        return instance;
    }

    private SimpleFormsManager() {

    }

    public void initApplication(SimpleApplication application) {
        this.application = application;
    }

    public void showForm(JComponent form) {
        EventQueue.invokeLater(() -> {
            application.setContentPane(form);
            application.revalidate();
            application.repaint();
        });
    }
}
