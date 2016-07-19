import java.util.ArrayList;

/**
 * Created by fa1th on 19.07.2016.
 */
public class CardSet {
    private ArrayList<Card> cards = new ArrayList<>();
    int cardSetPower = 0;
    public void addACard(Card card){
        this.cards.add(card);
    }
    public void setCardSetPower(int cardSetPower){
        this.cardSetPower = cardSetPower;
    }
    public ArrayList<Card> getCards(){
        return cards;
    }
}
