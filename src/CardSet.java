import java.util.ArrayList;

/**
 * Created by fa1th on 19.07.2016.
 */
public class CardSet {
    public ArrayList<Card> cards;
    int power;
    Enum hightCardOfCombination;
    Enum lowCardOfCombination;
    CardSet(){
        power = - 1;
        cards = new ArrayList<>();
        hightCardOfCombination = Deck.VALUE.TWO;
        lowCardOfCombination = Deck.VALUE.TWO;
    }
    
    public void addACard(Card card){
        this.cards.add(card);
    }
}
