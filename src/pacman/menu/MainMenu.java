/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.menu;

import pacman.gui.Keyboard;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class MainMenu extends MenuGameMode {

    public MainMenu() {
        items.add("Jouer Pacman");
        items.add("Jouer un fantôme");
        items.add("Quitter");
    }
    
    public void handleInputs() {
        Keyboard keyboard = gui.getKeyboard();
        switch(keyboard.getLastPressedKey()) {
            case KeyEvent.VK_SPACE:
            case KeyEvent.VK_ENTER:
                keyboard.consumeLastPressedKey();
                switch(selectedItem) {
                    case 0: 
                        setGameMode(new PlayPacmanMenu());
                        break;
                    case 1:
                        setGameMode(new SelectGhostMenu());
                        break;
                    case 2:
                        gui.setClosingRequested(true);
                        break;
                }
                return;
        }
        super.handleInputs();
    }
}
