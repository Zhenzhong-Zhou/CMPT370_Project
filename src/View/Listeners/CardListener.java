package View.Listeners;

import model.Card;
import View.HanabiGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CardListener extends MainListener{

    private Card card;
    JLabel pdcard;

    public CardListener(Card card){
        this.card = card;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        HanabiGame.Hanabiclient.setplaydisButtonDisplay(true);
        HanabiGame.Hanabiclient.play.addActionListener(new PlayActionListener(card.getCardIndex()));
        HanabiGame.Hanabiclient.discard.addActionListener(new DiscardListener(card.getCardIndex()));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        pdcard=new JLabel("Play / Discard card number: "+ String.valueOf(card.getCardIndex()+1));
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
