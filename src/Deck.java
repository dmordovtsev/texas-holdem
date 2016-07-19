
import java.util.*;
import java.lang.*;

public class Deck {

    public enum SUIT {HEARTS, DIAMONDS, CLOTHES, SPADES};
    public enum VALUE {TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
    public Stack <Card> shuffledDeck;
    public static ArrayList<Card> sorted = create();

    public Deck()
    {
        shuffledDeck=new Stack<Card>();
    }

    public Card getNext(){
        if(shuffledDeck.size()!=0){
            return shuffledDeck.pop();
        }
        else{
            return null;
        }
    }


    public void shuffle(){
        ArrayList<Card> sortedDeck = new ArrayList<Card>();
        sortedDeck.addAll(sorted);
        /*for (int i = 0; i < 52; i++) {
            sortedDeck.add(sorted.get(i));
        }
*/
        int r;
        Random random = new Random();

        for(int k=51;k>=0;k--){
            r= random.nextInt(k+1);
            shuffledDeck.push(sortedDeck.get(r));
            sortedDeck.remove(r);
        }

    }
    public static  ArrayList<Card> create () {
        ArrayList<Card> created=new ArrayList();
        for(int i=VALUE.TWO.ordinal();i<=VALUE.ACE.ordinal();i++){
            for(int j=SUIT.HEARTS.ordinal();j<=SUIT.SPADES.ordinal();j++){
                created.add(new Card(VALUE.values()[i],SUIT.values()[j]));
            }
        }

        return created;
    }
}
