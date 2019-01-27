/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

import java.awt.Color;
import java.awt.Graphics;

public class AWTGUIFacade implements GUIFacade {

    private AWTWindow window;

    private Graphics graphics;

    public void createWindow(int width, int height, String title) {
        window = new AWTWindow();
        window.init(title);
        window.createCanvas(width, height);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public boolean isClosingRequested() {
        return window.isClosingRequested();
    }

    public void dispose() {
        window.dispose();
    }

    public boolean beginPaint() {
        if (graphics != null) {
            graphics.dispose();
        }
        graphics = window.createGraphics();
        if (graphics == null) {
            return false;
        }
        return true;
    }

    public void endPaint() {
        if (graphics == null) {
            return;
        }
        graphics.dispose();
        graphics = null;
        window.switchBuffers();
    }

    public void clearBackground() {
        if (graphics == null) {
            return;
        }
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, window.getCanvasWidth(), window.getCanvasHeight());
    }

    @Override
    public Layer createLayer() {
        return new AWTLayer();
    }

    @Override
    public void drawLayer(Layer layer) {
        if (graphics == null) {
            return;
        }
        if (layer == null)
            throw new IllegalArgumentException("Pas de layer");
        if (!(layer instanceof AWTLayer))
            throw new IllegalArgumentException("Type de layer invalide");
        AWTLayer awtLayer = (AWTLayer) layer;
        awtLayer.draw(graphics);
    }
}
