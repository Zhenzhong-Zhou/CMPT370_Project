package View;

import com.sun.tools.javac.comp.Todo;

import java.awt.*;
import javax.swing.*;

public class WaitingRoomPanel extends JPanel{
    JLabel gameId;
    JLabel secretToken;
    JLabel numOfPlayersNeeded;
    JLabel timer;

    public WaitingRoomPanel(){
        //TODO : get gameId and secretToken from the model, then display
        //TODO : figure out how does timer actually work - using library or others

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        gameId = new JLabel("Game ID" +  "gameId");
        gameId.setMaximumSize(gameId.getPreferredSize());
        add(gameId);
        gameId.setAlignmentX(gameId.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());


        secretToken = new JLabel("Secret Token" + "secret Token");
        secretToken.setMaximumSize(secretToken.getPreferredSize());
        add(secretToken);
        secretToken.setAlignmentX(secretToken.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        numOfPlayersNeeded = new JLabel("Number of Players Needed" + "players needed");
        numOfPlayersNeeded.setMaximumSize(numOfPlayersNeeded.getPreferredSize());
        add(numOfPlayersNeeded);
        numOfPlayersNeeded.setAlignmentX(numOfPlayersNeeded.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        timer = new JLabel("Timer" + "Countdown timer");
        timer.setMaximumSize(timer.getPreferredSize());
        add(timer);
        timer.setAlignmentX(timer.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());


    }
    public void updatePlayersNeeded(int playersNeeded){

        // TODO: update player
    }

    public void updateTimer(int timer){

        // TODO: update timer
    }



}
