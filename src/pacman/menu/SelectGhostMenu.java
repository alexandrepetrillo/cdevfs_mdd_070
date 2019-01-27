/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.menu;

import pacman.gui.Keyboard;
import java.awt.event.KeyEvent;

public class SelectGhostMenu extends MenuGameMode {

    public SelectGhostMenu() {
        items.add("Jouer Blinky");
        items.add("Jouer Pinky");
        items.add("Jouer Inky");
        items.add("Jouer Clyde");
    }
    
    public void handleInputs() {
        Keyboard keyboard = gui.getKeyboard();
        switch(keyboard.getLastPressedKey()) {
            case KeyEvent.VK_SPACE:
            case KeyEvent.VK_ENTER:
                keyboard.consumeLastPressedKey();
                setGameMode(new PlayGhostMenu());
                return;
        }
        super.handleInputs();

    }
}
