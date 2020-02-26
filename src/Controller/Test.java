package Controller;

import com.google.gson.Gson;
import java.util.LinkedList;


public class Test {
    private String notice;
    public LinkedList<LinkedList <String>> hands;

    public Test(String notice, LinkedList<LinkedList <String>> hands){
        this.notice=notice;
        this.hands=hands;
    }


    public static void main(String args[]) {
         // test for the actions
        Gson gson=new Gson();

        String strtest=        "        { \"notice\" : \"game starts\"\n" +
                "        , \"hands\"  : [ [ ]\n" +
                "                     , [ \"b1\", \"b3\", \"b5\", \"g2\" ]\n" +
                "        \t     , [ \"b1\", \"b3\", \"g1\", \"g2\" ]\n" +
                "        \t     , [ \"b2\", \"b4\", \"g1\", \"g3\" ]\n" +
                "        \t     ]\n" +
                "        }";

        Test test1 = gson.fromJson(strtest,Test.class);
        System.out.println(test1.hands);
        System.out.println(test1.hands.get(1).get(1));
        System.out.println(test1.notice);


    }
}
