package model;


import Controller.Test;
import com.google.gson.Gson;

import java.util.LinkedList;

public class Game {

    //Token
    protected int inforTokenCountor;
    protected int blackFuseCounter;

    //rainbow
    boolean rainbow;
    boolean wild;

    // Card count
    protected int deckCount;


    // linkedlist
    protected LinkedList <LinkedList<Card>> discardedcard;
    protected LinkedList<Action> history;

    // point
    protected int points;

    // timer
    protected int timer;

    // Current
    protected int currentPlayer;

    //hand
    protected LinkedList<LinkedList<Card>> hands;

    // firework
    protected LinkedList<LinkedList<Card>> firework;

    // ????
    protected boolean lastTurn;


    // number of player
    protected int playernumber;

    protected boolean youTurn;




    public Game(LinkedList<LinkedList<String>> hand,int timer, boolean rainbow, boolean wild)
    {
        this.inforTokenCountor = 8;
        this.blackFuseCounter= 3;
        this.playernumber=hand.size();
        this.hands=Card.stringtohand(hand);
        this.points=0;
        this.rainbow = rainbow;
        this.wild = wild;

        int handcount = hands.size() * hands.get(0).size();

        if(rainbow)
        {
            this.deckCount = 60 - handcount;
        }else {
            this.deckCount = 50 - handcount;
        }


        this.discardedcard=new LinkedList<>();
        this.history=new LinkedList<>();

        this.timer = timer;

        this.currentPlayer=0;
        this.lastTurn=false;

        firework = new LinkedList<>();

        if(rainbow && !wild)
        {
            for(int i = 0; i < 6; i++)
            {
                firework.add(new LinkedList<Card>());
                discardedcard.add(new LinkedList<>());
            }
        }else
        {
            for(int i = 0; i < 5; i++)
            {
                firework.add(new LinkedList<Card>());
                discardedcard.add(new LinkedList<>());
            }
        }

    }

    public void addHistory(Action action) {
        this.history.add(action);
    }


    public int getBlackFuseCounter() {
        return blackFuseCounter;
    }

    public int getDeckCount() {
        return deckCount;
    }

    public LinkedList<LinkedList<Card>> getDiscardedcard() {
        return discardedcard;
    }

    public LinkedList<Action> getHistory()
    {
        return history;
    }

    public int getPoints()
    {
        int points = 0;

        for(int i = 0 ; i < firework.size(); i++)
        {
            points+= firework.get(i).size();
        }

        return points;
    }

    public void setInforTokenCountor(int inforTokenCountor)
    {
        this.inforTokenCountor = inforTokenCountor;
    }

    public void setBlackFuseCounter()
    {
        this.blackFuseCounter--;
    }

    public void setDeckCount()
    {
        this.deckCount--;
    }

    public void addToDiscardedcard(Card card) {
        char colour = card.cardColor;
        boolean found = false;

        //find the firework with the same colour
        for(int i = 0; i < this.discardedcard.size(); i++)
        {
            if((discardedcard.get(i).size() != 0) && discardedcard.get(i).get(0).cardColor == colour)
            {
                discardedcard.get(i).add(card);
                found = true;
            }
        }

        //if the firework of that colour doesnt exist yet
        if(found == false)
        {
            for(int i = 0; i < this.discardedcard.size(); i++)
            {
                if(discardedcard.get(i).size() == 0)
                {
                    discardedcard.get(i).add(card);
                    return;
                }
            }
        }
    }

    public void resetTimer() {
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setHands(LinkedList<LinkedList<Card>> hands) {
        this.hands = hands;
    }

    public void changeCard(Card card, int pos)
    {
        this.hands.get(currentPlayer).remove(pos);
        this.hands.get(currentPlayer).add(pos, card);

    }

    public void addToFirework(Card card)
    {
        char colour = card.cardColor;
        boolean found = false;

        //find the firework with the same colour
        for(int i = 0; i < this.firework.size(); i++)
        {
            if((firework.get(i).size() != 0) && firework.get(i).get(0).cardColor == colour)
            {
                firework.get(i).add(card);
                found = true;
            }
        }

        //if the firework of that colour doesnt exist yet
        if(found == false)
        {
            for(int i = 0; i < this.firework.size(); i++)
            {
                if(firework.get(i).size() == 0)
                {
                    firework.get(i).add(card);
                    return;
                }
            }
        }


    }

    public void setLastTurn() {
        this.lastTurn = true;
    }

    public void setPlayernumber(int playernumber) {
        this.playernumber = playernumber;
    }

    public void setYouTurn(boolean youTurn) {
        this.youTurn = youTurn;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public LinkedList<LinkedList<Card>> getFirework() {
        return firework;
    }


    public int getInforTokenCountor() {
        return inforTokenCountor;
    }

    public boolean isYouTurn() {
        return youTurn;
    }

    public LinkedList<LinkedList<Card>> getHands() {
        return hands;
    }

    public int getTimer() {
        return timer;
    }


    /*
    public LinkedList<LinkedList<Card>> DiscardTodoulist(LinkedList<Card> discardedcard){
        LinkedList<LinkedList<Card>> result = new LinkedList<>();

        for(int i = 0; i < 6; i++)
        {
            result.add(new LinkedList<Card>());
        }

        for (int i =0; i!= discardedcard.size();i++){
            boolean found = false;
            char color = discardedcard.get(i).getCardColor();

            for(int v = 0; v < result.size(); v++)
            {
                if(result.get(v).size()!=0) {
                    if (result.get(v).size() != 0 && result.get(v).get(0).cardColor == color) {
                        result.get(v).add(discardedcard.get(i));
                        found = true;
                        break;
                    }
                    else {found = false;}
                }
            }
            //if the firework of that colour doesnt exist yet
            if(found == false)
            {
                for(int v = 0; v < result.size(); i++)
                {
                    if(result.get(v).size() == 0)
                    {
                        result.add(new LinkedList<Card>());
                        result.get(v).add(discardedcard.get(i));
                        break;
                    }
                }
            }
        }
        return result;

    }
    */


    public static void main(String args[])
    {
//        LinkedList<Integer> testList = new LinkedList<>();
//        testList.add(3);
//        testList.add(2);
//        testList.add(0, 1);
//        testList.add(3, 7);
//        System.out.println(testList);

        // test for the actions
        Gson gson=new Gson();

        String strtest=        "        { \"notice\" : \"game starts\"\n" +
                "        , \"hands\"  : [ [ ]\n" +
                "                     , [ \"b1\", \"b3\", \"b5\", \"g2\" ]\n" +
                "        \t     , [ \"y1\", \"b3\", \"g1\", \"g2\" ]\n" +
                "        \t     , [ \"b2\", \"w1\", \"g1\", \"r1\" ]\n" +
                "        \t     ]\n" +
                "        }";
        Test test1 = gson.fromJson(strtest,Test.class);

        Game game = new Game(test1.hands, 100, false, false);

        System.out.println("hand test");
        for(int i = 0; i < game.hands.size(); i++)
        {
            for(int j = 0; j < game.hands.get(i).size(); j++)
            {
                System.out.print(game.hands.get(i).get(j).cardColor + Integer.toString(game.hands.get(i).get(j).cardRank) + " ");
            }
            System.out.println();
        }

        game.addToFirework(game.hands.get(1).get(0));//b1
        game.addToFirework(game.hands.get(3).get(0));//b2
        game.addToFirework(game.hands.get(2).get(2));//g1
        game.addToFirework(game.hands.get(3).get(3));//r1
        game.addToFirework(game.hands.get(3).get(1));//w1
        game.addToFirework(game.hands.get(2).get(0));//y1



        System.out.println("firework test");
        for(int i = 0; i < game.firework.size(); i++)
        {
            for(int j = 0; j < game.firework.get(i).size(); j++)
            {
                System.out.print(game.firework.get(i).get(j).cardColor + Integer.toString(game.firework.get(i).get(j).cardRank) + " ");
            }
            System.out.println();
        }


        System.out.println("points test");
        System.out.println(game.getPoints());






    }



}
