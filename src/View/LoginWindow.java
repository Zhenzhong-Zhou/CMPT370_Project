package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {

    final int frameWidth = 300;
    final int frameHeight = 500;
    JPanel panel = new JPanel();
    static int counter = 0;

    public LoginWindow() {

        setTitle("Hanabi");
        setLayout(null);
        setSize(frameWidth, frameHeight);
        setLocation(500, 100);
        setVisible(true);

        setLayout(new BorderLayout(0, 50));
        JLabel author = new JLabel("CMPT370-19 B2");
        author.setFont(new Font("AppleMyungjo", Font.BOLD + Font.ITALIC, 15));
        author.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add("South", author);
        getContentPane().add("East", new JLabel());
        getContentPane().add("West", new JLabel());
        getContentPane().add("Center", panel);
        panel.setLayout(new GridLayout(12,1));

        JLabel header = new JLabel("Login");
        header.setFont(new Font("Helvetica", Font.BOLD, 35));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
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

        JLabel password = new JLabel("Password");
        password.setFont((new Font("Time", Font.PLAIN, 25)));
        password.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(password);

        JTextField passwordField = new JTextField();
        passwordField.setFont((new Font("Time", Font.PLAIN, 25)));
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(passwordField);

        JButton login = new JButton("Login");
        login.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        login.setHorizontalAlignment(SwingConstants.CENTER);
        class loginListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);
                System.out.println("CREATE Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        login.addActionListener(new loginListener());
        panel.add(new JLabel());
        panel.add(login);


        revalidate();
        repaint();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        LoginWindow loginWindow = new LoginWindow();
        loginWindow.setVisible(true);
    }
}
