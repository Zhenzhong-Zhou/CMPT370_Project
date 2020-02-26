package View;

import javax.swing.JFrame;

public class CreateGameFrame extends  JFrame {

    public CreateGameFrame() {
        setTitle("Create Game");
        setSize(400, 400);
        CreateGamePanel panel = new CreateGamePanel();
        add(panel);
    }
}
