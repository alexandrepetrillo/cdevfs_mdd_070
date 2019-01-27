/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui.awt;

import pacman.gui.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
 
public class AWTGUIFacade implements GUIFacade {

    private AWTWindow window;

    private Graphics graphics;

    public void createWindow(int width, int height, String title) {
        if (window == null) {
            window = new AWTWindow();
        }
        window.init(title);
        window.createCanvas(width, height);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    public boolean isClosingRequested() {
        return window.isClosingRequested();
    }
    
    
    public void setClosingRequested(boolean closingRequested) {
        window.setClosingRequested(closingRequested);
    }    

    public void dispose() {
        window.dispose();
    }

    public boolean beginPaint() {
        if (graphics != null) {
            graphics.dispose();
        }
        graphics = window.createGraphics();
        if (graphics == null) {
            return false;
        }
        return true;
    }

    public void endPaint() {
        if (graphics == null) {
            return;
        }
        graphics.dispose();
        graphics = null;
        window.switchBuffers();
    }

    public void clearBackground() {
        if (graphics == null) {
            return;
        }
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, window.getCanvasWidth(), window.getCanvasHeight());
    }

    @Override
    public Layer createLayer() {
        return new AWTLayer();
    }

    @Override
    public void drawLayer(Layer layer) {
        if (graphics == null) {
            return;
        }
        if (layer == null)
            throw new IllegalArgumentException("Pas de layer");
        if (!(layer instanceof AWTLayer))
            throw new IllegalArgumentException("Type de layer invalide");
        AWTLayer awtLayer = (AWTLayer) layer;
        awtLayer.draw(graphics);
        //saveLayer(awtLayer);
    }
    
    public void saveLayer(AWTLayer layer) {
        BufferedImage image = new BufferedImage(window.getCanvasWidth(),window.getCanvasHeight(),BufferedImage.TYPE_4BYTE_ABGR);
        Graphics g = image.getGraphics();
        layer.draw(g);
        g.dispose();
        try {
            ImageIO.write(image, "png", new File(layer.toString()+".png"));
        } catch (IOException ex) {
            Logger.getLogger(AWTGUIFacade.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Keyboard getKeyboard() {
        if (window == null)
            throw new RuntimeException("Il faut d'abord créer une fenêtre");
        return window.getKeyboard();
    }

    public Mouse getMouse() {
        if (window == null)
            throw new RuntimeException("Il faut d'abord créer une fenêtre");
        return window.getMouse();
    }

    public Image createImage(String fileName) {
        AWTImage image = new AWTImage();
        image.loadImage(fileName);
        return image;
    }

    public void drawImage(Image image,int x,int y) {
        if (graphics == null) {
            return;
        }
        if (image == null)
            throw new IllegalArgumentException("Pas de image");
        if (!(image instanceof AWTImage))
            throw new IllegalArgumentException("Type de image invalide");
        AWTImage awtImage = (AWTImage) image;
        awtImage.draw(graphics,x,y);
    }

}
