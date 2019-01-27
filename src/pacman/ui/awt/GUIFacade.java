/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

public interface GUIFacade {

    public void createWindow(String title);

    public boolean beginPaint();

    public void endPaint();

    public boolean isClosingRequested();

    public void dispose();

    public void clearBackground();
}
