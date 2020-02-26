package View;

import javax.swing.*;

public class WaitingRoomFrame extends JFrame {

    public WaitingRoomFrame() {
        setTitle("Waiting Room");
        setSize(400, 400);
        WaitingRoomPanel panel = new WaitingRoomPanel();
        add(panel);
    }
}
