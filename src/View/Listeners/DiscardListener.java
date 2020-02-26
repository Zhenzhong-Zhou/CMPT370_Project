package View.Listeners;

import Controller.MovesController;

import java.awt.event.ActionEvent;

public class DiscardListener extends MainListener{
    private int cardid;
    public DiscardListener(int cardind){
        this.cardid = cardind;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MovesController.play(cardid,"discard");
    }


}
