package ui.utils;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.TileFactoryInfo;

import javax.swing.*;
import java.awt.*;

public class Map {

    private JXMapViewer mapViewer;

    public void drawMap(JPanel panel) {
        try {
            // TileFactoryInfo con HTTPS
            TileFactoryInfo info = new TileFactoryInfo(
                    0, 17, 18, 256, true, true,
                    "https://a.tile.openstreetmap.org", "x", "y", "z") {
                @Override
                public String getTileUrl(int x, int y, int zoom) {
                    int z = 17 - zoom;
                    return String.format("%s/%d/%d/%d.png", baseURL, z, x, y);
                }
            };

            DefaultTileFactory tileFactory = new DefaultTileFactory(info);
            tileFactory.setThreadPoolSize(8);

            // Crear visor de mapa
            mapViewer = new JXMapViewer();
            mapViewer.setTileFactory(tileFactory);

            // Centrar en Costa Rica
            GeoPosition costaRica = new GeoPosition(9.7489, -83.7534);
            mapViewer.setAddressLocation(costaRica);
            mapViewer.setZoom(5);

            // Usar BorderLayout para que el mapa llene el panel
            panel.setLayout(new BorderLayout());
            panel.add(mapViewer, BorderLayout.CENTER);

            // Refrescar
            panel.revalidate();
            panel.repaint();

            System.out.println("✅ Mapa centrado en Costa Rica y dibujado correctamente");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
