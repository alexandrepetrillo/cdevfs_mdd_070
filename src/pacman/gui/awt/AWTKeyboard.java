/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui.awt;

import pacman.gui.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AWTKeyboard implements Keyboard, KeyListener {

    private boolean[] keys;

    private int lastPressedKey = -1;
    
    public AWTKeyboard() {
        keys = new boolean[0x10000];
    }
            
    public boolean isKeyPressed(int keyCode) {
        if (keyCode >= keys.length) {
            return false;
        }
        return keys[keyCode];
    }
    
    public int getLastPressedKey() {
        return lastPressedKey;
    }
    
    public int consumeLastPressedKey() {
        int tmp = lastPressedKey;
        lastPressedKey = -1;
        return tmp;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() < keys.length) {
            keys[e.getKeyCode()] = true;
        }
        lastPressedKey = e.getKeyCode();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() < keys.length) {
            keys[e.getKeyCode()] = false;
        }
    }

}
