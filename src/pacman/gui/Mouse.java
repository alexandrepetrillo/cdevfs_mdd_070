/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui;

public interface Mouse {

    public boolean isButtonPressed(int button);

    public int getX();

    public int getY();
}
