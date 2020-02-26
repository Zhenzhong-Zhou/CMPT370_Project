package Startup;

import View.MenuFrame;
import javax.swing.JFrame;

/**
 * A class that starts up the Hanabi System GUI
 */
public class GUIHanabiSystem {

    /**
     * Start up the Hanabi client application.
     */
    public static void main(String[] args) {
        MenuFrame frame = new MenuFrame();
        frame.setLocation(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
