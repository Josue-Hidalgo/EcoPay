package ui.utils;

import java.awt.Component;
import java.awt.Container;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Utils {
    
    // Método para deshabilitar/habilitar un JPanel y todos sus componentes hijos
    public static void setPanelEnabled(JPanel panel, boolean enabled) {
        panel.setEnabled(enabled);
        setContainerEnabled(panel, enabled);
    }
    
    // Método recursivo para deshabilitar/habilitar todos los componentes de un contenedor
    public static void setContainerEnabled(Container container, boolean enabled) {
        for (Component component : container.getComponents()) {
            component.setEnabled(enabled);
            if (component instanceof Container) {
                setContainerEnabled((Container) component, enabled);
            }
        }
    }
    
    // Método para deshabilitar completamente un panel (con cambio visual opcional)
    public static void setPanelFullyDisabled(JPanel panel, boolean enabled) {
        panel.setEnabled(enabled);
        setContainerEnabled(panel, enabled);
        
        // Cambiar apariencia visual para indicar estado deshabilitado
        if (!enabled) {
            // Opcional: cambiar color de fondo para indicar deshabilitado
            // panel.setBackground(panel.getBackground().darker());
        }
    }
    
    // Método específico para deshabilitar múltiples paneles a la vez
    public static void setMultiplePanelsEnabled(JPanel[] panels, boolean enabled) {
        for (JPanel panel : panels) {
            setPanelEnabled(panel, enabled);
        }
    }
    
    // Método para toggle (alternar) el estado de un panel
    public static void togglePanelEnabled(JPanel panel) {
        boolean newState = !panel.isEnabled();
        setPanelEnabled(panel, newState);
    }
    
    // Método para verificar si un panel y todos sus hijos están habilitados
    public static boolean isPanelFullyEnabled(JPanel panel) {
        if (!panel.isEnabled()) {
            return false;
        }
        return areAllComponentsEnabled(panel);
    }
    
    // Método auxiliar recursivo para verificar estado de componentes
    private static boolean areAllComponentsEnabled(Container container) {
        for (Component component : container.getComponents()) {
            if (!component.isEnabled()) {
                return false;
            }
            if (component instanceof Container) {
                if (!areAllComponentsEnabled((Container) component)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Tus métodos existentes (sin cambios)
    public static void setLongText(JLabel LongText) {
        String textLong = """
                <html>
                <div style='text-align: justify; padding: 10px; font-size: 8px;'>
                <p><b>¡Bienvenido a Bandera Azul! Transforma tu Reciclaje en Recompensas</b></p>

                <p>¿Te preocupa el medio ambiente pero no sabes cómo ayudar de forma práctica? <b>Bandera Azul</b> es la aplicación que te permite marcar la diferencia de manera fácil y gratificante.</p>

                <p><b>Así es como funciona:</b></p>
                <ol>
                    <li><b>Recicla:</b> Clasifica tus materiales reciclables (plástico, vidrio, cartón, aluminio, etc.) y llévalos a un <b>Centro de Acopio</b> afiliado.</li>
                    <li><b>Registra:</b> En la app, registra la cantidad de material que entregaste.</li>
                    <li><b>Acumula Puntos:</b> ¡Gana puntos por tu reciclaje! Cada kilo de material tiene un valor en puntos.</li>
                    <li><b>Canjea y Disfruta:</b> Usa tus puntos para canjear productos y beneficios en comercios afiliados.</li>
                </ol>

                <p><b>En Bandera Azul tú puedes:</b></p>
                <ul>
                    <li>Rastrear tu Impacto y consultar tu historial</li>
                    <li>Encontrar Centros de Acopio cercanos</li>
                    <li>Explorar Premios disponibles</li>
                    <li>Ser parte de una comunidad que cuida el planeta</li>
                </ul>

                <p><i>¡Únete y convierte cada material reciclable en un paso hacia un futuro más sostenible!</i></p>
                </div>
                </html>
                """;
        LongText.setText(textLong);
    }
    
    public static void adjustImageToButton(JButton button, String imagePath) {
        try {
            ImageIcon originalIcon = null;
            java.net.URL location = Utils.class.getResource(imagePath);

            if (location != null) {
                originalIcon = new ImageIcon(location);
                System.out.println("✅ Loaded from classpath: " + location);
            } else {
                File file = new File(imagePath);
                if (file.exists()) {
                    originalIcon = new ImageIcon(file.getAbsolutePath());
                    System.out.println("✅ Loaded from file system: " + file.getAbsolutePath());
                } else {
                    throw new RuntimeException("Image not found at: " + imagePath);
                }
            }

            Image scaledImage = originalIcon.getImage().getScaledInstance(
                    button.getWidth(),
                    button.getHeight(),
                    Image.SCALE_SMOOTH
            );

            button.setIcon(new ImageIcon(scaledImage));
            button.setBorderPainted(false);
            button.setContentAreaFilled(false);
            button.setFocusPainted(false);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null,
                    "Error loading image:\n" + e.getMessage(),
                    "Image Load Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static String selectImage(JFrame parent) {
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select an image");
            fileChooser.setFileFilter(new FileNameExtensionFilter(
                    "Image files", "jpg", "jpeg", "png", "gif"));

            int result = fileChooser.showOpenDialog(parent);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                return selectedFile.getAbsolutePath();
            } else {
                return null; // User cancelled
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(parent,
                    "Error selecting image:\n" + e.getMessage(),
                    "Image Selector Error",
                    JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}