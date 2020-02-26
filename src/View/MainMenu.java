package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame {

    final int frameWidth = 500;
    final int frameHeight = 700;
    JPanel panel = new JPanel();
    static int counter = 0;

    public MainMenu() {

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
        panel.setLayout(new GridLayout(9,1));

//        JLabel background;
//        ImageIcon imageIcon = new ImageIcon(
//                "/Users/bobzhou/IdeaProjects/CMPT370/Hanabi/src/View/hanabi/card/Hanabi.jpg");
//        background = new JLabel("", imageIcon, JLabel.CENTER);
//        background.setBounds(0,0,500,300);
//        getContentPane().add(background);






        JLabel header = new JLabel("Main Menu");
        header.setFont(new Font("Helvetica", Font.BOLD, 50));
        header.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(new JLabel());
        panel.add(header);

        JButton create = new JButton("CREAT");
        create.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        create.setHorizontalAlignment(SwingConstants.CENTER);
        class creatListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CreateGame().setVisible(true);
                System.out.println("CREATE Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        create.addActionListener(new creatListener());
        panel.add(new JLabel());
        panel.add(create);

        JButton join = new JButton("JOIN");
        join.setFont(new Font("Copperplate Gothic Light", Font.ITALIC, 18));
        join.setHorizontalAlignment(SwingConstants.CENTER);
        class joinListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JoinGame().setVisible(true);
                System.out.println("JOIN Clicked! " + counter);
                counter++;
                dispose();
            }
        }
        join.addActionListener(new joinListener());
        panel.add(new JLabel());
        panel.add(join);


        JButton quit = new JButton("QUIT");
        quit.setFont(new Font("QUIT Light", Font.ITALIC, 18));
        quit.setHorizontalAlignment(SwingConstants.CENTER);
        class quitListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Patient Operations Clicked! " + counter);
                counter++;
                setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                dispose();
            }
        }
        quit.addActionListener(new quitListener());
        panel.add(new JLabel());
        panel.add(quit);

        revalidate();
        repaint();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
    }
}
