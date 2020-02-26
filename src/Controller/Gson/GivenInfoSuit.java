package Controller.Gson;

public class GivenInfoSuit {
    private String action;
    private int player;
    private String suit;

    public GivenInfoSuit(String action, int playerIndex, String suit) {
        this.action = action;
        this.player = playerIndex;
        this.suit = suit;
    }
}

