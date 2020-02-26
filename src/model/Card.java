package model;

import java.util.LinkedList;

public class Card{
    protected int cardIndex;
    protected char cardColor;
    protected int cardRank;
    public boolean colorKnown;
    public boolean rankKnown;

    public Card(int cardIndex, char cardColor, int cardRank) {
        this.cardIndex = cardIndex;
        this.cardColor = cardColor;
        this.cardRank = cardRank;
        this.colorKnown = false;
        this.rankKnown = false;

    }

    public int getCardIndex() {
        return cardIndex;
    }

    public char getCardColor() {
        return cardColor;
    }

    public int getCardRank() {
        return cardRank;
    }

    public static Card stringtocard(String string, int index) {
        char Color = string.charAt(0);
        int rank = Character.getNumericValue(string.charAt(1));
        return new Card(index,Color,rank);
    }

    public static LinkedList<LinkedList<Card>> stringtohand(LinkedList<LinkedList<String>> string){
        LinkedList<LinkedList<Card>> result= new LinkedList<>() ;

        for(int i = 0; i < string.size(); i++)
        {
            result.add(new LinkedList<Card>());
        }


        for (int i=0 ; i < string.size();i++ )
        {
            if (string.get(i).size() == 0)
            {
                if (i == 0){
                    for (int j = 0; j < string.get(1).size(); j++)
                    {
                        result.get(i).add(j,stringtocard("q0",j));
                    }
                }
                else {
                    for (int j = 0; j < string.get(0).size(); i++)
                    {
                        result.get(i).add(j,stringtocard("q0",j));
                    }

                }
            }

            for (int v=0; v < string.get(i).size();v++)
            {
                result.get(i).add(v,stringtocard(string.get(i).get(v), v));
            }
        }
        return result;
    }

    public void hinttohand(int hint,LinkedList<String> listhint){

    }

    public void hinttohand(char hint){


    }



    public void setColorKnown() {
        this.colorKnown = true;
    }

    public void setRankKnown() {
        this.rankKnown = true;
    }




    public void setCardColor(char cardColor) {
        this.cardColor = cardColor;
    }

    public void setCardRank(int cardRank) {
        this.cardRank = cardRank;
    }

    public static void main(String args[]){
        String card1 = "r1";
        Card card2=new Card(1,'b',1);
        System.out.println(card2.cardColor + Integer.toString(card2.cardRank));
        card2 = card2.stringtocard(card1, 0);
        System.out.println(card2.cardColor + Integer.toString(card2.cardRank));

    }

}
