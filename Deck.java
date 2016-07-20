/**
 * Created by Obsidian-destroyer on 7/18/2016.
 */


import java.util.*;
import java.lang.*;

public class Deck {

    Stack <Card> shuffledDeck;
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
        ArrayList<Card> sortedDeck=new ArrayList();


        for(int i=Card.Value.TWO.ordinal();i<=Card.Value.ACE.ordinal();i++){
            for(int j=Card.Suit.HEARTS.ordinal();j<=Card.Suit.SPADES.ordinal();j++){
                sortedDeck.add(new Card(Card.Value.values()[i],Card.Suit.values()[j]));
            }
        }

        int r;
        Random random = new Random();

        for(int k=51;k>=0;k--){
            r= random.nextInt(k+1);
            shuffledDeck.push(sortedDeck.get(r));
            sortedDeck.remove(r);
        }
        //shuffledDeck is what we need
    }
}


