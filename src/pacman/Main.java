/*
 * Ce fichier illustre l'ouvrage "Apprendre les Design Patterns en programmant un jeu vidéo"
 * Philippe-Henri Gosselin, Edition ENI
 */

package pacman;

import pacman.gui.GUIFacade;
import pacman.gui.awt.AWTGUIFacade;
import javax.swing.JOptionPane;

public class Main {

    private GUIFacade gui;
    
    private GameMode currentMode;

    
    public void setGUI(GUIFacade gui) {
        this.gui = gui;
    }
    
    public synchronized void setGameMode(GameMode mode) {
        try {
            mode.setParent(this);
            mode.setGUI(gui);
            mode.init();
            this.currentMode = mode;
        }
        catch(Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }    
    
    public void run() {
        int fps = 60;
        long nanoPerFrame = (long) (1000000000.0 / fps);
        long lastTime = 0;
        while (!gui.isClosingRequested()) {
            long nowTime = System.nanoTime();
            if ((nowTime - lastTime) < nanoPerFrame) {
                continue;
            }
            lastTime = nowTime;

            synchronized(this) {
                currentMode.handleInputs();
                currentMode.update();
                currentMode.render();            
            }

            long elapsed = System.nanoTime() - lastTime;
            long milliSleep = (nanoPerFrame - elapsed) / 1000000;
            if (milliSleep > 0) {
                try {
                    Thread.sleep(milliSleep);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        gui.dispose();
    }
    
    public static void main(String args[]) {
        Main pacman = new Main();
        pacman.setGUI(new AWTGUIFacade());
        pacman.setGameMode(new WelcomeGameMode());
        pacman.run();
    }



}
