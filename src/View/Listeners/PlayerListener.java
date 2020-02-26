package View.Listeners;

import View.HanabiGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class PlayerListener extends MainListener{
    int player;
    private static boolean isSelected;
    JLabel pdcard;

    public PlayerListener(int player){
        this.player = player;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        isSelected = true;
        HanabiGame.Hanabiclient.give.setVisible(true);
        HanabiGame.Hanabiclient.give.addActionListener(new GiveInfoActionListener(player));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        pdcard=new JLabel("Give information to player: "+ String.valueOf(player+1));
        pdcard.setFont((new Font("Time",Font.BOLD,12)));
        pdcard.setForeground(Color.white);
        pdcard.setBounds(900,680,400,50);
        HanabiGame.Hanabiclient.panel.add(pdcard,JLayeredPane.MODAL_LAYER);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        HanabiGame.Hanabiclient.panel.remove(pdcard);
    }
}
