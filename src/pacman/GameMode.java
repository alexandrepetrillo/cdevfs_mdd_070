/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman;

import pacman.gui.GUIFacade;

public interface GameMode {
    
    public abstract void setGUI(GUIFacade gui);

    public abstract void handleInputs();
    
    public abstract void update();
    
    public abstract void render();
    
    public abstract void init();


}
