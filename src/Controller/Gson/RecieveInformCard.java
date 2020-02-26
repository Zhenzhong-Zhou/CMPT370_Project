package Controller.Gson;

public class RecieveInformCard {
    String  notice;
    int rank;
    Boolean[] cards;

    public RecieveInformCard(String notice, int rank, boolean[] cards) {
        this.notice = notice;
        this.rank = rank;
//        this.cards = new boolean[];
    }
}
