package Controller;

import Controller.Gson.*;
import com.google.gson.Gson;

public class MovesController 
{
    private String action;

    public MovesController(String action) 
    {
        this.action = action;
    }

    public static void play(int cardIndex, String action)
    {
        Gson gson = new Gson();
        PlayDiscardMessage playCard = new PlayDiscardMessage(action,cardIndex);
        String playResult = gson.toJson(playCard);
        System.out.println(playResult);
    }

    public static void discard(int cardIndex, String action)
    {
        Gson gson = new Gson();
        PlayDiscardMessage discardCard = new PlayDiscardMessage(action,cardIndex);
        String discardResult = gson.toJson(discardCard);
        System.out.println(discardResult);

    }
    
    public static void giveClueSuit(String action, int indexOfPlayer, String suit)
    {
        Gson gson = new Gson();
        GivenInfoSuit givenInfoSuit = new GivenInfoSuit(action,indexOfPlayer,suit);
        String giveClueSuit = gson.toJson(givenInfoSuit);
        System.out.println(giveClueSuit);

    }
    
    private void giveClueRank(String action,int indexOfPlayer, int rank)
    {
        Gson gson = new Gson();
        GivenInfoInt givenInfoRank = new GivenInfoInt(action,indexOfPlayer,rank);
        String giveClueRank = gson.toJson(givenInfoRank);
        System.out.println(giveClueRank);

    }

    public static void main(String[] args) 
    {
        MovesController movesControllerPlay = new MovesController(
                "play");
        MovesController movesControllerDiscard = new MovesController(
                "discard");
        MovesController movesControllerClue = new MovesController(
                "inform");

        movesControllerPlay.play(3,movesControllerPlay.action);
        movesControllerDiscard.discard(2,movesControllerDiscard.action);
        movesControllerClue.giveClueSuit(movesControllerClue.action,2,"color");
        movesControllerClue.giveClueRank(movesControllerClue.action,2,5);
        System.out.println(movesControllerPlay.action);
    }
}

