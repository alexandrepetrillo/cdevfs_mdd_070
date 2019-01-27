/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

/**
 * Point d'entrée du programme
 * @author Philippe-Henri Gosselin
 */
public class Main {
    public static void main(String args[]) {
        GUIFacade gui = new AWTGUIFacade();
        gui.createWindow("Facade Interface Graphique Utilisateur");
    }       
}
