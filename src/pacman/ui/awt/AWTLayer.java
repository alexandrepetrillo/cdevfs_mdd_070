/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui.awt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AWTLayer implements Layer {

    private int tileWidth;

    private int tileHeight;

    private BufferedImage texture;

    private int textureWidth;

    private int textureHeight;

    private int[][] sprites;

    public int getTileWidth() {
        return tileWidth;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public int getTextureWidth() {
        return textureWidth;
    }

    public int getTextureHeight() {
        return textureHeight;
    }

    public void setTileSize(int width, int height) {
        this.tileWidth = width;
        this.tileHeight = height;
    }

    public void setTexture(String fileName) {
        if (tileWidth == 0 || tileHeight == 0) {
            throw new RuntimeException("Taille des tuiles non définie");
        }
        try {
            texture = ImageIO.read(this.getClass().getClassLoader().getResource(fileName));
        } catch (IOException ex) {
            Logger.getLogger(AWTLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        textureWidth = texture.getWidth() / tileWidth;
        textureHeight = texture.getHeight() / tileHeight;
    }

    public void setSpriteCount(int count) {
        sprites = new int[count][4];
    }

    public void setSpriteTexture(int index, int tileX, int tileY) {
        if (sprites == null) {
            throw new RuntimeException("Sprites non définis");
        }
        if (index < 0 || index >= sprites.length) {
            throw new IllegalArgumentException("Index sprite " + index + " invalide");
        }
        if (tileX < 0 || tileX >= textureWidth || tileY < 0 || tileY >= textureHeight) {
            throw new IllegalArgumentException("Coordonnées tuiles " + tileX + "," + tileY + " invalides");
        }
        sprites[index][0] = tileX;
        sprites[index][1] = tileY;
    }

    public void setSpriteLocation(int index, int screenX, int screenY) {
        if (sprites == null || index < 0 || index >= sprites.length)
            return;
        sprites[index][2] = screenX;
        sprites[index][3] = screenY;
    }

    public void draw(Graphics graphics) {
        if (texture == null) {
            throw new RuntimeException("Texture non chargée");
        }
        if (sprites == null) {
            throw new RuntimeException("Sprites non définis");
        }
        if (tileWidth == 0 || tileHeight == 0) {
            throw new RuntimeException("Taille des tuiles non définie");
        }
        for (int i = 0; i < sprites.length; i++) {
            int tileX = sprites[i][0];
            int tileY = sprites[i][1];
            int screenX = sprites[i][2];
            int screenY = sprites[i][3];
            graphics.drawImage(texture, screenX, screenY, screenX + tileWidth, screenY + tileHeight, tileX * tileWidth, tileY * tileHeight, tileX * tileWidth + tileWidth, tileY * tileHeight + tileHeight, null);
        }
    }
}
