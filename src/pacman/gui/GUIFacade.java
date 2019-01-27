/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui;

import java.awt.Color;
import java.awt.Dimension;

public interface GUIFacade {

    public void createWindow(int width, int height, String title);

    public boolean isClosingRequested();

    public void dispose();

    public boolean beginPaint();

    public void endPaint();

    public void clearBackground();

    public Layer createLayer();

    public void drawLayer(Layer layer);
    
    public Keyboard getKeyboard();
    
    public Mouse getMouse();
    
    public Image createImage(String fileName);

    public void drawImage(Image image, int x, int y);
    
    public void setClosingRequested(boolean closingRequested);
    
    public void setColor(Color color);
    
    public void setTextSize(int size);
    
    public Dimension getTextMetrics(String text);
    
    public void drawText(String text, int x, int y, int width, int height);

}
