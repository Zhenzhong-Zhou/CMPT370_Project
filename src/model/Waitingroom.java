package model;


public class Waitingroom{
    private int timer;
    private int gameid;
    private String secretToken;

    public Waitingroom(int gameid, String secretToken, int timer){
        this.gameid = gameid;
        this.secretToken = secretToken;
        this.timer = timer;
    }

    public int getGameid() {
        return gameid;
    }

    public int getTimer() {
        return timer;
    }

    public String getSecretToken() {
        return secretToken;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }


}
