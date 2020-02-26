package View.Listeners;

import Controller.MovesController;

import java.awt.event.ActionEvent;

public class GiveInfoActionListener extends MainListener{

    private int playerid;
    public GiveInfoActionListener(int player){
        this.playerid = player;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MovesController.play(playerid,"give");
    }
}
