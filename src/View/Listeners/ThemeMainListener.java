package View.Listeners;

import View.HanabiGame;
import View.HanabiPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ThemeMainListener extends MainListener {

    ImageIcon backgroundImage;

    ThemeMainListener(ImageIcon backgroundImage) {
            this.backgroundImage = backgroundImage; };

    public void actionPerformed(ActionEvent arg0) {
        HanabiPanel view = HanabiGame.Hanabiclient;
        view.background = backgroundImage;
        view.setBoardAppearance(backgroundImage); }
}
