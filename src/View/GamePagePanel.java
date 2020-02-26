package View;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import javax.swing.*;

public class GamePagePanel extends JPanel{

    JLabel infoToken;
    JLabel fuseToken;
    JLabel timer;
    JLabel score;
    JLabel discardPile;
    JLabel deck;
    JLabel fireworks;
    JLabel hands;
    JLabel historyLog;

    JButton playCardButton;
    JButton discardCardButton;
    JButton giveInfoButton;
    JButton aiAssistButton;

    public GamePagePanel(){
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        add(Box.createVerticalGlue());

        infoToken = new JLabel("Info Token");
        infoToken.setMaximumSize(infoToken.getPreferredSize());
        add(infoToken);
        infoToken.setAlignmentX(infoToken.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        fuseToken = new JLabel("Fuse Token");
        fuseToken.setMaximumSize(fuseToken.getPreferredSize());
        add(fuseToken);
        fuseToken.setAlignmentX(fuseToken.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        timer = new JLabel("Timer");
        timer.setMaximumSize(timer.getPreferredSize());
        add(timer);
        timer.setAlignmentX(timer.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        score = new JLabel("Game ID" +  "gameId");
        score.setMaximumSize(score.getPreferredSize());
        add(score);
        score.setAlignmentX(score.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        discardPile = new JLabel("Discard Pile");
        discardPile.setMaximumSize(discardPile.getPreferredSize());
        add(discardPile);
        discardPile.setAlignmentX(discardPile.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        deck = new JLabel("Deck");
        deck.setMaximumSize(deck.getPreferredSize());
        add(deck);
        deck.setAlignmentX(deck.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        fireworks = new JLabel("Firework");
        fireworks.setMaximumSize(fireworks.getPreferredSize());
        add(fireworks);
        fireworks.setAlignmentX(fireworks.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        hands = new JLabel("Hands");
        hands.setMaximumSize(hands.getPreferredSize());
        add(hands);
        hands.setAlignmentX(hands.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        historyLog = new JLabel("History Log");
        historyLog.setMaximumSize(historyLog.getPreferredSize());
        add(historyLog);
        historyLog.setAlignmentX(historyLog.CENTER_ALIGNMENT);
        add(Box.createVerticalGlue());

        playCardButton = new JButton("Play Card");
        playCardButton.setMaximumSize(playCardButton.getPreferredSize());
        add(playCardButton);
        playCardButton.setAlignmentX(playCardButton.CENTER_ALIGNMENT);
        //       joinButton.addActionListener(new ActionListener() {}
        add(Box.createVerticalGlue());

        discardCardButton = new JButton("Discard Card");
        discardCardButton.setMaximumSize(discardCardButton.getPreferredSize());
        add(discardCardButton);
        discardCardButton.setAlignmentX(discardCardButton.CENTER_ALIGNMENT);
        //       discardCardButton.addActionListener(new ActionListener() {}
        add(Box.createVerticalGlue());

        giveInfoButton = new JButton("Give info");
        giveInfoButton.setMaximumSize(giveInfoButton.getPreferredSize());
        add(giveInfoButton);
        giveInfoButton.setAlignmentX(giveInfoButton.CENTER_ALIGNMENT);
        //       giveInfo.addActionListener(new ActionListener() {}
        add(Box.createVerticalGlue());

        aiAssistButton = new JButton("Ask AI for assisting");
        aiAssistButton.setMaximumSize(aiAssistButton.getPreferredSize());
        add(aiAssistButton);
        aiAssistButton.setAlignmentX(aiAssistButton.CENTER_ALIGNMENT);
        //       joinButton.addActionListener(new ActionListener() {}
        add(Box.createVerticalGlue());
    }
    public void displayInitialGame(){

        //TODO:
    }

    public void updateHands(){

        //TODO: add parameter LinkedList <LinkedList <Cards>> hands
    }
    public void updateFireworksAndScore(Dictionary<String, Integer> firework){

        //TODO:
    }
    public void updateHistoryLog(){

        //TODO: add parameter as LinkedList<Actions> history
    }
    public void updateInfoToken(int infoTokenCounter){

        //TODO:
    }
    public void updateFuseToken(int fuseTokenCounter){

        //TODO:
    }
    public void updateDeckCount(){

        //TODO:
    }
    public void updateDiscardPile(){

        //TODO: add parameter as LinkedList<Cards> card
    }
    public void updateTimer(){

        //TODO: add parameter as timer (if hardcode then reset the timer)
    }

    public static void main(String[] args) {
//        GamePagePanel gamePagePanel = new GamePagePanel();
//        gamePagePanel.setVisible(true);
        GamePageFrame gamePageFrame = new GamePageFrame();
        gamePageFrame.setVisible(true);
    }
}
