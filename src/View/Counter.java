package View;

import javax.swing.*;

public class Counter extends JLabel {

    public Counter() {
        this.setIcon(new ImageIcon("./res/ProcessTile.png"));
    }

    public void setSizeOnRemainingSeconds(int remainingSeconds) {
        this.setSize(3 * remainingSeconds , 12);
    }
}
