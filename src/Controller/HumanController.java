package Controller;
import Controller.Gson.CreateMessage;
import Controller.Gson.JoinMessage;
import com.google.gson.Gson;

import Controller.MovesController;
public class HumanController extends MovesController
{
    String action;

    public HumanController(String action) 
    {
        super(action);
        this.action = action;

    }

    public void create (String action, String nsid, int players, String rainbow, int timeout, boolean force,String md5hash)
    {
        Gson gson = new Gson();
        CreateMessage create = new CreateMessage(action,nsid,players,rainbow,timeout,force,md5hash);
        String createResult = gson.toJson(create);
        System.out.println(createResult);
    }

    public void join (String action, String nsid, int gameID, String secretToken,String md5hash)
    {
        Gson gson = new Gson();
        JoinMessage join = new JoinMessage(action,nsid,gameID,secretToken,md5hash);
        String joinResult = gson.toJson(join);
        System.out.println(joinResult);
    }

    public static void main(String[] args) 
    {
        HumanController humanControllerCreate = new HumanController(
                "create"
        );
        HumanController humanControllerJoin = new HumanController(
                "join"
        );
        humanControllerCreate.create(humanControllerCreate.action,"bos226",4,"none",60,false,"110306115527ced8101669fc1da1c0c2");
        //humanControllerJoin.join(humanControllerJoin.action,"bos226",123456,"secretToken");
    }
}

