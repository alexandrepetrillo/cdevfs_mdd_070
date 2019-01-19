/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Une simple fenêtre avec AWT
 * 
 * @author Philippe-Henri Gosselin
 */
public class Window extends Frame {
    
    public void init() {
        setTitle("Affichage et contrôles avec AWT");
        setSize(200,200);
        setResizable(false);        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });        
    }
    
    public static void main(String args[]) {
        Window window = new Window();
        window.init();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }    
}
