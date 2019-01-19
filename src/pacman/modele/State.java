/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.modele;

public class State {

    private Characters chars;

    private World world;

    public State() {
    }

    public Characters getChars() {
        return chars;
    }

    public World getWorld() {
        return world;
    }

    public void setChars(Characters chars) {
        this.chars = chars;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}
