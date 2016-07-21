import java.util.ArrayList;

/**
 * Created by fa1th on 19.07.2016.
 */
public class Table {
    enum power {ONE_PAIR, TWO_PAIR, SET, STRAIGH, FLUSH, FULL_HOUSE, QUADS, STRAIGHT_FLUSH, FLUSH_ROYAL}
    ArrayList<Player> players = new ArrayList<>();
    Deck deck = new Deck();
    ArrayList<Card> tableCards = new ArrayList<>();
    Table(){
        players.add(new MoneyMaker());
        players.add(new AI());
        deck.shuffle();
    }
    void dealTheCard(){
        for (int i = 0; i < 5; i++) {
            tableCards.add(deck.getNext());
        }
        //System.out.println("deck size: " + deck.shuffledDeck.size());
        for (int i = 0; i < players.size(); i++) {
            //System.out.println("Player size: " + players.size());
            //System.out.println(players.get(i).name);
            for (int j = 0; j < 2; j++) {
                Card card = deck.getNext();
                //System.out.println(card.SUIT + "" + card.VALUE);
                players.get(i).cardSet.addACard(card);
            }
        }
    }
    void getAResult(){
        for (int i = 0; i < players.size(); i++) {
            CardSet tempCardSet = players.get(i).cardSet;
            for (int j = 0; j < tempCardSet.getCards().size(); j++) {
                System.out.print(tempCardSet.getCards().get(j).VALUE);
                System.out.println(tempCardSet.getCards().get(j).SUIT);
            }
        }
        for (int i = 0; i < tableCards.size(); i++) {
            System.out.print(tableCards.get(i).VALUE);
            System.out.println(tableCards.get(i).SUIT);
        }
    }

    public static void main(String[] args) {
        Table table = new Table();
        table.dealTheCard();
        table.getAResult();
    }
}
