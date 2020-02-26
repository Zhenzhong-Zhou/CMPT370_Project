package View;

import model.Card;
import model.Game;
import View.Listeners.MainListener;
import View.*;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class CoordinateSystem {
    private static JLabel[][] lblCard = new JLabel[6][6];
    private static JLabel[] lblPlayer=new JLabel[5];
    private static JLabel boardPlayedCard,boardDiscards,infoCounter,fuseCounter,currentPlayerB,totalpoint;
    private static JLabel CurrentPlayer;
    private static JLabel info,fuse,points;
    private static JScrollPane jScrollPane;
    private static JLabel[][] lbldiscard = new JLabel[6][10];
    private static JLabel[] lblfirework=new JLabel[6];



    public static void initboard(){
        boardPlayedCard = new JLabel();
        ImageIcon img = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/FireworkBack.png" );
        Image image = img.getImage();
        Image newing = image.getScaledInstance(420,120, Image.SCALE_SMOOTH);
        boardPlayedCard= new JLabel( new ImageIcon (newing));
        boardPlayedCard.setBounds(90,60,420,120);
        HanabiGame.Hanabiclient.panel.add(boardPlayedCard,JLayeredPane.PALETTE_LAYER);


        boardDiscards = new JLabel();
        ImageIcon img1 = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/DiscardBack.png" );
        Image image1 = img1.getImage();
        Image newing1 = image1.getScaledInstance(420,500, Image.SCALE_SMOOTH);
        boardDiscards= new JLabel( new ImageIcon (newing1));
        boardDiscards.setBounds(90,200,420,500);
        HanabiGame.Hanabiclient.panel.add(boardDiscards,JLayeredPane.PALETTE_LAYER);

        infoCounter=new JLabel();
        ImageIcon img2 = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/time.png" );
        Image image2 = img2.getImage();
        Image newing2 = image2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        infoCounter= new JLabel( new ImageIcon (newing2));
        infoCounter.setBounds(550,170,50,50);
        HanabiGame.Hanabiclient.panel.add(infoCounter,JLayeredPane.MODAL_LAYER);

        fuseCounter=new JLabel();
        ImageIcon imgfuse = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/boom.png" );
        Image imgefuse = imgfuse.getImage();
        Image newfuse = imgefuse.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        fuseCounter= new JLabel( new ImageIcon (newfuse));
        fuseCounter.setBounds(550,220,50,50);
        HanabiGame.Hanabiclient.panel.add(fuseCounter,JLayeredPane.MODAL_LAYER);

        currentPlayerB=new JLabel("Current Player");
        currentPlayerB.setFont((new Font("Time",Font.BOLD,18)));
        currentPlayerB.setForeground(Color.white);
        currentPlayerB.setBounds(550,210,150,150);
        HanabiGame.Hanabiclient.panel.add(currentPlayerB,JLayeredPane.MODAL_LAYER);


        totalpoint=new JLabel("Total points:");
        totalpoint.setFont((new Font("Time",Font.BOLD,18)));
        totalpoint.setForeground(Color.white);
        totalpoint.setBounds(550,50,150,50);
        HanabiGame.Hanabiclient.panel.add(totalpoint,JLayeredPane.MODAL_LAYER);


        JTextArea logWindow = new JTextArea("Welcome Hanabi!");
        logWindow.setFont((new Font("Time", Font.BOLD, 14)));
        logWindow.setForeground(Color.black);
        jScrollPane = new JScrollPane(logWindow, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane.setBounds(550,360,210,350);
        jScrollPane.getViewport().getView().setEnabled(false);
        jScrollPane.getViewport().getView().setForeground(Color.black);
        HanabiGame.Hanabiclient.panel.add(jScrollPane,JLayeredPane.MODAL_LAYER);
    }

    public static void init(Game game){
        int playerind = -1;
        LinkedList<LinkedList<Card>> hand = game.getHands();

        for (int i =0 ; i<hand.size();i++){
            if (hand.get(i).get(0).getCardColor() == 'q')
            {
                playerind = i;
            }
        }
        if (playerind == -1)
        {
            throw new RuntimeException("Error");
        }

        for (int i =0; i< hand.size(); i++){
            for (int j= 0 ; j < hand.get(i).size();j++){
                lblCard[i][j] = new JLabel();
                ImageIcon img = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/" + hand.get(i).get(j).getCardColor() + hand.get(i).get(j).getCardRank() +".jpg" );
                Image image = img.getImage();
                Image newing = image.getScaledInstance(60,97, Image.SCALE_SMOOTH);
                lblCard[i][j] = new JLabel( new ImageIcon (newing));
                lblCard[i][j].setBounds(900+j*70,50+i*120,60,97);
                HanabiGame.Hanabiclient.panel.add(lblCard[i][j],JLayeredPane.MODAL_LAYER);
            }
        }

        for (int i =0;i < hand.get(0).size();i++){
            lblCard[playerind][i].addMouseListener(MainListener.createcardListener(hand.get(0).get(i)));
        }


        for (int i =0; i< hand.size();i++){
            lblPlayer[i] = new JLabel();
            ImageIcon img = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/player"+String.valueOf(i+1)+".png" );
            Image image = img.getImage();
            Image newing = image.getScaledInstance(120,50, Image.SCALE_SMOOTH);
            lblPlayer[i]= new JLabel( new ImageIcon (newing));
            lblPlayer[i].setBounds(780,50+i*120,120,50);
            HanabiGame.Hanabiclient.panel.add(lblPlayer[i],JLayeredPane.MODAL_LAYER);
        }

        for (int i =0; i< hand.size();i++)
        {
            if (i!= playerind)
            {
                lblPlayer[i].addMouseListener(MainListener.createPlayerListener(i));
            }
        }

        int i = game.getCurrentPlayer();
        ImageIcon img = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/player"+String.valueOf(i+1)+".png" );
        Image image = img.getImage();
        Image newing = image.getScaledInstance(150,80, Image.SCALE_SMOOTH);
        CurrentPlayer= new JLabel( new ImageIcon (newing));
        CurrentPlayer.setBounds(550,290+i,150,80);
        HanabiGame.Hanabiclient.panel.add(CurrentPlayer,JLayeredPane.MODAL_LAYER);

        int v =game.getInforTokenCountor();
        info = new JLabel(String.valueOf(v));
        info.setFont((new Font("Time",Font.BOLD,25)));
        info.setForeground(Color.white);
        info.setBounds(650,160,70,70);
        HanabiGame.Hanabiclient.panel.add(info,JLayeredPane.MODAL_LAYER);

        int m=game.getBlackFuseCounter();
        fuse=new JLabel(String.valueOf(m));
        fuse.setFont((new Font("Time",Font.BOLD,25)));
        fuse.setForeground(Color.white);
        fuse.setBounds(650,210,70,70);
        HanabiGame.Hanabiclient.panel.add(fuse,JLayeredPane.MODAL_LAYER);

        int t = game.getPoints();
        points=new JLabel(String.valueOf(t));
        points.setFont((new Font("Time",Font.BOLD,26)));
        points.setForeground(Color.white);
        points.setBounds(550,80,70,70);
        HanabiGame.Hanabiclient.panel.add(points,JLayeredPane.MODAL_LAYER);


        LinkedList<LinkedList<Card>> discard = game.getDiscardedcard();
        discardaddtopanel(lbldiscard,discard);

        LinkedList<LinkedList<Card>> firework = game.getFirework();
        fireworkaddtopanel(lblfirework,firework);
    }

    private static void discardaddtopanel(JLabel[][] tobeadd, LinkedList<LinkedList<Card>> hand){
        for (int i =0; i< hand.size(); i++){
            for (int j= 0 ; j < hand.get(i).size();j++){
                ImageIcon discardi = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/" + hand.get(i).get(j).getCardColor() + hand.get(i).get(j).getCardRank() +".jpg" );
                Image discardImage = discardi.getImage();
                Image newdiscard = discardImage.getScaledInstance(50,83, Image.SCALE_SMOOTH);
                tobeadd[i][j] = new JLabel( new ImageIcon (newdiscard));
                tobeadd[i][j].setBounds(90+j*20,200+i*83,50,83);
                HanabiGame.Hanabiclient.panel.add(tobeadd[i][j],JLayeredPane.MODAL_LAYER);
            }
        }

    }

    private static void fireworkaddtopanel(JLabel[] tobeadd, LinkedList<LinkedList<Card>> hand){
        for (int i =0; i< hand.size(); i++){
            if (hand.get(i).size() ==0){
                break;
            }
            ImageIcon fire = new ImageIcon("/Users/bobzhou/IdeaProjects/370_Hanabi/Hanabi/src/Res/res/" + hand.get(i).getLast().getCardColor() + hand.get(i).getLast().getCardRank() +".jpg" );
            Image fireim = fire.getImage();
            Image newfire = fireim.getScaledInstance(60,97, Image.SCALE_SMOOTH);
            tobeadd[i] = new JLabel( new ImageIcon (newfire));
            tobeadd[i].setBounds(90+70*i,70,60,97);
            HanabiGame.Hanabiclient.panel.add(tobeadd[i],JLayeredPane.MODAL_LAYER);
        }
    }

    public static void clearpanel(int x,int y,int z){
        for (int i =0 ; i< x ;i++){
            for (int j =0; j<y;j++){
                HanabiGame.Hanabiclient.panel.remove(lblCard[i][j]);
            }
        }
        for (int i=0;i<x;i++)
        {
        HanabiGame.Hanabiclient.panel.remove(lblPlayer[i]);
        }
        for (int i=0;i<z;i++){
            if (lblfirework[i]==null){
                break;
            }
            HanabiGame.Hanabiclient.panel.remove(lblfirework[i]);
        }

        HanabiGame.Hanabiclient.panel.remove(CurrentPlayer);
        HanabiGame.Hanabiclient.panel.remove(info);
        HanabiGame.Hanabiclient.panel.remove(fuse);
        HanabiGame.Hanabiclient.panel.remove(points);
    }

    public static void update(Game game){
        int x=game.getHands().size();
        int y = game.getHands().get(0).size();
        int z = game.getPoints();
        clearpanel(x,y,z);
        init(game);
    }
}
