package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaitingRoom extends JFrame {

    final int frameWidth = 400;
    final int frameHeight = 800;
    JPanel panel = new JPanel();
    static int counter = 0;

    public WaitingRoom() {

        setTitle("Hanabi");
        setLayout(null);
        setSize(frameWidth, frameHeight);
        setLocation(500, 100);
        setVisible(true);

        setLayout(new BorderLayout(10, 70));
        JLabel author = new JLabel("CMPT370-19 B2");
        author.setFont(new Font("AppleMyungjo", Font.BOLD + Font.ITALIC, 15));
        author.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add("South", author);
        getContentPane().add("East", new JLabel());
        getContentPane().add("West", new JLabel());
        getContentPane().add("Center", panel);
        panel.setLayout(new GridLayout(21,1));

        JLabel header = new JLabel("Waiting Room");
        header.setFont(new Font("Helvetica", Font.BOLD, 35));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel(), new JLabel());
        panel.add(new JLabel());
        panel.add(header);

        JLabel gameID = new JLabel("GAME ID");
        gameID.setFont((new Font("Time", Font.PLAIN, 25)));
        gameID.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(gameID);

        JLabel gameIdLabel = new JLabel("123456789");
        gameIdLabel.setFont((new Font("Time", Font.PLAIN, 25)));
        gameIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(gameIdLabel);

        JLabel secretToken = new JLabel("SECRET TOKEN");
        secretToken.setFont((new Font("Time", Font.PLAIN, 25)));
        secretToken.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(secretToken);

        JLabel secretTokenLabel = new JLabel("secretToken123");
        secretTokenLabel.setFont((new Font("Time", Font.PLAIN, 25)));
        secretTokenLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(secretTokenLabel);

        JLabel playerLeft = new JLabel("Players Left");
        playerLeft.setFont((new Font("Time", Font.PLAIN, 25)));
        playerLeft.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(playerLeft);

        JLabel playerLeftNum = new JLabel("2");
        playerLeftNum.setFont((new Font("Time", Font.PLAIN, 25)));
        playerLeftNum.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(playerLeftNum);

        JLabel timer = new JLabel("Timer");
        timer.setFont((new Font("Time", Font.PLAIN, 25)));
        timer.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(timer);

        JLabel timerNum = new JLabel("2 minutes");
        timerNum.setFont((new Font("Time", Font.PLAIN, 25)));
        timerNum.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(timerNum);

        JButton cancel = new JButton("CANCEL");
        cancel.setFont(new Font("QUIT Light", Font.ITALIC, 18));
        cancel.setHorizontalAlignment(SwingConstants.CENTER);
        class cancelListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);
                System.out.println("CANCEL Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        cancel.addActionListener(new cancelListener());
        panel.add(new JLabel());
        panel.add(cancel);

        revalidate();
        repaint();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        WaitingRoom waitingRoom = new WaitingRoom();
        waitingRoom.setVisible(true);
    }
}
