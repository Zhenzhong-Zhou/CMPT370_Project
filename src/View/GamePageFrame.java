package View;

import javax.swing.*;

public class GamePageFrame extends JFrame {

    public GamePageFrame() {
        setTitle("Game Page");
        setSize(400, 400);
        GamePagePanel panel = new GamePagePanel();
        add(panel);
    }
}
