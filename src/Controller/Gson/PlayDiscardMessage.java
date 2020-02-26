package Controller.Gson;

public class PlayDiscardMessage {
    String action;
    int position;

    public PlayDiscardMessage(String action, int position) {
        this.action = action;
        this.position = position;
    }
}
