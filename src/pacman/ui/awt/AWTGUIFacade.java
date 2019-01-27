package pacman.ui.awt;

/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidÃ©o"
 * Philippe-Henri Gosselin, Edition ENI
 */

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTGUIFacade implements GUIFacade {

    private static class Window extends Frame {

        public void init(String title) {
            setTitle(title);
            setSize(200,200);
            setResizable(false);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            });
        }
    }

    public void createWindow(String title) {
        Window window = new Window();
        window.init(title);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}