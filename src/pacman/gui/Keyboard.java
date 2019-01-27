/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui;

public interface Keyboard {

    public boolean isKeyPressed(int keyCode);
    
    public int getLastPressedKey();
    
    public int consumeLastPressedKey();
}
