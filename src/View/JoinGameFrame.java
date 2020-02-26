package View;

import javax.swing.JFrame;

public class JoinGameFrame extends JFrame {

    public JoinGameFrame() {
        setTitle("Join Game");
        setSize(400, 400);
        JoinGamePanel panel = new JoinGamePanel();
        add(panel);
    }
}
