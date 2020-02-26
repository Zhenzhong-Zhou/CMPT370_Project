package Controller.Gson;

public class ReceiveJoinMesssage {

    String action;
    int needed;
    int timeout;

    public ReceiveJoinMesssage(String reply, int needed, int timeout) {
        this.action = reply;
        this.needed = needed;
        this.timeout = timeout;
    }
}
