package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoinGame extends JFrame {

    final int frameWidth = 500;
    final int frameHeight = 800;
    JPanel panel = new JPanel();
    static int counter = 0;

    public JoinGame() {

        setTitle("Hanabi");
        setLayout(null);
        setSize(frameWidth, frameHeight);
        setLocation(500, 100);
        setVisible(true);

        setLayout(new BorderLayout(100, 100));
        JLabel author = new JLabel("CMPT370-19 B2");
        author.setFont(new Font("AppleMyungjo", Font.BOLD + Font.ITALIC, 15));
        author.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add("South", author);
        getContentPane().add("East", new JLabel());
        getContentPane().add("West", new JLabel());
        getContentPane().add("Center", panel);
        panel.setLayout(new GridLayout(13,1));

        JLabel header = new JLabel("Join a Game");
        header.setFont(new Font("Helvetica", Font.BOLD, 50));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel(), new JLabel());
        panel.add(new JLabel());
        panel.add(header);

        JLabel gameID = new JLabel("GAME ID");
        gameID.setFont((new Font("Time", Font.PLAIN, 25)));
        gameID.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(gameID);

        JTextField gameIdField = new JTextField();
        gameIdField.setFont((new Font("Time", Font.PLAIN, 25)));
        gameIdField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(gameIdField);

        JLabel secretToken = new JLabel("SECRET TOKEN");
        secretToken.setFont((new Font("Time", Font.PLAIN, 25)));
        secretToken.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(secretToken);

        JTextField secretTokenField = new JTextField();
        secretTokenField.setFont((new Font("Time", Font.PLAIN, 25)));
        secretTokenField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(secretTokenField);


        JButton join = new JButton("JOIN");
        join.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        join.setHorizontalAlignment(SwingConstants.CENTER);
        class joinListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WaitingRoom().setVisible(true);
                System.out.println("Patient Operations Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        join.addActionListener(new joinListener());
        panel.add(new JLabel());
        panel.add(join);

        JButton back = new JButton("BACK");
        back.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        back.setHorizontalAlignment(SwingConstants.CENTER);
        class backListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);
                System.out.println("Patient Operations Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        back.addActionListener(new backListener());
        panel.add(new JLabel());
        panel.add(back);

        revalidate();
        repaint();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        JoinGame joinGame = new JoinGame();
        joinGame.setVisible(true);
    }
}
