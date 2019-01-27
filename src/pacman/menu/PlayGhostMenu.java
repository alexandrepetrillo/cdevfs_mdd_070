/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.menu;

import pacman.PlayGameMode;
import pacman.gui.Keyboard;
import java.awt.event.KeyEvent;

public class PlayGhostMenu extends MenuGameMode {

    public PlayGhostMenu() {
        items.add("Facile");
        items.add("Moyen");
        items.add("Difficile");
    }
        
    public void handleInputs() {
        Keyboard keyboard = gui.getKeyboard();
        switch(keyboard.getLastPressedKey()) {
            case KeyEvent.VK_SPACE:
            case KeyEvent.VK_ENTER:
                keyboard.consumeLastPressedKey();
                setGameMode(new PlayGameMode());
                return;
        }
        super.handleInputs();
    }
    
}
