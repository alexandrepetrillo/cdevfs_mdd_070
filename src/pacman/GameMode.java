/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman;

import pacman.gui.GUIFacade;

public abstract class GameMode {

    protected GUIFacade gui;
    
    private Main parent;
    
    public void setParent(Main parent) {
        this.parent = parent;
    }    
    
    public void setGUI(GUIFacade gui) {
        this.gui = gui;
    }

    public void setGameMode(GameMode mode) {
        parent.setGameMode(mode);
    }
    
    public abstract void handleInputs();
    
    public abstract void update();
    
    public abstract void render();
    
    public abstract void init();


}
