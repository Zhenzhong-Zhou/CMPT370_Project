package Controller.Gson;

public class RecieveSeatMessage {
    String notice;
    String[] hands;

    public RecieveSeatMessage(String notice, String[] hands) {
        this.notice = notice;
        this.hands = hands;
    }
}
