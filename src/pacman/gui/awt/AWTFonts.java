/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.gui.awt;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.util.Map;
import java.util.TreeMap;

public class AWTFonts {

    private Map<Integer, Font> fonts = new TreeMap();

    public Font getFont(Graphics graphics,int size) {
        Font font = fonts.get(size);
        if (font == null) {
            Font oldFont = graphics.getFont();
            for (int i=2*size;i>=4;i--) {
                font = new Font("Arial",Font.PLAIN,i);
                graphics.setFont(font);
                FontMetrics fm = graphics.getFontMetrics();
                if (fm.getHeight() < size) {
                    break;
                }
            }
            fonts.put(size,font);
            graphics.setFont(oldFont);
        }
        return font;
    }
}
