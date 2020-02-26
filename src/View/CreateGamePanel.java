package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGamePanel extends JPanel {

    JLabel numOfPlayers;
    JComboBox playerOptionsComboBox;
    JLabel timerLabel;
    JComboBox timerOptionsComboBox;
    JButton createButton;

    Integer[] playerOptions = {2, 3, 4, 5};
    Integer[] timerOptions = {60, 120, 180};

    public CreateGamePanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        numOfPlayers = new JLabel("Choose the number of players for your game");
        numOfPlayers.setMaximumSize(numOfPlayers.getPreferredSize());
        add(numOfPlayers);
        numOfPlayers.setAlignmentX(numOfPlayers.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        playerOptionsComboBox = new JComboBox(playerOptions);
        playerOptionsComboBox.setMaximumSize(playerOptionsComboBox.getPreferredSize());
        add(playerOptionsComboBox);
        playerOptionsComboBox.setAlignmentX(playerOptionsComboBox.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        timerLabel = new JLabel("Choose the timer (in seconds)");
        timerLabel.setMaximumSize(timerLabel.getPreferredSize());
        add(timerLabel);
        timerLabel.setAlignmentX(timerLabel.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        timerOptionsComboBox = new JComboBox(timerOptions);
        timerOptionsComboBox.setMaximumSize(timerOptionsComboBox.getPreferredSize());
        add(timerOptionsComboBox);
        timerOptionsComboBox.setAlignmentX(timerOptionsComboBox.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        createButton = new JButton("Create Game");
        createButton.setMaximumSize(createButton.getPreferredSize());
        add(createButton);
        createButton.setAlignmentX(createButton.CENTER_ALIGNMENT);
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                WaitingRoomFrame frame = new WaitingRoomFrame();
                frame.setLocation(300, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        add(Box.createVerticalGlue());
    }
}
