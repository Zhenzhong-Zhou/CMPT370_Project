package Controller.Gson;

public class RecieveActionNoticeMessage {
    String notice;
    String card;
    Boolean replaced;

    public RecieveActionNoticeMessage(String reply, String card, boolean replaced) {
        this.notice = reply;
        this.card = card;
        this.replaced = replaced;
    }
}
