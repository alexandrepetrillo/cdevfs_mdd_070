/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman.ui;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Création d'un canvas avec AWT
 *
 * @author Philippe-Henri Gosselin
 */
public class Window extends Frame {

    private int canvasWidth = 800;
    private int canvasHeight = 600;
    private Canvas canvas;

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

    public void createCanvas() {
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
        canvas.setMinimumSize(new Dimension(canvasWidth,canvasHeight));
        canvas.setMaximumSize(new Dimension(canvasWidth,canvasHeight));
        add(canvas);
        pack();
    }

    public static void main(String args[]) {
        Window window = new Window();
        window.init();
        window.createCanvas();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
