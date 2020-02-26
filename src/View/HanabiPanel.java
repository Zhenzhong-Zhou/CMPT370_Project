package View;

import model.Game;
import View.Listeners.MainListener;
import View.Listeners.PlayActionListener;

import javax.swing.*;
import java.awt.*;

public class HanabiPanel {
    public Timer timer;
    public ImageIcon background=new ImageIcon("./res/background2.png");
    public JLayeredPane panel = new JLayeredPane();
    public JFrame frame;
    public Menu menu;
    public JButton play,discard,give,AIA;
    private JLabel lblBoard;
    private Counter counter;


    public void init(){
        lblBoard  = new JLabel(background);
        lblBoard.setBounds(0,20,1366,768);

        counter = new Counter();
        counter.setBounds(900, 660, 450, 12);


        menu = new View.Menu();

        panel.add(lblBoard, JLayeredPane.DEFAULT_LAYER);

        frame = new HanabiFrame();
        frame.setLayeredPane(panel);
        frame.setJMenuBar(menu);
        frame.setVisible(true);

        play=new JButton("Play");
        play.setBounds(900,680,100,50);

        discard=new JButton("Discard");
        discard.setBounds(1010,680,100,50);

        give=new JButton("GiveHint");
        give.setBounds(1120,680,100,50);

        AIA=new JButton("AI helper");
        AIA.setBounds(1230,680,100,50);

        ImageIcon img = new ImageIcon("./res/background2.png");
        Image image = img.getImage();
        Image newing = image.getScaledInstance(1366,768, Image.SCALE_SMOOTH);
        background = new ImageIcon(newing);


    }

    public void display() {
        panel.add(play, JLayeredPane.MODAL_LAYER);
        panel.add(discard, JLayeredPane.MODAL_LAYER);
        panel.add(give,JLayeredPane.MODAL_LAYER);
        panel.add(AIA,JLayeredPane.MODAL_LAYER);
        panel.add(counter, JLayeredPane.MODAL_LAYER);
        setBoardAppearance(background);
        AIA.setVisible(true);
        play.setVisible(false);
        give.setVisible(false);
        discard.setVisible(false);
    }

    public void updateCounter(int timer1) {
        counter.setSizeOnRemainingSeconds((int) timer.listen(timer1));
        panel.repaint();
    }

    public void setBoardAppearance(ImageIcon path) {
        lblBoard.setIcon(path);
        panel.repaint();
    }

    public void addbuttonsActionListener(Game game){
        play.addActionListener(MainListener.playActionListener(game.getCurrentPlayer()));
        AIA.addActionListener(MainListener.playActionListener(game.getCurrentPlayer()));
        discard.addActionListener(MainListener.playActionListener(game.getCurrentPlayer()));
        give.addActionListener(MainListener.playActionListener(game.getCurrentPlayer()));
    }

    public void setplaydisButtonDisplay(boolean flag){
        discard.setVisible(flag);
        play.setVisible(flag);
    }








}
