/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

public interface Layer {

    public int getTileWidth();

    public int getTileHeight();

    public int getTextureWidth();

    public int getTextureHeight();

    public void setTileSize(int width, int height);

    public void setTexture(String fileName);

    public void setSpriteCount(int count);

    public void setSpriteTexture(int index, int tileX, int tileY);

    public void setSpriteLocation(int index, int screenX, int screenY);
}
