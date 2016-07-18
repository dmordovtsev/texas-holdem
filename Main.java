/**
 * Created by Obsidian-destroyer on 7/17/2016.
 */

import java.util.ArrayList;



public class Main {

    enum suit {HEARTS, DIAMONDS, CLOTHES, PICKS};
    enum value {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};


    //1(h)-hearts, 2(d)-diamonds, 3(c)-clothes, 4 (p)-picks


    public static void main(String[] args) {

        Deck deck1 = new Deck();
        deck1.shuffle();

        for(int i=0;i<=52;i++){
            Card card1=new Card();
            card1=deck1.getNext();
            if(card1!=null)
            {
                System.out.println(i+": "+card1.suit+" "+card1.value);
            }
            else {
                System.out.println("Empty");
            }
        }
    }


}



