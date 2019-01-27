/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

public interface GUIFacade {

    public void createWindow(int width, int height, String title);

    public boolean isClosingRequested();

    public void dispose();

    public boolean beginPaint();

    public void endPaint();

    public void clearBackground();

    public Layer createLayer();

    public void drawLayer(Layer layer);
}
