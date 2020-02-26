package View;

import javax.swing.JFrame;

public class MenuFrame extends JFrame {

    public MenuFrame() {
        setTitle("Main Menu");
        setSize(400, 400);
        MenuPanel panel = new MenuPanel();
        add(panel);
    }
}
