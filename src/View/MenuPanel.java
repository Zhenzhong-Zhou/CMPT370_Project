package View;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuPanel extends JPanel {

    JLabel labelMenu;
    JButton createButton;
    JButton joinButton;
    JButton quitButton;

    public MenuPanel() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        labelMenu = new JLabel("Main Menu");
        labelMenu.setMaximumSize(labelMenu.getPreferredSize());
        add(labelMenu);
        labelMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        createButton = new JButton("Create a New Game");
        createButton.setMaximumSize(createButton.getPreferredSize());
        add(createButton);
        createButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CreateGameFrame frame = new CreateGameFrame();
                frame.setLocation(300, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        add(Box.createVerticalGlue());

        joinButton = new JButton("Join a New Game");
        joinButton.setMaximumSize(joinButton.getPreferredSize());
        add(joinButton);
        joinButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        joinButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JoinGameFrame frame = new JoinGameFrame();
                frame.setLocation(300, 300);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
        add(Box.createVerticalGlue());

        quitButton = new JButton("Quit");
        quitButton.setMaximumSize(quitButton.getPreferredSize());
        add(quitButton);
        quitButton.setAlignmentX(Component.CENTER_ALIGNMENT);
//        quitButton.addActionListener(new SubmitListener());
        add(Box.createVerticalGlue());

    }
}
