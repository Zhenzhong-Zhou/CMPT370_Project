package View.Listeners;

import Controller.MovesController;

import java.awt.event.ActionEvent;

public class PlayActionListener extends MainListener {
    private int cardid;
    public PlayActionListener(int cardind){
        this.cardid = cardind;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MovesController.play(cardid,"play");
    }
}
