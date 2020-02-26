package Controller.Gson;

public class ReceiveCreateMessage {
    String action;
    int game_id;
    String token;

    public ReceiveCreateMessage(String reply, int game_id, String token) {
        this.action = reply;
        this.game_id = game_id;
        this.token = token;
    }
}
