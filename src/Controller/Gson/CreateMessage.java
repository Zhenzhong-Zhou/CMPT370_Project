package Controller.Gson;

import com.google.gson.Gson;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;

public class CreateMessage {
    private String cmd;
    private String nsid;
    private int players;
    private String firework;
    private int timeout;
    private int timestamp;
    private boolean force;
    private String md5hash;

    private static String computeHash(String msg) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(msg.getBytes());
            return new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException e) {
            return ("MD5 ... what's MD5?");
        }
    }

    public CreateMessage(String cmd, String nsid, int player, String firework, int timeout, boolean force, String md5hash) {
        this.cmd = cmd;
        this.nsid = nsid;
        this.players = player;
        this.firework = firework;
        this.timeout = timeout;
        this.force = force;
        this.timestamp = (int) Instant.now().getEpochSecond();
        this.md5hash = md5hash;
    }

    public void hashObject(String object) {
        this.md5hash = computeHash(object);
    }
}
