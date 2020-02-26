package model;

import Controller.Test;
import com.google.gson.Gson;


public class Action implements Subject{
    private String Info;

    /*
    this Position is the Index of player which is the action before we sent to Server.
     */
    public String playaction(Game game,int Position)
    {
        Info= "The player " + (game.currentPlayer + 1) + " play the " + game.hands.get(game.currentPlayer).get(Position).cardColor +game.hands.get(game.currentPlayer).get(Position).cardRank ;
        return Info;
    }
    public String discardaction(Game game,int Position)
    {
        Info= "The player " + (game.currentPlayer +1) + " discard the " + game.hands.get(game.currentPlayer).get(Position).cardColor +game.hands.get(game.currentPlayer).get(Position).cardRank ;
        return Info;
    }
    public String informaction(Game game,int playerRecieve, int cardRank)
    {
        Info= "The player " + (game.currentPlayer +1) + " gave an Information about Rank " + cardRank +" to player " +playerRecieve;
        return Info;
    }
    public String informaction(Game game,int playerRecieve, String cardColor)
    {
        String colorName;
        if(cardColor.equals("r"))
        {
            colorName = "red";
        }else if(cardColor.equals("b"))
        {
            colorName = "blue";
        }else if (cardColor.equals("y"))
        {
            colorName = "yellow";
        }else if (cardColor.equals("w"))
        {
            colorName = "white";
        }else
        {
            colorName = "green";
        }
        Info= "The player" + (game.currentPlayer + 1) + " gave an Information about Color " + colorName +" to player " +playerRecieve;
        return Info;
    }
    @Override
    public void add_observer() {

    }

    @Override
    public void notify_all_observer() {

    }


    public static void main(String args[])
    {
        //making "fake" hand for testing
        Gson gson=new Gson();
        String strtest=        "        { \"notice\" : \"game starts\"\n" +
                "        , \"hands\"  : [ [ ]\n" +
                "                     , [ \"b1\", \"b3\", \"b5\", \"g2\" ]\n" +
                "        \t     , [ \"b1\", \"b3\", \"g1\", \"g2\" ]\n" +
                "        \t     , [ \"b2\", \"b4\", \"g1\", \"g3\" ]\n" +
                "        \t     ]\n" +
                "        }";

        Test test1 = gson.fromJson(strtest,Test.class);
        Game testGame = new Game(test1.hands, 0, false, false);
        testGame.currentPlayer = 1;

        Action testAction = new Action();

        String testString;

        //testing the information
        testString = testAction.informaction(testGame, 2, 3);
        if(testString.equals("The player 2 gave an Information about Rank 3 to player 2"))
        {
            System.out.println("String successful");
        }
        else
        {
            System.out.println("Test failed");
        }

        testGame.currentPlayer = 2;

        testString = testAction.discardaction(testGame, 2);
        if(testString.equals("The player 3 discard the g1"))
        {

            System.out.println("String successful");
        }
        else
        {
            System.out.println(testString);
            System.out.println("Test failed");
        }

        testGame.currentPlayer = 1;
        testString = testAction.playaction(testGame, 3);
        if(testString.equals("The player 2 play the g2"))
        {

            System.out.println("String successful");
        }
        else
        {
            System.out.println(testString);
            System.out.println("Test failed");
        }



    }
}



