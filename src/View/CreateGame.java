package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateGame extends JFrame {

    final int frameWidth = 500;
    final int frameHeight = 700;
    JPanel panel = new JPanel();
    static int counter = 0;

    public CreateGame() {

        setTitle("Hanabi");
        setLayout(null);
        setSize(frameWidth, frameHeight);
        setLocation(500, 100);
        setVisible(true);

        setLayout(new BorderLayout(50, 50));
        JLabel author = new JLabel("CMPT370-19 B2");
        author.setFont(new Font("AppleMyungjo", Font.BOLD + Font.ITALIC, 15));
        author.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add("South", author);
        getContentPane().add("East", new JLabel());
        getContentPane().add("West", new JLabel());
        getContentPane().add("Center", panel);
        panel.setLayout(new GridLayout(18,1));

        JLabel header = new JLabel("Create New Game");
        header.setFont(new Font("Helvetica", Font.BOLD, 35));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(header);

        JLabel nsid = new JLabel("NSID:");
        nsid.setFont((new Font("Time", Font.PLAIN, 25)));
        nsid.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(nsid);

        JTextField nsidField = new JTextField();
        nsidField.setFont((new Font("Time", Font.PLAIN, 25)));
        nsidField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(nsidField);

        JLabel totalPlayer = new JLabel("Total Number of Players: ");
        totalPlayer.setFont((new Font("Time", Font.PLAIN, 25)));
        totalPlayer.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(totalPlayer);

        String[] numberPlayer = {"2", "3", "4", "5"};
        JComboBox totalPlayerNum = new JComboBox(numberPlayer);
        totalPlayerNum.setFont((new Font("Time", Font.PLAIN, 25)));
        panel.add(totalPlayerNum);

        JLabel timer = new JLabel("Timer");
        timer.setFont((new Font("Time", Font.PLAIN, 25)));
        timer.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(timer);

        String[] timeOption = {"10", "20", "25", "30", "60"};
        JComboBox timerNum = new JComboBox(timeOption);
        timerNum.setFont((new Font("Time", Font.PLAIN, 25)));
        panel.add(timerNum);

        JLabel advance = new JLabel("ADVANCE MODEL");
        advance.setFont((new Font("Time", Font.PLAIN, 25)));
        advance.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(advance);

        String[] Option = {"None", "Firework", "Wild"};
        JComboBox advanceCombo = new JComboBox(Option);
        advanceCombo.setFont((new Font("Time", Font.PLAIN, 25)));
        panel.add(advanceCombo);

        JButton create = new JButton("CREAT");
        create.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        create.setHorizontalAlignment(SwingConstants.CENTER);
        class createListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new WaitingRoom().setVisible(true);
                System.out.println("CREATE Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        create.addActionListener(new createListener());
        panel.add(new JLabel());
        panel.add(create);

        JButton back = new JButton("BACK");
        back.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        back.setHorizontalAlignment(SwingConstants.CENTER);
        class backListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);
                System.out.println("BACK Clicked! " + counter);
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
        CreateGame createGame = new CreateGame();
        createGame.setVisible(true);
    }
}
