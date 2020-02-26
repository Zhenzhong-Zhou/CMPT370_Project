package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JoinGamePanel extends JPanel {

    JLabel gameId;
    JTextField gameIdText;
    JLabel secretToken;
    JTextField secretTokenText;
    JButton joinButton;

    public JoinGamePanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        gameId = new JLabel("Enter the game ID");
        gameId.setMaximumSize(gameId.getPreferredSize());
        add(gameId);
        gameId.setAlignmentX(gameId.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        gameIdText = new JTextField();
        gameIdText.setBounds(50, 100, 200, 30);
        gameIdText.setPreferredSize(new Dimension(200, 24));
        gameIdText.setMaximumSize(gameIdText.getPreferredSize());
        add(gameIdText);
        gameIdText.setAlignmentX(gameIdText.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        secretToken = new JLabel("Enter the game's secret token");
        secretToken.setMaximumSize(secretToken.getPreferredSize());
        add(secretToken);
        secretToken.setAlignmentX(secretToken.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        secretTokenText = new JTextField();
        secretTokenText.setPreferredSize(new Dimension(200, 24));
        secretTokenText.setMaximumSize(secretTokenText.getPreferredSize());
        add(secretTokenText);
        secretTokenText.setAlignmentX(secretTokenText.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());


        joinButton = new JButton("Join Game");
        joinButton.setMaximumSize(joinButton.getPreferredSize());
        add(joinButton);
        joinButton.setAlignmentX(joinButton.CENTER_ALIGNMENT);
        joinButton.addActionListener(new ActionListener() {
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
