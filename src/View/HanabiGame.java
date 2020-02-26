package View;

import Controller.Test;
import com.google.gson.Gson;
import model.Game;

public class HanabiGame {
    public static HanabiPanel Hanabiclient = new HanabiPanel();



    public static void main(String [] arg){
        Hanabiclient.init();
        Hanabiclient.display();
        Gson gson=new Gson();
        String strtest=        "        { \"notice\" : \"game starts\"\n" +
                "        , \"hands\"  : [ [ ]\n" +
                "                     , [ \"b1\", \"b3\", \"b5\", \"g2\" ]\n" +
                "        \t     , [ \"y1\", \"b3\", \"g1\", \"g2\" ]\n" +
                "        \t     , [ \"r1\", \"w1\", \"g1\", \"m1\" ]\n" +
                "        \t     , [ \"b2\", \"w1\", \"g1\", \"r1\",\"m1\" ]\n" +
                "        \t     ]\n" +
                "        }";
        Test test1 = gson.fromJson(strtest,Test.class);
        Game game = new Game(test1.hands, 30, true, false);

        for (int i =0;i< game.getHands().get(1).size();i++){
            game.addToDiscardedcard(game.getHands().get(1).get(i));
            game.addToDiscardedcard(game.getHands().get(1).get(i));
            game.addToDiscardedcard(game.getHands().get(2).get(i));
            game.addToDiscardedcard(game.getHands().get(3).get(i));
            game.addToDiscardedcard(game.getHands().get(4).get(i));
        }

        CoordinateSystem.initboard();
        CoordinateSystem.init(game);
        //Hanabiclient.timer = new Timer();

        game.setCurrentPlayer(3);
        CoordinateSystem.update(game);

        game.addToFirework(game.getHands().get(1).get(2));
        game.addToFirework(game.getHands().get(1).get(3));
        game.addToFirework(game.getHands().get(2).get(0));
        CoordinateSystem.update(game);
        while (true) {
            Hanabiclient.updateCounter(game.getTimer());
        }

    }
}
